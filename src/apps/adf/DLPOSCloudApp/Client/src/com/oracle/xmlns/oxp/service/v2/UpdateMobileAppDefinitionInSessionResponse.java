
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
 *         &lt;element name="updateMobileAppDefinitionInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "updateMobileAppDefinitionInSessionReturn" })
@XmlRootElement(name = "updateMobileAppDefinitionInSessionResponse")
public class UpdateMobileAppDefinitionInSessionResponse {

    protected boolean updateMobileAppDefinitionInSessionReturn;

    /**
     * Gets the value of the updateMobileAppDefinitionInSessionReturn property.
     *
     */
    public boolean isUpdateMobileAppDefinitionInSessionReturn() {
        return updateMobileAppDefinitionInSessionReturn;
    }

    /**
     * Sets the value of the updateMobileAppDefinitionInSessionReturn property.
     *
     */
    public void setUpdateMobileAppDefinitionInSessionReturn(boolean value) {
        this.updateMobileAppDefinitionInSessionReturn = value;
    }

}
