package XMLPrueba;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLHandler {
    public static void escribirXML() {
        XMLOutputFactory writerfactory = XMLOutputFactory.newInstance();
        try {
            XMLStreamWriter writer = writerfactory.createXMLStreamWriter(new FileOutputStream("prueba.xml"));
            writer.writeStartDocument("1.0");
            writer.writeStartElement("autores");
            writer.writeStartElement("autor");
            writer.writeAttribute("codigo","a1");
            writer.writeStartElement("nombre");
            writer.writeCharacters("Alexandre Dumas");
            writer.writeEndElement();
            writer.writeStartElement("titulo");
            writer.writeCharacters("El conde de montecristo");
            writer.writeEndElement();
            writer.writeStartElement("titulo");
            writer.writeCharacters("Los miserables");
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeStartElement("autor");
            writer.writeAttribute("codigo","a2");
            writer.writeStartElement("nombre");
            writer.writeCharacters("Fiodor Dostoyevski");
            writer.writeEndElement();
            writer.writeStartElement("titulo");
            writer.writeCharacters("El idiota");
            writer.writeEndElement();
            writer.writeStartElement("titulo");
            writer.writeCharacters("Noches blancas");
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndElement();
            writer.close();
        }catch(IOException e){
            System.out.println("Error al abrir el archivo");
        }catch (XMLStreamException e2){
            System.out.println("Error al abrir el archivo XML");
        }
    }
}
