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

import com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackage;
import com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackageModel;

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
 * The base model implementation for the SezStatusWelcomePackage service. Represents a row in the &quot;nbp_sez_status_welcome_pack&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezStatusWelcomePackageModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezStatusWelcomePackageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWelcomePackageImpl
 * @generated
 */
@JSON(strict = true)
public class SezStatusWelcomePackageModelImpl
	extends BaseModelImpl<SezStatusWelcomePackage>
	implements SezStatusWelcomePackageModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez status welcome package model instance should use the <code>SezStatusWelcomePackage</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_status_welcome_pack";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"sezStatusWelcomeId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"caseId", Types.VARCHAR},
		{"dateWelcomePackageSigned", Types.TIMESTAMP},
		{"welcomePackageSubmitToAppli", Types.TIMESTAMP},
		{"docLicFileEntryId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezStatusWelcomeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateWelcomePackageSigned", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("welcomePackageSubmitToAppli", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("docLicFileEntryId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_status_welcome_pack (uuid_ VARCHAR(75) null,sezStatusWelcomeId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,caseId VARCHAR(75) null,dateWelcomePackageSigned DATE null,welcomePackageSubmitToAppli DATE null,docLicFileEntryId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_status_welcome_pack";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezStatusWelcomePackage.sezStatusWelcomeId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_status_welcome_pack.sezStatusWelcomeId ASC";

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
	public static final long SEZSTATUSWELCOMEID_COLUMN_BITMASK = 16L;

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

	public SezStatusWelcomePackageModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezStatusWelcomeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezStatusWelcomeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezStatusWelcomeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezStatusWelcomePackage.class;
	}

	@Override
	public String getModelClassName() {
		return SezStatusWelcomePackage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezStatusWelcomePackage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezStatusWelcomePackage, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezStatusWelcomePackage, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezStatusWelcomePackage)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezStatusWelcomePackage, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezStatusWelcomePackage, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezStatusWelcomePackage)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezStatusWelcomePackage, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezStatusWelcomePackage, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<SezStatusWelcomePackage, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<SezStatusWelcomePackage, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezStatusWelcomePackage, Object>>();

			attributeGetterFunctions.put(
				"uuid", SezStatusWelcomePackage::getUuid);
			attributeGetterFunctions.put(
				"sezStatusWelcomeId",
				SezStatusWelcomePackage::getSezStatusWelcomeId);
			attributeGetterFunctions.put(
				"groupId", SezStatusWelcomePackage::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezStatusWelcomePackage::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezStatusWelcomePackage::getUserId);
			attributeGetterFunctions.put(
				"userName", SezStatusWelcomePackage::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezStatusWelcomePackage::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezStatusWelcomePackage::getModifiedDate);
			attributeGetterFunctions.put(
				"caseId", SezStatusWelcomePackage::getCaseId);
			attributeGetterFunctions.put(
				"dateWelcomePackageSigned",
				SezStatusWelcomePackage::getDateWelcomePackageSigned);
			attributeGetterFunctions.put(
				"welcomePackageSubmitToAppli",
				SezStatusWelcomePackage::getWelcomePackageSubmitToAppli);
			attributeGetterFunctions.put(
				"docLicFileEntryId",
				SezStatusWelcomePackage::getDocLicFileEntryId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<SezStatusWelcomePackage, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezStatusWelcomePackage, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezStatusWelcomePackage, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<SezStatusWelcomePackage, String>)
					SezStatusWelcomePackage::setUuid);
			attributeSetterBiConsumers.put(
				"sezStatusWelcomeId",
				(BiConsumer<SezStatusWelcomePackage, Long>)
					SezStatusWelcomePackage::setSezStatusWelcomeId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezStatusWelcomePackage, Long>)
					SezStatusWelcomePackage::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezStatusWelcomePackage, Long>)
					SezStatusWelcomePackage::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezStatusWelcomePackage, Long>)
					SezStatusWelcomePackage::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezStatusWelcomePackage, String>)
					SezStatusWelcomePackage::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezStatusWelcomePackage, Date>)
					SezStatusWelcomePackage::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezStatusWelcomePackage, Date>)
					SezStatusWelcomePackage::setModifiedDate);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<SezStatusWelcomePackage, String>)
					SezStatusWelcomePackage::setCaseId);
			attributeSetterBiConsumers.put(
				"dateWelcomePackageSigned",
				(BiConsumer<SezStatusWelcomePackage, Date>)
					SezStatusWelcomePackage::setDateWelcomePackageSigned);
			attributeSetterBiConsumers.put(
				"welcomePackageSubmitToAppli",
				(BiConsumer<SezStatusWelcomePackage, Date>)
					SezStatusWelcomePackage::setWelcomePackageSubmitToAppli);
			attributeSetterBiConsumers.put(
				"docLicFileEntryId",
				(BiConsumer<SezStatusWelcomePackage, Long>)
					SezStatusWelcomePackage::setDocLicFileEntryId);

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
	public long getSezStatusWelcomeId() {
		return _sezStatusWelcomeId;
	}

	@Override
	public void setSezStatusWelcomeId(long sezStatusWelcomeId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezStatusWelcomeId = sezStatusWelcomeId;
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
	public Date getDateWelcomePackageSigned() {
		return _dateWelcomePackageSigned;
	}

	@Override
	public void setDateWelcomePackageSigned(Date dateWelcomePackageSigned) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateWelcomePackageSigned = dateWelcomePackageSigned;
	}

	@JSON
	@Override
	public Date getWelcomePackageSubmitToAppli() {
		return _welcomePackageSubmitToAppli;
	}

	@Override
	public void setWelcomePackageSubmitToAppli(
		Date welcomePackageSubmitToAppli) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_welcomePackageSubmitToAppli = welcomePackageSubmitToAppli;
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
			PortalUtil.getClassNameId(SezStatusWelcomePackage.class.getName()));
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
			getCompanyId(), SezStatusWelcomePackage.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezStatusWelcomePackage toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezStatusWelcomePackage>
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
		SezStatusWelcomePackageImpl sezStatusWelcomePackageImpl =
			new SezStatusWelcomePackageImpl();

		sezStatusWelcomePackageImpl.setUuid(getUuid());
		sezStatusWelcomePackageImpl.setSezStatusWelcomeId(
			getSezStatusWelcomeId());
		sezStatusWelcomePackageImpl.setGroupId(getGroupId());
		sezStatusWelcomePackageImpl.setCompanyId(getCompanyId());
		sezStatusWelcomePackageImpl.setUserId(getUserId());
		sezStatusWelcomePackageImpl.setUserName(getUserName());
		sezStatusWelcomePackageImpl.setCreateDate(getCreateDate());
		sezStatusWelcomePackageImpl.setModifiedDate(getModifiedDate());
		sezStatusWelcomePackageImpl.setCaseId(getCaseId());
		sezStatusWelcomePackageImpl.setDateWelcomePackageSigned(
			getDateWelcomePackageSigned());
		sezStatusWelcomePackageImpl.setWelcomePackageSubmitToAppli(
			getWelcomePackageSubmitToAppli());
		sezStatusWelcomePackageImpl.setDocLicFileEntryId(
			getDocLicFileEntryId());

		sezStatusWelcomePackageImpl.resetOriginalValues();

		return sezStatusWelcomePackageImpl;
	}

	@Override
	public SezStatusWelcomePackage cloneWithOriginalValues() {
		SezStatusWelcomePackageImpl sezStatusWelcomePackageImpl =
			new SezStatusWelcomePackageImpl();

		sezStatusWelcomePackageImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		sezStatusWelcomePackageImpl.setSezStatusWelcomeId(
			this.<Long>getColumnOriginalValue("sezStatusWelcomeId"));
		sezStatusWelcomePackageImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezStatusWelcomePackageImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezStatusWelcomePackageImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezStatusWelcomePackageImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezStatusWelcomePackageImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezStatusWelcomePackageImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezStatusWelcomePackageImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		sezStatusWelcomePackageImpl.setDateWelcomePackageSigned(
			this.<Date>getColumnOriginalValue("dateWelcomePackageSigned"));
		sezStatusWelcomePackageImpl.setWelcomePackageSubmitToAppli(
			this.<Date>getColumnOriginalValue("welcomePackageSubmitToAppli"));
		sezStatusWelcomePackageImpl.setDocLicFileEntryId(
			this.<Long>getColumnOriginalValue("docLicFileEntryId"));

		return sezStatusWelcomePackageImpl;
	}

	@Override
	public int compareTo(SezStatusWelcomePackage sezStatusWelcomePackage) {
		long primaryKey = sezStatusWelcomePackage.getPrimaryKey();

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

		if (!(object instanceof SezStatusWelcomePackage)) {
			return false;
		}

		SezStatusWelcomePackage sezStatusWelcomePackage =
			(SezStatusWelcomePackage)object;

		long primaryKey = sezStatusWelcomePackage.getPrimaryKey();

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
	public CacheModel<SezStatusWelcomePackage> toCacheModel() {
		SezStatusWelcomePackageCacheModel sezStatusWelcomePackageCacheModel =
			new SezStatusWelcomePackageCacheModel();

		sezStatusWelcomePackageCacheModel.uuid = getUuid();

		String uuid = sezStatusWelcomePackageCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			sezStatusWelcomePackageCacheModel.uuid = null;
		}

		sezStatusWelcomePackageCacheModel.sezStatusWelcomeId =
			getSezStatusWelcomeId();

		sezStatusWelcomePackageCacheModel.groupId = getGroupId();

		sezStatusWelcomePackageCacheModel.companyId = getCompanyId();

		sezStatusWelcomePackageCacheModel.userId = getUserId();

		sezStatusWelcomePackageCacheModel.userName = getUserName();

		String userName = sezStatusWelcomePackageCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezStatusWelcomePackageCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezStatusWelcomePackageCacheModel.createDate = createDate.getTime();
		}
		else {
			sezStatusWelcomePackageCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezStatusWelcomePackageCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			sezStatusWelcomePackageCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezStatusWelcomePackageCacheModel.caseId = getCaseId();

		String caseId = sezStatusWelcomePackageCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			sezStatusWelcomePackageCacheModel.caseId = null;
		}

		Date dateWelcomePackageSigned = getDateWelcomePackageSigned();

		if (dateWelcomePackageSigned != null) {
			sezStatusWelcomePackageCacheModel.dateWelcomePackageSigned =
				dateWelcomePackageSigned.getTime();
		}
		else {
			sezStatusWelcomePackageCacheModel.dateWelcomePackageSigned =
				Long.MIN_VALUE;
		}

		Date welcomePackageSubmitToAppli = getWelcomePackageSubmitToAppli();

		if (welcomePackageSubmitToAppli != null) {
			sezStatusWelcomePackageCacheModel.welcomePackageSubmitToAppli =
				welcomePackageSubmitToAppli.getTime();
		}
		else {
			sezStatusWelcomePackageCacheModel.welcomePackageSubmitToAppli =
				Long.MIN_VALUE;
		}

		sezStatusWelcomePackageCacheModel.docLicFileEntryId =
			getDocLicFileEntryId();

		return sezStatusWelcomePackageCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezStatusWelcomePackage, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezStatusWelcomePackage, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezStatusWelcomePackage, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezStatusWelcomePackage)this);

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
			<InvocationHandler, SezStatusWelcomePackage>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						SezStatusWelcomePackage.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _sezStatusWelcomeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _caseId;
	private Date _dateWelcomePackageSigned;
	private Date _welcomePackageSubmitToAppli;
	private long _docLicFileEntryId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<SezStatusWelcomePackage, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezStatusWelcomePackage)this);
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
		_columnOriginalValues.put("sezStatusWelcomeId", _sezStatusWelcomeId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put(
			"dateWelcomePackageSigned", _dateWelcomePackageSigned);
		_columnOriginalValues.put(
			"welcomePackageSubmitToAppli", _welcomePackageSubmitToAppli);
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

		columnBitmasks.put("sezStatusWelcomeId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("caseId", 256L);

		columnBitmasks.put("dateWelcomePackageSigned", 512L);

		columnBitmasks.put("welcomePackageSubmitToAppli", 1024L);

		columnBitmasks.put("docLicFileEntryId", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezStatusWelcomePackage _escapedModel;

}