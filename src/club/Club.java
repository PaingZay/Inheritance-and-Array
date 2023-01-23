package club;

public class Club {
	private int membershipNumber;
	private Member[] members;
	
	public Club() {
		membershipNumber = 1;
		members = new Member[5];
	}
	
	public Member addMember(String surname, String firstName, String secondName) {
		ensureArraySize();
		
		Member newMember = new Member(surname, firstName, secondName, membershipNumber);
		members[membershipNumber] = newMember;
		
		membershipNumber++;
		
		return newMember;
	}
	
	private void ensureArraySize() {
		if (membershipNumber == members.length) {
			// Increase the array size
			int newSize = members.length * 2;
			Member[] newMembers = new Member[newSize];
			
			// Copy objects from the old array to the new one
			for (int i = 0; i < membershipNumber; i++) {
				newMembers[i] = members[i];
			}
			
			// Assign the array to the new array
			members = newMembers;
		}
	}
	
	public void showMembers() {
		for (int i = 1; i < membershipNumber; i++) {
			Member curMember = members[i];
			if (curMember != null) {
				curMember.show();
			}
		}
	}
	
	public void removeMembers(int membershipNumber) {
		if (membershipNumber >= 1 && membershipNumber <= this.membershipNumber - 1) {
			members[membershipNumber] = null;
		}
	}
}
