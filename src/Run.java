public class Run {

    public static void main(String[] args) {

        //Person person = new Person();
        PersonRepository personRepository = new PersonRepositoryInFile("C:\\Users\\Teodor Hurbánek\\Desktop\\newFile.txt");
        //personRepository.savePerson(person);

        for (int i = 0; i < 10; i++) {
            Person person = new Person("Teojko"+ i, "Hurbi"+ i, i, i);
            personRepository.savePerson(person);
        }

//        System.out.println("Read person w ID 5:");
//        System.out.println(personRepository.readPersonById(5));
//
//        System.out.println("Read all people:");
//        System.out.println(personRepository.getAllPersons());
    }
}
