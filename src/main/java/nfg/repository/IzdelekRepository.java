package nfg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import nfg.model.Izdelek;

public interface IzdelekRepository extends JpaRepository<Izdelek, Long> {
	
}
