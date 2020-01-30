
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
 *         &lt;element name="getReportParametersReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ParamNameValues"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getReportParametersReturn" })
@XmlRootElement(name = "getReportParametersResponse")
public class GetReportParametersResponse {

    @XmlElement(required = true)
    protected ParamNameValues getReportParametersReturn;

    /**
     * Gets the value of the getReportParametersReturn property.
     *
     * @return
     *     possible object is
     *     {@link ParamNameValues }
     *
     */
    public ParamNameValues getGetReportParametersReturn() {
        return getReportParametersReturn;
    }

    /**
     * Sets the value of the getReportParametersReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link ParamNameValues }
     *
     */
    public void setGetReportParametersReturn(ParamNameValues value) {
        this.getReportParametersReturn = value;
    }

}
