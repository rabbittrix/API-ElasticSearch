package com.jrsf.api_elasticsearch.controller;

import com.jrsf.api_elasticsearch.entity.Organization;
import com.jrsf.api_elasticsearch.service.OrgService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "API REST Organization")
@RequestMapping("/api/org")
public class OrgController {

    @Autowired
    OrgService orgService;

    /**
     * Method to fetch all Organizations from the elastic-search.
     * @param
     * @return Iterable<Organization>
     */
    @GetMapping(value= "/getall")
    public Iterable<Organization> getAllOrganizations(){
        return orgService.findAll();
    }

    /**
     * Method to delete all Organizations from the elastic-search.
     * @param
     * @return boolean
     */
    @GetMapping("/deleteall")
    public boolean deleteAllOrganizations() {
        return orgService.deleteAll();
    }

    /**
     * Method to fetch the Organization details on the basis of url.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyurl/{url}")
    public List<Organization> findByUrl(@PathVariable String url) {
        return orgService.findByUrl(url);
    }

    /**
     * Method to fetch the Organization details on the basis of externalid.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyexternalid/{externalid}")
    public List<Organization> findByExternalid(@PathVariable String externalid) {
        return orgService.findByExternalid(externalid);
    }

    /**
     * Method to fetch the Organization details on the basis of name.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyname/{name}")
    public List<Organization> findByName(@PathVariable String name) {
        return orgService.findByName(name);
    }

    /**
     * Method to fetch the Organization details on the basis of domainnames.
     * @param
     * @return boolean
     */
    @GetMapping("/findbydomainnames/{domainnames}")
    public List<Organization> findByDomainnames(@PathVariable String domainnames) {
        return orgService.findByDomainnames(domainnames);
    }

    /**
     * Method to fetch the Organization details on the basis of createdat.
     * @param
     * @return boolean
     */
    @GetMapping("/findbycreatedat/{createdat}")
    public List<Organization> findByCreatedat(@PathVariable String createdat) {
        return orgService.findByCreatedat(createdat);
    }

    /**
     * Method to fetch the Organization details on the basis of details.
     * @param
     * @return boolean
     */
    @GetMapping("/findbydetails/{details}")
    public List<Organization> findByDetails(@PathVariable String details) {
        return orgService.findByDetails(details);
    }

    /**
     * Method to fetch the Organization details on the basis of sharedtickets.
     * @param
     * @return boolean
     */
    @GetMapping("/findbysharedtickets/{sharedtickets}")
    public List<Organization> findBySharedtickets(@PathVariable boolean sharedtickets) {
        return orgService.findBySharedtickets(sharedtickets);
    }

    /**
     * Method to fetch the Organization details on the basis of tags.
     * @param
     * @return boolean
     */
    @GetMapping("/findbytags/{tags}")
    public List<Organization> findByTags(@PathVariable String tags) {
        return orgService.findByTags(tags);
    }
}
