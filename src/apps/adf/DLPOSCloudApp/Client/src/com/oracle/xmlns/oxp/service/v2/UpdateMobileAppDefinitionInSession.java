
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
 *         &lt;element name="reportAbsPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="newMobileAppDefn" type="{http://xmlns.oracle.com/oxp/service/v2}MobileAppDefinition"/&gt;
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
@XmlType(name = "", propOrder = { "reportAbsPath", "newMobileAppDefn", "bipSessionToken" })
@XmlRootElement(name = "updateMobileAppDefinitionInSession")
public class UpdateMobileAppDefinitionInSession {

    @XmlElement(required = true)
    protected String reportAbsPath;
    @XmlElement(required = true)
    protected MobileAppDefinition newMobileAppDefn;
    @XmlElement(required = true)
    protected String bipSessionToken;

    /**
     * Gets the value of the reportAbsPath property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportAbsPath() {
        return reportAbsPath;
    }

    /**
     * Sets the value of the reportAbsPath property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportAbsPath(String value) {
        this.reportAbsPath = value;
    }

    /**
     * Gets the value of the newMobileAppDefn property.
     *
     * @return
     *     possible object is
     *     {@link MobileAppDefinition }
     *
     */
    public MobileAppDefinition getNewMobileAppDefn() {
        return newMobileAppDefn;
    }

    /**
     * Sets the value of the newMobileAppDefn property.
     *
     * @param value
     *     allowed object is
     *     {@link MobileAppDefinition }
     *
     */
    public void setNewMobileAppDefn(MobileAppDefinition value) {
        this.newMobileAppDefn = value;
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
