package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KolorController {
    @Autowired
    KolorRepository kolorRepository;

    @RequestMapping(value = "/kolor/{id}",method = RequestMethod.GET)
    public Kolor getById(@PathVariable long id){
        return kolorRepository.getOne(id);
    }
    @RequestMapping(value = "/kolor/",method = RequestMethod.GET)
    public List<Kolor> getAll(){
        return kolorRepository.findAll();
    }
}
