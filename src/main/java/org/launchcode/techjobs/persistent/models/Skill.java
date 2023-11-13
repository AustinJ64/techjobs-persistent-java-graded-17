package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import javax.print.attribute.standard.JobSheets;
import java.util.*;

@Entity
public class Skill extends AbstractEntity {

    public Skill() {
    }

    private String description;
        @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;


    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
