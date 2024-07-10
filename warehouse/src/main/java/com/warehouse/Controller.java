package com.warehouse;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class Controller {
    @Autowired
    private UserPostRepository userPostRepository;
    @Autowired
    private SpotifyDataRepository spotifyDataRepository;
    @Autowired
    private TweetRepository tweetRepository;

    @GetMapping("/insta")
    public List<UserPost> getAllPosts() {
        return userPostRepository.findAll();
    }

    @PostMapping("/insta")
    public UserPost createPost(@RequestBody UserPost userPost) {
        return  userPostRepository.save(userPost);
    }
    @GetMapping("/spotify")
    public List<SpotifyData> getAllUsers() {
        return spotifyDataRepository.findAll();
    }

    @PostMapping("/spotify")
    public SpotifyData createUser(@RequestBody SpotifyData userDetails) {
        return spotifyDataRepository.save(userDetails);
    }
    @GetMapping("/tweet")
    public List<Tweet> getAllTweet() {
        return tweetRepository.findAll();
    }
    @Transactional
    @PostMapping("/tweet")
    public Tweet createTweet(@RequestBody Tweet tweet) {
        return tweetRepository.save(tweet);
    }



}

