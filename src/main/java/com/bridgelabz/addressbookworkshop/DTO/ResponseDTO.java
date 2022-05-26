package com.bridgelabz.addressbookworkshop.DTO;

public class ResponseDTO {
    String message;
    Object data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
