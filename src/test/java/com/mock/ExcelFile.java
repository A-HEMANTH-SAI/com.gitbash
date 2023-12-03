package com.mock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.poi.EncryptedDocumentException;

import genericutils.ExcelUtils;
public class ExcelFile{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExcelUtils eu=new ExcelUtils();
		HashMap<String,String> hm=eu.readMultipleData("Sheet1");
		for(Entry<String,String> t:hm.entrySet()) {
			System.out.println(t.getKey()+"\t"+t.getValue());
			}
		}
}