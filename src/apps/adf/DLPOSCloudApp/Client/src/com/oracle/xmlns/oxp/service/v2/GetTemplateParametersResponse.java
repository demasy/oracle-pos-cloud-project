
package com.oracle.xmlns.oxp.service.v2;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="getTemplateParametersReturn" type="{http://xmlns.oracle.com/oxp/service/v2}ParamNameValue" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getTemplateParametersReturn" })
@XmlRootElement(name = "getTemplateParametersResponse")
public class GetTemplateParametersResponse {

    @XmlElement(required = true)
    protected List<ParamNameValue> getTemplateParametersReturn;

    /**
     * Gets the value of the getTemplateParametersReturn property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getTemplateParametersReturn property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetTemplateParametersReturn().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamNameValue }
     *
     *
     */
    public List<ParamNameValue> getGetTemplateParametersReturn() {
        if (getTemplateParametersReturn == null) {
            getTemplateParametersReturn = new ArrayList<ParamNameValue>();
        }
        return this.getTemplateParametersReturn;
    }

}
