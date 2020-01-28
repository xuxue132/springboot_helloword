package com.example.springboothelloword.Controller;

import com.example.springboothelloword.bean.Person;
import com.example.springboothelloword.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ymlcontroller {
    @Autowired
    User user;

    @Autowired
    Person person;

    @Value("${user.lastName}")
    String lastName;

    @RequestMapping("/ym2")
    @ResponseBody
    public Person yml2Test(){
//        System.out.println("lastName: "+lastName);
//        System.out.println("person: "+person);
        return person;
    }

    @RequestMapping("/yml")
    @ResponseBody
    public User ymlTest(){
//        System.out.println("lastName: "+lastName);
//        System.out.println("person: "+person);
        return user;
    }
}
