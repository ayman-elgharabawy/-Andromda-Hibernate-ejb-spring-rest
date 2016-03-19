// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: Service.vsl in andromda-java-cartridge.
//
package com.vis.oubl.service;

import com.vis.oubl.vo.My010CustomerVO;

/**
 * 
 */
public interface My010CustomerService
{
    /**
     * 
     * @param mobileNumber 
     * @return My010CustomerVO
     */
    public My010CustomerVO getCustomernfoByMobileNumber(Long mobileNumber);

    /**
     * 
     * @return My010CustomerVO[]
     */
    public My010CustomerVO[] getAllCustomers();

    /**
     * 
     * @param id 
     * @return My010CustomerVO
     */
    public My010CustomerVO getCustomerById(Long id);

    /**
     * 
     * @param patient 
     * @return Integer
     */
    public Integer createCustomer(My010CustomerVO patient);

    /**
     * 
     * @param patient 
     * @return Integer
     */
    public Integer editCustomer(My010CustomerVO patient);

    /**
     * 
     * @param id 
     * @return Integer
     */
    public Integer deleteCustomer(Long id);

    /**
     * 
     * @param custid 
     * @return String
     */
    public String getBalance(Integer custid);

}