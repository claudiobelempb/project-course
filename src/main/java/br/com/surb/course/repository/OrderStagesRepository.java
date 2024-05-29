package br.com.surb.course.repository;

import br.com.surb.course.domain.entities.OrderStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStagesRepository extends JpaRepository<OrderStage, Long> {
//    List<OrderStage> findAllByOrderStageId(Long id);
}
