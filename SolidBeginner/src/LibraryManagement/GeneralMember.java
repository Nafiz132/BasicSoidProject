package LibraryManagement;

public class GeneralMember extends Membership implements ReadBook {
    public GeneralMember(ExecutiveMember executiveMembership) {
        super(executiveMembership);
    }

    public GeneralMember(String name, String dept, String bloodGroup, int memberId) {
        super(name, dept, bloodGroup, memberId);
    }

    public void reading(){
                System.out.println("Happy Reading! Widen your outlook!");
            }
}
