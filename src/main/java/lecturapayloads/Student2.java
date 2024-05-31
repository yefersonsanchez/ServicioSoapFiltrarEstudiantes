package lecturapayloads;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author yefer
 */
@XmlRootElement(name = "student")
@XmlType(propOrder = {"rollno", "address", "program", "period", "score"})
public class Student2 implements Comparable<Student2> {

    private String rollno;//Atributo
    private String address;//Elemento
    private String program;//Elemento
    private int period;//Elemento
    private int score;//Elemento

    public Student2() {
    }

    @XmlAttribute(name = "rollno")
    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    @XmlElement(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @XmlElement(name = "program")
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @XmlElement(name = "period")
    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @XmlElement(name = "score")
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student2 o) {
        return o.score - this.score;
    }
}
