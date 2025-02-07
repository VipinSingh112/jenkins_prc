package com.agriculture.remote.services.client.serdes.v1_0;

import com.agriculture.remote.services.client.dto.v1_0.AgricultureApplicationInspection;
import com.agriculture.remote.services.client.json.BaseJSONParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author Yogesh Chandra
 * @generated
 */
@Generated("")
public class AgricultureApplicationInspectionSerDes {

	public static AgricultureApplicationInspection toDTO(String json) {
		AgricultureApplicationInspectionJSONParser
			agricultureApplicationInspectionJSONParser =
				new AgricultureApplicationInspectionJSONParser();

		return agricultureApplicationInspectionJSONParser.parseToDTO(json);
	}

	public static AgricultureApplicationInspection[] toDTOs(String json) {
		AgricultureApplicationInspectionJSONParser
			agricultureApplicationInspectionJSONParser =
				new AgricultureApplicationInspectionJSONParser();

		return agricultureApplicationInspectionJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		AgricultureApplicationInspection agricultureApplicationInspection) {

		if (agricultureApplicationInspection == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (agricultureApplicationInspection.getCaseId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"caseId\": ");

			sb.append("\"");

			sb.append(_escape(agricultureApplicationInspection.getCaseId()));

			sb.append("\"");
		}

		if (agricultureApplicationInspection.getDateofInspection() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateofInspection\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					agricultureApplicationInspection.getDateofInspection()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AgricultureApplicationInspectionJSONParser
			agricultureApplicationInspectionJSONParser =
				new AgricultureApplicationInspectionJSONParser();

		return agricultureApplicationInspectionJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		AgricultureApplicationInspection agricultureApplicationInspection) {

		if (agricultureApplicationInspection == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (agricultureApplicationInspection.getCaseId() == null) {
			map.put("caseId", null);
		}
		else {
			map.put(
				"caseId",
				String.valueOf(agricultureApplicationInspection.getCaseId()));
		}

		if (agricultureApplicationInspection.getDateofInspection() == null) {
			map.put("dateofInspection", null);
		}
		else {
			map.put(
				"dateofInspection",
				liferayToJSONDateFormat.format(
					agricultureApplicationInspection.getDateofInspection()));
		}

		return map;
	}

	public static class AgricultureApplicationInspectionJSONParser
		extends BaseJSONParser<AgricultureApplicationInspection> {

		@Override
		protected AgricultureApplicationInspection createDTO() {
			return new AgricultureApplicationInspection();
		}

		@Override
		protected AgricultureApplicationInspection[] createDTOArray(int size) {
			return new AgricultureApplicationInspection[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "caseId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "dateofInspection")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			AgricultureApplicationInspection agricultureApplicationInspection,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "caseId")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationInspection.setCaseId(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateofInspection")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationInspection.setDateofInspection(
						toDate((String)jsonParserFieldValue));
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			sb.append(_toJSON(value));

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static String _toJSON(Object value) {
		if (value instanceof Map) {
			return _toJSON((Map)value);
		}

		Class<?> clazz = value.getClass();

		if (clazz.isArray()) {
			StringBuilder sb = new StringBuilder("[");

			Object[] values = (Object[])value;

			for (int i = 0; i < values.length; i++) {
				sb.append(_toJSON(values[i]));

				if ((i + 1) < values.length) {
					sb.append(", ");
				}
			}

			sb.append("]");

			return sb.toString();
		}

		if (value instanceof String) {
			return "\"" + _escape(value) + "\"";
		}

		return String.valueOf(value);
	}

}