package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.user;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.user.User;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.in.UserCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.in.UserUpdateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.out.UserDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.out.UserIndexOut;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User UserCreateFormToUserEntityMapper(UserCreateForm dto) {

        User user = new User();

        user.setKeycloakId(dto.getKeycloakId());
        user.setCity(dto.getCity());
        user.setLatitude(dto.getLatitude());
        user.setLongitude(dto.getLongitude());

        return user;
    }

    @Override
    public void UserUpdateFormToUserEntityMapper(UserUpdateForm dto, User entity) {

        entity.setCity(dto.getCity());
        entity.setLatitude(dto.getLatitude());
        entity.setLongitude(dto.getLongitude());

    }

    @Override
    public UserIndexOut UserEntityToUserIndexOutMapper(User entity) {

        return new UserIndexOut(
                entity.getId(),
                entity.getKeycloakId(),
                entity.getCity()
        );

    }

    @Override
    public UserDetailsOut UserEntityToUserDetailsOutMapper(User entity) {

        return new UserDetailsOut(
                entity.getId(),
                entity.getKeycloakId(),
                entity.getCity(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );

    }

}