/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.model.impl;

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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuance;
import com.nbp.sez.status.application.stage.services.model.SezStatusLicenseIssuanceModel;

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
 * The base model implementation for the SezStatusLicenseIssuance service. Represents a row in the &quot;nbp_sez_status_licence_issu&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezStatusLicenseIssuanceModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezStatusLicenseIssuanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusLicenseIssuanceImpl
 * @generated
 */
@JSON(strict = true)
public class SezStatusLicenseIssuanceModelImpl
	extends BaseModelImpl<SezStatusLicenseIssuance>
	implements SezStatusLicenseIssuanceModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez status license issuance model instance should use the <code>SezStatusLicenseIssuance</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_status_licence_issu";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"sezStatusLicIssuedId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"caseId", Types.VARCHAR}, {"licenceNumber", Types.VARCHAR},
		{"nameOfApplicant", Types.VARCHAR}, {"sezStatus", Types.VARCHAR},
		{"sezDeveloperNumber", Types.VARCHAR},
		{"dateOfLicIssuance", Types.TIMESTAMP},
		{"dateOfLicenseExpiration", Types.TIMESTAMP},
		{"docLicFileEntryId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezStatusLicIssuedId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("licenceNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nameOfApplicant", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezDeveloperNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateOfLicIssuance", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dateOfLicenseExpiration", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("docLicFileEntryId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_status_licence_issu (uuid_ VARCHAR(75) null,sezStatusLicIssuedId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,caseId VARCHAR(75) null,licenceNumber VARCHAR(75) null,nameOfApplicant VARCHAR(75) null,sezStatus VARCHAR(75) null,sezDeveloperNumber VARCHAR(75) null,dateOfLicIssuance DATE null,dateOfLicenseExpiration DATE null,docLicFileEntryId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_status_licence_issu";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezStatusLicenseIssuance.sezStatusLicIssuedId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_status_licence_issu.sezStatusLicIssuedId ASC";

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
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long SEZSTATUSLICISSUEDID_COLUMN_BITMASK = 16L;

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

	public SezStatusLicenseIssuanceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezStatusLicIssuedId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezStatusLicIssuedId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezStatusLicIssuedId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezStatusLicenseIssuance.class;
	}

	@Override
	public String getModelClassName() {
		return SezStatusLicenseIssuance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezStatusLicenseIssuance, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezStatusLicenseIssuance, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezStatusLicenseIssuance, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezStatusLicenseIssuance)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezStatusLicenseIssuance, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezStatusLicenseIssuance, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezStatusLicenseIssuance)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezStatusLicenseIssuance, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezStatusLicenseIssuance, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<SezStatusLicenseIssuance, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<SezStatusLicenseIssuance, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezStatusLicenseIssuance, Object>>();

			attributeGetterFunctions.put(
				"uuid", SezStatusLicenseIssuance::getUuid);
			attributeGetterFunctions.put(
				"sezStatusLicIssuedId",
				SezStatusLicenseIssuance::getSezStatusLicIssuedId);
			attributeGetterFunctions.put(
				"groupId", SezStatusLicenseIssuance::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezStatusLicenseIssuance::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezStatusLicenseIssuance::getUserId);
			attributeGetterFunctions.put(
				"userName", SezStatusLicenseIssuance::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezStatusLicenseIssuance::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezStatusLicenseIssuance::getModifiedDate);
			attributeGetterFunctions.put(
				"caseId", SezStatusLicenseIssuance::getCaseId);
			attributeGetterFunctions.put(
				"licenceNumber", SezStatusLicenseIssuance::getLicenceNumber);
			attributeGetterFunctions.put(
				"nameOfApplicant",
				SezStatusLicenseIssuance::getNameOfApplicant);
			attributeGetterFunctions.put(
				"sezStatus", SezStatusLicenseIssuance::getSezStatus);
			attributeGetterFunctions.put(
				"sezDeveloperNumber",
				SezStatusLicenseIssuance::getSezDeveloperNumber);
			attributeGetterFunctions.put(
				"dateOfLicIssuance",
				SezStatusLicenseIssuance::getDateOfLicIssuance);
			attributeGetterFunctions.put(
				"dateOfLicenseExpiration",
				SezStatusLicenseIssuance::getDateOfLicenseExpiration);
			attributeGetterFunctions.put(
				"docLicFileEntryId",
				SezStatusLicenseIssuance::getDocLicFileEntryId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<SezStatusLicenseIssuance, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezStatusLicenseIssuance, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezStatusLicenseIssuance, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<SezStatusLicenseIssuance, String>)
					SezStatusLicenseIssuance::setUuid);
			attributeSetterBiConsumers.put(
				"sezStatusLicIssuedId",
				(BiConsumer<SezStatusLicenseIssuance, Long>)
					SezStatusLicenseIssuance::setSezStatusLicIssuedId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezStatusLicenseIssuance, Long>)
					SezStatusLicenseIssuance::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezStatusLicenseIssuance, Long>)
					SezStatusLicenseIssuance::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezStatusLicenseIssuance, Long>)
					SezStatusLicenseIssuance::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezStatusLicenseIssuance, String>)
					SezStatusLicenseIssuance::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezStatusLicenseIssuance, Date>)
					SezStatusLicenseIssuance::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezStatusLicenseIssuance, Date>)
					SezStatusLicenseIssuance::setModifiedDate);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<SezStatusLicenseIssuance, String>)
					SezStatusLicenseIssuance::setCaseId);
			attributeSetterBiConsumers.put(
				"licenceNumber",
				(BiConsumer<SezStatusLicenseIssuance, String>)
					SezStatusLicenseIssuance::setLicenceNumber);
			attributeSetterBiConsumers.put(
				"nameOfApplicant",
				(BiConsumer<SezStatusLicenseIssuance, String>)
					SezStatusLicenseIssuance::setNameOfApplicant);
			attributeSetterBiConsumers.put(
				"sezStatus",
				(BiConsumer<SezStatusLicenseIssuance, String>)
					SezStatusLicenseIssuance::setSezStatus);
			attributeSetterBiConsumers.put(
				"sezDeveloperNumber",
				(BiConsumer<SezStatusLicenseIssuance, String>)
					SezStatusLicenseIssuance::setSezDeveloperNumber);
			attributeSetterBiConsumers.put(
				"dateOfLicIssuance",
				(BiConsumer<SezStatusLicenseIssuance, Date>)
					SezStatusLicenseIssuance::setDateOfLicIssuance);
			attributeSetterBiConsumers.put(
				"dateOfLicenseExpiration",
				(BiConsumer<SezStatusLicenseIssuance, Date>)
					SezStatusLicenseIssuance::setDateOfLicenseExpiration);
			attributeSetterBiConsumers.put(
				"docLicFileEntryId",
				(BiConsumer<SezStatusLicenseIssuance, Long>)
					SezStatusLicenseIssuance::setDocLicFileEntryId);

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
	public long getSezStatusLicIssuedId() {
		return _sezStatusLicIssuedId;
	}

	@Override
	public void setSezStatusLicIssuedId(long sezStatusLicIssuedId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezStatusLicIssuedId = sezStatusLicIssuedId;
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
	public String getNameOfApplicant() {
		if (_nameOfApplicant == null) {
			return "";
		}
		else {
			return _nameOfApplicant;
		}
	}

	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nameOfApplicant = nameOfApplicant;
	}

	@JSON
	@Override
	public String getSezStatus() {
		if (_sezStatus == null) {
			return "";
		}
		else {
			return _sezStatus;
		}
	}

	@Override
	public void setSezStatus(String sezStatus) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezStatus = sezStatus;
	}

	@JSON
	@Override
	public String getSezDeveloperNumber() {
		if (_sezDeveloperNumber == null) {
			return "";
		}
		else {
			return _sezDeveloperNumber;
		}
	}

	@Override
	public void setSezDeveloperNumber(String sezDeveloperNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezDeveloperNumber = sezDeveloperNumber;
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

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				SezStatusLicenseIssuance.class.getName()));
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
			getCompanyId(), SezStatusLicenseIssuance.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezStatusLicenseIssuance toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezStatusLicenseIssuance>
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
		SezStatusLicenseIssuanceImpl sezStatusLicenseIssuanceImpl =
			new SezStatusLicenseIssuanceImpl();

		sezStatusLicenseIssuanceImpl.setUuid(getUuid());
		sezStatusLicenseIssuanceImpl.setSezStatusLicIssuedId(
			getSezStatusLicIssuedId());
		sezStatusLicenseIssuanceImpl.setGroupId(getGroupId());
		sezStatusLicenseIssuanceImpl.setCompanyId(getCompanyId());
		sezStatusLicenseIssuanceImpl.setUserId(getUserId());
		sezStatusLicenseIssuanceImpl.setUserName(getUserName());
		sezStatusLicenseIssuanceImpl.setCreateDate(getCreateDate());
		sezStatusLicenseIssuanceImpl.setModifiedDate(getModifiedDate());
		sezStatusLicenseIssuanceImpl.setCaseId(getCaseId());
		sezStatusLicenseIssuanceImpl.setLicenceNumber(getLicenceNumber());
		sezStatusLicenseIssuanceImpl.setNameOfApplicant(getNameOfApplicant());
		sezStatusLicenseIssuanceImpl.setSezStatus(getSezStatus());
		sezStatusLicenseIssuanceImpl.setSezDeveloperNumber(
			getSezDeveloperNumber());
		sezStatusLicenseIssuanceImpl.setDateOfLicIssuance(
			getDateOfLicIssuance());
		sezStatusLicenseIssuanceImpl.setDateOfLicenseExpiration(
			getDateOfLicenseExpiration());
		sezStatusLicenseIssuanceImpl.setDocLicFileEntryId(
			getDocLicFileEntryId());

		sezStatusLicenseIssuanceImpl.resetOriginalValues();

		return sezStatusLicenseIssuanceImpl;
	}

	@Override
	public SezStatusLicenseIssuance cloneWithOriginalValues() {
		SezStatusLicenseIssuanceImpl sezStatusLicenseIssuanceImpl =
			new SezStatusLicenseIssuanceImpl();

		sezStatusLicenseIssuanceImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		sezStatusLicenseIssuanceImpl.setSezStatusLicIssuedId(
			this.<Long>getColumnOriginalValue("sezStatusLicIssuedId"));
		sezStatusLicenseIssuanceImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezStatusLicenseIssuanceImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezStatusLicenseIssuanceImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezStatusLicenseIssuanceImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezStatusLicenseIssuanceImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezStatusLicenseIssuanceImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezStatusLicenseIssuanceImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		sezStatusLicenseIssuanceImpl.setLicenceNumber(
			this.<String>getColumnOriginalValue("licenceNumber"));
		sezStatusLicenseIssuanceImpl.setNameOfApplicant(
			this.<String>getColumnOriginalValue("nameOfApplicant"));
		sezStatusLicenseIssuanceImpl.setSezStatus(
			this.<String>getColumnOriginalValue("sezStatus"));
		sezStatusLicenseIssuanceImpl.setSezDeveloperNumber(
			this.<String>getColumnOriginalValue("sezDeveloperNumber"));
		sezStatusLicenseIssuanceImpl.setDateOfLicIssuance(
			this.<Date>getColumnOriginalValue("dateOfLicIssuance"));
		sezStatusLicenseIssuanceImpl.setDateOfLicenseExpiration(
			this.<Date>getColumnOriginalValue("dateOfLicenseExpiration"));
		sezStatusLicenseIssuanceImpl.setDocLicFileEntryId(
			this.<Long>getColumnOriginalValue("docLicFileEntryId"));

		return sezStatusLicenseIssuanceImpl;
	}

	@Override
	public int compareTo(SezStatusLicenseIssuance sezStatusLicenseIssuance) {
		long primaryKey = sezStatusLicenseIssuance.getPrimaryKey();

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

		if (!(object instanceof SezStatusLicenseIssuance)) {
			return false;
		}

		SezStatusLicenseIssuance sezStatusLicenseIssuance =
			(SezStatusLicenseIssuance)object;

		long primaryKey = sezStatusLicenseIssuance.getPrimaryKey();

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
	public CacheModel<SezStatusLicenseIssuance> toCacheModel() {
		SezStatusLicenseIssuanceCacheModel sezStatusLicenseIssuanceCacheModel =
			new SezStatusLicenseIssuanceCacheModel();

		sezStatusLicenseIssuanceCacheModel.uuid = getUuid();

		String uuid = sezStatusLicenseIssuanceCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			sezStatusLicenseIssuanceCacheModel.uuid = null;
		}

		sezStatusLicenseIssuanceCacheModel.sezStatusLicIssuedId =
			getSezStatusLicIssuedId();

		sezStatusLicenseIssuanceCacheModel.groupId = getGroupId();

		sezStatusLicenseIssuanceCacheModel.companyId = getCompanyId();

		sezStatusLicenseIssuanceCacheModel.userId = getUserId();

		sezStatusLicenseIssuanceCacheModel.userName = getUserName();

		String userName = sezStatusLicenseIssuanceCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezStatusLicenseIssuanceCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezStatusLicenseIssuanceCacheModel.createDate =
				createDate.getTime();
		}
		else {
			sezStatusLicenseIssuanceCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezStatusLicenseIssuanceCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			sezStatusLicenseIssuanceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezStatusLicenseIssuanceCacheModel.caseId = getCaseId();

		String caseId = sezStatusLicenseIssuanceCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			sezStatusLicenseIssuanceCacheModel.caseId = null;
		}

		sezStatusLicenseIssuanceCacheModel.licenceNumber = getLicenceNumber();

		String licenceNumber = sezStatusLicenseIssuanceCacheModel.licenceNumber;

		if ((licenceNumber != null) && (licenceNumber.length() == 0)) {
			sezStatusLicenseIssuanceCacheModel.licenceNumber = null;
		}

		sezStatusLicenseIssuanceCacheModel.nameOfApplicant =
			getNameOfApplicant();

		String nameOfApplicant =
			sezStatusLicenseIssuanceCacheModel.nameOfApplicant;

		if ((nameOfApplicant != null) && (nameOfApplicant.length() == 0)) {
			sezStatusLicenseIssuanceCacheModel.nameOfApplicant = null;
		}

		sezStatusLicenseIssuanceCacheModel.sezStatus = getSezStatus();

		String sezStatus = sezStatusLicenseIssuanceCacheModel.sezStatus;

		if ((sezStatus != null) && (sezStatus.length() == 0)) {
			sezStatusLicenseIssuanceCacheModel.sezStatus = null;
		}

		sezStatusLicenseIssuanceCacheModel.sezDeveloperNumber =
			getSezDeveloperNumber();

		String sezDeveloperNumber =
			sezStatusLicenseIssuanceCacheModel.sezDeveloperNumber;

		if ((sezDeveloperNumber != null) &&
			(sezDeveloperNumber.length() == 0)) {

			sezStatusLicenseIssuanceCacheModel.sezDeveloperNumber = null;
		}

		Date dateOfLicIssuance = getDateOfLicIssuance();

		if (dateOfLicIssuance != null) {
			sezStatusLicenseIssuanceCacheModel.dateOfLicIssuance =
				dateOfLicIssuance.getTime();
		}
		else {
			sezStatusLicenseIssuanceCacheModel.dateOfLicIssuance =
				Long.MIN_VALUE;
		}

		Date dateOfLicenseExpiration = getDateOfLicenseExpiration();

		if (dateOfLicenseExpiration != null) {
			sezStatusLicenseIssuanceCacheModel.dateOfLicenseExpiration =
				dateOfLicenseExpiration.getTime();
		}
		else {
			sezStatusLicenseIssuanceCacheModel.dateOfLicenseExpiration =
				Long.MIN_VALUE;
		}

		sezStatusLicenseIssuanceCacheModel.docLicFileEntryId =
			getDocLicFileEntryId();

		return sezStatusLicenseIssuanceCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezStatusLicenseIssuance, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezStatusLicenseIssuance, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezStatusLicenseIssuance, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezStatusLicenseIssuance)this);

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
			<InvocationHandler, SezStatusLicenseIssuance>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						SezStatusLicenseIssuance.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _sezStatusLicIssuedId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _caseId;
	private String _licenceNumber;
	private String _nameOfApplicant;
	private String _sezStatus;
	private String _sezDeveloperNumber;
	private Date _dateOfLicIssuance;
	private Date _dateOfLicenseExpiration;
	private long _docLicFileEntryId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<SezStatusLicenseIssuance, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezStatusLicenseIssuance)this);
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
			"sezStatusLicIssuedId", _sezStatusLicIssuedId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("licenceNumber", _licenceNumber);
		_columnOriginalValues.put("nameOfApplicant", _nameOfApplicant);
		_columnOriginalValues.put("sezStatus", _sezStatus);
		_columnOriginalValues.put("sezDeveloperNumber", _sezDeveloperNumber);
		_columnOriginalValues.put("dateOfLicIssuance", _dateOfLicIssuance);
		_columnOriginalValues.put(
			"dateOfLicenseExpiration", _dateOfLicenseExpiration);
		_columnOriginalValues.put("docLicFileEntryId", _docLicFileEntryId);
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

		columnBitmasks.put("sezStatusLicIssuedId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("caseId", 256L);

		columnBitmasks.put("licenceNumber", 512L);

		columnBitmasks.put("nameOfApplicant", 1024L);

		columnBitmasks.put("sezStatus", 2048L);

		columnBitmasks.put("sezDeveloperNumber", 4096L);

		columnBitmasks.put("dateOfLicIssuance", 8192L);

		columnBitmasks.put("dateOfLicenseExpiration", 16384L);

		columnBitmasks.put("docLicFileEntryId", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezStatusLicenseIssuance _escapedModel;

}