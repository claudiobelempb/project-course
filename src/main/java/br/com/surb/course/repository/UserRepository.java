package br.com.surb.course.repository;

import br.com.surb.course.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("""
//            SELECT FROM User WHERE email = ?1 AND password = ?2
//            """)
//    Optional<User> login(String email, String password);
}
