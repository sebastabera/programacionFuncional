package main;

import java.util.List;

import static main.Gender.*;

public class MainT {

    public static void main(String[] args){

        Group group1 = new Group("11 a",
                List.of(
                        new Student(List.of(3,4,5,1),"Andres", 16, MALE),
                        new Student(List.of(5,5,4,2),"Andrea", 15, FEMALE),
                        new Student(List.of(3,1,5,5),"Sonia", 16, FEMALE),
                        new Student(List.of(4,4,4,5),"Roberto", 17, MALE)
                ));

        Group group2 = new Group("11 a",
                List.of(
                        new Student(List.of(4,4,4,4),"Oscar", 18, MALE),
                        new Student(List.of(5,5,5,5),"Tatian", 15, FEMALE),
                        new Student(List.of(2,1,2,5),"Cristian", 15, MALE),
                        new Student(List.of(5,4,5,4),"Maria", 16, FEMALE)
                ));

        List<Group> groups = List.of(group1, group2);

        groups.stream()
                .map(Group::getStudents)
                .flatMap(List::stream).filter(x -> x.getFinalQualifications().stream().mapToInt(y->y).average().getAsDouble() >= 4.0)
                .map(Student::getName)
                .forEach(System.out::println);
    }



}
