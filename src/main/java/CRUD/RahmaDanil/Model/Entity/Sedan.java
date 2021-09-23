package CRUD.RahmaDanil.Model.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Sedan extends Mobil{
   private String model;
}
