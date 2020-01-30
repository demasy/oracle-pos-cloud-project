
package com.oracle.xmlns.oxp.service.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetaDataList complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MetaDataList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metaDataList" type="{http://xmlns.oracle.com/oxp/service/v2}ArrayOfMetaData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaDataList", propOrder = { "metaDataList" })
public class MetaDataList {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfMetaData metaDataList;

    /**
     * Gets the value of the metaDataList property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfMetaData }
     *
     */
    public ArrayOfMetaData getMetaDataList() {
        return metaDataList;
    }

    /**
     * Sets the value of the metaDataList property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetaData }
     *
     */
    public void setMetaDataList(ArrayOfMetaData value) {
        this.metaDataList = value;
    }

}
