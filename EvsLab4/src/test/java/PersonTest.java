
import org.junit.Test;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void TestAdding() throws IOException{
        FileReader fileReader = new FileReader("C:\\Users\\Public\\foreign_names.csv");
        CSVReader reader = new CSVReader(fileReader, ';');
        String[] nextLine;
        List<Person> list = new ArrayList<>();
        nextLine = reader.readNext();
        Random rnd = new Random();
        int num = rnd.nextInt(25000);
        list.add(new Person(nextLine[0], nextLine[1], nextLine[2], nextLine[5], nextLine[3], nextLine[4], num));
        System.out.print(list.get(0).getId()+"; ");
        System.out.print(list.get(0).getName()+"; ");
        System.out.print(list.get(0).getSex()+"; ");
        System.out.print(list.get(0).getBirthDate()+"; ");
        System.out.print(list.get(0).getSubdTitle()+"; ");
        System.out.print(list.get(0).getSubdId()+"; ");
        System.out.print(list.get(0).getSalary()+"; ");
        System.out.println();
    }
}