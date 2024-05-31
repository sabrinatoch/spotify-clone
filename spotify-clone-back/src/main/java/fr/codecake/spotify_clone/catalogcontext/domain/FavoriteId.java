package fr.codecake.spotify_clone.catalogcontext.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

//@NoArgsConstructor
//@Getter
//@Setter
public class FavoriteId implements Serializable {

    UUID songPublicId;
    String userEmail;

    public FavoriteId(UUID songPublicId, String userEmail) {
        this.songPublicId = songPublicId;
        this.userEmail = userEmail;
    }

    public FavoriteId() {}

    public void setSongPublicId(UUID songPublicId) {
        this.songPublicId = songPublicId;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public UUID getSongPublicId() {
        return songPublicId;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
