 
/**
 * A class that inherits attributes and methods from class student . 
 * 
 * @Rei Bashsari , 315522623
 * @09/03/2021
 */
public class ComputerScienceStudent extends Student 
{
    private String _programmingLanguage ; //private veriable
    private final String DEF_LAN = "Java" ; //default final 
    
    /**
     * Constructor that make computer science student with his name and id .
     * @param firstName - student first name .
     * @param lastName - student first name .
     * @param id - student first name .
     */
    public ComputerScienceStudent(String firstName , String lastName , long id) 
    {
        super(firstName , lastName , id) ;
        _programmingLanguage = DEF_LAN ; 
    }
    
    /**
     * Constructor that make computer science student with his name , id and arrays of his courses 
     * and his grades . 
     * the constructor initializes his programming language . 
     * @param firstName - student first name .
     * @param lastName - student first name .
     * @param id - student first name .
     * @param array courses[] - array of the student's courses . 
     * @param array grades[] - array of the student's grades .
     * @param programmingLanguage - his program language . 
     */
    public ComputerScienceStudent(String firstName , String lastName , long id , String[] courses , double[] grades , String programmingLanguage)
    {
        super(firstName , lastName , id , courses , grades) ;
        _programmingLanguage = programmingLanguage ; 
    }
    
    /**
     * getter of his programming language . 
     * @return the programming language . 
     */
    public String getProgrammingLanguage() 
    {
        return _programmingLanguage ; 
    }
    
    /**
     * setter the programming language .
     * @param programmingLanguage . 
     */
    public void setProgrammingLanguage(String programmingLanguage) 
    {
        _programmingLanguage = programmingLanguage ; 
    }
    
    /**
     * method toString that build string with all the details about the student and his
     * programming language . 
     * @return string that represent the student  .
     */
    public String toString() 
    {
        return super.toString() + "\n" + "Programming Language is: " + _programmingLanguage ; 
    }
}
