package top.tohsaka.onestep.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 路线
 */
public class Line implements Serializable {
    private static final long serialVersionUID = 7143676078753961799L;
    private Integer id;

    private Integer start;

    private Integer end;

    private BigDecimal distance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }
}