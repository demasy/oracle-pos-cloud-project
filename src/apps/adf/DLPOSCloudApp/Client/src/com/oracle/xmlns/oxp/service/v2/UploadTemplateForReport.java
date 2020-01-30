
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
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
@XmlType(name = "",
         propOrder =
         { "reportAbsolutePath", "templateName", "templateType", "locale", "templateData", "userID", "password"
    })
@XmlRootElement(name = "uploadTemplateForReport")
public class UploadTemplateForReport {

    @XmlElement(required = true)
    protected String reportAbsolutePath;
    @XmlElement(required = true)
    protected String templateName;
    @XmlElement(required = true)
    protected String templateType;
    @XmlElement(required = true)
    protected String locale;
    @XmlElement(required = true)
    protected byte[] templateData;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;

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
     * Gets the value of the templateName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the templateType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * Sets the value of the templateType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTemplateType(String value) {
        this.templateType = value;
    }

    /**
     * Gets the value of the locale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the templateData property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTemplateData() {
        return templateData;
    }

    /**
     * Sets the value of the templateData property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTemplateData(byte[] value) {
        this.templateData = value;
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
