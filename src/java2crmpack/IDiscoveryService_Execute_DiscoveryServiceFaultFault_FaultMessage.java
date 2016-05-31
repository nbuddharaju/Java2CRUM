
/**
 * IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package java2crmpack;

public class IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1464687939337L;
    
    private java2crmpack.DiscoveryServiceStub.DiscoveryServiceFaultE faultMessage;

    
        public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage() {
            super("IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage");
        }

        public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(java.lang.String s) {
           super(s);
        }

        public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public IDiscoveryService_Execute_DiscoveryServiceFaultFault_FaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(java2crmpack.DiscoveryServiceStub.DiscoveryServiceFaultE msg){
       faultMessage = msg;
    }
    
    public java2crmpack.DiscoveryServiceStub.DiscoveryServiceFaultE getFaultMessage(){
       return faultMessage;
    }
}
    