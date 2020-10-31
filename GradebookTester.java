import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {

    GradeBook g1;

    @Before
    public void setUp()
    {
        g1 = new GradeBook(5);

        g1.addScore(50.0);
        g1.addScore(75.0);
        g1.addScore(64.0);
        g1.addScore(88.8);
        g1.addScore(99.6);
    }

    @After
    public void tearDown()
    {
        g1 = null;
    }

    @Test
    public void testAddScore()
    {
        Assert.assertEquals(5.0, g1.getScoreSize(), 0.01);
        Assert.assertEquals("50.0 75.0 64.0 88.8 99.6 ", g1.toString());
    }



    @Test
    public void testSum()
    {
        Assert.assertEquals(377.4, g1.sum(), .0001);
        //Assert.assertEquals();
    }

    @Test
    public void testMinimum()
    {
        Assert.assertEquals(50.0, g1.minimum(), .001);

    }

    @Test
    public void testFinalScore()
    {
        Assert.assertEquals(327.4, g1.finalScore(), .0001);
    }

    @Test
    public void addScoreTest()
    {
        Assert.assertEquals("50.0 75.0 64.0 88.8 99.6 ", g1.toString());
    }
}
