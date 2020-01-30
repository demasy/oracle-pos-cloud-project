
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReportRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XDOPropertyList" type="{http://xmlns.oracle.com/oxp/service/v2}MetaDataList"/&gt;
 *         &lt;element name="attributeCalendar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributeFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributeLocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributeTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributeTimezone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="attributeUILocale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="byPassCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dynamicDataSource" type="{http://xmlns.oracle.com/oxp/service/v2}BIPDataSource"/&gt;
 *         &lt;element name="flattenXML" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="parameterNameValues" type="{http://xmlns.oracle.com/oxp/service/v2}ParamNameValues"/&gt;
 *         &lt;element name="reportAbsolutePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="reportOutputPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportRawData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sizeOfDataChunkDownload" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRequest",
         propOrder =
         { "xdoPropertyList", "attributeCalendar", "attributeFormat", "attributeLocale", "attributeTemplate",
           "attributeTimezone", "attributeUILocale", "byPassCache", "dynamicDataSource", "flattenXML",
           "parameterNameValues", "reportAbsolutePath", "reportData", "reportOutputPath", "reportRawData",
           "sizeOfDataChunkDownload"
    })
public class ReportRequest {

    @XmlElement(name = "XDOPropertyList", required = true, nillable = true)
    protected MetaDataList xdoPropertyList;
    @XmlElement(required = true, nillable = true)
    protected String attributeCalendar;
    @XmlElement(required = true, nillable = true)
    protected String attributeFormat;
    @XmlElement(required = true, nillable = true)
    protected String attributeLocale;
    @XmlElement(required = true, nillable = true)
    protected String attributeTemplate;
    @XmlElement(required = true, nillable = true)
    protected String attributeTimezone;
    @XmlElement(required = true, nillable = true)
    protected String attributeUILocale;
    protected boolean byPassCache;
    @XmlElement(required = true, nillable = true)
    protected BIPDataSource dynamicDataSource;
    protected boolean flattenXML;
    @XmlElement(required = true, nillable = true)
    protected ParamNameValues parameterNameValues;
    @XmlElement(required = true, nillable = true)
    protected String reportAbsolutePath;
    @XmlElement(required = true, nillable = true)
    protected byte[] reportData;
    @XmlElement(required = true, nillable = true)
    protected String reportOutputPath;
    @XmlElement(required = true, nillable = true)
    protected String reportRawData;
    protected int sizeOfDataChunkDownload;

    /**
     * Gets the value of the xdoPropertyList property.
     *
     * @return
     *     possible object is
     *     {@link MetaDataList }
     *
     */
    public MetaDataList getXDOPropertyList() {
        return xdoPropertyList;
    }

    /**
     * Sets the value of the xdoPropertyList property.
     *
     * @param value
     *     allowed object is
     *     {@link MetaDataList }
     *
     */
    public void setXDOPropertyList(MetaDataList value) {
        this.xdoPropertyList = value;
    }

    /**
     * Gets the value of the attributeCalendar property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttributeCalendar() {
        return attributeCalendar;
    }

    /**
     * Sets the value of the attributeCalendar property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttributeCalendar(String value) {
        this.attributeCalendar = value;
    }

    /**
     * Gets the value of the attributeFormat property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttributeFormat() {
        return attributeFormat;
    }

    /**
     * Sets the value of the attributeFormat property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttributeFormat(String value) {
        this.attributeFormat = value;
    }

    /**
     * Gets the value of the attributeLocale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttributeLocale() {
        return attributeLocale;
    }

    /**
     * Sets the value of the attributeLocale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttributeLocale(String value) {
        this.attributeLocale = value;
    }

    /**
     * Gets the value of the attributeTemplate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttributeTemplate() {
        return attributeTemplate;
    }

    /**
     * Sets the value of the attributeTemplate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttributeTemplate(String value) {
        this.attributeTemplate = value;
    }

    /**
     * Gets the value of the attributeTimezone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttributeTimezone() {
        return attributeTimezone;
    }

    /**
     * Sets the value of the attributeTimezone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttributeTimezone(String value) {
        this.attributeTimezone = value;
    }

    /**
     * Gets the value of the attributeUILocale property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttributeUILocale() {
        return attributeUILocale;
    }

    /**
     * Sets the value of the attributeUILocale property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttributeUILocale(String value) {
        this.attributeUILocale = value;
    }

    /**
     * Gets the value of the byPassCache property.
     *
     */
    public boolean isByPassCache() {
        return byPassCache;
    }

    /**
     * Sets the value of the byPassCache property.
     *
     */
    public void setByPassCache(boolean value) {
        this.byPassCache = value;
    }

    /**
     * Gets the value of the dynamicDataSource property.
     *
     * @return
     *     possible object is
     *     {@link BIPDataSource }
     *
     */
    public BIPDataSource getDynamicDataSource() {
        return dynamicDataSource;
    }

    /**
     * Sets the value of the dynamicDataSource property.
     *
     * @param value
     *     allowed object is
     *     {@link BIPDataSource }
     *
     */
    public void setDynamicDataSource(BIPDataSource value) {
        this.dynamicDataSource = value;
    }

    /**
     * Gets the value of the flattenXML property.
     *
     */
    public boolean isFlattenXML() {
        return flattenXML;
    }

    /**
     * Sets the value of the flattenXML property.
     *
     */
    public void setFlattenXML(boolean value) {
        this.flattenXML = value;
    }

    /**
     * Gets the value of the parameterNameValues property.
     *
     * @return
     *     possible object is
     *     {@link ParamNameValues }
     *
     */
    public ParamNameValues getParameterNameValues() {
        return parameterNameValues;
    }

    /**
     * Sets the value of the parameterNameValues property.
     *
     * @param value
     *     allowed object is
     *     {@link ParamNameValues }
     *
     */
    public void setParameterNameValues(ParamNameValues value) {
        this.parameterNameValues = value;
    }

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
     * Gets the value of the reportData property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReportData() {
        return reportData;
    }

    /**
     * Sets the value of the reportData property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReportData(byte[] value) {
        this.reportData = value;
    }

    /**
     * Gets the value of the reportOutputPath property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportOutputPath() {
        return reportOutputPath;
    }

    /**
     * Sets the value of the reportOutputPath property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportOutputPath(String value) {
        this.reportOutputPath = value;
    }

    /**
     * Gets the value of the reportRawData property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportRawData() {
        return reportRawData;
    }

    /**
     * Sets the value of the reportRawData property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportRawData(String value) {
        this.reportRawData = value;
    }

    /**
     * Gets the value of the sizeOfDataChunkDownload property.
     *
     */
    public int getSizeOfDataChunkDownload() {
        return sizeOfDataChunkDownload;
    }

    /**
     * Sets the value of the sizeOfDataChunkDownload property.
     *
     */
    public void setSizeOfDataChunkDownload(int value) {
        this.sizeOfDataChunkDownload = value;
    }

}
