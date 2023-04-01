import java.util.ArrayList;
import java.util.List;

public class VarianceAndPct{
    public static void main(String[] args) {
        List<data1> sales21=new ArrayList<>();
        sales21.add(new data1("Tea", 100));
        sales21.add(new data1("Coffee", 100));
        sales21.add(new data1("Green Tea", 75));

        List<data1> sales22=new ArrayList<>();
        sales22.add(new data1("Tea", 120));
        sales22.add(new data1("Coffee", 110));
        sales22.add(new data1("Green Tea", 100));

        System.out.println("2021 Sales data of Product : ");
        System.out.println(sales21);
        System.out.println("2022 Sales data of Products : ");
        System.out.println(sales22);

        //Calculating Mean
        double mean_21=cal_mean(sales21);
        double mean_22=cal_mean(sales22);

        System.out.print("\nMean value of 2021 Sales : ");
        System.out.println(mean_21);
        System.out.print("Mean value of 2022 Sales : ");
        System.out.println(mean_22);

        //Calculating Variance
        double var_21=cal_variance(sales21,mean_21);
        double var_22=cal_variance(sales22,mean_22);

        System.out.print("\nVariance of 2021 Sales : ");
        System.out.println(var_21);
        System.out.print("Variance of 2022 Sales : ");
        System.out.println(var_22);

        //Calculating Variance Percentage
        double var_pct=(var_22-var_21)/var_21*100;
        System.out.print("\nVariance Percentage : ");
        System.out.println(var_pct+"%");
    }
    public static double cal_mean(List<data1> sales){
        double sum=sales.stream().mapToDouble(s->s.getPrice()).sum();
        return sum/sales.size();
    }
    public static double cal_variance(List<data1> sales,double mean){
        double sum=sales.stream().mapToDouble(s->Math.pow((s.getPrice()-mean),2)).sum();
        return sum/(sales.size()-1);
    }
}

class data1{
    private String name;
    private int price;
    data1(String name,int price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return "\n{Name : '"+this.name+"' Price :"+this.price+"}";
    }

}