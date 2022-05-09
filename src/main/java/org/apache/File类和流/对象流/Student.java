package org.apache.File类和流.对象流;

import java.io.Serializable;

/*
要求传入的对象必须实现序列化接口（如serializable）
 */
public class Student implements Serializable {
    private int stuNo;
    private String name;
    private String birthday;
    private String address;
    private String  phone;

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

    public Student() {
    }

    public Student(int stuNo, String name, String birthday, String address, String phone) {
        this.stuNo = stuNo;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
