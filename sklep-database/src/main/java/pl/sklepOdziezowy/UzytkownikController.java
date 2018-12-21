package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class UzytkownikController {
    @Autowired
    UzytkownikRepository uzytkownikRepository;

    @RequestMapping(value = "/uzytkownik/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Uzytkownik> getById(@RequestParam(value = "id") long id){
        return uzytkownikRepository.findById(id);
    }
    @RequestMapping(value = "/uzytkownik/",method = RequestMethod.GET)
    public List<Uzytkownik> getAll(){
        return uzytkownikRepository.findAll();
    }
}
