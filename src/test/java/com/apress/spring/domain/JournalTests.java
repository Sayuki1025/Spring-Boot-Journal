package com.apress.spring.domain;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class JournalTests {

    @Test
    public void toString_StandardEmpty_Expected() throws ParseException {
        // arrange
        String expected = "JournalEntry(Id: null,Title: some Title,Summary: some summary,Created: 08/08/1982)";
        Journal j = new Journal("some Title", "some summary", "08/08/1982");

        // act
        String result = j.toString();

        // assert
        Assert.assertEquals(expected, result);
    }

}
