
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
 *         &lt;element name="updateReportDefinitionInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "updateReportDefinitionInSessionReturn" })
@XmlRootElement(name = "updateReportDefinitionInSessionResponse")
public class UpdateReportDefinitionInSessionResponse {

    protected boolean updateReportDefinitionInSessionReturn;

    /**
     * Gets the value of the updateReportDefinitionInSessionReturn property.
     *
     */
    public boolean isUpdateReportDefinitionInSessionReturn() {
        return updateReportDefinitionInSessionReturn;
    }

    /**
     * Sets the value of the updateReportDefinitionInSessionReturn property.
     *
     */
    public void setUpdateReportDefinitionInSessionReturn(boolean value) {
        this.updateReportDefinitionInSessionReturn = value;
    }

}
