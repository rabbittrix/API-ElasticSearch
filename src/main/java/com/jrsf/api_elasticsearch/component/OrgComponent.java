package com.jrsf.api_elasticsearch.component;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.jrsf.api_elasticsearch.entity.Organization;
import com.jrsf.api_elasticsearch.service.OrgService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class OrgComponent {

    @Autowired
    OrgService orgService;

    @PostConstruct
    @SuppressWarnings("deprecation")
    public void processOrganizations() throws Exception{

        File file = new File("organizations.json");
        if(file.exists()){
            JsonFactory factory = new MappingJsonFactory();
            factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
            JsonParser jp = factory.createJsonParser(file);
            JsonToken current;
            current = jp.nextToken();
            if(current != JsonToken.START_ARRAY){
                System.out.println("Error!! Not even Start of Array!!");
            }
            while(jp.nextToken() != JsonToken.END_ARRAY) {
                JsonNode node = jp.readValueAsTree();
                String id = node.has("_id") ? "" + node.get("_id").intValue() : null;
                String url = node.has("url") ? node.get("url").textValue() : null;
                String externalid = node.has("external_id") ? node.get("external_id").textValue() : null;
                String name = node.has("name") ? node.get("name").textValue() : null;
                JsonNode domainArr = node.has("domain_names") ? node.get("domain_names") : null;
                List<String> domainList = new ArrayList<>();
                if(null != domainArr && domainArr.isArray()){
                    for(JsonNode dom : domainArr){
                        domainList.add(dom.textValue());
                    }
                }
                String[] domains = domainList.toArray(new String[domainList.size()]);
                String createdat = node.has("created_at") ? node.get("created_at").textValue() : null;
                String details = node.has("details") ? node.get("details").textValue() : null;
                Boolean sharedticket = node.has("shared_tickets") ? node.get("shared_tickets").booleanValue() : null;
                JsonNode tagsArr = node.has("tags") ? node.get("tags") : null;
                List<String> tagsList = new ArrayList<>();
                if(null != tagsArr && tagsArr.isArray()){
                    for(JsonNode dom : tagsArr){
                        tagsList.add(dom.textValue());
                    }
                }
                String[] tag = tagsList.toArray(new String[tagsList.size()]);

                Organization orgObj = new Organization(id, url, externalid, name, domains, createdat, details, sharedticket, tag);
                orgService.save(orgObj);
            }
            System.out.println("Shoved everything for Organisation Json");
        }
    }
}
