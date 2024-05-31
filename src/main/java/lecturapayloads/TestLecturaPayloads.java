package lecturapayloads;

import javax.xml.bind.JAXBException;

/**
 *
 * @author yefer
 */
public class TestLecturaPayloads {

    public static void main(String[] args) throws JAXBException {

        String payload1 = "<class>\n"
                + "<students>\n"
                + "<student rollno=\"393\">\n"
                + "<firstname>dinkar</firstname>\n"
                + "<lastname>kad</lastname>\n"
                + "<nickname>dinkar</nickname>\n"
                + "<marks>85</marks>\n"
                + "</student>\n"
                + "<student rollno=\"493\">\n"
                + "<firstname>Vaneet</firstname>\n"
                + "<lastname>Gupta</lastname>\n"
                + "<nickname>vinni</nickname>\n"
                + "<marks>95</marks>\n"
                + "</student>\n"
                + "<student rollno=\"593\">\n"
                + "<firstname>jasvir</firstname>\n"
                + "<lastname>singn</lastname>\n"
                + "<nickname>jazz</nickname>\n"
                + "<marks>90</marks>\n"
                + "</student>\n"
                + "</students>\n"
                + "</class>";

        String payload2 = "<class>\n"
                + "<students>\n"
                + "<student rollno=\"493\">\n"
                + "<address> Always Live Avenue </address>\n"
                + "<program> Electronic Engineering </program>\n"
                + "<period>3</period>\n"
                + "<score>395</score>\n"
                + "</student>\n"
                + "<student rollno=\"593\">\n"
                + "<address> Libertador Avenue </address>\n"
                + "<program> System Engineering </program>\n"
                + "<period>4</period>\n"
                + "<score>350</score>\n"
                + "</student>\n"
                + "<student rollno=\"393\">\n"
                + "<address> Libertador Avenue </address>\n"
                + "<program> System Engineering </program>\n"
                + "<period>4</period>\n"
                + "<score>480</score>\n"
                + "</student>\n"
                + "</students>\n"
                + "</class>";

        System.out.println("");
        LecturaPayloads p = new LecturaPayloads();
        String res = p.lectura(payload1, payload2);
        System.out.println("resultado final: ");
        System.out.println(res);

    }

}
