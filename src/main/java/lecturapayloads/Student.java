package lecturapayloads;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 *
 * @author yefer
 */
@XmlRootElement(name = "student")
@XmlType(propOrder = {"rollno", "firstname", "lastname", "nickname", "marks"})
public class Student  {

    private String rollno;//atributo
    private String firstname;//elemento
    private String lastname;//elemento
    private String nickname;//elemento
    private int marks;//elemento

    public Student() {
    }

    @XmlAttribute(name = "rollno")
    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    @XmlElement(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @XmlElement(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @XmlElement(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @XmlElement(name = "marks")
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}
