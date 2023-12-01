package com.jrsf.api_elasticsearch.controller;

import com.jrsf.api_elasticsearch.entity.Ticket;
import com.jrsf.api_elasticsearch.service.TicketService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@Api(value = "API REST Ticket")
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    /**
     * Method to fetch all Tickets from the elastic-search.
     * @param
     * @return Iterable<Ticket>
     */
    @GetMapping(value= "/getall")
    public Iterable<Ticket> getAllTickets(){
        return ticketService.findAll();
    }

    /**
     * Method to delete all Tickets from the elastic-search.
     * @param
     * @return boolean
     */
    @GetMapping("/deleteall")
    public boolean deleteAllTickets() {
        return ticketService.deleteAll();
    }

    /**
     * Method to fetch the Ticket details on the basis of id.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyid/{id}")
    public List<Ticket> findById(@PathVariable String id) {
        return ticketService.findById(id);
    }

    /**
     * Method to fetch the Ticket details on the basis of url.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyurl/{url}")
    public List<Ticket> findByUrl(@PathVariable String url) {
        return ticketService.findByUrl(url);
    }

    /**
     * Method to fetch the Ticket details on the basis of external_id.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyexternalid/{external_id}")
    public List<Ticket> findByExternal_id(@PathVariable String external_id) {
        return ticketService.findByExternalid(external_id);
    }

    /**
     * Method to fetch the Ticket details on the basis of created_at.
     * @param
     * @return boolean
     */
    @GetMapping("/findbycreated_at/{created_at}")
    public List<Ticket> findByCreated_at(@PathVariable String created_at) {
        return ticketService.findByCreatedat(created_at);
    }

    /**
     * Method to fetch the Ticket details on the basis of type.
     * @param
     * @return boolean
     */
    @GetMapping("/findbytype/{type}")
    public List<Ticket> findByType(@PathVariable String type) {
        return ticketService.findByType(type);
    }

    /**
     * Method to fetch the Ticket details on the basis of subject.
     * @param
     * @return boolean
     */
    @GetMapping("/findbysubject/{subject}")
    public List<Ticket> findBySubject(@PathVariable String subject) {
        return ticketService.findBySubject(subject);
    }

    /**
     * Method to fetch the Ticket details on the basis of description.
     * @param
     * @return boolean
     */
    @GetMapping("/findbydescription/{description}")
    public List<Ticket> findByDescription(@PathVariable String description) {
        return ticketService.findByDescription(description);
    }

    /**
     * Method to fetch the Ticket details on the basis of priority.
     * @param
     * @return boolean
     */
    @GetMapping("/findbypriority/{priority}")
    public List<Ticket> findByPriority(@PathVariable String priority) {
        return ticketService.findByPriority(priority);
    }

    /**
     * Method to fetch the Ticket details on the basis of status.
     * @param
     * @return boolean
     */
    @GetMapping("/findbystatus/{status}")
    public List<Ticket> findByStatus(@PathVariable String status) {
        return ticketService.findByStatus(status);
    }

    /**
     * Method to fetch the Ticket details on the basis of submitterid.
     * @param
     * @return boolean
     */
    @GetMapping("/findbysubmitterid/{submitterid}")
    public List<Ticket> findBySubmitterid(@PathVariable String submitterid) {
        return ticketService.findBySubmitterid(submitterid);
    }

    /**
     * Method to fetch the Ticket details on the basis of assigneeid.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyassigneeid/{assigneeid}")
    public List<Ticket> findByAssigneeid(@PathVariable String assigneeid) {
        return ticketService.findByAssigneeid(assigneeid);
    }

    /**
     * Method to fetch the Ticket details on the basis of organizationid.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyorganizationid/{organizationid}")
    public List<Ticket> findByOrganizationid(@PathVariable String organizationid) {
        return ticketService.findByOrganizationid(organizationid);
    }

    /**
     * Method to fetch the Ticket details on the basis of tags.
     * @param
     * @return boolean
     */
    @GetMapping("/findbytags/{tag}")
    public List<Ticket> findByTag(@PathVariable String tag) {
        return ticketService.findByTag(tag);
    }

    /**
     * Method to fetch the Ticket details on the basis of hasincidents.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyhasincidents/{hasincidents}")
    public List<Ticket> findByHasincidents(@PathVariable boolean hasincidents) {
        return ticketService.findByHasincidents(hasincidents);
    }

    /**
     * Method to fetch the Ticket details on the basis of dueat.
     * @param
     * @return boolean
     */
    @GetMapping("/findbydueat/{dueat}")
    public List<Ticket> findByDueat(@PathVariable String dueat) {
        return ticketService.findByDueat(dueat);
    }

    /**
     * Method to fetch the Ticket details on the basis of via.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyvia/{via}")
    public List<Ticket> findByVia(@PathVariable String via) {
        return ticketService.findByVia(via);
    }
}
