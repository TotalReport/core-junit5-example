package com.craftens.totalreport.junit5example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
public class ExceptionInTestTest {
    @BeforeAll
    public static void beforeAll() {
        log.info("beforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        log.info("beforeEach");
    }

    @Test
    public void test1() {
        log.info("Test method1");
    }

    @Test
    public void test2() {
        log.info("Test method2");
        throw new RuntimeException("Exception in test2");
    }

    @Test
    public void test3() {
        log.info("Test method3");
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
