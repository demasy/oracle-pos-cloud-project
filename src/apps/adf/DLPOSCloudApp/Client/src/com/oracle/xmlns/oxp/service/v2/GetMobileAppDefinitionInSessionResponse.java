
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
 *         &lt;element name="getMobileAppDefinitionInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}MobileAppDefinition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getMobileAppDefinitionInSessionReturn" })
@XmlRootElement(name = "getMobileAppDefinitionInSessionResponse")
public class GetMobileAppDefinitionInSessionResponse {

    @XmlElement(required = true)
    protected MobileAppDefinition getMobileAppDefinitionInSessionReturn;

    /**
     * Gets the value of the getMobileAppDefinitionInSessionReturn property.
     *
     * @return
     *     possible object is
     *     {@link MobileAppDefinition }
     *
     */
    public MobileAppDefinition getGetMobileAppDefinitionInSessionReturn() {
        return getMobileAppDefinitionInSessionReturn;
    }

    /**
     * Sets the value of the getMobileAppDefinitionInSessionReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link MobileAppDefinition }
     *
     */
    public void setGetMobileAppDefinitionInSessionReturn(MobileAppDefinition value) {
        this.getMobileAppDefinitionInSessionReturn = value;
    }

}
