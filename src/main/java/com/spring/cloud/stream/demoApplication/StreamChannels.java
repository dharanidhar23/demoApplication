package com.spring.cloud.stream.demoApplication;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

import java.lang.annotation.Inherited;

public interface StreamChannels {
    String PROCESS_TRANSCTIONS = "processTransactions";

    @Input(StreamChannels.PROCESS_TRANSCTIONS)
    SubscribableChannel processTransactions();
}
