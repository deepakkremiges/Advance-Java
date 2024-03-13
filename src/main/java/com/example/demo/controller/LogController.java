package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestHeader;

public class LogController {

    protected final Logger logger = LoggerFactory.getLogger(LogController.class);

    protected void greeting(
            @RequestHeader String userid,
            @RequestHeader String api,
            @RequestHeader String status,
            @RequestHeader String error_code,
            @RequestHeader String error_message,
            @RequestHeader String clientRequestId,
            @RequestHeader String request) {

        MDC.put("userid", userid);
        MDC.put("api", api);
        MDC.put("status", status);
        MDC.put("error_code", error_code);
        MDC.put("error_message", error_message);
        MDC.put("clientRequestId", clientRequestId);
        MDC.put("request", request);

        // Log the message
        logger.debug("Kaam kar rha hai");

    }
}
