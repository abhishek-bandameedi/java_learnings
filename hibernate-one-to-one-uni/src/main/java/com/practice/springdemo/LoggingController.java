package com.practice.springdemo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingController {
    public static void main(String[] args) {
        log.info("Info level log");
        log.trace("A trace message");
        log.debug("a debug message");
        log.warn("a warn message");
        log.error("error level log");
    }
}
