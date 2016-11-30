package dao;

import java.util.List;

import domain.model.Account;
import domain.model.HistoryLog;

public interface IHistoryRepository extends IRepository<HistoryLog> {

	public List<HistoryLog> byAccount(Account account);
}
