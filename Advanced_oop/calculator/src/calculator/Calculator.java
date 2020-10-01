package calculator;

public class Calculator implements java.io.Serializable{
	
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private Double calcTotal = 0.0;
	private String operation = "";
	
	
	public Calculator() {
		
	}
	
	public Calculator(Double operandOne, String operation,  Double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
		
	}
	
	//Getters and Setters

	public Double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}

	public Double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public Double getTotal() {
		return calcTotal;
	}

	public void setTotal(Double calcTotal) {
		this.calcTotal = calcTotal;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
	// Methods
	
	 public void performOperation() {
		 if(this.getOperation().equals("+")) {
			 Double total = this.getOperandOne() + this.getOperandTwo();
			 this.setTotal(total);
		 }
		 else if(this.getOperation().equals("-")) {
			 Double total = this.getOperandOne() - this.getOperandTwo();
			 this.setTotal(total);
		 }
	 }
	 
	public void getResult() {
		System.out.println(this.getTotal());
	}
	
}
