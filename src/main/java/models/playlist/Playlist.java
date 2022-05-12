package com.spotify.oauth2.pojo.playlist;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Playlist {

    private Boolean collaborative;
    private String description;
    private ExternalUrls external_urls;
    private Followers followers;
    private String href;
    private String id;
    private List<Object> images = null;
    private String name;
    private Owner owner;
    private Object primary_color;
    @JsonProperty("public")
    private Boolean _public;
    private String snapshot_id;
    private Tracks tracks;
    private String type;
    private String uri;

    public Boolean getCollaborative() {
        return collaborative;
    }

    public Playlist setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Playlist setDescription(String description) {
        this.description = description;
        return this;
    }

    public ExternalUrls getExternal_urls() {
        return external_urls;
    }

    public void setExternal_urls(ExternalUrls external_urls) {
        this.external_urls = external_urls;
    }

    public Followers getFollowers() {
        return followers;
    }

    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getImages() {
        return images;
    }

    public Playlist setImages(List<Object> images) {
        this.images = images;
        return this;
    }

    public String getName() {
        return name;
    }

    public Playlist setName(String name) {
        this.name = name;
        return this;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Object getPrimary_color() {
        return primary_color;
    }

    public void setPrimary_color(Object primary_color) {
        this.primary_color = primary_color;
    }

    public Boolean getPublic() {
        return _public;
    }

    public Playlist setPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    public String getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
