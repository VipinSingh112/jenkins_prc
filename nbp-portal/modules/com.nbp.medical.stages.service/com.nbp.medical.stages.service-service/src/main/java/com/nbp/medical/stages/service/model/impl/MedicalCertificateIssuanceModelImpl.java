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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.medical.stages.service.model.MedicalCertificateIssuance;
import com.nbp.medical.stages.service.model.MedicalCertificateIssuanceModel;

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
 * The base model implementation for the MedicalCertificateIssuance service. Represents a row in the &quot;nbp_medical_licence_issu&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MedicalCertificateIssuanceModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalCertificateIssuanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCertificateIssuanceImpl
 * @generated
 */
@JSON(strict = true)
public class MedicalCertificateIssuanceModelImpl
	extends BaseModelImpl<MedicalCertificateIssuance>
	implements MedicalCertificateIssuanceModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical certificate issuance model instance should use the <code>MedicalCertificateIssuance</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_medical_licence_issu";

	public static final Object[][] TABLE_COLUMNS = {
		{"medicalCertificateIssuanceId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"caseId", Types.VARCHAR}, {"licenceNumber", Types.VARCHAR},
		{"status", Types.VARCHAR}, {"medicalCategory", Types.VARCHAR},
		{"dateOfLicIssuance", Types.TIMESTAMP},
		{"dateOfLicenseExpiration", Types.TIMESTAMP},
		{"docLicFileEntryId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("medicalCertificateIssuanceId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("licenceNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medicalCategory", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateOfLicIssuance", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dateOfLicenseExpiration", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("docLicFileEntryId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_medical_licence_issu (medicalCertificateIssuanceId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,caseId VARCHAR(75) null,licenceNumber VARCHAR(75) null,status VARCHAR(75) null,medicalCategory VARCHAR(75) null,dateOfLicIssuance DATE null,dateOfLicenseExpiration DATE null,docLicFileEntryId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_medical_licence_issu";

	public static final String ORDER_BY_JPQL =
		" ORDER BY medicalCertificateIssuance.medicalCertificateIssuanceId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_medical_licence_issu.medicalCertificateIssuanceId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CASEID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long MEDICALCERTIFICATEISSUANCEID_COLUMN_BITMASK = 2L;

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

	public MedicalCertificateIssuanceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _medicalCertificateIssuanceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMedicalCertificateIssuanceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _medicalCertificateIssuanceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MedicalCertificateIssuance.class;
	}

	@Override
	public String getModelClassName() {
		return MedicalCertificateIssuance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<MedicalCertificateIssuance, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<MedicalCertificateIssuance, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalCertificateIssuance, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(MedicalCertificateIssuance)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<MedicalCertificateIssuance, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<MedicalCertificateIssuance, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(MedicalCertificateIssuance)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<MedicalCertificateIssuance, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<MedicalCertificateIssuance, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<MedicalCertificateIssuance, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<MedicalCertificateIssuance, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<MedicalCertificateIssuance, Object>>();

			attributeGetterFunctions.put(
				"medicalCertificateIssuanceId",
				MedicalCertificateIssuance::getMedicalCertificateIssuanceId);
			attributeGetterFunctions.put(
				"groupId", MedicalCertificateIssuance::getGroupId);
			attributeGetterFunctions.put(
				"companyId", MedicalCertificateIssuance::getCompanyId);
			attributeGetterFunctions.put(
				"userId", MedicalCertificateIssuance::getUserId);
			attributeGetterFunctions.put(
				"userName", MedicalCertificateIssuance::getUserName);
			attributeGetterFunctions.put(
				"createDate", MedicalCertificateIssuance::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", MedicalCertificateIssuance::getModifiedDate);
			attributeGetterFunctions.put(
				"caseId", MedicalCertificateIssuance::getCaseId);
			attributeGetterFunctions.put(
				"licenceNumber", MedicalCertificateIssuance::getLicenceNumber);
			attributeGetterFunctions.put(
				"status", MedicalCertificateIssuance::getStatus);
			attributeGetterFunctions.put(
				"medicalCategory",
				MedicalCertificateIssuance::getMedicalCategory);
			attributeGetterFunctions.put(
				"dateOfLicIssuance",
				MedicalCertificateIssuance::getDateOfLicIssuance);
			attributeGetterFunctions.put(
				"dateOfLicenseExpiration",
				MedicalCertificateIssuance::getDateOfLicenseExpiration);
			attributeGetterFunctions.put(
				"docLicFileEntryId",
				MedicalCertificateIssuance::getDocLicFileEntryId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<MedicalCertificateIssuance, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<MedicalCertificateIssuance, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<MedicalCertificateIssuance, ?>>();

			attributeSetterBiConsumers.put(
				"medicalCertificateIssuanceId",
				(BiConsumer<MedicalCertificateIssuance, Long>)
					MedicalCertificateIssuance::
						setMedicalCertificateIssuanceId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<MedicalCertificateIssuance, Long>)
					MedicalCertificateIssuance::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<MedicalCertificateIssuance, Long>)
					MedicalCertificateIssuance::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<MedicalCertificateIssuance, Long>)
					MedicalCertificateIssuance::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<MedicalCertificateIssuance, String>)
					MedicalCertificateIssuance::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<MedicalCertificateIssuance, Date>)
					MedicalCertificateIssuance::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<MedicalCertificateIssuance, Date>)
					MedicalCertificateIssuance::setModifiedDate);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<MedicalCertificateIssuance, String>)
					MedicalCertificateIssuance::setCaseId);
			attributeSetterBiConsumers.put(
				"licenceNumber",
				(BiConsumer<MedicalCertificateIssuance, String>)
					MedicalCertificateIssuance::setLicenceNumber);
			attributeSetterBiConsumers.put(
				"status",
				(BiConsumer<MedicalCertificateIssuance, String>)
					MedicalCertificateIssuance::setStatus);
			attributeSetterBiConsumers.put(
				"medicalCategory",
				(BiConsumer<MedicalCertificateIssuance, String>)
					MedicalCertificateIssuance::setMedicalCategory);
			attributeSetterBiConsumers.put(
				"dateOfLicIssuance",
				(BiConsumer<MedicalCertificateIssuance, Date>)
					MedicalCertificateIssuance::setDateOfLicIssuance);
			attributeSetterBiConsumers.put(
				"dateOfLicenseExpiration",
				(BiConsumer<MedicalCertificateIssuance, Date>)
					MedicalCertificateIssuance::setDateOfLicenseExpiration);
			attributeSetterBiConsumers.put(
				"docLicFileEntryId",
				(BiConsumer<MedicalCertificateIssuance, Long>)
					MedicalCertificateIssuance::setDocLicFileEntryId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getMedicalCertificateIssuanceId() {
		return _medicalCertificateIssuanceId;
	}

	@Override
	public void setMedicalCertificateIssuanceId(
		long medicalCertificateIssuanceId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medicalCertificateIssuanceId = medicalCertificateIssuanceId;
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
	public String getLicenceNumber() {
		if (_licenceNumber == null) {
			return "";
		}
		else {
			return _licenceNumber;
		}
	}

	@Override
	public void setLicenceNumber(String licenceNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_licenceNumber = licenceNumber;
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

	@JSON
	@Override
	public String getMedicalCategory() {
		if (_medicalCategory == null) {
			return "";
		}
		else {
			return _medicalCategory;
		}
	}

	@Override
	public void setMedicalCategory(String medicalCategory) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medicalCategory = medicalCategory;
	}

	@JSON
	@Override
	public Date getDateOfLicIssuance() {
		return _dateOfLicIssuance;
	}

	@Override
	public void setDateOfLicIssuance(Date dateOfLicIssuance) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateOfLicIssuance = dateOfLicIssuance;
	}

	@JSON
	@Override
	public Date getDateOfLicenseExpiration() {
		return _dateOfLicenseExpiration;
	}

	@Override
	public void setDateOfLicenseExpiration(Date dateOfLicenseExpiration) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateOfLicenseExpiration = dateOfLicenseExpiration;
	}

	@JSON
	@Override
	public long getDocLicFileEntryId() {
		return _docLicFileEntryId;
	}

	@Override
	public void setDocLicFileEntryId(long docLicFileEntryId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_docLicFileEntryId = docLicFileEntryId;
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
			getCompanyId(), MedicalCertificateIssuance.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MedicalCertificateIssuance toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, MedicalCertificateIssuance>
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
		MedicalCertificateIssuanceImpl medicalCertificateIssuanceImpl =
			new MedicalCertificateIssuanceImpl();

		medicalCertificateIssuanceImpl.setMedicalCertificateIssuanceId(
			getMedicalCertificateIssuanceId());
		medicalCertificateIssuanceImpl.setGroupId(getGroupId());
		medicalCertificateIssuanceImpl.setCompanyId(getCompanyId());
		medicalCertificateIssuanceImpl.setUserId(getUserId());
		medicalCertificateIssuanceImpl.setUserName(getUserName());
		medicalCertificateIssuanceImpl.setCreateDate(getCreateDate());
		medicalCertificateIssuanceImpl.setModifiedDate(getModifiedDate());
		medicalCertificateIssuanceImpl.setCaseId(getCaseId());
		medicalCertificateIssuanceImpl.setLicenceNumber(getLicenceNumber());
		medicalCertificateIssuanceImpl.setStatus(getStatus());
		medicalCertificateIssuanceImpl.setMedicalCategory(getMedicalCategory());
		medicalCertificateIssuanceImpl.setDateOfLicIssuance(
			getDateOfLicIssuance());
		medicalCertificateIssuanceImpl.setDateOfLicenseExpiration(
			getDateOfLicenseExpiration());
		medicalCertificateIssuanceImpl.setDocLicFileEntryId(
			getDocLicFileEntryId());

		medicalCertificateIssuanceImpl.resetOriginalValues();

		return medicalCertificateIssuanceImpl;
	}

	@Override
	public MedicalCertificateIssuance cloneWithOriginalValues() {
		MedicalCertificateIssuanceImpl medicalCertificateIssuanceImpl =
			new MedicalCertificateIssuanceImpl();

		medicalCertificateIssuanceImpl.setMedicalCertificateIssuanceId(
			this.<Long>getColumnOriginalValue("medicalCertificateIssuanceId"));
		medicalCertificateIssuanceImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		medicalCertificateIssuanceImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		medicalCertificateIssuanceImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		medicalCertificateIssuanceImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		medicalCertificateIssuanceImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		medicalCertificateIssuanceImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		medicalCertificateIssuanceImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		medicalCertificateIssuanceImpl.setLicenceNumber(
			this.<String>getColumnOriginalValue("licenceNumber"));
		medicalCertificateIssuanceImpl.setStatus(
			this.<String>getColumnOriginalValue("status"));
		medicalCertificateIssuanceImpl.setMedicalCategory(
			this.<String>getColumnOriginalValue("medicalCategory"));
		medicalCertificateIssuanceImpl.setDateOfLicIssuance(
			this.<Date>getColumnOriginalValue("dateOfLicIssuance"));
		medicalCertificateIssuanceImpl.setDateOfLicenseExpiration(
			this.<Date>getColumnOriginalValue("dateOfLicenseExpiration"));
		medicalCertificateIssuanceImpl.setDocLicFileEntryId(
			this.<Long>getColumnOriginalValue("docLicFileEntryId"));

		return medicalCertificateIssuanceImpl;
	}

	@Override
	public int compareTo(
		MedicalCertificateIssuance medicalCertificateIssuance) {

		long primaryKey = medicalCertificateIssuance.getPrimaryKey();

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

		if (!(object instanceof MedicalCertificateIssuance)) {
			return false;
		}

		MedicalCertificateIssuance medicalCertificateIssuance =
			(MedicalCertificateIssuance)object;

		long primaryKey = medicalCertificateIssuance.getPrimaryKey();

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
	public CacheModel<MedicalCertificateIssuance> toCacheModel() {
		MedicalCertificateIssuanceCacheModel
			medicalCertificateIssuanceCacheModel =
				new MedicalCertificateIssuanceCacheModel();

		medicalCertificateIssuanceCacheModel.medicalCertificateIssuanceId =
			getMedicalCertificateIssuanceId();

		medicalCertificateIssuanceCacheModel.groupId = getGroupId();

		medicalCertificateIssuanceCacheModel.companyId = getCompanyId();

		medicalCertificateIssuanceCacheModel.userId = getUserId();

		medicalCertificateIssuanceCacheModel.userName = getUserName();

		String userName = medicalCertificateIssuanceCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			medicalCertificateIssuanceCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			medicalCertificateIssuanceCacheModel.createDate =
				createDate.getTime();
		}
		else {
			medicalCertificateIssuanceCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			medicalCertificateIssuanceCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			medicalCertificateIssuanceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		medicalCertificateIssuanceCacheModel.caseId = getCaseId();

		String caseId = medicalCertificateIssuanceCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			medicalCertificateIssuanceCacheModel.caseId = null;
		}

		medicalCertificateIssuanceCacheModel.licenceNumber = getLicenceNumber();

		String licenceNumber =
			medicalCertificateIssuanceCacheModel.licenceNumber;

		if ((licenceNumber != null) && (licenceNumber.length() == 0)) {
			medicalCertificateIssuanceCacheModel.licenceNumber = null;
		}

		medicalCertificateIssuanceCacheModel.status = getStatus();

		String status = medicalCertificateIssuanceCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			medicalCertificateIssuanceCacheModel.status = null;
		}

		medicalCertificateIssuanceCacheModel.medicalCategory =
			getMedicalCategory();

		String medicalCategory =
			medicalCertificateIssuanceCacheModel.medicalCategory;

		if ((medicalCategory != null) && (medicalCategory.length() == 0)) {
			medicalCertificateIssuanceCacheModel.medicalCategory = null;
		}

		Date dateOfLicIssuance = getDateOfLicIssuance();

		if (dateOfLicIssuance != null) {
			medicalCertificateIssuanceCacheModel.dateOfLicIssuance =
				dateOfLicIssuance.getTime();
		}
		else {
			medicalCertificateIssuanceCacheModel.dateOfLicIssuance =
				Long.MIN_VALUE;
		}

		Date dateOfLicenseExpiration = getDateOfLicenseExpiration();

		if (dateOfLicenseExpiration != null) {
			medicalCertificateIssuanceCacheModel.dateOfLicenseExpiration =
				dateOfLicenseExpiration.getTime();
		}
		else {
			medicalCertificateIssuanceCacheModel.dateOfLicenseExpiration =
				Long.MIN_VALUE;
		}

		medicalCertificateIssuanceCacheModel.docLicFileEntryId =
			getDocLicFileEntryId();

		return medicalCertificateIssuanceCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<MedicalCertificateIssuance, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<MedicalCertificateIssuance, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalCertificateIssuance, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(MedicalCertificateIssuance)this);

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
			<InvocationHandler, MedicalCertificateIssuance>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						MedicalCertificateIssuance.class, ModelWrapper.class);

	}

	private long _medicalCertificateIssuanceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _caseId;
	private String _licenceNumber;
	private String _status;
	private String _medicalCategory;
	private Date _dateOfLicIssuance;
	private Date _dateOfLicenseExpiration;
	private long _docLicFileEntryId;

	public <T> T getColumnValue(String columnName) {
		Function<MedicalCertificateIssuance, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((MedicalCertificateIssuance)this);
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
			"medicalCertificateIssuanceId", _medicalCertificateIssuanceId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("licenceNumber", _licenceNumber);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("medicalCategory", _medicalCategory);
		_columnOriginalValues.put("dateOfLicIssuance", _dateOfLicIssuance);
		_columnOriginalValues.put(
			"dateOfLicenseExpiration", _dateOfLicenseExpiration);
		_columnOriginalValues.put("docLicFileEntryId", _docLicFileEntryId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("medicalCertificateIssuanceId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("caseId", 128L);

		columnBitmasks.put("licenceNumber", 256L);

		columnBitmasks.put("status", 512L);

		columnBitmasks.put("medicalCategory", 1024L);

		columnBitmasks.put("dateOfLicIssuance", 2048L);

		columnBitmasks.put("dateOfLicenseExpiration", 4096L);

		columnBitmasks.put("docLicFileEntryId", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private MedicalCertificateIssuance _escapedModel;

}