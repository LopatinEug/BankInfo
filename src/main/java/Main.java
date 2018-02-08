import dao.BankDaoMock;
import entity.Deposit;

import java.util.List;

/**
 * Created by Евгений on 28.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        /*Configuration conf=HibernateUtil.getMySqlConfiguration();
        SessionFactory sessionFactory=HibernateUtil.createSessionFactory(conf);
        Session session=sessionFactory.openSession();

        session.close();
        sessionFactory.close();*/
        BankDaoMock bankDao=new BankDaoMock();
        List<Deposit> list=bankDao.getDepDao().selectByParams("dollar",3,null,null,true,null);
        System.out.println();
    }
}
