package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class LogWriter {
		
	public void writer(String description, BigDecimal amount, BigDecimal balance){
			
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		try(PrintWriter logWriter = new PrintWriter(new FileOutputStream(new File("./log.txt"), true))) {
			
			String printToday = date.toString();
			String printTime = time.toString();
			String printDescription = description.toString();
			String printAmount = amount.toString();
			String printBalance = balance.toString();
				
			logWriter.println(printToday + " " + printTime + " " + String.format("%-25s", printDescription) + String.format("%-25s", printAmount) + String.format("%-25s", printBalance));
			
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
		
		
		
	}
}
