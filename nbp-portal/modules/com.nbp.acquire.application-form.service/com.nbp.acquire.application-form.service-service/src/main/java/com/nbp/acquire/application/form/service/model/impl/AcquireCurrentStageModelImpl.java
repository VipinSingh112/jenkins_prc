/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.acquire.application.form.service.model.AcquireCurrentStage;
import com.nbp.acquire.application.form.service.model.AcquireCurrentStageModel;

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
 * The base model implementation for the AcquireCurrentStage service. Represents a row in the &quot;nbp_acquire_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AcquireCurrentStageModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AcquireCurrentStageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireCurrentStageImpl
 * @generated
 */
@JSON(strict = true)
public class AcquireCurrentStageModelImpl
	extends BaseModelImpl<AcquireCurrentStage>
	implements AcquireCurrentStageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acquire current stage model instance should use the <code>AcquireCurrentStage</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_acquire_stage";

	public static final Object[][] TABLE_COLUMNS = {
		{"acquireCurrentStageId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"currentStage", Types.VARCHAR},
		{"lastFormStage", Types.VARCHAR}, {"acquireApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("acquireCurrentStageId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("currentStage", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastFormStage", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("acquireApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_acquire_stage (acquireCurrentStageId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,currentStage VARCHAR(75) null,lastFormStage VARCHAR(75) null,acquireApplicationId LONG)";

	public static final String TABLE_SQL_DROP = "drop table nbp_acquire_stage";

	public static final String ORDER_BY_JPQL =
		" ORDER BY acquireCurrentStage.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_acquire_stage.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ACQUIREAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 2L;

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

	public AcquireCurrentStageModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _acquireCurrentStageId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAcquireCurrentStageId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _acquireCurrentStageId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AcquireCurrentStage.class;
	}

	@Override
	public String getModelClassName() {
		return AcquireCurrentStage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AcquireCurrentStage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AcquireCurrentStage, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AcquireCurrentStage, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AcquireCurrentStage)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AcquireCurrentStage, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AcquireCurrentStage, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AcquireCurrentStage)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AcquireCurrentStage, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AcquireCurrentStage, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<AcquireCurrentStage, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<AcquireCurrentStage, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AcquireCurrentStage, Object>>();

			attributeGetterFunctions.put(
				"acquireCurrentStageId",
				AcquireCurrentStage::getAcquireCurrentStageId);
			attributeGetterFunctions.put(
				"groupId", AcquireCurrentStage::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AcquireCurrentStage::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AcquireCurrentStage::getUserId);
			attributeGetterFunctions.put(
				"userName", AcquireCurrentStage::getUserName);
			attributeGetterFunctions.put(
				"createDate", AcquireCurrentStage::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AcquireCurrentStage::getModifiedDate);
			attributeGetterFunctions.put(
				"currentStage", AcquireCurrentStage::getCurrentStage);
			attributeGetterFunctions.put(
				"lastFormStage", AcquireCurrentStage::getLastFormStage);
			attributeGetterFunctions.put(
				"acquireApplicationId",
				AcquireCurrentStage::getAcquireApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AcquireCurrentStage, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AcquireCurrentStage, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AcquireCurrentStage, ?>>();

			attributeSetterBiConsumers.put(
				"acquireCurrentStageId",
				(BiConsumer<AcquireCurrentStage, Long>)
					AcquireCurrentStage::setAcquireCurrentStageId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AcquireCurrentStage, Long>)
					AcquireCurrentStage::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AcquireCurrentStage, Long>)
					AcquireCurrentStage::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AcquireCurrentStage, Long>)
					AcquireCurrentStage::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AcquireCurrentStage, String>)
					AcquireCurrentStage::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AcquireCurrentStage, Date>)
					AcquireCurrentStage::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AcquireCurrentStage, Date>)
					AcquireCurrentStage::setModifiedDate);
			attributeSetterBiConsumers.put(
				"currentStage",
				(BiConsumer<AcquireCurrentStage, String>)
					AcquireCurrentStage::setCurrentStage);
			attributeSetterBiConsumers.put(
				"lastFormStage",
				(BiConsumer<AcquireCurrentStage, String>)
					AcquireCurrentStage::setLastFormStage);
			attributeSetterBiConsumers.put(
				"acquireApplicationId",
				(BiConsumer<AcquireCurrentStage, Long>)
					AcquireCurrentStage::setAcquireApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAcquireCurrentStageId() {
		return _acquireCurrentStageId;
	}

	@Override
	public void setAcquireCurrentStageId(long acquireCurrentStageId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_acquireCurrentStageId = acquireCurrentStageId;
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
	public String getCurrentStage() {
		if (_currentStage == null) {
			return "";
		}
		else {
			return _currentStage;
		}
	}

	@Override
	public void setCurrentStage(String currentStage) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_currentStage = currentStage;
	}

	@JSON
	@Override
	public String getLastFormStage() {
		if (_lastFormStage == null) {
			return "";
		}
		else {
			return _lastFormStage;
		}
	}

	@Override
	public void setLastFormStage(String lastFormStage) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_lastFormStage = lastFormStage;
	}

	@JSON
	@Override
	public long getAcquireApplicationId() {
		return _acquireApplicationId;
	}

	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_acquireApplicationId = acquireApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalAcquireApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("acquireApplicationId"));
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
			getCompanyId(), AcquireCurrentStage.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AcquireCurrentStage toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AcquireCurrentStage>
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
		AcquireCurrentStageImpl acquireCurrentStageImpl =
			new AcquireCurrentStageImpl();

		acquireCurrentStageImpl.setAcquireCurrentStageId(
			getAcquireCurrentStageId());
		acquireCurrentStageImpl.setGroupId(getGroupId());
		acquireCurrentStageImpl.setCompanyId(getCompanyId());
		acquireCurrentStageImpl.setUserId(getUserId());
		acquireCurrentStageImpl.setUserName(getUserName());
		acquireCurrentStageImpl.setCreateDate(getCreateDate());
		acquireCurrentStageImpl.setModifiedDate(getModifiedDate());
		acquireCurrentStageImpl.setCurrentStage(getCurrentStage());
		acquireCurrentStageImpl.setLastFormStage(getLastFormStage());
		acquireCurrentStageImpl.setAcquireApplicationId(
			getAcquireApplicationId());

		acquireCurrentStageImpl.resetOriginalValues();

		return acquireCurrentStageImpl;
	}

	@Override
	public AcquireCurrentStage cloneWithOriginalValues() {
		AcquireCurrentStageImpl acquireCurrentStageImpl =
			new AcquireCurrentStageImpl();

		acquireCurrentStageImpl.setAcquireCurrentStageId(
			this.<Long>getColumnOriginalValue("acquireCurrentStageId"));
		acquireCurrentStageImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		acquireCurrentStageImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		acquireCurrentStageImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		acquireCurrentStageImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		acquireCurrentStageImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		acquireCurrentStageImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		acquireCurrentStageImpl.setCurrentStage(
			this.<String>getColumnOriginalValue("currentStage"));
		acquireCurrentStageImpl.setLastFormStage(
			this.<String>getColumnOriginalValue("lastFormStage"));
		acquireCurrentStageImpl.setAcquireApplicationId(
			this.<Long>getColumnOriginalValue("acquireApplicationId"));

		return acquireCurrentStageImpl;
	}

	@Override
	public int compareTo(AcquireCurrentStage acquireCurrentStage) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), acquireCurrentStage.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AcquireCurrentStage)) {
			return false;
		}

		AcquireCurrentStage acquireCurrentStage = (AcquireCurrentStage)object;

		long primaryKey = acquireCurrentStage.getPrimaryKey();

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
	public CacheModel<AcquireCurrentStage> toCacheModel() {
		AcquireCurrentStageCacheModel acquireCurrentStageCacheModel =
			new AcquireCurrentStageCacheModel();

		acquireCurrentStageCacheModel.acquireCurrentStageId =
			getAcquireCurrentStageId();

		acquireCurrentStageCacheModel.groupId = getGroupId();

		acquireCurrentStageCacheModel.companyId = getCompanyId();

		acquireCurrentStageCacheModel.userId = getUserId();

		acquireCurrentStageCacheModel.userName = getUserName();

		String userName = acquireCurrentStageCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			acquireCurrentStageCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			acquireCurrentStageCacheModel.createDate = createDate.getTime();
		}
		else {
			acquireCurrentStageCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			acquireCurrentStageCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			acquireCurrentStageCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		acquireCurrentStageCacheModel.currentStage = getCurrentStage();

		String currentStage = acquireCurrentStageCacheModel.currentStage;

		if ((currentStage != null) && (currentStage.length() == 0)) {
			acquireCurrentStageCacheModel.currentStage = null;
		}

		acquireCurrentStageCacheModel.lastFormStage = getLastFormStage();

		String lastFormStage = acquireCurrentStageCacheModel.lastFormStage;

		if ((lastFormStage != null) && (lastFormStage.length() == 0)) {
			acquireCurrentStageCacheModel.lastFormStage = null;
		}

		acquireCurrentStageCacheModel.acquireApplicationId =
			getAcquireApplicationId();

		return acquireCurrentStageCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AcquireCurrentStage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AcquireCurrentStage, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AcquireCurrentStage, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AcquireCurrentStage)this);

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

		private static final Function<InvocationHandler, AcquireCurrentStage>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AcquireCurrentStage.class, ModelWrapper.class);

	}

	private long _acquireCurrentStageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _currentStage;
	private String _lastFormStage;
	private long _acquireApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<AcquireCurrentStage, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AcquireCurrentStage)this);
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
			"acquireCurrentStageId", _acquireCurrentStageId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("currentStage", _currentStage);
		_columnOriginalValues.put("lastFormStage", _lastFormStage);
		_columnOriginalValues.put(
			"acquireApplicationId", _acquireApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("acquireCurrentStageId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("currentStage", 128L);

		columnBitmasks.put("lastFormStage", 256L);

		columnBitmasks.put("acquireApplicationId", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AcquireCurrentStage _escapedModel;

}