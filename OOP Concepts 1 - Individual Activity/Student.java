public class Student extends School{

    private String id;
    private String fname;
    private String lname;
    private String course;
    private int year;
    private String email;

    public void setDetails(String id, String fname, String lname, String course, int year, String email){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.course = course;
        this.year = year;
        this.email = email;
    }

    public String getId(String id){
        return id;
    }

    public String getFname(String fname){
        return fname;
    }

    public String getLname(String lname){
        return lname;
    }

    public String getCourse(String course){
        return course;
    }

    public int getYear(int year){
        return year;
    }

    public String getEmail(String email){
        return email;
    }


}
