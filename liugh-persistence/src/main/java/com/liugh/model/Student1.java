package com.liugh.model;


import com.github.crab2died.annotation.ExcelField;

public class Student1 {

    // 学号
    @ExcelField(title = "学号", order = 1)
    private String id;

    // 姓名
    @ExcelField(title = "姓名", order = 2)
    private String name;

    // 班级
    @ExcelField(title = "班级", order = 3)
    private String classes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student1() {

    }

    public Student1(String id, String name, String classes) {
        this.id = id;
        this.name = name;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
