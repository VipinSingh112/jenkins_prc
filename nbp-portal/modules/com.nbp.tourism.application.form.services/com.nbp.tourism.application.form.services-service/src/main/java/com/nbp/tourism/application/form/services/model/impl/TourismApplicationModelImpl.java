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

import com.nbp.tourism.application.form.services.model.TourismApplication;
import com.nbp.tourism.application.form.services.model.TourismApplicationModel;

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
 * The base model implementation for the TourismApplication service. Represents a row in the &quot;nbp_tourism_application&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismApplicationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismApplicationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationImpl
 * @generated
 */
@JSON(strict = true)
public class TourismApplicationModelImpl
	extends BaseModelImpl<TourismApplication>
	implements TourismApplicationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism application model instance should use the <code>TourismApplication</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_application";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismApplicationId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"entityId", Types.VARCHAR},
		{"requestType", Types.VARCHAR}, {"requestTypeTwo", Types.VARCHAR},
		{"licenseCategory", Types.VARCHAR},
		{"licenseSubCategory", Types.VARCHAR}, {"status", Types.INTEGER},
		{"applicationNumber", Types.VARCHAR}, {"caseId", Types.VARCHAR},
		{"icmDocumentsPath", Types.VARCHAR}, {"pdfFileEntryId", Types.BIGINT},
		{"appCurrentStageName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("entityId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("requestType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("requestTypeTwo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("licenseCategory", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("licenseSubCategory", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("applicationNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("icmDocumentsPath", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pdfFileEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("appCurrentStageName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_application (tourismApplicationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,entityId VARCHAR(75) null,requestType VARCHAR(75) null,requestTypeTwo VARCHAR(75) null,licenseCategory VARCHAR(75) null,licenseSubCategory VARCHAR(75) null,status INTEGER,applicationNumber VARCHAR(75) null,caseId VARCHAR(500) null,icmDocumentsPath VARCHAR(500) null,pdfFileEntryId LONG,appCurrentStageName VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_application";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismApplication.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_application.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long APPLICATIONNUMBER_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CASEID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long STATUS_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TOURISMAPPLICATIONID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long USERID_COLUMN_BITMASK = 16L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 32L;

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

	public TourismApplicationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismApplicationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismApplicationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismApplicationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismApplication.class;
	}

	@Override
	public String getModelClassName() {
		return TourismApplication.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismApplication, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TourismApplication, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismApplication, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((TourismApplication)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismApplication, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismApplication, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismApplication)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismApplication, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismApplication, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<TourismApplication, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<TourismApplication, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<TourismApplication, Object>>();

			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismApplication::getTourismApplicationId);
			attributeGetterFunctions.put(
				"groupId", TourismApplication::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismApplication::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismApplication::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismApplication::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismApplication::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", TourismApplication::getModifiedDate);
			attributeGetterFunctions.put(
				"entityId", TourismApplication::getEntityId);
			attributeGetterFunctions.put(
				"requestType", TourismApplication::getRequestType);
			attributeGetterFunctions.put(
				"requestTypeTwo", TourismApplication::getRequestTypeTwo);
			attributeGetterFunctions.put(
				"licenseCategory", TourismApplication::getLicenseCategory);
			attributeGetterFunctions.put(
				"licenseSubCategory",
				TourismApplication::getLicenseSubCategory);
			attributeGetterFunctions.put(
				"status", TourismApplication::getStatus);
			attributeGetterFunctions.put(
				"applicationNumber", TourismApplication::getApplicationNumber);
			attributeGetterFunctions.put(
				"caseId", TourismApplication::getCaseId);
			attributeGetterFunctions.put(
				"icmDocumentsPath", TourismApplication::getIcmDocumentsPath);
			attributeGetterFunctions.put(
				"pdfFileEntryId", TourismApplication::getPdfFileEntryId);
			attributeGetterFunctions.put(
				"appCurrentStageName",
				TourismApplication::getAppCurrentStageName);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<TourismApplication, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismApplication, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<TourismApplication, ?>>();

			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismApplication, Long>)
					TourismApplication::setTourismApplicationId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismApplication, Long>)
					TourismApplication::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismApplication, Long>)
					TourismApplication::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismApplication, Long>)
					TourismApplication::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismApplication, Date>)
					TourismApplication::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismApplication, Date>)
					TourismApplication::setModifiedDate);
			attributeSetterBiConsumers.put(
				"entityId",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setEntityId);
			attributeSetterBiConsumers.put(
				"requestType",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setRequestType);
			attributeSetterBiConsumers.put(
				"requestTypeTwo",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setRequestTypeTwo);
			attributeSetterBiConsumers.put(
				"licenseCategory",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setLicenseCategory);
			attributeSetterBiConsumers.put(
				"licenseSubCategory",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setLicenseSubCategory);
			attributeSetterBiConsumers.put(
				"status",
				(BiConsumer<TourismApplication, Integer>)
					TourismApplication::setStatus);
			attributeSetterBiConsumers.put(
				"applicationNumber",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setApplicationNumber);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setCaseId);
			attributeSetterBiConsumers.put(
				"icmDocumentsPath",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setIcmDocumentsPath);
			attributeSetterBiConsumers.put(
				"pdfFileEntryId",
				(BiConsumer<TourismApplication, Long>)
					TourismApplication::setPdfFileEntryId);
			attributeSetterBiConsumers.put(
				"appCurrentStageName",
				(BiConsumer<TourismApplication, String>)
					TourismApplication::setAppCurrentStageName);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

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
	public String getRequestType() {
		if (_requestType == null) {
			return "";
		}
		else {
			return _requestType;
		}
	}

	@Override
	public void setRequestType(String requestType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_requestType = requestType;
	}

	@JSON
	@Override
	public String getRequestTypeTwo() {
		if (_requestTypeTwo == null) {
			return "";
		}
		else {
			return _requestTypeTwo;
		}
	}

	@Override
	public void setRequestTypeTwo(String requestTypeTwo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_requestTypeTwo = requestTypeTwo;
	}

	@JSON
	@Override
	public String getLicenseCategory() {
		if (_licenseCategory == null) {
			return "";
		}
		else {
			return _licenseCategory;
		}
	}

	@Override
	public void setLicenseCategory(String licenseCategory) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_licenseCategory = licenseCategory;
	}

	@JSON
	@Override
	public String getLicenseSubCategory() {
		if (_licenseSubCategory == null) {
			return "";
		}
		else {
			return _licenseSubCategory;
		}
	}

	@Override
	public void setLicenseSubCategory(String licenseSubCategory) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_licenseSubCategory = licenseSubCategory;
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
	public String getIcmDocumentsPath() {
		if (_icmDocumentsPath == null) {
			return "";
		}
		else {
			return _icmDocumentsPath;
		}
	}

	@Override
	public void setIcmDocumentsPath(String icmDocumentsPath) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_icmDocumentsPath = icmDocumentsPath;
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
			getCompanyId(), TourismApplication.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismApplication toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismApplication>
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
		TourismApplicationImpl tourismApplicationImpl =
			new TourismApplicationImpl();

		tourismApplicationImpl.setTourismApplicationId(
			getTourismApplicationId());
		tourismApplicationImpl.setGroupId(getGroupId());
		tourismApplicationImpl.setCompanyId(getCompanyId());
		tourismApplicationImpl.setUserId(getUserId());
		tourismApplicationImpl.setUserName(getUserName());
		tourismApplicationImpl.setCreateDate(getCreateDate());
		tourismApplicationImpl.setModifiedDate(getModifiedDate());
		tourismApplicationImpl.setEntityId(getEntityId());
		tourismApplicationImpl.setRequestType(getRequestType());
		tourismApplicationImpl.setRequestTypeTwo(getRequestTypeTwo());
		tourismApplicationImpl.setLicenseCategory(getLicenseCategory());
		tourismApplicationImpl.setLicenseSubCategory(getLicenseSubCategory());
		tourismApplicationImpl.setStatus(getStatus());
		tourismApplicationImpl.setApplicationNumber(getApplicationNumber());
		tourismApplicationImpl.setCaseId(getCaseId());
		tourismApplicationImpl.setIcmDocumentsPath(getIcmDocumentsPath());
		tourismApplicationImpl.setPdfFileEntryId(getPdfFileEntryId());
		tourismApplicationImpl.setAppCurrentStageName(getAppCurrentStageName());

		tourismApplicationImpl.resetOriginalValues();

		return tourismApplicationImpl;
	}

	@Override
	public TourismApplication cloneWithOriginalValues() {
		TourismApplicationImpl tourismApplicationImpl =
			new TourismApplicationImpl();

		tourismApplicationImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));
		tourismApplicationImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismApplicationImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismApplicationImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismApplicationImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismApplicationImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismApplicationImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismApplicationImpl.setEntityId(
			this.<String>getColumnOriginalValue("entityId"));
		tourismApplicationImpl.setRequestType(
			this.<String>getColumnOriginalValue("requestType"));
		tourismApplicationImpl.setRequestTypeTwo(
			this.<String>getColumnOriginalValue("requestTypeTwo"));
		tourismApplicationImpl.setLicenseCategory(
			this.<String>getColumnOriginalValue("licenseCategory"));
		tourismApplicationImpl.setLicenseSubCategory(
			this.<String>getColumnOriginalValue("licenseSubCategory"));
		tourismApplicationImpl.setStatus(
			this.<Integer>getColumnOriginalValue("status"));
		tourismApplicationImpl.setApplicationNumber(
			this.<String>getColumnOriginalValue("applicationNumber"));
		tourismApplicationImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		tourismApplicationImpl.setIcmDocumentsPath(
			this.<String>getColumnOriginalValue("icmDocumentsPath"));
		tourismApplicationImpl.setPdfFileEntryId(
			this.<Long>getColumnOriginalValue("pdfFileEntryId"));
		tourismApplicationImpl.setAppCurrentStageName(
			this.<String>getColumnOriginalValue("appCurrentStageName"));

		return tourismApplicationImpl;
	}

	@Override
	public int compareTo(TourismApplication tourismApplication) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), tourismApplication.getCreateDate());

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

		if (!(object instanceof TourismApplication)) {
			return false;
		}

		TourismApplication tourismApplication = (TourismApplication)object;

		long primaryKey = tourismApplication.getPrimaryKey();

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
	public CacheModel<TourismApplication> toCacheModel() {
		TourismApplicationCacheModel tourismApplicationCacheModel =
			new TourismApplicationCacheModel();

		tourismApplicationCacheModel.tourismApplicationId =
			getTourismApplicationId();

		tourismApplicationCacheModel.groupId = getGroupId();

		tourismApplicationCacheModel.companyId = getCompanyId();

		tourismApplicationCacheModel.userId = getUserId();

		tourismApplicationCacheModel.userName = getUserName();

		String userName = tourismApplicationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismApplicationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismApplicationCacheModel.createDate = createDate.getTime();
		}
		else {
			tourismApplicationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismApplicationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			tourismApplicationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tourismApplicationCacheModel.entityId = getEntityId();

		String entityId = tourismApplicationCacheModel.entityId;

		if ((entityId != null) && (entityId.length() == 0)) {
			tourismApplicationCacheModel.entityId = null;
		}

		tourismApplicationCacheModel.requestType = getRequestType();

		String requestType = tourismApplicationCacheModel.requestType;

		if ((requestType != null) && (requestType.length() == 0)) {
			tourismApplicationCacheModel.requestType = null;
		}

		tourismApplicationCacheModel.requestTypeTwo = getRequestTypeTwo();

		String requestTypeTwo = tourismApplicationCacheModel.requestTypeTwo;

		if ((requestTypeTwo != null) && (requestTypeTwo.length() == 0)) {
			tourismApplicationCacheModel.requestTypeTwo = null;
		}

		tourismApplicationCacheModel.licenseCategory = getLicenseCategory();

		String licenseCategory = tourismApplicationCacheModel.licenseCategory;

		if ((licenseCategory != null) && (licenseCategory.length() == 0)) {
			tourismApplicationCacheModel.licenseCategory = null;
		}

		tourismApplicationCacheModel.licenseSubCategory =
			getLicenseSubCategory();

		String licenseSubCategory =
			tourismApplicationCacheModel.licenseSubCategory;

		if ((licenseSubCategory != null) &&
			(licenseSubCategory.length() == 0)) {

			tourismApplicationCacheModel.licenseSubCategory = null;
		}

		tourismApplicationCacheModel.status = getStatus();

		tourismApplicationCacheModel.applicationNumber = getApplicationNumber();

		String applicationNumber =
			tourismApplicationCacheModel.applicationNumber;

		if ((applicationNumber != null) && (applicationNumber.length() == 0)) {
			tourismApplicationCacheModel.applicationNumber = null;
		}

		tourismApplicationCacheModel.caseId = getCaseId();

		String caseId = tourismApplicationCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			tourismApplicationCacheModel.caseId = null;
		}

		tourismApplicationCacheModel.icmDocumentsPath = getIcmDocumentsPath();

		String icmDocumentsPath = tourismApplicationCacheModel.icmDocumentsPath;

		if ((icmDocumentsPath != null) && (icmDocumentsPath.length() == 0)) {
			tourismApplicationCacheModel.icmDocumentsPath = null;
		}

		tourismApplicationCacheModel.pdfFileEntryId = getPdfFileEntryId();

		tourismApplicationCacheModel.appCurrentStageName =
			getAppCurrentStageName();

		String appCurrentStageName =
			tourismApplicationCacheModel.appCurrentStageName;

		if ((appCurrentStageName != null) &&
			(appCurrentStageName.length() == 0)) {

			tourismApplicationCacheModel.appCurrentStageName = null;
		}

		return tourismApplicationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismApplication, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TourismApplication, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismApplication, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismApplication)this);

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

		private static final Function<InvocationHandler, TourismApplication>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					TourismApplication.class, ModelWrapper.class);

	}

	private long _tourismApplicationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _entityId;
	private String _requestType;
	private String _requestTypeTwo;
	private String _licenseCategory;
	private String _licenseSubCategory;
	private int _status;
	private String _applicationNumber;
	private String _caseId;
	private String _icmDocumentsPath;
	private long _pdfFileEntryId;
	private String _appCurrentStageName;

	public <T> T getColumnValue(String columnName) {
		Function<TourismApplication, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismApplication)this);
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
			"tourismApplicationId", _tourismApplicationId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("entityId", _entityId);
		_columnOriginalValues.put("requestType", _requestType);
		_columnOriginalValues.put("requestTypeTwo", _requestTypeTwo);
		_columnOriginalValues.put("licenseCategory", _licenseCategory);
		_columnOriginalValues.put("licenseSubCategory", _licenseSubCategory);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("applicationNumber", _applicationNumber);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("icmDocumentsPath", _icmDocumentsPath);
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

		columnBitmasks.put("tourismApplicationId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("entityId", 128L);

		columnBitmasks.put("requestType", 256L);

		columnBitmasks.put("requestTypeTwo", 512L);

		columnBitmasks.put("licenseCategory", 1024L);

		columnBitmasks.put("licenseSubCategory", 2048L);

		columnBitmasks.put("status", 4096L);

		columnBitmasks.put("applicationNumber", 8192L);

		columnBitmasks.put("caseId", 16384L);

		columnBitmasks.put("icmDocumentsPath", 32768L);

		columnBitmasks.put("pdfFileEntryId", 65536L);

		columnBitmasks.put("appCurrentStageName", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismApplication _escapedModel;

}