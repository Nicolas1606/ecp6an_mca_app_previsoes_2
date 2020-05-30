package EX09_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EX09_Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByLoginAndSenha(String login, String senha);

}