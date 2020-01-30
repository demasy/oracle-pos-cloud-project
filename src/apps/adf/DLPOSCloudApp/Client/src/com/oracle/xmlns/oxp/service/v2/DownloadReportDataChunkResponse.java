
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
 *         &lt;element name="downloadReportDataChunkReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportDataChunk"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "downloadReportDataChunkReturn" })
@XmlRootElement(name = "downloadReportDataChunkResponse")
public class DownloadReportDataChunkResponse {

    @XmlElement(required = true)
    protected ReportDataChunk downloadReportDataChunkReturn;

    /**
     * Gets the value of the downloadReportDataChunkReturn property.
     *
     * @return
     *     possible object is
     *     {@link ReportDataChunk }
     *
     */
    public ReportDataChunk getDownloadReportDataChunkReturn() {
        return downloadReportDataChunkReturn;
    }

    /**
     * Sets the value of the downloadReportDataChunkReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link ReportDataChunk }
     *
     */
    public void setDownloadReportDataChunkReturn(ReportDataChunk value) {
        this.downloadReportDataChunkReturn = value;
    }

}
