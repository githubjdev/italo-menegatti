package dev.italo.execao;

public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println(e.getMessage());
	}

}
