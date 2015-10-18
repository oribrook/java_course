import java.util.Date;

/**
 * Created by obrook on 10/13/2015.
 */


public abstract class ComunityMember implements Chovot_Zchuyot {

    public abstract int taxToPay();
    public abstract int maxLown();
    public abstract int recomandedValonteerHours();


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getS() {
        return s;
    }

    public void setS(Sex s) {
        this.s = s;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getBorthDay() {
        return borthDay;
    }

    public void setBorthDay(Date borthDay) {
        this.borthDay = borthDay;
    }

    public int getShtaigenHours() {
        return shtaigenHours;
    }

    public void setShtaigenHours(int shtaigenHours) {
        shtaigenHours = shtaigenHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getGmch() {
        return gmch;
    }

    public void setGmch(int gmch) {
        this.gmch = gmch;
    }

    public Valonteer getValont() {
        return valont;
    }

    public void setValont(Valonteer valont) {
        this.valont = valont;
    }

    private long id;
    private Sex s;
    private String name;
    private String address;
    private java.util.Date borthDay;
    private int shtaigenHours;
    private int workHours;
    private double income;
    private int gmch;
    private Valonteer valont;

    public enum Valonteer {
        SOUL,
        PHISICAL,
        MUSICAL;
    }



}
