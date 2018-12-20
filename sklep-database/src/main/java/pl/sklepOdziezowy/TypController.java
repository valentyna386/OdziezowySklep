package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypController {
    @Autowired
    TypRepository typRepository;

    @RequestMapping(value = "/typ/{id}",method = RequestMethod.GET)
    public Typ getById(@PathVariable long id){
        return typRepository.getOne(id);
    }
    @RequestMapping(value = "/typ/",method = RequestMethod.GET)
    public List<Typ> getAll(){
        return typRepository.findAll();
    }
}
