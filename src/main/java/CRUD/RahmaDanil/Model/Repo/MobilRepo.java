package CRUD.RahmaDanil.Model.Repo;

import CRUD.RahmaDanil.Model.Entity.Mobil;
import CRUD.RahmaDanil.Model.Entity.Porche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilRepo extends JpaRepository<Porche,Integer> { }
