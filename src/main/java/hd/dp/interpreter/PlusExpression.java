package hd.dp.interpreter;

public class PlusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		System.out.println("自加 。。。");

		Integer output = Integer.parseInt(context.getInput());
		output++;

		context.setOutput(output);
		context.setInput(String.valueOf(output));
	}

}
