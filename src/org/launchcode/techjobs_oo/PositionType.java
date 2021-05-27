package org.launchcode.techjobs_oo;

public class PositionType extends JobField {


    public PositionType(String value) {
        super(value);
    }






    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PositionType)) return false;
        if (!super.equals(object)) return false;
        PositionType positionType = (PositionType) object;
        return getId() == positionType.getId();
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), getId());
    }


    // Getters and Setters:


}
