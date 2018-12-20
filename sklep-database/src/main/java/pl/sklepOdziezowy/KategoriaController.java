package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KategoriaController {
    @Autowired
    KategoriaRepository kategoriaRepository;

    @RequestMapping(value = "/kategoria/{id}",method = RequestMethod.GET)
    public Kategoria getById(@PathVariable long id){
        return kategoriaRepository.getOne(id);
    }
    @RequestMapping(value = "/kategoria/",method = RequestMethod.GET)
    public List<Kategoria> getAll(){
        return kategoriaRepository.findAll();
    }
}
