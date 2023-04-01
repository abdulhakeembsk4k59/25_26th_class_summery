import java.util.HashMap;
import java.util.Map;

public class BillSplitter {
    public static void main(String[] args) {
        Map<String, Double> bill = new HashMap<>();
        bill.put("Balaji", 2000.0);
        bill.put("Anand", 0.0);
        bill.put("Chaitanya", 750.0);
        bill.put("Divya", 0.0);

        Map<String, Double> paidBy = new HashMap<>();
        paidBy.put("Balaji", 2000.0);
        paidBy.put("Anand", 1000.0);
        paidBy.put("Chaitanya", 750.0);

        for (String person : bill.keySet()) {
            double amount = bill.get(person);
            double paid = paidBy.getOrDefault(person, 0.0);
            double share = amount / (bill.size() - 1);
            for (String other : bill.keySet()) {
                if (!person.equals(other)) {
                    double otherPaid = paidBy.getOrDefault(other, 0.0);
                    double otherShare = bill.get(other) / (bill.size() - 1);
                    double toPay = Math.round((otherShare - share) * 100) / 100.0;
                    if (toPay > 0) {
                        System.out.println(person + " owes " + other + " $" + toPay);
                    } else if (toPay < 0) {
                        System.out.println(other + " owes " + person + " $" + (-toPay));
                    }
                }
            }
        }
    }
}