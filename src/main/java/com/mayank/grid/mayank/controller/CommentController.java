package com.mayank.grid.mayank.controller;

import com.mayank.grid.mayank.entity.Comment;
import com.mayank.grid.mayank.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/{postId}/comments")
    public Comment addComment(@PathVariable Long postId, @RequestBody Comment comment ){
        comment.setPostId(postId);
        return commentService.addComment(comment);

    }
}
