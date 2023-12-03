package com.mock;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import genericutils.IPathConstants;

public class PropertyFile{
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(IPathConstants.PROPERTY_PATH);
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("un"));
		System.out.println(p.getProperty("pw"));
		System.out.println(p.getProperty("browser"));
	}
}