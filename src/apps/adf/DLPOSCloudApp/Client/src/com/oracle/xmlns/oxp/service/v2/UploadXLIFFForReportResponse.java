
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
 *         &lt;element name="uploadXLIFFForReportReturn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "uploadXLIFFForReportReturn" })
@XmlRootElement(name = "uploadXLIFFForReportResponse")
public class UploadXLIFFForReportResponse {

    protected boolean uploadXLIFFForReportReturn;

    /**
     * Gets the value of the uploadXLIFFForReportReturn property.
     *
     */
    public boolean isUploadXLIFFForReportReturn() {
        return uploadXLIFFForReportReturn;
    }

    /**
     * Sets the value of the uploadXLIFFForReportReturn property.
     *
     */
    public void setUploadXLIFFForReportReturn(boolean value) {
        this.uploadXLIFFForReportReturn = value;
    }

}
