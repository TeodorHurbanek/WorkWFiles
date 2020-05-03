import java.io.*;
import java.util.List;

public class PersonRepositoryInFile implements PersonRepository {

    private String pathToFile;

    // TO DO implement methods to work /w Files

    public PersonRepositoryInFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public void savePerson(Person person) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(pathToFile, true))
        ){
            bufferedWriter.append(String.valueOf(person));
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Person readPersonById(int personId) {

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(pathToFile))
        ){
            String myLines = null;
            myLines = bufferedReader.readLine();
            while (myLines != null) {
                System.out.println("I read line: " + myLines);
                myLines = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        } catch (IOException e ) {
            System.out.println("Gener mistake");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Person> getAllPersons() {

        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader(pathToFile))
        ){
            String myLines = null;
            myLines = bufferedReader.readLine();
            while (myLines != null) {
                System.out.println("I read line: " + myLines);
                myLines = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        } catch (IOException e ) {
            System.out.println("Gener mistake");
            e.printStackTrace();
        }
        return null;
    }
}
