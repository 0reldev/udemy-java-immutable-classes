package dev.lpa;

public class Main {

    public static void main(String[] args) {

//        Person jane = new Person();
//        jane.setName("Jane");
//        Person jim = new Person();
//        jim.setName("Jim");
//        Person joe = new Person();
//        joe.setName("Joe");
//        Person john = new Person();
//        john.setName("John");
//        john.setDob("05/05/1900");
//        john.setKids(new Person[]{jane, jim, joe});
//        System.out.println(john);
////        John, dob = 05/05/1900, kids = Jane, Jim, Joe
////        → John isn't immutable.
//
//        john.setName("Jacob");
//        john.setKids(new Person[]{new Person(), new Person()});
//        System.out.println(john);
////        Jacob, dob = 05/05/1900, kids = null, null
////        → john object can be modified, because it isn't immutable.

//  → The setters for the name and de dob are removed in the Person object.

        Person jane = new Person("Jane", "01/01/1930");
        Person jim = new Person("Jim", "02/02/1932");
        Person joe = new Person("Joe", "03/03/1934");

        Person[] johnsKids = {jane, jim, joe};
        Person john = new Person("John","05/05/1900", johnsKids);

        System.out.println(john);
//        John, dob = 05/05/1900, kids = Jane, Jim, Joe

        john.setKids(new Person[]{new Person("Ann", "04/04/1930")});
        System.out.println(john);
//        John, dob = 05/05/1900, kids = Ann
//        → john can be modified

        Person[] kids = john.getKids();
        kids[0] = jim;
        System.out.println(john);
//        John, dob = 05/05/1900, kids = Jim
//        → john object still can be modified this way.

        kids = null;
        System.out.println(john);
//        John, dob = 05/05/1900, kids = Jim
//        → kids variable is independent.

        john.setKids(kids);
        System.out.println(john);
//        John, dob = 05/05/1900, kids = n/a


    }
}
