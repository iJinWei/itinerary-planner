package entity;

import entity.Comment;
import entity.Event;
import entity.Photo;
import entity.Users;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T12:35:21")
@StaticMetamodel(Itinerary.class)
public class Itinerary_ { 

    public static volatile ListAttribute<Itinerary, Comment> commentList;
    public static volatile ListAttribute<Itinerary, Photo> photoList;
    public static volatile ListAttribute<Itinerary, Users> usersList;
    public static volatile ListAttribute<Itinerary, Event> eventList;
    public static volatile SingularAttribute<Itinerary, Date> endDate;
    public static volatile SingularAttribute<Itinerary, String> caption;
    public static volatile SingularAttribute<Itinerary, List> placeList;
    public static volatile SingularAttribute<Itinerary, String> title;
    public static volatile SingularAttribute<Itinerary, String> duration;
    public static volatile SingularAttribute<Itinerary, Date> createdDate;
    public static volatile SingularAttribute<Itinerary, Long> id;
    public static volatile SingularAttribute<Itinerary, Date> startDate;
    public static volatile SingularAttribute<Itinerary, Integer> likes;

}