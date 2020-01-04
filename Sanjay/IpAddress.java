
//Write a program to Validate an IPv4 Address. According to Wikipedia, IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1 . The generalized form of an IPv4 address is (0-255).(0-255).(0-255).(0-255). Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

//Your task is  to complete the function isValid which returns 1 if the ip address is valid else returns 0. The function takes a string ip as its only argument .

//Input
//4
//222.111.111.111
//5555..555
//0000.0000.0000.0000
//1.2.3.04

//Output
//1
//0
//0
//0
import java.io.*;
import java.util.*;
import java.lang.*;


public class IpAddress
{
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter an ip address:");
     String ip=sc.nextLine();

     IpAddress obj=new IpAddress();

     System.out.println(obj.isValidIp(ip));
 }
 //(ip.charAt(i)).equals('.')
 public Boolean isValidIp(String ip)
 {
     int startingPoint=0,pos=0;
     int ipList[]=new int[10];
     for(int i=0;i<ip.length();i++)
     {
         if(ip.charAt(i)=='.')
         {
         ipList[pos]=Integer.parseInt(ip.substring(startingPoint,i));
         pos++;
         startingPoint=i+1;
         }
         if(i==ip.length()-1)
         {
        ipList[pos]=Integer.parseInt(ip.substring(startingPoint,i+1));
        }
     }
     
    
         int check=0;
         for(int i=0;i<ipList.length;i++)
         {
             if(ipList[i]>0 && ipList[i]<=255)
             {
                 check++;
             }
         }
         if(check==4)
             {
                 return true;
             }
     
    return false;
 }
}



























