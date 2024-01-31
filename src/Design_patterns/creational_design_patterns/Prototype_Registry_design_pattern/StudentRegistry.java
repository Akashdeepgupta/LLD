package Design_patterns.creational_design_patterns.Prototype_Registry_design_pattern;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> studentRegistry;
//    we can take  private HashMap<String, <T>> studentRegistry; student ki jagah generic

    public StudentRegistry() {
        this.studentRegistry = new HashMap<>();
    }

    public Student add(Student studentPrototype){
        studentRegistry.put(studentPrototype.getBatchName(), studentPrototype);
        return studentPrototype;
    }

    public Student get(String batchName){
        return studentRegistry.get(batchName);
    }
}
