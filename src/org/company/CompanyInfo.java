package org.company;
//method overloading based on datatype counts
public class CompanyInfo {
	
	private void compamnyName(String name,int iD,long mobileNum,char gender,boolean status,float height,double serverId ) {
		
		System.out.println("company name is "+name+"\n"+"comapany id is "+iD+"\n"+"comapny mobilenumber is"+mobileNum+"\n"+"company gender is"+gender+"\n+"+"company status is "+status+"\n"+"company heighht is "+height+"\n"+"company server id is "+serverId);
		
		

	}
	public static void main(String[] args) {
		CompanyInfo a = new CompanyInfo();
		a.compamnyName("Greens", 462426, 6383184289l, 'M', true, 7.8f, 12.89378687);
	}
	
	

}
