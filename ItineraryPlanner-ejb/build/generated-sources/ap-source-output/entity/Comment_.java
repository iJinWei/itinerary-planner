package entity;

import entity.Itinerary;
import entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-25T22:54:31")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Date> createdDate;
    public static volatile SingularAttribute<Comment, String> description;
    public static volatile SingularAttribute<Comment, Itinerary> itinerary;
    public static volatile SingularAttribute<Comment, Long> id;
    public static volatile SingularAttribute<Comment, Users> user;

}