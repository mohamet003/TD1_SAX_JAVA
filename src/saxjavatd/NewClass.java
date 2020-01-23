/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saxjavatd;


import java.util.*;
import javax.xml.parsers.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author mkone03
 */
public class NewClass extends DefaultHandler {
    
    List<String> jours = new ArrayList<>();
   
    @Override
    public void startElement(String sn, String ln, String qn, Attributes atrbts) throws SAXException {
 
        if (jours.contains(qn)) {
            System.out.print("<"+qn);
            for (int i = 0; i < atrbts.getLength(); i++) {
                System.out.print(atrbts.getQName(i)+" = "+ "'"+ atrbts.getValue(i)+"'");
            }      
        }
         if (qn.equals("cr")) {
             
         }
        
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.print(new String(ch,start,length));
        //super.characters(ch, start, length); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.print("</"+qName+">");
        //super.endElement(uri, localName, qName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void endDocument() throws SAXException {
        //super.endDocument(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    
    
}
