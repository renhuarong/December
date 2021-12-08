package com.example.decemberdomain.response;

import com.example.decemberdomain.response.BaseResponse;
import com.example.service.enums.BaseEnum;

public class BaseResponseUtil {
    public static <T> BaseResponse<T> buildSuccessResponse() {
        return BaseResponse
                .newSuccResponse()
                .build();
    }

    public static <T> BaseResponse<T> buildSuccessResponse(T result) {
        return BaseResponse
                .newSuccResponse()
                .result(result)
                .build();
    }

    public static <T> BaseResponse<T> buildFailResponse() {
        return BaseResponse
                .newFailResponse()
                .build();
    }

    public static <T> BaseResponse<T> buildFailResponse(Integer errorCode) {
        return BaseResponse
                .newFailResponse()
                .errorCode(errorCode)
                .build();
    }

    public static <T> BaseResponse<T> buildFailResponse(String errorMsg) {
        return BaseResponse
                .newFailResponse()
                .errorMsg(errorMsg)
                .build();
    }

    public static <T> BaseResponse<T> buildFailResponse(Integer errorCode, String errorMsg) {
        return BaseResponse
                .newFailResponse()
                .errorCode(errorCode)
                .errorMsg(errorMsg)
                .build();
    }

    public static <T> BaseResponse<T> buildFailResponse(BaseEnum errorCodeEnum) {
        return BaseResponse
                .newFailResponse()
                .errorCode(errorCodeEnum.getCode())
                .errorMsg(errorCodeEnum.getDesc())
                .build();
    }
}
