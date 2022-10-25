package com.creational.create;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createFormat(){
        BookMetadataFormatter formatter;
       try {
           formatter = new XMLBookMetadataFormatter();
       } catch (ParserConfigurationException ex) {
           System.out.println("XML ERROR");
           formatter = new JSONBookMetadataFormatter();
       }
       return formatter;
    }
}
