package at.refugeescode.mp11piratesofthecodebean3.endpoint;

import at.refugeescode.mp11piratesofthecodebean3.logic.PirateService;
import at.refugeescode.mp11piratesofthecodebean3.persistence.Pirate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pirates")
public class PiratesEndpoint {

    private final PirateService pirateService;

    @GetMapping
    List<Pirate> findAll() {
        pirateService.populatePirates();
        return pirateService.findAll();
    }

}
