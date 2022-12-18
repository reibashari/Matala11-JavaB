
/**
 * A class that inherits attributes and methods from class person . 
 *
 * @Rei Bashsari , 315522623
 * @09/03/2021
 */
public class Student extends Person 
{
   //protected veriable 
   protected double _averageGrade ; 
   protected String[] _courses ; 
   protected double[] _grades ; 
   protected int _numOfCourses ; 
   protected final int MAX_NUM_OF_COURSES = 10 ;  //protected final value
   
   /**
    * Constructor that build a student with his personal details and initializing
    * the array of the courses and grades . 
    * @param firstName - student first name .
    * @param lastName - student first name .
    * @param id - student first name .
    */
   public Student(String firstName , String lastName , long id) 
   {
       super(firstName , lastName , id) ; 
       _courses = new String[MAX_NUM_OF_COURSES] ; 
       _grades = new double[MAX_NUM_OF_COURSES] ; 
       _numOfCourses = 0 ; 
       _averageGrade = 0 ; 
    }
   
    /**
    * A constructor who receives a first name, last name, ID number, array of courses and array of
    * grades , and creates an object that initializes the attributes according to the parameters given.
    * The constructor also calculates the average grade .
    * @param firstName - student first name .
    * @param lastName - student first name .
    * @param id - student first name .
    * @param array courses[] - array of the student's courses . 
    * @param array grades[] - array of the student's grades 
    */
   public Student (String firstName,String lastName,long id,String[] courses,double[] grades)
   {
       super(firstName , lastName , id) ;
       _courses = new String[MAX_NUM_OF_COURSES] ; 
       _grades = new double[MAX_NUM_OF_COURSES] ; 
       _numOfCourses = grades.length ; 
       _averageGrade = 0 ; 
       for (int i = 0 ; i < _numOfCourses ; i++) 
       {
           _courses[i] = courses[i] ; 
           _grades[i] = grades[i] ;
           _averageGrade += grades[i] ; 
       }
       _averageGrade /= _numOfCourses;  //claculate the average grade . 
   }
   
   /**
    * getter for average grade . 
    * @return the average grade . 
    */
   public double getAverageGrade() 
   {
       return _averageGrade ; 
    }
   
   /**
    * getter for the number of courses . 
    * @return the number of courses . 
    */ 
   public double getNumOfCourses() 
   {
       return _numOfCourses ; 
   }
   
   /**
    * boolean method that check if we can add a course to the array .  
    * @return true if its completed . 
    */
   public boolean addCourse(String courseName , double courseGrade) 
   {
       if(_numOfCourses == MAX_NUM_OF_COURSES) 
        {
            return false ; 
        }
       
       _courses[_numOfCourses] = courseName ; 
       _grades[_numOfCourses] = courseGrade ; 
       _averageGrade = (_averageGrade * _numOfCourses + courseGrade) / (_numOfCourses + 1); //calculate the new average
       _numOfCourses++ ; //raise the number of courses after the course added . 
       return true ; 
   }
   
   /**
    * method toString make a string with all the courses and grades . 
    * @return string that represent the person with his details and his cocurses and grades .
    * 
    */
   public String toString() 
   {
      String str = super.toString() + "\n" + "Courses:" + "\n" ; 
      for(int i = 0 ; i< _numOfCourses ; i++) 
      {
          str += "\t" + _courses[i] + ":\t" + _grades[i] + "\n" ; 
      }
      return str ; 
    }
   }

