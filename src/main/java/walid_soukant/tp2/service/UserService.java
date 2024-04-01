package walid_soukant.tp2.service;


import walid_soukant.tp2.entities.Role;
import walid_soukant.tp2.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authentificate(String userName,String password);
}
