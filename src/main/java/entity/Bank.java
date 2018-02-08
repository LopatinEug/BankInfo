package entity;

import dao.DepositDao;

import javax.persistence.*;
import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Евгений on 29.10.2017.
 */
@Entity
@Table(name ="BANKS")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bank_id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "INFO")
    private String info;
    @Column(name= "IMG_PATH")
    private String imagePath;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Column(name= "LINK")
    private String link;

    @OneToMany(mappedBy="bank")
    private Set<Deposit> deposits;

    private Image img;


    public Set<Deposit> getDeposits() {
        return deposits;
    }

    public void addDeposit(int id, DepositDao depositDao){
        if (deposits==null){
            deposits=new HashSet<Deposit>();
        }
        deposits.add(depositDao.select(id));
    };

    public Bank(int bank_id, String name, String info, String imagePath) {
        this.bank_id = bank_id;
        this.name = name;
        this.info = info;
        this.imagePath = imagePath;
        img=new ImageIcon(imagePath).getImage();
    }

    public Bank(int bank_id, String name, String info, String imagePath,String link) {
        this.bank_id = bank_id;
        this.name = name;
        this.info = info;
        this.imagePath = imagePath;
        img=new ImageIcon(imagePath).getImage();
        this.link=link;
    }

    public Image getImg() {
        return img;
    }

    public int getBank_id() {
        return bank_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
