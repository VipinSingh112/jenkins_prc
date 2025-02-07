package com.agriculture.remote.services.client.serdes.v1_0;

import com.agriculture.remote.services.client.dto.v1_0.AgricultureApplicationPermit;
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
public class AgricultureApplicationPermitSerDes {

	public static AgricultureApplicationPermit toDTO(String json) {
		AgricultureApplicationPermitJSONParser
			agricultureApplicationPermitJSONParser =
				new AgricultureApplicationPermitJSONParser();

		return agricultureApplicationPermitJSONParser.parseToDTO(json);
	}

	public static AgricultureApplicationPermit[] toDTOs(String json) {
		AgricultureApplicationPermitJSONParser
			agricultureApplicationPermitJSONParser =
				new AgricultureApplicationPermitJSONParser();

		return agricultureApplicationPermitJSONParser.parseToDTOs(json);
	}

	public static String toJSON(
		AgricultureApplicationPermit agricultureApplicationPermit) {

		if (agricultureApplicationPermit == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (agricultureApplicationPermit.getPIRPermitCertificate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"PIRPermitCertificate\": ");

			sb.append("\"");

			sb.append(
				_escape(
					agricultureApplicationPermit.getPIRPermitCertificate()));

			sb.append("\"");
		}

		if (agricultureApplicationPermit.getCaseId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"caseId\": ");

			sb.append("\"");

			sb.append(_escape(agricultureApplicationPermit.getCaseId()));

			sb.append("\"");
		}

		if (agricultureApplicationPermit.getDateOfExpiration() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateOfExpiration\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					agricultureApplicationPermit.getDateOfExpiration()));

			sb.append("\"");
		}

		if (agricultureApplicationPermit.getDateOfIssue() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dateOfIssue\": ");

			sb.append("\"");

			sb.append(
				liferayToJSONDateFormat.format(
					agricultureApplicationPermit.getDateOfIssue()));

			sb.append("\"");
		}

		if (agricultureApplicationPermit.getDurationOfPermit() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"durationOfPermit\": ");

			sb.append("\"");

			sb.append(
				_escape(agricultureApplicationPermit.getDurationOfPermit()));

			sb.append("\"");
		}

		if (agricultureApplicationPermit.getPirPermitNumber() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"pirPermitNumber\": ");

			sb.append("\"");

			sb.append(
				_escape(agricultureApplicationPermit.getPirPermitNumber()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		AgricultureApplicationPermitJSONParser
			agricultureApplicationPermitJSONParser =
				new AgricultureApplicationPermitJSONParser();

		return agricultureApplicationPermitJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(
		AgricultureApplicationPermit agricultureApplicationPermit) {

		if (agricultureApplicationPermit == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (agricultureApplicationPermit.getPIRPermitCertificate() == null) {
			map.put("PIRPermitCertificate", null);
		}
		else {
			map.put(
				"PIRPermitCertificate",
				String.valueOf(
					agricultureApplicationPermit.getPIRPermitCertificate()));
		}

		if (agricultureApplicationPermit.getCaseId() == null) {
			map.put("caseId", null);
		}
		else {
			map.put(
				"caseId",
				String.valueOf(agricultureApplicationPermit.getCaseId()));
		}

		if (agricultureApplicationPermit.getDateOfExpiration() == null) {
			map.put("dateOfExpiration", null);
		}
		else {
			map.put(
				"dateOfExpiration",
				liferayToJSONDateFormat.format(
					agricultureApplicationPermit.getDateOfExpiration()));
		}

		if (agricultureApplicationPermit.getDateOfIssue() == null) {
			map.put("dateOfIssue", null);
		}
		else {
			map.put(
				"dateOfIssue",
				liferayToJSONDateFormat.format(
					agricultureApplicationPermit.getDateOfIssue()));
		}

		if (agricultureApplicationPermit.getDurationOfPermit() == null) {
			map.put("durationOfPermit", null);
		}
		else {
			map.put(
				"durationOfPermit",
				String.valueOf(
					agricultureApplicationPermit.getDurationOfPermit()));
		}

		if (agricultureApplicationPermit.getPirPermitNumber() == null) {
			map.put("pirPermitNumber", null);
		}
		else {
			map.put(
				"pirPermitNumber",
				String.valueOf(
					agricultureApplicationPermit.getPirPermitNumber()));
		}

		return map;
	}

	public static class AgricultureApplicationPermitJSONParser
		extends BaseJSONParser<AgricultureApplicationPermit> {

		@Override
		protected AgricultureApplicationPermit createDTO() {
			return new AgricultureApplicationPermit();
		}

		@Override
		protected AgricultureApplicationPermit[] createDTOArray(int size) {
			return new AgricultureApplicationPermit[size];
		}

		@Override
		protected boolean parseMaps(String jsonParserFieldName) {
			if (Objects.equals(jsonParserFieldName, "PIRPermitCertificate")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "caseId")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "dateOfExpiration")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "dateOfIssue")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "durationOfPermit")) {
				return false;
			}
			else if (Objects.equals(jsonParserFieldName, "pirPermitNumber")) {
				return false;
			}

			return false;
		}

		@Override
		protected void setField(
			AgricultureApplicationPermit agricultureApplicationPermit,
			String jsonParserFieldName, Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "PIRPermitCertificate")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationPermit.setPIRPermitCertificate(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "caseId")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationPermit.setCaseId(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateOfExpiration")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationPermit.setDateOfExpiration(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateOfIssue")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationPermit.setDateOfIssue(
						toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "durationOfPermit")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationPermit.setDurationOfPermit(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "pirPermitNumber")) {
				if (jsonParserFieldValue != null) {
					agricultureApplicationPermit.setPirPermitNumber(
						(String)jsonParserFieldValue);
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