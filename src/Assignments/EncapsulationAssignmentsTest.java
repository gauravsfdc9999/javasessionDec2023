package Assignments;

public class EncapsulationAssignmentsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assignemnt 1:
		Person p1 = new Person();
		p1.setName("Gaurav");
		p1.setAge(41);
		p1.setGender('M');
		p1.printInfo();
		
		//Assignment 2:
		BankAccount bk1 = new BankAccount();
		bk1.setAccountnumber("100000009");
		bk1.setOwner("Gaurav");
		bk1.setBalance(10000.00);
		bk1.printStatement();
		bk1.deposit(1000.00);
		bk1.printStatement();
		bk1.deposit(1000.00);
		bk1.printStatement();
		bk1.withdraw(1000.00);
		bk1.printStatement();

	}

}
