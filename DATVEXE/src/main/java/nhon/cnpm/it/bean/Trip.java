package nhon.cnpm.it.bean;

import java.util.Date;

public class Trip {
    String id;
    String startPoint;
    String endPoint;
    String placePoint;
    Date startDate;
    String startTime;
    int price;

    public Trip(String id, String startPoint, String endPoint, String placePoint, Date startDate, String startTime, int price) {
        this.id = id;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.placePoint = placePoint;
        this.startDate = startDate;
        this.startTime = startTime;
        this.price = price;
    }

    public Trip() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getPlacePoint() {
        return placePoint;
    }

    public void setPlacePoint(String placePoint) {
        this.placePoint = placePoint;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id='" + id + '\'' +
                ", startPoint='" + startPoint + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", placePoint='" + placePoint + '\'' +
                ", startDate=" + startDate +
                ", startTime='" + startTime + '\'' +
                ", price=" + price +
                '}';
    }
}
