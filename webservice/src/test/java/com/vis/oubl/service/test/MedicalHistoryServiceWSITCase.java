// license-header java merge-point
/* Autogenerated on 03/19/2016 08:16:06+0200 by AndroMDA
 *
 * TEMPLATE:    cxf/CXFTestClient.vsl in andromda-webservices-cartridge
 * MODEL CLASS: Data::com.vis.oubl::service::MedicalHistoryService
 * STEREOTYPE:  WebService
*/
package com.vis.oubl.service.test;

import com.vis.oubl.service.GetCustomer;
import com.vis.oubl.service.GetCustomerImpl;
import com.vis.oubl.service.GetRedPlaneServiceImpl;
import com.vis.oubl.service.MedicalHistoryServiceSEI;
import junit.framework.AssertionFailedError;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Remote component interface for the MedicalHistoryService.
 * 
 */
public class MedicalHistoryServiceWSITCase
    extends TestSuite
{
    private Object scenario = null;

    /**
     * Constructor with no parameters
     */
    public MedicalHistoryServiceWSITCase()
    {
        super();
        this.setName("MedicalHistoryServiceWSITCase");
    }

    /*
     * Constructor with service name
     * @param name Service name to be tested
    public MedicalHistoryServiceWSITCase(String name)
    {
        super(name);
    }
     */

    /*
     * Constructor with service name and scenario - allows running one scenario data line from spreadsheet
     * @param name Service name to be tested
     * @param scenarioIn the first column of the spreadsheet
    public MedicalHistoryServiceWSITCase(String name, Object scenarioIn)
    {
        super(name);
        this.setScenario(scenarioIn);
    }
     */

    /**
     * @return the scenario
     */
    public Object getScenario()
    {
        return this.scenario;
    }

    /**
     * @param scenarioIn the scenario to set
     */
    public void setScenario(Object scenarioIn)
    {
        this.scenario = scenarioIn;
    }

    /*
     * JUnit test suite, calls DataDrivenTestSuite with data from MedicalHistoryService.xls
     * @return TestSuite with ServiceName driver
    public static TestSuite suite()
    {
        // Uncomment to create DataDrivenTests with Excel data inputs
        // TestDriverDefinition parameters: dataClass, filename, sheet name. Populates dataClass with spreadsheet contents.
        //TestDriverDefinition driverDef = new TestDriverDefinition(MedicalHistoryServiceTestData.class, "MedicalHistoryService.xls", "MedicalHistoryService");
        //DataDrivenTestSuite suite = new DataDrivenTestSuite(MedicalHistoryServiceWSITCase.class, driverDef);
        // TODO: post processing of data and suite elements through a delegate class/method
        // Use this for running JUnit 4 tests with JUnit 3 test runner.
        //junit.framework.JUnit4TestAdapter(MedicalHistoryServiceWSITCase.class);
        TestSuite suite = new TestSuite();
        suite.addTest(new MedicalHistoryServiceWSITCase("getCustomer"));
        suite.addTest(new MedicalHistoryServiceWSITCase("getRedPlaneService"));
        return suite;
    }
     */

    /** Run JUnit tests from the java main command line
     * @param args ignored
     */
    public static void main(String args[])
    {
        JUnitCore.main("com.vis.oubl.service.test.MedicalHistoryServiceWSITCase");
    }

    // ---------------- test methods  ----------------------

   /**
    * Invokes the getCustomer service method on MedicalHistoryService.
    * 
    * Operation parameters:
    *     id Long
    * Operation return:
    *     getCustomerResponse Object
    */
    @Test
    public void getCustomer()
    {
        System.out.println("Starting test: getCustomer for " + this.getName());
        // TestCase.setUp and tearDown methods for each individual service method test
        GetCustomerImpl.getCustomerSetUp();
        // Customize CreateInput method if different default input data is required.
        GetCustomer getCustomerInput = GetCustomerImpl.getCustomerCreateInput();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"cxf-client.xml"});

        MedicalHistoryServiceSEI client = (MedicalHistoryServiceSEI)context.getBean("MedicalHistoryServiceClient");

        Object getCustomerResponse = null;
        try
        {
            getCustomerResponse = client.getCustomer(
                 getCustomerInput.getId()  // Long
            );
            if (getCustomerResponse==null)
            {
                System.out.println("getCustomerResponse Result was valid and null");
            }
            else
            {
                System.out.println(" Result = " + getCustomerResponse.toString());
            }
        }
        catch (Exception ex)
        {
            System.out.println("MedicalHistoryService client.getCustomer" + " threw exception " + ex);
            throw new AssertionFailedError(ex.toString());
        }
        GetCustomerImpl.getCustomerTearDown();
        System.out.println("Finished test for MedicalHistoryService.getCustomer(id)");
    }

   /**
    * Invokes the getRedPlaneService service method on MedicalHistoryService.
    * 
    * Operation parameters:
    * Operation return:
    *     getRedPlaneServiceResponse Object
    */
    @Test
    public void getRedPlaneService()
    {
        System.out.println("Starting test: getRedPlaneService for " + this.getName());
        // TestCase.setUp and tearDown methods for each individual service method test
        GetRedPlaneServiceImpl.getRedPlaneServiceSetUp();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"cxf-client.xml"});

        MedicalHistoryServiceSEI client = (MedicalHistoryServiceSEI)context.getBean("MedicalHistoryServiceClient");

        Object getRedPlaneServiceResponse = null;
        try
        {
            getRedPlaneServiceResponse = client.getRedPlaneService(
            );
            if (getRedPlaneServiceResponse==null)
            {
                System.out.println("getRedPlaneServiceResponse Result was valid and null");
            }
            else
            {
                System.out.println(" Result = " + getRedPlaneServiceResponse.toString());
            }
        }
        catch (Exception ex)
        {
            System.out.println("MedicalHistoryService client.getRedPlaneService" + " threw exception " + ex);
            throw new AssertionFailedError(ex.toString());
        }
        GetRedPlaneServiceImpl.getRedPlaneServiceTearDown();
        System.out.println("Finished test for MedicalHistoryService.getRedPlaneService()");
    }

    /**
     * JUnit test data class, used by DataDrivenTestSuite in suite()
     */
    public static class MedicalHistoryServiceTestData
    {
        // TODO: Add test data fields here (populated by MedicalHistoryService.xls spreadsheet
        // TODO: Recursively list every primitive parameter in entire operation parameter hierarchy

        @SuppressWarnings("unused")
        private Long getCustomerId;
        /**
         * Data value for id getCustomer on used by DataDrivenTestSuite in suite().
         * getCustomerid must be the column name of the parameter in the spreadsheet
         * @param value Long to be populated manually
         */
        public void setGetCustomerId(Long value)
        {
            this.getCustomerId = value;
        }
    }
}