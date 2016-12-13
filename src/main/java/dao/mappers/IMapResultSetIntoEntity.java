package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IRepository;
import HogwartLibrary.IHaveId;

public interface IMapResultSetIntoEntity<TEntity extends IHaveId> {

	public TEntity map(ResultSet rs) throws SQLException;
	
}
