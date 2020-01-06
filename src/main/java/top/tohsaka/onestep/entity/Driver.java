package top.tohsaka.onestep.entity;

import java.io.Serializable;

/**
 * 司机
 */
public class Driver implements Serializable {
    private static final long serialVersionUID = 1289277295905291950L;
    private Integer id;

    private String tel;

    private String openid;

    private String alipayid;

    private String password;

    private Integer carId;

    private String name;

    private String idcard;

    private String certFace;

    private String certWrong;

    private String halfLength;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getAlipayid() {
        return alipayid;
    }

    public void setAlipayid(String alipayid) {
        this.alipayid = alipayid == null ? null : alipayid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getCertFace() {
        return certFace;
    }

    public void setCertFace(String certFace) {
        this.certFace = certFace == null ? null : certFace.trim();
    }

    public String getCertWrong() {
        return certWrong;
    }

    public void setCertWrong(String certWrong) {
        this.certWrong = certWrong == null ? null : certWrong.trim();
    }

    public String getHalfLength() {
        return halfLength;
    }

    public void setHalfLength(String halfLength) {
        this.halfLength = halfLength == null ? null : halfLength.trim();
    }
}