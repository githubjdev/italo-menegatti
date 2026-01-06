package dev.italo.generics;

public class ResponseApi<T> {

	private T data; /* Qualquer objejto, produto, pessoa, venda */
	private String message;
	private int code;

	public ResponseApi(T data, String message, int code) {
		this.data = data;
		this.message = message;
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}
