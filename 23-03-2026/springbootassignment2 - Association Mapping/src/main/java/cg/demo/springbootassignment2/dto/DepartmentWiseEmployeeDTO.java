package cg.demo.springbootassignment2.dto;

// Operation 3: Count of employees per department
public class DepartmentWiseEmployeeDTO {

    private String dname;
    private long noOfEmps;

    public DepartmentWiseEmployeeDTO(String dname, long noOfEmps) {
        this.dname = dname;
        this.noOfEmps = noOfEmps;
    }

    public String getDname() { return dname; }
    public void setDname(String dname) { this.dname = dname; }
    public long getNoOfEmps() { return noOfEmps; }
    public void setNoOfEmps(long noOfEmps) { this.noOfEmps = noOfEmps; }

    @Override
    public String toString() {
        return "DepartmentWiseEmployeeDTO [dname=" + dname + ", noOfEmps=" + noOfEmps + "]";
    }
}