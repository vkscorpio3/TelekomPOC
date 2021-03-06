
package com.siebel.ordermanagement.abo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1-b03-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ResumeAssetToQuotePort", targetNamespace = "http://siebel.com/OrderManagement/ABO")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.siebel.ordermanagement.order.data.ObjectFactory.class,
    com.siebel.ordermanagement.abo.ObjectFactory.class,
    com.siebel.ordermanagement.asset.data.ObjectFactory.class,
    com.siebel.ordermanagement.quote.data.ObjectFactory.class
})
public interface ResumeAssetToQuotePort {


    /**
     * 
     * @param resumeAssetToQuoteInput
     * @return
     *     returns com.siebel.ordermanagement.abo.ResumeAssetToQuoteOutput
     */
    @WebMethod(operationName = "ResumeAssetToQuote", action = "document/http://siebel.com/OrderManagement/ABO:ResumeAssetToQuote")
    @WebResult(name = "ResumeAssetToQuote_Output", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "ResumeAssetToQuote_Output")
    public ResumeAssetToQuoteOutput resumeAssetToQuote(
        @WebParam(name = "ResumeAssetToQuote_Input", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "ResumeAssetToQuote_Input")
        ResumeAssetToQuoteInput resumeAssetToQuoteInput);

}
