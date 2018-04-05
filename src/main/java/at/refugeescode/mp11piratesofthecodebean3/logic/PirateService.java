package at.refugeescode.mp11piratesofthecodebean3.logic;

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

        // delete all the pirates and pieces of eight from the database
        // use the csvParser to get a list of all the pirates, the path should be "classpath:pirates.csv"
        // for each pirate, save first manually the piece of eight,
        // connect it to the corresponding pirate and then save the pirate
    }

    public List<Pirate> findAll() {
        return null; // return all the pirates from the database
    }

    public void deleteAll() {

        // delete all pirates
        // delete all pieces of eight

    }

}
