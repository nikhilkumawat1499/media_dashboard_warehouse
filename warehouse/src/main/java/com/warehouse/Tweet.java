package com.warehouse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
public class Tweet {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long tweetId;
    private Long userId;
    private LocalDateTime tweetTimestamp;
    private String tweetText;
    private int retweetsCount;
    private int likesCount;
    private int repliesCount;
    private String hashtags;
    private String mentions;
    private String mediaType;
    private String sentiment;

    // Getters and setters
}
