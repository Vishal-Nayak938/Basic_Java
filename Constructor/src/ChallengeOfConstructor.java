public class ChallengeOfConstructor {

       static int totalBooks;

    ChallengeOfConstructor( String title,String author,String isbn)
    {
       System.out.println("title "+title+": Author "+author+": isbn "+isbn);
    }

void borrowBook()
{
    System.out.println("You have borrowed only two books");
}

void returnBook()
{
    System.out.println("One Book Returned.");
}
static void getTotalBooks()
{
System.out.println("Only 250 Books are here.");
}

    public static void main(String args[])
    {

      ChallengeOfConstructor c1=new ChallengeOfConstructor("Math","RS. Aggarwal","VK2301");

      c1.borrowBook();

      c1.returnBook();

      ChallengeOfConstructor.getTotalBooks();

    }
}
