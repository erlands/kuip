package top.tohsaka.onestep.enums;

/**
 * 登陆结果
 */
public enum LoginResult {
    SUCCESS((byte)0,"成功","success"),
    ACCOUNT_NOT_FOUND((byte)1,"账号不存在","account_not_found"),
    PASSWORD_WRONG((byte)2,"密码错误","password_wrong"),
    CODE_WRONG((byte)3,"验证码错误","auth_code_wrong"),
    ACCOUNT_DISABLED((byte)4,"账号被禁用","account_disabled");

    private byte status;
    private String chname;
    private String enname;

    LoginResult(byte status, String chname, String enname) {
        this.status = status;
        this.chname = chname;
        this.enname = enname;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getChname() {
        return chname;
    }

    public void setChname(String chname) {
        this.chname = chname;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }
}
