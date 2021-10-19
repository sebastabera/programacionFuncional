package main;

import java.util.List;

public class Person {

    private String name;
    private Integer age;
    private Gender gender;
    private List<String> trips;

    public Person(String name, Integer age, Gender gender, List<String> trips) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.trips = trips;
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

    public List<String> getTrips() {
        return trips;
    }

    public void setTrips(List<String> trips) {
        this.trips = trips;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
