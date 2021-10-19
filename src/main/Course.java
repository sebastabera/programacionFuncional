package main;

public class Course {

    private String name;
    private Integer finalQualification;

    public Course(String name, Integer finalQualification) {
        this.name = name;
        this.finalQualification = finalQualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFinalQualification() {
        return finalQualification;
    }

    public void setFinalQualification(Integer finalQualification) {
        this.finalQualification = finalQualification;
    }
}
