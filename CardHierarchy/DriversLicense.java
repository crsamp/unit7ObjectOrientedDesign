import java.util.GregorianCalendar;

public class DriversLicense extends Card
{
    private String licenseNumber;
    private int expYear;
    public DriversLicense(String n, String lNum, int yearExpired)
    {
        super(n);
        licenseNumber = lNum;
        expYear = yearExpired;
    }
    
    public String format()
    {
        String licenseFormat = super.format();
        licenseFormat+="\n License Number: "+licenseNumber;
        return licenseFormat;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = calendar.get(calendar.YEAR);
        System.out.println(year);
        if (this.expYear<year)
        {
            return true;
        }
        return false;
    }
}
