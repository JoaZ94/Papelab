// Controlador

package co.edu.unab.papelabapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.papelabapi.models.ArticuloModelo;
import co.edu.unab.papelabapi.repository.articuloRepisotorio;

@RestController
@RequestMapping(path = "/articulo")
public class articuloControlador {
    @Autowired
    articuloRepisotorio articuloRepisotorio;

    @GetMapping
    public Iterable<ArticuloModelo> obtenerTodosLosArticulos(){
        return articuloRepisotorio.findAll();
    }

    @PostMapping
    public ArticuloModelo guardarArticulo(@RequestBody ArticuloModelo articulo){
        return articuloRepisotorio.save(articulo);
    }

    @DeleteMapping(path = "/{id}")
    public void eliminarArticuloPorId(@PathVariable("id") int id){
        articuloRepisotorio.deleteById(id);
    }
}
