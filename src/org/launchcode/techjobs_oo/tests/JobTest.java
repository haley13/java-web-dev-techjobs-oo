package org.launchcode.techjobs_oo.tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {
    Job test_job;
    Job test_job2;
    Job test_job3;

    @Before
    public void createJobObject() {
        //test_job = new Job();
        test_job2 = new Job();
        test_job= new Job ("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job3= new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId() {
        assertTrue(test_job.getId() != test_job2.getId());//anything in the test needs to be in an assert.

    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job.getName().contains("Product tester"));
        assertTrue(test_job.getEmployer().getValue().equals("Acme"));
        assertTrue(test_job.getLocation().getValue().equals("Desert"));
        assertTrue(test_job.getPositionType().getValue().equals("Quality control"));
        assertTrue(test_job.getCoreCompetency().getValue().equals("Persistence"));
    }
    @Test
    public void testJobsForEquality() {
        assertEquals(test_job.getId(), test_job3.getId());
    }

}



