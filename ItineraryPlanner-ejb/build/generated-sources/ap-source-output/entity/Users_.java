package entity;

import entity.Comment;
import entity.Itinerary;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T12:35:21")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, Date> birthday;
    public static volatile ListAttribute<Users, Comment> commentList;
    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> instaURL;
    public static volatile SingularAttribute<Users, byte[]> profilepic;
    public static volatile SingularAttribute<Users, String> description;
    public static volatile SingularAttribute<Users, String> userName;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, Date> createdDate;
    public static volatile SingularAttribute<Users, String> blogURL;
    public static volatile ListAttribute<Users, Itinerary> itineraryList;
    public static volatile SingularAttribute<Users, Long> id;
    public static volatile SingularAttribute<Users, String> email;

}