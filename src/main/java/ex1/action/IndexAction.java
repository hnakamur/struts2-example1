package ex1.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class IndexAction extends ActionSupport {
	public static final String MESSAGE = "Struts is up and running ...";

	public String execute() throws Exception {
		setMessage(MESSAGE);
		return SUCCESS;
	}

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
