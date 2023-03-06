package com.example.patterns.CreationalPatterns.BuilderPattern.UsingBuilderAnnotation;

import lombok.*;


//let this is the entity class
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SecondExample {
    private Integer requestId;
    private String uuid;

    private String clientId;

    private String extractionEngine;

    private String documentId;

    private String documentName;

    /*

    make following method for populate the request metadata in the case when a request come from client or any user,
    and you can do it wherever you want to create object but this is for the sake of simplicity or easiness you should make this
    method.

    public static SecondExample populateX(String uuid,String clientId,String documentName,ApiRequest request){
        return  SecondExample.builder().clientId(clientId).uuid(uuid).documentName(documentName).extractEngine(request.getEngine()).build();
    }

     */

}
