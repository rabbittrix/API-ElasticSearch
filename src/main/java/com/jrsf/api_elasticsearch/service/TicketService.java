package com.jrsf.api_elasticsearch.service;

import com.jrsf.api_elasticsearch.entity.Ticket;

import java.util.List;

public interface TicketService {

    /**
     * Method to save the collection of Tickets in the elastic-search.
     * @param List<Ticket>
     * @return
     */
    public void saveAll(List<Ticket> tickets);

    /**
     * Method to save Single Object of Ticket in the elastic-search.
     * @param Ticket
     * @return Ticket
     */
    public Ticket save(Ticket ticket);

    /**
     * Method to fetch all Tickets from the elastic-search.
     * @param
     * @return Iterable<Ticket>
     */
    public Iterable<Ticket> findAll();

    /**
     * Method to fetch the employee details on the basis of designation.
     * @param designation
     * @return
     */

    /**
     * Method to delete all Ticket entries from elastic-search.
     * @param
     * @return boolean
     */
    public boolean deleteAll();

    public List<Ticket> findById(String id);

    public List<Ticket> findByUrl(String url);

    public List<Ticket> findByExternalid(String external_id);

    public List<Ticket> findByCreatedat(String created_at);

    public List<Ticket> findByType(String type);

    public List<Ticket> findBySubject(String subject);

    public List<Ticket> findByPriority(String priority);

    public List<Ticket> findByDescription(String description);

    public List<Ticket> findByStatus(String status);

    public List<Ticket> findBySubmitterid(String submitterid);

    public List<Ticket> findByAssigneeid(String assigneeid);

    public List<Ticket> findByOrganizationid(String organizationid);

    public List<Ticket> findByTag(String tag);

    public List<Ticket> findByHasincidents(boolean hasincidents);

    public List<Ticket> findByDueat(String dueat);

    public List<Ticket> findByVia(String via);
}
