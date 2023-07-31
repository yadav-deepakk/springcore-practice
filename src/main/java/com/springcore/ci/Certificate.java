package com.springcore.ci;

public class Certificate {
	private String certName;
	
	public Certificate() {
		super();
	}
	public Certificate(String certName) {
		super();
		this.certName = certName;
	}

	public String getCertName() {
		return certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	@Override
	public String toString() {
		return "Certificate [certName=" + certName + "]";
	}
	
	

}
