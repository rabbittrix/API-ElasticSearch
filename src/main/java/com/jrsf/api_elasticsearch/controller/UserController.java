package com.jrsf.api_elasticsearch.controller;

import com.jrsf.api_elasticsearch.entity.User;
import com.jrsf.api_elasticsearch.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "API REST User")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * Method to fetch all Users from the elastic-search.
     * @param
     * @return Iterable<User>
     */
    @GetMapping(value= "/getall")
    public Iterable<User> getAllUser(){
        return userService.findAll();
    }

    /**
     * Method to delete all Users from the elastic-search.
     * @param
     * @return boolean
     */
    @GetMapping("/deleteall")
    public boolean deleteAllUsers() {
        return userService.deleteAll();
    }

    /**
     * Method to fetch the User details on the basis of url.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyurl/{url}")
    public List<User> findByUrl(@PathVariable String url) {
        return userService.findByUrl(url);
    }

    /**
     * Method to fetch the User details on the basis of external_id.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyexternalid/{external_id}")
    public List<User> findByExternal_id(@PathVariable String external_id) {
        return userService.findByExternalid(external_id);
    }

    /**
     * Method to fetch the User details on the basis of name.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyname/{name}")
    public List<User> findByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    /**
     * Method to fetch the User details on the basis of alias.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyalias/{alias}")
    public List<User> findByAlias(@PathVariable String alias) {
        return userService.findByAlias(alias);
    }

    /**
     * Method to fetch the User details on the basis of created_at.
     * @param
     * @return boolean
     */
    @GetMapping("/findbycreated_at/{created_at}")
    public List<User> findByCreated_at(@PathVariable String created_at) {
        return userService.findByCreatedat(created_at);
    }

    /**
     * Method to fetch the User details on the basis of active.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyactive/{active}")
    public List<User> findByActive(@PathVariable boolean active) {
        return userService.findByActive(active);
    }

    /**
     * Method to fetch the User details on the basis of verified.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyverified/{verified}")
    public List<User> findByVerified(@PathVariable boolean verified) {
        return userService.findByVerified(verified);
    }

    /**
     * Method to fetch the User details on the basis of shared.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyshared/{shared}")
    public List<User> findByShared(@PathVariable boolean shared) {
        return userService.findByShared(shared);
    }

    /**
     * Method to fetch the User details on the basis of locale.
     * @param
     * @return boolean
     */
    @GetMapping("/findbylocale/{locale}")
    public List<User> findByLocale(@PathVariable String locale) {
        return userService.findByLocale(locale);
    }


    /**
     * Method to fetch the User details on the basis of timezone.
     * @param
     * @return boolean
     */
    @GetMapping("/findbytimezone/{timezone}")
    public List<User> findByTimezone(@PathVariable String timezone) {
        return userService.findByTimezone(timezone);
    }

    /**
     * Method to fetch the User details on the basis of lastloginat.
     * @param
     * @return boolean
     */
    @GetMapping("/findbylastloginat/{lastloginat}")
    public List<User> findByLastloginat(@PathVariable String lastloginat) {
        return userService.findByLastloginat(lastloginat);
    }

    /**
     * Method to fetch the User details on the basis of email.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyemail/{email}")
    public List<User> findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    /**
     * Method to fetch the User details on the basis of phone.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyphone/{phone}")
    public List<User> findByPhone(@PathVariable String phone) {
        return userService.findByPhone(phone);
    }

    /**
     * Method to fetch the User details on the basis of signature.
     * @param
     * @return boolean
     */
    @GetMapping("/findbysignature/{signature}")
    public List<User> findBySignature(@PathVariable String signature) {
        return userService.findBySignature(signature);
    }

    /**
     * Method to fetch the User details on the basis of signature.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyorganizationid/{organizationid}")
    public List<User> findByOrganizationid(@PathVariable int organizationid) {
        return userService.findByOrganizationid(organizationid);
    }

    /**
     * Method to fetch the User details on the basis of tags.
     * @param
     * @return boolean
     */
    @GetMapping("/findbytags/{tag}")
    public List<User> findByTag(@PathVariable String tag) {
        return userService.findByTag(tag);
    }

    /**
     * Method to fetch the User details on the basis of suspended.
     * @param
     * @return boolean
     */
    @GetMapping("/findbysuspended/{suspended}")
    public List<User> findBySuspended(@PathVariable String suspended) {
        return userService.findBySuspended(suspended);
    }

    /**
     * Method to fetch the User details on the basis of role.
     * @param
     * @return boolean
     */
    @GetMapping("/findbyrole/{role}")
    public List<User> findByRole(@PathVariable String role) {
        return userService.findByRole(role);
    }
}
