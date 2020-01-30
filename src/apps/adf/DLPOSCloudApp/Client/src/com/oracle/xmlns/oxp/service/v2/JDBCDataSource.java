
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JDBCDataSource complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="JDBCDataSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JDBCDriverClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JDBCDriverType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JDBCPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JDBCURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JDBCUserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataSourceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="postProcessFunc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preProcessFunc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="useProxyAuth" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JDBCDataSource",
         propOrder =
         { "jdbcDriverClass", "jdbcDriverType", "jdbcPassword", "jdbcurl", "jdbcUserName", "dataSourceName",
           "postProcessFunc", "preProcessFunc", "useProxyAuth"
    })
public class JDBCDataSource {

    @XmlElement(name = "JDBCDriverClass", required = true, nillable = true)
    protected String jdbcDriverClass;
    @XmlElement(name = "JDBCDriverType", required = true, nillable = true)
    protected String jdbcDriverType;
    @XmlElement(name = "JDBCPassword", required = true, nillable = true)
    protected String jdbcPassword;
    @XmlElement(name = "JDBCURL", required = true, nillable = true)
    protected String jdbcurl;
    @XmlElement(name = "JDBCUserName", required = true, nillable = true)
    protected String jdbcUserName;
    @XmlElement(required = true, nillable = true)
    protected String dataSourceName;
    @XmlElement(required = true, nillable = true)
    protected String postProcessFunc;
    @XmlElement(required = true, nillable = true)
    protected String preProcessFunc;
    protected boolean useProxyAuth;

    /**
     * Gets the value of the jdbcDriverClass property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJDBCDriverClass() {
        return jdbcDriverClass;
    }

    /**
     * Sets the value of the jdbcDriverClass property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJDBCDriverClass(String value) {
        this.jdbcDriverClass = value;
    }

    /**
     * Gets the value of the jdbcDriverType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJDBCDriverType() {
        return jdbcDriverType;
    }

    /**
     * Sets the value of the jdbcDriverType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJDBCDriverType(String value) {
        this.jdbcDriverType = value;
    }

    /**
     * Gets the value of the jdbcPassword property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJDBCPassword() {
        return jdbcPassword;
    }

    /**
     * Sets the value of the jdbcPassword property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJDBCPassword(String value) {
        this.jdbcPassword = value;
    }

    /**
     * Gets the value of the jdbcurl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJDBCURL() {
        return jdbcurl;
    }

    /**
     * Sets the value of the jdbcurl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJDBCURL(String value) {
        this.jdbcurl = value;
    }

    /**
     * Gets the value of the jdbcUserName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getJDBCUserName() {
        return jdbcUserName;
    }

    /**
     * Sets the value of the jdbcUserName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setJDBCUserName(String value) {
        this.jdbcUserName = value;
    }

    /**
     * Gets the value of the dataSourceName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDataSourceName() {
        return dataSourceName;
    }

    /**
     * Sets the value of the dataSourceName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDataSourceName(String value) {
        this.dataSourceName = value;
    }

    /**
     * Gets the value of the postProcessFunc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostProcessFunc() {
        return postProcessFunc;
    }

    /**
     * Sets the value of the postProcessFunc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostProcessFunc(String value) {
        this.postProcessFunc = value;
    }

    /**
     * Gets the value of the preProcessFunc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreProcessFunc() {
        return preProcessFunc;
    }

    /**
     * Sets the value of the preProcessFunc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreProcessFunc(String value) {
        this.preProcessFunc = value;
    }

    /**
     * Gets the value of the useProxyAuth property.
     *
     */
    public boolean isUseProxyAuth() {
        return useProxyAuth;
    }

    /**
     * Sets the value of the useProxyAuth property.
     *
     */
    public void setUseProxyAuth(boolean value) {
        this.useProxyAuth = value;
    }

}
