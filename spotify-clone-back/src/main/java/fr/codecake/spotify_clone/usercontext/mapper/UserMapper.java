package fr.codecake.spotify_clone.usercontext.mapper;

import fr.codecake.spotify_clone.usercontext.ReadUserDTO;
import org.mapstruct.Mapper;
import fr.codecake.spotify_clone.usercontext.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO userToReadUserDTO(User user);

}
