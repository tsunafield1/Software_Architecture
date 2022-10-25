package com.creational.create;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {
   @Override
   public BookMetadataFormatter createFormat(){
       BookMetadataFormatter formatter;
       try {
           formatter = new CSVBookMetadataFormatter();
       } catch (IOException ex) {
           System.out.println("CSV ERROR");
           formatter = new JSONBookMetadataFormatter();
       }
       return formatter;
  }
}
