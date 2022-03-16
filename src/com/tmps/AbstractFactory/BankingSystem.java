package com.tmps.AbstractFactory;

import com.tmps.AbstractFactory.Banking.BankingTeamFactory;

public class BankingSystem {
    public static void main(String[] args){
        TeamProject teamProject = new BankingTeamFactory();
        Developer developer = teamProject.getDeveloper();
        Tester tester = teamProject.getTester();
        ProjectManager projectManager = teamProject.getProjectManager();

        System.out.println("Creating bank system");
        developer.WriteCode();
        tester.TestCode();
        projectManager.ManageProject();
    }
}
