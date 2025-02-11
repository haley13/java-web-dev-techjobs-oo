package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField{


    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    public Location (String value) {
       super(value);
    }
    // Custom toString, equals, and hashCode methods:

        public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

        public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:


}
