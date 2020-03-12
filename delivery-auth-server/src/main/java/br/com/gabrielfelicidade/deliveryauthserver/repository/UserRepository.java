package br.com.gabrielfelicidade.deliveryauthserver.repository;

import br.com.gabrielfelicidade.deliveryauthserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}