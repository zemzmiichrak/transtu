package transtu.pfe.Repository;

import transtu.pfe.entity.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Long>{
 User findById(long Id);

static User findByEmail(String email) {
	// TODO Auto-generated method stub
	return null;
}

static Optional<User> findOneByEmailAndPassword(String email, String encodedPassword) {
	// TODO Auto-generated method stub
	return null;
}

 
}

