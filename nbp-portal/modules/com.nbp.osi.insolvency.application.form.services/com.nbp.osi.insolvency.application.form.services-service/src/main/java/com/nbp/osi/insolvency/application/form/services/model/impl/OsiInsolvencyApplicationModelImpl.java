/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

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

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplicationModel;

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
 * The base model implementation for the OsiInsolvencyApplication service. Represents a row in the &quot;nbp_osi_insolv_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OsiInsolvencyApplicationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiInsolvencyApplicationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationImpl
 * @generated
 */
@JSON(strict = true)
public class OsiInsolvencyApplicationModelImpl
	extends BaseModelImpl<OsiInsolvencyApplication>
	implements OsiInsolvencyApplicationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi insolvency application model instance should use the <code>OsiInsolvencyApplication</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_insolv_application";

	public static final Object[][] TABLE_COLUMNS = {
		{"osiInsolvencyId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"entityId", Types.VARCHAR},
		{"applicantStatus", Types.VARCHAR}, {"typeOfApplicant", Types.VARCHAR},
		{"subjectData", Types.VARCHAR}, {"applicantIndividual", Types.VARCHAR},
		{"applicantCompany", Types.VARCHAR}, {"realEstateBoard", Types.VARCHAR},
		{"caseId", Types.VARCHAR}, {"status", Types.INTEGER},
		{"icmDocumentPath", Types.VARCHAR},
		{"applicationNumber", Types.VARCHAR}, {"pdfFileEntryId", Types.BIGINT},
		{"appCurrentStageName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("osiInsolvencyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("entityId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicantStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("typeOfApplicant", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subjectData", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicantIndividual", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicantCompany", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("realEstateBoard", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("icmDocumentPath", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicationNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pdfFileEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("appCurrentStageName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_insolv_application (osiInsolvencyId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,entityId VARCHAR(75) null,applicantStatus VARCHAR(75) null,typeOfApplicant VARCHAR(75) null,subjectData VARCHAR(75) null,applicantIndividual VARCHAR(75) null,applicantCompany VARCHAR(75) null,realEstateBoard VARCHAR(75) null,caseId VARCHAR(500) null,status INTEGER,icmDocumentPath VARCHAR(500) null,applicationNumber VARCHAR(75) null,pdfFileEntryId LONG,appCurrentStageName VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_insolv_application";

	public static final String ORDER_BY_JPQL =
		" ORDER BY osiInsolvencyApplication.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_insolv_application.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long APPLICANTSTATUS_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long APPLICATIONNUMBER_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CASEID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long OSIINSOLVENCYID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STATUS_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long USERID_COLUMN_BITMASK = 32L;

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

	public OsiInsolvencyApplicationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _osiInsolvencyId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOsiInsolvencyId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _osiInsolvencyId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OsiInsolvencyApplication.class;
	}

	@Override
	public String getModelClassName() {
		return OsiInsolvencyApplication.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<OsiInsolvencyApplication, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<OsiInsolvencyApplication, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiInsolvencyApplication, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((OsiInsolvencyApplication)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OsiInsolvencyApplication, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OsiInsolvencyApplication, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(OsiInsolvencyApplication)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OsiInsolvencyApplication, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OsiInsolvencyApplication, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<OsiInsolvencyApplication, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<OsiInsolvencyApplication, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<OsiInsolvencyApplication, Object>>();

			attributeGetterFunctions.put(
				"osiInsolvencyId",
				OsiInsolvencyApplication::getOsiInsolvencyId);
			attributeGetterFunctions.put(
				"groupId", OsiInsolvencyApplication::getGroupId);
			attributeGetterFunctions.put(
				"companyId", OsiInsolvencyApplication::getCompanyId);
			attributeGetterFunctions.put(
				"userId", OsiInsolvencyApplication::getUserId);
			attributeGetterFunctions.put(
				"userName", OsiInsolvencyApplication::getUserName);
			attributeGetterFunctions.put(
				"createDate", OsiInsolvencyApplication::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", OsiInsolvencyApplication::getModifiedDate);
			attributeGetterFunctions.put(
				"entityId", OsiInsolvencyApplication::getEntityId);
			attributeGetterFunctions.put(
				"applicantStatus",
				OsiInsolvencyApplication::getApplicantStatus);
			attributeGetterFunctions.put(
				"typeOfApplicant",
				OsiInsolvencyApplication::getTypeOfApplicant);
			attributeGetterFunctions.put(
				"subjectData", OsiInsolvencyApplication::getSubjectData);
			attributeGetterFunctions.put(
				"applicantIndividual",
				OsiInsolvencyApplication::getApplicantIndividual);
			attributeGetterFunctions.put(
				"applicantCompany",
				OsiInsolvencyApplication::getApplicantCompany);
			attributeGetterFunctions.put(
				"realEstateBoard",
				OsiInsolvencyApplication::getRealEstateBoard);
			attributeGetterFunctions.put(
				"caseId", OsiInsolvencyApplication::getCaseId);
			attributeGetterFunctions.put(
				"status", OsiInsolvencyApplication::getStatus);
			attributeGetterFunctions.put(
				"icmDocumentPath",
				OsiInsolvencyApplication::getIcmDocumentPath);
			attributeGetterFunctions.put(
				"applicationNumber",
				OsiInsolvencyApplication::getApplicationNumber);
			attributeGetterFunctions.put(
				"pdfFileEntryId", OsiInsolvencyApplication::getPdfFileEntryId);
			attributeGetterFunctions.put(
				"appCurrentStageName",
				OsiInsolvencyApplication::getAppCurrentStageName);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<OsiInsolvencyApplication, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<OsiInsolvencyApplication, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<OsiInsolvencyApplication, ?>>();

			attributeSetterBiConsumers.put(
				"osiInsolvencyId",
				(BiConsumer<OsiInsolvencyApplication, Long>)
					OsiInsolvencyApplication::setOsiInsolvencyId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<OsiInsolvencyApplication, Long>)
					OsiInsolvencyApplication::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<OsiInsolvencyApplication, Long>)
					OsiInsolvencyApplication::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<OsiInsolvencyApplication, Long>)
					OsiInsolvencyApplication::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<OsiInsolvencyApplication, Date>)
					OsiInsolvencyApplication::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<OsiInsolvencyApplication, Date>)
					OsiInsolvencyApplication::setModifiedDate);
			attributeSetterBiConsumers.put(
				"entityId",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setEntityId);
			attributeSetterBiConsumers.put(
				"applicantStatus",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setApplicantStatus);
			attributeSetterBiConsumers.put(
				"typeOfApplicant",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setTypeOfApplicant);
			attributeSetterBiConsumers.put(
				"subjectData",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setSubjectData);
			attributeSetterBiConsumers.put(
				"applicantIndividual",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setApplicantIndividual);
			attributeSetterBiConsumers.put(
				"applicantCompany",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setApplicantCompany);
			attributeSetterBiConsumers.put(
				"realEstateBoard",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setRealEstateBoard);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setCaseId);
			attributeSetterBiConsumers.put(
				"status",
				(BiConsumer<OsiInsolvencyApplication, Integer>)
					OsiInsolvencyApplication::setStatus);
			attributeSetterBiConsumers.put(
				"icmDocumentPath",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setIcmDocumentPath);
			attributeSetterBiConsumers.put(
				"applicationNumber",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setApplicationNumber);
			attributeSetterBiConsumers.put(
				"pdfFileEntryId",
				(BiConsumer<OsiInsolvencyApplication, Long>)
					OsiInsolvencyApplication::setPdfFileEntryId);
			attributeSetterBiConsumers.put(
				"appCurrentStageName",
				(BiConsumer<OsiInsolvencyApplication, String>)
					OsiInsolvencyApplication::setAppCurrentStageName);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getOsiInsolvencyId() {
		return _osiInsolvencyId;
	}

	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiInsolvencyId = osiInsolvencyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalOsiInsolvencyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));
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

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalUserId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("userId"));
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
	public String getEntityId() {
		if (_entityId == null) {
			return "";
		}
		else {
			return _entityId;
		}
	}

	@Override
	public void setEntityId(String entityId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_entityId = entityId;
	}

	@JSON
	@Override
	public String getApplicantStatus() {
		if (_applicantStatus == null) {
			return "";
		}
		else {
			return _applicantStatus;
		}
	}

	@Override
	public void setApplicantStatus(String applicantStatus) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicantStatus = applicantStatus;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalApplicantStatus() {
		return getColumnOriginalValue("applicantStatus");
	}

	@JSON
	@Override
	public String getTypeOfApplicant() {
		if (_typeOfApplicant == null) {
			return "";
		}
		else {
			return _typeOfApplicant;
		}
	}

	@Override
	public void setTypeOfApplicant(String typeOfApplicant) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_typeOfApplicant = typeOfApplicant;
	}

	@JSON
	@Override
	public String getSubjectData() {
		if (_subjectData == null) {
			return "";
		}
		else {
			return _subjectData;
		}
	}

	@Override
	public void setSubjectData(String subjectData) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_subjectData = subjectData;
	}

	@JSON
	@Override
	public String getApplicantIndividual() {
		if (_applicantIndividual == null) {
			return "";
		}
		else {
			return _applicantIndividual;
		}
	}

	@Override
	public void setApplicantIndividual(String applicantIndividual) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicantIndividual = applicantIndividual;
	}

	@JSON
	@Override
	public String getApplicantCompany() {
		if (_applicantCompany == null) {
			return "";
		}
		else {
			return _applicantCompany;
		}
	}

	@Override
	public void setApplicantCompany(String applicantCompany) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicantCompany = applicantCompany;
	}

	@JSON
	@Override
	public String getRealEstateBoard() {
		if (_realEstateBoard == null) {
			return "";
		}
		else {
			return _realEstateBoard;
		}
	}

	@Override
	public void setRealEstateBoard(String realEstateBoard) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_realEstateBoard = realEstateBoard;
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
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
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
	public int getOriginalStatus() {
		return GetterUtil.getInteger(
			this.<Integer>getColumnOriginalValue("status"));
	}

	@JSON
	@Override
	public String getIcmDocumentPath() {
		if (_icmDocumentPath == null) {
			return "";
		}
		else {
			return _icmDocumentPath;
		}
	}

	@Override
	public void setIcmDocumentPath(String icmDocumentPath) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_icmDocumentPath = icmDocumentPath;
	}

	@JSON
	@Override
	public String getApplicationNumber() {
		if (_applicationNumber == null) {
			return "";
		}
		else {
			return _applicationNumber;
		}
	}

	@Override
	public void setApplicationNumber(String applicationNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicationNumber = applicationNumber;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalApplicationNumber() {
		return getColumnOriginalValue("applicationNumber");
	}

	@JSON
	@Override
	public long getPdfFileEntryId() {
		return _pdfFileEntryId;
	}

	@Override
	public void setPdfFileEntryId(long pdfFileEntryId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_pdfFileEntryId = pdfFileEntryId;
	}

	@JSON
	@Override
	public String getAppCurrentStageName() {
		if (_appCurrentStageName == null) {
			return "";
		}
		else {
			return _appCurrentStageName;
		}
	}

	@Override
	public void setAppCurrentStageName(String appCurrentStageName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_appCurrentStageName = appCurrentStageName;
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
			getCompanyId(), OsiInsolvencyApplication.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OsiInsolvencyApplication toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OsiInsolvencyApplication>
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
		OsiInsolvencyApplicationImpl osiInsolvencyApplicationImpl =
			new OsiInsolvencyApplicationImpl();

		osiInsolvencyApplicationImpl.setOsiInsolvencyId(getOsiInsolvencyId());
		osiInsolvencyApplicationImpl.setGroupId(getGroupId());
		osiInsolvencyApplicationImpl.setCompanyId(getCompanyId());
		osiInsolvencyApplicationImpl.setUserId(getUserId());
		osiInsolvencyApplicationImpl.setUserName(getUserName());
		osiInsolvencyApplicationImpl.setCreateDate(getCreateDate());
		osiInsolvencyApplicationImpl.setModifiedDate(getModifiedDate());
		osiInsolvencyApplicationImpl.setEntityId(getEntityId());
		osiInsolvencyApplicationImpl.setApplicantStatus(getApplicantStatus());
		osiInsolvencyApplicationImpl.setTypeOfApplicant(getTypeOfApplicant());
		osiInsolvencyApplicationImpl.setSubjectData(getSubjectData());
		osiInsolvencyApplicationImpl.setApplicantIndividual(
			getApplicantIndividual());
		osiInsolvencyApplicationImpl.setApplicantCompany(getApplicantCompany());
		osiInsolvencyApplicationImpl.setRealEstateBoard(getRealEstateBoard());
		osiInsolvencyApplicationImpl.setCaseId(getCaseId());
		osiInsolvencyApplicationImpl.setStatus(getStatus());
		osiInsolvencyApplicationImpl.setIcmDocumentPath(getIcmDocumentPath());
		osiInsolvencyApplicationImpl.setApplicationNumber(
			getApplicationNumber());
		osiInsolvencyApplicationImpl.setPdfFileEntryId(getPdfFileEntryId());
		osiInsolvencyApplicationImpl.setAppCurrentStageName(
			getAppCurrentStageName());

		osiInsolvencyApplicationImpl.resetOriginalValues();

		return osiInsolvencyApplicationImpl;
	}

	@Override
	public OsiInsolvencyApplication cloneWithOriginalValues() {
		OsiInsolvencyApplicationImpl osiInsolvencyApplicationImpl =
			new OsiInsolvencyApplicationImpl();

		osiInsolvencyApplicationImpl.setOsiInsolvencyId(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));
		osiInsolvencyApplicationImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		osiInsolvencyApplicationImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		osiInsolvencyApplicationImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		osiInsolvencyApplicationImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		osiInsolvencyApplicationImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		osiInsolvencyApplicationImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		osiInsolvencyApplicationImpl.setEntityId(
			this.<String>getColumnOriginalValue("entityId"));
		osiInsolvencyApplicationImpl.setApplicantStatus(
			this.<String>getColumnOriginalValue("applicantStatus"));
		osiInsolvencyApplicationImpl.setTypeOfApplicant(
			this.<String>getColumnOriginalValue("typeOfApplicant"));
		osiInsolvencyApplicationImpl.setSubjectData(
			this.<String>getColumnOriginalValue("subjectData"));
		osiInsolvencyApplicationImpl.setApplicantIndividual(
			this.<String>getColumnOriginalValue("applicantIndividual"));
		osiInsolvencyApplicationImpl.setApplicantCompany(
			this.<String>getColumnOriginalValue("applicantCompany"));
		osiInsolvencyApplicationImpl.setRealEstateBoard(
			this.<String>getColumnOriginalValue("realEstateBoard"));
		osiInsolvencyApplicationImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		osiInsolvencyApplicationImpl.setStatus(
			this.<Integer>getColumnOriginalValue("status"));
		osiInsolvencyApplicationImpl.setIcmDocumentPath(
			this.<String>getColumnOriginalValue("icmDocumentPath"));
		osiInsolvencyApplicationImpl.setApplicationNumber(
			this.<String>getColumnOriginalValue("applicationNumber"));
		osiInsolvencyApplicationImpl.setPdfFileEntryId(
			this.<Long>getColumnOriginalValue("pdfFileEntryId"));
		osiInsolvencyApplicationImpl.setAppCurrentStageName(
			this.<String>getColumnOriginalValue("appCurrentStageName"));

		return osiInsolvencyApplicationImpl;
	}

	@Override
	public int compareTo(OsiInsolvencyApplication osiInsolvencyApplication) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), osiInsolvencyApplication.getCreateDate());

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

		if (!(object instanceof OsiInsolvencyApplication)) {
			return false;
		}

		OsiInsolvencyApplication osiInsolvencyApplication =
			(OsiInsolvencyApplication)object;

		long primaryKey = osiInsolvencyApplication.getPrimaryKey();

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
	public CacheModel<OsiInsolvencyApplication> toCacheModel() {
		OsiInsolvencyApplicationCacheModel osiInsolvencyApplicationCacheModel =
			new OsiInsolvencyApplicationCacheModel();

		osiInsolvencyApplicationCacheModel.osiInsolvencyId =
			getOsiInsolvencyId();

		osiInsolvencyApplicationCacheModel.groupId = getGroupId();

		osiInsolvencyApplicationCacheModel.companyId = getCompanyId();

		osiInsolvencyApplicationCacheModel.userId = getUserId();

		osiInsolvencyApplicationCacheModel.userName = getUserName();

		String userName = osiInsolvencyApplicationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			osiInsolvencyApplicationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			osiInsolvencyApplicationCacheModel.createDate =
				createDate.getTime();
		}
		else {
			osiInsolvencyApplicationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			osiInsolvencyApplicationCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			osiInsolvencyApplicationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		osiInsolvencyApplicationCacheModel.entityId = getEntityId();

		String entityId = osiInsolvencyApplicationCacheModel.entityId;

		if ((entityId != null) && (entityId.length() == 0)) {
			osiInsolvencyApplicationCacheModel.entityId = null;
		}

		osiInsolvencyApplicationCacheModel.applicantStatus =
			getApplicantStatus();

		String applicantStatus =
			osiInsolvencyApplicationCacheModel.applicantStatus;

		if ((applicantStatus != null) && (applicantStatus.length() == 0)) {
			osiInsolvencyApplicationCacheModel.applicantStatus = null;
		}

		osiInsolvencyApplicationCacheModel.typeOfApplicant =
			getTypeOfApplicant();

		String typeOfApplicant =
			osiInsolvencyApplicationCacheModel.typeOfApplicant;

		if ((typeOfApplicant != null) && (typeOfApplicant.length() == 0)) {
			osiInsolvencyApplicationCacheModel.typeOfApplicant = null;
		}

		osiInsolvencyApplicationCacheModel.subjectData = getSubjectData();

		String subjectData = osiInsolvencyApplicationCacheModel.subjectData;

		if ((subjectData != null) && (subjectData.length() == 0)) {
			osiInsolvencyApplicationCacheModel.subjectData = null;
		}

		osiInsolvencyApplicationCacheModel.applicantIndividual =
			getApplicantIndividual();

		String applicantIndividual =
			osiInsolvencyApplicationCacheModel.applicantIndividual;

		if ((applicantIndividual != null) &&
			(applicantIndividual.length() == 0)) {

			osiInsolvencyApplicationCacheModel.applicantIndividual = null;
		}

		osiInsolvencyApplicationCacheModel.applicantCompany =
			getApplicantCompany();

		String applicantCompany =
			osiInsolvencyApplicationCacheModel.applicantCompany;

		if ((applicantCompany != null) && (applicantCompany.length() == 0)) {
			osiInsolvencyApplicationCacheModel.applicantCompany = null;
		}

		osiInsolvencyApplicationCacheModel.realEstateBoard =
			getRealEstateBoard();

		String realEstateBoard =
			osiInsolvencyApplicationCacheModel.realEstateBoard;

		if ((realEstateBoard != null) && (realEstateBoard.length() == 0)) {
			osiInsolvencyApplicationCacheModel.realEstateBoard = null;
		}

		osiInsolvencyApplicationCacheModel.caseId = getCaseId();

		String caseId = osiInsolvencyApplicationCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			osiInsolvencyApplicationCacheModel.caseId = null;
		}

		osiInsolvencyApplicationCacheModel.status = getStatus();

		osiInsolvencyApplicationCacheModel.icmDocumentPath =
			getIcmDocumentPath();

		String icmDocumentPath =
			osiInsolvencyApplicationCacheModel.icmDocumentPath;

		if ((icmDocumentPath != null) && (icmDocumentPath.length() == 0)) {
			osiInsolvencyApplicationCacheModel.icmDocumentPath = null;
		}

		osiInsolvencyApplicationCacheModel.applicationNumber =
			getApplicationNumber();

		String applicationNumber =
			osiInsolvencyApplicationCacheModel.applicationNumber;

		if ((applicationNumber != null) && (applicationNumber.length() == 0)) {
			osiInsolvencyApplicationCacheModel.applicationNumber = null;
		}

		osiInsolvencyApplicationCacheModel.pdfFileEntryId = getPdfFileEntryId();

		osiInsolvencyApplicationCacheModel.appCurrentStageName =
			getAppCurrentStageName();

		String appCurrentStageName =
			osiInsolvencyApplicationCacheModel.appCurrentStageName;

		if ((appCurrentStageName != null) &&
			(appCurrentStageName.length() == 0)) {

			osiInsolvencyApplicationCacheModel.appCurrentStageName = null;
		}

		return osiInsolvencyApplicationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OsiInsolvencyApplication, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<OsiInsolvencyApplication, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiInsolvencyApplication, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(OsiInsolvencyApplication)this);

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
			<InvocationHandler, OsiInsolvencyApplication>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						OsiInsolvencyApplication.class, ModelWrapper.class);

	}

	private long _osiInsolvencyId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _entityId;
	private String _applicantStatus;
	private String _typeOfApplicant;
	private String _subjectData;
	private String _applicantIndividual;
	private String _applicantCompany;
	private String _realEstateBoard;
	private String _caseId;
	private int _status;
	private String _icmDocumentPath;
	private String _applicationNumber;
	private long _pdfFileEntryId;
	private String _appCurrentStageName;

	public <T> T getColumnValue(String columnName) {
		Function<OsiInsolvencyApplication, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((OsiInsolvencyApplication)this);
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

		_columnOriginalValues.put("osiInsolvencyId", _osiInsolvencyId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("entityId", _entityId);
		_columnOriginalValues.put("applicantStatus", _applicantStatus);
		_columnOriginalValues.put("typeOfApplicant", _typeOfApplicant);
		_columnOriginalValues.put("subjectData", _subjectData);
		_columnOriginalValues.put("applicantIndividual", _applicantIndividual);
		_columnOriginalValues.put("applicantCompany", _applicantCompany);
		_columnOriginalValues.put("realEstateBoard", _realEstateBoard);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("icmDocumentPath", _icmDocumentPath);
		_columnOriginalValues.put("applicationNumber", _applicationNumber);
		_columnOriginalValues.put("pdfFileEntryId", _pdfFileEntryId);
		_columnOriginalValues.put("appCurrentStageName", _appCurrentStageName);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("osiInsolvencyId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("entityId", 128L);

		columnBitmasks.put("applicantStatus", 256L);

		columnBitmasks.put("typeOfApplicant", 512L);

		columnBitmasks.put("subjectData", 1024L);

		columnBitmasks.put("applicantIndividual", 2048L);

		columnBitmasks.put("applicantCompany", 4096L);

		columnBitmasks.put("realEstateBoard", 8192L);

		columnBitmasks.put("caseId", 16384L);

		columnBitmasks.put("status", 32768L);

		columnBitmasks.put("icmDocumentPath", 65536L);

		columnBitmasks.put("applicationNumber", 131072L);

		columnBitmasks.put("pdfFileEntryId", 262144L);

		columnBitmasks.put("appCurrentStageName", 524288L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private OsiInsolvencyApplication _escapedModel;

}