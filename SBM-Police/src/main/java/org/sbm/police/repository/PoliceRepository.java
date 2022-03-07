package org.sbm.police.repository;

import java.util.List;

import org.sbm.police.domain.Policelerim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliceRepository extends JpaRepository<Policelerim, Integer> {
	List<Policelerim> findByPolicePrimAndPoliceDurum(int prim, int durum);

	Policelerim findFirstByPoliceTipi(String policeTipi);

	@Query(value = "SELECT SUM(policePrim) FROM Policelerim")
	public Integer sumInteger();

}
