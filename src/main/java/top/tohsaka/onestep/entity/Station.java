package top.tohsaka.onestep.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 车站
 */
public class Station implements Serializable {
    private static final long serialVersionUID = 2705675722182237175L;
    private Integer id;

    private String name;

    private BigDecimal lng;

    private BigDecimal lat;

    private String logo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }
}