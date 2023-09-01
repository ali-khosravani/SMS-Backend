package com.p3soft.sms.repository;

import com.p3soft.sms.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ali Kosravani
 * @since 1402/06/08
 */
public interface UsersRepository extends JpaRepository<Users,Long> {
}
