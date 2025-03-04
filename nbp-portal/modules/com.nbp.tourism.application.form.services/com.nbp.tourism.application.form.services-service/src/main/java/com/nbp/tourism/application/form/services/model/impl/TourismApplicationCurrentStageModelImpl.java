/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

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

import com.nbp.tourism.application.form.services.model.TourismApplicationCurrentStage;
import com.nbp.tourism.application.form.services.model.TourismApplicationCurrentStageModel;

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
 * The base model implementation for the TourismApplicationCurrentStage service. Represents a row in the &quot;nbp_tourism_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismApplicationCurrentStageModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismApplicationCurrentStageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationCurrentStageImpl
 * @generated
 */
@JSON(strict = true)
public class TourismApplicationCurrentStageModelImpl
	extends BaseModelImpl<TourismApplicationCurrentStage>
	implements TourismApplicationCurrentStageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism application current stage model instance should use the <code>TourismApplicationCurrentStage</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_stage";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismAppliCurrentStageId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"currentStage", Types.VARCHAR},
		{"lastFormStep", Types.VARCHAR}, {"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismAppliCurrentStageId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("currentStage", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastFormStep", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_stage (tourismAppliCurrentStageId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,currentStage VARCHAR(75) null,lastFormStep VARCHAR(75) null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP = "drop table nbp_tourism_stage";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismApplicationCurrentStage.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_stage.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TOURISMAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public TourismApplicationCurrentStageModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismAppliCurrentStageId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismAppliCurrentStageId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismAppliCurrentStageId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismApplicationCurrentStage.class;
	}

	@Override
	public String getModelClassName() {
		return TourismApplicationCurrentStage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismApplicationCurrentStage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TourismApplicationCurrentStage, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismApplicationCurrentStage, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(TourismApplicationCurrentStage)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismApplicationCurrentStage, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismApplicationCurrentStage, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismApplicationCurrentStage)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismApplicationCurrentStage, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismApplicationCurrentStage, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<TourismApplicationCurrentStage, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<TourismApplicationCurrentStage, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<TourismApplicationCurrentStage, Object>>();

			attributeGetterFunctions.put(
				"tourismAppliCurrentStageId",
				TourismApplicationCurrentStage::getTourismAppliCurrentStageId);
			attributeGetterFunctions.put(
				"groupId", TourismApplicationCurrentStage::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismApplicationCurrentStage::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismApplicationCurrentStage::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismApplicationCurrentStage::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismApplicationCurrentStage::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate",
				TourismApplicationCurrentStage::getModifiedDate);
			attributeGetterFunctions.put(
				"currentStage",
				TourismApplicationCurrentStage::getCurrentStage);
			attributeGetterFunctions.put(
				"lastFormStep",
				TourismApplicationCurrentStage::getLastFormStep);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismApplicationCurrentStage::getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<TourismApplicationCurrentStage, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismApplicationCurrentStage, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String,
						 BiConsumer<TourismApplicationCurrentStage, ?>>();

			attributeSetterBiConsumers.put(
				"tourismAppliCurrentStageId",
				(BiConsumer<TourismApplicationCurrentStage, Long>)
					TourismApplicationCurrentStage::
						setTourismAppliCurrentStageId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismApplicationCurrentStage, Long>)
					TourismApplicationCurrentStage::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismApplicationCurrentStage, Long>)
					TourismApplicationCurrentStage::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismApplicationCurrentStage, Long>)
					TourismApplicationCurrentStage::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismApplicationCurrentStage, String>)
					TourismApplicationCurrentStage::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismApplicationCurrentStage, Date>)
					TourismApplicationCurrentStage::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismApplicationCurrentStage, Date>)
					TourismApplicationCurrentStage::setModifiedDate);
			attributeSetterBiConsumers.put(
				"currentStage",
				(BiConsumer<TourismApplicationCurrentStage, String>)
					TourismApplicationCurrentStage::setCurrentStage);
			attributeSetterBiConsumers.put(
				"lastFormStep",
				(BiConsumer<TourismApplicationCurrentStage, String>)
					TourismApplicationCurrentStage::setLastFormStep);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismApplicationCurrentStage, Long>)
					TourismApplicationCurrentStage::setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismAppliCurrentStageId() {
		return _tourismAppliCurrentStageId;
	}

	@Override
	public void setTourismAppliCurrentStageId(long tourismAppliCurrentStageId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismAppliCurrentStageId = tourismAppliCurrentStageId;
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
	public String getLastFormStep() {
		if (_lastFormStep == null) {
			return "";
		}
		else {
			return _lastFormStep;
		}
	}

	@Override
	public void setLastFormStep(String lastFormStep) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_lastFormStep = lastFormStep;
	}

	@JSON
	@Override
	public long getTourismApplicationId() {
		return _tourismApplicationId;
	}

	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismApplicationId = tourismApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalTourismApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));
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
			getCompanyId(), TourismApplicationCurrentStage.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismApplicationCurrentStage toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismApplicationCurrentStage>
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
		TourismApplicationCurrentStageImpl tourismApplicationCurrentStageImpl =
			new TourismApplicationCurrentStageImpl();

		tourismApplicationCurrentStageImpl.setTourismAppliCurrentStageId(
			getTourismAppliCurrentStageId());
		tourismApplicationCurrentStageImpl.setGroupId(getGroupId());
		tourismApplicationCurrentStageImpl.setCompanyId(getCompanyId());
		tourismApplicationCurrentStageImpl.setUserId(getUserId());
		tourismApplicationCurrentStageImpl.setUserName(getUserName());
		tourismApplicationCurrentStageImpl.setCreateDate(getCreateDate());
		tourismApplicationCurrentStageImpl.setModifiedDate(getModifiedDate());
		tourismApplicationCurrentStageImpl.setCurrentStage(getCurrentStage());
		tourismApplicationCurrentStageImpl.setLastFormStep(getLastFormStep());
		tourismApplicationCurrentStageImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismApplicationCurrentStageImpl.resetOriginalValues();

		return tourismApplicationCurrentStageImpl;
	}

	@Override
	public TourismApplicationCurrentStage cloneWithOriginalValues() {
		TourismApplicationCurrentStageImpl tourismApplicationCurrentStageImpl =
			new TourismApplicationCurrentStageImpl();

		tourismApplicationCurrentStageImpl.setTourismAppliCurrentStageId(
			this.<Long>getColumnOriginalValue("tourismAppliCurrentStageId"));
		tourismApplicationCurrentStageImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismApplicationCurrentStageImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismApplicationCurrentStageImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismApplicationCurrentStageImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismApplicationCurrentStageImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismApplicationCurrentStageImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismApplicationCurrentStageImpl.setCurrentStage(
			this.<String>getColumnOriginalValue("currentStage"));
		tourismApplicationCurrentStageImpl.setLastFormStep(
			this.<String>getColumnOriginalValue("lastFormStep"));
		tourismApplicationCurrentStageImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismApplicationCurrentStageImpl;
	}

	@Override
	public int compareTo(
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), tourismApplicationCurrentStage.getCreateDate());

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

		if (!(object instanceof TourismApplicationCurrentStage)) {
			return false;
		}

		TourismApplicationCurrentStage tourismApplicationCurrentStage =
			(TourismApplicationCurrentStage)object;

		long primaryKey = tourismApplicationCurrentStage.getPrimaryKey();

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
	public CacheModel<TourismApplicationCurrentStage> toCacheModel() {
		TourismApplicationCurrentStageCacheModel
			tourismApplicationCurrentStageCacheModel =
				new TourismApplicationCurrentStageCacheModel();

		tourismApplicationCurrentStageCacheModel.tourismAppliCurrentStageId =
			getTourismAppliCurrentStageId();

		tourismApplicationCurrentStageCacheModel.groupId = getGroupId();

		tourismApplicationCurrentStageCacheModel.companyId = getCompanyId();

		tourismApplicationCurrentStageCacheModel.userId = getUserId();

		tourismApplicationCurrentStageCacheModel.userName = getUserName();

		String userName = tourismApplicationCurrentStageCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismApplicationCurrentStageCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismApplicationCurrentStageCacheModel.createDate =
				createDate.getTime();
		}
		else {
			tourismApplicationCurrentStageCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismApplicationCurrentStageCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismApplicationCurrentStageCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		tourismApplicationCurrentStageCacheModel.currentStage =
			getCurrentStage();

		String currentStage =
			tourismApplicationCurrentStageCacheModel.currentStage;

		if ((currentStage != null) && (currentStage.length() == 0)) {
			tourismApplicationCurrentStageCacheModel.currentStage = null;
		}

		tourismApplicationCurrentStageCacheModel.lastFormStep =
			getLastFormStep();

		String lastFormStep =
			tourismApplicationCurrentStageCacheModel.lastFormStep;

		if ((lastFormStep != null) && (lastFormStep.length() == 0)) {
			tourismApplicationCurrentStageCacheModel.lastFormStep = null;
		}

		tourismApplicationCurrentStageCacheModel.tourismApplicationId =
			getTourismApplicationId();

		return tourismApplicationCurrentStageCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismApplicationCurrentStage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TourismApplicationCurrentStage, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismApplicationCurrentStage, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismApplicationCurrentStage)this);

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
			<InvocationHandler, TourismApplicationCurrentStage>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismApplicationCurrentStage.class,
						ModelWrapper.class);

	}

	private long _tourismAppliCurrentStageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _currentStage;
	private String _lastFormStep;
	private long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<TourismApplicationCurrentStage, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismApplicationCurrentStage)this);
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
			"tourismAppliCurrentStageId", _tourismAppliCurrentStageId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("currentStage", _currentStage);
		_columnOriginalValues.put("lastFormStep", _lastFormStep);
		_columnOriginalValues.put(
			"tourismApplicationId", _tourismApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("tourismAppliCurrentStageId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("currentStage", 128L);

		columnBitmasks.put("lastFormStep", 256L);

		columnBitmasks.put("tourismApplicationId", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismApplicationCurrentStage _escapedModel;

}