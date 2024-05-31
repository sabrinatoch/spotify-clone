package fr.codecake.spotify_clone.catalogcontext.application.mapper;

import fr.codecake.spotify_clone.catalogcontext.application.dto.SaveSongDTO;
import fr.codecake.spotify_clone.catalogcontext.application.dto.SongContentDTO;
import fr.codecake.spotify_clone.catalogcontext.domain.SongContent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SongContentMapper {
    @Mapping(source = "song.publicId", target = "publicId")
    SongContentDTO songContentToSongContentDTO(SongContent songContent);

    SongContent saveSongDTOToSong(SaveSongDTO songDTO);
}
