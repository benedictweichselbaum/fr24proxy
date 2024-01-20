package weichselbaum.fr24proxy.boundary;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import weichselbaum.fr24proxy.boundary.model.Flight;
import weichselbaum.fr24proxy.control.Fr24ProxyOrchestrator;

import java.util.Collections;
import java.util.List;

@RestController
public class ProxyApi {

    private final Fr24ProxyOrchestrator fr24ProxyOrchestrator;

    public ProxyApi(Fr24ProxyOrchestrator fr24ProxyOrchestrator) {
        this.fr24ProxyOrchestrator = fr24ProxyOrchestrator;
    }

    @GetMapping("/fr24proxy")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Flight>> getFlightsFromFeed() {
        return ResponseEntity.ok(fr24ProxyOrchestrator.fetchCurrentFr24Feed());
    }
}
