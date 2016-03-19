// license-header java merge-point
/* Autogenerated on 11/12/2015 15:15:48+0200 by AndroMDA
 *
 * TEMPLATE:    jaxws/WebServiceDelegate.vsl in andromda-webservices-cartridge
 * MODEL CLASS: Data::com.vis.oubl::service::MedicalHistoryService
 * STEREOTYPE:  WebService
*/
package com.vis.oubl.service;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * WebService Service Endpoint Implementation delegate for the MedicalHistoryService service.
 * 
 */

public class MedicalHistoryServiceWSDelegate
{
   // private static final Logger LOG = LoggerFactory.getLogger(MedicalHistoryServiceWSDelegate.class);
   // private static final String className = "MedicalHistoryServiceWSDelegate";

    /**
     * Constructor
     */
    public MedicalHistoryServiceWSDelegate()
    {
        //Documented empty code block - avoid compiler warning
    }

   /**
    * Invokes the getCustomer service method on MedicalHistoryService.
    * 
    * @param id datatype Long multiplicity=0..1
    * @return getCustomerResponse Object
    */
    public Object getCustomer
    (
        Long id
    )
    {
        // Populate method wrapper object so all parameters can be logged and transformed at once
        // Transform input parameters to domain request object    Ayman........
        Object rtn =GetCustomerImpl.getCustomerTransformResponse(
            id
        );

        //TODO: Implement service operation
        //throw new UnsupportedOperationException("Service MedicalHistoryService.getCustomer not implemented.");
        // Dummy return value implementation with default values, modify Impl class.
      //  Object rtn = GetCustomerImpl.getCustomerTransformResponse(/* Domain response to be transformed to service response */);
        return rtn;
    }

   /**
    * Invokes the getRedPlaneService service method on MedicalHistoryService.
    * 
    * @return getRedPlaneServiceResponse Object
    */
    public Object getRedPlaneService
    (
    )
    {
        // Populate method wrapper object so all parameters can be logged and transformed at once
        // Transform input parameters to domain request object    Ayman........
        Object rtn =GetRedPlaneServiceImpl.getRedPlaneServiceTransformResponse(
        );

        //TODO: Implement service operation
        //throw new UnsupportedOperationException("Service MedicalHistoryService.getRedPlaneService not implemented.");
        // Dummy return value implementation with default values, modify Impl class.
      //  Object rtn = GetRedPlaneServiceImpl.getRedPlaneServiceTransformResponse(/* Domain response to be transformed to service response */);
        return rtn;
    }
}