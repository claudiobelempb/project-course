package br.com.surb.course.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_order_stages")
public class OrderStages {
    private Long id;
    private String description;
    private Date createdAt;
    private OrderStages stage;
    private Order order;
    private User user;
}
