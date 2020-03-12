package br.com.gabrielfelicidade.deliveryauthserver.repository;

import br.com.gabrielfelicidade.deliveryauthserver.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}