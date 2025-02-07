package com.agriculture.remote.services.client.serdes.v1_0;

import com.agriculture.remote.services.client.dto.v1_0.AgricultureApplicationStages;
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
public class AgricultureApplicationStagesSerDes {

	public static AgricultureApplicationStages toDTO(String json) {
		AgricultureApplicationStagesJSONParser
			agricultureApplicationStagesJSONParser =
				new AgricultureApplicationStagesJSONParser();

		return agricultureApplicationStagesJSONParser.parseToDTO(json);
	}

	public static AgricultureApplicationStages[] toDTOs(String json) {
		AgricultureApplicationStagesJSONParser
			agricultureApplicationStagesJSONParser =
				new AgricultureApplicationStagesJSONParser();

		return agricultureApplicationStagesJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		AgricultureApplicationStages agricultureApplicationStages) {

		if (agricultureApplicationStages == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (agricultureApplicationStages.getCaseId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"caseId\": ");

			sb.append("\"");

			sb.append(_escape(agricultureApplicationStages.getCaseId()));

			sb.append("\"");
		}

		if (agricultureApplicationStages.getDuration() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"duration\": ");

			sb.append("\"");

			sb.append(_escape(agricultureApplicationStages.getDuration()));

			sb.append("\"");
		}

		if (agricultureApplicationStages.getStageEndDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"stageEndDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					agricultureApplicationStages.getStageEndDate()));

			sb.append("\"");
		}

		if (agricultureApplicationStages.getStageName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"stageName\": ");

			sb.append("\"");

			sb.append(agricultureApplicationStages.getStageName());

			sb.append("\"");
		}

		if (agricultureApplicationStages.getStageStartDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"stageStartDate\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					agricultureApplicationStages.getStageStartDate()));

			sb.append("\"");
		}

		if (agricultureApplicationStages.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(agricultureApplicationStages.getStatus());

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AgricultureApplicationStagesJSONParser
			agricultureApplicationStagesJSONParser =
				new AgricultureApplicationStagesJSONParser();

		return agricultureApplicationStagesJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		AgricultureApplicationStages agricultureApplicationStages) {

		if (agricultureApplicationStages == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (agricultureApplicationStages.getCaseId() == null) {
			map.put("caseId", null);
		}
		else {
			map.put(
				"caseId",
				String.valueOf(agricultureApplicationStages.getCaseId()));
		}

		if (agricultureApplicationStages.getDuration() == null) {
			map.put("duration", null);
		}
		else {
			map.put(
				"duration",
				String.valueOf(agricultureApplicationStages.getDuration()));
		}

		if (agricultureApplicationStages.getStageEndDate() == null) {
			map.put("stageEndDate", null);
		}
		else {
			map.put(
				"stageEndDate",
				liferayToJSONDateFormat.format(
					agricultureApplicationStages.getStageEndDate()));
		}

		if (agricultureApplicationStages.getStageName() == null) {
			map.put("stageName", null);
		}
		else {
			map.put(
				"stageName",
				String.valueOf(agricultureApplicationStages.getStageName()));
		}

		if (agricultureApplicationStages.getStageStartDate() == null) {
			map.put("stageStartDate", null);
		}
		else {
			map.put(
				"stageStartDate",
				liferayToJSONDateFormat.format(
					agricultureApplicationStages.getStageStartDate()));
		}

		if (agricultureApplicationStages.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put(
				"status",
				String.valueOf(agricultureApplicationStages.getStatus()));
		}

		return map;
	}

	public static class AgricultureApplicationStagesJSONParser
		extends BaseJSONParser<AgricultureApplicationStages> {

		@Override
		protected AgricultureApplicationStages createDTO() {
			return new AgricultureApplicationStages();
		}

		@Override
		protected AgricultureApplicationStages[] createDTOArray(int size) {
			return new AgricultureApplicationStages[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "caseId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "duration")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "stageEndDate")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "stageName")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "stageStartDate")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			AgricultureApplicationStages agricultureApplicationStages,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "caseId")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationStages.setCaseId(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "duration")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationStages.setDuration(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "stageEndDate")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationStages.setStageEndDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "stageName")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationStages.setStageName(
						AgricultureApplicationStages.StageName.create(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "stageStartDate")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationStages.setStageStartDate(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationStages.setStatus(
						AgricultureApplicationStages.Status.create(
							(String)jsonParserFieldValue));
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