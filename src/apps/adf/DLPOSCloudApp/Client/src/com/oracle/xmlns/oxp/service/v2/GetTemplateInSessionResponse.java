
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
 *         &lt;element name="getTemplateInSessionReturn" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getTemplateInSessionReturn" })
@XmlRootElement(name = "getTemplateInSessionResponse")
public class GetTemplateInSessionResponse {

    @XmlElement(required = true)
    protected byte[] getTemplateInSessionReturn;

    /**
     * Gets the value of the getTemplateInSessionReturn property.
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetTemplateInSessionReturn() {
        return getTemplateInSessionReturn;
    }

    /**
     * Sets the value of the getTemplateInSessionReturn property.
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetTemplateInSessionReturn(byte[] value) {
        this.getTemplateInSessionReturn = value;
    }

}
