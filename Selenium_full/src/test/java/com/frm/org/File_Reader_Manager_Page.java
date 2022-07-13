package com.frm.org;

public class File_Reader_Manager_Page {
	
	private File_Reader_Manager_Page() {
	}

	
	
	public static File_Reader_Manager_Page get_Instance() {

		
		File_Reader_Manager_Page frm=new File_Reader_Manager_Page();
		return frm;
	}
	
	
	public   Configuration_Reader_Page get_Instance_CR() throws Throwable {
Configuration_Reader_Page cr=new Configuration_Reader_Page();
return cr;
	}
}
