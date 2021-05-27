package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency extends JobField {


    // Custom toString, equals, and hashCode methods:

    public CoreCompetency (String value) {
        super(value);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency coreCompetency = (CoreCompetency) o;
        return getId() == coreCompetency.getId();
    }

    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.


}
