package models;

import play.mvc.*;
import com.fasterxml.jackson.annotation.*;

public class Media {
    public String name;

    public String type;

    public String description;

    public String wikiLink;

    public String videoLink;

    public String mediaType;

    @JsonCreator
    public Media(@JsonProperty("Name") String name, @JsonProperty("Type") String type, @JsonProperty("wTeaser") String description, @JsonProperty("wUrl") String wikiLink, @JsonProperty("yUrl") String videoLink, @JsonProperty("yID") String useless) {
        this.name = name;
        this.type = type;
        this.mediaType = type;
        this.description = description;
        this.wikiLink = wikiLink;
        this.videoLink = videoLink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getMediaType() { return type; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWikiLink() {
        return wikiLink;
    }

    public void setWikiLink(String wikiLink) {
        this.wikiLink = wikiLink;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}