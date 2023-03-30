import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javafx.print.PrintColor;
import javafx.scene.control.ListCell;

public class GroupAging {
    public static void main(String[] args) {
        ArrayList<data1> ar = new ArrayList<>();

        ar.add(new data1("John", 5));
        ar.add(new data1("Doe", 55));
        ar.add(new data1("Tim",40));
        ar.add(new data1("Max", 19));
        ar.add(new data1("Hakeem",6));

        // List<data1> filteredData = ar.stream().filter(p -> p.getAge()<10).collect(Collectors.toList());
        System.out.println("Members between 0-10 Age Group");
        List<data1> filteredData = ar.stream().filter(p -> p.getAge()<10).collect(Collectors.toList());
        if(filteredData.size()>0){
            System.out.println(filteredData);
        }else{
            System.out.println("no data found");
        }

        System.out.println("Members between 10-20 Age Group");
        List<data1> filteredData2 = ar.stream().filter(p -> p.getAge()>=10&&p.getAge()<20).collect(Collectors.toList());
        if(filteredData2.size()>0){
            System.out.println(filteredData2);
        }else{
            System.out.println("no data found");
        }

        System.out.println("Members between 20-30 Age Group");
        List<data1> filteredData3 = ar.stream().filter(p->p.getAge()>=20&& p.getAge()<30).collect(Collectors.toList());
        if(filteredData3.size()>0){
            System.out.println(filteredData3);
        }else{
            System.out.println("no data found");
        }

        System.out.println("Members between 30-40 Age Group : ");
        List<data1> filteredData4 = ar.stream().filter(p->p.getAge()>=30&& p.getAge()<40).collect(Collectors.toList());
        if(filteredData4.size()>0){
            System.out.println(filteredData4);
        }else{
            System.out.println("no data found");
        }


        System.out.println("Members between 40-50 Age Group : ");
        List<data1> filteredData5 = ar.stream().filter(p->p.getAge()>=40&& p.getAge()<50).collect(Collectors.toList());
        if(filteredData5.size()>0){
            System.out.println(filteredData5);
        }else{
            System.out.println("no data found");
        }


        System.out.println("Members between 50 or 50+ Age Group : ");
        List<data1> filteredData6 = ar.stream().filter(p-> p.getAge()>=50).collect(Collectors.toList());
        if(filteredData6.size()>0){
            System.out.println(filteredData6);
        }else{
            System.out.println("no data found");
        }

        
        
        // for(int i = 0; i<ar.size(); i++){
        //     if(ar.get(i).getAge()<10){
        //         System.out.println("Members between 0-10 Age Group : ");
                
        //     }
        // }
        
    }
}


class data1{
    private String name;
    private int age;

    data1(String name, int age){
        this.name = name;
        this.age = age;
    }
    

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    

    public String toString(){
        return "Name : "+this.name+" "+" Age : "+this.age;
    }
}
