package com.jrsf.api_elasticsearch.service;

import com.jrsf.api_elasticsearch.entity.User;

import java.util.List;

public interface UserService {

    /**
     * Method to save the collection of Users in the elastic-search.
     * @param List<User>
     * @return
     */
    public void saveAll(List<User> users);

    /**
     * Method to save Single Object of User in the elastic-search.
     * @param User
     * @return User
     */
    public User save(User user);

    /**
     * Method to fetch all Users from the elastic-search.
     * @param
     * @return Iterable<User>
     */
    public Iterable<User> findAll();

    /**
     * Method to delete all User entries from elastic-search.
     * @param
     * @return boolean
     */
    public boolean deleteAll();

    /**
     * Method to fetch the User details on the basis of url.
     * @param url
     * @return
     */
    public List<User> findByUrl(String url);

    /**
     * Method to fetch the User details on the basis of external_id.
     * @param external_id
     * @return
     */
    public List<User> findByExternalid(String external_id);

    /**
     * Method to fetch the User details on the basis of name.
     * @param name
     * @return
     */
    public List<User> findByName(String name);

    public List<User> findByAlias(String alias);

    public List<User> findByCreatedat(String created_at);

    public List<User> findByActive(boolean active);

    public List<User> findByVerified(boolean verified);

    public List<User> findByShared(boolean shared);

    public List<User> findByLocale(String locale);

    public List<User> findByTimezone(String timezone);

    public List<User> findByLastloginat(String lastloginat);

    public List<User> findByEmail(String email);

    public List<User> findByPhone(String phone);

    public List<User> findBySignature(String signature);

    public List<User> findByOrganizationid(int organizationid);

    public List<User> findByTag(String tag);

    public List<User> findBySuspended(String suspended);

    public List<User> findByRole(String role);
}
