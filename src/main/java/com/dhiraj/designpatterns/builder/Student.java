package com.dhiraj.designpatterns.builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private String gradYear;
    private String phone;

    static class Builder {
        private String name;
        private int age;
        private double psp;
        private String batch;
        private String gradYear;
        private String phone;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(String gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public Student(Builder builder) {
        if(builder.getAge() <= 18 ){
            throw new IllegalArgumentException("Age must be greater than 18");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.phone = builder.getPhone();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", batch='" + batch + '\'' +
                ", gradYear='" + gradYear + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
