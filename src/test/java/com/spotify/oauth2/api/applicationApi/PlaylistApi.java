package com.spotify.oauth2.api.applicationApi;

import com.spotify.oauth2.api.RestResources;
import com.spotify.oauth2.pojo.playlist.Playlist;
import com.spotify.oauth2.utils.ConfigLoader;
import io.restassured.response.Response;

import static com.spotify.oauth2.api.Route.PLAYLISTS;
import static com.spotify.oauth2.api.Route.USERS;
import static com.spotify.oauth2.api.TokenManager.getToken;

public class PlaylistApi {


    public static Response post(Playlist requestPlaylistBody){
        return RestResources.post(requestPlaylistBody, getToken(), USERS + "/" + ConfigLoader.getInstance().getUserId() + PLAYLISTS);
    }

    public static Response post(Playlist requestPlaylistBody, String token){
        return RestResources.post(requestPlaylistBody, token, USERS + "/" + ConfigLoader.getInstance().getUserId() + PLAYLISTS);
    }

    public static Response get(String playlistId){
        return RestResources.get(getToken(), PLAYLISTS + "/" + playlistId);
    }

    public static Response put(Playlist requestPlaylistBody, String playlistId){
        return RestResources.put(requestPlaylistBody, getToken(),PLAYLISTS + "/" + playlistId);
    }
}
