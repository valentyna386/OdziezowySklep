package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RozmiarController {
    @Autowired
    RozmiarRepository rozmiarRepository;

    @RequestMapping(value = "/rozmiar/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Rozmiar> getById(@RequestParam(value = "id") long id){
        return rozmiarRepository.findById(id);
    }
    @RequestMapping(value = "/rozmiar",method = RequestMethod.GET)
    public List<Rozmiar> getAll(){
        return rozmiarRepository.findAll();
    }
}
