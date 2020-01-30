
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
 *         &lt;element name="reportRequest" type="{http://xmlns.oracle.com/oxp/service/v2}ReportRequest"/&gt;
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
@XmlType(name = "", propOrder = { "reportRequest", "bipSessionToken" })
@XmlRootElement(name = "runDataModelInSession")
public class RunDataModelInSession {

    @XmlElement(required = true)
    protected ReportRequest reportRequest;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Gets the value of the reportRequest property.
     *
     * @return
     *     possible object is
     *     {@link ReportRequest }
     *
     */
    public ReportRequest getReportRequest() {
        return reportRequest;
    }

    /**
     * Sets the value of the reportRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link ReportRequest }
     *
     */
    public void setReportRequest(ReportRequest value) {
        this.reportRequest = value;
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
