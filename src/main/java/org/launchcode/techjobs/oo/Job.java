package org.launchcode.techjobs.oo;

import javax.security.auth.callback.LanguageCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString() {
        // Declares placeholders
        String namePlaceholder = getName();
        String employerPlaceholder = getEmployer().toString();
        String locationPlaceholder = getLocation().toString();
        String positionTypePlaceholder = getPositionType().toString();
        String coreCompetencyPlaceholder = getCoreCompetency().toString();
        String N_A = "Data not available";

        // Changes placeholder value to N/A message if it's empty
        if (namePlaceholder.equals("")) {namePlaceholder = N_A;}
        if (employerPlaceholder.equals("")) {employerPlaceholder = N_A;}
        if (locationPlaceholder.equals("")) {locationPlaceholder = N_A;}
        if (positionTypePlaceholder.equals("")) {positionTypePlaceholder = N_A;}
        if (coreCompetencyPlaceholder.equals("")) {coreCompetencyPlaceholder = N_A;}

        // Returns non-existent job message if only ID is retrievable
        if (namePlaceholder.equals(N_A) && employerPlaceholder.equals(N_A) && locationPlaceholder.equals(N_A) && positionTypePlaceholder.equals(N_A) && coreCompetencyPlaceholder.equals(N_A)) {
            return "OOPS! This job does not seem to exist.";
        }

        // Returns filled out formatted fields with available data
        return "\nID: " + getId() + "\n" +
                "Name: " + namePlaceholder + "\n" +
                "Employer: " + employerPlaceholder + "\n" +
                "Location: " + locationPlaceholder + "\n" +
                "Position Type: " + positionTypePlaceholder + "\n" +
                "Core Competency: " + coreCompetencyPlaceholder + "\n";
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() { return location; }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}