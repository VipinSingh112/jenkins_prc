/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.model.impl;

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

import com.nbp.ncra.stages.services.model.NcraApplicationStages;
import com.nbp.ncra.stages.services.model.NcraApplicationStagesModel;

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
 * The base model implementation for the NcraApplicationStages service. Represents a row in the &quot;nbp_ncra_stage_appli&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>NcraApplicationStagesModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcraApplicationStagesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationStagesImpl
 * @generated
 */
@JSON(strict = true)
public class NcraApplicationStagesModelImpl
	extends BaseModelImpl<NcraApplicationStages>
	implements NcraApplicationStagesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncra application stages model instance should use the <code>NcraApplicationStages</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_ncra_stage_appli";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"ncraApplciationStage", Types.BIGINT},
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
		TABLE_COLUMNS_MAP.put("ncraApplciationStage", Types.BIGINT);
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
		"create table nbp_ncra_stage_appli (uuid_ VARCHAR(75) null,ncraApplciationStage LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,stageName VARCHAR(75) null,stageEndDate DATE null,stageStartDate DATE null,duration VARCHAR(75) null,stageStatus VARCHAR(75) null,caseId VARCHAR(75) null,updatedBySource VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_ncra_stage_appli";

	public static final String ORDER_BY_JPQL =
		" ORDER BY ncraApplicationStages.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_ncra_stage_appli.createDate DESC";

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

	public NcraApplicationStagesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ncraApplciationStage;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNcraApplciationStage(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ncraApplciationStage;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return NcraApplicationStages.class;
	}

	@Override
	public String getModelClassName() {
		return NcraApplicationStages.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<NcraApplicationStages, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<NcraApplicationStages, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcraApplicationStages, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((NcraApplicationStages)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<NcraApplicationStages, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<NcraApplicationStages, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(NcraApplicationStages)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<NcraApplicationStages, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<NcraApplicationStages, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<NcraApplicationStages, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<NcraApplicationStages, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<NcraApplicationStages, Object>>();

			attributeGetterFunctions.put(
				"uuid", NcraApplicationStages::getUuid);
			attributeGetterFunctions.put(
				"ncraApplciationStage",
				NcraApplicationStages::getNcraApplciationStage);
			attributeGetterFunctions.put(
				"groupId", NcraApplicationStages::getGroupId);
			attributeGetterFunctions.put(
				"companyId", NcraApplicationStages::getCompanyId);
			attributeGetterFunctions.put(
				"userId", NcraApplicationStages::getUserId);
			attributeGetterFunctions.put(
				"userName", NcraApplicationStages::getUserName);
			attributeGetterFunctions.put(
				"createDate", NcraApplicationStages::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", NcraApplicationStages::getModifiedDate);
			attributeGetterFunctions.put(
				"stageName", NcraApplicationStages::getStageName);
			attributeGetterFunctions.put(
				"stageEndDate", NcraApplicationStages::getStageEndDate);
			attributeGetterFunctions.put(
				"stageStartDate", NcraApplicationStages::getStageStartDate);
			attributeGetterFunctions.put(
				"duration", NcraApplicationStages::getDuration);
			attributeGetterFunctions.put(
				"stageStatus", NcraApplicationStages::getStageStatus);
			attributeGetterFunctions.put(
				"caseId", NcraApplicationStages::getCaseId);
			attributeGetterFunctions.put(
				"updatedBySource", NcraApplicationStages::getUpdatedBySource);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<NcraApplicationStages, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<NcraApplicationStages, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<NcraApplicationStages, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<NcraApplicationStages, String>)
					NcraApplicationStages::setUuid);
			attributeSetterBiConsumers.put(
				"ncraApplciationStage",
				(BiConsumer<NcraApplicationStages, Long>)
					NcraApplicationStages::setNcraApplciationStage);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<NcraApplicationStages, Long>)
					NcraApplicationStages::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<NcraApplicationStages, Long>)
					NcraApplicationStages::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<NcraApplicationStages, Long>)
					NcraApplicationStages::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<NcraApplicationStages, String>)
					NcraApplicationStages::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<NcraApplicationStages, Date>)
					NcraApplicationStages::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<NcraApplicationStages, Date>)
					NcraApplicationStages::setModifiedDate);
			attributeSetterBiConsumers.put(
				"stageName",
				(BiConsumer<NcraApplicationStages, String>)
					NcraApplicationStages::setStageName);
			attributeSetterBiConsumers.put(
				"stageEndDate",
				(BiConsumer<NcraApplicationStages, Date>)
					NcraApplicationStages::setStageEndDate);
			attributeSetterBiConsumers.put(
				"stageStartDate",
				(BiConsumer<NcraApplicationStages, Date>)
					NcraApplicationStages::setStageStartDate);
			attributeSetterBiConsumers.put(
				"duration",
				(BiConsumer<NcraApplicationStages, String>)
					NcraApplicationStages::setDuration);
			attributeSetterBiConsumers.put(
				"stageStatus",
				(BiConsumer<NcraApplicationStages, String>)
					NcraApplicationStages::setStageStatus);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<NcraApplicationStages, String>)
					NcraApplicationStages::setCaseId);
			attributeSetterBiConsumers.put(
				"updatedBySource",
				(BiConsumer<NcraApplicationStages, String>)
					NcraApplicationStages::setUpdatedBySource);

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
	public long getNcraApplciationStage() {
		return _ncraApplciationStage;
	}

	@Override
	public void setNcraApplciationStage(long ncraApplciationStage) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ncraApplciationStage = ncraApplciationStage;
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
			PortalUtil.getClassNameId(NcraApplicationStages.class.getName()));
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
			getCompanyId(), NcraApplicationStages.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NcraApplicationStages toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, NcraApplicationStages>
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
		NcraApplicationStagesImpl ncraApplicationStagesImpl =
			new NcraApplicationStagesImpl();

		ncraApplicationStagesImpl.setUuid(getUuid());
		ncraApplicationStagesImpl.setNcraApplciationStage(
			getNcraApplciationStage());
		ncraApplicationStagesImpl.setGroupId(getGroupId());
		ncraApplicationStagesImpl.setCompanyId(getCompanyId());
		ncraApplicationStagesImpl.setUserId(getUserId());
		ncraApplicationStagesImpl.setUserName(getUserName());
		ncraApplicationStagesImpl.setCreateDate(getCreateDate());
		ncraApplicationStagesImpl.setModifiedDate(getModifiedDate());
		ncraApplicationStagesImpl.setStageName(getStageName());
		ncraApplicationStagesImpl.setStageEndDate(getStageEndDate());
		ncraApplicationStagesImpl.setStageStartDate(getStageStartDate());
		ncraApplicationStagesImpl.setDuration(getDuration());
		ncraApplicationStagesImpl.setStageStatus(getStageStatus());
		ncraApplicationStagesImpl.setCaseId(getCaseId());
		ncraApplicationStagesImpl.setUpdatedBySource(getUpdatedBySource());

		ncraApplicationStagesImpl.resetOriginalValues();

		return ncraApplicationStagesImpl;
	}

	@Override
	public NcraApplicationStages cloneWithOriginalValues() {
		NcraApplicationStagesImpl ncraApplicationStagesImpl =
			new NcraApplicationStagesImpl();

		ncraApplicationStagesImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		ncraApplicationStagesImpl.setNcraApplciationStage(
			this.<Long>getColumnOriginalValue("ncraApplciationStage"));
		ncraApplicationStagesImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		ncraApplicationStagesImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		ncraApplicationStagesImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		ncraApplicationStagesImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		ncraApplicationStagesImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		ncraApplicationStagesImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		ncraApplicationStagesImpl.setStageName(
			this.<String>getColumnOriginalValue("stageName"));
		ncraApplicationStagesImpl.setStageEndDate(
			this.<Date>getColumnOriginalValue("stageEndDate"));
		ncraApplicationStagesImpl.setStageStartDate(
			this.<Date>getColumnOriginalValue("stageStartDate"));
		ncraApplicationStagesImpl.setDuration(
			this.<String>getColumnOriginalValue("duration"));
		ncraApplicationStagesImpl.setStageStatus(
			this.<String>getColumnOriginalValue("stageStatus"));
		ncraApplicationStagesImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		ncraApplicationStagesImpl.setUpdatedBySource(
			this.<String>getColumnOriginalValue("updatedBySource"));

		return ncraApplicationStagesImpl;
	}

	@Override
	public int compareTo(NcraApplicationStages ncraApplicationStages) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), ncraApplicationStages.getCreateDate());

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

		if (!(object instanceof NcraApplicationStages)) {
			return false;
		}

		NcraApplicationStages ncraApplicationStages =
			(NcraApplicationStages)object;

		long primaryKey = ncraApplicationStages.getPrimaryKey();

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
	public CacheModel<NcraApplicationStages> toCacheModel() {
		NcraApplicationStagesCacheModel ncraApplicationStagesCacheModel =
			new NcraApplicationStagesCacheModel();

		ncraApplicationStagesCacheModel.uuid = getUuid();

		String uuid = ncraApplicationStagesCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			ncraApplicationStagesCacheModel.uuid = null;
		}

		ncraApplicationStagesCacheModel.ncraApplciationStage =
			getNcraApplciationStage();

		ncraApplicationStagesCacheModel.groupId = getGroupId();

		ncraApplicationStagesCacheModel.companyId = getCompanyId();

		ncraApplicationStagesCacheModel.userId = getUserId();

		ncraApplicationStagesCacheModel.userName = getUserName();

		String userName = ncraApplicationStagesCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ncraApplicationStagesCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ncraApplicationStagesCacheModel.createDate = createDate.getTime();
		}
		else {
			ncraApplicationStagesCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ncraApplicationStagesCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			ncraApplicationStagesCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ncraApplicationStagesCacheModel.stageName = getStageName();

		String stageName = ncraApplicationStagesCacheModel.stageName;

		if ((stageName != null) && (stageName.length() == 0)) {
			ncraApplicationStagesCacheModel.stageName = null;
		}

		Date stageEndDate = getStageEndDate();

		if (stageEndDate != null) {
			ncraApplicationStagesCacheModel.stageEndDate =
				stageEndDate.getTime();
		}
		else {
			ncraApplicationStagesCacheModel.stageEndDate = Long.MIN_VALUE;
		}

		Date stageStartDate = getStageStartDate();

		if (stageStartDate != null) {
			ncraApplicationStagesCacheModel.stageStartDate =
				stageStartDate.getTime();
		}
		else {
			ncraApplicationStagesCacheModel.stageStartDate = Long.MIN_VALUE;
		}

		ncraApplicationStagesCacheModel.duration = getDuration();

		String duration = ncraApplicationStagesCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			ncraApplicationStagesCacheModel.duration = null;
		}

		ncraApplicationStagesCacheModel.stageStatus = getStageStatus();

		String stageStatus = ncraApplicationStagesCacheModel.stageStatus;

		if ((stageStatus != null) && (stageStatus.length() == 0)) {
			ncraApplicationStagesCacheModel.stageStatus = null;
		}

		ncraApplicationStagesCacheModel.caseId = getCaseId();

		String caseId = ncraApplicationStagesCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			ncraApplicationStagesCacheModel.caseId = null;
		}

		ncraApplicationStagesCacheModel.updatedBySource = getUpdatedBySource();

		String updatedBySource =
			ncraApplicationStagesCacheModel.updatedBySource;

		if ((updatedBySource != null) && (updatedBySource.length() == 0)) {
			ncraApplicationStagesCacheModel.updatedBySource = null;
		}

		return ncraApplicationStagesCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<NcraApplicationStages, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<NcraApplicationStages, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcraApplicationStages, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(NcraApplicationStages)this);

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

		private static final Function<InvocationHandler, NcraApplicationStages>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					NcraApplicationStages.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _ncraApplciationStage;
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

		Function<NcraApplicationStages, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((NcraApplicationStages)this);
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
			"ncraApplciationStage", _ncraApplciationStage);
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

		columnBitmasks.put("ncraApplciationStage", 2L);

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
	private NcraApplicationStages _escapedModel;

}