package dao;

import entity.Bank;
import entity.Deposit;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Евгений on 16.11.2017.
 */
public class DepositDaoMock implements DepositDao{
    private final String NAME_PRIVATBANK="ПриватБанк";
    private final String NAME_ALFABANK="АльфаБанк";
    private final String NAME_OTPBANK="ОТПБанк";
    private final String NAME_VTBBANK="ВТББанк";
    private final String NAME_OSHADBANK="ОщадБанк";

    public  List<Deposit> memory=new ArrayList();

    public DepositDaoMock(){
        //PrivatBank
        // Standart express
        memory.add(new Deposit("Стандарт срочный",1,"hryvna",10.0,24,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",2,"hryvna",10.0,18,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",3,"hryvna",13.0,12,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",4,"hryvna",15.0,6,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",5,"hryvna",14.0,3,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",6,"dollar",3.75,12,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",7,"dollar",3.5,6,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",8,"dollar",3.25,3,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",9,"euro",2.35,12,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",10,"euro",2.2,6,"Ежемесячно",false,true));
        memory.add(new Deposit("Стандарт срочный",11,"euro",2.0,3,"Ежемесячно",false,true));
        // Standart
        memory.add(new Deposit("Стандарт ",12,"hryvna",11.0,12,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",13,"hryvna",12.0,6,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",14,"hryvna",10.5,3,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",15,"hryvna",10.0,1,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",16,"dollar",3.0,12,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",17,"dollar",2.75,6,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",18,"dollar",2.5,3,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",19,"dollar",1.0,1,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",20,"euro",1.7,12,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",21,"euro",1.6,6,"Ежемесячно",true,true));
        memory.add(new Deposit("Стандарт ",22,"euro",1.5,3,"Ежемесячно",true,true));
        //Zruchniy
        memory.add(new Deposit("Зручний ",23,"hryvna",12.0,6,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручний ",24,"hryvna",10.5,3,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручний ",25,"hryvna",10.0,0,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручний ",26,"dollar",2.75,6,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручний ",27,"dollar",2.5,3,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручний ",28,"dollar",1.0,0,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручний ",29,"euro",1.6,6,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручний ",30,"euro",1.5,3,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручний ",31,"euro",1.0,0,"Ежемесячно",true,true));
        //Privat-Vklad
        memory.add(new Deposit("Приват-вклад ",32,"hryvna",7.0,12,"Ежемесячно",true,true));
        memory.add(new Deposit("Приват-вклад ",33,"dollar",1.0,12,"Ежемесячно",true,true));
        memory.add(new Deposit("Приват-вклад ",34,"euro",0.5,12,"Ежемесячно",true,true));


        //ALFA BANk

        //SrochniyA
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",35,"hryvna",15.0,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",36,"hryvna",15.0,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",37,"hryvna",14.25,3,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",38,"dollar",5.25,24,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",39,"dollar",5.25,18,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",40,"dollar",4.75,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",41,"dollar",4.25,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",42,"dollar",3.25,3,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",43,"euro",3.25,24,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",44,"euro",3.25,18,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",45,"euro",2.75,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",46,"euro",2.25,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, в конце срока)",47,"euro",1.25,3,"В конце срока",false,false));
       //SrochniyB
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",48,"hryvna",14.0,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",49,"hryvna",14.0,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",50,"hryvna",13.25,3,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",51,"dollar",4.75,24,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",52,"dollar",4.75,18,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",53,"dollar",4.25,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",54,"dollar",3.75,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",55,"dollar",2.75,3,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",56,"euro",2.75,24,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",57,"euro",2.75,18,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",58,"euro",2.25,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",59,"euro",1.75,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(без возможности досрочного закрытия, Ежемесячно)",60,"euro",0.75,3,"В конце срока",false,false));
        //SrochniyС
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",61,"hryvna",12.0,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",62,"hryvna",12.0,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",63,"hryvna",11.25,3,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",64,"dollar",2.75,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",65,"dollar",2.25,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",66,"dollar",1.25,3,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",67,"euro",0.75,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",68,"euro",0.25,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, в конце срока)",69,"euro",0.01,3,"В конце срока",false,false));
        //SrochniyD
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",70,"hryvna",11.0,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",71,"hryvna",11.0,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",72,"hryvna",10.25,3,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",73,"dollar",2.25,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",74,"dollar",1.75,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",75,"dollar",0.75,3,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",76,"euro",0.25,12,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",77,"euro",0.1,6,"В конце срока",false,false));
        memory.add(new Deposit("Срочный(с возможностью досрочного закрытия, Ежемесячно)",78,"euro",0.1,3,"В конце срока",false,false));
        //Ощадний рахунок
        memory.add(new Deposit("Депозитный сертификат",79,"dollar",4.25,12,"В конце срока",false,false));
        memory.add(new Deposit("Депозитный сертификат",80,"dollar",3.75,6,"В конце срока",false,false));
        memory.add(new Deposit("Депозитный сертификат",81,"euro",2.25,12,"В конце срока",false,false));
        memory.add(new Deposit("Депозитный сертификат",82,"euro",1.75,6,"В конце срока",false,false));

        //OTP Bank

        memory.add(new Deposit("Строковий депозит з виплатою відсотків після закінчення дії договору",83,"hryvna",10.5,3,"В конце срока",true,false));
        memory.add(new Deposit("Строковий депозит з виплатою відсотків після закінчення дії договору",84,"hryvna",11.5,6,"В конце срока",true,false));
        memory.add(new Deposit("Строковий депозит з виплатою відсотків після закінчення дії договору",85,"dollar",0.25,3,"В конце срока",true,false));
        memory.add(new Deposit("Строковий депозит з виплатою відсотків після закінчення дії договору",86,"euro",0.1,3,"В конце срока",true,false));

        memory.add(new Deposit("Строковий депозит з щомісячною сплатою або капіталізацією відсотків",87,"hryvna",10.0,3,"Ежемесячно",true,false));
        memory.add(new Deposit("Строковий депозит з щомісячною сплатою або капіталізацією відсотків",88,"hryvna",11.0,6,"Ежемесячно",true,false));
        memory.add(new Deposit("Строковий депозит з щомісячною сплатою або капіталізацією відсотків",89,"dollar",0.25,3,"Ежемесячно",true,false));
        memory.add(new Deposit("Строковий депозит з щомісячною сплатою або капіталізацією відсотків",90,"euro",0.1,3,"Ежемесячно",true,false));

        memory.add(new Deposit("Зручні гроші плюс",91,"hryvna",8.0,3,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручні гроші плюс",92,"dollar",0.25,3,"Ежемесячно",true,true));
        memory.add(new Deposit("Зручні гроші плюс",93,"euro",0.1,3,"Ежемесячно",true,true));

        //VTB BANK
        //vtb Konstructor
        memory.add(new Deposit("VTB Конструктор",94,"hryvna",10.5,3,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",95,"hryvna",11.75,6,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",96,"hryvna",12.5,12,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",97,"hryvna",9.5,3,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",98,"hryvna",10.75,6,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",99,"hryvna",11.5,12,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",100,"hryvna",10.5,3,"Капитализация",true,false));
        memory.add(new Deposit("VTB Конструктор",101,"hryvna",11.32,6,"Капитализация",true,false));
        memory.add(new Deposit("VTB Конструктор",102,"hryvna",11.89,12,"Капитализация",true,false));

        memory.add(new Deposit("VTB Конструктор",103,"dollar",1.75,3,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",104,"dollar",2.75,6,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",105,"dollar",3.75,12,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",106,"dollar",1.25,3,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",107,"dollar",2.25,6,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",108,"dollar",3.25,12,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",109,"dollar",1.75,3,"Капитализация",true,false));
        memory.add(new Deposit("VTB Конструктор",110,"dollar",2.73,6,"Капитализация",true,false));
        memory.add(new Deposit("VTB Конструктор",111,"dollar",3.69,12,"Капитализация",true,false));

        memory.add(new Deposit("VTB Конструктор",112,"euro",1.25,3,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",113,"euro",2.0,6,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",114,"euro",2.0,12,"В конце срока",true,false));
        memory.add(new Deposit("VTB Конструктор",115,"euro",0.75,3,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",116,"euro",1.5,6,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",117,"euro",1.5,12,"Ежемесячно",true,false));
        memory.add(new Deposit("VTB Конструктор",118,"euro",1.25,3,"Капитализация",true,false));
        memory.add(new Deposit("VTB Конструктор",119,"euro",1.99,6,"Капитализация",true,false));
        memory.add(new Deposit("VTB Конструктор",120,"euro",1.98,12,"Капитализация",true,false));

        //OshadBank
        memory.add(new Deposit("Мій депозит",121,"hryvna",13.5,3,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",122,"hryvna",14.0,6,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",123,"hryvna",13.0,12,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",124,"hryvna",13.5,18,"ЕКапитализация",false,true));
        memory.add(new Deposit("Мій депозит",125,"dollar",2.5,3,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",126,"dollar",2.75,6,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",127,"dollar",3.25,12,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",128,"dollar",3.25,18,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",129,"euro",1.25,3,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",130,"euro",1.75,6,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",131,"euro",2.25,12,"Капитализация",false,true));
        memory.add(new Deposit("Мій депозит",132,"euro",2.25,18,"Капитализация",false,true));

        memory.add(new Deposit("Мій пенсійний депозит",133,"hryvna",14.0,3,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",134,"hryvna",14.5,6,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",135,"hryvna",13.5,12,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",136,"hryvna",14.0,18,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",137,"dollar",2.75,3,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",138,"dollar",3.00,6,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",139,"dollar",3.5,12,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",140,"dollar",3.5,18,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",141,"euro",1.5,3,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",142,"euro",2.0,6,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",143,"euro",2.5,12,"Капитализация",false,true));
        memory.add(new Deposit("Мій пенсійний депозит",144,"euro",2.5,18,"Капитализация",false,true));
    }

    public List<Deposit> selectByParams(String currency, int term, String payment, Boolean refill, Boolean earlyClose, Bank bank) {
      List<Deposit> result;
        List<Deposit> temp=new ArrayList<Deposit>();
        if (bank != null) {
            Set<Deposit> set=  bank.getDeposits();
            result= new ArrayList<Deposit>(set);
        }else result=memory;
        temp.addAll(result);

        for (Deposit d:result) {
            if(!currency.equals(d.getCurrency())){
                temp.remove(d);
            }
        }
        result=new ArrayList<Deposit>(temp);


        for (Deposit d:result) {
            if(term != d.getTerm()){
                temp.remove(d);
            }
        }
        result=new ArrayList<Deposit>(temp);

        if(payment!=null){
            for (Deposit d:result) {
                if(!payment.equals(d.getPayment())){
                    temp.remove(d);
                }
            }
            result=new ArrayList<Deposit>(temp);
        }

        if(refill!=null){
            for (Deposit d:result) {
                if(!refill.equals(d.getRefill())){
                    temp.remove(d);
                }
            }
            result=new ArrayList<Deposit>(temp);
        }

        if(earlyClose!=null){
            for (Deposit d:result) {
                if(!earlyClose.equals(d.getEarlyClose())){
                    temp.remove(d);
                }
            }
            result=new ArrayList<Deposit>(temp);
        }
     return result;
    }

    public Deposit select(int id) {
        return memory.get(id-1);
    }

    public List<Deposit> selectByBank(Bank bank) {
        return  new ArrayList<Deposit>(bank.getDeposits());
    }



    public int selectByName(String depositName) {
        return 0;
    }
}
