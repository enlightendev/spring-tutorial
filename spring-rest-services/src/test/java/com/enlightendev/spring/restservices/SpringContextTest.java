package com.enlightendev.spring.restservices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Main.class)

//this is needed if any of the @Configuration annotated classes contains @EnableWebMvc
@WebAppConfiguration
public class SpringContextTest {

    @Autowired
    private WebApplicationContext context;

    @Test
    public void testContextLoads() throws Exception {
        assertNotNull(this.context);
        assertTrue(this.context.containsBean("tradeLogServiceImpl"));
        assertTrue(this.context.containsBean("main"));
    }

}
