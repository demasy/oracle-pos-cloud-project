
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
 *         &lt;element name="getReportDefinitionReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ReportDefinition"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getReportDefinitionReturn" })
@XmlRootElement(name = "getReportDefinitionResponse")
public class GetReportDefinitionResponse {

    @XmlElement(required = true)
    protected ReportDefinition getReportDefinitionReturn;

    /**
     * Gets the value of the getReportDefinitionReturn property.
     *
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *
     */
    public ReportDefinition getGetReportDefinitionReturn() {
        return getReportDefinitionReturn;
    }

    /**
     * Sets the value of the getReportDefinitionReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *
     */
    public void setGetReportDefinitionReturn(ReportDefinition value) {
        this.getReportDefinitionReturn = value;
    }

}
