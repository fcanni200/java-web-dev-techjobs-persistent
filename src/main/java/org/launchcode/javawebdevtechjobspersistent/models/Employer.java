package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;

@Entity
public class Employer extends AbstractEntity {
    @NotNull(message = "Location is Required")
    @Size(min = 3, max = 100)
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

