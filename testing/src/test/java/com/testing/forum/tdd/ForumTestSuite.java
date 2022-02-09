package com.testing.forum.tdd;

import com.testing.forum.ForumComment;
import com.testing.forum.ForumPost;
import com.testing.forum.ForumUser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("ziajka", "Marcin Ziajka");
        //When
        forumUser.addPost(forumUser.getName(), "Hello everyone, this is my first post here!");
        //Then
        assertEquals(1, forumUser.getPostsQuantity());

    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("ziajka", "Marcin Ziajka");
        ForumPost forumPost = new ForumPost("My post", forumUser.getName());
        //When
        forumUser.addComment(forumPost, forumUser.getName(), "Test comment");
        //Then
        assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("ziajka", "Marcin Ziajka");
        ForumPost thePost = new ForumPost("My post", forumUser.getName());
        forumUser.addPost(forumUser.getName(), thePost.getPostBody());
        //When
        ForumPost retrievedPost = forumUser.getPost(0);
        //Then
        assertEquals(retrievedPost, thePost);
    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("ziajka", "Marcin Ziajka");
        ForumPost thePost = new ForumPost("My post", forumUser.getName());
        ForumComment theComment = new ForumComment(thePost, "Test comment", forumUser.getName());
        forumUser.addComment(thePost, forumUser.getName(), theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        assertEquals(retrievedComment, theComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("ziajka", "Marcin Ziajka");
        ForumPost thePost = new ForumPost("My post", forumUser.getName());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("ziajka", "Marcin Ziajka");
        ForumPost thePost = new ForumPost("My post", forumUser.getName());
        ForumComment theComment = new ForumComment(thePost, "Test comment", forumUser.getName());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("ziajka", "Marcin Ziajka");
        ForumPost thePost = new ForumPost("My post", forumUser.getName());
        forumUser.addPost(forumUser.getName(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        assertTrue(result);
        assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("ziajka", "Marcin Ziajka");
        ForumPost thePost = new ForumPost("My post", forumUser.getName());
        ForumComment theComment = new ForumComment(thePost, "Test comment", forumUser.getName());
        forumUser.addComment(thePost, forumUser.getName(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        assertEquals(0, forumUser.getPostsQuantity());
    }
}
