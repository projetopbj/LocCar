
package com.pbj.loccar.persistence;
import com.pbj.loccar.model.Usuario;
import java.util.List;

/**
 *
 * @author Akr-Taku
 * 
 * 
 * 
 * Interface que possui os Métodos para Persistir o Usuario
 */
public interface UsuarioPersistence {
   
    /*
    Recebe objeto Usuario e salva no banco de dados;
     */
    void createUsuario(Usuario user);
    //Recebe o Usuario e Apaga o registro no banco
    void deleteUsuario(Usuario user);
    //Método Logador
    Usuario loginUsuario(String login, String senha);

    //Retorna os dados do usuario que vieram diretamete do banco de dados;
    List<Usuario> readUsuario();
    //Método atualizador
    void updateUsuario(Usuario user);
    
}
