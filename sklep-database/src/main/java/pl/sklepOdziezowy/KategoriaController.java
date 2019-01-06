package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class KategoriaController {
    @Autowired
    KategoriaRepository kategoriaRepository;

    @RequestMapping(value = "/kategoria/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Kategoria> getById(@RequestParam(value = "id") long id){
        return kategoriaRepository.findById(id);
    }
    @RequestMapping(value = "/kategoria",method = RequestMethod.GET)
    public List<Kategoria> getAll(){
        return kategoriaRepository.findAll();
    }
}
