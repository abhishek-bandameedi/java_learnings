package Demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {
        try {

            ObjectMapper mapper=new ObjectMapper();

            Student student=mapper.readValue(new File("Data/demo1.json"),Student.class);

            System.out.println("First name = "+ student.getFirstName());
            System.out.println("Last name = "+ student.getLastName());

            Address address=student.getAddress();

            System.out.println("Street = "+address.getStreet());
            System.out.println("City = "+address.getCity());

            for (String lang: student.getLanguages()){
                System.out.println(lang);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
