package com.example.demo.train;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrainRestcontroller {
    @Qualifier(value="cooltrain")
    private final Train train;

    @GetMapping("/train")
    public Train getTrain(){
        return train;
    }
}
