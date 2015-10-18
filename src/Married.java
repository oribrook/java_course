/**
 * Created by obrook on 10/13/2015.
 */
public class Married extends ComunityMember{

    public Married(   //ctor
            long id, Sex s,
            String name,
            String address,
            java.util.Date bday,
            int shtaigenHours,
            int workHours,
            double income,
            int gmch,
            Valonteer valont,
            long spouse_id,
            int kidsUnder18
    )
    {
        if ((shtaigenHours + workHours) < 112) {
            throw new UnsupportedOperationException("Person have to be busy at least 112 hours a week\n");
        }

        this.setKidsUnder18(kidsUnder18);
        this.setSpouse_id(spouse_id);
        this.setAddress(address);
        this.setBorthDay(bday);
        this.setGmch(gmch);
        this.setId(id);
        this.setIncome(income);
        this.setName(name);
        this.setS(s);
        this.setWorkHours(workHours);
        this.setValont(valont);
        this.setShtaigenHours(shtaigenHours);

    }


    public int taxToPay()
    {
        if (this.getShtaigenHours() > 350)  // if the person learn Torah more than 8 houres a day.
        {
            return 0;
        }
        else if (this.getShtaigenHours() > 15)
        {
            return 15;
        }
        return 30;
    }
    public int maxLown()
    {
        if (this.getShtaigenHours() > 20)  // if the person is not working full-time, he cannot get a lown
        {
            return 0;
        }
        return 4000;
    }
    public int recomandedValonteerHours()
    {
        return 4;
    }

    public long getSpouse_id() {
        return spouse_id;
    }

    public void setSpouse_id(long spouse_id) {
        this.spouse_id = spouse_id;
    }

    public int getKidsUnder18() {
        return kidsUnder18;
    }

    public void setKidsUnder18(int kidsUnder18) {
        this.kidsUnder18 = kidsUnder18;
    }

    private long spouse_id;
    private int kidsUnder18;

}
