
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParamNameValue complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ParamNameValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UIType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateFormatString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fieldSize" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lovLabels" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfString"/&gt;
 *         &lt;element name="multiValuesAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refreshParamOnChange" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="selectAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="templateParam" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useNullForAll" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="values" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfString"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamNameValue",
         propOrder =
         { "uiType", "dataType", "dateFormatString", "dateFrom", "dateTo", "defaultValue", "fieldSize", "label",
           "lovLabels", "multiValuesAllowed", "name", "refreshParamOnChange", "selectAll", "templateParam",
           "useNullForAll", "values"
    })
public class ParamNameValue {

    @XmlElement(name = "UIType", required = true, nillable = true)
    protected String uiType;
    @XmlElement(required = true, nillable = true)
    protected String dataType;
    @XmlElement(required = true, nillable = true)
    protected String dateFormatString;
    @XmlElement(required = true, nillable = true)
    protected String dateFrom;
    @XmlElement(required = true, nillable = true)
    protected String dateTo;
    @XmlElement(required = true, nillable = true)
    protected String defaultValue;
    @XmlElement(required = true, nillable = true)
    protected String fieldSize;
    @XmlElement(required = true, nillable = true)
    protected String label;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString lovLabels;
    protected boolean multiValuesAllowed;
    @XmlElement(required = true, nillable = true)
    protected String name;
    protected boolean refreshParamOnChange;
    protected boolean selectAll;
    protected boolean templateParam;
    protected boolean useNullForAll;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString values;

    /**
     * Gets the value of the uiType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUIType() {
        return uiType;
    }

    /**
     * Sets the value of the uiType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUIType(String value) {
        this.uiType = value;
    }

    /**
     * Gets the value of the dataType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dateFormatString property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateFormatString() {
        return dateFormatString;
    }

    /**
     * Sets the value of the dateFormatString property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateFormatString(String value) {
        this.dateFormatString = value;
    }

    /**
     * Gets the value of the dateFrom property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the defaultValue property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the fieldSize property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFieldSize() {
        return fieldSize;
    }

    /**
     * Sets the value of the fieldSize property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFieldSize(String value) {
        this.fieldSize = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the lovLabels property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *
     */
    public ArrayOfString getLovLabels() {
        return lovLabels;
    }

    /**
     * Sets the value of the lovLabels property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *
     */
    public void setLovLabels(ArrayOfString value) {
        this.lovLabels = value;
    }

    /**
     * Gets the value of the multiValuesAllowed property.
     *
     */
    public boolean isMultiValuesAllowed() {
        return multiValuesAllowed;
    }

    /**
     * Sets the value of the multiValuesAllowed property.
     *
     */
    public void setMultiValuesAllowed(boolean value) {
        this.multiValuesAllowed = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the refreshParamOnChange property.
     *
     */
    public boolean isRefreshParamOnChange() {
        return refreshParamOnChange;
    }

    /**
     * Sets the value of the refreshParamOnChange property.
     *
     */
    public void setRefreshParamOnChange(boolean value) {
        this.refreshParamOnChange = value;
    }

    /**
     * Gets the value of the selectAll property.
     *
     */
    public boolean isSelectAll() {
        return selectAll;
    }

    /**
     * Sets the value of the selectAll property.
     *
     */
    public void setSelectAll(boolean value) {
        this.selectAll = value;
    }

    /**
     * Gets the value of the templateParam property.
     *
     */
    public boolean isTemplateParam() {
        return templateParam;
    }

    /**
     * Sets the value of the templateParam property.
     *
     */
    public void setTemplateParam(boolean value) {
        this.templateParam = value;
    }

    /**
     * Gets the value of the useNullForAll property.
     *
     */
    public boolean isUseNullForAll() {
        return useNullForAll;
    }

    /**
     * Sets the value of the useNullForAll property.
     *
     */
    public void setUseNullForAll(boolean value) {
        this.useNullForAll = value;
    }

    /**
     * Gets the value of the values property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *
     */
    public ArrayOfString getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *
     */
    public void setValues(ArrayOfString value) {
        this.values = value;
    }

}
