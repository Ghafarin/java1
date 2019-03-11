package school;
import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    public static void main(String[] args) {
        Moshakhasat st1 = new Moshakhasat();
        Moshakhasat st2 = new Moshakhasat();

        st1.name = "sahar";
        st1.family = "zamani";
        st1.course.add("riazi");
        st1.course.add("zaban");
        st1.courseNum.put("riazi",20);
        st1.courseNum.put("zaban",18);

        st2.name = "maryam";
        st2.family = "nezami";
        st2.course.add("riazi");
        st2.course.add("zaban");
        st2.courseNum.put("riazi",19);
        st2.courseNum.put("zaban",18);

        ArrayList<Moshakhasat> alStudent = new ArrayList<Moshakhasat>();

        alStudent.add(st1);
        alStudent.add(st2);

        Iterator itr = alStudent.iterator();
        while(itr.hasNext()){
            Moshakhasat sti=(Moshakhasat)itr.next();
            System.out.println(sti.name + " " + sti.family + " " + sti.course + " " + sti.courseNum);
        }
    }
}
