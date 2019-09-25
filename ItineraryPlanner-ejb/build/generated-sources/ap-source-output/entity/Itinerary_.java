package entity;

import entity.Activity;
import entity.Comment;
import entity.Hashtag;
import entity.Users;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-25T22:54:31")
@StaticMetamodel(Itinerary.class)
public class Itinerary_ { 

    public static volatile ListAttribute<Itinerary, Comment> commentList;
    public static volatile ListAttribute<Itinerary, Users> usersList;
    public static volatile SingularAttribute<Itinerary, Date> endDate;
    public static volatile SingularAttribute<Itinerary, Boolean> isPublished;
    public static volatile SingularAttribute<Itinerary, byte[]> coverPhoto;
    public static volatile SingularAttribute<Itinerary, String> caption;
    public static volatile SingularAttribute<Itinerary, List> placeList;
    public static volatile SingularAttribute<Itinerary, String> title;
    public static volatile SingularAttribute<Itinerary, List> countryList;
    public static volatile SingularAttribute<Itinerary, String> duration;
    public static volatile SingularAttribute<Itinerary, Date> createdDate;
    public static volatile ListAttribute<Itinerary, Hashtag> hashtagList;
    public static volatile SingularAttribute<Itinerary, Long> id;
    public static volatile ListAttribute<Itinerary, Activity> activityList;
    public static volatile SingularAttribute<Itinerary, Date> startDate;
    public static volatile SingularAttribute<Itinerary, Integer> likes;
    public static volatile SingularAttribute<Itinerary, Boolean> isCompleted;

}