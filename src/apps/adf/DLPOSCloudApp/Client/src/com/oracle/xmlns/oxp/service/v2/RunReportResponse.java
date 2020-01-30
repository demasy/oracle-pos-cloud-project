
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
 *         &lt;element name="runReportReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "runReportReturn" })
@XmlRootElement(name = "runReportResponse")
public class RunReportResponse {

    @XmlElement(required = true)
    protected ReportResponse runReportReturn;

    /**
     * Gets the value of the runReportReturn property.
     *
     * @return
     *     possible object is
     *     {@link ReportResponse }
     *
     */
    public ReportResponse getRunReportReturn() {
        return runReportReturn;
    }

    /**
     * Sets the value of the runReportReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link ReportResponse }
     *
     */
    public void setRunReportReturn(ReportResponse value) {
        this.runReportReturn = value;
    }

}
