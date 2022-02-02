package com.testing.forum;

import com.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        //Then
        assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        assertEquals("John Smith", result);
    }
}
