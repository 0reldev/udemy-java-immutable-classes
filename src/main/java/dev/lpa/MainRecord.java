package dev.lpa;

public class MainRecord {

    public static void main(String[] args) {

        PersonRecord jane = new PersonRecord("Jane", "01/01/1930");
        PersonRecord jim = new PersonRecord("Jim", "02/02/1932");
        PersonRecord joe = new PersonRecord("Joe", "03/03/1934");

        PersonRecord[] johnsKids = {jane, jim, joe};
        PersonRecord john = new PersonRecord("John","05/05/1900", johnsKids);

        System.out.println(john);
//        John, dob = 05/05/1900, kids = Jane, Jim, Joe

        PersonRecord johnCopy = new PersonRecord("John", "05/05/1900");
        System.out.println(johnCopy);
//        John, dob = 05/05/1900, kids = , , , , , , , , , , , , , , , , , , ,

        PersonRecord[] kids = johnCopy.kids();
        kids[0] = jim;
        kids[1] = new PersonRecord("Ann", "04/04/1936");
        System.out.println(johnCopy);
//        John, dob = 05/05/1900, kids = Jim, Ann, , , , , , , , , , , , , , , , , ,
//        → the 19 comas are a side effect of the record without defensive measure. The two first children have been modifier, which is unexpected.
//        A record is supposed to be immutable, but some unwanted side effect can happen if defensive measures are not implemented to force immutability.

//         → After adding the defensive measure which is the getter for the kids field in the PersonRecord object, this is what is got:
//        John, dob = 05/05/1900, kids = , , , , , , , , , , , , , , , , , , ,

        johnsKids[0] = new PersonRecord("Ann", "04/04/1936");
        System.out.println(john);
//        John, dob = 05/05/1900, kids = Ann, Jim, Joe
    }

}
