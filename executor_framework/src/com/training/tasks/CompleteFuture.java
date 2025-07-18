package com.training.tasks;
import java.util.concurrent.*;

public class CompleteFuture {

	public static void simpleDemo() throws InterruptedException, ExecutionException {
		
		
		        CompletableFuture<String> futureRef
		            = CompletableFuture.supplyAsync(() -> {
		                  return "Future Value";
		              });

		        System.out.println(futureRef.get());
		    }
		
	public static void combineComplete() throws InterruptedException, ExecutionException {
		
        CompletableFuture<String> task1
        = CompletableFuture.supplyAsync(() -> "Thanks for ");
        
    CompletableFuture<String> task2
        = CompletableFuture.supplyAsync(() -> "Visiting");

    CompletableFuture<String> combinedFuture
        = task1.thenCombine(
            task2, (m1, m2) -> m1 + " " + m2);

    System.out.println(combinedFuture.get());

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			simpleDemo();
			
			combineComplete();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}
