package com.rillis.config;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.JSONObject;

public class Config {
	
	private File archive = null;
	private JSONObject base = null;
	
	public Config(File archive) {
		this.archive = archive;
		initArchive();
	}	
	public Config(String folder, String archive) {
		this.archive = new File(System.getenv("APPDATA")+"\\"+folder+"\\"+archive);
		initArchive();
	}
	public Config(String archive) {
		this.archive = new File(System.getenv("APPDATA")+"\\ConfigCore\\"+archive);
		initArchive();
	}
	
	private void initArchive() {
		if(!archive.getParentFile().exists()) {
			archive.mkdirs();
		}		
		if(!archive.exists()) {
			try {
				archive.createNewFile();
				JSONObject temp = new JSONObject();
				write(temp);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		this.base = read();
	}
	
	public Object get(String key) {
		return base.get(key);
	}
	
	public void set(String key, Object value) {
		base.put(key, value);
		write(base);
	}
	
	public int getKeyCont() {
		return base.length();
	}
	
	public boolean has(String key) {
		return base.has(key);
	}
	
	public void remove(String key) {
		base.remove(key);
		write(base);
	}
	
	public Iterator<String> getKeys(){
		return base.keys();
	}
	
	private void write(JSONObject json) {
		String text = json.toString();
	    try {
	    	BufferedWriter writer = new BufferedWriter(new FileWriter(archive, false));
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private JSONObject read(){
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(archive));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		String content = "";
	    String line;
	     
	    try {
			while ((line = reader.readLine()) != null) {
			    content+=line;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
	    return new JSONObject(content);
	}
}
