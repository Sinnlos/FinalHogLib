package dao;

import java.util.List;

import domain.model.EnumDictionary;

public interface IEnumRepository extends IRepository<EnumDictionary>{

	public List<EnumDictionary> byEnumerationName(String name);
}
