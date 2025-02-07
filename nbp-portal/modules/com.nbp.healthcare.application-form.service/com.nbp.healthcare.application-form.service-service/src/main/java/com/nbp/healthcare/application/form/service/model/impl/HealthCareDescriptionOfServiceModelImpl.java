/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfService;
import com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfServiceModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the HealthCareDescriptionOfService service. Represents a row in the &quot;nbp_healthcare_description&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>HealthCareDescriptionOfServiceModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HealthCareDescriptionOfServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfServiceImpl
 * @generated
 */
@JSON(strict = true)
public class HealthCareDescriptionOfServiceModelImpl
	extends BaseModelImpl<HealthCareDescriptionOfService>
	implements HealthCareDescriptionOfServiceModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a health care description of service model instance should use the <code>HealthCareDescriptionOfService</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_healthcare_description";

	public static final Object[][] TABLE_COLUMNS = {
		{"healthCareDescriptionId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"descriptionOfService", Types.VARCHAR},
		{"healthCareApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("healthCareDescriptionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("descriptionOfService", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("healthCareApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_healthcare_description (healthCareDescriptionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,descriptionOfService VARCHAR(75) null,healthCareApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_healthcare_description";

	public static final String ORDER_BY_JPQL =
		" ORDER BY healthCareDescriptionOfService.healthCareDescriptionId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_healthcare_description.healthCareDescriptionId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long HEALTHCAREAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long HEALTHCAREDESCRIPTIONID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public HealthCareDescriptionOfServiceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _healthCareDescriptionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setHealthCareDescriptionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _healthCareDescriptionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return HealthCareDescriptionOfService.class;
	}

	@Override
	public String getModelClassName() {
		return HealthCareDescriptionOfService.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<HealthCareDescriptionOfService, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<HealthCareDescriptionOfService, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<HealthCareDescriptionOfService, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(HealthCareDescriptionOfService)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<HealthCareDescriptionOfService, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<HealthCareDescriptionOfService, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(HealthCareDescriptionOfService)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<HealthCareDescriptionOfService, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<HealthCareDescriptionOfService, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<HealthCareDescriptionOfService, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<HealthCareDescriptionOfService, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<HealthCareDescriptionOfService, Object>>();

			attributeGetterFunctions.put(
				"healthCareDescriptionId",
				HealthCareDescriptionOfService::getHealthCareDescriptionId);
			attributeGetterFunctions.put(
				"groupId", HealthCareDescriptionOfService::getGroupId);
			attributeGetterFunctions.put(
				"companyId", HealthCareDescriptionOfService::getCompanyId);
			attributeGetterFunctions.put(
				"userId", HealthCareDescriptionOfService::getUserId);
			attributeGetterFunctions.put(
				"userName", HealthCareDescriptionOfService::getUserName);
			attributeGetterFunctions.put(
				"createDate", HealthCareDescriptionOfService::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate",
				HealthCareDescriptionOfService::getModifiedDate);
			attributeGetterFunctions.put(
				"descriptionOfService",
				HealthCareDescriptionOfService::getDescriptionOfService);
			attributeGetterFunctions.put(
				"healthCareApplicationId",
				HealthCareDescriptionOfService::getHealthCareApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<HealthCareDescriptionOfService, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<HealthCareDescriptionOfService, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String,
						 BiConsumer<HealthCareDescriptionOfService, ?>>();

			attributeSetterBiConsumers.put(
				"healthCareDescriptionId",
				(BiConsumer<HealthCareDescriptionOfService, Long>)
					HealthCareDescriptionOfService::setHealthCareDescriptionId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<HealthCareDescriptionOfService, Long>)
					HealthCareDescriptionOfService::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<HealthCareDescriptionOfService, Long>)
					HealthCareDescriptionOfService::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<HealthCareDescriptionOfService, Long>)
					HealthCareDescriptionOfService::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<HealthCareDescriptionOfService, String>)
					HealthCareDescriptionOfService::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<HealthCareDescriptionOfService, Date>)
					HealthCareDescriptionOfService::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<HealthCareDescriptionOfService, Date>)
					HealthCareDescriptionOfService::setModifiedDate);
			attributeSetterBiConsumers.put(
				"descriptionOfService",
				(BiConsumer<HealthCareDescriptionOfService, String>)
					HealthCareDescriptionOfService::setDescriptionOfService);
			attributeSetterBiConsumers.put(
				"healthCareApplicationId",
				(BiConsumer<HealthCareDescriptionOfService, Long>)
					HealthCareDescriptionOfService::setHealthCareApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getHealthCareDescriptionId() {
		return _healthCareDescriptionId;
	}

	@Override
	public void setHealthCareDescriptionId(long healthCareDescriptionId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_healthCareDescriptionId = healthCareDescriptionId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getDescriptionOfService() {
		if (_descriptionOfService == null) {
			return "";
		}
		else {
			return _descriptionOfService;
		}
	}

	@Override
	public void setDescriptionOfService(String descriptionOfService) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_descriptionOfService = descriptionOfService;
	}

	@JSON
	@Override
	public long getHealthCareApplicationId() {
		return _healthCareApplicationId;
	}

	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_healthCareApplicationId = healthCareApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalHealthCareApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("healthCareApplicationId"));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), HealthCareDescriptionOfService.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public HealthCareDescriptionOfService toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, HealthCareDescriptionOfService>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		HealthCareDescriptionOfServiceImpl healthCareDescriptionOfServiceImpl =
			new HealthCareDescriptionOfServiceImpl();

		healthCareDescriptionOfServiceImpl.setHealthCareDescriptionId(
			getHealthCareDescriptionId());
		healthCareDescriptionOfServiceImpl.setGroupId(getGroupId());
		healthCareDescriptionOfServiceImpl.setCompanyId(getCompanyId());
		healthCareDescriptionOfServiceImpl.setUserId(getUserId());
		healthCareDescriptionOfServiceImpl.setUserName(getUserName());
		healthCareDescriptionOfServiceImpl.setCreateDate(getCreateDate());
		healthCareDescriptionOfServiceImpl.setModifiedDate(getModifiedDate());
		healthCareDescriptionOfServiceImpl.setDescriptionOfService(
			getDescriptionOfService());
		healthCareDescriptionOfServiceImpl.setHealthCareApplicationId(
			getHealthCareApplicationId());

		healthCareDescriptionOfServiceImpl.resetOriginalValues();

		return healthCareDescriptionOfServiceImpl;
	}

	@Override
	public HealthCareDescriptionOfService cloneWithOriginalValues() {
		HealthCareDescriptionOfServiceImpl healthCareDescriptionOfServiceImpl =
			new HealthCareDescriptionOfServiceImpl();

		healthCareDescriptionOfServiceImpl.setHealthCareDescriptionId(
			this.<Long>getColumnOriginalValue("healthCareDescriptionId"));
		healthCareDescriptionOfServiceImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		healthCareDescriptionOfServiceImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		healthCareDescriptionOfServiceImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		healthCareDescriptionOfServiceImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		healthCareDescriptionOfServiceImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		healthCareDescriptionOfServiceImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		healthCareDescriptionOfServiceImpl.setDescriptionOfService(
			this.<String>getColumnOriginalValue("descriptionOfService"));
		healthCareDescriptionOfServiceImpl.setHealthCareApplicationId(
			this.<Long>getColumnOriginalValue("healthCareApplicationId"));

		return healthCareDescriptionOfServiceImpl;
	}

	@Override
	public int compareTo(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		long primaryKey = healthCareDescriptionOfService.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HealthCareDescriptionOfService)) {
			return false;
		}

		HealthCareDescriptionOfService healthCareDescriptionOfService =
			(HealthCareDescriptionOfService)object;

		long primaryKey = healthCareDescriptionOfService.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<HealthCareDescriptionOfService> toCacheModel() {
		HealthCareDescriptionOfServiceCacheModel
			healthCareDescriptionOfServiceCacheModel =
				new HealthCareDescriptionOfServiceCacheModel();

		healthCareDescriptionOfServiceCacheModel.healthCareDescriptionId =
			getHealthCareDescriptionId();

		healthCareDescriptionOfServiceCacheModel.groupId = getGroupId();

		healthCareDescriptionOfServiceCacheModel.companyId = getCompanyId();

		healthCareDescriptionOfServiceCacheModel.userId = getUserId();

		healthCareDescriptionOfServiceCacheModel.userName = getUserName();

		String userName = healthCareDescriptionOfServiceCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			healthCareDescriptionOfServiceCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			healthCareDescriptionOfServiceCacheModel.createDate =
				createDate.getTime();
		}
		else {
			healthCareDescriptionOfServiceCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			healthCareDescriptionOfServiceCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			healthCareDescriptionOfServiceCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		healthCareDescriptionOfServiceCacheModel.descriptionOfService =
			getDescriptionOfService();

		String descriptionOfService =
			healthCareDescriptionOfServiceCacheModel.descriptionOfService;

		if ((descriptionOfService != null) &&
			(descriptionOfService.length() == 0)) {

			healthCareDescriptionOfServiceCacheModel.descriptionOfService =
				null;
		}

		healthCareDescriptionOfServiceCacheModel.healthCareApplicationId =
			getHealthCareApplicationId();

		return healthCareDescriptionOfServiceCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<HealthCareDescriptionOfService, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<HealthCareDescriptionOfService, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<HealthCareDescriptionOfService, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(HealthCareDescriptionOfService)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function
			<InvocationHandler, HealthCareDescriptionOfService>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						HealthCareDescriptionOfService.class,
						ModelWrapper.class);

	}

	private long _healthCareDescriptionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _descriptionOfService;
	private long _healthCareApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<HealthCareDescriptionOfService, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((HealthCareDescriptionOfService)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put(
			"healthCareDescriptionId", _healthCareDescriptionId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"descriptionOfService", _descriptionOfService);
		_columnOriginalValues.put(
			"healthCareApplicationId", _healthCareApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("healthCareDescriptionId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("descriptionOfService", 128L);

		columnBitmasks.put("healthCareApplicationId", 256L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private HealthCareDescriptionOfService _escapedModel;

}