/*
 * 
 */
package dxmlparser;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author derwin
 */
public class DXMLParser extends DefaultHandler {
    
    private String filename;
    private Employee tempEmployee = new Employee();
    private List<Employee> employees = new ArrayList<>();
    private String elementContents = new String();
    
    public String getFilename() {
        return filename;
    }
    
    public List<Employee> getEmployees() {
        return employees;
    }
    
    public URI openFile (String filename) {
        this.filename = filename;
        File nf = new File(filename);
        return nf.toURI();
    }
    
    public void startElement(
            String uri, 
            String localname, 
            String qName, 
            Attributes attrs) {
        // So we start a new employee when we enter an "Employee" tag
        if(qName.equalsIgnoreCase("Employee")) {
        tempEmployee = new Employee();
        }
        // and we clear our elementContents whenever we enter any new tag
        elementContents = "";
    }
    
    @Override
    public void endElement(String uri, String localname, String qName) {
        String tag = qName.toLowerCase();
        switch(tag) {
        
            case "employee": // We're done here
                employees.add(tempEmployee);
                break;
                
            case "firstname": 
                tempEmployee.setFirstName(elementContents);
                break;
                
            case "lastname":
                tempEmployee.setLastName(elementContents);
                break;
            
            case "age":
                tempEmployee.setAge(Integer.parseInt(elementContents));
                break;
                
            case "salary":
                tempEmployee.setSalary(Integer.parseInt(elementContents));
                break;
                
        }
        
        }
    
    public void characters(char[] buffer, int start, int length) {
        elementContents = new String(buffer, start, length);

    }    
}
