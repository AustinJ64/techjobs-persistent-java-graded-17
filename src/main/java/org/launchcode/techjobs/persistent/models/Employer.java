package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.*;

@Entity
public class Employer extends AbstractEntity {
    public Employer() {
    }

    @NotNull
    @Size(min = 2, max = 80)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
@OneToMany
@JoinColumn(name="employer_id")
    private List<Job> jobs = new ArrayList<Job>() {};
}

