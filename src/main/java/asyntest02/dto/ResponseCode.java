package asyntest02.dto;

/**
 * @Author ymx
 * @Name ResponseCode
 * @CreateTime 2022/8/16
 * @ProjectName AsynTest01
 * @Description:
 */
public enum ResponseCode {

    success(00,"访问成功！"),

    fail(01,"访问失败！"),

    fusing(02,"熔断！");

    private int code;

    private String message;

    private ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
