public class Main {
    public static void main(String[] args){
        Invoice invoice = new Invoice("frigider", "confortabil", 1, 5999.99);
        System.out.println(invoice.getAmount());
        Date date = new Date();
        date.setDay(5);
        date.setMonth(2);
        date.setYear(2024);
        date.displayDate();
    }
}