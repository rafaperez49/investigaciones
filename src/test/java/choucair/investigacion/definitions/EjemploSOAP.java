package choucair.investigacion.definitions;

import javax.xml.soap.*;

public class EjemploSOAP {
	
	// SAAJ - SOAP Client Testing
    public static void main(String args[]) {
        /*
            The example below requests from the Web Service at:
             http://www.webservicex.net/uszip.asmx?op=GetInfoByCity


            To call other WS, change the parameters below, which are:
             - the SOAP Endpoint URL (that is, where the service is responding from)
             - the SOAP Action

            Also change the contents of the method createSoapEnvelope() in this class. It constructs
             the inner part of the SOAP envelope that is actually sent.
         */
       /* String soapEndpointUrl = "http://www.webservicex.net/uszip.asmx";
        String soapAction = "http://www.webservicex.net/GetInfoByCity";*/
    	String soapEndpointUrl = "https://virtualesqa1.bancolombia.corp/OLBQA1/servlet/todo1servlets.OLBServlet";
    	String soapAction = "https://virtualesqa1.bancolombia.corp/OLBQA1/servlet/todo1servlets.OLBServlet";
    	
    	
        callSoapWebService(soapEndpointUrl, soapAction);
    }

    private static void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String myNamespace = "";
        String myNamespaceURI = " https://virtualesqa1.bancolombia.corp";

        // SOAP Envelope
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);

            /*
            Constructed SOAP Request Message:
            <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" xmlns:myNamespace="http://www.webserviceX.NET">
                <SOAP-ENV:Header/>
                <SOAP-ENV:Body>
                    <myNamespace:GetInfoByCity>
                        <myNamespace:USCity>New York</myNamespace:USCity>
                    </myNamespace:GetInfoByCity>
                </SOAP-ENV:Body>
            </SOAP-ENV:Envelope>
            */

        // SOAP Body
        SOAPBody soapBody = envelope.getBody();
        /*SOAPElement soapBodyElem = soapBody.addChildElement("GetInfoByCity", myNamespace);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("USCity", myNamespace);
        soapBodyElem1.addTextNode("New York");*/
        
        SOAPElement soapBodyElem = soapBody.addChildElement("AUTHRQ", myNamespace);
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("USERID", myNamespace);
        soapBodyElem1.addTextNode("8311552");
        
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("USERPASS", myNamespace);
        soapBodyElem2.addTextNode("2443");
        
               
        
        
        
    }

    private static void callSoapWebService(String soapEndpointUrl, String soapAction) {
        try {
            // Create SOAP Connection
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();

            // Send SOAP Message to SOAP Server
            SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

            // Print the SOAP Response
            System.out.println("Response SOAP Message:");
            soapResponse.writeTo(System.out);
            System.out.println();

            soapConnection.close();
        } catch (Exception e) {
            System.err.println("\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
            e.printStackTrace();
        }
    }

    private static SOAPMessage createSOAPRequest(String soapAction) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        createSoapEnvelope(soapMessage);

        MimeHeaders headers = soapMessage.getMimeHeaders(); 
        headers.addHeader("HEADERRQ", soapAction);
        
        

        soapMessage.saveChanges();

        /* Print the request message, just for debugging purposes */
        System.out.println("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println("\n");

        return soapMessage;
    }

}
