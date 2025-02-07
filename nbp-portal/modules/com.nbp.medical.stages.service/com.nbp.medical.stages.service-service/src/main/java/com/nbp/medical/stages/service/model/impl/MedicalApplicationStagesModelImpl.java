/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model.impl;

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

import com.nbp.medical.stages.service.model.MedicalApplicationStages;
import com.nbp.medical.stages.service.model.MedicalApplicationStagesModel;

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
 * The base model implementation for the MedicalApplicationStages service. Represents a row in the &quot;nbp_medical_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MedicalApplicationStagesModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalApplicationStagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalApplicationStagesImpl
 * @generated
 */
@JSON(strict = true)
public class MedicalApplicationStagesModelImpl
	extends BaseModelImpl<MedicalApplicationStages>
	implements MedicalApplicationStagesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical application stages model instance should use the <code>MedicalApplicationStages</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_medical_app_stage";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"medicalStagesId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"stageName", Types.VARCHAR}, {"duration", Types.VARCHAR},
		{"stageStatus", Types.VARCHAR}, {"stageStartDate", Types.TIMESTAMP},
		{"stageEndDate", Types.TIMESTAMP},
		{"medicalApplicationId", Types.BIGINT}, {"caseId", Types.VARCHAR},
		{"updateBySource", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medicalStagesId", Types.BIGINT);
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
		TABLE_COLUMNS_MAP.put("medicalApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("updateBySource", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_medical_app_stage (uuid_ VARCHAR(75) null,medicalStagesId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,stageName VARCHAR(75) null,duration VARCHAR(75) null,stageStatus VARCHAR(75) null,stageStartDate DATE null,stageEndDate DATE null,medicalApplicationId LONG,caseId VARCHAR(75) null,updateBySource VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_medical_app_stage";

	public static final String ORDER_BY_JPQL =
		" ORDER BY medicalApplicationStages.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_medical_app_stage.createDate DESC";

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
	public static final long MEDICALAPPLICATIONID_COLUMN_BITMASK = 8L;

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

	public MedicalApplicationStagesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _medicalStagesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMedicalStagesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _medicalStagesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MedicalApplicationStages.class;
	}

	@Override
	public String getModelClassName() {
		return MedicalApplicationStages.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<MedicalApplicationStages, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<MedicalApplicationStages, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalApplicationStages, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((MedicalApplicationStages)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<MedicalApplicationStages, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<MedicalApplicationStages, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(MedicalApplicationStages)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<MedicalApplicationStages, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<MedicalApplicationStages, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<MedicalApplicationStages, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<MedicalApplicationStages, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<MedicalApplicationStages, Object>>();

			attributeGetterFunctions.put(
				"uuid", MedicalApplicationStages::getUuid);
			attributeGetterFunctions.put(
				"medicalStagesId",
				MedicalApplicationStages::getMedicalStagesId);
			attributeGetterFunctions.put(
				"groupId", MedicalApplicationStages::getGroupId);
			attributeGetterFunctions.put(
				"companyId", MedicalApplicationStages::getCompanyId);
			attributeGetterFunctions.put(
				"userId", MedicalApplicationStages::getUserId);
			attributeGetterFunctions.put(
				"userName", MedicalApplicationStages::getUserName);
			attributeGetterFunctions.put(
				"createDate", MedicalApplicationStages::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", MedicalApplicationStages::getModifiedDate);
			attributeGetterFunctions.put(
				"stageName", MedicalApplicationStages::getStageName);
			attributeGetterFunctions.put(
				"duration", MedicalApplicationStages::getDuration);
			attributeGetterFunctions.put(
				"stageStatus", MedicalApplicationStages::getStageStatus);
			attributeGetterFunctions.put(
				"stageStartDate", MedicalApplicationStages::getStageStartDate);
			attributeGetterFunctions.put(
				"stageEndDate", MedicalApplicationStages::getStageEndDate);
			attributeGetterFunctions.put(
				"medicalApplicationId",
				MedicalApplicationStages::getMedicalApplicationId);
			attributeGetterFunctions.put(
				"caseId", MedicalApplicationStages::getCaseId);
			attributeGetterFunctions.put(
				"updateBySource", MedicalApplicationStages::getUpdateBySource);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<MedicalApplicationStages, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<MedicalApplicationStages, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<MedicalApplicationStages, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<MedicalApplicationStages, String>)
					MedicalApplicationStages::setUuid);
			attributeSetterBiConsumers.put(
				"medicalStagesId",
				(BiConsumer<MedicalApplicationStages, Long>)
					MedicalApplicationStages::setMedicalStagesId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<MedicalApplicationStages, Long>)
					MedicalApplicationStages::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<MedicalApplicationStages, Long>)
					MedicalApplicationStages::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<MedicalApplicationStages, Long>)
					MedicalApplicationStages::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<MedicalApplicationStages, String>)
					MedicalApplicationStages::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<MedicalApplicationStages, Date>)
					MedicalApplicationStages::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<MedicalApplicationStages, Date>)
					MedicalApplicationStages::setModifiedDate);
			attributeSetterBiConsumers.put(
				"stageName",
				(BiConsumer<MedicalApplicationStages, String>)
					MedicalApplicationStages::setStageName);
			attributeSetterBiConsumers.put(
				"duration",
				(BiConsumer<MedicalApplicationStages, String>)
					MedicalApplicationStages::setDuration);
			attributeSetterBiConsumers.put(
				"stageStatus",
				(BiConsumer<MedicalApplicationStages, String>)
					MedicalApplicationStages::setStageStatus);
			attributeSetterBiConsumers.put(
				"stageStartDate",
				(BiConsumer<MedicalApplicationStages, Date>)
					MedicalApplicationStages::setStageStartDate);
			attributeSetterBiConsumers.put(
				"stageEndDate",
				(BiConsumer<MedicalApplicationStages, Date>)
					MedicalApplicationStages::setStageEndDate);
			attributeSetterBiConsumers.put(
				"medicalApplicationId",
				(BiConsumer<MedicalApplicationStages, Long>)
					MedicalApplicationStages::setMedicalApplicationId);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<MedicalApplicationStages, String>)
					MedicalApplicationStages::setCaseId);
			attributeSetterBiConsumers.put(
				"updateBySource",
				(BiConsumer<MedicalApplicationStages, String>)
					MedicalApplicationStages::setUpdateBySource);

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
	public long getMedicalStagesId() {
		return _medicalStagesId;
	}

	@Override
	public void setMedicalStagesId(long medicalStagesId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medicalStagesId = medicalStagesId;
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
	public long getMedicalApplicationId() {
		return _medicalApplicationId;
	}

	@Override
	public void setMedicalApplicationId(long medicalApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medicalApplicationId = medicalApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalMedicalApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("medicalApplicationId"));
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
	public String getUpdateBySource() {
		if (_updateBySource == null) {
			return "";
		}
		else {
			return _updateBySource;
		}
	}

	@Override
	public void setUpdateBySource(String updateBySource) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_updateBySource = updateBySource;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				MedicalApplicationStages.class.getName()));
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
			getCompanyId(), MedicalApplicationStages.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MedicalApplicationStages toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, MedicalApplicationStages>
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
		MedicalApplicationStagesImpl medicalApplicationStagesImpl =
			new MedicalApplicationStagesImpl();

		medicalApplicationStagesImpl.setUuid(getUuid());
		medicalApplicationStagesImpl.setMedicalStagesId(getMedicalStagesId());
		medicalApplicationStagesImpl.setGroupId(getGroupId());
		medicalApplicationStagesImpl.setCompanyId(getCompanyId());
		medicalApplicationStagesImpl.setUserId(getUserId());
		medicalApplicationStagesImpl.setUserName(getUserName());
		medicalApplicationStagesImpl.setCreateDate(getCreateDate());
		medicalApplicationStagesImpl.setModifiedDate(getModifiedDate());
		medicalApplicationStagesImpl.setStageName(getStageName());
		medicalApplicationStagesImpl.setDuration(getDuration());
		medicalApplicationStagesImpl.setStageStatus(getStageStatus());
		medicalApplicationStagesImpl.setStageStartDate(getStageStartDate());
		medicalApplicationStagesImpl.setStageEndDate(getStageEndDate());
		medicalApplicationStagesImpl.setMedicalApplicationId(
			getMedicalApplicationId());
		medicalApplicationStagesImpl.setCaseId(getCaseId());
		medicalApplicationStagesImpl.setUpdateBySource(getUpdateBySource());

		medicalApplicationStagesImpl.resetOriginalValues();

		return medicalApplicationStagesImpl;
	}

	@Override
	public MedicalApplicationStages cloneWithOriginalValues() {
		MedicalApplicationStagesImpl medicalApplicationStagesImpl =
			new MedicalApplicationStagesImpl();

		medicalApplicationStagesImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		medicalApplicationStagesImpl.setMedicalStagesId(
			this.<Long>getColumnOriginalValue("medicalStagesId"));
		medicalApplicationStagesImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		medicalApplicationStagesImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		medicalApplicationStagesImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		medicalApplicationStagesImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		medicalApplicationStagesImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		medicalApplicationStagesImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		medicalApplicationStagesImpl.setStageName(
			this.<String>getColumnOriginalValue("stageName"));
		medicalApplicationStagesImpl.setDuration(
			this.<String>getColumnOriginalValue("duration"));
		medicalApplicationStagesImpl.setStageStatus(
			this.<String>getColumnOriginalValue("stageStatus"));
		medicalApplicationStagesImpl.setStageStartDate(
			this.<Date>getColumnOriginalValue("stageStartDate"));
		medicalApplicationStagesImpl.setStageEndDate(
			this.<Date>getColumnOriginalValue("stageEndDate"));
		medicalApplicationStagesImpl.setMedicalApplicationId(
			this.<Long>getColumnOriginalValue("medicalApplicationId"));
		medicalApplicationStagesImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		medicalApplicationStagesImpl.setUpdateBySource(
			this.<String>getColumnOriginalValue("updateBySource"));

		return medicalApplicationStagesImpl;
	}

	@Override
	public int compareTo(MedicalApplicationStages medicalApplicationStages) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), medicalApplicationStages.getCreateDate());

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

		if (!(object instanceof MedicalApplicationStages)) {
			return false;
		}

		MedicalApplicationStages medicalApplicationStages =
			(MedicalApplicationStages)object;

		long primaryKey = medicalApplicationStages.getPrimaryKey();

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
	public CacheModel<MedicalApplicationStages> toCacheModel() {
		MedicalApplicationStagesCacheModel medicalApplicationStagesCacheModel =
			new MedicalApplicationStagesCacheModel();

		medicalApplicationStagesCacheModel.uuid = getUuid();

		String uuid = medicalApplicationStagesCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			medicalApplicationStagesCacheModel.uuid = null;
		}

		medicalApplicationStagesCacheModel.medicalStagesId =
			getMedicalStagesId();

		medicalApplicationStagesCacheModel.groupId = getGroupId();

		medicalApplicationStagesCacheModel.companyId = getCompanyId();

		medicalApplicationStagesCacheModel.userId = getUserId();

		medicalApplicationStagesCacheModel.userName = getUserName();

		String userName = medicalApplicationStagesCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			medicalApplicationStagesCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			medicalApplicationStagesCacheModel.createDate =
				createDate.getTime();
		}
		else {
			medicalApplicationStagesCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			medicalApplicationStagesCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			medicalApplicationStagesCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		medicalApplicationStagesCacheModel.stageName = getStageName();

		String stageName = medicalApplicationStagesCacheModel.stageName;

		if ((stageName != null) && (stageName.length() == 0)) {
			medicalApplicationStagesCacheModel.stageName = null;
		}

		medicalApplicationStagesCacheModel.duration = getDuration();

		String duration = medicalApplicationStagesCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			medicalApplicationStagesCacheModel.duration = null;
		}

		medicalApplicationStagesCacheModel.stageStatus = getStageStatus();

		String stageStatus = medicalApplicationStagesCacheModel.stageStatus;

		if ((stageStatus != null) && (stageStatus.length() == 0)) {
			medicalApplicationStagesCacheModel.stageStatus = null;
		}

		Date stageStartDate = getStageStartDate();

		if (stageStartDate != null) {
			medicalApplicationStagesCacheModel.stageStartDate =
				stageStartDate.getTime();
		}
		else {
			medicalApplicationStagesCacheModel.stageStartDate = Long.MIN_VALUE;
		}

		Date stageEndDate = getStageEndDate();

		if (stageEndDate != null) {
			medicalApplicationStagesCacheModel.stageEndDate =
				stageEndDate.getTime();
		}
		else {
			medicalApplicationStagesCacheModel.stageEndDate = Long.MIN_VALUE;
		}

		medicalApplicationStagesCacheModel.medicalApplicationId =
			getMedicalApplicationId();

		medicalApplicationStagesCacheModel.caseId = getCaseId();

		String caseId = medicalApplicationStagesCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			medicalApplicationStagesCacheModel.caseId = null;
		}

		medicalApplicationStagesCacheModel.updateBySource = getUpdateBySource();

		String updateBySource =
			medicalApplicationStagesCacheModel.updateBySource;

		if ((updateBySource != null) && (updateBySource.length() == 0)) {
			medicalApplicationStagesCacheModel.updateBySource = null;
		}

		return medicalApplicationStagesCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<MedicalApplicationStages, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<MedicalApplicationStages, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalApplicationStages, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(MedicalApplicationStages)this);

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
			<InvocationHandler, MedicalApplicationStages>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						MedicalApplicationStages.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _medicalStagesId;
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
	private long _medicalApplicationId;
	private String _caseId;
	private String _updateBySource;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<MedicalApplicationStages, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((MedicalApplicationStages)this);
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
		_columnOriginalValues.put("medicalStagesId", _medicalStagesId);
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
			"medicalApplicationId", _medicalApplicationId);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("updateBySource", _updateBySource);
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

		columnBitmasks.put("medicalStagesId", 2L);

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

		columnBitmasks.put("medicalApplicationId", 8192L);

		columnBitmasks.put("caseId", 16384L);

		columnBitmasks.put("updateBySource", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private MedicalApplicationStages _escapedModel;

}