
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
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "reportAbsPath", "newMobileAppDefn", "userID", "password" })
@XmlRootElement(name = "updateMobileAppDefinition")
public class UpdateMobileAppDefinition {

    @XmlElement(required = true)
    protected String reportAbsPath;
    @XmlElement(required = true)
    protected MobileAppDefinition newMobileAppDefn;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;

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
     * Gets the value of the userID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
