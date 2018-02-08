package dao;

import entity.Bank;

import java.util.ArrayList;

/**
 * Created by Евгений on 09.11.2017.
 */
public interface BankDao {
    public ArrayList<Bank> selectAll();
    public Bank select(int id) throws Exception;
    public int selectByName(String name);
}
