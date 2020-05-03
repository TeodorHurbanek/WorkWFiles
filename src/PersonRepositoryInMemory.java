import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryInMemory implements PersonRepository {


    private List<Person> personList;
    public PersonRepositoryInMemory() {
        this.personList = new ArrayList<>();
    }

    @Override
    public void savePerson(Person person) {
        this.personList.add(person);
    }

    @Override
    public Person readPersonById(int personId) {
        for (Person personElement : personList) {
            if (personElement.getId() == personId) {
                return personElement;
            }
        }
        return null;
    }

    @Override
    public List<Person> getAllPersons() {
        return this.personList;
    }
}
