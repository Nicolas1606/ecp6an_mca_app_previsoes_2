package EX09_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EX09_Model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {

}