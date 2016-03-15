/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dxmlparser;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author derwin
 */
public class Main {
    public static void main(String[] args) {

        SAXParserFactory spf = SAXParserFactory.newInstance();
        DXMLParser handler = new DXMLParser();
        
        try {
            SAXParser saxParser = spf.newSAXParser();
            saxParser.parse(new File("data.xml"),(DefaultHandler) handler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        for (Employee e : handler.getEmployees()) {
            System.out.println(e.toString() + "\n");
        }

    }    
}
