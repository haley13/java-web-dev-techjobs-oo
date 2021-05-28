package org.launchcode.techjobs_oo.tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest extends JobField {
    Job test_job;
    Job test_job2;
    Job test_job3;
    Job test_job4;

    @Before
    public void createJobObject() {
        test_job2 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        test_job4 = new Job("", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        test_job = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job3 = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertTrue(test_job.getId() != test_job2.getId());//anything in the test needs to be in an assert.

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job.getName().contains("Product tester"));
        assertTrue(test_job.getEmployer().getValue().contains("Acme"));
        assertTrue(test_job.getLocation().getValue().equals("Desert"));
        assertTrue(test_job.getPositionType().getValue().contains("Quality control"));
        assertTrue(test_job.getCoreCompetency().getValue().contains("Persistence"));
    }

    @Test
    public void testJobsForEquality() {

        assertFalse(test_job.getId()== test_job3.getId());
    }

    @Test
    public void testJobsForBlankLines() {
        assertEquals('\n', test_job.toString().charAt(0));
        assertEquals('\n', test_job.toString().charAt(test_job.toString().length() - 1));
//                + "ID:" + test_job.getId() + "______" + "\nName:" + test_job.getName() + "______" + "\nEmployer" + test_job.getEmployer() + "______" + "\nLocation:" + test_job.getLocation() + "______" + "\nPosition Type:" + test_job.getPositionType() + "______"
//                + "\nCore Competency:" + test_job.getCoreCompetency() + "______", test_job.toString(), test_job.toString());
    }

    @Test
    public void testJobsForLabels() {
        assertEquals("\n" + "ID: " + test_job.getId() + "\n" +
                "Name: " + test_job.getName() + "\n" +
                "Employer: " + test_job.getEmployer().getValue() + "\n" +
                "Location: " + test_job.getLocation().getValue() + "\n" +
                "Position Type: " + test_job.getPositionType().getValue() + "\n" +
                "Core Competency: " + test_job.getCoreCompetency().getValue() + "\n", test_job.toString());
//        //do i put a method w/i a method?
    }

    @Test
    public void testJobForEmptyFields() {

        assertEquals("\n" + "ID: " + test_job4.getId() + "\n" +
                "Name: " + "Data not available" + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + test_job4.getLocation().getValue() + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + test_job4.getCoreCompetency().getValue() + "\n", test_job4.toString());
    }

    @Test
    public void testForAllEmptyFields() {
        assertEquals("OOPS! This job does not seem to exist.", test_job2.toString());
    }
}




//
//
//"ID: " + test_job2.getId() + "Data not available" + "\n" +
//        "Name: " + test_job2.getName() + "Data not available" + "\n" +
//        "Employer: " + test_job2.getEmployer() + "Data not available" + "\n" +
//        "Location:  " + test_job2.getLocation() + "Data not available" + "\n" +
//        "Position Type: " + test_job2.getPositionType() + "Data not available" + "\n" +
//        "Core Competency: " + test_job2.getCoreCompetency() + "Data not available"