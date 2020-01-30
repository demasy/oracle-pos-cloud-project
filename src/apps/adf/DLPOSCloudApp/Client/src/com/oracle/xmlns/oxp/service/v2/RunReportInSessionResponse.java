
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
 *         &lt;element name="runReportInSessionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "runReportInSessionReturn" })
@XmlRootElement(name = "runReportInSessionResponse")
public class RunReportInSessionResponse {

    @XmlElement(required = true)
    protected ReportResponse runReportInSessionReturn;

    /**
     * Gets the value of the runReportInSessionReturn property.
     *
     * @return
     *     possible object is
     *     {@link ReportResponse }
     *
     */
    public ReportResponse getRunReportInSessionReturn() {
        return runReportInSessionReturn;
    }

    /**
     * Sets the value of the runReportInSessionReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link ReportResponse }
     *
     */
    public void setRunReportInSessionReturn(ReportResponse value) {
        this.runReportInSessionReturn = value;
    }

}
