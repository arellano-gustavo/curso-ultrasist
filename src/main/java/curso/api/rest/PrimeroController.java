package curso.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PrimeroController {
    @GetMapping(
            path = "/saluda",
            produces = "application/json; charset=utf-8")
    public String hola(@RequestParam String token) throws Exception {
        String tmp = "{'usr': '"+token+"'}";
        return tmp.replace("'", "\"");
    }
}
