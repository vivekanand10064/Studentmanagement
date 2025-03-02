package working;

public class Student {
String Name;
String Uid;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getUid() {
	return Uid;
}
public void setUid(String uid) {
	Uid = uid;
}
public Student(String name, String uid) {
	super();
	Name = name;
	Uid = uid;
}
@Override
public String toString() {
	return "Student Name=" + Name + ", Uid=" + Uid ;
}
}
