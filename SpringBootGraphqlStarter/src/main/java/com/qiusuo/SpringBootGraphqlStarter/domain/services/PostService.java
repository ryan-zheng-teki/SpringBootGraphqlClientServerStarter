package com.qiusuo.SpringBootGraphqlStarter.domain.services;


import com.qiusuo.SpringBootGraphqlStarter.domain.models.Post;
import com.qiusuo.SpringBootGraphqlStarter.domain.models.User;
import com.qiusuo.SpringBootGraphqlStarter.domain.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Post createPost(String content, String email) {
        Post post = new Post();
        User user = new User();
        user.setEmail(email);
        post.setUser(user);
        postRepository.save(post);
        return post;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
