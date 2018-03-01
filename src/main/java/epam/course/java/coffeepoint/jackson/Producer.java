package epam.course.java.coffeepoint.jackson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;

import epam.course.java.coffeepoint.Genesis;
import epam.course.java.coffeepoint.Item;

@JsonPropertyOrder(value = {"coffee","firstName","lastName"},alphabetic=true)
@JsonRootName("Suplier")
public class Producer extends Person{
	public static void main(String[] args) throws JsonProcessingException {
		Producer p=new Producer("Vova","Tod");
		p.setaIndex("a678");
		p.setzIndex("z678");
		Item item = new Item().build(Genesis.Coffee).build("Brasil");
		Item item1 = new Item().build(Genesis.Chocolade).build("Brasil");
		p.setItems(Arrays.asList(item,item1));
		String result = new ObjectMapper().writeValueAsString(p);
		System.out.println(result);
		System.out.println(generateJacksonShema());
	}
	
	int id;
	String zIndex;
	String aIndex;
	private String info;
	List<Item>items=new ArrayList<>();
	@JsonGetter("coffee")
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Producer(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getzIndex() {
		return zIndex;
	}
	public void setzIndex(String zIndex) {
		this.zIndex = zIndex;
	}
	public String getaIndex() {
		return aIndex;
	}
	public void setaIndex(String aIndex) {
		this.aIndex = aIndex;
	}
	
	public static String  generateJacksonShema() throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
	    //There are other configuration options you can set.  This is the one I needed.
//	    mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
	 // configure mapper, if necessary, then create schema generator
	 JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
	 JsonSchema schema = schemaGen.generateSchema(Person.class);
	    return mapper.writeValueAsString(schema);
	}
	@JsonRawValue
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

}
