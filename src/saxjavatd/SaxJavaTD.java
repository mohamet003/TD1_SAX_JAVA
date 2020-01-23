/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxjavatd;


import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author mkone03
 */
public class SaxJavaTD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        // TODO code application logic here
        
        SAXParserFactory factory = SAXParserFactory.newInstance();
        
        SAXParser saxParser = factory.newSAXParser();
        
        File f = new File("file.xml");
         
        saxParser.parse(f, new NewClass());

        
        
    }
    
}
