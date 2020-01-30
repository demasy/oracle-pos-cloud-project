
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="updateMobileAppDefinitionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "updateMobileAppDefinitionReturn" })
@XmlRootElement(name = "updateMobileAppDefinitionResponse")
public class UpdateMobileAppDefinitionResponse {

    protected boolean updateMobileAppDefinitionReturn;

    /**
     * Gets the value of the updateMobileAppDefinitionReturn property.
     *
     */
    public boolean isUpdateMobileAppDefinitionReturn() {
        return updateMobileAppDefinitionReturn;
    }

    /**
     * Sets the value of the updateMobileAppDefinitionReturn property.
     *
     */
    public void setUpdateMobileAppDefinitionReturn(boolean value) {
        this.updateMobileAppDefinitionReturn = value;
    }

}
