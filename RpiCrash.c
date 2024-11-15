#include <linux/module.h>
#include <linux/kernel.h>
#include <linux/init.h>
#include <linux/fs.h>
#include <linux/cdev.h>
#include <linux/uaccess.h>

#define DEVICE_NAME "crash_device"
#define MAJOR_NUM 240  // Major number for the device

static struct cdev *crash_cdev;
static dev_t dev_num;

// Simple device read function which will cause a crash by dereferencing a null pointer
static ssize_t crash_device_read(struct file *file, char __user *buf, size_t count, loff_t *offset) {
    int *null_pointer = NULL;
    printk(KERN_INFO "Reading from crash device...\n");
    
    // Dereferencing a NULL pointer will crash the system
    printk(KERN_INFO "Dereferencing null pointer...\n");
    *null_pointer = 0; // This will cause a crash

    return 0;
}

// File operations structure
static struct file_operations fops = {
    .read = crash_device_read,
};

// Module initialization function
static int __init crash_driver_init(void) {
    printk(KERN_INFO "Initializing crash driver...\n");

    // Allocate device number
    if (alloc_chrdev_region(&dev_num, 0, 1, DEVICE_NAME) < 0) {
        printk(KERN_ALERT "Failed to allocate a major number for the device\n");
        return -1;
    }
    major = MAJOR(dev_num);

    // Initialize the character device structure
    crash_cdev = cdev_alloc();
    if (!crash_cdev) {
        unregister_chrdev_region(dev_num, 1);
        printk(KERN_ALERT "Failed to allocate cdev structure\n");
        return -1;
    }

    crash_cdev->ops = &fops;
    crash_cdev->dev = dev_num;

    // Add the character device to the system
    if (cdev_add(crash_cdev, dev_num, 1) < 0) {
        unregister_chrdev_region(dev_num, 1);
        printk(KERN_ALERT "Failed to add cdev to system\n");
        return -1;
    }

    printk(KERN_INFO "Crash driver initialized and device registered with major %d\n", major);
    return 0;
}

// Module exit function
static void __exit crash_driver_exit(void) {
    printk(KERN_INFO "Exiting crash driver...\n");

    // Cleanup and unregister the device
    cdev_del(crash_cdev);
    unregister_chrdev_region(dev_num, 1);

    printk(KERN_INFO "Crash driver exited and device unregistered\n");
}

module_init(crash_driver_init);
module_exit(crash_driver_exit);

MODULE_LICENSE("GPL");
MODULE_AUTHOR("Akashdeep");
MODULE_DESCRIPTION("A simple driver to crash Raspberry Pi 4");
