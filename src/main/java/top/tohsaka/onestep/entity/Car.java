package top.tohsaka.onestep.entity;

public class Car {
    private Integer id;

    private Integer lineId;

    private String carNo;

    private String carInfo;

    private Byte seat;

    private String facade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo == null ? null : carInfo.trim();
    }

    public Byte getSeat() {
        return seat;
    }

    public void setSeat(Byte seat) {
        this.seat = seat;
    }

    public String getFacade() {
        return facade;
    }

    public void setFacade(String facade) {
        this.facade = facade == null ? null : facade.trim();
    }
}