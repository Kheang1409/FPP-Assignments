package assignment04.prog1;

public class TestClass {
    public static void main(String[] args) {
        Product[] col = new Product[5]; // Array Product of 5 items
        col[0] = new Clothing( "Athletic", 10);
        col[0].setProductName("T-Shirt");
        col[0].setPrice(6.00);

//        Test of NPE Exception
//        col[1] = new Clothing("Off-Brand", 20);
//        col[1].setProductName("Pajama");
//        col[1].setPrice(10.00);

        col[2] = new Clothing("Adidas", 75);
        col[2].setProductName("Shoes");
        col[2].setPrice(200.00);

        col[3] = new Electronics( 1, 2);
        col[3].setProductName("Airport");
        col[3].setPrice(30.00);

        col[4] = new Furniture("Wood", 0.25);
        col[4].setProductName("Whiteboard");
        col[4].setPrice(15.00);
        for(Product p : col){
            if(p!=null)
                System.out.println(p);
        }
        System.out.printf(STR."The sum of all \{col.length} items: %.2f", sumProducts(col));
    }

    private static double sumProducts(Product[] col){
        if(col == null || col.length == 0) return 0;
        return sumProductsGenerator(col, 0, 0.00);
    }
    private static double sumProductsGenerator(Product[] col, int index, double sum){
        if(index == col.length-1)
            return sum;
        if(col[index] != null)
            sum+=col[index].getPrice();
        return sum + sumProductsGenerator(col, index+1, sum);

    }
}