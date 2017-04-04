package com.doctrly.integration.allscripts.stream.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;

import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;


public interface CustomProcessor extends Source, Sink {

    String OUTPUT = "app1-data-source";
    @Output(OUTPUT)
    MessageChannel output();


    String INPUT = "app1-data-sink";
    @Input(INPUT)
    SubscribableChannel input();

}
