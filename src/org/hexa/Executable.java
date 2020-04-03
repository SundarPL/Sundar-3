package org.hexa;

public class Executable extends BaseClass{
	public static void main(String[] args) {
		openBrowser();
		loadUrl("https://www.facebook.com/");
		pageTitle();
		pageUrl();
		PojoClass pc1=new PojoClass();
		fill(pc1.getTxtEmail(), "Sundar");
		fill(pc1.getTxtPass(), "sundar");
		btnClick(pc1.getBtnClick());
	/*	driver.navigate().back();
		driver.navigate().refresh();
		PojoClass pc2=new PojoClass();
		fill(pc2.getTxtEmail(), "Raja");
		fill(pc2.getTxtPass(), "Raja");
		btnClick(pc2.getBtnClick());*/
		
	}
	

}
