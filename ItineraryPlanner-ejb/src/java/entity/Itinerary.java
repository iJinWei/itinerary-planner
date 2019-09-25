package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Itinerary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int likes;
    private String duration;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Lob
    private byte[] coverPhoto;
    private String title;
    private String caption;
    private boolean isPublished;
    private boolean isCompleted;
    private List<String> countryList;
    private List<String> placeList;

    @ManyToMany(mappedBy = "itineraryList")
    private List<Users> usersList;
    @ManyToMany(mappedBy = "itineraryList")
    private List<Hashtag> hashtagList;
    @OneToMany
    private List<Activity> activityList;
    @OneToMany(mappedBy = "itinerary")
    private List<Comment> commentList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itinerary)) {
            return false;
        }
        Itinerary other = (Itinerary) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Itinerary[ id=" + id + " ]";
    }

}
