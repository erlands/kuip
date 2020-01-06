package top.tohsaka.onestep.entity;

import top.tohsaka.onestep.enums.LoginResult;
import top.tohsaka.onestep.enums.LoginType;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * 登陆日志
 */
public class LogLogin implements Serializable {
    private static final long serialVersionUID = -9059828346515487896L;
    private Long id;

    private Byte type;

    private String account;

    private String password;

    private Byte result;

    private String sessionid;

    private Date loginTime;

    private Date logoutTime;

    private Integer year;

    private Integer month;

    private Integer day;

    private Integer distId;

    public LogLogin() {
    }

    public LogLogin(LoginType type, String account, String password, String sessionid) {
        this.type = type.getType();
        this.account = account;
        this.password = password;
        this.sessionid = sessionid;
        this.init();
    }

    public LogLogin init(){
        Calendar calendar = Calendar.getInstance();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.day = calendar.get(Calendar.DATE);
        this.loginTime = calendar.getTime();
        return this;
    }

    public LogLogin result(LoginResult result){
        this.result = result.getStatus();
        return this;
    }

    public LogLogin success(Integer distId){
        this.result = LoginResult.SUCCESS.getStatus();
        this.distId = distId;
        return this;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getResult() {
        return result;
    }

    public void setResult(Byte result) {
        this.result = result;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid == null ? null : sessionid.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getDistId() {
        return distId;
    }

    public void setDistId(Integer distId) {
        this.distId = distId;
    }
}