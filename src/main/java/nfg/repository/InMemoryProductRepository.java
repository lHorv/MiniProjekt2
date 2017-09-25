package nfg.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import nfg.model.Izdelek;

@Component
public class InMemoryProductRepository implements IProductRepository {
	
	private Map<Long, Izdelek> izdelki = new HashMap<Long, Izdelek>();
	private Long idIndex = 1L;

	private static InMemoryProductRepository instance = new InMemoryProductRepository();

    public static InMemoryProductRepository getInstance() {
        return instance;
    }

    private InMemoryProductRepository() {
    }

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
