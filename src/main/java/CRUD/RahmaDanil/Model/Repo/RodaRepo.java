package CRUD.RahmaDanil.Model.Repo;

import CRUD.RahmaDanil.Model.Entity.Roda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RodaRepo extends JpaRepository<Roda, Integer> {}
