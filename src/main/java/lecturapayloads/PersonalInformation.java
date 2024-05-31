package lecturapayloads;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author yefer
 */
@XmlRootElement(name = "class")
@XmlType(propOrder = {"students"})
public class PersonalInformation {

    private ArrayList<Student> students = new ArrayList();

    public PersonalInformation() {
    }

    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}