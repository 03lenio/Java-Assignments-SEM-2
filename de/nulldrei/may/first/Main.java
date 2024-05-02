package de.nulldrei.may.first;

public class Main {

     public static void main(String[] args) {
         /*
         Ex. 1
         ArrayList<String> emptyStringArrayList = new ArrayList<String>();
         Vector<String> emptyStringVector = new Vector<String>();

         for (int i = 1; i < 7; i++) {
             int digit = Integer.parseInt(JOptionPane.showInputDialog("Enter your digit"));
             if((i % 2) == 0) {
                 System.out.printf("Adding %d input to arraylist%n", i);
                 emptyStringArrayList.add(String.format("%d", digit));
             } else {
                 System.out.printf("Adding %d input to vector%n", i);
                 emptyStringVector.add(String.format("%d", digit));
             }
        }
         for(String s : emptyStringVector) {
             System.out.printf("Vector contains %s%n", s);
         }
         for(String s : emptyStringArrayList) {
             System.out.printf("ArrayList contains %s%n", s);
         }
          */

         DynamicStringArray ds = new DynamicStringArray();
         for(int i = 0; i<120; i++) {
             ds.add(String.valueOf(i));
             //System.out.println(ds.get(i));
         }
         System.out.println(ds.contains("0"));
         ds.removeAt(0);
         /*
         for(int i = 0; i< ds.getLength(); i++) {
             System.out.println(ds.get(i));
         }
         */
         System.out.println(ds.contains("0"));
         ds.printAll();


    }
}
