package com.warehouse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class SpotifyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private LocalDate signupDate;
    private LocalDate lastActiveDate;
    private String subscriptionType;
    private String subscriptionStatus;
    private Integer churn;
    private Integer totalPlaytime;
    private Integer totalSongsPlayed;
    private Integer averageSessionLength;
    private Integer playlistsCreated;
    private Integer likedSongsCount;
    private Double skipRate;
}
