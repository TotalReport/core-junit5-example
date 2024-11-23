package com.craftens.totalreport.junit5example;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
public class TripledSimpleTest {
    @BeforeAll
    public static void beforeAll1() {
        log.info("before all activity 1");
    }

    @BeforeAll
    public static void beforeAll2() {
        log.info("before all activity 2");
    }

    @BeforeAll
    public static void beforeAll3() {
        log.info("before all activity 3");
    }

    @BeforeEach
    public void beforeEach1() throws InterruptedException {
        log.info("before each activity 1");
        Thread.sleep(1);
    }

    @BeforeEach
    public void beforeEach2() throws InterruptedException {
        log.info("before each activity 2");
        Thread.sleep(1);
    }

    @BeforeEach
    public void beforeEach3() throws InterruptedException {
        log.info("before each activity 3");
        Thread.sleep(1);
    }

    @Test
    public void test1() throws InterruptedException {
        log.info("Test activity 1");
        Thread.sleep(1);
    }

    @Test
    public void test2() throws InterruptedException {
        log.info("Test activity 2");
        Thread.sleep(1);
    }

    @Test
    public void test3() throws InterruptedException {
        log.info("Test activity 3");
        Thread.sleep(1);
    }

    @AfterEach
    public void afterEach1() throws InterruptedException {
        log.info("after each activity 1");
        Thread.sleep(1);
    }

    @AfterEach
    public void afterEach2() throws InterruptedException {
        log.info("after each activity 2");
        Thread.sleep(1);
    }

    @AfterEach
    public void afterEach3() throws InterruptedException {
        log.info("after each activity 3");
        Thread.sleep(1);
    }

    @AfterAll
    public static void afterAll1() {
        log.info("after all activity 1");
    }

    @AfterAll
    public static void afterAll2() {
        log.info("after all activity 2");
    }

    @AfterAll
    public static void afterAll3() {
        log.info("after all activity 3");
    }
}
