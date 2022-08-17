package asyntest02.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author ymx
 * @Name Response
 * @CreateTime 2022/8/16
 * @ProjectName AsynTest01
 * @Description:
 */

@Data
public class Response implements Serializable {

    private int code;

    private String message;

    private Object data;

    public Response(int code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static Response success(Object data) {
        return new Response(ResponseCode.success.getCode(),data,ResponseCode.success.getMessage());
    }

    public static Response fail(Object data) {
        return new Response(ResponseCode.fail.getCode(), data, ResponseCode.fail.getMessage());
    }
}
