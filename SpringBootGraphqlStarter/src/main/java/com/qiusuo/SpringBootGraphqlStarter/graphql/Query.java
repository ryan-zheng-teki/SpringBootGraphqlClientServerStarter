package com.qiusuo.SpringBootGraphqlStarter.graphql;

import com.qiusuo.SpringBootGraphqlStarter.domain.models.Post;
import com.qiusuo.SpringBootGraphqlStarter.domain.services.PostService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    PostService postService;

    public Collection<Post> posts() {
        return postService.getAllPosts();
    }
}