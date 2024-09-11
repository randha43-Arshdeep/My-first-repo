package newpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bipan
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter a word: ");
         String input= scan.nextLine();
         char[] arr = new char[input.length()];
         System.out.println(input);
         for (int i = 0; i < input.length(); i++) {
             char c = input.charAt(i);
             arr[i]=c;
         }
         for(int j=arr.length-1; j>=0;j--){
             System.out.print(arr[j]);
         }
        Student std = new Student();
        String[] names = {"ab","bc","cg"};
        for(int i=0; i<3;i++){
            std.setName(names[i]);
            System.out.println(std.getName());
        }
        
    }
}
class Student{
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
