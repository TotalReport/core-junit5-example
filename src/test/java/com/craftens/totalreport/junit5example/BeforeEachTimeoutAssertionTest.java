package com.craftens.totalreport.junit5example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

@Slf4j
public class BeforeEachTimeoutAssertionTest {

    @BeforeAll
    public static void beforeAll() throws InterruptedException {
        log.info("beforeAll");
        Thread.sleep(1);
    }

    @BeforeEach
    public void beforeEach1() throws InterruptedException {
        log.info("beforeEach1");
        Thread.sleep(1);
    }

    @BeforeEach
    @Timeout(value = 1, unit = TimeUnit.NANOSECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
    public void beforeEach2() throws InterruptedException {
        log.info("beforeEach2");
        Thread.sleep(1);
    }

    @BeforeEach
    public void beforeEach3() throws InterruptedException {
        log.info("beforeEach3");
        Thread.sleep(1);
    }

    @Test
    public void test() throws InterruptedException {
        log.info("Test method");
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
