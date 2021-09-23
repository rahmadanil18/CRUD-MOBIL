package CRUD.RahmaDanil.Model.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Mobil{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Roda roda;

    @ManyToOne
    private MerekMobil merekMobil;


}
