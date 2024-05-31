package fr.codecake.spotify_clone.catalogcontext.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "favorite_song")
//@Getter
//@Setter
@IdClass(FavoriteId.class)
public class Favorite implements Serializable {

    @Id
    private UUID songPublicId;

    @Id
    @Column(name = "user_email")
    private String userEmail;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorite favorite = (Favorite) o;
        return Objects.equals(songPublicId, favorite.songPublicId) && Objects.equals(userEmail, favorite.userEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songPublicId, userEmail);
    }

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
