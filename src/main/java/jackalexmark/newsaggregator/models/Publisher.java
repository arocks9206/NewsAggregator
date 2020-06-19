package jackalexmark.newsaggregator.models;

import java.io.Serializable;

public class Publisher implements Serializable {

    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
