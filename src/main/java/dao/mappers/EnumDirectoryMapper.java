package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.EnumDictionary;

public class EnumDirectoryMapper implements IMapResultSetIntoEntity<EnumDictionary> {

	public EnumDictionary map(ResultSet rs) throws SQLException {
		EnumDictionary result = new EnumDictionary();
		result.setId(rs.getInt("id"));
		result.setIntKey(rs.getInt("Int Key"));
		result.setStringKey(rs.getString("String Key"));
		result.setValue(rs.getString("Value"));
		result.setEnumName(rs.getString("Enum Name"));
		return result;
	}

}
