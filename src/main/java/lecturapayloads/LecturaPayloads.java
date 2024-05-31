package lecturapayloads;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class LecturaPayloads {

    public String lectura(String payload1, String payload2) throws JAXBException {

        //Lectura Payload 1-----------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        JAXBContext context = JAXBContext.newInstance(PersonalInformation.class);//La clase que representa todo el contexto de nuestro xml

        //Unmarshaller permite pasar de xml a JAVA
        Unmarshaller unmarshaller = context.createUnmarshaller();//Permite leer el xml. 
        StringReader reader = new StringReader(payload1);

        PersonalInformation p1 = (PersonalInformation) unmarshaller.unmarshal(reader);

        ArrayList<Student> students = p1.getStudents();
        System.out.println("Payload1: ");
        System.out.println("");
        for (Student l : students) {
            System.out.println("Rollno: " + l.getRollno() + "  Firstname: " + l.getFirstname() + "  Lastname: " + l.getLastname() + "  Nickname: " + l.getNickname() + "  Marks: " + l.getMarks());
        }

        System.out.println("");

        System.out.println("-////////////////////////////////////////////////////////////////////////////////");

        LecturaPayloads pay = new LecturaPayloads();

//  Fin Lectura Payload1 ---------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<
        // Lectura Pay2---------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        JAXBContext context2 = JAXBContext.newInstance(OtherInformation.class);//La clase que representa todo el contexto de nuestro xml

        //Unmarshaller permite pasar de xml a JAVA
        Unmarshaller unmarshaller2 = context2.createUnmarshaller();//Permite leer el xml. 
        StringReader reader2 = new StringReader(payload2);

        OtherInformation p2 = (OtherInformation) unmarshaller2.unmarshal(reader2);

        ArrayList<Student2> students2 = p2.getStudents();
        System.out.println("Payload2: ");
        System.out.println("");
        for (Student2 l : students2) {
            System.out.println("Rollno: " + l.getRollno() + "  Address: " + l.getAddress() + "  Program: " + l.getProgram() + "  Period: " + l.getPeriod() + "  Score: " + l.getScore());

        }

        System.out.println("");

        System.out.println("-////////////////////////////////////////////////////////////////////////////////");

        LecturaPayloads or = new LecturaPayloads();

        String res = or.ordenarPayloads(students2, students);

        return res;

        //Fin Lectura Pay 2  --------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    }

    public String ordenarPayloads(ArrayList<Student2> students2, ArrayList<Student> students) {
        System.out.println("");
        System.out.println("--------Ordenando Programas por orden Alfabetico:--------------------");
        System.out.println("");

        //  Metodos para comparar atributos de objetos dentro de un arrayList
        Collections.sort(students2, new Comparator<Student2>() {

            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getProgram().compareToIgnoreCase(o2.getProgram());
            }
        });

        ArrayList<String> programas = new ArrayList<String>();
        System.out.println("--Imprimiendo ArrayList Student2--");
        for (int i = 0; i < students2.size(); i++) {
            System.out.println(students2.get(i).getProgram());
            programas.add(i, students2.get(i).getProgram());

        }

        System.out.println("");

        System.out.println("--Imprimiendo ArrayList de Programas--");
        for (int c = 0; c < programas.size(); c++) {
            System.out.println("" + programas.get(c));
        }

        // Eliminando repetidos del arrayList "programas";
        Set<String> set = new HashSet<>(programas);
        programas.clear();
        programas.addAll(set);
        // Aqui termina funcion de eliminar repetidos del arrayList "programas

        System.out.println("");
        System.out.println("");

        System.out.println("--Imprimiendo ArrayList Programas sin repetidos--");
        for (int t = 0; t < programas.size(); t++) {

            System.out.println("" + programas.get(t));
        }

        //Organizamos estudiantes por mejor score
        Collections.sort(students2);

        System.out.println("");
        System.out.println("-- Imprimiendo Los estudiantes por programa(programas ordenados por orden alfabetico) y estudiantes mejor score --");
        String cont = "";//Pasaremos Todo el arrayList a esta variable String
        // System.out.println("<Students>");
        cont += "<Students>\n";
        for (int t = 0; t < programas.size(); t++) {
            cont += "    " + "<program>" + programas.get(t) + "</program>\n";

            for (int i = 0; i < students.size(); i++) {
                if (programas.get(t).equals(students2.get(i).getProgram())) {
                    cont += "        " + "<Student>" + students.get(i).getFirstname() + " " + students.get(i).getLastname() + "</Student>\n";

                }

            }

        }
        cont += "</Students>";

        System.out.println("");
        System.out.println("-----Imprimiendo contenedor: ------");
        System.out.println("");

        return cont;

    }

}
