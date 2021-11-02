package MyList;
/**
 * @author alsut
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
    	int a = 0;
        MyList<Integer> obj = new MyList<Integer>();
        Scanner in = new Scanner(System.in);
       while (a!=10) {
           switch (a) {
           case 0: {
        	   System.out.println("0. Menu");
               System.out.println("1. Add an item to the end of the list");
               System.out.println("2. Add an item to the top of the list");
               System.out.println("3. Delete the first item in the list");
               System.out.println("4. Delete the last item in the list");
               System.out.println("5. Get the length of the list");
               System.out.println("6. Insert an item into the list by index");
               System.out.println("7. Remove an item from the list by index");
               System.out.println("8. Get a list item by index");
               System.out.println("9. Print the list");
               System.out.println("10. Exit");
               System.out.println("Select an action");
        	   break;
           }
               case 1: {
                   System.out.println("Add an item to the end of the list. Input value");
                   var i = in.nextInt();
                   obj.addBack(i);
                   System.out.println("Select an action");
                   break;
               }
               case 2: {
                   System.out.println("Add an item to the top of the list. Input value");
                   var i = in.nextInt();
                   obj.addFront(i);
                   System.out.println("Select an action");
                   break;
               }
               case 3: {
                   try {
                       obj.popFront();
                   }
                   catch(Exception ex)
                   {
                       System.out.println(ex.getMessage());
                   }
                   System.out.println("Select an action");
                   break;
               }
               case 4: {
                   try {
                       obj.popBack();
                   }
                   catch(Exception ex)
                   {
                       System.out.println(ex.getMessage());
                   }
                   System.out.println("Select an action");
                   break;
               }
               case 5:{
            	   System.out.println("5. Get the length of the list");
            	   System.out.println(obj.getSize());
            	   System.out.println("Select an action");
            	   break;
               }
               case 6: {
                   System.out.println("Insert an item into the list by index. Input position");
                   var position = in.nextInt();
                   System.out.println("Input value");
                   var value = in.nextInt();
                   try {
                       obj.insertAt(position, value);
                   }
                   catch(Exception ex)
                   {
                       System.out.println(ex.getMessage());
                   }
                   System.out.println("Select an action");
                   break;
               }
               case 7: {
                   System.out.println("Remove an item from the list by index. Input position");
                   var position = in.nextInt();
                   try {
                       obj.popAt(position);
                   }
                   catch(Exception ex)
                   {
                       System.out.println(ex.getMessage());
                   }
                   System.out.println("Select an action");
                   break;
               }
               case 8: {
                   System.out.println("Get a list item by index. Input position");
                   var position = in.nextInt();
                   try {
                       System.out.println(obj.getAt(position));
                   }
                   catch(Exception ex)
                   {
                       System.out.println(ex.getMessage());
                   }
                   System.out.println("Select an action");
                   break;
               }
               case 9: {
            	   System.out.println("Print");
                   obj.print();
                   System.out.println("Select an action");
                   break;
               }
               default: {
            	  
               }
           }
           a = in.nextInt();
           if (a == 10)  System.out.println("Exit");
       }
    }
}

