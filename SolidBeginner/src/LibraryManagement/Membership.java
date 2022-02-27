package LibraryManagement;

public class Membership {
    String name,dept,bloodGroup;
    int memberId;

    public Membership(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Membership(String name,String dept, String bloodGroup,int memberId){
        this.name=name;
        this.dept=dept;
        this.bloodGroup=bloodGroup;
        this.memberId=memberId;
    }
    public Membership(Membership membership){
        this.name=membership.name;
        this.dept=membership.dept;
        this.bloodGroup=membership.bloodGroup;
        this.memberId=membership.memberId;
    }
    
    public void displayInfo(){
        System.out.println("Information about the Member with Id "+memberId +" is shown below : ");
        System.out.println("Name      : "+name);
        System.out.println("Department: "+dept);
        System.out.println("BloodGroup: "+bloodGroup);
        System.out.println("ID        : "+memberId);
    }
}
