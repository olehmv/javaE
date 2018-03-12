//package epam.course.java.coffeepoint.jackson;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertThat;
//
//import org.hamcrest.CoreMatchers;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class SerializationTest {
//	@Test
//	public void testProducerSerialization() throws JsonProcessingException {
//		Producer p = new Producer("Vova","Tod");
//		String result = new ObjectMapper().writeValueAsString(p);
//		assertThat(result, CoreMatchers.containsString("coffee"));
//	}
//	@Test
//	public void testPropertyOrder() {
//	}
//	@Test
//	public void testRawValue() throws JsonProcessingException {
//		String producerInfo="{\"level\":\"first\",\"trusted\":\"true\"}";
//		Producer p= new Producer("Vova","Tod");
//		p.setInfo("{\"level\":\"first\",\"trusted\":\"true\"}");
//		String result = new ObjectMapper().writeValueAsString(p);
//		assertThat(result, CoreMatchers.containsString(producerInfo));
//	}
//
//}
