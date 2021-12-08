package com.example.Controller;

import com.example.decemberdomain.request.GreetingRequest;
import com.example.decemberdomain.response.BaseResponse;
import com.example.decemberdomain.response.GreetingResponse;
import com.example.service.GreetingService;
import com.example.decemberdomain.response.BaseResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping(value = "/december/greeting")
public class GreetingController {

    @Autowired
    GreetingService greetingService;


    @ResponseBody
    @RequestMapping(value = "/getContent",method = RequestMethod.POST)
    public BaseResponse<GreetingResponse> getContent(@Validated @RequestBody GreetingRequest request){
        return BaseResponseUtil.buildSuccessResponse(greetingService.getContent(request));
    }


}
