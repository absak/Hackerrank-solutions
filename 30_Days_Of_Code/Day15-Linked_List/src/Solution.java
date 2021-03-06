/**
 * 	Verdict : Accepted
 * 	OJ 		: Hackerrank
 * 	
 * 	@author: absak
 * 	@version : June 9, 2016
 */
import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{
	public static  Node insert(Node head,int data){
		//Complete this method
		Node n = null;
        Node start=head;
        if(head == null){
        	n = new Node(data);
        }
        while(start!=null)
        {
            System.out.print(start.data+" ");
            if(start.next == null){
            	start.data = data;
            	n = start;
            }
            start=start.next;
        }
        return n;
	}
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int N=sc.nextInt();
          while(N-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);

   }
}