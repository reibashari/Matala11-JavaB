
/**
 * A master class, basically builds a person's attributes and methods . 
 *
 * @Rei Bashsari , 315522623
 * @09/03/2021
 */
public class Person
{
    //protected veriable 
    protected String _firstName ; 
    protected long _id ;
    protected String _lastName ; 
    
    /**
     * constructor for initializing a person with a first name, last name and id . 
     * @param firstName - student first name .
     * @param lastName - student last name .
     * @param id - student id .
     */
    public Person(String firstName , String lastName , long id) 
    {
        _firstName = firstName ; 
        _lastName = lastName ; 
        _id = id ; 
    }
    
    /**
     * copy constructor 
     * @param other . 
     */
    public Person(Person other) 
    {
        _firstName = other._firstName ;
        _lastName = other._lastName ; 
        _id = other._id ; 
    }

    /**
     * getter of the first name . 
     * @return the first name . 
     */
    public String getFirstName() 
    {
        return _firstName ; 
    }
    
    /**
     * getter of the last name . 
     * @return the last name . 
     */
    public String getLastName() 
    {
        return _lastName ; 
    }
    
    /**
     * getter of the student ID . 
     * @return the student ID . 
     */
    public long getId() 
    {
        return _id ; 
    }
    
    /**
     * setter of the first name .
     * @param firstName - set the new first name .  
     */
    public void SetFirstName(String firstName) 
    {
        _firstName = firstName ; 
    }
    
    /**
     * setter of the last name .
     * @param lastName - set the new last name .  
     */
    public void SetLastName(String lastName) 
    {
        _lastName = lastName ; 
    }
    
    /**
     * setter of the student ID.
     * @param id - set the new id of the student  .  
     */
    public void setID(long id) 
    {
        _id = id ; 
    }
    
    /**
     * string that represnt the student with his full name and id . 
     * @return string that represent the student and his details . 
     */
    public String toString() 
    {
        return ("Last Name: " + _lastName + ", First Name: " + _firstName +
        ", ID: " + _id) ; 
    }
    
}
