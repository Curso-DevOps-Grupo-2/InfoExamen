package cl.infoexamen.userservice.service;

import cl.infoexamen.userservice.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario crearUsuario(Usuario usuario);

    List<Usuario> listarUsuarios();

}
