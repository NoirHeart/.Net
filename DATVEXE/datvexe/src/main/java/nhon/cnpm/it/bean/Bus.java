package nhon.cnpm.it.bean;

import java.util.List;

public class Bus {
    String id;
    String type;
    int numberOfChair;
    List<String> chairNumber;

    public Bus(String id, String type, int numberOfChair) {
        this.id = id;
        this.type = type;
        this.numberOfChair = numberOfChair;
    }

    public Bus(String id, String type, int numberOfChair, List<String> chairNumber) {
        this.id = id;
        this.type = type;
        this.numberOfChair = numberOfChair;
        this.chairNumber = chairNumber;
    }

    public Bus() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfChair() {
        return numberOfChair;
    }

    public void setNumberOfChair(int numberOfChair) {
        this.numberOfChair = numberOfChair;
    }

    public List<String> getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(List<String> chairNumber) {
        this.chairNumber = chairNumber;
    }
}
