
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobileAppDefinition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MobileAppDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ESSJobName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ESSPackageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autoRun" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cacheDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="controledByExtApp" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dataModelURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultOutputFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultTemplateId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="diagnostics" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="listOfTemplateFormatsLabelValues" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfMobileTemplateFormatsLabelValues"/&gt;
 *         &lt;element name="onLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="openLinkInNewWindow" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="parameterColumns" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="parameterNames" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfString"/&gt;
 *         &lt;element name="reportDefnTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reportParameterNameValues" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfParamNameValue"/&gt;
 *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="showControls" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showReportLinks" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="templateIds" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfString"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileAppDefinition",
         propOrder =
         { "essJobName", "essPackageName", "autoRun", "cacheDocument", "controledByExtApp", "dataModelURL",
           "defaultOutputFormat", "defaultTemplateId", "diagnostics", "listOfTemplateFormatsLabelValues", "onLine",
           "openLinkInNewWindow", "parameterColumns", "parameterNames", "reportDefnTitle", "reportDescription",
           "reportName", "reportParameterNameValues", "reportType", "showControls", "showReportLinks", "templateIds"
    })
public class MobileAppDefinition {

    @XmlElement(name = "ESSJobName", required = true, nillable = true)
    protected String essJobName;
    @XmlElement(name = "ESSPackageName", required = true, nillable = true)
    protected String essPackageName;
    protected boolean autoRun;
    protected boolean cacheDocument;
    protected boolean controledByExtApp;
    @XmlElement(required = true, nillable = true)
    protected String dataModelURL;
    @XmlElement(required = true, nillable = true)
    protected String defaultOutputFormat;
    @XmlElement(required = true, nillable = true)
    protected String defaultTemplateId;
    protected boolean diagnostics;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfMobileTemplateFormatsLabelValues listOfTemplateFormatsLabelValues;
    protected boolean onLine;
    protected boolean openLinkInNewWindow;
    protected int parameterColumns;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString parameterNames;
    @XmlElement(required = true, nillable = true)
    protected String reportDefnTitle;
    @XmlElement(required = true, nillable = true)
    protected String reportDescription;
    @XmlElement(required = true, nillable = true)
    protected String reportName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfParamNameValue reportParameterNameValues;
    @XmlElement(required = true, nillable = true)
    protected String reportType;
    protected boolean showControls;
    protected boolean showReportLinks;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString templateIds;

    /**
     * Gets the value of the essJobName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getESSJobName() {
        return essJobName;
    }

    /**
     * Sets the value of the essJobName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setESSJobName(String value) {
        this.essJobName = value;
    }

    /**
     * Gets the value of the essPackageName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getESSPackageName() {
        return essPackageName;
    }

    /**
     * Sets the value of the essPackageName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setESSPackageName(String value) {
        this.essPackageName = value;
    }

    /**
     * Gets the value of the autoRun property.
     *
     */
    public boolean isAutoRun() {
        return autoRun;
    }

    /**
     * Sets the value of the autoRun property.
     *
     */
    public void setAutoRun(boolean value) {
        this.autoRun = value;
    }

    /**
     * Gets the value of the cacheDocument property.
     *
     */
    public boolean isCacheDocument() {
        return cacheDocument;
    }

    /**
     * Sets the value of the cacheDocument property.
     *
     */
    public void setCacheDocument(boolean value) {
        this.cacheDocument = value;
    }

    /**
     * Gets the value of the controledByExtApp property.
     *
     */
    public boolean isControledByExtApp() {
        return controledByExtApp;
    }

    /**
     * Sets the value of the controledByExtApp property.
     *
     */
    public void setControledByExtApp(boolean value) {
        this.controledByExtApp = value;
    }

    /**
     * Gets the value of the dataModelURL property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataModelURL() {
        return dataModelURL;
    }

    /**
     * Sets the value of the dataModelURL property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataModelURL(String value) {
        this.dataModelURL = value;
    }

    /**
     * Gets the value of the defaultOutputFormat property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultOutputFormat() {
        return defaultOutputFormat;
    }

    /**
     * Sets the value of the defaultOutputFormat property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefaultOutputFormat(String value) {
        this.defaultOutputFormat = value;
    }

    /**
     * Gets the value of the defaultTemplateId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDefaultTemplateId() {
        return defaultTemplateId;
    }

    /**
     * Sets the value of the defaultTemplateId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDefaultTemplateId(String value) {
        this.defaultTemplateId = value;
    }

    /**
     * Gets the value of the diagnostics property.
     *
     */
    public boolean isDiagnostics() {
        return diagnostics;
    }

    /**
     * Sets the value of the diagnostics property.
     *
     */
    public void setDiagnostics(boolean value) {
        this.diagnostics = value;
    }

    /**
     * Gets the value of the listOfTemplateFormatsLabelValues property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfMobileTemplateFormatsLabelValues }
     *
     */
    public ArrayOfMobileTemplateFormatsLabelValues getListOfTemplateFormatsLabelValues() {
        return listOfTemplateFormatsLabelValues;
    }

    /**
     * Sets the value of the listOfTemplateFormatsLabelValues property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfMobileTemplateFormatsLabelValues }
     *
     */
    public void setListOfTemplateFormatsLabelValues(ArrayOfMobileTemplateFormatsLabelValues value) {
        this.listOfTemplateFormatsLabelValues = value;
    }

    /**
     * Gets the value of the onLine property.
     *
     */
    public boolean isOnLine() {
        return onLine;
    }

    /**
     * Sets the value of the onLine property.
     *
     */
    public void setOnLine(boolean value) {
        this.onLine = value;
    }

    /**
     * Gets the value of the openLinkInNewWindow property.
     *
     */
    public boolean isOpenLinkInNewWindow() {
        return openLinkInNewWindow;
    }

    /**
     * Sets the value of the openLinkInNewWindow property.
     *
     */
    public void setOpenLinkInNewWindow(boolean value) {
        this.openLinkInNewWindow = value;
    }

    /**
     * Gets the value of the parameterColumns property.
     *
     */
    public int getParameterColumns() {
        return parameterColumns;
    }

    /**
     * Sets the value of the parameterColumns property.
     *
     */
    public void setParameterColumns(int value) {
        this.parameterColumns = value;
    }

    /**
     * Gets the value of the parameterNames property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *
     */
    public ArrayOfString getParameterNames() {
        return parameterNames;
    }

    /**
     * Sets the value of the parameterNames property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *
     */
    public void setParameterNames(ArrayOfString value) {
        this.parameterNames = value;
    }

    /**
     * Gets the value of the reportDefnTitle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportDefnTitle() {
        return reportDefnTitle;
    }

    /**
     * Sets the value of the reportDefnTitle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportDefnTitle(String value) {
        this.reportDefnTitle = value;
    }

    /**
     * Gets the value of the reportDescription property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportDescription() {
        return reportDescription;
    }

    /**
     * Sets the value of the reportDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportDescription(String value) {
        this.reportDescription = value;
    }

    /**
     * Gets the value of the reportName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the reportParameterNameValues property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfParamNameValue }
     *
     */
    public ArrayOfParamNameValue getReportParameterNameValues() {
        return reportParameterNameValues;
    }

    /**
     * Sets the value of the reportParameterNameValues property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfParamNameValue }
     *
     */
    public void setReportParameterNameValues(ArrayOfParamNameValue value) {
        this.reportParameterNameValues = value;
    }

    /**
     * Gets the value of the reportType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportType(String value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the showControls property.
     *
     */
    public boolean isShowControls() {
        return showControls;
    }

    /**
     * Sets the value of the showControls property.
     *
     */
    public void setShowControls(boolean value) {
        this.showControls = value;
    }

    /**
     * Gets the value of the showReportLinks property.
     *
     */
    public boolean isShowReportLinks() {
        return showReportLinks;
    }

    /**
     * Sets the value of the showReportLinks property.
     *
     */
    public void setShowReportLinks(boolean value) {
        this.showReportLinks = value;
    }

    /**
     * Gets the value of the templateIds property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *
     */
    public ArrayOfString getTemplateIds() {
        return templateIds;
    }

    /**
     * Sets the value of the templateIds property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *
     */
    public void setTemplateIds(ArrayOfString value) {
        this.templateIds = value;
    }

}
