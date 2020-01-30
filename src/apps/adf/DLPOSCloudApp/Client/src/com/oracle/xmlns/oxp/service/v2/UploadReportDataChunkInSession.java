
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
 *         &lt;element name="fileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportDataChunk" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="reportRawDataChunk" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bipSessionToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "fileID", "reportDataChunk", "reportRawDataChunk", "bipSessionToken" })
@XmlRootElement(name = "uploadReportDataChunkInSession")
public class UploadReportDataChunkInSession {

    @XmlElement(required = true)
    protected String fileID;
    @XmlElement(required = true)
    protected byte[] reportDataChunk;
    @XmlElement(required = true)
    protected String reportRawDataChunk;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Gets the value of the fileID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Sets the value of the fileID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

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
     * Gets the value of the reportRawDataChunk property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportRawDataChunk() {
        return reportRawDataChunk;
    }

    /**
     * Sets the value of the reportRawDataChunk property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportRawDataChunk(String value) {
        this.reportRawDataChunk = value;
    }

    /**
     * Gets the value of the bipSessionToken property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBipSessionToken() {
        return bipSessionToken;
    }

    /**
     * Sets the value of the bipSessionToken property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBipSessionToken(String value) {
        this.bipSessionToken = value;
    }

}
