// license-header java merge-point
/* Autogenerated on 03/19/2016 08:16:05+0200 by AndroMDA DO NOT EDIT!
 *
 * TEMPLATE:    jaxws/MethodResponse.java.vsl in andromda-webservice cartridge
 * MODEL CLASS: deleteCustomer
 * STEREOTYPE:  WebServiceOperation
*/
package com.vis.oubl.service;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Method Response wrapper for webservice response element for
 * com.vis.oubl.service.SearchService.deleteCustomer()
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_Integer"
})
@XmlRootElement(name = "deleteCustomerResponse")
public class DeleteCustomerResponse
    implements Serializable, Comparable<DeleteCustomerResponse>
{
    private static final long serialVersionUID = 1L;
    /** returnParameter */
    @XmlElement(name = "_Integer")
    protected Integer _Integer;

    /**
     * Gets the value of the _Integer property.
     *
     * @return
     *     possible object is {@link Integer }
     */
    public Integer get_Integer()
    {
        return this._Integer;
    }

    /**
     * Sets the value of the _Integer property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     */
    public void set_Integer(Integer value)
    {
        this._Integer = value;
    }

    /**
     * @param object to compare this object against
     * @return boolean if equal
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object)
    {
        if (object==null || object.getClass() != this.getClass())
        {
             return false;
        }
        DeleteCustomerResponse rhs = (DeleteCustomerResponse) object;
        return new EqualsBuilder().appendSuper(super.equals(object))
            .append(this.get_Integer(), rhs.get_Integer())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    @Override
    public int compareTo(DeleteCustomerResponse myClass)
    {
        if (myClass==null)
        {
            return -1;
        }
        // Check if the same object instance
        if (myClass==this)
        {
            return 0;
        }
        return new CompareToBuilder()
            .append(this.get_Integer(), myClass.get_Integer())
            .toComparison();
    }

    /**
     * @return int hashCode value
     * @see Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(1249046965, -82296885).appendSuper(super.hashCode())
            .append(this.get_Integer())
            .toHashCode();
    }

    /**
     * @return String representation of object
     * @see Object#toString()
     */
    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
            .append("deleteCustomer", this.get_Integer())
            .toString();
    }
}