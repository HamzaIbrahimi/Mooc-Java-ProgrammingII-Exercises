public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        userInterface.getInput();
        userInterface.printBooks();
        ListSorter listSorter = new ListSorter();
        System.out.println();
        listSorter.printBookBasedOnAge(userInterface.getBookLibrary());
        System.out.println();
        listSorter.printBooksBasedOnAgeAndName(userInterface.getBookLibrary());
    }
}
