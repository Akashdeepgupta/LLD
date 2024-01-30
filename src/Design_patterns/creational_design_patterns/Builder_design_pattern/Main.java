package Design_patterns.creational_design_patterns.Builder_design_pattern;

public class Main {
    public static void main(String[] args) {
        Student s = Student.builder()
                .id(1)
                .name("Akash")
                .universityName("dmce")
                .gradYear(202)
                .psp(90)
                .age(23)
                .phoneNumber("7045745159")
                .build();
        System.out.println(s);
    }
}












//try {
//            Student s = Student.builder()
//                    .id(1)
//                    .name("Akash")
//                    .universityName("dmce")
//                    .gradYear(2024)
//                    .psp(90)
//                    .age(23)
//                    .phoneNumber("7045745159")
//                    .build();
//        } catch (GradYearInvalidException e) {
//            // Handle the exception (print an error message, log it, etc.)
//            System.out.println("Exception: " + e.getMessage());
//        }
//        System.out.println("hey buddy still on");