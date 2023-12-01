package com.jrsf.api_elasticsearch.service;

import com.jrsf.api_elasticsearch.entity.Ticket;
import com.jrsf.api_elasticsearch.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public void saveAll(List<Ticket> tickets) {
        ticketRepository.saveAll(tickets);
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Iterable<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public boolean deleteAll() {
        ticketRepository.deleteAll();
        return true;
    }

//	@Override
//	public List<Ticket> findById(String id) {
//		return ticketRepository.findById(id);
//	}

    @Override
    public List<Ticket> findByUrl(String url) {
        return ticketRepository.findByUrl(url);
    }

    @Override
    public List<Ticket> findByExternalid(String external_id) {
        return ticketRepository.findByExternalid(external_id);
    }

    @Override
    public List<Ticket> findByCreatedat(String created_at) {
        return ticketRepository.findByCreatedat(created_at);
    }

    @Override
    public List<Ticket> findByType(String type) {
        return ticketRepository.findByType(type);
    }

    @Override
    public List<Ticket> findBySubject(String subject) {
        return ticketRepository.findBySubject(subject);
    }

    @Override
    public List<Ticket> findByPriority(String priority) {
        return ticketRepository.findByPriority(priority);
    }

    @Override
    public List<Ticket> findByDescription(String description) {
        return ticketRepository.findByDescription(description);
    }

    @Override
    public List<Ticket> findByStatus(String status) {
        return ticketRepository.findByStatus(status);
    }

    @Override
    public List<Ticket> findBySubmitterid(String submitterid) {
        return ticketRepository.findBySubmitterid(submitterid);
    }

    @Override
    public List<Ticket> findByAssigneeid(String assigneeid) {
        return ticketRepository.findByAssigneeid(assigneeid);
    }

    @Override
    public List<Ticket> findByOrganizationid(String organizationid) {
        return ticketRepository.findByOrganizationid(organizationid);
    }

    @Override
    public List<Ticket> findByTag(String tag) {
        return ticketRepository.findByTags(tag);
    }

    @Override
    public List<Ticket> findByHasincidents(boolean hasincidents) {
        return ticketRepository.findByHasincidents(hasincidents);
    }

    @Override
    public List<Ticket> findByDueat(String dueat) {
        return ticketRepository.findByDueat(dueat);
    }

    @Override
    public List<Ticket> findByVia(String via) {
        return ticketRepository.findByVia(via);
    }

    @Override
    public List<Ticket> findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }
}
