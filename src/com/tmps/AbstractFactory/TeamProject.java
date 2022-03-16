package com.tmps.AbstractFactory;

public interface TeamProject {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
