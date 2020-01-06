package top.tohsaka.onestep.model;

import org.json.JSONObject;
import top.tohsaka.onestep.enums.Result;

public class ResultModel<T> {

    private int code;
    private boolean success;
    private String msg;
    private T body;

    public static <T> ResultModel success(T body){
        return new ResultModel<T>(body);
    }

    public static ResultModel success(){
        return new ResultModel(null);
    }

    public static ResultModel failed(Result result,String msg){
        return new ResultModel(result,msg,null);
    }
    public static ResultModel failed(Result result){
        return new ResultModel(result,null);
    }
    public static ResultModel failed(String msg){
        return new ResultModel(Result.FAILED,msg,null);
    }

    public static <T> ResultModel warn(String msg,T body){
        return new ResultModel<T>(Result.FAILED,msg,body);
    }

    public static ResultModel error(){
        return new ResultModel(Result.ERROR,null);
    }

    public ResultModel(T body) {
        this(Result.SUCCESS,body);
    }

    public ResultModel(Result result,T body) {
        if(result != null) {
            this.code = result.getCode();
            this.success = result.isSuccess();
            this.msg = result.getMsg();
        }
        this.body = body;
    }

    public ResultModel(Result result,String msg,T body) {
        if(result != null) {
            this.code = result.getCode();
            this.success = result.isSuccess();
        }
        this.msg = msg;
        this.body = body;
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

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public JSONObject toJSON(){
        return new JSONObject(this);
    }
}
