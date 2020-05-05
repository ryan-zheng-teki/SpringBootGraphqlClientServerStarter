package com.qiusuo.SpringBootGraphqlStarter.graphql;

import com.qiusuo.SpringBootGraphqlStarter.domain.models.Post;
import com.qiusuo.SpringBootGraphqlStarter.domain.services.PostService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    PostService postService;

    public Post createPost(String content, String userId) {
        return postService.createPost(content, userId);
    }
}
