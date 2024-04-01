package walid_soukant.tp2.repository;

import walid_soukant.tp2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);
}
