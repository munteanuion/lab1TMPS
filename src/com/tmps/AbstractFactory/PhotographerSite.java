package com.tmps.AbstractFactory;

import com.tmps.AbstractFactory.LandingProject.LandingTeamFactory;

public class PhotographerSite {
    public static void main(String[] args){
        TeamProject teamProject = new LandingTeamFactory();
        Developer developer = teamProject.getDeveloper();
        Tester tester = teamProject.getTester();
        ProjectManager projectManager = teamProject.getProjectManager();

        System.out.println("Creating Landing Page");
        developer.WriteCode();
        tester.TestCode();
        projectManager.ManageProject();
    }
}
