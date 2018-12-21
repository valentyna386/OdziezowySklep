package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RabatController {
    @Autowired
    RabatRepository rabatRepository;

    @RequestMapping(value = "/rabat/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Rabat> getById(@RequestParam(value = "id") long id){
        return rabatRepository.findById(id);
    }
    @RequestMapping(value = "/rabat/",method = RequestMethod.GET)
    public List<Rabat> getAll(){
        return rabatRepository.findAll();
    }
}
