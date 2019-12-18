package fr.gk.fortest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
       App a= new App();
       this.assertEquals(1, a.fact(1));
       this.assertEquals(120, a.fact(5));
       this.assertEquals(50, a.maxi(20,50));
       this.assertEquals(50, a.maxi(10,40));
    }
}
