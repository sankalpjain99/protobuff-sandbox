package com.sankalp.protobufsandbox;

import io.micronaut.context.annotation.Context;
import lombok.extern.slf4j.Slf4j;
import javax.annotation.PostConstruct;

@Context
@Slf4j
public class SimpleProtoService {

    @PostConstruct
    public void init() {
        log.info("Class Initialized");
    }

}

