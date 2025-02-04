package com.dhiraj.designpatterns.prototype;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String gender;
    private double psp;
    private String batchName;
    private double AvgBatchPsp;
    private int count = 1;

    public Student(){}

    public Student(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
        this.gender = student.getGender();
        this.psp = student.getPsp();
        this.batchName = student.getBatchName();
        this.AvgBatchPsp = student.getAvgBatchPsp();
        this.count = student.count;
    }

    @Override
    public Student clone() {
//        Student student = new Student();
//        this.name = student.getName();
//        this.age = student.getAge();
//        this.gender = student.getGender();
//        this.psp = student.getPsp();
//        this.batchName = student.getBatchName();
//        this.AvgBatchPsp = student.getAvgBatchPsp();
//        this.count = 1;
//        return student;
        return new Student(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgBatchPsp() {
        return AvgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        AvgBatchPsp = avgBatchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                ", AvgBatchPsp=" + AvgBatchPsp +
                ", count=" + count +
                '}';
    }
}
