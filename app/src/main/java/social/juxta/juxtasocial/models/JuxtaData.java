package social.juxta.juxtasocial.models;

/**
 * Created by Matt on 2/17/2016.
 */
public class JuxtaData {

    private static JuxtaSession CreateSession(String Email, String Password)
    {
        JuxtaSession newSession = new JuxtaSession();

        return JuxtaSession.setCurrentSession(newSession);
    }
}
