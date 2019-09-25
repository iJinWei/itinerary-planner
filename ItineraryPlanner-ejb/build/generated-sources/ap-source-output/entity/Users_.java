package entity;

import entity.Comment;
import entity.Hashtag;
import entity.Itinerary;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-25T22:54:31")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile ListAttribute<Users, Comment> commentList;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile ListAttribute<Users, Hashtag> hashtagList;
    public static volatile ListAttribute<Users, Itinerary> itineraryList;
    public static volatile SingularAttribute<Users, Long> id;
    public static volatile SingularAttribute<Users, Boolean> isAdmin;
    public static volatile SingularAttribute<Users, String> userName;
    public static volatile SingularAttribute<Users, String> email;

}