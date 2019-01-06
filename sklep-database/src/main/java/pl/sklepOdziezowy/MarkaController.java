package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MarkaController {
    @Autowired
    MarkaRepository markaRepository;

    @RequestMapping(value = "/marka/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Marka> getById(@RequestParam(value = "id") long id){
        return markaRepository.findById(id);
    }
    @RequestMapping(value = "/marka",method = RequestMethod.GET)
    public List<Marka> getAll(){
        return markaRepository.findAll();
    }
}

