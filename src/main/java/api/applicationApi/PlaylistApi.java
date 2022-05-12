package api.applicationApi;

import api.RestResources;
import api.Route;
import api.TokenManager;
import models.playlist.Playlist;
import utils.ConfigLoader;
import io.restassured.response.Response;

public class PlaylistApi {


    public static Response post(Playlist requestPlaylistBody){
        return RestResources.post(requestPlaylistBody, TokenManager.getToken(), Route.USERS + "/" + ConfigLoader.getInstance().getUserId() + Route.PLAYLISTS);
    }

    public static Response post(Playlist requestPlaylistBody, String token){
        return RestResources.post(requestPlaylistBody, token, Route.USERS + "/" + ConfigLoader.getInstance().getUserId() + Route.PLAYLISTS);
    }

    public static Response get(String playlistId){
        return RestResources.get(TokenManager.getToken(), Route.PLAYLISTS + "/" + playlistId);
    }

    public static Response put(Playlist requestPlaylistBody, String playlistId){
        return RestResources.put(requestPlaylistBody, TokenManager.getToken(), Route.PLAYLISTS + "/" + playlistId);
    }
}
