// license-header java merge-point
/* Autogenerated on 03/19/2016 08:16:05+0200 by AndroMDA DO NOT EDIT!
 *
 * TEMPLATE:    jaxws/MethodResponse.java.vsl in andromda-webservice cartridge
 * MODEL CLASS: customerSearch
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
 * com.vis.oubl.service.SearchService.customerSearch()
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_Object"
})
@XmlRootElement(name = "customerSearchResponse")
public class CustomerSearchResponse
    implements Serializable, Comparable<CustomerSearchResponse>
{
    private static final long serialVersionUID = 1L;
    /** returnParameter */
    @XmlElement(name = "_Object")
    protected Object _Object;

    /**
     * Gets the value of the _Object property.
     *
     * @return
     *     possible object is {@link Object }
     */
    public Object get_Object()
    {
        return this._Object;
    }

    /**
     * Sets the value of the _Object property.
     *
     * @param value
     *     allowed object is
     *     {@link Object }
     */
    public void set_Object(Object value)
    {
        this._Object = value;
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
        CustomerSearchResponse rhs = (CustomerSearchResponse) object;
        return new EqualsBuilder().appendSuper(super.equals(object))
            .append(this.get_Object(), rhs.get_Object())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    @Override
    public int compareTo(CustomerSearchResponse myClass)
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
            .append(this.get_Object(), myClass.get_Object())
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
            .append(this.get_Object())
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
            .append("customerSearch", this.get_Object())
            .toString();
    }
}