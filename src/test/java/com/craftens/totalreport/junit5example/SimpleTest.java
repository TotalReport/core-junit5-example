package com.craftens.totalreport.junit5example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
public class SimpleTest {
    @BeforeAll
    public static void beforeAll() {
        log.info("before all activity");
    }

    @BeforeEach
    public void beforeEach() {
        log.info("before each activity");
    }

    @Test
    public void test() {
        log.info("Test activity");
    }

    @AfterEach
    public void afterEach() {
        log.info("after each activity");
    }

    @AfterAll
    public static void afterAll() {
        log.info("after all activity");
    }
}
