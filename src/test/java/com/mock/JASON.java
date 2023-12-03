package com.mock;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import genericutils.JSONUtils;
public class JASON {
	
	public static void main(String[] args) throws IOException, ParseException {
		JSONUtils ju=new JSONUtils();
		System.out.println(ju.readJSONData("browser"));;
	}

}
