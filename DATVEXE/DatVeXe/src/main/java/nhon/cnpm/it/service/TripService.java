package nhon.cnpm.it.service;
import nhon.cnpm.it.bean.Trip;
import nhon.cnpm.it.db.JDBIConnector;

import java.util.List;
import java.util.stream.Collectors;

public class TripService {
    public TripService(){}
    private static TripService instance;
    public static TripService getInstance() {
        if (instance == null) {
            instance = new TripService();
        }
        return instance;
    }
    public  List<Trip> getAllTrip() {
        List<Trip> trip = JDBIConnector.get().withHandle(h ->
                h.createQuery("SELECT id,startPoint, endPoint,placePoint,DATE(startTime) as startDate,TIME(startTime) as startTime, price FROM tuyenxe")
                        .mapToBean(Trip.class).stream()
                        .collect(Collectors.toList())
        );

        return trip;
    }



}
