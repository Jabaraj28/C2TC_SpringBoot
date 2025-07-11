package com.tnsif.DI;
import org.springframework.stereotype.Component;

@Component
public class Customer2 {
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	void show() {
		System.out.println("The is from customer2 class");
	}

}
