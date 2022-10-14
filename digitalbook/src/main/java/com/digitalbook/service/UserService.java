package com.digitalbook.service;

import com.digitalbook.entity.ERole;
import com.digitalbook.entity.User;

public interface UserService {

	User getUser(int userId, ERole roleUser);

}
