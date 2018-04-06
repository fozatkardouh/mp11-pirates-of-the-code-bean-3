package at.refugeescode.mp11piratesofthecodebean3.persistence;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class PieceOfEight {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
