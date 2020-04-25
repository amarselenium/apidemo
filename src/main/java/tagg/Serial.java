package tagg;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;

public class Serial {

	private static String writeValueAsString;

	public static BaseSerial getObjectData(BaseSerial org) {

		// Insert the data
		org.setEmployeeid(5);
		org.setEmployeename("Amaresh");
		org.setEmployeesal(78000);

		return org;
	}

	public static void main(String[] args) throws JsonProcessingException {

		BaseSerial bs= new BaseSerial();
		bs=getObjectData(bs);
		
		com.fasterxml.jackson.databind.ObjectMapper obj= new com.fasterxml.jackson.databind.ObjectMapper();
		writeValueAsString = obj.writeValueAsString(bs);
		System.out.println(writeValueAsString);
		
		
		
	}
}