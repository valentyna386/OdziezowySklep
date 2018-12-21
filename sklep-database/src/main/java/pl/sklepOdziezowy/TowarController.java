package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TowarController {
    @Autowired
    TowarRepository towarRepository;

    @RequestMapping(value = "/towar/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Towar> getById(@RequestParam(value = "id") long id){
        return towarRepository.findById(id);
    }
    @RequestMapping(value = "/towar/",method = RequestMethod.GET)
    public List<Towar> getAll(){
        return towarRepository.findAll();
    }
}
