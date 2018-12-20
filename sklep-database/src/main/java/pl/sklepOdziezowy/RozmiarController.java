package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RozmiarController {
    @Autowired
    RozmiarRepository rozmiarRepository;

    @RequestMapping(value = "/rozmiar/{id}",method = RequestMethod.GET)
    public Rozmiar getById(@PathVariable long id){
        return rozmiarRepository.getOne(id);
    }
    @RequestMapping(value = "/rozmiar/",method = RequestMethod.GET)
    public List<Rozmiar> getAll(){
        return rozmiarRepository.findAll();
    }
}
