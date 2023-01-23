package club;

public class ClubApplication {

    public static void main (String args[]) {

//        Member member1, member2, member3;
//        Facility fac1, fac2, fac3;

//        member1 = new Member ("Edison", "Thomas", "Alva", 1);
//        member2 = new Member ("Baggio", "Roberto", null, 2);
//        member3 = new Member ("Webber", "Andrew", "Lloyd", 3);

//        fac1 = new Facility ("Main Hall", null);
//        fac2 = new Facility ("Room1", "Conference Room on Level 2");
//        fac3 = new Facility ("Room2", "Meeting Room on Level 3");

//        System.out.println ("Members:");
//        member1.show ();
//        member2.show ();
//        member3.show ();
//        System.out.println ("\nFacilities:");
//        fac1.show ();
//        fac2.show ();
//        fac3.show ();
    	
    	Club club = new Club();
    	Member member1 = club.addMember("Edison", "Thomas", "Alva");
    	Member member2 = club.addMember("Baggio", "Roberto", null);
    	Member member3 = club.addMember("Webber", "Andrew", "Lloyd");
    	Member member4 = club.addMember("Andy", "Ng", null);
    	Member member5 = club.addMember("Aaron", "Tan", null);
    	Member member6 = club.addMember("Daisy", "Teo", null);
    	
//    	member1.show();
//    	member2.show();
//    	member3.show();
//    	
    	System.out.println();
    	club.showMembers();
    	
    	System.out.println();
    	club.removeMembers(2);
    	club.showMembers();
    	
    	System.out.println();
    	club.removeMembers(4);
    	
    	club.showMembers();
    	
    }

}
