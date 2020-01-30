
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getMobileAppDefinitionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}MobileAppDefinition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getMobileAppDefinitionReturn" })
@XmlRootElement(name = "getMobileAppDefinitionResponse")
public class GetMobileAppDefinitionResponse {

    @XmlElement(required = true)
    protected MobileAppDefinition getMobileAppDefinitionReturn;

    /**
     * Gets the value of the getMobileAppDefinitionReturn property.
     *
     * @return
     *     possible object is
     *     {@link MobileAppDefinition }
     *
     */
    public MobileAppDefinition getGetMobileAppDefinitionReturn() {
        return getMobileAppDefinitionReturn;
    }

    /**
     * Sets the value of the getMobileAppDefinitionReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link MobileAppDefinition }
     *
     */
    public void setGetMobileAppDefinitionReturn(MobileAppDefinition value) {
        this.getMobileAppDefinitionReturn = value;
    }

}
