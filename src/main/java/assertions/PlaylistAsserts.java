package assertions;

import api.StatusCode;
import models.error.Error;
import models.playlist.Playlist;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PlaylistAsserts {

    public void assertPlaylistEqual(Playlist responsePlaylist, Playlist requestPlaylist){
        assertThat(responsePlaylist.getName(), equalTo(requestPlaylist.getName()));
        assertThat(responsePlaylist.getDescription(), equalTo(requestPlaylist.getDescription()));
        assertThat(responsePlaylist.getPublic(), equalTo(requestPlaylist.getPublic()));
    }

    public void assertStatusCode(int actualStatusCode, StatusCode statusCode){
        assertThat(actualStatusCode, equalTo(statusCode.getCode()));
    }

    public void assertErrorResponse(Error responseError, StatusCode statusCode){
        assertThat(responseError.getError().getStatus(), equalTo(statusCode.getCode()));
        assertThat(responseError.getError().getMessage(), equalTo(statusCode.getMessage()));
    }

}
