package qwe;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Cats {

    public String id;
    public String text;
    public String type;
    public Integer upvotes;
    public String userUpvoted;
    public User user;

    public Cats(
            @JsonProperty("_id") String id,
            @JsonProperty("type") String type,
            @JsonProperty("text") String text,
            @JsonProperty("user") User user,
            @JsonProperty("upvotes") int upvotes,
            @JsonProperty("userUpvoted") String userUpvoted

    ){
        this.id = id;
        this.type = type;
        this.text = text;
        this.user = user;
        this.upvotes = upvotes;
        this.userUpvoted = userUpvoted;
    }

    public  Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", upvotes=" + upvotes +
                ", userUpvoted='" + userUpvoted + '\'' +
                ", user=" + user +
                '}';
    }
}

