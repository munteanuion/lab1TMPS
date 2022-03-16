package com.tmps.AbstractFactory.Banking;

import com.tmps.AbstractFactory.ProjectManager;

public class PMBanking implements ProjectManager {
    @Override
    public void ManageProject() {
        System.out.println("Project Manager manage project Banking.");
    }
}
