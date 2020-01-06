package top.tohsaka.onestep.enums;

public enum Result {
    SUCCESS(200,true,"OK"),
    FAILED(100,false,"操作失败"),
    WARN(101,true,"警告"),
    ERROR(500,false,"服务繁忙"),
    NOT_LOGIN(301,false,"没有登陆");

    private int code;
    private boolean success;
    private String msg;

    Result(int code, boolean success, String msg) {
        this.code = code;
        this.success = success;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
