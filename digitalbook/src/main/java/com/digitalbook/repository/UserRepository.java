package com.digitalbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.digitalbook.entity.User;

/**
 * 
 * @author sindhu This is UserRepository which is used for saving user details
 *         and fetching user details from db
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
