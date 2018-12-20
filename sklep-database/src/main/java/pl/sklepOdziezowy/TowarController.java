package pl.sklepOdziezowy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TowarController {
    @Autowired
    TowarRepository towarRepository;

    @RequestMapping(value = "/towar/{id}",method = RequestMethod.GET)
    public Towar getById(@PathVariable long id){
        return towarRepository.getOne(id);
    }
    @RequestMapping(value = "/towar/",method = RequestMethod.GET)
    public List<Towar> getAll(){
        return towarRepository.findAll();
    }
}
