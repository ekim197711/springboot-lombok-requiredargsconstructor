package com.example.demo.train;

import com.example.demo.train.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TrainConfiguration {

    @Bean(name="cooltrain")
    public Train coolTrain(){
        return new Train("Cool Train Express", 320.0d);
    }

    @Bean(name="slowtrain")
    public Train slowTrain(){
        return new Train("Slow Train Tju tjuu", 220.0d);
    }
}
