package com.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpotifyDataRepository extends JpaRepository<SpotifyData, String> {
    // Define custom queries if needed
}
