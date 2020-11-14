import java.util.*;
public class Person {

    private String id;
    private String name;
    private String sex;
    private String salary;
    private String BirthDate;
    private Subdivision subd;
 public

 /**
  * Gives to all the object's fields their parameteres
  */
 Person(String i, String n, String s, String sal, String bd, String t, int idd)
    {
        id = i;
        name = n;
        sex = s;
        salary = sal;
        BirthDate = bd;
        subd = new Subdivision(t, idd);
    }

    /**
     * Standard with no variables constructor
     */
    public Person()
    {

    }

    /**
     *
     * @return id
     */
   public String getId()
   {
       return id;
   }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     *
     * @return salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     *
     * @return Date of birth
     */
    public String getBirthDate() {
        return BirthDate;
    }

    /**
     *
     * @return The title of Subdivision
     */
    public String getSubdTitle() {
        return subd.getTitle();
    }

    /**
     *
     * @return The ID of Subdivision
     */
    public int getSubdId()
    {
        return subd.getId();
    }

}
