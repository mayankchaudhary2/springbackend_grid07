package com.mayank.grid.mayank.controller;

import com.mayank.grid.mayank.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class LikeController {
    @Autowired
    private LikeService likeService;

    @PostMapping("/{postId}/like")
    public String likePost(@PathVariable Long postId){
        return likeService.likePost(postId);
    }
}
