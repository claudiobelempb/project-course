package br.com.surb.course.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_order")
public class Order {
    private Long id;
    private String subject;
    private String description;
    private Date createdAt;
    private OrderStages state;
    private User user;
    private Set<OrderStages> stages = new HashSet<>();
}
