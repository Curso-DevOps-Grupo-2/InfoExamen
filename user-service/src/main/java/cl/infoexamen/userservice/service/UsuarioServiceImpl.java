package cl.infoexamen.userservice.service;

import cl.infoexamen.userservice.dao.UsuarioDAO;
import cl.infoexamen.userservice.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    @Transactional
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) usuarioDAO.findAll();
    }
}
