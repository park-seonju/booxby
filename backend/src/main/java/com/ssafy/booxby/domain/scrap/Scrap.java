package com.ssafy.booxby.domain.scrap;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Scrap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scrapId;

    private Long userId;

    private Long bookId;

    private LocalDateTime createdDate;

    @Builder
    public Scrap(Long userId, Long bookId) {
        this.userId = userId;
        this.bookId = bookId;
        this.createdDate = LocalDateTime.now();
    }
}