package com.jrsf.api_elasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "orgvicarius")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {

    @Id
    private String id;
    private String url;
    private String externalid;
    private String name;
    private String[] domainnames;
    private String createdat;
    private String details;
    private boolean sharedtickets;
    private String[] tags;

}
