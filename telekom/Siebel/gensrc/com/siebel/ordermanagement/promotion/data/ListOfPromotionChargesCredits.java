
package com.siebel.ordermanagement.promotion.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfPromotionChargesCredits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfPromotionChargesCredits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromotionChargesCredits" type="{http://siebel.com/OrderManagement/Promotion/Data}PromotionChargesCredits" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfPromotionChargesCredits", propOrder = {
    "promotionChargesCredits"
})
public class ListOfPromotionChargesCredits
    implements Serializable
{

    @XmlElement(name = "PromotionChargesCredits")
    protected List<PromotionChargesCredits> promotionChargesCredits;

    /**
     * Gets the value of the promotionChargesCredits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionChargesCredits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionChargesCredits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionChargesCredits }
     * 
     * 
     */
    public List<PromotionChargesCredits> getPromotionChargesCredits() {
        if (promotionChargesCredits == null) {
            promotionChargesCredits = new ArrayList<PromotionChargesCredits>();
        }
        return this.promotionChargesCredits;
    }

}
