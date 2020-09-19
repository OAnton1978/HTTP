package qwe;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    String userId;
    Name userName;

    public User(
            @JsonProperty("_id") String userId,
            @JsonProperty("name") Name userName
                ) {
        this.userId = userId;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName=" + userName +
                '}';
    }
}
