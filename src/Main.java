/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jeff
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
	// TODO code application logic here
	MyLinkList m = new MyLinkList();
	System.out.println("Append 1");
	m.append(1);
	m.display();	
	
	System.out.println("Append 2");
	m.append(2);
	m.display();	
	
	System.out.println("Insert 3");
	m.insert(3);
	m.display();	
	
	System.out.println("Insert 4");
	m.insert(4);
	m.display();	
	
	System.out.println("Delete 1");
	m.delete(1);
	m.display();	

	System.out.println("Delete 4");
	m.delete(4);
	m.display();	
	
	System.out.println("Total nodes = " + m.count());
	
	Node n;
	
	n = m.get(0);
	if (n != null)
	    System.out.printf("Get(0) returned %d\n",n.data);
	
	n = m.get(1);
	if (n != null)
	    System.out.printf("Get(1) returned %d\n",n.data);
	
	

	
    }
    
}
