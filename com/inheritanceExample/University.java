package com.inheritanceExample;
public class University {
    String universityName;
    String universityAddress;

    public University(String universityName, String universityAddress) {
        this.universityName = universityName;
        this.universityAddress = universityAddress;
    }

    public void getUniversityDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("University Address: " + universityAddress);
    }

    public static void main(String[] args) {
        Student student = new Student("New University", "123 Nowhere St, Unique City, 12345", 
                                      "Java College", 1016, "Java1016", 
                                      "Mr Unique", 123, "321 Strange Road");
        student.getStudentDetails(); 
    }
}

class College extends University {
    String collegeName;
    int departmentId;
    String departmentName;

    public College(String universityName, String universityAddress, String collegeName, int departmentId, String departmentName) {
        super(universityName, universityAddress);
        this.collegeName = collegeName;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public void getCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
        getUniversityDetails(); 
    }
}

class Student extends College {
    String name;
    int rollNumber;
    String address;

    public Student(String universityName, String universityAddress, String collegeName, int departmentId, String departmentName, String name, int rollNumber, String address) {
        super(universityName, universityAddress, collegeName, departmentId, departmentName); 
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    public void getStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Address: " + address);
        getCollegeDetails(); 
    }
}
