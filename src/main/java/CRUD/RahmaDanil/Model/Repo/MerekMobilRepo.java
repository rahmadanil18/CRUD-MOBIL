package CRUD.RahmaDanil.Model.Repo;

import CRUD.RahmaDanil.Model.Entity.MerekMobil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerekMobilRepo extends JpaRepository<MerekMobil, Integer> {}
