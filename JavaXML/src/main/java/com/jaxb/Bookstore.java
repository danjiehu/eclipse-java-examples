package com.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@XMLRootElement provides naming and data-type details about the root XML element, 
//which is the topmost, most inclusive element in the XML string. 
@XmlRootElement(name = "bookStore")
@XmlType(propOrder = { "name", "location", "bookList" })

public class Bookstore{

   
    private List<Book> bookList;
    
    private String location;
   
    private String name;
    
    // XmlElement sets the name of the entities
    @XmlElement(name = "book")
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    
    public List<Book> getBookList() {
        return bookList;
    }

    public String getName() {
        return name;
    }
    
    @XmlElement(name = "storeName")
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    @XmlElement(name = "storeLocation")
    public void setLocation(String location) {
        this.location = location;
    }
}