
package com.senneko.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sumar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sumar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametro_a" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="parametro_b" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumar", propOrder = {
    "parametroA",
    "parametroB"
})
public class Sumar {

    @XmlElement(name = "parametro_a")
    protected int parametroA;
    @XmlElement(name = "parametro_b")
    protected int parametroB;

    /**
     * Gets the value of the parametroA property.
     * 
     */
    public int getParametroA() {
        return parametroA;
    }

    /**
     * Sets the value of the parametroA property.
     * 
     */
    public void setParametroA(int value) {
        this.parametroA = value;
    }

    /**
     * Gets the value of the parametroB property.
     * 
     */
    public int getParametroB() {
        return parametroB;
    }

    /**
     * Sets the value of the parametroB property.
     * 
     */
    public void setParametroB(int value) {
        this.parametroB = value;
    }

}
