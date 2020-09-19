package qwe;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class All {
    public List<Cats> all;

    public All(
            @JsonProperty("all") List<Cats> all )
    {
        this.all = all;
    }

    public List<Cats> getAll() {
        return all;
    }
}
