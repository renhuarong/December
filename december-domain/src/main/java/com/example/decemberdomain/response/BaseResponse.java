package com.example.decemberdomain.response;

import com.example.service.enums.ErrorCode;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse<T> implements Serializable {
    public static final Long serialVersionUID=1l;
    protected Boolean success;
    protected Integer errorCode;
    protected String  errorMsg;
    protected T result;

    private BaseResponse(Builder<T> builder){
        this.success =builder.success;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.result = builder.result;
    }

    public static Builder newSuccResponse() {
        return new Builder().success(true);
    }
    public static <T> Builder<T> success() {
        return new Builder<T>().success(true);
    }

    public static <T> Builder<T> success(T data) {
        return new Builder<T>(data).success(true);
    }

    public static Builder newFailResponse() {
        return new Builder().success(false);
    }

    public static <T> Builder<T> fail() {
        return new Builder<T>().success(false);
    }


    public static final class Builder<T>{
        private Boolean success;
        private Integer errorCode;
        private String  errorMsg;
        private T result;

        private  Builder(){};
        private Builder(T data){
            this.result=data;
        }
        public BaseResponse<T> build(){return  new BaseResponse<>(this);}
        public  Builder<T> success(Boolean success){
            this.success=success;
            this.errorCode = ErrorCode.SUCCESS.getCode();
            return this;
        }
        public Builder<T> errorCode(Integer errCode){
            this.errorCode = errCode;
            return this;
        }
        public Builder<T> errorMsg(String errorMsg){
            this.errorMsg = errorMsg;
            return this;
        }
        public Builder<T> result(T result){
            this.result = result;
            return this;
        }

    }
    public boolean isSuccess() {
        return success;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public T getResult() {
        return result;
    }
}
