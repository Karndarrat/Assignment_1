/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryJAVA_JSON;

/**
 *
 * @author Lrainbloody
 */


public class Data {
        String phone,Date,Starttime,Endtime,Promotion,Tel;
        int cost,usemin,usesec;
        
       Data(String _Date,String _Starttime,String _Endtime,String _Tel,String _Promotion){
       Date=_Date;
       Starttime=_Starttime;
       Endtime=_Endtime;
       Tel=_Tel;
       Promotion=_Promotion;
       }
  
       void Data(int _value){
            cost=_value;
       }
        
       
       void SumMin(String _Time){
           String time=_Time;
           String []Usetime = time.split(":"); 
           
           System.out.print("time: "+time);
           System.out.print(" Hour: "+Integer.parseInt(Usetime[0]));
           System.out.print(" Min: "+Usetime[1]);
           System.out.println(" Sec: "+Usetime[2]);
           
           int Hour=Integer.parseInt(Usetime[0]);
           int Minute=Integer.parseInt(Usetime[1]);
           usesec=Integer.parseInt(Usetime[2]);
           
           usemin=(Hour*60)+Minute;

           
        }
       

};
