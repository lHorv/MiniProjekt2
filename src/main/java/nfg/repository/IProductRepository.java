package nfg.repository;

import java.util.List;

import nfg.model.Izdelek;

public interface IProductRepository {
	
	List<Izdelek> getAll();
	Izdelek add(Izdelek izdelek);
	Izdelek remove(Long id);
	Izdelek update(Long id, Izdelek izdelek);
	Izdelek get(Long id);
}
