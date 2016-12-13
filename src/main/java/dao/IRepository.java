package dao;

import java.util.List;

import HogwartLibrary.IHaveId;

public interface IRepository<TEntity extends IHaveId> {

	public TEntity get(int personId);

	public List<TEntity> getAll();

	public void add(TEntity entity);

	public void update(TEntity entity);

	public void delete(TEntity entity);

}