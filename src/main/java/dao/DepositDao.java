package dao;

import entity.Bank;
import entity.Deposit;

import java.util.List;

/**
 * Created by Евгений on 09.11.2017.
 */
public interface DepositDao {
    public Deposit select(int id);
    public List<Deposit> selectByBank(Bank bank);
    public int selectByName(String depositName);
    public List<Deposit> selectByParams(String currency, int term, String payment,Boolean refill,Boolean earlyClose,Bank bank);

}
