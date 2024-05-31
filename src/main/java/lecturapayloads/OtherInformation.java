package lecturapayloads;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author yefer
 * 
 */
@XmlRootElement(name = "class")
@XmlType(propOrder = {"students"})
public class OtherInformation {

    private ArrayList<Student2> students = new ArrayList();

    public OtherInformation() {
    }

    @XmlElementWrapper(name = "students")
    @XmlElement(name = "student")
    public ArrayList<Student2> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student2> students) {
        this.students = students;
    }

}


