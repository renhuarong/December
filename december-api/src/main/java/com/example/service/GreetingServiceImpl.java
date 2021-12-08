package com.example.service;

import com.example.decemberdomain.request.GreetingRequest;
import com.example.decemberdomain.response.GreetingResponse;
import org.springframework.stereotype.Service;

@Service
public  class GreetingServiceImpl implements GreetingService{

    @Override
    public  GreetingResponse getContent(GreetingRequest request){
        GreetingResponse greetingResponse = new GreetingResponse();
        if (1 == request.getId() ) {
            greetingResponse.setContent("orange");
        } else {
            greetingResponse.setContent("apple");
        }

        return greetingResponse;

    }

}
