package co.edu.unab.papelabapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaMundo {

    @GetMapping("/saludar")
    public String saludo(@RequestParam(value="nombre", defaultValue="Mundo") String nombre){
        return "Hola "+nombre;
    }

}