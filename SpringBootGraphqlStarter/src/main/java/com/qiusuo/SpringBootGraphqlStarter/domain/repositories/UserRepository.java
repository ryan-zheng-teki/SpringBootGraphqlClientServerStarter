package com.qiusuo.SpringBootGraphqlStarter.domain.repositories;

import com.qiusuo.SpringBootGraphqlStarter.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserRepository extends JpaRepository<User, String>, QuerydslPredicateExecutor<User> {
}
