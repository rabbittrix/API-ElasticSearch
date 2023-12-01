package com.jrsf.api_elasticsearch.service;

import com.jrsf.api_elasticsearch.entity.Organization;
import com.jrsf.api_elasticsearch.repository.OrgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    OrgRepository orgRepository;

    @Override
    public void saveAll(List<Organization> orgs) {
        orgRepository.saveAll(orgs);
    }

    @Override
    public Organization save(Organization org) {
        return orgRepository.save(org);
    }

    @Override
    public Iterable<Organization> findAll() {
        return orgRepository.findAll();
    }

    @Override
    public boolean deleteAll() {
        try {
            orgRepository.deleteAll();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public List<Organization> findByUrl(String url) {
        return orgRepository.findByUrl(url);
    }

    @Override
    public List<Organization> findByExternalid(String externalid) {
        return orgRepository.findByExternalid(externalid);
    }

    @Override
    public List<Organization> findByName(String name) {
        return orgRepository.findByName(name);
    }

    @Override
    public List<Organization> findByDomainnames(String domainnames) {
        return orgRepository.findByDomainnames(domainnames);
    }

    @Override
    public List<Organization> findByCreatedat(String createdat) {
        return orgRepository.findByCreatedat(createdat);
    }

    @Override
    public List<Organization> findByDetails(String details) {
        return orgRepository.findByDetails(details);
    }

    @Override
    public List<Organization> findBySharedtickets(boolean sharedtickets) {
        return orgRepository.findBySharedtickets(sharedtickets);
    }

    @Override
    public List<Organization> findByTags(String tags) {
        return orgRepository.findByTags(tags);
    }
}
