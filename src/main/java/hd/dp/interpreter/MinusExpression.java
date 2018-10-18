package hd.dp.interpreter;

public class MinusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		System.out.println("自减 。。。");
		Integer output = Integer.parseInt(context.getInput());
		output--;

		context.setOutput(output);
		context.setInput(String.valueOf(output));
	}

}
