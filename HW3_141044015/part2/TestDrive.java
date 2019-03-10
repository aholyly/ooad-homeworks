package part2;

/**
 * Test Class
 */
public class TestDrive {

    public static void main(String[] args) {

        //Adress Book
        GroupEmail adressBook = new GroupEmail("GTU Adress Book");

        //GROUPS
        //instructor group
        GroupEmail instructorGroup = new GroupEmail("Instructors");
        //add to group
        instructorGroup.add(new PersonalEmail("Samantha Want","SamanthaWant@gtu.edu.tr"));
        instructorGroup.add(new PersonalEmail("Mary Tate","MaryTate@gtu.edu.tr"));
        instructorGroup.add(new PersonalEmail("Cameron Gwynn","CameronGwynn@gtu.edu.tr"));


        //student groups
        GroupEmail computerEngGroup = new GroupEmail("Computer Engineering");
        GroupEmail electronicEngGroup = new GroupEmail("Electronic Engineering");

        //comp eng groups
        //1st
        GroupEmail comp1 = new GroupEmail("Computer Engineering 1st");
        comp1.add(new PersonalEmail("Elijah Coe","ElijahCoe@gtu.edu.tr"));
        comp1.add(new PersonalEmail("Claudia Gibb","ClaudiaGibb@gtu.edu.tr"));
        comp1.add(new PersonalEmail("Laura Weedon","LauraWeedon@gtu.edu.tr"));
        comp1.add(new PersonalEmail("Antwan Hospers","AntwanHospers@gtu.edu.tr"));
        //2nd
        GroupEmail comp2 = new GroupEmail("Computer Engineering 2nd");
        comp2.add(new PersonalEmail("Natalia Ilyina","NataliaIlyina@gtu.edu.tr"));
        comp2.add(new PersonalEmail("Aimee Carey","AimeeCarey@gtu.edu.tr"));
        comp2.add(new PersonalEmail("Max Hewitt","MaxHewitt@gtu.edu.tr"));
        //3rd
        GroupEmail comp3 = new GroupEmail("Computer Engineering 3rd");
        comp3.add(new PersonalEmail("Alice Hopkins","AliceHopkins@gtu.edu.tr"));
        comp3.add(new PersonalEmail("Harley Armstrong","HarleyArmstrong@gtu.edu.tr"));
        comp3.add(new PersonalEmail("Kieran Atkinson","KieranAtkinson@gtu.edu.tr"));

        //add to group
        computerEngGroup.add(comp1);
        computerEngGroup.add(comp2);
        computerEngGroup.add(comp3);

        //elect eng groups
        //1st
        GroupEmail elec1 = new GroupEmail("Electronic Engineering 1st");
        elec1.add(new PersonalEmail("Phoebe Long","PhoebeLong@gtu.edu.tr"));
        elec1.add(new PersonalEmail("Georgia Nicholson","GeorgiaNicholson@gtu.edu.tr"));
        elec1.add(new PersonalEmail("Declan Dickinson","DeclanDickinson@gtu.edu.tr"));
        elec1.add(new PersonalEmail("Amelia Nelson","AmeliaNelson@gtu.edu.tr"));
        //2nd
        GroupEmail elec2 = new GroupEmail("Electronic Engineering 2nd");
        elec2.add(new PersonalEmail("Tia Clarke","TiaClarke@gtu.edu.tr"));
        elec2.add(new PersonalEmail("Olivia Peacock","OliviaPeacock@gtu.edu.tr"));
        elec2.add(new PersonalEmail("Laura Butcher","LauraButcher@gtu.edu.tr"));
        //3rd
        GroupEmail elec3 = new GroupEmail("Electronic Engineering 3rd");
        elec3.add(new PersonalEmail("Zak Sharp","ZakSharp@gtu.edu.tr"));
        elec3.add(new PersonalEmail("Louie Stewart","LouieStewart@gtu.edu.tr"));
        elec3.add(new PersonalEmail("Alexander Henry","AlexanderHenry@gtu.edu.tr"));

        //add to group
        electronicEngGroup.add(elec1);
        electronicEngGroup.add(elec2);
        electronicEngGroup.add(elec3);

        //add to group
        adressBook.add(instructorGroup);
        adressBook.add(computerEngGroup);
        adressBook.add(electronicEngGroup);

        //print list
        adressBook.showEmailDetails();

    }
}
