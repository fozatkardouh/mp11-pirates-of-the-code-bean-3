package at.refugeescode.mp11piratesofthecodebean3.logic;

import at.refugeescode.mp11piratesofthecodebean3.persistence.PieceOfEight;
import at.refugeescode.mp11piratesofthecodebean3.persistence.PieceOfEightRepository;
import at.refugeescode.mp11piratesofthecodebean3.persistence.Pirate;
import at.refugeescode.mp11piratesofthecodebean3.persistence.PirateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PirateService {

    private final PirateRepository pirateRepository;
    private final PieceOfEightRepository pieceOfEightRepository;
    private final CsvParser csvParser;

    public void populatePirates() {
        deleteAll();

        PirateModule pirateModule = new PirateModule("classpath:pirates.csv");
        List<Pirate> pirates = csvParser.asList(pirateModule);

        pirates.forEach(this::process);
    }

    void deleteAll() {
        pirateRepository.deleteAll();
        pieceOfEightRepository.deleteAll();
    }

    private void process(Pirate pirate) {
        PieceOfEight pieceOfEight = pieceOfEightRepository.save(pirate.getPieceOfEight());
        pirate.setPieceOfEight(pieceOfEight);
        pirateRepository.save(pirate);
    }

    public List<Pirate> findAll() {
        return pirateRepository.findAll();
    }

}
