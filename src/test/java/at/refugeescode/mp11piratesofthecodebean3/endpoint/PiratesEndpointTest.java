package at.refugeescode.mp11piratesofthecodebean3.endpoint;

import at.refugeescode.mp11piratesofthecodebean3.persistence.PieceOfEight;
import at.refugeescode.mp11piratesofthecodebean3.persistence.Pirate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PiratesEndpointTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;

    private String url;

    @BeforeEach
    public void setUrl() {
        url = "http://localhost:" + port + "/pirates";
    }

    @Test
    void findAll() {
        ResponseEntity<Pirate[]> responseEntity = testRestTemplate.getForEntity(url, Pirate[].class);
        Pirate[] result = responseEntity.getBody();
        List<Pirate> expectedValues = generator();
        Pirate[] expected = new Pirate[expectedValues.size()];
        expectedValues.toArray(expected);

        doAssertions(result, expected);
    }

    private List<Pirate> generator() {
        List<Pirate> expected = new ArrayList<>();

        Pirate p8 = new Pirate();
        p8.setName("Ammand the Corsair");
        PieceOfEight pe8 = new PieceOfEight();
        pe8.setName("Small pewter brandy goblet");
        p8.setPieceOfEight(pe8);
        expected.add(p8);

        Pirate p7 = new Pirate();
        p7.setName("Hector Barbossa");
        PieceOfEight pe7 = new PieceOfEight();
        pe7.setName("Wooden eyebal");
        p7.setPieceOfEight(pe7);
        expected.add(p7);

        Pirate p6 = new Pirate();
        p6.setName("Chevalle");
        PieceOfEight pe6 = new PieceOfEight();
        pe6.setName("Queen of Spades playing card");
        p6.setPieceOfEight(pe6);
        expected.add(p6);

        Pirate p5 = new Pirate();
        p5.setName("Mistress Ching");
        PieceOfEight pe5 = new PieceOfEight();
        pe5.setName("Pair of spectacles");
        p5.setPieceOfEight(pe5);
        expected.add(p5);

        Pirate p4 = new Pirate();
        p4.setName("Elizabeth Swann");
        PieceOfEight pe4 = new PieceOfEight();
        pe4.setName("Jade Captain's knot");
        p4.setPieceOfEight(pe4);
        expected.add(p4);

        Pirate p3 = new Pirate();
        p3.setName("King Samuel");
        PieceOfEight pe3 = new PieceOfEight();
        pe3.setName("Pair of tobacco cutters");
        p3.setPieceOfEight(pe3);
        expected.add(p3);

        Pirate p2 = new Pirate();
        p2.setName("Jack Sparrow");
        PieceOfEight pe2 = new PieceOfEight();
        pe2.setName("Siamese coin woven into Moroccan beads");
        p2.setPieceOfEight(pe2);
        expected.add(p2);

        Pirate p1 = new Pirate();
        p1.setName("Sri Sumbhajee Angria");
        PieceOfEight pe1 = new PieceOfEight();
        pe1.setName("Calf-horn Snuff box");
        p1.setPieceOfEight(pe1);
        expected.add(p1);

        Pirate p9 = new Pirate();
        p9.setName("Eduardo Villanueva");
        PieceOfEight pe9 = new PieceOfEight();
        pe9.setName("Broken bottle-neck with a cork on a string");
        p9.setPieceOfEight(pe9);
        expected.add(p9);

        return expected;
    }

    private void doAssertions(Pirate[] result, Pirate[] expected) {
        assertEquals(expected[0].getName(), result[0].getName());
        assertEquals(expected[0].getPieceOfEight().getName(), result[0].getPieceOfEight().getName());
        assertEquals(expected[1].getName(), result[1].getName());
        assertEquals(expected[1].getPieceOfEight().getName(), result[1].getPieceOfEight().getName());
        assertEquals(expected[2].getName(), result[2].getName());
        assertEquals(expected[2].getPieceOfEight().getName(), result[2].getPieceOfEight().getName());
        assertEquals(expected[3].getName(), result[3].getName());
        assertEquals(expected[3].getPieceOfEight().getName(), result[3].getPieceOfEight().getName());
        assertEquals(expected[4].getName(), result[4].getName());
        assertEquals(expected[4].getPieceOfEight().getName(), result[4].getPieceOfEight().getName());
        assertEquals(expected[5].getName(), result[5].getName());
        assertEquals(expected[5].getPieceOfEight().getName(), result[5].getPieceOfEight().getName());
        assertEquals(expected[6].getName(), result[6].getName());
        assertEquals(expected[6].getPieceOfEight().getName(), result[6].getPieceOfEight().getName());
        assertEquals(expected[7].getName(), result[7].getName());
        assertEquals(expected[7].getPieceOfEight().getName(), result[7].getPieceOfEight().getName());
        assertEquals(expected[8].getName(), result[8].getName());
        assertEquals(expected[8].getPieceOfEight().getName(), result[8].getPieceOfEight().getName());
    }

}