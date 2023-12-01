package com.jrsf.api_elasticsearch.component;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.jrsf.api_elasticsearch.entity.User;
import com.jrsf.api_elasticsearch.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserComponent {

    @Autowired
    UserService userServ;

    @PostConstruct
    @SuppressWarnings("deprecation")
    public void processUsers() throws JsonParseException, IOException {
        File file = new File("users.json");
        System.out.println(file.exists());
        if(file.exists()){
            JsonFactory factory = new MappingJsonFactory();
            factory.enable(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS);
            JsonParser jp = factory.createJsonParser(file);
            JsonToken current;
            current = jp.nextToken();
            if(current != JsonToken.START_ARRAY){
                System.out.println("Error!! Files is not an Array of JSON, Malformed File.");
            }
            while(jp.nextToken() != JsonToken.END_ARRAY) {
                JsonNode node = jp.readValueAsTree();
                String id = node.has("_id") ? "" + node.get("_id").intValue() : null;
                String url = node.has("url") ? node.get("url").textValue() : null;
                String externalid = node.has("external_id") ? node.get("external_id").textValue() : null;
                String name = node.has("name") ? node.get("name").textValue() : null;
                String alias = node.has("alias") ? node.get("alias").textValue() : null;
                String createdat = node.has("created_at") ? node.get("created_at").textValue() : null;
                Boolean active = node.has("active") ? node.get("active").booleanValue() : null;
                Boolean verified = node.has("verified") ? node.get("verified").booleanValue() : null;
                Boolean shared = node.has("shared") ? node.get("shared").booleanValue() : null;
                String locale = node.has("locale") ? node.get("locale").textValue() : null;
                String timezone = node.has("timezone") ? node.get("timezone").textValue() : null;
                String lastloginat = node.has("last_login_at") ? node.get("last_login_at").textValue() : null;
                String email = node.has("email") ? node.get("email").textValue() : null;
                String phone = node.has("phone") ? node.get("phone").textValue() : null;
                String signature = node.has("signature") ? node.get("signature").textValue() : null;
                String organizationid = node.has("organization_id") ? "" + node.get("organization_id").intValue() : null;
                JsonNode tagsArr = node.has("tags") ? node.get("tags") : null;
                List<String> tagsList = new ArrayList<>();
                if(null != tagsArr && tagsArr.isArray()){
                    for(JsonNode dom : tagsArr){
                        tagsList.add(dom.textValue());
                    }
                }
                String[] tag = tagsList.toArray(new String[tagsList.size()]);
                boolean suspended = node.has("suspended") ? node.get("suspended").booleanValue() : null;
                String role = node.has("role") ? node.get("role").textValue() : null;
                User usr = new User(id, url, externalid, name, alias, createdat, active, verified, shared, locale, timezone, lastloginat, email, phone, signature, organizationid, tag, suspended, role);
                userServ.save(usr);
            }
            System.out.println("Shoved all the data from User.json");
        }
    }
}
