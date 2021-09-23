package CRUD.RahmaDanil.Controller.rest;

import CRUD.RahmaDanil.Model.Entity.Porche;
import CRUD.RahmaDanil.Service.Implement.MobilServiceEmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestAPI {
    MobilServiceEmpl serviceEmpl;

    @Autowired
    public RestAPI(MobilServiceEmpl serviceEmpl) {
        this.serviceEmpl = serviceEmpl;
    }

    @GetMapping()
    public List<Porche> AllData(){
        return serviceEmpl.getMobil();
    }

    @PostMapping()
    public String saveData(@RequestBody Porche porche){
        serviceEmpl.save(porche);
        return "berhasil disimpan";
    }

    @GetMapping("/{id}")
    public Porche getData(@PathVariable("id") Integer id){
        return serviceEmpl.getMobilId(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id){
        serviceEmpl.delete(id);
        return "berhasil dihapus";
    }
}
