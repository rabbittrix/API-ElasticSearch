package com.jrsf.api_elasticsearch.component;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.jrsf.api_elasticsearch.entity.Ticket;
import com.jrsf.api_elasticsearch.service.TicketService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TicketComponent {

    @Autowired
    TicketService tcktSrv;

    @PostConstruct
    @SuppressWarnings("deprecation")
    public void processTickets() throws JsonParseException, IOException {
        File file = new File("tickets.json");
        if(file.exists()){
            JsonFactory factory = new MappingJsonFactory();
            factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
            JsonParser jp = factory.createJsonParser(file);
            JsonToken current;
            current = jp.nextToken();
            if(current != JsonToken.START_ARRAY){
                System.out.println("Error!! Not even Start of Array!!");
            }
            while(jp.nextToken() != JsonToken.END_ARRAY && jp.nextToken() != null) {
                JsonNode node = jp.readValueAsTree();
                String id = node.has("_id") ? node.get("_id").textValue():null;
                String url = node.has("url") ? node.get("url").textValue():null;
                String externalid = node.has("external_id") ? node.get("external_id").textValue() : null;
                String createdat = node.has("created_at") ? node.get("created_at").textValue() : null;
                String type = node.has("type") ? node.get("type").textValue():null;
                String subject = node.has("subject") ? node.get("subject").textValue() : null;
                String description = node.has("description") ? node.get("description").textValue() : null;
                String priority = node.has("priority") ? node.get("priority").textValue() : null;
                String status = node.has("status") ? node.get("status").textValue() : null;
                String submitterid = node.has("submitter_id") ? "" + node.get("submitter_id").intValue() : null;
                String assigneeid = node.has("assignee_id") ? "" + node.get("assignee_id").intValue() : null;
                String organizationid = node.has("organization_id") ? "" + node.get("organization_id").intValue() : null;
                JsonNode tagsArr = node.has("tags") ? node.get("tags") : null;
                List<String> tagsList = new ArrayList<>();
                if(null != tagsArr && tagsArr.isArray()){
                    for(JsonNode dom : tagsArr){
                        tagsList.add(dom.textValue());
                    }
                }
                String[] tag = tagsList.toArray(new String[tagsList.size()]);
                Boolean hasincidents = node.has("has_incidents") ? node.get("has_incidents").booleanValue() : null;
                String dueat = node.has("due_at") ? node.get("due_at").textValue() : null;
                String via = node.has("via") ? node.get("via").textValue() : null;
                Ticket tckt = new Ticket(id, url, externalid, createdat, type, subject, description, priority, status, submitterid, assigneeid, organizationid, tag, hasincidents, dueat, via);
                tcktSrv.save(tckt);

            }
            System.out.println("Shoved everything for Ticket json");
        }
    }
}
