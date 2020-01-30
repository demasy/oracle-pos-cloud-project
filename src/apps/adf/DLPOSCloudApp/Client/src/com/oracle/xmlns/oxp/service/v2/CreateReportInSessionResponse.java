
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
 *         &lt;element name="createReportInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "createReportInSessionReturn" })
@XmlRootElement(name = "createReportInSessionResponse")
public class CreateReportInSessionResponse {

    @XmlElement(required = true)
    protected String createReportInSessionReturn;

    /**
     * Gets the value of the createReportInSessionReturn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCreateReportInSessionReturn() {
        return createReportInSessionReturn;
    }

    /**
     * Sets the value of the createReportInSessionReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCreateReportInSessionReturn(String value) {
        this.createReportInSessionReturn = value;
    }

}
