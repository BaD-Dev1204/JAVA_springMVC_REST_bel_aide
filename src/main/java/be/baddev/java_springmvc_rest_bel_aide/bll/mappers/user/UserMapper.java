package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.user;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.user.User;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.in.UserCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.in.UserUpdateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.out.UserDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.out.UserIndexOut;

public interface UserMapper {

    User UserCreateFormToUserEntityMapper(UserCreateForm dto);

    void UserUpdateFormToUserEntityMapper(UserUpdateForm dto, User entity);

    UserIndexOut UserEntityToUserIndexOutMapper(User entity);

    UserDetailsOut UserEntityToUserDetailsOutMapper(User entity);

}