package walid_soukant.tp2.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="USERS")
@Data
@NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    private String userId;
    @Column(name="User_Name",unique = true, length = 20)
    private String userName;
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    private String password;
    @ManyToMany(mappedBy = "users",fetch= FetchType.EAGER)
    private List<Role> roles=new ArrayList<>();
}
