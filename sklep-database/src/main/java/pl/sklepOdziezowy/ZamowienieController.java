package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ZamowienieController {
    @Autowired
    ZamowienieRepository zamowienieRepository;

    @RequestMapping(value = "/zamowienie/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Zamowienie> getById(@RequestParam(value = "id") long id){
        return zamowienieRepository.findById(id);
    }
    @RequestMapping(value = "/zamowienie/",method = RequestMethod.GET)
    public List<Zamowienie> getAll(){
        return zamowienieRepository.findAll();
    }
}
