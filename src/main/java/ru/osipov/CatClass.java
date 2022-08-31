package ru.osipov;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatClass {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final int upvotes;

    public int getUpvotes() {
        return upvotes;
    }

    public CatClass(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        if (upvotes != null) this.upvotes = Integer.parseInt(upvotes);
        else this.upvotes = 0;
    }

    @Override
    public String toString() {
        return "Факт о кошке:" +
                "\n id = " + id +
                "\n text = " + text +
                "\n type = " + type +
                "\n user = " + user +
                "\n upvotes = " + upvotes;
    }
}
