package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarkaController {
    @Autowired
    MarkaRepository markaRepository;

    @RequestMapping(value = "/marka/{id}",method = RequestMethod.GET)
    public Marka getById(@PathVariable long id){
        return markaRepository.getOne(id);
    }
    @RequestMapping(value = "/marka/",method = RequestMethod.GET)
    public List<Marka> getAll(){
        return markaRepository.findAll();
    }
}

