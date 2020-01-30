
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
 *         &lt;element name="uploadTemplateForReportReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "uploadTemplateForReportReturn" })
@XmlRootElement(name = "uploadTemplateForReportResponse")
public class UploadTemplateForReportResponse {

    protected boolean uploadTemplateForReportReturn;

    /**
     * Gets the value of the uploadTemplateForReportReturn property.
     *
     */
    public boolean isUploadTemplateForReportReturn() {
        return uploadTemplateForReportReturn;
    }

    /**
     * Sets the value of the uploadTemplateForReportReturn property.
     *
     */
    public void setUploadTemplateForReportReturn(boolean value) {
        this.uploadTemplateForReportReturn = value;
    }

}
