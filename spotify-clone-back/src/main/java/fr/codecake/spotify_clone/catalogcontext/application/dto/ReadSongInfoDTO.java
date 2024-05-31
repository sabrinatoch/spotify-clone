package fr.codecake.spotify_clone.catalogcontext.application.dto;

import fr.codecake.spotify_clone.catalogcontext.application.vo.SongAuthorVO;
import fr.codecake.spotify_clone.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//@Getter
//@Setter
public class ReadSongInfoDTO {

    private SongTitleVO title;

    private SongAuthorVO author;

    @NotNull
    private byte[] cover;

    @NotNull
    private String coverContentType;

    @NotNull
    private boolean isFavorite;

    @NotNull
    private UUID publicId;

    public void setTitle(SongTitleVO title) {
        this.title = title;
    }

    public void setAuthor(SongAuthorVO author) {
        this.author = author;
    }

    public void setCover(@NotNull byte[] cover) {
        this.cover = cover;
    }

    public void setCoverContentType(@NotNull String coverContentType) {
        this.coverContentType = coverContentType;
    }

    public void setFavorite(@NotNull boolean favorite) {
        isFavorite = favorite;
    }

    public void setPublicId(@NotNull UUID publicId) {
        this.publicId = publicId;
    }

    public SongTitleVO getTitle() {
        return title;
    }

    public SongAuthorVO getAuthor() {
        return author;
    }

    @NotNull
    public byte[] getCover() {
        return cover;
    }

    public @NotNull String getCoverContentType() {
        return coverContentType;
    }

    @NotNull
    public boolean isFavorite() {
        return isFavorite;
    }

    public @NotNull UUID getPublicId() {
        return publicId;
    }
}
