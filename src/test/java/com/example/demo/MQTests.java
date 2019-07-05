package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.service.FanoutSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MQTests {

    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFanout() throws Exception {
        User user=new User();
        user.setId("1");
        user.setName("pwl");
        fanoutSender.send(user);
    }

}
