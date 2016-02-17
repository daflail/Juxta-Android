package social.juxta.juxtasocial.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JuxtaUser {

    public String id;
    public String email;
    public String firstName;
    public String lastName;
    public JuxtaImage avatar;
    public JuxtaImage photo1;
    public JuxtaImage photo2;
    public JuxtaImage photo3;
    public JuxtaImage photo4;
    public String tagline;
    public Date lastActive;
    public Date lastActivityCreatedAt;
    public float averageReview;
    public String bio;
    public String fbId;
    public List<JuxtaActivity> ownedActivities = new ArrayList<JuxtaActivity>();
    public JuxtaBadge lastEarnedBadge;
    public List<JuxtaBadge> badges = new ArrayList<JuxtaBadge>();
    public List<JuxtaReview> reviews = new ArrayList<JuxtaReview>();
    public List<JuxtaParticipation> participations = new ArrayList<JuxtaParticipation>();
    public int approvedParticipationCount;
    public int subscribedToCount;
    public int subscribersCount;
    public List<JuxtaSubscription> subscribers = new ArrayList<JuxtaSubscription>();
    public List<JuxtaSubscription> subscribedTo = new ArrayList<JuxtaSubscription>();

    public boolean HasDetails() {
        return false;
    }

    public List<JuxtaImage> Photos() {
        List<JuxtaImage> photos = new ArrayList<JuxtaImage>();
        photos.add(photo1);
        photos.add(photo2);
        photos.add(photo3);
        photos.add(photo4);
        return photos;
    }

//    public JuxtaUser currentUser() {
//
//    }
}

//    + (JUXUser *)currentUser;
//
//    - (BOOL)isEqualToUser:(JUXUser *)other;
//
//    - (NSString *)name;
//
//    - (NSString *)initials;
//
//    - (void)getDetails:(void (^)(JUXUser *, NSString *))completion;
//
//    - (void)getDetailsForce:(void (^)(JUXUser *, NSString *))completion;
//
//    - (BOOL)isFollowingUser:(NSString *)userId;
//
//    - (BOOL)isFollowedByUser:(NSString *)userId;
//
//    - (NSArray *)mutualSubscriptions;
//    @end