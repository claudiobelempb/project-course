package br.com.surb.course.domain.entities;

import br.com.surb.course.domain.enums.RoleEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private  RoleEnum role;
    private  Set<Order> orderSet = new HashSet<>();
    private  Set<OrderStages> stages = new HashSet<>();
}
