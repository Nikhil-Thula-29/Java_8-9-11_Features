package com.nt.collectionenhancements;

public class Student {

    private int id;
    private String name;
    private String dept;

    public Student(int id,
                    String name,
                    String dept) {

        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {

        return id + " " + name +
               " " + dept;
    }
}
