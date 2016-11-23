package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.HistoryLog;

public class HistoryLogMapper implements IMapResultSetIntoEntity<HistoryLog>{
	
	public HistoryLog map(ResultSet rs) throws SQLException {
		HistoryLog result = new HistoryLog();
		result.setId(rs.getInt("id"));
		result.setAmount(rs.getDouble("amount"));
		return result;
	}
}
