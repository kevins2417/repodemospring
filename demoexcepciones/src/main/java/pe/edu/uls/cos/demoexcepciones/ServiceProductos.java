package pe.edu.uls.cos.demoexcepciones;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service 
public class ServiceProductos {

    public Producto registrarProducto(Producto nuevo){
        if (nuevo.getNombre().length() < 3) {
            throw new ProductoInvalidoException("El nombre del producto es muy corto");
        }

        Date ahora = new Date();
        nuevo.setId((int) ahora.getTime());
        return nuevo;
    }

}
