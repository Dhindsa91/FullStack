package com.devopsbuddy.integration;


import com.devopsbuddy.backend.persistence.domain.backend.Plan;
import com.devopsbuddy.backend.persistence.domain.backend.Role;
import com.devopsbuddy.backend.persistence.domain.backend.User;
import com.devopsbuddy.backend.persistence.domain.backend.UserRole;
import com.devopsbuddy.backend.persistence.repositories.PlanRepository;
import com.devopsbuddy.backend.persistence.repositories.RoleRepository;
import com.devopsbuddy.backend.persistence.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RepositoriesIntegrationTest {



    @Autowired
    private PlanRepository planRepository;


    @Autowired
    private RoleRepository roleRepository;


    @Autowired
    private UserRepository userRepository;

    private static final int BASIC_PLAN_ID = 1;
    private static final int BASIC_ROLE_ID= 1;


    @Before
    public void init(){
        Assert.assertNotNull(planRepository);
        Assert.assertNotNull(roleRepository);
        Assert.assertNotNull(userRepository);
    }


    @Test
    public void testCreateNewPlan() throws Exception{

        Plan basicPlan = createBasicPlan();
        planRepository.save(basicPlan);
        Plan retrievedPlan = planRepository.findOne(BASIC_PLAN_ID);
        Assert.assertNotNull(retrievedPlan);


    }


    @Test
    public void testCreateNewRole(){

        Role userRole = createBasicRole();
        roleRepository.save(userRole);

        Role retrievedRole = roleRepository.findOne(BASIC_ROLE_ID);
        Assert.assertNotNull(retrievedRole);


    }





    private Plan createBasicPlan(){
        Plan plan = new Plan();
        plan.setId(BASIC_PLAN_ID);
        plan.setName("Basic");
        return plan;
    }

    private Role createBasicRole(){
        Role role = new Role();
        role.setId(BASIC_ROLE_ID);
        role.setName("ROLE_USER");
        return role;

    }

//    private User createBasicUser(){
//        User user = new User();
//        user.setUsername("basicUser");
//        user.setPassword("secret");
//        user.setEmail("arvind@hotmail.com");
//        user.setFirstName("arvind");
//        user.setLastName("dhindsa");
//        user.setPhoneNumber("1234456789");
//        user.setCountry("CAN");
//        user.setEnabled(true);
//        user.setDescription("A basic user");
//        user.setProfileImageUrl("test.com/profileimg");
//
//        return user;
//
//    }


}
