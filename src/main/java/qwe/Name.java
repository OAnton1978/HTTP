package qwe;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {
    String first;
    String last;

    public Name(
            @JsonProperty("first") String first,
             @JsonProperty("last") String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
