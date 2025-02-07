/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model.impl;

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

import com.nbp.osi.services.stages.service.model.OSIServicesStages;
import com.nbp.osi.services.stages.service.model.OSIServicesStagesModel;

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
 * The base model implementation for the OSIServicesStages service. Represents a row in the &quot;nbp_osi_services_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OSIServicesStagesModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OSIServicesStagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesStagesImpl
 * @generated
 */
@JSON(strict = true)
public class OSIServicesStagesModelImpl
	extends BaseModelImpl<OSIServicesStages> implements OSIServicesStagesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi services stages model instance should use the <code>OSIServicesStages</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_services_app_stages";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"osiServicesStagesId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"stageName", Types.VARCHAR}, {"duration", Types.VARCHAR},
		{"stageStatus", Types.VARCHAR}, {"stageStartDate", Types.TIMESTAMP},
		{"stageEndDate", Types.TIMESTAMP},
		{"osiServciesApplicationId", Types.BIGINT}, {"caseId", Types.VARCHAR},
		{"updatedBySource", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiServicesStagesId", Types.BIGINT);
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
		TABLE_COLUMNS_MAP.put("osiServciesApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updatedBySource", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_services_app_stages (uuid_ VARCHAR(75) null,osiServicesStagesId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,stageName VARCHAR(75) null,duration VARCHAR(75) null,stageStatus VARCHAR(75) null,stageStartDate DATE null,stageEndDate DATE null,osiServciesApplicationId LONG,caseId VARCHAR(75) null,updatedBySource VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_services_app_stages";

	public static final String ORDER_BY_JPQL =
		" ORDER BY osiServicesStages.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_services_app_stages.createDate DESC";

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
	public static final long OSISERVCIESAPPLICATIONID_COLUMN_BITMASK = 8L;

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

	public OSIServicesStagesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _osiServicesStagesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOsiServicesStagesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _osiServicesStagesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OSIServicesStages.class;
	}

	@Override
	public String getModelClassName() {
		return OSIServicesStages.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<OSIServicesStages, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<OSIServicesStages, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OSIServicesStages, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((OSIServicesStages)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OSIServicesStages, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OSIServicesStages, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(OSIServicesStages)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OSIServicesStages, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OSIServicesStages, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<OSIServicesStages, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<OSIServicesStages, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<OSIServicesStages, Object>>();

			attributeGetterFunctions.put("uuid", OSIServicesStages::getUuid);
			attributeGetterFunctions.put(
				"osiServicesStagesId",
				OSIServicesStages::getOsiServicesStagesId);
			attributeGetterFunctions.put(
				"groupId", OSIServicesStages::getGroupId);
			attributeGetterFunctions.put(
				"companyId", OSIServicesStages::getCompanyId);
			attributeGetterFunctions.put(
				"userId", OSIServicesStages::getUserId);
			attributeGetterFunctions.put(
				"userName", OSIServicesStages::getUserName);
			attributeGetterFunctions.put(
				"createDate", OSIServicesStages::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", OSIServicesStages::getModifiedDate);
			attributeGetterFunctions.put(
				"stageName", OSIServicesStages::getStageName);
			attributeGetterFunctions.put(
				"duration", OSIServicesStages::getDuration);
			attributeGetterFunctions.put(
				"stageStatus", OSIServicesStages::getStageStatus);
			attributeGetterFunctions.put(
				"stageStartDate", OSIServicesStages::getStageStartDate);
			attributeGetterFunctions.put(
				"stageEndDate", OSIServicesStages::getStageEndDate);
			attributeGetterFunctions.put(
				"osiServciesApplicationId",
				OSIServicesStages::getOsiServciesApplicationId);
			attributeGetterFunctions.put(
				"caseId", OSIServicesStages::getCaseId);
			attributeGetterFunctions.put(
				"updatedBySource", OSIServicesStages::getUpdatedBySource);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<OSIServicesStages, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<OSIServicesStages, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<OSIServicesStages, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<OSIServicesStages, String>)
					OSIServicesStages::setUuid);
			attributeSetterBiConsumers.put(
				"osiServicesStagesId",
				(BiConsumer<OSIServicesStages, Long>)
					OSIServicesStages::setOsiServicesStagesId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<OSIServicesStages, Long>)
					OSIServicesStages::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<OSIServicesStages, Long>)
					OSIServicesStages::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<OSIServicesStages, Long>)
					OSIServicesStages::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<OSIServicesStages, String>)
					OSIServicesStages::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<OSIServicesStages, Date>)
					OSIServicesStages::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<OSIServicesStages, Date>)
					OSIServicesStages::setModifiedDate);
			attributeSetterBiConsumers.put(
				"stageName",
				(BiConsumer<OSIServicesStages, String>)
					OSIServicesStages::setStageName);
			attributeSetterBiConsumers.put(
				"duration",
				(BiConsumer<OSIServicesStages, String>)
					OSIServicesStages::setDuration);
			attributeSetterBiConsumers.put(
				"stageStatus",
				(BiConsumer<OSIServicesStages, String>)
					OSIServicesStages::setStageStatus);
			attributeSetterBiConsumers.put(
				"stageStartDate",
				(BiConsumer<OSIServicesStages, Date>)
					OSIServicesStages::setStageStartDate);
			attributeSetterBiConsumers.put(
				"stageEndDate",
				(BiConsumer<OSIServicesStages, Date>)
					OSIServicesStages::setStageEndDate);
			attributeSetterBiConsumers.put(
				"osiServciesApplicationId",
				(BiConsumer<OSIServicesStages, Long>)
					OSIServicesStages::setOsiServciesApplicationId);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<OSIServicesStages, String>)
					OSIServicesStages::setCaseId);
			attributeSetterBiConsumers.put(
				"updatedBySource",
				(BiConsumer<OSIServicesStages, String>)
					OSIServicesStages::setUpdatedBySource);

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
	public long getOsiServicesStagesId() {
		return _osiServicesStagesId;
	}

	@Override
	public void setOsiServicesStagesId(long osiServicesStagesId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiServicesStagesId = osiServicesStagesId;
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
	public long getOsiServciesApplicationId() {
		return _osiServciesApplicationId;
	}

	@Override
	public void setOsiServciesApplicationId(long osiServciesApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiServciesApplicationId = osiServciesApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalOsiServciesApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("osiServciesApplicationId"));
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
			PortalUtil.getClassNameId(OSIServicesStages.class.getName()));
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
			getCompanyId(), OSIServicesStages.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OSIServicesStages toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OSIServicesStages>
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
		OSIServicesStagesImpl osiServicesStagesImpl =
			new OSIServicesStagesImpl();

		osiServicesStagesImpl.setUuid(getUuid());
		osiServicesStagesImpl.setOsiServicesStagesId(getOsiServicesStagesId());
		osiServicesStagesImpl.setGroupId(getGroupId());
		osiServicesStagesImpl.setCompanyId(getCompanyId());
		osiServicesStagesImpl.setUserId(getUserId());
		osiServicesStagesImpl.setUserName(getUserName());
		osiServicesStagesImpl.setCreateDate(getCreateDate());
		osiServicesStagesImpl.setModifiedDate(getModifiedDate());
		osiServicesStagesImpl.setStageName(getStageName());
		osiServicesStagesImpl.setDuration(getDuration());
		osiServicesStagesImpl.setStageStatus(getStageStatus());
		osiServicesStagesImpl.setStageStartDate(getStageStartDate());
		osiServicesStagesImpl.setStageEndDate(getStageEndDate());
		osiServicesStagesImpl.setOsiServciesApplicationId(
			getOsiServciesApplicationId());
		osiServicesStagesImpl.setCaseId(getCaseId());
		osiServicesStagesImpl.setUpdatedBySource(getUpdatedBySource());

		osiServicesStagesImpl.resetOriginalValues();

		return osiServicesStagesImpl;
	}

	@Override
	public OSIServicesStages cloneWithOriginalValues() {
		OSIServicesStagesImpl osiServicesStagesImpl =
			new OSIServicesStagesImpl();

		osiServicesStagesImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		osiServicesStagesImpl.setOsiServicesStagesId(
			this.<Long>getColumnOriginalValue("osiServicesStagesId"));
		osiServicesStagesImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		osiServicesStagesImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		osiServicesStagesImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		osiServicesStagesImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		osiServicesStagesImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		osiServicesStagesImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		osiServicesStagesImpl.setStageName(
			this.<String>getColumnOriginalValue("stageName"));
		osiServicesStagesImpl.setDuration(
			this.<String>getColumnOriginalValue("duration"));
		osiServicesStagesImpl.setStageStatus(
			this.<String>getColumnOriginalValue("stageStatus"));
		osiServicesStagesImpl.setStageStartDate(
			this.<Date>getColumnOriginalValue("stageStartDate"));
		osiServicesStagesImpl.setStageEndDate(
			this.<Date>getColumnOriginalValue("stageEndDate"));
		osiServicesStagesImpl.setOsiServciesApplicationId(
			this.<Long>getColumnOriginalValue("osiServciesApplicationId"));
		osiServicesStagesImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		osiServicesStagesImpl.setUpdatedBySource(
			this.<String>getColumnOriginalValue("updatedBySource"));

		return osiServicesStagesImpl;
	}

	@Override
	public int compareTo(OSIServicesStages osiServicesStages) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), osiServicesStages.getCreateDate());

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

		if (!(object instanceof OSIServicesStages)) {
			return false;
		}

		OSIServicesStages osiServicesStages = (OSIServicesStages)object;

		long primaryKey = osiServicesStages.getPrimaryKey();

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
	public CacheModel<OSIServicesStages> toCacheModel() {
		OSIServicesStagesCacheModel osiServicesStagesCacheModel =
			new OSIServicesStagesCacheModel();

		osiServicesStagesCacheModel.uuid = getUuid();

		String uuid = osiServicesStagesCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			osiServicesStagesCacheModel.uuid = null;
		}

		osiServicesStagesCacheModel.osiServicesStagesId =
			getOsiServicesStagesId();

		osiServicesStagesCacheModel.groupId = getGroupId();

		osiServicesStagesCacheModel.companyId = getCompanyId();

		osiServicesStagesCacheModel.userId = getUserId();

		osiServicesStagesCacheModel.userName = getUserName();

		String userName = osiServicesStagesCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			osiServicesStagesCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			osiServicesStagesCacheModel.createDate = createDate.getTime();
		}
		else {
			osiServicesStagesCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			osiServicesStagesCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			osiServicesStagesCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		osiServicesStagesCacheModel.stageName = getStageName();

		String stageName = osiServicesStagesCacheModel.stageName;

		if ((stageName != null) && (stageName.length() == 0)) {
			osiServicesStagesCacheModel.stageName = null;
		}

		osiServicesStagesCacheModel.duration = getDuration();

		String duration = osiServicesStagesCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			osiServicesStagesCacheModel.duration = null;
		}

		osiServicesStagesCacheModel.stageStatus = getStageStatus();

		String stageStatus = osiServicesStagesCacheModel.stageStatus;

		if ((stageStatus != null) && (stageStatus.length() == 0)) {
			osiServicesStagesCacheModel.stageStatus = null;
		}

		Date stageStartDate = getStageStartDate();

		if (stageStartDate != null) {
			osiServicesStagesCacheModel.stageStartDate =
				stageStartDate.getTime();
		}
		else {
			osiServicesStagesCacheModel.stageStartDate = Long.MIN_VALUE;
		}

		Date stageEndDate = getStageEndDate();

		if (stageEndDate != null) {
			osiServicesStagesCacheModel.stageEndDate = stageEndDate.getTime();
		}
		else {
			osiServicesStagesCacheModel.stageEndDate = Long.MIN_VALUE;
		}

		osiServicesStagesCacheModel.osiServciesApplicationId =
			getOsiServciesApplicationId();

		osiServicesStagesCacheModel.caseId = getCaseId();

		String caseId = osiServicesStagesCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			osiServicesStagesCacheModel.caseId = null;
		}

		osiServicesStagesCacheModel.updatedBySource = getUpdatedBySource();

		String updatedBySource = osiServicesStagesCacheModel.updatedBySource;

		if ((updatedBySource != null) && (updatedBySource.length() == 0)) {
			osiServicesStagesCacheModel.updatedBySource = null;
		}

		return osiServicesStagesCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OSIServicesStages, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<OSIServicesStages, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OSIServicesStages, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(OSIServicesStages)this);

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

		private static final Function<InvocationHandler, OSIServicesStages>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					OSIServicesStages.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _osiServicesStagesId;
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
	private long _osiServciesApplicationId;
	private String _caseId;
	private String _updatedBySource;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<OSIServicesStages, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((OSIServicesStages)this);
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
		_columnOriginalValues.put("osiServicesStagesId", _osiServicesStagesId);
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
			"osiServciesApplicationId", _osiServciesApplicationId);
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

		columnBitmasks.put("osiServicesStagesId", 2L);

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

		columnBitmasks.put("osiServciesApplicationId", 8192L);

		columnBitmasks.put("caseId", 16384L);

		columnBitmasks.put("updatedBySource", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private OSIServicesStages _escapedModel;

}