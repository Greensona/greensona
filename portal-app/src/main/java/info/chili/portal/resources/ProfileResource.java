/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.chili.portal.resources;

import info.chili.portal.dao.ApplicationUserRepository;
import info.chili.portal.entity.ApplicationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author phani
 */
@RestController
@Scope("request")
public class ProfileResource {

    public static final String ROOT_URI = "/profile";

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @PostMapping(ROOT_URI)
    public ApplicationUser save(@RequestBody @Validated ApplicationUser user) {
        //TODO set user role to default user
        //TODO username unique
        return applicationUserRepository.save(user);
    }
}
