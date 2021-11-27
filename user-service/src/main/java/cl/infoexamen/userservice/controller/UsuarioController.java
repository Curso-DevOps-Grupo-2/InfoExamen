package cl.infoexamen.userservice.controller;

import cl.infoexamen.userservice.model.Usuario;
import cl.infoexamen.userservice.service.UsuarioService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    private static final Log LOGGER = LogFactory.getLog(UsuarioController.class.getName());
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/crearUsuario")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        LOGGER.info ("Se inicia metodo para crear usuario");
        return usuarioService.crearUsuario(usuario);
    }

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        LOGGER.info ("Se inicia metodo para buscar todos los usuarios");
        return usuarioService.listarUsuarios();
    }

}
