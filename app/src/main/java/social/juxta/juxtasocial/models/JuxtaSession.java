package social.juxta.juxtasocial.models;

/**
 * Created by Matt on 2/17/2016.
 */
public class JuxtaSession {
    private static JuxtaSession currentSession;

    public static JuxtaSession getCurrentSession() {
        return currentSession;
    }

    public JuxtaSession() {

    }

    public static void setCurrentSession(JuxtaSession session)
    {
        currentSession = session;
    }
}
