package exam02;

public class Book {
    private String title, author, publisher, isbn;
    private int pagenum;
    private float price;
    private static int count = 0;//

    public Book(){

    }
    public Book(String booktitle,String author1,int pageNum1){
        setTitle(booktitle);
        this.author=author1;
        this.pagenum=pageNum1;
    }

    public Book(String booktitle){
        setTitle(booktitle);
    }

    public void setTitle(String newTitle){
        if(newTitle.length()<256 && newTitle.length()>1){
            this.title=newTitle;
        }
        else{
            System.out.println("Error : book title data is incorrect");
        }
    }
    
    public String getTitle(){
        return this.title;
    }    

    public void setPage(int newPageNum){
        if(newPageNum>0 && newPageNum< Integer.MAX_VALUE){
            this.pagenum=newPageNum;
        }

    }
    //
    public static int getCount(){
        return count;
    }

}    