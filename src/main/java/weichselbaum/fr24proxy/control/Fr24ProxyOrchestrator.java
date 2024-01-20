package weichselbaum.fr24proxy.control;

import org.springframework.stereotype.Component;
import weichselbaum.fr24proxy.boundary.model.Flight;
import weichselbaum.fr24proxy.control.rest.Fr24FeedClient;
import weichselbaum.fr24proxy.control.service.FeedFlightConverterService;

import java.util.List;

@Component
public class Fr24ProxyOrchestrator {

    private final Fr24FeedClient fr24FeedClient;

    private final FeedFlightConverterService feedFlightConverterService;

    public Fr24ProxyOrchestrator(Fr24FeedClient fr24FeedClient, FeedFlightConverterService feedFlightConverterService) {
        this.fr24FeedClient = fr24FeedClient;
        this.feedFlightConverterService = feedFlightConverterService;
    }

    public List<Flight> fetchCurrentFr24Feed() {
        var rawFeed = fr24FeedClient.getFeed();
        return feedFlightConverterService.convertFeed(rawFeed);
    }
}
