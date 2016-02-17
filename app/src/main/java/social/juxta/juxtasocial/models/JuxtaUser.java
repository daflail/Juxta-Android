package social.juxta.juxtasocial.models;

import java.util.Date;

public class JuxtaUser {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private JuxtaImage avatar;
    private JuxtaImage photo1;
    private JuxtaImage photo2;
    private JuxtaImage photo3;
    private JuxtaImage photo4;
    private String tagline;
    private Date lastActive;
    private Date lastActivityCreatedAt;
    private float averageReview;
    private String bio;
    private String fbId;
    private NSArray ownedActivities;
    private JUXBadge* lastEarnedBadge;
    private NSArray* badges;
    private NSArray* reviews;
    private NSArray* participations;
    private int approvedParticipationCount;
    private int subscribedToCount;
    private int subscribersCount;
    private NSArray* subscribers;
    private NSArray* subscribedTo;

//    #import <Foundation/Foundation.h>
//            #import <Mantle/Mantle.h>
//            #import "MTLManagedObjectAdapter.h"
//
//            @class JUXBadge;
//
//
//    @interface JUXUser : JUXModel
//
//    - (BOOL)hasDetails;
//
//    - (NSArray *)photos;
//
//    + (JUXUser *)currentUser;
//
//    @property (strong, nonatomic) NSString* id;
//    @property (strong, nonatomic) NSString* email;
//    @property (strong, nonatomic) NSString* firstName;
//    @property (strong, nonatomic) NSString* lastName;
//    @property (strong, nonatomic) JUXImage * avatar;
//    @property (strong, nonatomic) JUXImage * photo1;
//    @property (strong, nonatomic) JUXImage * photo2;
//    @property (strong, nonatomic) JUXImage * photo3;
//    @property (strong, nonatomic) JUXImage * photo4;
//    @property (strong, nonatomic) NSString *tagline;
//    @property (strong, nonatomic) NSDate *lastActive;
//    @property (strong, nonatomic) NSDate *lastActivityCreatedAt;
//    @property (assign, nonatomic) CGFloat averageReview;
//    @property (strong, nonatomic) NSString *bio;
//    @property (strong, nonatomic) NSString* fbId;
//    @property (strong, nonatomic) NSArray* ownedActivities;
//    @property (strong, nonatomic) JUXBadge* lastEarnedBadge;
//    @property (strong, nonatomic) NSArray* badges;
//    @property (strong, nonatomic) NSArray* reviews;
//    @property (strong, nonatomic) NSArray* participations;
//    @property (assign, nonatomic) NSInteger approvedParticipationCount;
//    @property (assign, nonatomic) NSInteger subscribedToCount;
//    @property (assign, nonatomic) NSInteger subscribersCount;
//    @property (strong, nonatomic) NSArray* subscribers;
//    @property (strong, nonatomic) NSArray* subscribedTo;
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
}
