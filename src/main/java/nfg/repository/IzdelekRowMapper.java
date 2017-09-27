//package nfg.repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import nfg.model.Izdelek;
//
//public class IzdelekRowMapper implements RowMapper {
//
//	@Override
//	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Izdelek izdelek = new Izdelek();
//		izdelek.setId(rs.getLong("ID"));
//		izdelek.setIme(rs.getString("IME"));
//		izdelek.setCena(rs.getDouble("CENA"));
//		izdelek.setSifra(rs.getString("SIFRA"));
//		return izdelek;
//	}
//}
