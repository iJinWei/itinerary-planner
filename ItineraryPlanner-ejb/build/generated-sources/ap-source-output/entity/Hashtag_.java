package entity;

import entity.Itinerary;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-25T22:54:31")
@StaticMetamodel(Hashtag.class)
public class Hashtag_ { 

    public static volatile SingularAttribute<Hashtag, Date> createdDate;
    public static volatile ListAttribute<Hashtag, Users> userList;
    public static volatile ListAttribute<Hashtag, Itinerary> itineraryList;
    public static volatile SingularAttribute<Hashtag, Long> id;
    public static volatile SingularAttribute<Hashtag, String> tag;

}