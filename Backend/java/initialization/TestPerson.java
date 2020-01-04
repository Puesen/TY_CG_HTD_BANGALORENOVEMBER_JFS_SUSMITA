package initialization;

public class TestPerson {
public static void main(String[] args) {
	Person p1=new Person();
	p1.age=23;
	p1.name="Susmita";
	p1.personDetails();
	Person p2=new Person();
	p2.initialize(24,"Sucharita");
	p2.personDetails();

}
}
