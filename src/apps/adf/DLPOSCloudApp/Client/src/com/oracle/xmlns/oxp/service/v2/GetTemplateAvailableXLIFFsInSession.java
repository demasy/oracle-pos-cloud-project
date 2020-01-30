
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
 *         &lt;element name="reportAbsolutePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "reportAbsolutePath", "templateID", "bipSessionToken" })
@XmlRootElement(name = "getTemplateAvailableXLIFFsInSession")
public class GetTemplateAvailableXLIFFsInSession {

    @XmlElement(required = true)
    protected String reportAbsolutePath;
    @XmlElement(required = true)
    protected String templateID;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Gets the value of the reportAbsolutePath property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportAbsolutePath() {
        return reportAbsolutePath;
    }

    /**
     * Sets the value of the reportAbsolutePath property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportAbsolutePath(String value) {
        this.reportAbsolutePath = value;
    }

    /**
     * Gets the value of the templateID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTemplateID(String value) {
        this.templateID = value;
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
