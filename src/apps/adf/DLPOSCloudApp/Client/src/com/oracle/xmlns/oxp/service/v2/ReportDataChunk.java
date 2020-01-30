
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportDataChunk complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReportDataChunk"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reportDataChunk" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="reportDataFileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportDataOffset" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDataChunk", propOrder = { "reportDataChunk", "reportDataFileID", "reportDataOffset" })
public class ReportDataChunk {

    @XmlElement(required = true, nillable = true)
    protected byte[] reportDataChunk;
    @XmlElement(required = true, nillable = true)
    protected String reportDataFileID;
    protected long reportDataOffset;

    /**
     * Gets the value of the reportDataChunk property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportDataChunk() {
        return reportDataChunk;
    }

    /**
     * Sets the value of the reportDataChunk property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportDataChunk(byte[] value) {
        this.reportDataChunk = value;
    }

    /**
     * Gets the value of the reportDataFileID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportDataFileID() {
        return reportDataFileID;
    }

    /**
     * Sets the value of the reportDataFileID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportDataFileID(String value) {
        this.reportDataFileID = value;
    }

    /**
     * Gets the value of the reportDataOffset property.
     *
     */
    public long getReportDataOffset() {
        return reportDataOffset;
    }

    /**
     * Sets the value of the reportDataOffset property.
     *
     */
    public void setReportDataOffset(long value) {
        this.reportDataOffset = value;
    }

}
