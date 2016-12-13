package dao;

public interface IRepositoryCatalog {

	public IUserRepository users();
	public IAuthorRepository authors();
	public IHistoryRepository histories();
	public IBookRepository books();
         public IInstanceBookRepository instancebooks();
         
	public void saveAndClose();
	
}
