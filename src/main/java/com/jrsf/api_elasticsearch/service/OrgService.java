package com.jrsf.api_elasticsearch.service;

import com.jrsf.api_elasticsearch.entity.Organization;

import java.util.List;

public interface OrgService {

    /**
     * Method to save the collection of Organizations in the elastic-search.
     * @param List<Organization>
     * @return
     */
    public void saveAll(List<Organization> orgs);

    /**
     * Method to save Single Object of Organization in the elastic-search.
     * @param Organization
     * @return Organization
     */
    public Organization save(Organization org);

    /**
     * Method to fetch all Organization from the elastic-search.
     * @param
     * @return Iterable<Organization>
     */
    public Iterable<Organization> findAll();

    /**
     * Method to fetch the employee details on the basis of designation.
     * @param designation
     * @return
     */

    /**
     * Method to delete all Organization entries from elastic-search.
     * @param
     * @return boolean
     */
    public boolean deleteAll();

    public List<Organization> findByUrl(String url);

    public List<Organization> findByExternalid(String externalid);

    public List<Organization> findByName(String name);

    public List<Organization> findByDomainnames(String domainnames);

    public List<Organization> findByCreatedat(String createdat);

    public List<Organization> findByDetails(String details);

    public List<Organization> findBySharedtickets(boolean sharedtickets);

    public List<Organization> findByTags(String tags);
}
