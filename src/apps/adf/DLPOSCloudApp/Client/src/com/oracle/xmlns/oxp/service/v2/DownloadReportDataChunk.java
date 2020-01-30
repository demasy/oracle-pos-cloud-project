
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
 *         &lt;element name="fileID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beginIdx" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "", propOrder = { "fileID", "beginIdx", "size", "userID", "password" })
@XmlRootElement(name = "downloadReportDataChunk")
public class DownloadReportDataChunk {

    @XmlElement(required = true)
    protected String fileID;
    protected int beginIdx;
    protected int size;
    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String password;

    /**
     * Gets the value of the fileID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Sets the value of the fileID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

    /**
     * Gets the value of the beginIdx property.
     *
     */
    public int getBeginIdx() {
        return beginIdx;
    }

    /**
     * Sets the value of the beginIdx property.
     *
     */
    public void setBeginIdx(int value) {
        this.beginIdx = value;
    }

    /**
     * Gets the value of the size property.
     *
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     *
     */
    public void setSize(int value) {
        this.size = value;
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
