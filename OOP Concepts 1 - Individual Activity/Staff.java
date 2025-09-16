public class Staff extends School{

    private String id;
    private String fname;
    private String lname;
    private String department;
    private String email;

    public void setDetails(String id, String fname, String lname, String department, String email){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.department = department;
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

    public String getDepartment(String department){
        return department;
    }

    public String getEmail(String email){
        return email;
    }
}
