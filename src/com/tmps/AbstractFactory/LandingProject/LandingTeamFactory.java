package com.tmps.AbstractFactory.LandingProject;
import com.tmps.AbstractFactory.Developer;
import com.tmps.AbstractFactory.ProjectManager;
import com.tmps.AbstractFactory.TeamProject;

public class LandingTeamFactory implements TeamProject {
    @Override
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public QATester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PMLandingPage();
    }
}
