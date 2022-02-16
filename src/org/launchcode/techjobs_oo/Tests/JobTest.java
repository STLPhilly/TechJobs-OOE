package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {


//    Job firstJob = new Job();
//    Job secondJob = new Job();
    Job emptyJob1;
    Job emptyJob2;
    Job fullJob1;
    Job fullJob2;
    Job multiTestJob;
    Job emptyStringsJob;
    @Before
    public void createObject(){
    emptyJob1 = new Job();
    emptyJob2 = new Job();
    fullJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    fullJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    multiTestJob = new Job("", new Employer("ACME"), new Location(""),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    emptyStringsJob = new Job("", new Employer(""), new Location(""),
                new PositionType(""), new CoreCompetency(""));

        System.out.println("I go in like this: " + multiTestJob);
    }

    @Test
    public void testSettingJobId() {
        createObject();
        assertFalse(emptyJob1.getId() == emptyJob2.getId());
        assertFalse(emptyJob1.equals(emptyJob2));
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job.getName() instanceof String);
        assertEquals("Product tester", job.getName());

        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals("ACME", job.getEmployer().getValue());

        assertTrue(job.getLocation() instanceof Location);
        assertEquals("Desert", job.getLocation().getValue());

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job.getPositionType().getValue());

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
        new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));

    }

    @Test
    public void testToStringMethodMulti(){
        String expected;
        expected ="\n" +
                "ID: " + multiTestJob.getId()  +
                "\nName: Data not available" +
                "\nEmployer: ACME" +
                "\nLocation: Data not available" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence" +
                "\n";

        //When passed a Job object, it should return a string that contains a blank line before and after the job information.
        //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
        //If a field is empty, the method should add, “Data not available” after the label.
        //     multiTestJob = new Job("", new Employer("ACME"), new Location(""),
        //                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(expected,multiTestJob.toString());
    }

    @Test
    public void testToStringMethodNoJob(){
        String expected;
        //(Bonus) If a Job object ONLY contains data for the id field, the method should return, “OOPS! This job does not seem to exist.”
        expected ="\n" +
                "OOPS! This job does not seem to exist." +
                "\n";
        assertEquals(expected,emptyStringsJob.toString());
}
};
