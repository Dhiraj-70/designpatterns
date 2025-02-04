package com.dhiraj.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistery {
    private Map<String, Student> map = new HashMap<>();

    public void register(String batch, Student student) {
        map.put(batch, student);
    }

    public Student get(String batch) {
        return map.get(batch);
    }
}
