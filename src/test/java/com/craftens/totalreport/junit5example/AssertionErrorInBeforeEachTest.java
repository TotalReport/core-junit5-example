package com.craftens.totalreport.junit5example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
public class AssertionErrorInBeforeEachTest {
    @BeforeAll
    public static void beforeAll() {
        log.info("beforeAll");
    }

    @BeforeEach
    public void beforeEach1() {
        log.info("beforeEach1");
    }

    @BeforeEach
    public void beforeEach2() {
        log.info("beforeEach2");
        throw new AssertionError("AssertionError in beforeEach2");
    }

    @BeforeEach
    public void beforeEach3() {
        log.info("beforeEach3");
    }

    @Test
    public void test() {
        log.info("Test method");
    }

    @AfterEach
    public void afterEach() {
        log.info("afterEach");
    }

    @AfterAll
    public static void afterAll() {
        log.info("afterAll");
    }
}
