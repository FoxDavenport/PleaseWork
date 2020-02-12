package model_linkedlists;

import java.util.Scanner;


public class VideoGameLinkedList 
{
    class VideoGameN
        {
            //properties of videogame
            String Title="";
            int price=0;
            int hours;
            VideoGameN prev;
            VideoGameN next;
            
            VideoGameN(String T,int p,int h) {
                Title=T; price=p; hours=h;}
        
        }   
    VideoGameN head;
    //node called VideoGameN
     
    //push the data to top of linkedlist
    public void push(String T, int p, int h) 
        { 
         
            VideoGameN new_Node = new VideoGameN(T,p,h); 
      
            new_Node.next = head; 
            new_Node.prev = null; 
      
         
            if (head != null) 
                head.prev = new_Node; 
      
            head = new_Node; 
            
            //pushes the node to linkedlist and then creates new one for 
            //next node if user continues
        } 
      
        //print the linjkedlist
        public void printlist(VideoGameN node) 
        { 
            VideoGameN last = null; 
            System.out.println("LinkedList in forward Direction"); 
            while (node != null) { 
                System.out.println("Title: "+node.Title);
                System.out.println("Price:  " +node.price);
                System.out.println("Hours: " +node.hours);
                node = node.next; 
            } 
            System.out.println(); 
            //get a line in between
            System.out.println("LinkedList in reverse direction"); 
            while (last != null) { 

                System.out.println("Title: "+node.Title);
                System.out.println("Price:  " +node.price);
                System.out.println("Hours: " +node.hours);
                last = last.prev; 
            } 
        }
    

        public static void main(String args[])
        {
            VideoGameLinkedList VG= new VideoGameLinkedList();
            Scanner input = new Scanner(System.in);
            String Title;
            int price;
            int hours;
            int exit=1;
            int x=0;
            int counter=0;
            //creates scanner object to store user input
            //gets variables for looping till user done inputting data
            
            //add until user is done
            while(exit==1)
            {
                
                Title=util.ConsoleMethods.inputString("Enter the video game title");
                price=util.ConsoleMethods.inputInt("Enter the price of it");
                hours=util.ConsoleMethods.inputInt("Enter how long it is in hours");
                
                VG.push(Title, price, hours);
                
                System.out.println("Enter 1 to continue. Enter any other number to exit");
                exit= input.nextInt();  
                
     
                System.out.println("Current List: ");
                VG.printlist(VG.head);
            
                counter++;
            }
            
            //print
            System.out.println("");
            System.out.println("Final!!!");
            VG.printlist(VG.head);
        

            //delete node
            for(x=0;x<counter;x++)
            {
                VG.dNode(VG.head, VG.head);
                
            }
            VG.printlist(VG.head);
            System.out.println("The program has ended...");
            
        }


        //deletes nodes
        void dNode(VideoGameN head_ref, VideoGameN del) 
        { 
      
           
            if (head == null || del == null) { 
                return; 
            } 
      

            if (head == del) { 
                head = del.next; 
            } 
      
           
            if (del.next != null) { 
                del.next.prev = del.prev; 
            } 
      
       
            if (del.prev != null) { 
                del.prev.next = del.next; 
            } 
      
           
            return; 
        } 


}