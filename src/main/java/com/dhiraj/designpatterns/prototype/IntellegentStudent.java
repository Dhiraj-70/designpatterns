package com.dhiraj.designpatterns.prototype;

public class IntellegentStudent extends Student {
    private int iq;

    public IntellegentStudent() {}
    public IntellegentStudent(IntellegentStudent is) {
        super(is);
        this.iq = is.iq;
    }

    public IntellegentStudent clone(){
//        IntellegentStudent copy = new IntellegentStudent();
//        copy.setName(this.getName());
//        copy.setAge(this.getAge());
//        copy.setPsp(this.getPsp());
//        copy.setBatchName(this.getBatchName());
//        copy.setAvgBatchPsp(this.getAvgBatchPsp());
//        copy.iq = this.iq;
//        return copy;

        return new IntellegentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "IntellegentStudent{" +
                "iq=" + iq +
                '}';
    }
}
