package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-25T22:54:31")
@StaticMetamodel(Activity.class)
public class Activity_ { 

    public static volatile SingularAttribute<Activity, Date> createdDate;
    public static volatile SingularAttribute<Activity, String> notes;
    public static volatile SingularAttribute<Activity, Date> endDate;
    public static volatile SingularAttribute<Activity, String> name;
    public static volatile SingularAttribute<Activity, byte[]> photo;
    public static volatile SingularAttribute<Activity, Long> id;
    public static volatile SingularAttribute<Activity, String> type;
    public static volatile SingularAttribute<Activity, Date> startDate;

}