import java.util.List;

/**
 * Created by obrook on 10/18/2015.
 */
public class Comunity {

    public boolean addMember(ComunityMember cm)
    {
        return this.members.add(cm);
    }

    public int sumTax()
    {
        int sum = 0;
        for (ComunityMember cm :  members)
        {
            sum += (cm.taxToPay());
        }
        return  sum;
    }

    public int lownAloowed(ComunityMember cm)
    {
        return cm.maxLown();
    }

    public void printValonteerHours()
    {
        int soul = 0;
        int phsic = 0;
        int music = 0;

        for (ComunityMember temp_cm :  members)
        {
            if (temp_cm.getValont() == ComunityMember.Valonteer.MUSICAL)
            {
                music +=  temp_cm.recomandedValonteerHours();
            }
            if (temp_cm.getValont() == ComunityMember.Valonteer.PHISICAL)
            {
                phsic +=  temp_cm.recomandedValonteerHours();
            }
            if (temp_cm.getValont() == ComunityMember.Valonteer.SOUL)
            {
                soul +=  temp_cm.recomandedValonteerHours();
            }

            System.out.print("sum of soul valonteer hours are: ");
            System.out.print(soul);

            System.out.print("sum of music valonteer hours are: ");
            System.out.print(music);

            System.out.print("sum of phisics valonteer hours are: ");
            System.out.print(phsic);



        }
    }

    public List<ComunityMember> getMembers() {
        return members;
    }

    public void setMembers(List<ComunityMember> members) {
        this.members = members;
    }

    protected List<ComunityMember> members;



}
