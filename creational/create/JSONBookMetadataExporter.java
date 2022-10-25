package com.creational.create;

public class JSONBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createFormat(){
       return new JSONBookMetadataFormatter();
    }
}
