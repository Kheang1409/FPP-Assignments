package assignment07.prob3;

import java.util.ArrayList;
import java.util.List;

public class MarketingTest{

    public static void main(String[] args) {
        // a. Create an ArrayList of Marketing objects
        List<Marketing> marketingList = new ArrayList<>();

        // b. Add five Marketing objects
        marketingList.add(new Marketing("Jonh Wrick", "Product A", 850.25));
        marketingList.add(new Marketing("Will Smith", "Product B", 1200.50));
        marketingList.add(new Marketing("Mike White", "Product C", 789.99));
        marketingList.add(new Marketing("Manin Brown", "Product D", 1523.78));
        marketingList.add(new Marketing("Bob Smith", "Product E", 999.99));

        // c. Delete an object from Marketing (assuming by employee name)
        deleteMarketingByName(marketingList, "Jonh Wrick");

        // d. Print the size of the list
        System.out.println("List size: " + marketingList.size());

        // e. Retrieve a Marketing object by its position
        Marketing retrievedMarketing = marketingList.get(2);
        System.out.println("Marketing object at index 2: " + retrievedMarketing);

        // f. Update the details of a Marketing object by its position
        marketingList.get(1).setProductname("Product X");
        System.out.println("Updated Marketing object at index 1: " + marketingList.get(1));

        // g. equals() method is already defined in Marketing.java

        // h. Sort the list by salesamount (natural order)
        sortMarketingBySalesAmount(marketingList);
        System.out.println("\nList sorted by sales amount:");
        printList(marketingList);

        // i. Sort employees with sales > $1000
        List<Marketing> highSalesList = listMoreThan1000(marketingList);
        sortMarketingByName(highSalesList);
        System.out.println("\nEmployees with sales > $1000 sorted by name:");
        printList(highSalesList);
    }

    public static void deleteMarketingByName(List<Marketing> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmployeename().equals(name)) {
                list.remove(i);
                break;
            }
        }
    }

    public static void sortMarketingBySalesAmount(List<Marketing> list) {
        list.sort((ob1, ob2) -> Double.compare(ob1.getSalesamount(), ob2.getSalesamount()));
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> resultList = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesamount() > 1000) {
                resultList.add(marketing);
            }
        }
        return resultList;
    }

    public static void sortMarketingByName(List<Marketing> list) {
        list.sort(
                (o1, o2) -> o1.getEmployeename().compareTo(o2.getEmployeename())
        );
    }

    public static void printList(List<Marketing> list) {
        for (Marketing marketing : list) {
            System.out.println(marketing);
        }
    }
}