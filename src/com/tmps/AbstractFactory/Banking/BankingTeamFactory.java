package com.tmps.AbstractFactory.Banking;
import com.tmps.AbstractFactory.Developer;
import com.tmps.AbstractFactory.ProjectManager;
import com.tmps.AbstractFactory.TeamProject;

public class BankingTeamFactory implements TeamProject {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public QATester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PMBanking();
    }
}
