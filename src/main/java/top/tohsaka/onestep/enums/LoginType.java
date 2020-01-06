package top.tohsaka.onestep.enums;

/**
 * 登陆类型
 */
public enum LoginType {
    USER((byte)0,"用户","user"),
    DRIVER((byte)1,"司机","driver"),
    ADMIN((byte)2,"管理员","admin");

    private byte type;
    private String chname;
    private String enname;

    LoginType(byte type, String chname, String enname) {
        this.type = type;
        this.chname = chname;
        this.enname = enname;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
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
