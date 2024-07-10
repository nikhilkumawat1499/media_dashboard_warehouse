package com.warehouse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class UserPost {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String postId;
    private String username;
    private String bio;
    private int followersCount;
    private int followingCount;
    private String profilePicture;
    private LocalDateTime accountCreationDate;
    private LocalDateTime postTimestamp;
    private String caption;
    private int likesCount;
    private int commentsCount;
    private String postType;
    private String hashtags;
    private String mentions;
    private double engagementRate;


}
