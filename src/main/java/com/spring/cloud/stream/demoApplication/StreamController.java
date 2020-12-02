package com.spring.cloud.stream.demoApplication;

import com.spring.cloud.stream.demoApplication.entity.Transaction;
import com.spring.cloud.stream.demoApplication.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

@EnableBinding(StreamChannels.class)
@Controller
public class StreamController {

    @Autowired
    TransactionRepository transactionRepository;

    @StreamListener(StreamChannels.PROCESS_TRANSCTIONS)
    public void processTransaction(Message msg) {

        Transaction transaction = new Transaction();

        transaction.setMessage(msg.getPayload().toString());

        transactionRepository.save(transaction);

        System.out.println("Message processed successfully!!!");
    }
}
