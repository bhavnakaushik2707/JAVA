public class Profile
{
    private String name;
    private int age;
    private double heightMetres;
    public Profile(String name, int age, double heightMetres)
    {
        if(name==null||name.isBlank())
            {
                this.name="Unknown";
            }
            else
                {
                    this.name=name;
                }
        if (age>=0)
            {
                this.age=age;
        }
        else
            {
                this.age=0;
            }
        if(heightMetres>0)
            {
                this.heightMetres=heightMetres;
            }
        else
            {
                this.heightMetres=1;
            }
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getHeightMetres()
    {
        return heightMetres;
    }
    public String toString()
    {
        return"Name=" + name+",Age="+age+",Height" + heightMetres + "metres";
    }
}