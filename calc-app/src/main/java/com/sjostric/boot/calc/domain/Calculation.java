package com.sjostric.boot.calc.domain;

public class Calculation {

	public enum OP {
		ADD, SUB, MULTI, DIV
	}

	private Integer a;
	private Integer b;
	private Integer result;
	private OP op;

	public Calculation(Integer a, Integer b, OP op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}

	public Calculation calc() {
		if (op == OP.ADD) {
			result = a + b;
		} else {
			throw new IllegalStateException("Operation not supported: " + op);
		}
		return this;
	}

	public Integer result() {
		return result;
	}

}
