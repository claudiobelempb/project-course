package br.com.surb.course.repository;

import br.com.surb.course.domain.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
//    List<Order> findAllOwnerId(Long id);

//    @Query("""
//            UPDATE Order SET stage = ?2 WHERE id = ?1
//            """)
//    Order updateStage(Long id, OrderStage stage);
}
