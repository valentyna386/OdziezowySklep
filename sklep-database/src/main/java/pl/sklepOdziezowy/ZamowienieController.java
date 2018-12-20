package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZamowienieController {
    @Autowired
    ZamowienieRepository zamowienieRepository;

    @RequestMapping(value = "/zamowienie/{id}",method = RequestMethod.GET)
    public Zamowienie getById(@PathVariable long id){
        return zamowienieRepository.getOne(id);
    }
    @RequestMapping(value = "/zamowienie/",method = RequestMethod.GET)
    public List<Zamowienie> getAll(){
        return zamowienieRepository.findAll();
    }
}
