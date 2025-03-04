/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.model.impl;

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

import com.nbp.medical.stages.service.model.MedicalFacilitiesInspection;
import com.nbp.medical.stages.service.model.MedicalFacilitiesInspectionModel;

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
 * The base model implementation for the MedicalFacilitiesInspection service. Represents a row in the &quot;nbp_medical_inspection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MedicalFacilitiesInspectionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalFacilitiesInspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesInspectionImpl
 * @generated
 */
@JSON(strict = true)
public class MedicalFacilitiesInspectionModelImpl
	extends BaseModelImpl<MedicalFacilitiesInspection>
	implements MedicalFacilitiesInspectionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical facilities inspection model instance should use the <code>MedicalFacilitiesInspection</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_medical_inspection";

	public static final Object[][] TABLE_COLUMNS = {
		{"medicalInspectionId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"caseId", Types.VARCHAR},
		{"dateOfInspection", Types.TIMESTAMP},
		{"timeOfInspection", Types.VARCHAR}, {"location", Types.VARCHAR},
		{"status", Types.VARCHAR}, {"medicalApplicationId", Types.BIGINT},
		{"slotBookedByUser", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("medicalInspectionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateOfInspection", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("timeOfInspection", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("location", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medicalApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("slotBookedByUser", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_medical_inspection (medicalInspectionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,caseId VARCHAR(75) null,dateOfInspection DATE null,timeOfInspection VARCHAR(75) null,location VARCHAR(75) null,status VARCHAR(75) null,medicalApplicationId LONG,slotBookedByUser LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_medical_inspection";

	public static final String ORDER_BY_JPQL =
		" ORDER BY medicalFacilitiesInspection.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_medical_inspection.createDate DESC";

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
	public static final long MEDICALAPPLICATIONID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long SLOTBOOKEDBYUSER_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STATUS_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 16L;

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

	public MedicalFacilitiesInspectionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _medicalInspectionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMedicalInspectionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _medicalInspectionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MedicalFacilitiesInspection.class;
	}

	@Override
	public String getModelClassName() {
		return MedicalFacilitiesInspection.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<MedicalFacilitiesInspection, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<MedicalFacilitiesInspection, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalFacilitiesInspection, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(MedicalFacilitiesInspection)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<MedicalFacilitiesInspection, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<MedicalFacilitiesInspection, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(MedicalFacilitiesInspection)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<MedicalFacilitiesInspection, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<MedicalFacilitiesInspection, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<MedicalFacilitiesInspection, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<MedicalFacilitiesInspection, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<MedicalFacilitiesInspection, Object>>();

			attributeGetterFunctions.put(
				"medicalInspectionId",
				MedicalFacilitiesInspection::getMedicalInspectionId);
			attributeGetterFunctions.put(
				"groupId", MedicalFacilitiesInspection::getGroupId);
			attributeGetterFunctions.put(
				"companyId", MedicalFacilitiesInspection::getCompanyId);
			attributeGetterFunctions.put(
				"userId", MedicalFacilitiesInspection::getUserId);
			attributeGetterFunctions.put(
				"userName", MedicalFacilitiesInspection::getUserName);
			attributeGetterFunctions.put(
				"createDate", MedicalFacilitiesInspection::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", MedicalFacilitiesInspection::getModifiedDate);
			attributeGetterFunctions.put(
				"caseId", MedicalFacilitiesInspection::getCaseId);
			attributeGetterFunctions.put(
				"dateOfInspection",
				MedicalFacilitiesInspection::getDateOfInspection);
			attributeGetterFunctions.put(
				"timeOfInspection",
				MedicalFacilitiesInspection::getTimeOfInspection);
			attributeGetterFunctions.put(
				"location", MedicalFacilitiesInspection::getLocation);
			attributeGetterFunctions.put(
				"status", MedicalFacilitiesInspection::getStatus);
			attributeGetterFunctions.put(
				"medicalApplicationId",
				MedicalFacilitiesInspection::getMedicalApplicationId);
			attributeGetterFunctions.put(
				"slotBookedByUser",
				MedicalFacilitiesInspection::getSlotBookedByUser);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<MedicalFacilitiesInspection, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<MedicalFacilitiesInspection, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<MedicalFacilitiesInspection, ?>>();

			attributeSetterBiConsumers.put(
				"medicalInspectionId",
				(BiConsumer<MedicalFacilitiesInspection, Long>)
					MedicalFacilitiesInspection::setMedicalInspectionId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<MedicalFacilitiesInspection, Long>)
					MedicalFacilitiesInspection::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<MedicalFacilitiesInspection, Long>)
					MedicalFacilitiesInspection::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<MedicalFacilitiesInspection, Long>)
					MedicalFacilitiesInspection::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<MedicalFacilitiesInspection, String>)
					MedicalFacilitiesInspection::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<MedicalFacilitiesInspection, Date>)
					MedicalFacilitiesInspection::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<MedicalFacilitiesInspection, Date>)
					MedicalFacilitiesInspection::setModifiedDate);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<MedicalFacilitiesInspection, String>)
					MedicalFacilitiesInspection::setCaseId);
			attributeSetterBiConsumers.put(
				"dateOfInspection",
				(BiConsumer<MedicalFacilitiesInspection, Date>)
					MedicalFacilitiesInspection::setDateOfInspection);
			attributeSetterBiConsumers.put(
				"timeOfInspection",
				(BiConsumer<MedicalFacilitiesInspection, String>)
					MedicalFacilitiesInspection::setTimeOfInspection);
			attributeSetterBiConsumers.put(
				"location",
				(BiConsumer<MedicalFacilitiesInspection, String>)
					MedicalFacilitiesInspection::setLocation);
			attributeSetterBiConsumers.put(
				"status",
				(BiConsumer<MedicalFacilitiesInspection, String>)
					MedicalFacilitiesInspection::setStatus);
			attributeSetterBiConsumers.put(
				"medicalApplicationId",
				(BiConsumer<MedicalFacilitiesInspection, Long>)
					MedicalFacilitiesInspection::setMedicalApplicationId);
			attributeSetterBiConsumers.put(
				"slotBookedByUser",
				(BiConsumer<MedicalFacilitiesInspection, Long>)
					MedicalFacilitiesInspection::setSlotBookedByUser);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getMedicalInspectionId() {
		return _medicalInspectionId;
	}

	@Override
	public void setMedicalInspectionId(long medicalInspectionId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medicalInspectionId = medicalInspectionId;
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
	public Date getDateOfInspection() {
		return _dateOfInspection;
	}

	@Override
	public void setDateOfInspection(Date dateOfInspection) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateOfInspection = dateOfInspection;
	}

	@JSON
	@Override
	public String getTimeOfInspection() {
		if (_timeOfInspection == null) {
			return "";
		}
		else {
			return _timeOfInspection;
		}
	}

	@Override
	public void setTimeOfInspection(String timeOfInspection) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_timeOfInspection = timeOfInspection;
	}

	@JSON
	@Override
	public String getLocation() {
		if (_location == null) {
			return "";
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_location = location;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return "";
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_status = status;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalStatus() {
		return getColumnOriginalValue("status");
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
	public long getSlotBookedByUser() {
		return _slotBookedByUser;
	}

	@Override
	public void setSlotBookedByUser(long slotBookedByUser) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_slotBookedByUser = slotBookedByUser;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalSlotBookedByUser() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("slotBookedByUser"));
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
			getCompanyId(), MedicalFacilitiesInspection.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MedicalFacilitiesInspection toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, MedicalFacilitiesInspection>
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
		MedicalFacilitiesInspectionImpl medicalFacilitiesInspectionImpl =
			new MedicalFacilitiesInspectionImpl();

		medicalFacilitiesInspectionImpl.setMedicalInspectionId(
			getMedicalInspectionId());
		medicalFacilitiesInspectionImpl.setGroupId(getGroupId());
		medicalFacilitiesInspectionImpl.setCompanyId(getCompanyId());
		medicalFacilitiesInspectionImpl.setUserId(getUserId());
		medicalFacilitiesInspectionImpl.setUserName(getUserName());
		medicalFacilitiesInspectionImpl.setCreateDate(getCreateDate());
		medicalFacilitiesInspectionImpl.setModifiedDate(getModifiedDate());
		medicalFacilitiesInspectionImpl.setCaseId(getCaseId());
		medicalFacilitiesInspectionImpl.setDateOfInspection(
			getDateOfInspection());
		medicalFacilitiesInspectionImpl.setTimeOfInspection(
			getTimeOfInspection());
		medicalFacilitiesInspectionImpl.setLocation(getLocation());
		medicalFacilitiesInspectionImpl.setStatus(getStatus());
		medicalFacilitiesInspectionImpl.setMedicalApplicationId(
			getMedicalApplicationId());
		medicalFacilitiesInspectionImpl.setSlotBookedByUser(
			getSlotBookedByUser());

		medicalFacilitiesInspectionImpl.resetOriginalValues();

		return medicalFacilitiesInspectionImpl;
	}

	@Override
	public MedicalFacilitiesInspection cloneWithOriginalValues() {
		MedicalFacilitiesInspectionImpl medicalFacilitiesInspectionImpl =
			new MedicalFacilitiesInspectionImpl();

		medicalFacilitiesInspectionImpl.setMedicalInspectionId(
			this.<Long>getColumnOriginalValue("medicalInspectionId"));
		medicalFacilitiesInspectionImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		medicalFacilitiesInspectionImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		medicalFacilitiesInspectionImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		medicalFacilitiesInspectionImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		medicalFacilitiesInspectionImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		medicalFacilitiesInspectionImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		medicalFacilitiesInspectionImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		medicalFacilitiesInspectionImpl.setDateOfInspection(
			this.<Date>getColumnOriginalValue("dateOfInspection"));
		medicalFacilitiesInspectionImpl.setTimeOfInspection(
			this.<String>getColumnOriginalValue("timeOfInspection"));
		medicalFacilitiesInspectionImpl.setLocation(
			this.<String>getColumnOriginalValue("location"));
		medicalFacilitiesInspectionImpl.setStatus(
			this.<String>getColumnOriginalValue("status"));
		medicalFacilitiesInspectionImpl.setMedicalApplicationId(
			this.<Long>getColumnOriginalValue("medicalApplicationId"));
		medicalFacilitiesInspectionImpl.setSlotBookedByUser(
			this.<Long>getColumnOriginalValue("slotBookedByUser"));

		return medicalFacilitiesInspectionImpl;
	}

	@Override
	public int compareTo(
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), medicalFacilitiesInspection.getCreateDate());

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

		if (!(object instanceof MedicalFacilitiesInspection)) {
			return false;
		}

		MedicalFacilitiesInspection medicalFacilitiesInspection =
			(MedicalFacilitiesInspection)object;

		long primaryKey = medicalFacilitiesInspection.getPrimaryKey();

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
	public CacheModel<MedicalFacilitiesInspection> toCacheModel() {
		MedicalFacilitiesInspectionCacheModel
			medicalFacilitiesInspectionCacheModel =
				new MedicalFacilitiesInspectionCacheModel();

		medicalFacilitiesInspectionCacheModel.medicalInspectionId =
			getMedicalInspectionId();

		medicalFacilitiesInspectionCacheModel.groupId = getGroupId();

		medicalFacilitiesInspectionCacheModel.companyId = getCompanyId();

		medicalFacilitiesInspectionCacheModel.userId = getUserId();

		medicalFacilitiesInspectionCacheModel.userName = getUserName();

		String userName = medicalFacilitiesInspectionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			medicalFacilitiesInspectionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			medicalFacilitiesInspectionCacheModel.createDate =
				createDate.getTime();
		}
		else {
			medicalFacilitiesInspectionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			medicalFacilitiesInspectionCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			medicalFacilitiesInspectionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		medicalFacilitiesInspectionCacheModel.caseId = getCaseId();

		String caseId = medicalFacilitiesInspectionCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			medicalFacilitiesInspectionCacheModel.caseId = null;
		}

		Date dateOfInspection = getDateOfInspection();

		if (dateOfInspection != null) {
			medicalFacilitiesInspectionCacheModel.dateOfInspection =
				dateOfInspection.getTime();
		}
		else {
			medicalFacilitiesInspectionCacheModel.dateOfInspection =
				Long.MIN_VALUE;
		}

		medicalFacilitiesInspectionCacheModel.timeOfInspection =
			getTimeOfInspection();

		String timeOfInspection =
			medicalFacilitiesInspectionCacheModel.timeOfInspection;

		if ((timeOfInspection != null) && (timeOfInspection.length() == 0)) {
			medicalFacilitiesInspectionCacheModel.timeOfInspection = null;
		}

		medicalFacilitiesInspectionCacheModel.location = getLocation();

		String location = medicalFacilitiesInspectionCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			medicalFacilitiesInspectionCacheModel.location = null;
		}

		medicalFacilitiesInspectionCacheModel.status = getStatus();

		String status = medicalFacilitiesInspectionCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			medicalFacilitiesInspectionCacheModel.status = null;
		}

		medicalFacilitiesInspectionCacheModel.medicalApplicationId =
			getMedicalApplicationId();

		medicalFacilitiesInspectionCacheModel.slotBookedByUser =
			getSlotBookedByUser();

		return medicalFacilitiesInspectionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<MedicalFacilitiesInspection, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<MedicalFacilitiesInspection, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalFacilitiesInspection, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(MedicalFacilitiesInspection)this);

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
			<InvocationHandler, MedicalFacilitiesInspection>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						MedicalFacilitiesInspection.class, ModelWrapper.class);

	}

	private long _medicalInspectionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _caseId;
	private Date _dateOfInspection;
	private String _timeOfInspection;
	private String _location;
	private String _status;
	private long _medicalApplicationId;
	private long _slotBookedByUser;

	public <T> T getColumnValue(String columnName) {
		Function<MedicalFacilitiesInspection, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((MedicalFacilitiesInspection)this);
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

		_columnOriginalValues.put("medicalInspectionId", _medicalInspectionId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("dateOfInspection", _dateOfInspection);
		_columnOriginalValues.put("timeOfInspection", _timeOfInspection);
		_columnOriginalValues.put("location", _location);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put(
			"medicalApplicationId", _medicalApplicationId);
		_columnOriginalValues.put("slotBookedByUser", _slotBookedByUser);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("medicalInspectionId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("caseId", 128L);

		columnBitmasks.put("dateOfInspection", 256L);

		columnBitmasks.put("timeOfInspection", 512L);

		columnBitmasks.put("location", 1024L);

		columnBitmasks.put("status", 2048L);

		columnBitmasks.put("medicalApplicationId", 4096L);

		columnBitmasks.put("slotBookedByUser", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private MedicalFacilitiesInspection _escapedModel;

}