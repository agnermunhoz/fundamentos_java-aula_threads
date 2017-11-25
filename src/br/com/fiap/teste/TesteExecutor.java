package br.com.fiap.teste;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TesteExecutor {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		try {
			Future<Integer> future = executor.submit(() -> {
				try {
					Random rand = new Random();
					TimeUnit.SECONDS.sleep(rand.nextInt(10)+1);
					return 123;
				}
				catch (InterruptedException e) {
					throw new IllegalStateException("Tarefa interrompida", e);
				}
			});
			int result = future.get(7, TimeUnit.SECONDS);
			System.out.println("Result = "+result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}
	}

}
