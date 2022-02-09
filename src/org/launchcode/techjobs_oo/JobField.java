package org.launchcode.techjobs_oo;

import java.util.Objects;

// Here we have a class.
// It's made abstract, so it doesn't create an object.
public abstract class JobField {
    // Initializing ID
    private int id;
    // Assigning id number
    private static int nextId = 1;
    //Initializing Value
    private String value;

    //Method to assign new accumulating ID, so each ID is incrementally higher.
     public JobField() {
        id = nextId;
        nextId++;
    }

    // assigns aValue to the value field. However,
    // it ALSO initializes id for the object by calling the first constructor with the this(); statement.
    // Including this(); in any JobField constructor makes initializing id a default behavior.
    public JobField(String value) {
        this();
        this.value = value;
    }

    //These are custom Overrides for
    //toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Getter for value
    public String getValue() {
        return value;
    }

    //Setter for value
    public void setValue(String value) {
        this.value = value;
    }

    //Getter for ID
    public int getId() {
        return id;
    }
}