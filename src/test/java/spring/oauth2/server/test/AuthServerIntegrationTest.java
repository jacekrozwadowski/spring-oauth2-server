package spring.oauth2.server.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import spring.oauth2.server.config.AuthorizationServerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuthorizationServerApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class AuthServerIntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {

    }
}
