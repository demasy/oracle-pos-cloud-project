
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
 *         &lt;element name="getXDOSchemaReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getXDOSchemaReturn" })
@XmlRootElement(name = "getXDOSchemaResponse")
public class GetXDOSchemaResponse {

    @XmlElement(required = true)
    protected byte[] getXDOSchemaReturn;

    /**
     * Gets the value of the getXDOSchemaReturn property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetXDOSchemaReturn() {
        return getXDOSchemaReturn;
    }

    /**
     * Sets the value of the getXDOSchemaReturn property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetXDOSchemaReturn(byte[] value) {
        this.getXDOSchemaReturn = value;
    }

}
