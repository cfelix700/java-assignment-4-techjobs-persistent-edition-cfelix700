package org.launchcode.techjobs.persistent.models;

import org.launchcode.techjobs.persistent.controllers.EmployerController;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location cannot be blank")
    @Size(min = 1, max = 100, message = "Location must be between 1 and 100 characters")
    private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

//    public Employer(String location) {
//        this.location = location;
//    }
//
//        public Employer(String name, String location){
//        super(name);
//        this.location = location;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
