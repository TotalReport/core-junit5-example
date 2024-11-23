package com.craftens.totalreport.junit5example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Slf4j
public class DisabledTestTest {

    @BeforeAll
    public static void beforeAll() {
        log.info("beforeAll");
    }

    @BeforeEach
    public void beforeEach() throws InterruptedException {
        log.info("beforeEach");
        Thread.sleep(1);
    }

    @Test
    public void test1() throws InterruptedException {
        log.info("Test method1");
        Thread.sleep(1);
    }

    @Disabled
    @Test
    public void test2() throws InterruptedException {
        log.info("Test method2");
        Thread.sleep(1);
    }

    @Test
    public void test3() throws InterruptedException {
        log.info("Test method3");
        Thread.sleep(1);
    }

    @AfterEach
    public void afterEach() throws InterruptedException {
        log.info("afterEach");
        Thread.sleep(1);
    }

    @AfterAll
    public static void afterAll() {
        log.info("afterAll");
    }
}
