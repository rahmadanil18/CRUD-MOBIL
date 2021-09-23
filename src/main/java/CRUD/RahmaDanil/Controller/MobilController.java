package CRUD.RahmaDanil.Controller;

import CRUD.RahmaDanil.Model.Entity.Porche;
import CRUD.RahmaDanil.Model.Repo.MerekMobilRepo;
import CRUD.RahmaDanil.Model.Repo.RodaRepo;
import CRUD.RahmaDanil.Service.Implement.MobilServiceEmpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MobilController {
    MobilServiceEmpl serviceEmpl;
    RodaRepo rodaRepo;
    MerekMobilRepo mobilRepo;

    @Autowired
    public MobilController(MobilServiceEmpl serviceEmpl, RodaRepo rodaRepo, MerekMobilRepo mobilRepo) {
        this.serviceEmpl = serviceEmpl;
        this.rodaRepo = rodaRepo;
        this.mobilRepo = mobilRepo;
    }

    @GetMapping("/mobil")
    public String Data(Model model){
        List<Porche> porcheList = serviceEmpl.getMobil();
        model.addAttribute("porcheList",porcheList);
        return "index";
    }

    @GetMapping("/new")
    public String New(Model model){
        model.addAttribute("data",new Porche());
        model.addAttribute("listmerek",mobilRepo.findAll());
        model.addAttribute("roda",rodaRepo.findAll());
        return "Form";
    }

    @PostMapping("/simpan")
    public String Save(Porche porche){
        System.out.println(porche);
        serviceEmpl.save(porche);
        return "redirect:/mobil";
    }

    @GetMapping("/edit/{id}")
    public String Update(@PathVariable("id") Integer id, Model model){
        model.addAttribute("data",serviceEmpl.getMobilId(id));
        model.addAttribute("listmerek",mobilRepo.findAll());
        model.addAttribute("roda",rodaRepo.findAll());
        return "Form";
    }

    @GetMapping("/hapus/{id}")
    public String Delete(@PathVariable("id") Integer id){
        serviceEmpl.delete(id);
        return "redirect:/mobil";
    }

}
