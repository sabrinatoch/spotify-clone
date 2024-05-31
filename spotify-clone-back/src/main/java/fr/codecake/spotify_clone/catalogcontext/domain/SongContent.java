package fr.codecake.spotify_clone.catalogcontext.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "song_content")
//@Getter
//@Setter
public class SongContent implements Serializable {
    @Id
    @Column(name = "song_id")
    private Long songId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "song_id", referencedColumnName = "id")
    private Song song;

    @Lob
    @Column(name = "file", nullable = false)
    private byte[] file;

    @Column(name = "file_content_type")
    private String fileContentType;

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public Long getSongId() {
        return songId;
    }

    public Song getSong() {
        return song;
    }

    public byte[] getFile() {
        return file;
    }

    public String getFileContentType() {
        return fileContentType;
    }
}
