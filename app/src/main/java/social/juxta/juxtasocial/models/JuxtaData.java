package social.juxta.juxtasocial.models;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by Matt on 2/17/2016.
 */
public class JuxtaData {

    public static JuxtaSession CreateSession(String email, String password) //, Method callback)
    {
        JuxtaSession newSession = new JuxtaSession();
        Future<HttpResponse<JsonNode>> jsonNodeHttpResponse = Unirest.post("https://juxtaapi.azurewebsites.net/api/Session")
                // .header("Authorization", "Bearer " + token)  // For session token.
                .field("Email", email)
                .field("Password", password)
                .asJsonAsync(new Callback<JsonNode>() {

                    public void failed(UnirestException e) {
                        System.out.println("The request has failed");
                    }

                    public void completed(HttpResponse<JsonNode> response) {
                        int code = response.getStatus();
                        JsonNode body = response.getBody();
                        InputStream rawBody = response.getRawBody();
                    }

                    public void cancelled() {
                        System.out.println("The request has been cancelled");
                    }
                });

        return JuxtaSession.setCurrentSession(newSession);
    }
}
