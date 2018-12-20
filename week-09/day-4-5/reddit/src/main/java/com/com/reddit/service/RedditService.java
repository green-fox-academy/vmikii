package com.com.reddit.service;

import com.com.reddit.model.Post;
import com.com.reddit.model.User;
import com.com.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedditService {

  @Autowired
  PostRepository repository;


  public List<Post> listAllPosts() {
    List<Post> posts = new ArrayList<>();
    repository.findAll().forEach(posts :: add);
    return posts;
  }

  public void addPost(Post newPost) {
    repository.save(newPost);
  }
}
