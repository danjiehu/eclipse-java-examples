import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class MyJSON {

	public static void main(String args[]) {
		MyJSON j = new MyJSON();
		// j.JSONfromMap();
		// j.JSONfromString();
		// j.createJSONArray();
		j.JSONFromObject();
	}

	public void JSONfromMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "jon doe");
		map.put("age", "22");
		map.put("city", "chicago");
		JSONObject jo = new JSONObject(map);
		System.out.println(jo);
	}

	public void JSONfromString() {
		JSONObject jo = new JSONObject("{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}");
		System.out.println(jo);
	}

	public void createJSONArray() {
		JSONArray ja = new JSONArray();
		ja.put(Boolean.TRUE);
		ja.put("jon doe");

		JSONObject jo = new JSONObject();
		jo.put("name", "jon doe");
		jo.put("age", "22");
		jo.put("city", "chicago");

		ja.put(jo);
		System.out.println(ja);
	}

	public void JSONFromObject() {
		DemoClass demo = new DemoClass();
		demo.setId(1);
		demo.setName("jon doe");
		demo.setActive(true);

		JSONObject jo = new JSONObject(demo);
		System.out.println(jo);

	}
}
