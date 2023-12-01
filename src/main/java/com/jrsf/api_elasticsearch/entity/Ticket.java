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
public class Ticket {

    @Id
    private String id;
    private String url;
    private String externalid;
    private String createdat;
    private String type;
    private String subject;
    private String description;
    private String priority;
    private String status;
    private String submitterid;
    private String assigneeid;
    private String organizationid;
    private String[] tags;
    private Boolean hasincidents;
    private String dueat;
    private String via;
}
