package at.refugeescode.mp11piratesofthecodebean3.persistence;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pirate {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToOne
    private PieceOfEight pieceOfEight;

}
