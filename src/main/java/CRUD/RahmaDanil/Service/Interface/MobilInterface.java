package CRUD.RahmaDanil.Service.Interface;

import CRUD.RahmaDanil.Model.Entity.Mobil;
import CRUD.RahmaDanil.Model.Entity.Porche;
import CRUD.RahmaDanil.Model.Entity.Sedan;

import java.util.List;

public interface MobilInterface {
    List<Porche> getMobil();
    void save(Porche porche);
    Porche getMobilId(Integer id);
    void delete(Integer id);
}
