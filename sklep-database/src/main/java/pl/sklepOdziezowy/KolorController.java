package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class KolorController {
    @Autowired
    KolorRepository kolorRepository;

    @RequestMapping(value = "/kolor/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Kolor> getById(@RequestParam(value = "id") long id){
        return kolorRepository.findById(id);
    }
    @RequestMapping(value = "/kolor/",method = RequestMethod.GET)
    public List<Kolor> getAll(){
        return kolorRepository.findAll();
    }
}
