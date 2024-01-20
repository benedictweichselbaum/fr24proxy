package weichselbaum.fr24proxy.control.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "fr24FeedClient", url = "http://172.17.3.15:8754")
public interface Fr24FeedClient {

    @GetMapping("/flights.json")
    Map<String, List<?>> getFeed();
}
