/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.model.impl;

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

import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStage;
import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStageModel;

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
 * The base model implementation for the FactoriesApplicationStage service. Represents a row in the &quot;nbp_factories_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>FactoriesApplicationStageModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FactoriesApplicationStageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationStageImpl
 * @generated
 */
@JSON(strict = true)
public class FactoriesApplicationStageModelImpl
	extends BaseModelImpl<FactoriesApplicationStage>
	implements FactoriesApplicationStageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a factories application stage model instance should use the <code>FactoriesApplicationStage</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_factories_app_stage";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"factoriesApplicationStageId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"stageName", Types.VARCHAR}, {"duration", Types.VARCHAR},
		{"stageStatus", Types.VARCHAR}, {"stageStartDate", Types.TIMESTAMP},
		{"stageEndDate", Types.TIMESTAMP},
		{"factoriesApplicationId", Types.BIGINT}, {"caseId", Types.VARCHAR},
		{"updatedBySource", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("factoriesApplicationStageId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("stageName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("duration", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("stageStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("stageStartDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("stageEndDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("factoriesApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updatedBySource", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_factories_app_stage (uuid_ VARCHAR(75) null,factoriesApplicationStageId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,stageName VARCHAR(75) null,duration VARCHAR(75) null,stageStatus VARCHAR(75) null,stageStartDate DATE null,stageEndDate DATE null,factoriesApplicationId LONG,caseId VARCHAR(75) null,updatedBySource VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_factories_app_stage";

	public static final String ORDER_BY_JPQL =
		" ORDER BY factoriesApplicationStage.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_factories_app_stage.createDate DESC";

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
	public static final long FACTORIESAPPLICATIONID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STAGENAME_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STAGESTATUS_COLUMN_BITMASK = 32L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 64L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 128L;

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

	public FactoriesApplicationStageModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _factoriesApplicationStageId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFactoriesApplicationStageId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _factoriesApplicationStageId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FactoriesApplicationStage.class;
	}

	@Override
	public String getModelClassName() {
		return FactoriesApplicationStage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<FactoriesApplicationStage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<FactoriesApplicationStage, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FactoriesApplicationStage, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((FactoriesApplicationStage)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<FactoriesApplicationStage, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<FactoriesApplicationStage, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(FactoriesApplicationStage)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<FactoriesApplicationStage, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<FactoriesApplicationStage, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<FactoriesApplicationStage, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<FactoriesApplicationStage, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<FactoriesApplicationStage, Object>>();

			attributeGetterFunctions.put(
				"uuid", FactoriesApplicationStage::getUuid);
			attributeGetterFunctions.put(
				"factoriesApplicationStageId",
				FactoriesApplicationStage::getFactoriesApplicationStageId);
			attributeGetterFunctions.put(
				"groupId", FactoriesApplicationStage::getGroupId);
			attributeGetterFunctions.put(
				"companyId", FactoriesApplicationStage::getCompanyId);
			attributeGetterFunctions.put(
				"userId", FactoriesApplicationStage::getUserId);
			attributeGetterFunctions.put(
				"userName", FactoriesApplicationStage::getUserName);
			attributeGetterFunctions.put(
				"createDate", FactoriesApplicationStage::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", FactoriesApplicationStage::getModifiedDate);
			attributeGetterFunctions.put(
				"stageName", FactoriesApplicationStage::getStageName);
			attributeGetterFunctions.put(
				"duration", FactoriesApplicationStage::getDuration);
			attributeGetterFunctions.put(
				"stageStatus", FactoriesApplicationStage::getStageStatus);
			attributeGetterFunctions.put(
				"stageStartDate", FactoriesApplicationStage::getStageStartDate);
			attributeGetterFunctions.put(
				"stageEndDate", FactoriesApplicationStage::getStageEndDate);
			attributeGetterFunctions.put(
				"factoriesApplicationId",
				FactoriesApplicationStage::getFactoriesApplicationId);
			attributeGetterFunctions.put(
				"caseId", FactoriesApplicationStage::getCaseId);
			attributeGetterFunctions.put(
				"updatedBySource",
				FactoriesApplicationStage::getUpdatedBySource);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<FactoriesApplicationStage, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<FactoriesApplicationStage, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<FactoriesApplicationStage, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<FactoriesApplicationStage, String>)
					FactoriesApplicationStage::setUuid);
			attributeSetterBiConsumers.put(
				"factoriesApplicationStageId",
				(BiConsumer<FactoriesApplicationStage, Long>)
					FactoriesApplicationStage::setFactoriesApplicationStageId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<FactoriesApplicationStage, Long>)
					FactoriesApplicationStage::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<FactoriesApplicationStage, Long>)
					FactoriesApplicationStage::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<FactoriesApplicationStage, Long>)
					FactoriesApplicationStage::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<FactoriesApplicationStage, String>)
					FactoriesApplicationStage::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<FactoriesApplicationStage, Date>)
					FactoriesApplicationStage::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<FactoriesApplicationStage, Date>)
					FactoriesApplicationStage::setModifiedDate);
			attributeSetterBiConsumers.put(
				"stageName",
				(BiConsumer<FactoriesApplicationStage, String>)
					FactoriesApplicationStage::setStageName);
			attributeSetterBiConsumers.put(
				"duration",
				(BiConsumer<FactoriesApplicationStage, String>)
					FactoriesApplicationStage::setDuration);
			attributeSetterBiConsumers.put(
				"stageStatus",
				(BiConsumer<FactoriesApplicationStage, String>)
					FactoriesApplicationStage::setStageStatus);
			attributeSetterBiConsumers.put(
				"stageStartDate",
				(BiConsumer<FactoriesApplicationStage, Date>)
					FactoriesApplicationStage::setStageStartDate);
			attributeSetterBiConsumers.put(
				"stageEndDate",
				(BiConsumer<FactoriesApplicationStage, Date>)
					FactoriesApplicationStage::setStageEndDate);
			attributeSetterBiConsumers.put(
				"factoriesApplicationId",
				(BiConsumer<FactoriesApplicationStage, Long>)
					FactoriesApplicationStage::setFactoriesApplicationId);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<FactoriesApplicationStage, String>)
					FactoriesApplicationStage::setCaseId);
			attributeSetterBiConsumers.put(
				"updatedBySource",
				(BiConsumer<FactoriesApplicationStage, String>)
					FactoriesApplicationStage::setUpdatedBySource);

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
	public long getFactoriesApplicationStageId() {
		return _factoriesApplicationStageId;
	}

	@Override
	public void setFactoriesApplicationStageId(
		long factoriesApplicationStageId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_factoriesApplicationStageId = factoriesApplicationStageId;
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
	public long getFactoriesApplicationId() {
		return _factoriesApplicationId;
	}

	@Override
	public void setFactoriesApplicationId(long factoriesApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_factoriesApplicationId = factoriesApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalFactoriesApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("factoriesApplicationId"));
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
				FactoriesApplicationStage.class.getName()));
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
			getCompanyId(), FactoriesApplicationStage.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FactoriesApplicationStage toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, FactoriesApplicationStage>
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
		FactoriesApplicationStageImpl factoriesApplicationStageImpl =
			new FactoriesApplicationStageImpl();

		factoriesApplicationStageImpl.setUuid(getUuid());
		factoriesApplicationStageImpl.setFactoriesApplicationStageId(
			getFactoriesApplicationStageId());
		factoriesApplicationStageImpl.setGroupId(getGroupId());
		factoriesApplicationStageImpl.setCompanyId(getCompanyId());
		factoriesApplicationStageImpl.setUserId(getUserId());
		factoriesApplicationStageImpl.setUserName(getUserName());
		factoriesApplicationStageImpl.setCreateDate(getCreateDate());
		factoriesApplicationStageImpl.setModifiedDate(getModifiedDate());
		factoriesApplicationStageImpl.setStageName(getStageName());
		factoriesApplicationStageImpl.setDuration(getDuration());
		factoriesApplicationStageImpl.setStageStatus(getStageStatus());
		factoriesApplicationStageImpl.setStageStartDate(getStageStartDate());
		factoriesApplicationStageImpl.setStageEndDate(getStageEndDate());
		factoriesApplicationStageImpl.setFactoriesApplicationId(
			getFactoriesApplicationId());
		factoriesApplicationStageImpl.setCaseId(getCaseId());
		factoriesApplicationStageImpl.setUpdatedBySource(getUpdatedBySource());

		factoriesApplicationStageImpl.resetOriginalValues();

		return factoriesApplicationStageImpl;
	}

	@Override
	public FactoriesApplicationStage cloneWithOriginalValues() {
		FactoriesApplicationStageImpl factoriesApplicationStageImpl =
			new FactoriesApplicationStageImpl();

		factoriesApplicationStageImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		factoriesApplicationStageImpl.setFactoriesApplicationStageId(
			this.<Long>getColumnOriginalValue("factoriesApplicationStageId"));
		factoriesApplicationStageImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		factoriesApplicationStageImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		factoriesApplicationStageImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		factoriesApplicationStageImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		factoriesApplicationStageImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		factoriesApplicationStageImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		factoriesApplicationStageImpl.setStageName(
			this.<String>getColumnOriginalValue("stageName"));
		factoriesApplicationStageImpl.setDuration(
			this.<String>getColumnOriginalValue("duration"));
		factoriesApplicationStageImpl.setStageStatus(
			this.<String>getColumnOriginalValue("stageStatus"));
		factoriesApplicationStageImpl.setStageStartDate(
			this.<Date>getColumnOriginalValue("stageStartDate"));
		factoriesApplicationStageImpl.setStageEndDate(
			this.<Date>getColumnOriginalValue("stageEndDate"));
		factoriesApplicationStageImpl.setFactoriesApplicationId(
			this.<Long>getColumnOriginalValue("factoriesApplicationId"));
		factoriesApplicationStageImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		factoriesApplicationStageImpl.setUpdatedBySource(
			this.<String>getColumnOriginalValue("updatedBySource"));

		return factoriesApplicationStageImpl;
	}

	@Override
	public int compareTo(FactoriesApplicationStage factoriesApplicationStage) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), factoriesApplicationStage.getCreateDate());

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

		if (!(object instanceof FactoriesApplicationStage)) {
			return false;
		}

		FactoriesApplicationStage factoriesApplicationStage =
			(FactoriesApplicationStage)object;

		long primaryKey = factoriesApplicationStage.getPrimaryKey();

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
	public CacheModel<FactoriesApplicationStage> toCacheModel() {
		FactoriesApplicationStageCacheModel
			factoriesApplicationStageCacheModel =
				new FactoriesApplicationStageCacheModel();

		factoriesApplicationStageCacheModel.uuid = getUuid();

		String uuid = factoriesApplicationStageCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			factoriesApplicationStageCacheModel.uuid = null;
		}

		factoriesApplicationStageCacheModel.factoriesApplicationStageId =
			getFactoriesApplicationStageId();

		factoriesApplicationStageCacheModel.groupId = getGroupId();

		factoriesApplicationStageCacheModel.companyId = getCompanyId();

		factoriesApplicationStageCacheModel.userId = getUserId();

		factoriesApplicationStageCacheModel.userName = getUserName();

		String userName = factoriesApplicationStageCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			factoriesApplicationStageCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			factoriesApplicationStageCacheModel.createDate =
				createDate.getTime();
		}
		else {
			factoriesApplicationStageCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			factoriesApplicationStageCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			factoriesApplicationStageCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		factoriesApplicationStageCacheModel.stageName = getStageName();

		String stageName = factoriesApplicationStageCacheModel.stageName;

		if ((stageName != null) && (stageName.length() == 0)) {
			factoriesApplicationStageCacheModel.stageName = null;
		}

		factoriesApplicationStageCacheModel.duration = getDuration();

		String duration = factoriesApplicationStageCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			factoriesApplicationStageCacheModel.duration = null;
		}

		factoriesApplicationStageCacheModel.stageStatus = getStageStatus();

		String stageStatus = factoriesApplicationStageCacheModel.stageStatus;

		if ((stageStatus != null) && (stageStatus.length() == 0)) {
			factoriesApplicationStageCacheModel.stageStatus = null;
		}

		Date stageStartDate = getStageStartDate();

		if (stageStartDate != null) {
			factoriesApplicationStageCacheModel.stageStartDate =
				stageStartDate.getTime();
		}
		else {
			factoriesApplicationStageCacheModel.stageStartDate = Long.MIN_VALUE;
		}

		Date stageEndDate = getStageEndDate();

		if (stageEndDate != null) {
			factoriesApplicationStageCacheModel.stageEndDate =
				stageEndDate.getTime();
		}
		else {
			factoriesApplicationStageCacheModel.stageEndDate = Long.MIN_VALUE;
		}

		factoriesApplicationStageCacheModel.factoriesApplicationId =
			getFactoriesApplicationId();

		factoriesApplicationStageCacheModel.caseId = getCaseId();

		String caseId = factoriesApplicationStageCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			factoriesApplicationStageCacheModel.caseId = null;
		}

		factoriesApplicationStageCacheModel.updatedBySource =
			getUpdatedBySource();

		String updatedBySource =
			factoriesApplicationStageCacheModel.updatedBySource;

		if ((updatedBySource != null) && (updatedBySource.length() == 0)) {
			factoriesApplicationStageCacheModel.updatedBySource = null;
		}

		return factoriesApplicationStageCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<FactoriesApplicationStage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<FactoriesApplicationStage, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FactoriesApplicationStage, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(FactoriesApplicationStage)this);

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
			<InvocationHandler, FactoriesApplicationStage>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						FactoriesApplicationStage.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _factoriesApplicationStageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _stageName;
	private String _duration;
	private String _stageStatus;
	private Date _stageStartDate;
	private Date _stageEndDate;
	private long _factoriesApplicationId;
	private String _caseId;
	private String _updatedBySource;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<FactoriesApplicationStage, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((FactoriesApplicationStage)this);
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
			"factoriesApplicationStageId", _factoriesApplicationStageId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("stageName", _stageName);
		_columnOriginalValues.put("duration", _duration);
		_columnOriginalValues.put("stageStatus", _stageStatus);
		_columnOriginalValues.put("stageStartDate", _stageStartDate);
		_columnOriginalValues.put("stageEndDate", _stageEndDate);
		_columnOriginalValues.put(
			"factoriesApplicationId", _factoriesApplicationId);
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

		columnBitmasks.put("factoriesApplicationStageId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("stageName", 256L);

		columnBitmasks.put("duration", 512L);

		columnBitmasks.put("stageStatus", 1024L);

		columnBitmasks.put("stageStartDate", 2048L);

		columnBitmasks.put("stageEndDate", 4096L);

		columnBitmasks.put("factoriesApplicationId", 8192L);

		columnBitmasks.put("caseId", 16384L);

		columnBitmasks.put("updatedBySource", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private FactoriesApplicationStage _escapedModel;

}