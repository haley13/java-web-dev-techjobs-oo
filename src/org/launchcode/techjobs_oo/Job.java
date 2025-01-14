package org.launchcode.techjobs_oo;

public class Job extends JobField {

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
    if (name.isEmpty() && employer.getValue().isEmpty() && location.getValue().isEmpty() &&
            positionType.getValue().isEmpty() && coreCompetency.getValue().isEmpty()) {
        return "OOPS! This job does not seem to exist.";
    } else {
        String notAvailable = "Data not available";
        String nameDisplay;
        String employerDisplay;
        String locationDisplay;
        String positionTypeDisplay;
        String coreCompetencyDisplay;
        if (name.isEmpty()) {
            nameDisplay = notAvailable;
        } else {
            nameDisplay = name;
        }
        if (employer.getValue().isEmpty()) {
            employerDisplay = notAvailable;
        } else {
            employerDisplay = employer.getValue();
        }
        if (location.getValue().isEmpty()) {
            locationDisplay = notAvailable;
        } else {
            locationDisplay = location.getValue();
        }
        if (positionType.getValue().isEmpty()) {
            positionTypeDisplay = notAvailable;
        } else {
            positionTypeDisplay = positionType.getValue();
        }
        if (coreCompetency.getValue().isEmpty()) {
            coreCompetencyDisplay = notAvailable;
        } else {
            coreCompetencyDisplay = coreCompetency.getValue();
        }

        return "\n" + "ID: " + id + "\n" +
                "Name: " + nameDisplay + "\n" +
                "Employer: " + employerDisplay + "\n" +
                "Location: " + locationDisplay + "\n" +
                "Position Type: " + positionTypeDisplay + "\n" +
                "Core Competency: " + coreCompetencyDisplay + "\n";

    }
}



        //it doesn't separate the returns!! it takes the first return and doesn't consider the 2nd one, i need to look this over

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Job)) return false;
        if (!super.equals(object)) return false;
        Job job = (Job) object;
        return id == job.id;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

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

    public Location getLocation() {
        return location;
    }

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
}
