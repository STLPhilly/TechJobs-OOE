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
    @Before
    public void createObject(){
    emptyJob1 = new Job();
    emptyJob2 = new Job();
    fullJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    fullJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println("I go in like this: " + fullJob2);
    }

    @Test
    public void testSettingJobId() {
        createObject();
        assertFalse(emptyJob1.getId() == emptyJob2.getId());
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

        assertFalse(job1 == job2);
    }

    @Test
    public void testToStringMethod(){
        createObject();
        //create multiple test for each test field
        // test for \n before
        String slashn = "\n";
//        assertTrue(firstJob.toString().indexOf(slashn) != -1);
        System.out.println("Testing 74 " + fullJob2.toString());
//        assertTrue(fullJob2.toString().contains(slashn));
// line 74 prints out an iteration of one line
        // test that each field is GETting the correct data for each field


        // check for "data not available" instead of empty string
//        createObject();



        //Test \n and after

        // Test name to be ""
        // firstjob.getname = null ??
        System.out.println("I come out like this: "+ fullJob2);
        System.out.println(fullJob2.getName());
        System.out.println(fullJob2.getEmployer().toString());
        assertFalse(fullJob2.getEmployer().toString() == "");
        assertFalse(fullJob2.getLocation().toString() == "");
        assertFalse(fullJob2.getPositionType().toString() == "");
        assertFalse(fullJob2.getCoreCompetency().toString() == "");

    }
}

