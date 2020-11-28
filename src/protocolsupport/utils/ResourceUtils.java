package protocolsupport.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import protocolsupport.ProtocolSupport;

public class ResourceUtils {

	protected static final String resourcesDirName = "resources";

	public static InputStream getAsStream(String name) {
		return ProtocolSupport.class.getClassLoader().getResourceAsStream(resourcesDirName + "/" + name);
	}

	public static BufferedReader getAsBufferedReader(String name) {
		InputStream resource = getAsStream(name);
		return resource != null ? new BufferedReader(new InputStreamReader(resource, StandardCharsets.UTF_8)) : null;
	}

	public static JsonObject getAsJsonObject(String name) {
		BufferedReader reader = getAsBufferedReader(name);
		return reader != null ? JsonUtils.readJsonObject(reader) : null;
	}

	public static JsonArray getAsJsonArray(String name) {
		BufferedReader reader = getAsBufferedReader(name);
		return reader != null ? JsonUtils.readJsonArray(reader) : null;
	}

}
