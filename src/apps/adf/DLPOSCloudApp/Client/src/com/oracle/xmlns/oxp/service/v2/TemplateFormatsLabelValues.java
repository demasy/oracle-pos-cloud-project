
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateFormatsLabelValues complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TemplateFormatsLabelValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="applyStyleTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="listOfTemplateFormatLabelValue" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfTemplateFormatLabelValue"/&gt;
 *         &lt;element name="templateAvailableLocales" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfString"/&gt;
 *         &lt;element name="templateBaseLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateDefaultLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="templateURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="viewOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateFormatsLabelValues",
         propOrder =
         { "active", "applyStyleTemplate", "_default", "listOfTemplateFormatLabelValue", "templateAvailableLocales",
           "templateBaseLocale", "templateDefaultLocale", "templateID", "templateType", "templateURL", "viewOnline"
    })
public class TemplateFormatsLabelValues {

    protected boolean active;
    protected boolean applyStyleTemplate;
    @XmlElement(name = "default")
    protected boolean _default;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfTemplateFormatLabelValue listOfTemplateFormatLabelValue;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString templateAvailableLocales;
    @XmlElement(required = true, nillable = true)
    protected String templateBaseLocale;
    @XmlElement(required = true, nillable = true)
    protected String templateDefaultLocale;
    @XmlElement(required = true, nillable = true)
    protected String templateID;
    @XmlElement(required = true, nillable = true)
    protected String templateType;
    @XmlElement(required = true, nillable = true)
    protected String templateURL;
    protected boolean viewOnline;

    /**
     * Gets the value of the active property.
     *
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     *
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the applyStyleTemplate property.
     *
     */
    public boolean isApplyStyleTemplate() {
        return applyStyleTemplate;
    }

    /**
     * Sets the value of the applyStyleTemplate property.
     *
     */
    public void setApplyStyleTemplate(boolean value) {
        this.applyStyleTemplate = value;
    }

    /**
     * Gets the value of the default property.
     *
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     *
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the listOfTemplateFormatLabelValue property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfTemplateFormatLabelValue }
     *
     */
    public ArrayOfTemplateFormatLabelValue getListOfTemplateFormatLabelValue() {
        return listOfTemplateFormatLabelValue;
    }

    /**
     * Sets the value of the listOfTemplateFormatLabelValue property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfTemplateFormatLabelValue }
     *
     */
    public void setListOfTemplateFormatLabelValue(ArrayOfTemplateFormatLabelValue value) {
        this.listOfTemplateFormatLabelValue = value;
    }

    /**
     * Gets the value of the templateAvailableLocales property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *
     */
    public ArrayOfString getTemplateAvailableLocales() {
        return templateAvailableLocales;
    }

    /**
     * Sets the value of the templateAvailableLocales property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *
     */
    public void setTemplateAvailableLocales(ArrayOfString value) {
        this.templateAvailableLocales = value;
    }

    /**
     * Gets the value of the templateBaseLocale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTemplateBaseLocale() {
        return templateBaseLocale;
    }

    /**
     * Sets the value of the templateBaseLocale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTemplateBaseLocale(String value) {
        this.templateBaseLocale = value;
    }

    /**
     * Gets the value of the templateDefaultLocale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTemplateDefaultLocale() {
        return templateDefaultLocale;
    }

    /**
     * Sets the value of the templateDefaultLocale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTemplateDefaultLocale(String value) {
        this.templateDefaultLocale = value;
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
     * Gets the value of the templateURL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTemplateURL() {
        return templateURL;
    }

    /**
     * Sets the value of the templateURL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTemplateURL(String value) {
        this.templateURL = value;
    }

    /**
     * Gets the value of the viewOnline property.
     *
     */
    public boolean isViewOnline() {
        return viewOnline;
    }

    /**
     * Sets the value of the viewOnline property.
     *
     */
    public void setViewOnline(boolean value) {
        this.viewOnline = value;
    }

}
