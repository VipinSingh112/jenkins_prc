/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
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
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStageModel;

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
 * The base model implementation for the FireBrigadeApplicationStage service. Represents a row in the &quot;nbp_fire_brigade_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>FireBrigadeApplicationStageModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FireBrigadeApplicationStageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationStageImpl
 * @generated
 */
@JSON(strict = true)
public class FireBrigadeApplicationStageModelImpl
	extends BaseModelImpl<FireBrigadeApplicationStage>
	implements FireBrigadeApplicationStageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fire brigade application stage model instance should use the <code>FireBrigadeApplicationStage</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_fire_brigade_app_stage";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"fireBrigadeAppStageId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"stageName", Types.VARCHAR}, {"stageEndDate", Types.TIMESTAMP},
		{"stageStartDate", Types.TIMESTAMP}, {"duration", Types.VARCHAR},
		{"stageStatus", Types.VARCHAR}, {"caseId", Types.VARCHAR},
		{"updatedBySource", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fireBrigadeAppStageId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("stageName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("stageEndDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("stageStartDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("duration", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("stageStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updatedBySource", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_fire_brigade_app_stage (uuid_ VARCHAR(75) null,fireBrigadeAppStageId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,stageName VARCHAR(75) null,stageEndDate DATE null,stageStartDate DATE null,duration VARCHAR(75) null,stageStatus VARCHAR(75) null,caseId VARCHAR(75) null,updatedBySource VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_fire_brigade_app_stage";

	public static final String ORDER_BY_JPQL =
		" ORDER BY fireBrigadeApplicationStage.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_fire_brigade_app_stage.createDate ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CASEID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STAGENAME_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STAGESTATUS_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 32L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 64L;

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

	public FireBrigadeApplicationStageModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _fireBrigadeAppStageId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFireBrigadeAppStageId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fireBrigadeAppStageId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FireBrigadeApplicationStage.class;
	}

	@Override
	public String getModelClassName() {
		return FireBrigadeApplicationStage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<FireBrigadeApplicationStage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<FireBrigadeApplicationStage, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FireBrigadeApplicationStage, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(FireBrigadeApplicationStage)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<FireBrigadeApplicationStage, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<FireBrigadeApplicationStage, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(FireBrigadeApplicationStage)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<FireBrigadeApplicationStage, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<FireBrigadeApplicationStage, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<FireBrigadeApplicationStage, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<FireBrigadeApplicationStage, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<FireBrigadeApplicationStage, Object>>();

			attributeGetterFunctions.put(
				"uuid", FireBrigadeApplicationStage::getUuid);
			attributeGetterFunctions.put(
				"fireBrigadeAppStageId",
				FireBrigadeApplicationStage::getFireBrigadeAppStageId);
			attributeGetterFunctions.put(
				"groupId", FireBrigadeApplicationStage::getGroupId);
			attributeGetterFunctions.put(
				"companyId", FireBrigadeApplicationStage::getCompanyId);
			attributeGetterFunctions.put(
				"userId", FireBrigadeApplicationStage::getUserId);
			attributeGetterFunctions.put(
				"userName", FireBrigadeApplicationStage::getUserName);
			attributeGetterFunctions.put(
				"createDate", FireBrigadeApplicationStage::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", FireBrigadeApplicationStage::getModifiedDate);
			attributeGetterFunctions.put(
				"stageName", FireBrigadeApplicationStage::getStageName);
			attributeGetterFunctions.put(
				"stageEndDate", FireBrigadeApplicationStage::getStageEndDate);
			attributeGetterFunctions.put(
				"stageStartDate",
				FireBrigadeApplicationStage::getStageStartDate);
			attributeGetterFunctions.put(
				"duration", FireBrigadeApplicationStage::getDuration);
			attributeGetterFunctions.put(
				"stageStatus", FireBrigadeApplicationStage::getStageStatus);
			attributeGetterFunctions.put(
				"caseId", FireBrigadeApplicationStage::getCaseId);
			attributeGetterFunctions.put(
				"updatedBySource",
				FireBrigadeApplicationStage::getUpdatedBySource);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<FireBrigadeApplicationStage, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<FireBrigadeApplicationStage, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<FireBrigadeApplicationStage, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<FireBrigadeApplicationStage, String>)
					FireBrigadeApplicationStage::setUuid);
			attributeSetterBiConsumers.put(
				"fireBrigadeAppStageId",
				(BiConsumer<FireBrigadeApplicationStage, Long>)
					FireBrigadeApplicationStage::setFireBrigadeAppStageId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<FireBrigadeApplicationStage, Long>)
					FireBrigadeApplicationStage::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<FireBrigadeApplicationStage, Long>)
					FireBrigadeApplicationStage::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<FireBrigadeApplicationStage, Long>)
					FireBrigadeApplicationStage::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<FireBrigadeApplicationStage, String>)
					FireBrigadeApplicationStage::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<FireBrigadeApplicationStage, Date>)
					FireBrigadeApplicationStage::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<FireBrigadeApplicationStage, Date>)
					FireBrigadeApplicationStage::setModifiedDate);
			attributeSetterBiConsumers.put(
				"stageName",
				(BiConsumer<FireBrigadeApplicationStage, String>)
					FireBrigadeApplicationStage::setStageName);
			attributeSetterBiConsumers.put(
				"stageEndDate",
				(BiConsumer<FireBrigadeApplicationStage, Date>)
					FireBrigadeApplicationStage::setStageEndDate);
			attributeSetterBiConsumers.put(
				"stageStartDate",
				(BiConsumer<FireBrigadeApplicationStage, Date>)
					FireBrigadeApplicationStage::setStageStartDate);
			attributeSetterBiConsumers.put(
				"duration",
				(BiConsumer<FireBrigadeApplicationStage, String>)
					FireBrigadeApplicationStage::setDuration);
			attributeSetterBiConsumers.put(
				"stageStatus",
				(BiConsumer<FireBrigadeApplicationStage, String>)
					FireBrigadeApplicationStage::setStageStatus);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<FireBrigadeApplicationStage, String>)
					FireBrigadeApplicationStage::setCaseId);
			attributeSetterBiConsumers.put(
				"updatedBySource",
				(BiConsumer<FireBrigadeApplicationStage, String>)
					FireBrigadeApplicationStage::setUpdatedBySource);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getFireBrigadeAppStageId() {
		return _fireBrigadeAppStageId;
	}

	@Override
	public void setFireBrigadeAppStageId(long fireBrigadeAppStageId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fireBrigadeAppStageId = fireBrigadeAppStageId;
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

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
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

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
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
	public String getStageName() {
		if (_stageName == null) {
			return "";
		}
		else {
			return _stageName;
		}
	}

	@Override
	public void setStageName(String stageName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_stageName = stageName;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalStageName() {
		return getColumnOriginalValue("stageName");
	}

	@JSON
	@Override
	public Date getStageEndDate() {
		return _stageEndDate;
	}

	@Override
	public void setStageEndDate(Date stageEndDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_stageEndDate = stageEndDate;
	}

	@JSON
	@Override
	public Date getStageStartDate() {
		return _stageStartDate;
	}

	@Override
	public void setStageStartDate(Date stageStartDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_stageStartDate = stageStartDate;
	}

	@JSON
	@Override
	public String getDuration() {
		if (_duration == null) {
			return "";
		}
		else {
			return _duration;
		}
	}

	@Override
	public void setDuration(String duration) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_duration = duration;
	}

	@JSON
	@Override
	public String getStageStatus() {
		if (_stageStatus == null) {
			return "";
		}
		else {
			return _stageStatus;
		}
	}

	@Override
	public void setStageStatus(String stageStatus) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_stageStatus = stageStatus;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalStageStatus() {
		return getColumnOriginalValue("stageStatus");
	}

	@JSON
	@Override
	public String getCaseId() {
		if (_caseId == null) {
			return "";
		}
		else {
			return _caseId;
		}
	}

	@Override
	public void setCaseId(String caseId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_caseId = caseId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalCaseId() {
		return getColumnOriginalValue("caseId");
	}

	@JSON
	@Override
	public String getUpdatedBySource() {
		if (_updatedBySource == null) {
			return "";
		}
		else {
			return _updatedBySource;
		}
	}

	@Override
	public void setUpdatedBySource(String updatedBySource) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_updatedBySource = updatedBySource;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				FireBrigadeApplicationStage.class.getName()));
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
			getCompanyId(), FireBrigadeApplicationStage.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FireBrigadeApplicationStage toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, FireBrigadeApplicationStage>
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
		FireBrigadeApplicationStageImpl fireBrigadeApplicationStageImpl =
			new FireBrigadeApplicationStageImpl();

		fireBrigadeApplicationStageImpl.setUuid(getUuid());
		fireBrigadeApplicationStageImpl.setFireBrigadeAppStageId(
			getFireBrigadeAppStageId());
		fireBrigadeApplicationStageImpl.setGroupId(getGroupId());
		fireBrigadeApplicationStageImpl.setCompanyId(getCompanyId());
		fireBrigadeApplicationStageImpl.setUserId(getUserId());
		fireBrigadeApplicationStageImpl.setUserName(getUserName());
		fireBrigadeApplicationStageImpl.setCreateDate(getCreateDate());
		fireBrigadeApplicationStageImpl.setModifiedDate(getModifiedDate());
		fireBrigadeApplicationStageImpl.setStageName(getStageName());
		fireBrigadeApplicationStageImpl.setStageEndDate(getStageEndDate());
		fireBrigadeApplicationStageImpl.setStageStartDate(getStageStartDate());
		fireBrigadeApplicationStageImpl.setDuration(getDuration());
		fireBrigadeApplicationStageImpl.setStageStatus(getStageStatus());
		fireBrigadeApplicationStageImpl.setCaseId(getCaseId());
		fireBrigadeApplicationStageImpl.setUpdatedBySource(
			getUpdatedBySource());

		fireBrigadeApplicationStageImpl.resetOriginalValues();

		return fireBrigadeApplicationStageImpl;
	}

	@Override
	public FireBrigadeApplicationStage cloneWithOriginalValues() {
		FireBrigadeApplicationStageImpl fireBrigadeApplicationStageImpl =
			new FireBrigadeApplicationStageImpl();

		fireBrigadeApplicationStageImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		fireBrigadeApplicationStageImpl.setFireBrigadeAppStageId(
			this.<Long>getColumnOriginalValue("fireBrigadeAppStageId"));
		fireBrigadeApplicationStageImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		fireBrigadeApplicationStageImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		fireBrigadeApplicationStageImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		fireBrigadeApplicationStageImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		fireBrigadeApplicationStageImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		fireBrigadeApplicationStageImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		fireBrigadeApplicationStageImpl.setStageName(
			this.<String>getColumnOriginalValue("stageName"));
		fireBrigadeApplicationStageImpl.setStageEndDate(
			this.<Date>getColumnOriginalValue("stageEndDate"));
		fireBrigadeApplicationStageImpl.setStageStartDate(
			this.<Date>getColumnOriginalValue("stageStartDate"));
		fireBrigadeApplicationStageImpl.setDuration(
			this.<String>getColumnOriginalValue("duration"));
		fireBrigadeApplicationStageImpl.setStageStatus(
			this.<String>getColumnOriginalValue("stageStatus"));
		fireBrigadeApplicationStageImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		fireBrigadeApplicationStageImpl.setUpdatedBySource(
			this.<String>getColumnOriginalValue("updatedBySource"));

		return fireBrigadeApplicationStageImpl;
	}

	@Override
	public int compareTo(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), fireBrigadeApplicationStage.getCreateDate());

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

		if (!(object instanceof FireBrigadeApplicationStage)) {
			return false;
		}

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			(FireBrigadeApplicationStage)object;

		long primaryKey = fireBrigadeApplicationStage.getPrimaryKey();

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
	public CacheModel<FireBrigadeApplicationStage> toCacheModel() {
		FireBrigadeApplicationStageCacheModel
			fireBrigadeApplicationStageCacheModel =
				new FireBrigadeApplicationStageCacheModel();

		fireBrigadeApplicationStageCacheModel.uuid = getUuid();

		String uuid = fireBrigadeApplicationStageCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			fireBrigadeApplicationStageCacheModel.uuid = null;
		}

		fireBrigadeApplicationStageCacheModel.fireBrigadeAppStageId =
			getFireBrigadeAppStageId();

		fireBrigadeApplicationStageCacheModel.groupId = getGroupId();

		fireBrigadeApplicationStageCacheModel.companyId = getCompanyId();

		fireBrigadeApplicationStageCacheModel.userId = getUserId();

		fireBrigadeApplicationStageCacheModel.userName = getUserName();

		String userName = fireBrigadeApplicationStageCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			fireBrigadeApplicationStageCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			fireBrigadeApplicationStageCacheModel.createDate =
				createDate.getTime();
		}
		else {
			fireBrigadeApplicationStageCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			fireBrigadeApplicationStageCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			fireBrigadeApplicationStageCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		fireBrigadeApplicationStageCacheModel.stageName = getStageName();

		String stageName = fireBrigadeApplicationStageCacheModel.stageName;

		if ((stageName != null) && (stageName.length() == 0)) {
			fireBrigadeApplicationStageCacheModel.stageName = null;
		}

		Date stageEndDate = getStageEndDate();

		if (stageEndDate != null) {
			fireBrigadeApplicationStageCacheModel.stageEndDate =
				stageEndDate.getTime();
		}
		else {
			fireBrigadeApplicationStageCacheModel.stageEndDate = Long.MIN_VALUE;
		}

		Date stageStartDate = getStageStartDate();

		if (stageStartDate != null) {
			fireBrigadeApplicationStageCacheModel.stageStartDate =
				stageStartDate.getTime();
		}
		else {
			fireBrigadeApplicationStageCacheModel.stageStartDate =
				Long.MIN_VALUE;
		}

		fireBrigadeApplicationStageCacheModel.duration = getDuration();

		String duration = fireBrigadeApplicationStageCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			fireBrigadeApplicationStageCacheModel.duration = null;
		}

		fireBrigadeApplicationStageCacheModel.stageStatus = getStageStatus();

		String stageStatus = fireBrigadeApplicationStageCacheModel.stageStatus;

		if ((stageStatus != null) && (stageStatus.length() == 0)) {
			fireBrigadeApplicationStageCacheModel.stageStatus = null;
		}

		fireBrigadeApplicationStageCacheModel.caseId = getCaseId();

		String caseId = fireBrigadeApplicationStageCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			fireBrigadeApplicationStageCacheModel.caseId = null;
		}

		fireBrigadeApplicationStageCacheModel.updatedBySource =
			getUpdatedBySource();

		String updatedBySource =
			fireBrigadeApplicationStageCacheModel.updatedBySource;

		if ((updatedBySource != null) && (updatedBySource.length() == 0)) {
			fireBrigadeApplicationStageCacheModel.updatedBySource = null;
		}

		return fireBrigadeApplicationStageCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<FireBrigadeApplicationStage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<FireBrigadeApplicationStage, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FireBrigadeApplicationStage, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(FireBrigadeApplicationStage)this);

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
			<InvocationHandler, FireBrigadeApplicationStage>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						FireBrigadeApplicationStage.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _fireBrigadeAppStageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _stageName;
	private Date _stageEndDate;
	private Date _stageStartDate;
	private String _duration;
	private String _stageStatus;
	private String _caseId;
	private String _updatedBySource;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<FireBrigadeApplicationStage, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((FireBrigadeApplicationStage)this);
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

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put(
			"fireBrigadeAppStageId", _fireBrigadeAppStageId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("stageName", _stageName);
		_columnOriginalValues.put("stageEndDate", _stageEndDate);
		_columnOriginalValues.put("stageStartDate", _stageStartDate);
		_columnOriginalValues.put("duration", _duration);
		_columnOriginalValues.put("stageStatus", _stageStatus);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("updatedBySource", _updatedBySource);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("fireBrigadeAppStageId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("stageName", 256L);

		columnBitmasks.put("stageEndDate", 512L);

		columnBitmasks.put("stageStartDate", 1024L);

		columnBitmasks.put("duration", 2048L);

		columnBitmasks.put("stageStatus", 4096L);

		columnBitmasks.put("caseId", 8192L);

		columnBitmasks.put("updatedBySource", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private FireBrigadeApplicationStage _escapedModel;

}