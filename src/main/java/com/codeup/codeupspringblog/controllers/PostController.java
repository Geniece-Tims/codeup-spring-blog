package com.codeup.codeupspringblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/posts")
    public String listPosts() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    public String viewPost(@PathVariable long id) {
        return "viewing post with ID: " + id;
    }

    @GetMapping("/posts/create")
    public String createPostForm() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    public String createPost() {
        return "new post has been created";
    }

}
