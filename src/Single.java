/**
 * Created by obrook on 10/13/2015.
 */
public class Single extends ComunityMember  {

    public Single(
            int adducationYears,
            long id, Sex s,
            String name,
            String address,
            java.util.Date bday,
            int shtaigenHours,
            int workHours,
            double income,
            int gmch,
            Valonteer valont

                )
    {
        if ((shtaigenHours + workHours) < 112) {
            throw new UnsupportedOperationException("Person have to be busy at least 112 hours a week\n");
        }

        this.setAdducationYears(adducationYears);
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
        if (this.getShtaigenHours() > 40)  // if the persion learn Torah more than 8 houres a day.
        {
            return 0;
        }
        else if (this.getShtaigenHours() > 20)
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
        return 6;
    }

    public int getAdducationYears() {
        return adducationYears;
    }

    public void setAdducationYears(int adducationYears) {
        this.adducationYears = adducationYears;
    }

    private int adducationYears;

}
