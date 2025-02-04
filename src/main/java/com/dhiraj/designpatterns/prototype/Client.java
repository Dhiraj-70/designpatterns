package com.dhiraj.designpatterns.prototype;

public class Client {
    static void populateStdRegistry(StudentRegistery registry) {
        Student fourthFeb2025 = new Student();
        fourthFeb2025.setBatchName("Feb 2025");
        fourthFeb2025.setAvgBatchPsp(95.0);
        registry.register("Feb 2025", fourthFeb2025);

        IntellegentStudent fifthFeb2025 = new IntellegentStudent();
        fifthFeb2025.setBatchName("Fifth 2025");
        fifthFeb2025.setAvgBatchPsp(99.0);
        registry.register("Fifth 2025", fifthFeb2025);
    }

    public static void main(String[] args) {
        StudentRegistery stdRegistry = new StudentRegistery();
        populateStdRegistry(stdRegistry);

        Student newStudent = stdRegistry.get("Feb 2025").clone();
        newStudent.setName("Amit");
        newStudent.setAge(18);
        newStudent.setPsp(93.9);
        newStudent.setGender("Male");
        System.out.println(newStudent.toString());

        Student intellegentStudent = stdRegistry.get("Fifth 2025").clone();
        intellegentStudent.setName("Amit");
        intellegentStudent.setAge(33);
        intellegentStudent.setGender("Male");
        intellegentStudent.setPsp(99.9);
        System.out.println(intellegentStudent.toString());
    }
}
