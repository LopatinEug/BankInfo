package dao;

import entity.Bank;

import java.util.ArrayList;

/**
 * Created by Евгений on 15.11.2017.
 */
public class BankDaoMock implements BankDao {
    private final String NAME_PRIVATBANK="ПриватБанк";
    private final String NAME_ALFABANK="АльфаБанк";
    private final String NAME_OTPBANK="ОТПБанк";
    private final String NAME_VTBBANK="ВТББанк";
    private final String NAME_OSHADBANK="ОщадБанк";

    public DepositDaoMock getDepDao() {
        return depDao;
    }

    public  DepositDaoMock depDao=new DepositDaoMock();

    private final ArrayList <Bank> memory=new ArrayList() {
    };

    public BankDaoMock(){
        memory.add(new Bank(1,NAME_PRIVATBANK,"Заснований у 1992 році, комерційний банк ПриватБанк є лідером банківського ринку країни. За даними дослідження GFK Ukraine у II\u200BI кварталі 2017 року з нами співпрацюють 51,6% українців – фізичних осіб старше 16 років. Вважають основним банком 42,5% користувачів банківських послуг – фізичних осіб, що більше, ніж у наступних за нами двадцяти трьох банках разом взятих.","MainPage/images/logo_privatbank.jpg"));
        memory.add(new Bank(2,NAME_ALFABANK,"Альфа-Банк Україна – це великий комерційний український банк з міжнародним капіталом, який входить у приватну інвестиційну холдингову компанію ABH Holdings SA (ABHH) з головним офісом у Люксембурзі. Холдингова компанія має інвестиції в ряді банківських груп на території країн СНД і Європи, зокрема, операційні компанії ABHH знаходяться в Україні, Росії, Казахстані, Білорусі та Нідерландах.","MainPage/images/logo_alfabank.jpg"));
        memory.add(new Bank(3,NAME_OTPBANK,"Публічне акціонерне товариство «ОТП Банк» – один з найбільших вітчизняних банків, визнаний лідер фінансового сектора України. На українському ринку він представлений з 1998 року, має стійку репутацію соціально відповідальної, надійної і стабільної структури, що пропонує споживачам сервіси європейської якості.02 березня 1998 – засновано АКБ «Райффайзенбанк Україна» як банк зі 100% іноземним капіталом. 2006 – стовідсотковим власником банку став OTP Bank Plc., лідер угорського банківського ринку, чия ринкова частка в Угорщині становить 25%. Банк було перейменовано в OTP Bank (АТ «ОТП Банк»).","MainPage/images/logo_otpbank.png"));
        memory.add(new Bank(4,NAME_VTBBANK,"VTB BANK (УКРАЇНА) — СТАБІЛЬНИЙ УНІВЕРСАЛЬНИЙ БАНК, ЯКИЙ ВХОДИТЬ ДО ГРУПИ НАЙБІЛЬШИХ БАНКІВСЬКИХ УСТАНОВ КРАЇНИ ЗГІДНО З КЛАСИФІКАЦІЄЮ НАЦІОНАЛЬНОГО БАНКУ УКРАЇНИ. ПРОФІЛЬНИМИ НАПРЯМКАМИ РОБОТИ БАНКУ Є КОМПЛЕКСНЕ ОБСЛУГОВУВАННЯ ВЕЛИКИХ КОРПОРАТИВНИХ КЛІЄНТІВ, МАЛОГО ТА СЕРЕДНЬОГО БІЗНЕСУ, А ТАКОЖ ОБСЛУГОВУВАННЯ ФІЗИЧНИХ ОСІБ.","MainPage/images/logo-vtb.jpg"));
        memory.add(new Bank(5,NAME_OSHADBANK,"У рейтингу міжнародної аудиторської компанії «Делойт» Ощад входить до ТОП-50 банків Центральної і Східної Європи та є найбільш стійким банком України за версію видання Forbes Україна. У найближчих планах Ощадбанку – зміцнювати свої лідерські позиції на ринку. Продовжити модернізацію мережі установ й довести кількість відділень нового формату до 600 на кінець 2016 – початок 2017 року. Запровадити масштабну просвітницьку програму з переходу клієнтів в online-канали обслуговування. Збільшити кількість банкоматів та терміналів самообслуговування. Наростити кредитування фізичних осіб, мікро-, малого й середнього бізнесу, поступово зменшуючи частку великих компаній у своєму кредитному портфелі.","MainPage/images/logo_oshadbank.jpg"));
        for (int i = 0; i <depDao.memory.size() ; i++) {
            int a=depDao.memory.get(i).getId();
            if(a>=1&&a<35){
                depDao.memory.get(i).setBank(memory.get(0));
                memory.get(0).addDeposit(a,depDao);
            }else if (a>=35&&a<83){
                depDao.memory.get(i).setBank(memory.get(1));
                memory.get(1).addDeposit(a,depDao);
            }else if(a>=83&&a<94){
                depDao.memory.get(i).setBank(memory.get(2));
                memory.get(2).addDeposit(a,depDao);
            }else if(a>=94&&a<121){
                depDao.memory.get(i).setBank(memory.get(3));
                memory.get(3).addDeposit(a,depDao);
            }else if(a>=121&&a<145){
                depDao.memory.get(i).setBank(memory.get(4));
                memory.get(4).addDeposit(a,depDao);
            }

        }

    }




    public ArrayList<Bank> selectAll() {
        return memory;
    }

    public Bank select(int id) throws Exception {
        for (Object b:memory) {
            Bank bank= (Bank) b;
            if(bank.getBank_id()==id){
                return bank;
            }
        }
        return null;
    }

    public int selectByName(String name) {
        for (Object b:memory) {
            Bank bank= (Bank) b;
            if(bank.getName().equals(name)){
                return bank.getBank_id();
            }
        }
        return 0;
    }
}
