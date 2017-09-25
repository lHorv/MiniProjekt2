package nfg.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import nfg.model.Izdelek;

@Component
public class InMemoryProductRepository implements IProductRepository {
	
	private Map<Long, Izdelek> izdelki = new HashMap<Long, Izdelek>(){{
		put (1L, new Izdelek(1L, "Mleko", 2.99, "MLE192883"));
		put (2L, new Izdelek(2L, "Kruh", 1.33, "KRU100029"));
	}};
	
	private Long idIndex = 2L;
	
	@Override
	public List<Izdelek> getAll() {
		return new ArrayList<Izdelek>(izdelki.values());
	}

	@Override
	public Izdelek add(Izdelek izdelek) {
		idIndex += idIndex;
		izdelek.setId(idIndex);
		izdelki.put(idIndex, izdelek);
		return izdelek;
	}

	@Override
	public Izdelek remove(Long id) {
		return izdelki.remove(id);
	}

	@Override
	public Izdelek update(Long id, Izdelek izdelek) {
		izdelki.put(id, izdelek);
		return izdelek;
	}

	@Override
	public Izdelek get(Long id) {
		return izdelki.get(id);
	}

}
