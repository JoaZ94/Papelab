package co.edu.unab.papelabapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
// Crea una tabla en la base de datos.
@Table(name="articulo")
public class ArticuloModelo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //AutoIncrmentado
    private int idArticulo;
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;
}
