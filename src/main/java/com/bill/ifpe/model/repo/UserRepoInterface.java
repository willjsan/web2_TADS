package com.bill.ifpe.model.repo;

import com.bill.ifpe.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepoInterface extends JpaRepository<User, String> {

}