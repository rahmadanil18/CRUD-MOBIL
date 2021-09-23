package CRUD.RahmaDanil.Service.Implement;

import CRUD.RahmaDanil.Model.Entity.Mobil;
import CRUD.RahmaDanil.Model.Entity.Porche;
import CRUD.RahmaDanil.Model.Entity.Sedan;
import CRUD.RahmaDanil.Model.Repo.MobilRepo;
import CRUD.RahmaDanil.Service.Interface.MobilInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobilServiceEmpl implements MobilInterface {

    MobilRepo mobilRepo;

    @Autowired
    public MobilServiceEmpl(MobilRepo mobilRepo) {
        this.mobilRepo = mobilRepo;
    }

    @Override
    public List<Porche> getMobil() {
        return mobilRepo.findAll();
    }

    @Override
    public void save(Porche porche) {
        mobilRepo.save(porche);
    }

    @Override
    public Porche getMobilId(Integer id) {
        return mobilRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        mobilRepo.deleteById(id);
    }
}
