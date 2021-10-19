package main;

import java.util.List;

public class Student {

    private List<Integer> finalQualifications;
    private String name;
    private Integer age;
    private Gender gender;

    public Student(List<Integer> finalQualifications, String name, Integer age, Gender gender) {
        this.finalQualifications = finalQualifications;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public List<Integer> getFinalQualifications() {
        return finalQualifications;
    }

    public void setFinalQualifications(List<Integer> finalQualifications) {
        this.finalQualifications = finalQualifications;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
