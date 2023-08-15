package com.p3soft.sms.repository;

import com.p3soft.sms.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users,Long> {
}
