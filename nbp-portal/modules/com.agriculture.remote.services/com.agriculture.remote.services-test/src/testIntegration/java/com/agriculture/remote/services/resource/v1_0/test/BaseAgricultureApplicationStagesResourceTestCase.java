package com.agriculture.remote.services.resource.v1_0.test;

import com.agriculture.remote.services.client.dto.v1_0.AgricultureApplicationStages;
import com.agriculture.remote.services.client.http.HttpInvoker;
import com.agriculture.remote.services.client.pagination.Page;
import com.agriculture.remote.services.client.resource.v1_0.AgricultureApplicationStagesResource;
import com.agriculture.remote.services.client.serdes.v1_0.AgricultureApplicationStagesSerDes;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.portal.vulcan.util.TransformUtil;

import java.lang.reflect.Method;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author Yogesh Chandra
 * @generated
 */
@Generated("")
public abstract class BaseAgricultureApplicationStagesResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_agricultureApplicationStagesResource.setContextCompany(testCompany);

		AgricultureApplicationStagesResource.Builder builder =
			AgricultureApplicationStagesResource.builder();

		agricultureApplicationStagesResource = builder.authentication(
			"test@liferay.com", PropsValues.DEFAULT_ADMIN_PASSWORD
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		AgricultureApplicationStages agricultureApplicationStages1 =
			randomAgricultureApplicationStages();

		String json = objectMapper.writeValueAsString(
			agricultureApplicationStages1);

		AgricultureApplicationStages agricultureApplicationStages2 =
			AgricultureApplicationStagesSerDes.toDTO(json);

		Assert.assertTrue(
			equals(
				agricultureApplicationStages1, agricultureApplicationStages2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = getClientSerDesObjectMapper();

		AgricultureApplicationStages agricultureApplicationStages =
			randomAgricultureApplicationStages();

		String json1 = objectMapper.writeValueAsString(
			agricultureApplicationStages);
		String json2 = AgricultureApplicationStagesSerDes.toJSON(
			agricultureApplicationStages);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	protected ObjectMapper getClientSerDesObjectMapper() {
		return new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		AgricultureApplicationStages agricultureApplicationStages =
			randomAgricultureApplicationStages();

		agricultureApplicationStages.setCaseId(regex);
		agricultureApplicationStages.setDuration(regex);

		String json = AgricultureApplicationStagesSerDes.toJSON(
			agricultureApplicationStages);

		Assert.assertFalse(json.contains(regex));

		agricultureApplicationStages = AgricultureApplicationStagesSerDes.toDTO(
			json);

		Assert.assertEquals(regex, agricultureApplicationStages.getCaseId());
		Assert.assertEquals(regex, agricultureApplicationStages.getDuration());
	}

	@Test
	public void testUpdateAgricultureApplicationStage() throws Exception {
		AgricultureApplicationStages randomAgricultureApplicationStages =
			randomAgricultureApplicationStages();

		AgricultureApplicationStages postAgricultureApplicationStages =
			testUpdateAgricultureApplicationStage_addAgricultureApplicationStages(
				randomAgricultureApplicationStages);

		assertEquals(
			randomAgricultureApplicationStages,
			postAgricultureApplicationStages);
		assertValid(postAgricultureApplicationStages);
	}

	protected AgricultureApplicationStages
			testUpdateAgricultureApplicationStage_addAgricultureApplicationStages(
				AgricultureApplicationStages agricultureApplicationStages)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected void assertContains(
		AgricultureApplicationStages agricultureApplicationStages,
		List<AgricultureApplicationStages> agricultureApplicationStageses) {

		boolean contains = false;

		for (AgricultureApplicationStages item :
				agricultureApplicationStageses) {

			if (equals(agricultureApplicationStages, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			agricultureApplicationStageses + " does not contain " +
				agricultureApplicationStages,
			contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		AgricultureApplicationStages agricultureApplicationStages1,
		AgricultureApplicationStages agricultureApplicationStages2) {

		Assert.assertTrue(
			agricultureApplicationStages1 + " does not equal " +
				agricultureApplicationStages2,
			equals(
				agricultureApplicationStages1, agricultureApplicationStages2));
	}

	protected void assertEquals(
		List<AgricultureApplicationStages> agricultureApplicationStageses1,
		List<AgricultureApplicationStages> agricultureApplicationStageses2) {

		Assert.assertEquals(
			agricultureApplicationStageses1.size(),
			agricultureApplicationStageses2.size());

		for (int i = 0; i < agricultureApplicationStageses1.size(); i++) {
			AgricultureApplicationStages agricultureApplicationStages1 =
				agricultureApplicationStageses1.get(i);
			AgricultureApplicationStages agricultureApplicationStages2 =
				agricultureApplicationStageses2.get(i);

			assertEquals(
				agricultureApplicationStages1, agricultureApplicationStages2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<AgricultureApplicationStages> agricultureApplicationStageses1,
		List<AgricultureApplicationStages> agricultureApplicationStageses2) {

		Assert.assertEquals(
			agricultureApplicationStageses1.size(),
			agricultureApplicationStageses2.size());

		for (AgricultureApplicationStages agricultureApplicationStages1 :
				agricultureApplicationStageses1) {

			boolean contains = false;

			for (AgricultureApplicationStages agricultureApplicationStages2 :
					agricultureApplicationStageses2) {

				if (equals(
						agricultureApplicationStages1,
						agricultureApplicationStages2)) {

					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				agricultureApplicationStageses2 + " does not contain " +
					agricultureApplicationStages1,
				contains);
		}
	}

	protected void assertValid(
			AgricultureApplicationStages agricultureApplicationStages)
		throws Exception {

		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("caseId", additionalAssertFieldName)) {
				if (agricultureApplicationStages.getCaseId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("duration", additionalAssertFieldName)) {
				if (agricultureApplicationStages.getDuration() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("stageEndDate", additionalAssertFieldName)) {
				if (agricultureApplicationStages.getStageEndDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("stageName", additionalAssertFieldName)) {
				if (agricultureApplicationStages.getStageName() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("stageStartDate", additionalAssertFieldName)) {
				if (agricultureApplicationStages.getStageStartDate() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (agricultureApplicationStages.getStatus() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<AgricultureApplicationStages> page) {
		assertValid(page, Collections.emptyMap());
	}

	protected void assertValid(
		Page<AgricultureApplicationStages> page,
		Map<String, Map<String, String>> expectedActions) {

		boolean valid = false;

		java.util.Collection<AgricultureApplicationStages>
			agricultureApplicationStageses = page.getItems();

		int size = agricultureApplicationStageses.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);

		assertValid(page.getActions(), expectedActions);
	}

	protected void assertValid(
		Map<String, Map<String, String>> actions1,
		Map<String, Map<String, String>> actions2) {

		for (String key : actions2.keySet()) {
			Map action = actions1.get(key);

			Assert.assertNotNull(key + " does not contain an action", action);

			Map<String, String> expectedAction = actions2.get(key);

			Assert.assertEquals(
				expectedAction.get("method"), action.get("method"));
			Assert.assertEquals(expectedAction.get("href"), action.get("href"));
		}
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					com.agriculture.remote.services.dto.v1_0.
						AgricultureApplicationStages.class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(
		AgricultureApplicationStages agricultureApplicationStages1,
		AgricultureApplicationStages agricultureApplicationStages2) {

		if (agricultureApplicationStages1 == agricultureApplicationStages2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("caseId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						agricultureApplicationStages1.getCaseId(),
						agricultureApplicationStages2.getCaseId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("duration", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						agricultureApplicationStages1.getDuration(),
						agricultureApplicationStages2.getDuration())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("stageEndDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						agricultureApplicationStages1.getStageEndDate(),
						agricultureApplicationStages2.getStageEndDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("stageName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						agricultureApplicationStages1.getStageName(),
						agricultureApplicationStages2.getStageName())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("stageStartDate", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						agricultureApplicationStages1.getStageStartDate(),
						agricultureApplicationStages2.getStageStartDate())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("status", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						agricultureApplicationStages1.getStatus(),
						agricultureApplicationStages2.getStatus())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		if (clazz.getClassLoader() == null) {
			return new java.lang.reflect.Field[0];
		}

		return TransformUtil.transform(
			ReflectionUtil.getDeclaredFields(clazz),
			field -> {
				if (field.isSynthetic()) {
					return null;
				}

				return field;
			},
			java.lang.reflect.Field.class);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_agricultureApplicationStagesResource instanceof
				EntityModelResource)) {

			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_agricultureApplicationStagesResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		if (entityModel == null) {
			return Collections.emptyList();
		}

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		return TransformUtil.transform(
			getEntityFields(),
			entityField -> {
				if (!Objects.equals(entityField.getType(), type) ||
					ArrayUtil.contains(
						getIgnoredEntityFieldNames(), entityField.getName())) {

					return null;
				}

				return entityField;
			});
	}

	protected String getFilterString(
		EntityField entityField, String operator,
		AgricultureApplicationStages agricultureApplicationStages) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("caseId")) {
			Object object = agricultureApplicationStages.getCaseId();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("duration")) {
			Object object = agricultureApplicationStages.getDuration();

			String value = String.valueOf(object);

			if (operator.equals("contains")) {
				sb = new StringBundler();

				sb.append("contains(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 2)) {
					sb.append(value.substring(1, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else if (operator.equals("startswith")) {
				sb = new StringBundler();

				sb.append("startswith(");
				sb.append(entityFieldName);
				sb.append(",'");

				if ((object != null) && (value.length() > 1)) {
					sb.append(value.substring(0, value.length() - 1));
				}
				else {
					sb.append(value);
				}

				sb.append("')");
			}
			else {
				sb.append("'");
				sb.append(value);
				sb.append("'");
			}

			return sb.toString();
		}

		if (entityFieldName.equals("stageEndDate")) {
			if (operator.equals("between")) {
				Date date = agricultureApplicationStages.getStageEndDate();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(
					_dateFormat.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(
					_dateFormat.format(
						agricultureApplicationStages.getStageEndDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("stageName")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("stageStartDate")) {
			if (operator.equals("between")) {
				Date date = agricultureApplicationStages.getStageStartDate();

				sb = new StringBundler();

				sb.append("(");
				sb.append(entityFieldName);
				sb.append(" gt ");
				sb.append(
					_dateFormat.format(date.getTime() - (2 * Time.SECOND)));
				sb.append(" and ");
				sb.append(entityFieldName);
				sb.append(" lt ");
				sb.append(
					_dateFormat.format(date.getTime() + (2 * Time.SECOND)));
				sb.append(")");
			}
			else {
				sb.append(entityFieldName);

				sb.append(" ");
				sb.append(operator);
				sb.append(" ");

				sb.append(
					_dateFormat.format(
						agricultureApplicationStages.getStageStartDate()));
			}

			return sb.toString();
		}

		if (entityFieldName.equals("status")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword(
			"test@liferay.com:" + PropsValues.DEFAULT_ADMIN_PASSWORD);

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected AgricultureApplicationStages randomAgricultureApplicationStages()
		throws Exception {

		return new AgricultureApplicationStages() {
			{
				caseId = StringUtil.toLowerCase(RandomTestUtil.randomString());
				duration = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
				stageEndDate = RandomTestUtil.nextDate();
				stageStartDate = RandomTestUtil.nextDate();
			}
		};
	}

	protected AgricultureApplicationStages
			randomIrrelevantAgricultureApplicationStages()
		throws Exception {

		AgricultureApplicationStages
			randomIrrelevantAgricultureApplicationStages =
				randomAgricultureApplicationStages();

		return randomIrrelevantAgricultureApplicationStages;
	}

	protected AgricultureApplicationStages
			randomPatchAgricultureApplicationStages()
		throws Exception {

		return randomAgricultureApplicationStages();
	}

	protected AgricultureApplicationStagesResource
		agricultureApplicationStagesResource;
	protected com.liferay.portal.kernel.model.Group irrelevantGroup;
	protected com.liferay.portal.kernel.model.Company testCompany;
	protected com.liferay.portal.kernel.model.Group testGroup;

	protected static class BeanTestUtil {

		public static void copyProperties(Object source, Object target)
			throws Exception {

			Class<?> sourceClass = source.getClass();

			Class<?> targetClass = target.getClass();

			for (java.lang.reflect.Field field :
					_getAllDeclaredFields(sourceClass)) {

				if (field.isSynthetic()) {
					continue;
				}

				Method getMethod = _getMethod(
					sourceClass, field.getName(), "get");

				try {
					Method setMethod = _getMethod(
						targetClass, field.getName(), "set",
						getMethod.getReturnType());

					setMethod.invoke(target, getMethod.invoke(source));
				}
				catch (Exception e) {
					continue;
				}
			}
		}

		public static boolean hasProperty(Object bean, String name) {
			Method setMethod = _getMethod(
				bean.getClass(), "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod != null) {
				return true;
			}

			return false;
		}

		public static void setProperty(Object bean, String name, Object value)
			throws Exception {

			Class<?> clazz = bean.getClass();

			Method setMethod = _getMethod(
				clazz, "set" + StringUtil.upperCaseFirstLetter(name));

			if (setMethod == null) {
				throw new NoSuchMethodException();
			}

			Class<?>[] parameterTypes = setMethod.getParameterTypes();

			setMethod.invoke(bean, _translateValue(parameterTypes[0], value));
		}

		private static List<java.lang.reflect.Field> _getAllDeclaredFields(
			Class<?> clazz) {

			List<java.lang.reflect.Field> fields = new ArrayList<>();

			while ((clazz != null) && (clazz != Object.class)) {
				for (java.lang.reflect.Field field :
						clazz.getDeclaredFields()) {

					fields.add(field);
				}

				clazz = clazz.getSuperclass();
			}

			return fields;
		}

		private static Method _getMethod(Class<?> clazz, String name) {
			for (Method method : clazz.getMethods()) {
				if (name.equals(method.getName()) &&
					(method.getParameterCount() == 1) &&
					_parameterTypes.contains(method.getParameterTypes()[0])) {

					return method;
				}
			}

			return null;
		}

		private static Method _getMethod(
				Class<?> clazz, String fieldName, String prefix,
				Class<?>... parameterTypes)
			throws Exception {

			return clazz.getMethod(
				prefix + StringUtil.upperCaseFirstLetter(fieldName),
				parameterTypes);
		}

		private static Object _translateValue(
			Class<?> parameterType, Object value) {

			if ((value instanceof Integer) &&
				parameterType.equals(Long.class)) {

				Integer intValue = (Integer)value;

				return intValue.longValue();
			}

			return value;
		}

		private static final Set<Class<?>> _parameterTypes = new HashSet<>(
			Arrays.asList(
				Boolean.class, Date.class, Double.class, Integer.class,
				Long.class, Map.class, String.class));

	}

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(
			BaseAgricultureApplicationStagesResourceTestCase.class);

	private static DateFormat _dateFormat;

	@Inject
	private com.agriculture.remote.services.resource.v1_0.
		AgricultureApplicationStagesResource
			_agricultureApplicationStagesResource;

}