import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XMLDomCreate {

    private Document domDocumentToWrite;

    public void createXMLDomcreate(String xmlFile, String xslFile, String htmlFile) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);

        String prefix = "http://www.i.ua/Tariff";

        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            domDocumentToWrite = documentBuilder.newDocument();
            domDocumentToWrite.setXmlVersion("1.0");
            domDocumentToWrite.setXmlStandalone(true);

            Element rootElement = domDocumentToWrite.createElement("tns:Tariff");
            rootElement.setAttribute("xmlns:tns", prefix);
            domDocumentToWrite.appendChild(rootElement);
            rootElement.setTextContent("\n");

            Element tarifName = domDocumentToWrite.createElement("name");
            tarifName.setTextContent("Light");
            rootElement.appendChild(tarifName);

            Element operator = domDocumentToWrite.createElement("operator");
            operator.setTextContent("Life");
            rootElement.appendChild(operator);

            Element payrol = domDocumentToWrite.createElement("payrol");
            payrol.setTextContent("50");
            rootElement.appendChild(payrol);

            Element callPrices = domDocumentToWrite.createElement("callPrices");
            rootElement.appendChild(callPrices);

            Element sms = domDocumentToWrite.createElement("sms");
            sms.setTextContent("1.5");
            rootElement.appendChild(sms);

            Element parameters = domDocumentToWrite.createElement("parameters");
            rootElement.appendChild(parameters);

            //------------------------------

            Element typeCallPrices = domDocumentToWrite.createElement("typeCallPrices");
            typeCallPrices.setAttribute("inside", "10");
            callPrices.appendChild(typeCallPrices);



            Element intSimple = domDocumentToWrite.createElement("intSimple");
            intSimple.setTextContent("10");
            rootElement.appendChild(intSimple);





        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
