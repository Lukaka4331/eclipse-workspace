package exam03;

/*Java 類別範例 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("number of students?");
        int n =scn.nextInt();
        //以Student這個類別所建立的陣列->物件陣列
        Student studs[] = new Student[n];
        String strName;//先宣告輸入的Name
        String strID;//先宣告輸入的ID
        for(int i=0;i<n;i++){
            System.out.println((i+1)+"'s student naem:");
            strName = scn.next();
            System.out.println((i+1)+"'s student id:");
            strID = scn.next();
            studs[i]=new Student(strName,strID);
        }
        //測試類別功能
        System.out.println(n+"'s student sex:");
        studs[n-1].setSex(scn.next());
        System.out.println("第"+n+"位同學的名字是"+studs[n-1].getName());
        System.out.println("第"+n+"位同學的性別是"+studs[n-1].getSex());
    }
    //--資料成員(Data Member)
    //Stduent類別
    ///class Student -> public static class Student 
    //這是因為Student 作為 Main 的內部類，但未聲明為成員。當你有一個非靜態的內部類時，它只能使用外部類的對象進行實例化，否則表達式（在內部類中是合法的）將沒有要引用的實例。
    //解決方案是簡單地將聲明取代為class Student -> public static class Student 
    //static的用途是初始化靜態變數。程式的執行從 main 方法開始。如果類中存在靜態塊，則它會在 main 方法執行之前執行。
    public static class Student{
        String name;//姓名
        String id;//學號
        String address;//住址
        String sex;//性別
        String phone;//電話
    //--資料成員(Data Member)--END

    //--建構元(Constructor)
    //建構元可以是空的不用傳入參數也不用回傳值
    // public Student(){

    //     }        
    //傳入參數建構
    public Student(String name1,String id1){
        name = name1;//後者為參數名
        id = id1;

        }    
    //--建構元(Constructor)--END

    //--函式成員(Function Member)
    //void 有傳入參數，無回傳值
    public void setName(String name2){
        name = name2;
    }
    //無傳入參數，有回傳值
    public String getName(){
        return name;
    }
    //void 有傳入參數，無回傳值
    public void setID(String id2){
        id = id2;
    }
    //無傳入參數，有回傳值
    public String getID(){
        return id;
    }    
    //void 有傳入參數，無回傳值
    public void setSex(String sex2){
        sex = sex2;
    }
    //無傳入參數，有回傳值
    public String getSex(){
        return sex;
    }  
    public void speak(String content){
        System.out.println("say:"+content);
    }
    //--函式成員(Function Member)--END




    }
    


}

