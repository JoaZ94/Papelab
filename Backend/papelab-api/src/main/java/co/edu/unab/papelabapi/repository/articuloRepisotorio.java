// Modelo 

package co.edu.unab.papelabapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.papelabapi.models.ArticuloModelo;

@Repository
public interface articuloRepisotorio extends CrudRepository<ArticuloModelo,Integer>{
    
}
