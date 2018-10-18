package hd.dp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import hd.dp.interpreter.Context;
import hd.dp.interpreter.Expression;
import hd.dp.interpreter.MinusExpression;
import hd.dp.interpreter.PlusExpression;

public class InterpreterTest {

	@Test
	public void testInterpreter() {
		Context context = new Context();
		context.setInput("100");
		List<Expression> list = new ArrayList<Expression>();
		list.add(new PlusExpression());
		list.add(new PlusExpression());
		list.add(new PlusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());
		list.add(new MinusExpression());

		for (Expression expression : list) {
			expression.interpret(context);
			System.out.println("current output: " + context.getOutput());
		}
	}
}
