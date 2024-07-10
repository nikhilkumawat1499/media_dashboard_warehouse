package com.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, String> {
    // Define custom queries if needed
}
