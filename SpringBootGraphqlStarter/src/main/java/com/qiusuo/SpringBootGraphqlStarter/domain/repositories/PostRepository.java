package com.qiusuo.SpringBootGraphqlStarter.domain.repositories;

import com.qiusuo.SpringBootGraphqlStarter.domain.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;


public interface PostRepository extends JpaRepository<Post, String>, QuerydslPredicateExecutor<Post> {
}
