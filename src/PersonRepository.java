import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface PersonRepository {

    public void savePerson(Person person);

    public Person readPersonById(int personId);

    public List<Person> getAllPersons();
}
