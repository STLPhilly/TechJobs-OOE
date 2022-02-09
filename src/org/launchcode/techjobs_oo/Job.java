package org.launchcode.techjobs_oo;

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

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType,
               CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

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

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;

    }

    @Override
    public String toString(){

        String result = "";
        String test = "";
        String noJob = " OOPS! This job does not seem to exist.";
        String noData = " Data not available";
        String strId = Integer.toString(id);
//        result = "\nID:" + id
//                + "\nName:" + name
//                + "\nEmployer:" + employer
//                + "\nLocation:" + location
//                + "\nPosition type:" + positionType
//                + "\nCore Competency:" + coreCompetency;

        // assign a variable for each value.
        String id1 = strId;
        String name1 = this.getName();
        String employer1 = this.getEmployer().getValue();
        String location1 = this.getLocation().getValue();
        String positiontype1 = this.getPositionType().getValue();
        String coreCompetency1 = this.getCoreCompetency().getValue();

        // Makes a hashmap so we can iterate through each k/v pair
        HashMap<String, String> jobFields = new HashMap<>();
        jobFields.put("ID", strId);
        jobFields.put("Name", name);
        jobFields.put("Employer", this.getEmployer().getValue());
        jobFields.put("Location", this.getLocation().getValue());
        jobFields.put("Position type", this.getPositionType().getValue());
        jobFields.put("Core Competency", this.getCoreCompetency().getValue());

        // if everything but ID is empty, it doesn't exist. Exit logic.
        if(this.name == "" && this.employer.getValue() == "" && this.coreCompetency.getValue() == "" && this.positionType.getValue() == "" && this.location.getValue() == ""){
            System.out.println("\n"+ noJob);
        } else {
            System.out.println( "\n");


            for (String field : jobFields.keySet()) {
                String value = jobFields.get(field);

                // check if a value is empty, and replace it with "no data"
                if (value == "") {
                    test = field + ": " + noData;
                    System.out.println(test);
                    return(test);
                } else {
                    test = field + ": " + value;
                    System.out.println(test);
                    return(test);
                }
                ArrayList<String> testResult = new ArrayList<>();
            }


//            if (this.name == "" && this.employer.getValue() == "" && this.coreCompetency.getValue() == "" && this.positionType.getValue() == "" && this.location.getValue() == "") {
//                System.out.println("\n" + noJob);
//            }
        }
//        if(name.length() != 0){
//            //TODO Figure out how to iterate through constructor values
//            setName(noData);
//            System.out.println(name.length());
//            System.out.println("");
//            return result;
//        } else {
//            System.out.println("else" + name.length());
//            return noJob;
//        }
        return test;
    }
}
