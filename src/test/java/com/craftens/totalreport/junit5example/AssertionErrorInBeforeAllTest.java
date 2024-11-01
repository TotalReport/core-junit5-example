package com.craftens.totalreport.junit5example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
public class AssertionErrorInBeforeAllTest {
    @BeforeAll
    public static void beforeAll1() {
        log.info("beforeAll1");
    }

    @BeforeAll
    public static void beforeAll2() {
        log.info("beforeAll2");
        throw new AssertionError("Exception in beforeAll2");
    }

    @BeforeAll
    public static void beforeAll3() {
        log.info("beforeAll3");
    }

    @BeforeEach
    public void beforeEach() {
        log.info("beforeEach");
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
