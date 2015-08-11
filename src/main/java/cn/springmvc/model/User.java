package cn.springmvc.model;

public class User {
    private String employeeid;

    private String idcardnr;

    private String name;

    private String gender;

    private String phonenumber;

    private String department;

    private String empworkingstatus;

    private String empphoto;

    private String jobpost;

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    public String getIdcardnr() {
        return idcardnr;
    }

    public void setIdcardnr(String idcardnr) {
        this.idcardnr = idcardnr == null ? null : idcardnr.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getEmpworkingstatus() {
        return empworkingstatus;
    }

    public void setEmpworkingstatus(String empworkingstatus) {
        this.empworkingstatus = empworkingstatus == null ? null : empworkingstatus.trim();
    }

    public String getEmpphoto() {
        return empphoto;
    }

    public void setEmpphoto(String empphoto) {
        this.empphoto = empphoto == null ? null : empphoto.trim();
    }

    public String getJobpost() {
        return jobpost;
    }

    public void setJobpost(String jobpost) {
        this.jobpost = jobpost == null ? null : jobpost.trim();
    }
}