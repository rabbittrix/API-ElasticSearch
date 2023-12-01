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
public class User {

    @Id
    private String id;
    private String url;
    private String externalid;
    private String name;
    private String alias;
    private String createdat;
    private Boolean active;
    private Boolean verified;
    private Boolean shared;
    private String locale;
    private String timezone;
    private String lastloginat;
    private String email;
    private String phone;
    private String signature;
    private String organizationid;
    private String[] tags;
    private Boolean suspended;
    private String role;
}
