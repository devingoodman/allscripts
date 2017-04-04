package com.doctrly.integration.allscripts.stream.processor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

@EnableBinding(CustomProcessor.class)
public class ProcessorModule {


    @Transformer(inputChannel = CustomProcessor.INPUT, outputChannel = CustomProcessor.OUTPUT)
    public Message<?> transform(Message<?> inboundMessage) {

        System.out.println("Receiving\t: " + inboundMessage.getPayload().toString());

        String payload = inboundMessage.getPayload().toString().toUpperCase();
        System.out.println("Transforming\t: " + payload);
        //System.out.println("\t2 Message id\t: " + inboundMessage.getHeaders().get("id"));

        Message<String> outboundMessage = MessageBuilder.withPayload(payload)
                .setHeader("custom_header_1", "custom_header_1_value")
                .build();

        System.out.println("Sending\t\t: " + outboundMessage.toString());
        return outboundMessage;
    }

}
