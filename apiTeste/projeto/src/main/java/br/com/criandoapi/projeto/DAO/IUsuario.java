package br.com.criandoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.projeto.model.Usuario;
//o crud faz os metodos p fazer o acesso ao bank de form simples
public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
