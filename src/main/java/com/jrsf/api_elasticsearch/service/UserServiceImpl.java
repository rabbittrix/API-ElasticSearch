package com.jrsf.api_elasticsearch.service;

import com.jrsf.api_elasticsearch.entity.User;
import com.jrsf.api_elasticsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveAll(List<User> users) {
        userRepository.saveAll(users);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteAll() {
        userRepository.deleteAll();
        return true;
    }

    @Override
    public List<User> findByUrl(String url) {
        return userRepository.findByUrl(url);
    }

    @Override
    public List<User> findByExternalid(String external_id) {
        return userRepository.findByExternalid(external_id);
    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<User> findByAlias(String alias) {
        return userRepository.findByAlias(alias);
    }

    @Override
    public List<User> findByCreatedat(String created_at) {
        return userRepository.findByCreatedat(created_at);
    }

    @Override
    public List<User> findByActive(boolean active) {
        return userRepository.findByActive(active);
    }

    @Override
    public List<User> findByVerified(boolean verified) {
        return userRepository.findByVerified(verified);
    }

    @Override
    public List<User> findByShared(boolean shared) {
        return userRepository.findByShared(shared);
    }

    @Override
    public List<User> findByLocale(String locale) {
        return userRepository.findByLocale(locale);
    }

    @Override
    public List<User> findByTimezone(String timezone) {
        return userRepository.findByTimezone(timezone);
    }

    @Override
    public List<User> findByLastloginat(String lastloginat) {
        return userRepository.findByLastloginat(lastloginat);
    }

    @Override
    public List<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findByPhone(String phone) {
        return userRepository.findByPhone(phone);
    }

    @Override
    public List<User> findBySignature(String signature) {
        return userRepository.findBySignature(signature);
    }

    @Override
    public List<User> findByOrganizationid(int organizationid) {
        return userRepository.findByOrganizationid(organizationid);
    }

    @Override
    public List<User> findByTag(String tag) {
        return userRepository.findByTags(tag);
    }

    @Override
    public List<User> findBySuspended(String suspended) {
        return userRepository.findBySuspended(suspended);
    }

    @Override
    public List<User> findByRole(String role) {
        return userRepository.findByRole(role);
    }
}
