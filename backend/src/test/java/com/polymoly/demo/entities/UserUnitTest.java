package com.polymoly.demo.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class UserUnitTest {

    @Test
    public void testUserEntity() {
        // Arrange
        Long expectedUid = 1L;
        String expectedUsername = "testUser";
        String expectedPassword = "password123";
        LocalDateTime expectedCreatedDate = LocalDateTime.now();

        // Act
        User user = new User();
        user.setUid(expectedUid);
        user.setUsername(expectedUsername);
        user.setPassword(expectedPassword);
        user.setCreatedDate(expectedCreatedDate);

        // Assert
        assertEquals(expectedUid, user.getUid());
        assertEquals(expectedUsername, user.getUsername());
        assertEquals(expectedPassword, user.getPassword());
        assertEquals(expectedCreatedDate, user.getCreatedDate());
    }

    @Test
    public void testUserConstructor() {
        // Arrange
        Long expectedUid = 2L;
        String expectedUsername = "anotherUser";
        String expectedPassword = "securePass";
        LocalDateTime expectedCreatedDate = LocalDateTime.of(2025, 1, 1, 12, 0);

        // Act
        User user = new User(expectedUid, expectedUsername, expectedPassword, expectedCreatedDate);

        // Assert
        assertEquals(expectedUid, user.getUid());
        assertEquals(expectedUsername, user.getUsername());
        assertEquals(expectedPassword, user.getPassword());
        assertEquals(expectedCreatedDate, user.getCreatedDate());
    }
}
