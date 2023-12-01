package com.jrsf.api_elasticsearch.repository;

import com.jrsf.api_elasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

    List<User> findByUrl(String url);

    List<User> findByExternalid(String externalid);

    List<User> findByName(String name);

    List<User> findByAlias(String alias);

    List<User> findByCreatedat(String created_at);

    List<User> findByActive(boolean active);

    List<User> findByVerified(boolean verified);

    List<User> findByShared(boolean shared);

    List<User> findByLocale(String locale);

    List<User> findByTimezone(String timezone);

    List<User> findByLastloginat(String lastloginat);

    List<User> findByEmail(String email);

    List<User> findByPhone(String phone);

    List<User> findBySignature(String signature);

    List<User> findByOrganizationid(int organizationid);

    List<User> findByTags(String tag);

    List<User> findBySuspended(String suspended);

    List<User> findByRole(String role);
}
