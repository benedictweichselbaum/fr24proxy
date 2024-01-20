package weichselbaum.fr24proxy.control.service;

import org.springframework.stereotype.Service;
import weichselbaum.fr24proxy.boundary.model.Flight;

import java.util.List;
import java.util.Map;

@Service
public class FeedFlightConverterService {

    private static final int LATITUDE_LIST_POS = 1;
    private static final int LONGITUDE_LIST_POS = 2;
    private static final int ALTITUDE_LIST_POS = 4;
    private static final int SQUAWK_LIST_POS = 6;
    private static final int CALL_SIGN_LIST_POS = 16;

    public List<Flight> convertFeed(Map<String, List<?>> feed) {
        return feed.values()
                .stream()
                .map(this::convertSingleFlight)
                .filter(this::isValidFlight)
                .toList();
    }

    private Flight convertSingleFlight(List<?> feedEntry) {
        Flight flight = new Flight();
        flight.setLatitude((Number) feedEntry.get(LATITUDE_LIST_POS));
        flight.setLongitude((Number) feedEntry.get(LONGITUDE_LIST_POS));
        flight.setAltitude((Number) feedEntry.get(ALTITUDE_LIST_POS));
        flight.setSquawk((String) feedEntry.get(SQUAWK_LIST_POS));
        flight.setCallSign((String) feedEntry.get(CALL_SIGN_LIST_POS));

        return flight;
    }

    private boolean isValidFlight(Flight flight) {
        return !flight.getLongitude().equals(0) && !flight.getLatitude().equals(0);
    }
}
