package com.blackrose9.monkplan.models;

import java.util.Date;

public class Project {
    private String mProjectTitle;
    private String mProjectDescription;
    private String mAuthor;
    private Date published;

    public Project(String projectTitle, String projectDescription, String author) {
        mProjectTitle = projectTitle;
        mProjectDescription = projectDescription;
        mAuthor = author;
    }

    public Project(String projectTitle, String projectDescription, String author, Date published) {
        mProjectTitle = projectTitle;
        mProjectDescription = projectDescription;
        mAuthor = author;
        this.published = published;
    }

    public String getProjectTitle() {
        return mProjectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        mProjectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return mProjectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        mProjectDescription = projectDescription;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }
}
