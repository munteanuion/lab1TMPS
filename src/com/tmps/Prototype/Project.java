package com.tmps.Prototype;

public class Project implements Copyable{
    private int id;
    private String projectName;
    private String sourceCode;

    public Project(int id, String projectName, String sourceCode) {
        this.id = id;
        this.projectName = projectName;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSource() {
        return sourceCode;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setSource(String source) {
        this.sourceCode = source;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
