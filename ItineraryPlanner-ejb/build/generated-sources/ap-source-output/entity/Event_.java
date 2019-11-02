package entity;

import entity.Comment;
import entity.Event;
import entity.Itinerary;
import entity.Photo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T10:40:35")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile ListAttribute<Event, Comment> commentList;
    public static volatile ListAttribute<Event, Photo> photoList;
    public static volatile SingularAttribute<Event, Event> next;
    public static volatile SingularAttribute<Event, String> cost;
    public static volatile SingularAttribute<Event, String> notes;
    public static volatile SingularAttribute<Event, Date> endDate;
    public static volatile SingularAttribute<Event, Event> prev;
    public static volatile SingularAttribute<Event, Itinerary> itinerary;
    public static volatile SingularAttribute<Event, String> type;
    public static volatile SingularAttribute<Event, String> duration;
    public static volatile SingularAttribute<Event, Date> createdDate;
    public static volatile SingularAttribute<Event, String> name;
    public static volatile SingularAttribute<Event, String> location1;
    public static volatile SingularAttribute<Event, String> location2;
    public static volatile SingularAttribute<Event, Long> id;
    public static volatile SingularAttribute<Event, Date> startDate;

}