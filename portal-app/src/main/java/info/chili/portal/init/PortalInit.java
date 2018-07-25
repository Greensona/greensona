/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.chili.portal.init;

import info.chili.portal.dao.ApplicationRoleRepository;
import info.chili.portal.dao.ApplicationUserRepository;
import info.chili.portal.entity.ApplicationRole;
import info.chili.portal.entity.ApplicationUser;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;

/**
 *
 * @author k26758
 */
@Controller
public class PortalInit implements ApplicationRunner {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Autowired
    ApplicationRoleRepository applicationRoleRepository;

    @Autowired
    protected BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Set<ApplicationRole> roles = new HashSet();
        roles.add(applicationRoleRepository.save(ApplicationRole.builder().roleName("ROLE_USER").build()));
        roles.add(applicationRoleRepository.save(ApplicationRole.builder().roleName("ROLE_ADMIN").build()));
        applicationUserRepository.save(ApplicationUser.builder().username("admin").password(bCryptPasswordEncoder.encode("password")).build());
    }

}
