package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TypController {
    @Autowired
    TypRepository typRepository;

    @RequestMapping(value = "/typ/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Typ> getById(@RequestParam(value = "id") long id){
        return typRepository.findById(id);
    }
    @RequestMapping(value = "/typ",method = RequestMethod.GET)
    public List<Typ> getAll(){
        return typRepository.findAll();
    }
}
