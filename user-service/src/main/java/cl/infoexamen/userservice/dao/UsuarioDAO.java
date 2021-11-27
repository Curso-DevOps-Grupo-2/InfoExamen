package cl.infoexamen.userservice.dao;

import cl.infoexamen.userservice.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDAO extends CrudRepository<Usuario,Long> {
}
