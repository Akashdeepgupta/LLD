package Design_patterns.creational_design_patterns.Prototype_Registry_design_pattern;

public class Main {
    public static void main(String[] args) {
//        {//creating a student protype for a batchA students
//            Student studentPrototype = new Student("2023", "BatchA", "LLD", "Sandeep", "12-Dec-23", "TTS", "30-Apr-2024");
//            System.out.println("student Prototype for batchA");
//            System.out.println(studentPrototype);
//
//            //copying or using this prototype for creating particular students in batchA
//            // student with name akash, mail akash@gmail.com, phone no : 70454745159
//
//            Student akash = studentPrototype.clone();
//            System.out.println("akash before : " + akash);
//            akash.setName("Akash");
//            akash.setEmail("akash@gmail.com");
//            akash.setPhoneNumber("7045745159");
//            System.out.println("akash after : " + akash);
//        }
        //Since, a single prototype will not work for all the batches, we need to have
        // multiple prototypes for each batch, hence need to maintain this in a datastructure
        Student studentPrototypeBatchA = new Student("2023", "BatchA", "HLD", "Sandeep", "12-June-23", "MWF", "30-Apr-2024");
        Student studentPrototypeBatchB = new Student("2023", "BatchB", "LLD", "naman", "12-Dec-23", "TTS", "30-June-2024");
        Student studentPrototypeBatchC = new Student("2024", "BatchC", "DSA", "mohit", "12-Jan-24", "MWF Morning", "30-Dec-2024");

        // Registry Design pattern comes into play as it contains a hashmap, that stores all the
        // prototypes of a class, which can fetched using a specific key, whenever required
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.add(studentPrototypeBatchA);
        studentRegistry.add(studentPrototypeBatchB);
        studentRegistry.add(studentPrototypeBatchC);

        //enroll -> Kunal, k@email.com, 123456 -> BatchB
        Student kunal = studentRegistry.get("BatchB").clone();
        kunal.setName("Kunal");
        kunal.setEmail("k@email.com");
        kunal.setPhoneNumber("123456");
        System.out.println(kunal);

        //enroll -> sahil, s@email.com, 654321 -> BatchC
        Student sahil = studentRegistry.get("BatchC").clone();
        sahil.setName("sahil");
        sahil.setEmail("s@email.com");
        sahil.setPhoneNumber("654321");
        System.out.println(sahil);
    }
}
