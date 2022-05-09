package org.apache.反射;

public class Student {

    public  String grade;
    protected  int age;
    String name;
    private  int stuId;

    private Student() {
    }

    private Student(int stuId, String name, String grade, int age) {
        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
    private String show(){
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                '}';
    }

    private int getStuId() {
        return stuId;
    }

    private void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                '}';
    }
}
