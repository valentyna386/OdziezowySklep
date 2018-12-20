package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UzytkownikController {
    @Autowired
    UzytkownikRepository uzytkownikRepository;

    @RequestMapping(value = "/uzytkownik/{id}",method = RequestMethod.GET)
    public Uzytkownik getById(@PathVariable long id){
        return uzytkownikRepository.getOne(id);
    }
    @RequestMapping(value = "/uzytkownik/",method = RequestMethod.GET)
    public List<Uzytkownik> getAll(){
        return uzytkownikRepository.findAll();
    }
}
