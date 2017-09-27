package nfg.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import nfg.model.Izdelek;

@Component
public class SqlProductRepository implements IProductRepository {
	
	private JdbcTemplate jdbc;
	
	@Override
	public List<Izdelek> getAll() {
		
		String sql = "SELECT * FROM IZDELEK";

		List<Izdelek> izdelki = new ArrayList<Izdelek>();

		List<Map<String,Object>> rows = jdbc.queryForList(sql);
		for (Map row : rows) {
			Izdelek izdelek = new Izdelek();
			izdelek.setId((Long)(row.get("ID")));
			izdelek.setIme((String)row.get("IME"));
			izdelek.setCena((Integer)row.get("CENA"));
			izdelek.setSifra((String)row.get("SIFRA"));
			izdelki.add(izdelek);
		}

		return izdelki;
	}

	@Override
	public Izdelek add(Izdelek izdelek) {
		
		String sql = "INSERT INTO IZDELEK " + 
					"(ID, IME, CENA, SIFRA) VALUES (?, ?, ?";
		
		jdbc.update(sql, new Object[] {izdelek.getId(), izdelek.getIme(), izdelek.getCena(), izdelek.getSifra()});
		
		return null;
	}

	@Override
	public Izdelek remove(Long id) {
		
		String sql = "DELETE FROM IZDELEK WHERE ID=?";
		
		jdbc.update(sql, id);
		
		return null;
	}

	@Override
	public Izdelek update(Long id, Izdelek izdelek) {
		
		String sql = "UPDATE IZDELEK"
				+	"SET IME=?, CENA=?, SIFRA=?"
				+	"WHERE ID=?";
		
		jdbc.update(sql, new Object[] {izdelek.getIme(), izdelek.getCena(), izdelek.getSifra(), id});
		
		return null;
	}

	@Override
	public Izdelek get(Long id) {
		
		String sql = "SELECT * FROM IZDELEK WHERE ID = ?";
		//Izdelek izdelek = (Izdelek) jdbc.queryForObject(sql, new Object[] {id}, new IzdelekRowMapper());
		Izdelek izdelek = (Izdelek) jdbc.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper(Izdelek.class));
		
		return izdelek;
	}
}
