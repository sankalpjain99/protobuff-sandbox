package com.sankalp.protobufsandbox;

import com.sankalp.protobuf.SampleRequest;
import io.micronaut.context.annotation.Context;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Context
@Slf4j
public class SimpleProtoService {

    @PostConstruct
    public void init() {
        SampleRequest request = SampleRequest.newBuilder()
                .setText("Hello World")
                .build();
        log.info("Class Initialized with message: {}", request.getText());
    }

}

