package LibraryManagement;

public class ExecutiveMember extends Membership implements ReadBook,Volunteer{

    public ExecutiveMember(ExecutiveMember executiveMember) {
        super(executiveMember);
    }

    public ExecutiveMember(String name, String dept, String bloodGroup, int memberId) {
        super(name, dept, bloodGroup, memberId);
    }

    public void reading(){
        System.out.println("Happy Reading! Widen your outlook!");
    }

    public void investTime(){
        System.out.println("May you be blessed for your volunteering time. ");
    }
}
