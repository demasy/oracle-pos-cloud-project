
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
 *         &lt;element name="getReportSampleDataReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getReportSampleDataReturn" })
@XmlRootElement(name = "getReportSampleDataResponse")
public class GetReportSampleDataResponse {

    @XmlElement(required = true)
    protected byte[] getReportSampleDataReturn;

    /**
     * Gets the value of the getReportSampleDataReturn property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetReportSampleDataReturn() {
        return getReportSampleDataReturn;
    }

    /**
     * Sets the value of the getReportSampleDataReturn property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetReportSampleDataReturn(byte[] value) {
        this.getReportSampleDataReturn = value;
    }

}
