package spring.oauth2.server.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class TokenRevocationLiveTest {

    private String refreshToken;

    private String obtainAccessToken(String clientId, String username, String password) {
        final Map<String, String> params = new HashMap<String, String>();
        params.put("grant_type", "password");
        params.put("client_id", clientId);
        params.put("username", username);
        params.put("password", password);
        final Response response = RestAssured.given().auth().preemptive().basic(clientId, "secret").and().with().params(params).when().post("http://localhost:8081/spring-oauth2-server/oauth/token");
        refreshToken = response.jsonPath().getString("refresh_token");
        return response.jsonPath().getString("access_token");
    }

    private String obtainRefreshToken(String clientId) {
        final Map<String, String> params = new HashMap<String, String>();
        params.put("grant_type", "refresh_token");
        params.put("client_id", clientId);
        params.put("refresh_token", refreshToken);
        final Response response = RestAssured.given().auth().preemptive().basic(clientId, "secret").and().with().params(params).when().post("http://localhost:8081/spring-oauth2-server/oauth/token");
        return response.jsonPath().getString("access_token");
    }

    private void authorizeClient(String clientId) {
        final Map<String, String> params = new HashMap<String, String>();
        params.put("response_type", "code");
        params.put("client_id", clientId);
        params.put("scope", "read,write");
        final Response response = RestAssured.given().auth().preemptive().basic(clientId, "secret").and().with().params(params).when().post("http://localhost:8081/spring-oauth2-server/oauth/authorize");
    }

    @Test
    public void givenDBUser_whenRevokeToken_thenAuthorized() {
        final String accessToken = obtainAccessToken("prodClientIdPassword", "john", "123");
        assertNotNull(accessToken);
    }

}