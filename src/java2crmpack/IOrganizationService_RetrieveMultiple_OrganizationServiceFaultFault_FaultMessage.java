
/**
 * IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package java2crmpack;

public class IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1464687962469L;
    
    private java2crmpack.OrganizationServiceStub.OrganizationServiceFaultE faultMessage;

    
        public IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage() {
            super("IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage");
        }

        public IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage(java.lang.String s) {
           super(s);
        }

        public IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public IOrganizationService_RetrieveMultiple_OrganizationServiceFaultFault_FaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(java2crmpack.OrganizationServiceStub.OrganizationServiceFaultE msg){
       faultMessage = msg;
    }
    
    public java2crmpack.OrganizationServiceStub.OrganizationServiceFaultE getFaultMessage(){
       return faultMessage;
    }
}
    