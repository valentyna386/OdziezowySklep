package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RabatController {
    @Autowired
    RabatRepository rabatRepository;

    @RequestMapping(value = "/rabat/{id}",method = RequestMethod.GET)
    public Rabat getById(@PathVariable long id){
        return rabatRepository.getOne(id);
    }
    @RequestMapping(value = "/rabat/",method = RequestMethod.GET)
    public List<Rabat> getAll(){
        return rabatRepository.findAll();
    }
}
