package br.com.surb.course.domain.entities;

import br.com.surb.course.domain.enums.RoleEnum;
import jakarta.persistence.*;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75, nullable = false)
    private String name;
    @Column(length = 75, nullable = false, unique = true)
    private String email;
    @Column(length = 100, nullable = false)
    private String password;
    @Column(length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private  RoleEnum role;

    @OneToMany(mappedBy = "user")
    private  Set<Order> orderSet = new HashSet<>();
    @OneToMany(mappedBy = "user")
    private  Set<OrderStages> stages = new HashSet<>();
}
