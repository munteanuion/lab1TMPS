package com.tmps.AbstractFactory.LandingProject;

import com.tmps.AbstractFactory.ProjectManager;

public class PMLandingPage implements ProjectManager {
    @Override
    public void ManageProject() {
        System.out.println("Project Manager manage project Landing Page.");
    }
}
