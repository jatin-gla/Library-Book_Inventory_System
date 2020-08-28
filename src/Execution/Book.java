package Execution;
import java.util.Scanner;

public class Book {
    private String Bname;
    String AuthName,isbn;

    Book(){

        Bname="Unknown";
        AuthName="Unknown";
        isbn="Unkonwn";

    }

    Book(String name,String Aname,String ISBN)
    {
        Bname=name;
        AuthName=Aname;
        isbn=ISBN;
    }

    String getBookName(){
        return Bname;
    }
    void setBookName(String name){
        Bname=name;
    }


    void show(){
        System.out.println("Book Name: "+Bname+"\nAuthor Name: "+AuthName+"\nISBN No.: "+isbn);




    }
}


class Student{
    long UniRoll;
    String fname,mname,lname;

    private int no_Books_issued;
    Student(){}

    Student(String fn,String mn,String ln,long UniRoll){

        fname=fn;
        mname=mn;
        lname=ln;
    }
    void setIsuuedBooks(int r){
        no_Books_issued+=r;

    }
    long getIsuuedBooks(){
        return no_Books_issued ;
    }
/*
void IssuedBooksNames(){

System.out.println("No Book issued yet");
}

*/
}


class Library{
    Library(){}

    int indexNo=-1;
    private String book[]=new String[10000];

    void setBookInStock(String bName){
        book[++indexNo]=bName;
    }
    void BooksPresentInStock(){
        System.out.println("No Books are available in stock");

    }



}

class FrontDesk{

    public static void main(String ak[]){

        System.out.println("\n-=-=-=-=-Welcome To The Front Desk-=-=-=-=-\nHow may I help you today?\n1. Issue a new Book for me.\n2. Return a previously issues book for me\n3. Show me all issues books.\n4. Exit.");
        Scanner A=new Scanner(System.in);
        int choice=A.nextInt();
        System.out.println("Enter your first name");
        String fname=A.next();
        System.out.println("Enter your Middle  name");
        String mname=A.next();
        System.out.println("Enter your last  name");
        String lname=A.next();
        System.out.println("Enter University Roll");
        long roll=A.nextLong();
        if(choice==1){
            System.out.println("Enter Book Name and Author name and ISBN ");
            String Bname=A.next();
            String Aname=A.next();
            String ISBN=A.next();
            Book ob=new Book(Bname,Aname,ISBN);

            Student object=new Student();
            object.setIsuuedBooks(1);
            System.out.println("Books Issued to you is: "+object.getIsuuedBooks());



            System.out.println("This Book Successfully Issued to you");




        }
        if(choice==2){

            System.out.println("Enter Book Name and Author name and ISBN ");
            String Bname=A.next();
            String Aname=A.next();
            String ISBN=A.next();
            Book ob=new Book(Bname,Aname,ISBN);
            Library object=new Library();
            object.setBookInStock(Bname);

            System.out.println("Your Book Returned Successfully");
        }

        if(choice==3){

            Student object=new Student();
            System.out.println("No. of Books Issued to you is: "+object.getIsuuedBooks());

        }
        if(choice==4){
            System.out.println(fname+",Thanks for Visiting Library (*_*)");
            System.exit(0);

        }

    }

}
