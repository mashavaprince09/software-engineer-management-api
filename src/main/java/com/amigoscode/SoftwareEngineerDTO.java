package com.amigoscode;

public class SoftwareEngineerDTO {
    private String name;
    private String techStack;

    public String getName() {
        return name;
    }

    public String getTechStack() {
        return techStack;
    }

    public SoftwareEngineerDTO(SoftwareEngineer softwareEngineer) {
        this.name = softwareEngineer.getName();
        this.techStack = softwareEngineer.getTechStack();
    }
}
