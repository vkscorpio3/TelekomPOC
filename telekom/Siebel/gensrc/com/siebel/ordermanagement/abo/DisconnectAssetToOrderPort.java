
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
@WebService(name = "DisconnectAssetToOrderPort", targetNamespace = "http://siebel.com/OrderManagement/ABO")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.siebel.ordermanagement.order.data.ObjectFactory.class,
    com.siebel.ordermanagement.asset.data.ObjectFactory.class,
    com.siebel.ordermanagement.quote.data.ObjectFactory.class,
    com.siebel.ordermanagement.abo.ObjectFactory.class
})
public interface DisconnectAssetToOrderPort {


    /**
     * 
     * @param disconnectAssetToOrderInput
     * @return
     *     returns com.siebel.ordermanagement.abo.DisconnectAssetToOrderOutput
     */
    @WebMethod(operationName = "DisconnectAssetToOrder", action = "document/http://siebel.com/OrderManagement/ABO:DisconnectAssetToOrder")
    @WebResult(name = "DisconnectAssetToOrder_Output", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "DisconnectAssetToOrder_Output")
    public DisconnectAssetToOrderOutput disconnectAssetToOrder(
        @WebParam(name = "DisconnectAssetToOrder_Input", targetNamespace = "http://siebel.com/OrderManagement/ABO", partName = "DisconnectAssetToOrder_Input")
        DisconnectAssetToOrderInput disconnectAssetToOrderInput);

}