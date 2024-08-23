package br.com.fiap.api.usuarios_pettech.service.validation;

import br.com.fiap.api.usuarios_pettech.dto.UsuarioDTO;
import br.com.fiap.api.usuarios_pettech.entities.Usuario;
import br.com.fiap.api.usuarios_pettech.repository.UsuarioRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CriacaoUsuarioValidator implements ConstraintValidator<CriacaoUsuarioValid, UsuarioDTO> {
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void initialize(CriacaoUsuarioValid constraintAnnotation) {}

    @Override
    public boolean isValid(UsuarioDTO usuarioDTO, ConstraintValidatorContext context) {
        Optional<Usuario> usuario = usuarioRepository.findByEmail(usuarioDTO.email());
        return usuario.isEmpty();
    }
}
