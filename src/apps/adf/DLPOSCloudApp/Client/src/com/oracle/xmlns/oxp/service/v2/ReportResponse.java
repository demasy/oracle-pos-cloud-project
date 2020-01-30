
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReportResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metaDataList" type="{http://xmlns.oracle.com/oxp/service/v2}MetaDataList"/&gt;
 *         &lt;element name="reportBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="reportContentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportFileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportResponse",
         propOrder = { "metaDataList", "reportBytes", "reportContentType", "reportFileID", "reportLocale" })
public class ReportResponse {

    @XmlElement(required = true, nillable = true)
    protected MetaDataList metaDataList;
    @XmlElement(required = true, nillable = true)
    protected byte[] reportBytes;
    @XmlElement(required = true, nillable = true)
    protected String reportContentType;
    @XmlElement(required = true, nillable = true)
    protected String reportFileID;
    @XmlElement(required = true, nillable = true)
    protected String reportLocale;

    /**
     * Gets the value of the metaDataList property.
     *
     * @return
     *     possible object is
     *     {@link MetaDataList }
     *
     */
    public MetaDataList getMetaDataList() {
        return metaDataList;
    }

    /**
     * Sets the value of the metaDataList property.
     *
     * @param value
     *     allowed object is
     *     {@link MetaDataList }
     *
     */
    public void setMetaDataList(MetaDataList value) {
        this.metaDataList = value;
    }

    /**
     * Gets the value of the reportBytes property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportBytes() {
        return reportBytes;
    }

    /**
     * Sets the value of the reportBytes property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportBytes(byte[] value) {
        this.reportBytes = value;
    }

    /**
     * Gets the value of the reportContentType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportContentType() {
        return reportContentType;
    }

    /**
     * Sets the value of the reportContentType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportContentType(String value) {
        this.reportContentType = value;
    }

    /**
     * Gets the value of the reportFileID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportFileID() {
        return reportFileID;
    }

    /**
     * Sets the value of the reportFileID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportFileID(String value) {
        this.reportFileID = value;
    }

    /**
     * Gets the value of the reportLocale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportLocale() {
        return reportLocale;
    }

    /**
     * Sets the value of the reportLocale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportLocale(String value) {
        this.reportLocale = value;
    }

}
