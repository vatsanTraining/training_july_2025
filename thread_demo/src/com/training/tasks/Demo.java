package com.training.tasks;

import java.util.List;

public class Demo {

	public static void main(String[] args) {

		
		
		
		
                   try {
                	   
                	   Thread t1 = new Thread( new MarkListTask(List.of("Ramesh","Suresh"),List.of(80.00,90.00)));
                       

                       Thread t2 = new Thread( new MarkListTask(List.of("Uma","Lakshmi"),List.of(60.00,50.00)));

                           t1.start();
                           
                           t2.start();

				t1.join();
				t2.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
            
           
                   
      			
				new MarkListTask().print();
		}

}
