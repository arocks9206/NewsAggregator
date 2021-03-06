package jackalexmark.newsaggregator.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="sources")
//this is our class declaration it tells us what our class is and what word we'd use to call this class
public class Source implements Serializable {

    @Id
    @GeneratedValue
//    this section declares that the source object has a property id which is of type Long, the annotations connect
//    the property to our database and mean that each time a source object is saved, it has a unique id
    private Long id;

    @Column(name = "sourceTitle")
    private String sourceTitle;

    @Column(name = "sourceImg")
    private String sourceImg;

    @Column(name = "sourceLink")
    private String sourceLink;

    @Column(name = "rating")
    private int rating;

    @JsonIgnoreProperties(value = "source")
    @ManyToOne
    @JoinColumn(name = "story_id", nullable = false)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Story story;

    @JsonIgnoreProperties(value = "source")
    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Publisher publisher;

    // this is our constructor - it builds the object with the class Source
    public Source(String sourceTitle, String sourceImg, String sourceLink, Story story, int rating, Publisher publisher) {
        this.sourceTitle = sourceTitle;
        this.sourceImg = sourceImg;
        this.sourceLink = sourceLink;
        this.story = story;
        this.rating = rating;
        this.publisher = publisher;
    }

    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    public String getSourceImg() {
        return sourceImg;
    }

    public void setSourceImg(String sourceImg) {
        this.sourceImg = sourceImg;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int increaseRating() {
        return this.rating += 1;
    }

    public int decreaseRating() {
        return this.rating -= 1;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Source(){

    }

}
