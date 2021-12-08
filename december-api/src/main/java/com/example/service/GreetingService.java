package com.example.service;

import com.example.decemberdomain.request.GreetingRequest;
import com.example.decemberdomain.response.GreetingResponse;

public interface GreetingService {

    GreetingResponse getContent(GreetingRequest request);

}
