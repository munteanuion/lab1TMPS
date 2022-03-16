package com.tmps.Prototype;

public class VesionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"WebSite","SourceCode sourceCode = new SourceCode();\n");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("\n=============================\n");
        System.out.println(masterClone);
    }
}
