package com.jrsf.api_elasticsearch.repository;

import com.jrsf.api_elasticsearch.entity.Ticket;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends ElasticsearchRepository<Ticket, String> {

    List<Ticket> findByUrl(String url);

    List<Ticket> findByExternalid(String external_id);

    List<Ticket> findByCreatedat(String created_at);

    List<Ticket> findByType(String type);

    List<Ticket> findBySubject(String subject);

    List<Ticket> findByPriority(String priority);

    List<Ticket> findByDescription(String description);

    List<Ticket> findByStatus(String status);

    List<Ticket> findBySubmitterid(String submitterid);

    List<Ticket> findByAssigneeid(String assigneeid);

    List<Ticket> findByOrganizationid(String organizationid);

    List<Ticket> findByTags(String tag);

    List<Ticket> findByHasincidents(boolean hasincidents);

    List<Ticket> findByDueat(String dueat);

    List<Ticket> findByVia(String via);
}
