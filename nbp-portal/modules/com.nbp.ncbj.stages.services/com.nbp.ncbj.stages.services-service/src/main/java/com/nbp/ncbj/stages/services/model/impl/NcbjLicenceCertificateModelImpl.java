/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model.impl;

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

import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;
import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificateModel;

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
 * The base model implementation for the NcbjLicenceCertificate service. Represents a row in the &quot;nbp_ncbj_licence_certificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>NcbjLicenceCertificateModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjLicenceCertificateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificateImpl
 * @generated
 */
@JSON(strict = true)
public class NcbjLicenceCertificateModelImpl
	extends BaseModelImpl<NcbjLicenceCertificate>
	implements NcbjLicenceCertificateModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj licence certificate model instance should use the <code>NcbjLicenceCertificate</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_ncbj_licence_certificate";

	public static final Object[][] TABLE_COLUMNS = {
		{"ncbjLicenceCertificateId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"caseId", Types.VARCHAR},
		{"licenceCertificate", Types.VARCHAR},
		{"NameOfApplicant", Types.VARCHAR},
		{"nameOfCertification", Types.VARCHAR},
		{"scopeOfCertification", Types.VARCHAR}, {"issueDate", Types.TIMESTAMP},
		{"expirationDate", Types.TIMESTAMP}, {"status", Types.VARCHAR},
		{"docFileEntry", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("ncbjLicenceCertificateId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("licenceCertificate", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("NameOfApplicant", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nameOfCertification", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("scopeOfCertification", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("issueDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("expirationDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("docFileEntry", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_ncbj_licence_certificate (ncbjLicenceCertificateId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,caseId VARCHAR(75) null,licenceCertificate VARCHAR(75) null,NameOfApplicant VARCHAR(75) null,nameOfCertification VARCHAR(75) null,scopeOfCertification VARCHAR(75) null,issueDate DATE null,expirationDate DATE null,status VARCHAR(75) null,docFileEntry LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_ncbj_licence_certificate";

	public static final String ORDER_BY_JPQL =
		" ORDER BY ncbjLicenceCertificate.ncbjLicenceCertificateId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_ncbj_licence_certificate.ncbjLicenceCertificateId ASC";

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
	public static final long NCBJLICENCECERTIFICATEID_COLUMN_BITMASK = 2L;

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

	public NcbjLicenceCertificateModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ncbjLicenceCertificateId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNcbjLicenceCertificateId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ncbjLicenceCertificateId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return NcbjLicenceCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return NcbjLicenceCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<NcbjLicenceCertificate, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<NcbjLicenceCertificate, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcbjLicenceCertificate, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((NcbjLicenceCertificate)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<NcbjLicenceCertificate, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<NcbjLicenceCertificate, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(NcbjLicenceCertificate)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<NcbjLicenceCertificate, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<NcbjLicenceCertificate, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<NcbjLicenceCertificate, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<NcbjLicenceCertificate, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<NcbjLicenceCertificate, Object>>();

			attributeGetterFunctions.put(
				"ncbjLicenceCertificateId",
				NcbjLicenceCertificate::getNcbjLicenceCertificateId);
			attributeGetterFunctions.put(
				"groupId", NcbjLicenceCertificate::getGroupId);
			attributeGetterFunctions.put(
				"companyId", NcbjLicenceCertificate::getCompanyId);
			attributeGetterFunctions.put(
				"userId", NcbjLicenceCertificate::getUserId);
			attributeGetterFunctions.put(
				"userName", NcbjLicenceCertificate::getUserName);
			attributeGetterFunctions.put(
				"createDate", NcbjLicenceCertificate::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", NcbjLicenceCertificate::getModifiedDate);
			attributeGetterFunctions.put(
				"caseId", NcbjLicenceCertificate::getCaseId);
			attributeGetterFunctions.put(
				"licenceCertificate",
				NcbjLicenceCertificate::getLicenceCertificate);
			attributeGetterFunctions.put(
				"NameOfApplicant", NcbjLicenceCertificate::getNameOfApplicant);
			attributeGetterFunctions.put(
				"nameOfCertification",
				NcbjLicenceCertificate::getNameOfCertification);
			attributeGetterFunctions.put(
				"scopeOfCertification",
				NcbjLicenceCertificate::getScopeOfCertification);
			attributeGetterFunctions.put(
				"issueDate", NcbjLicenceCertificate::getIssueDate);
			attributeGetterFunctions.put(
				"expirationDate", NcbjLicenceCertificate::getExpirationDate);
			attributeGetterFunctions.put(
				"status", NcbjLicenceCertificate::getStatus);
			attributeGetterFunctions.put(
				"docFileEntry", NcbjLicenceCertificate::getDocFileEntry);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<NcbjLicenceCertificate, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<NcbjLicenceCertificate, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<NcbjLicenceCertificate, ?>>();

			attributeSetterBiConsumers.put(
				"ncbjLicenceCertificateId",
				(BiConsumer<NcbjLicenceCertificate, Long>)
					NcbjLicenceCertificate::setNcbjLicenceCertificateId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<NcbjLicenceCertificate, Long>)
					NcbjLicenceCertificate::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<NcbjLicenceCertificate, Long>)
					NcbjLicenceCertificate::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<NcbjLicenceCertificate, Long>)
					NcbjLicenceCertificate::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<NcbjLicenceCertificate, String>)
					NcbjLicenceCertificate::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<NcbjLicenceCertificate, Date>)
					NcbjLicenceCertificate::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<NcbjLicenceCertificate, Date>)
					NcbjLicenceCertificate::setModifiedDate);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<NcbjLicenceCertificate, String>)
					NcbjLicenceCertificate::setCaseId);
			attributeSetterBiConsumers.put(
				"licenceCertificate",
				(BiConsumer<NcbjLicenceCertificate, String>)
					NcbjLicenceCertificate::setLicenceCertificate);
			attributeSetterBiConsumers.put(
				"NameOfApplicant",
				(BiConsumer<NcbjLicenceCertificate, String>)
					NcbjLicenceCertificate::setNameOfApplicant);
			attributeSetterBiConsumers.put(
				"nameOfCertification",
				(BiConsumer<NcbjLicenceCertificate, String>)
					NcbjLicenceCertificate::setNameOfCertification);
			attributeSetterBiConsumers.put(
				"scopeOfCertification",
				(BiConsumer<NcbjLicenceCertificate, String>)
					NcbjLicenceCertificate::setScopeOfCertification);
			attributeSetterBiConsumers.put(
				"issueDate",
				(BiConsumer<NcbjLicenceCertificate, Date>)
					NcbjLicenceCertificate::setIssueDate);
			attributeSetterBiConsumers.put(
				"expirationDate",
				(BiConsumer<NcbjLicenceCertificate, Date>)
					NcbjLicenceCertificate::setExpirationDate);
			attributeSetterBiConsumers.put(
				"status",
				(BiConsumer<NcbjLicenceCertificate, String>)
					NcbjLicenceCertificate::setStatus);
			attributeSetterBiConsumers.put(
				"docFileEntry",
				(BiConsumer<NcbjLicenceCertificate, Long>)
					NcbjLicenceCertificate::setDocFileEntry);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getNcbjLicenceCertificateId() {
		return _ncbjLicenceCertificateId;
	}

	@Override
	public void setNcbjLicenceCertificateId(long ncbjLicenceCertificateId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ncbjLicenceCertificateId = ncbjLicenceCertificateId;
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
	public String getLicenceCertificate() {
		if (_licenceCertificate == null) {
			return "";
		}
		else {
			return _licenceCertificate;
		}
	}

	@Override
	public void setLicenceCertificate(String licenceCertificate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_licenceCertificate = licenceCertificate;
	}

	@JSON
	@Override
	public String getNameOfApplicant() {
		if (_NameOfApplicant == null) {
			return "";
		}
		else {
			return _NameOfApplicant;
		}
	}

	@Override
	public void setNameOfApplicant(String NameOfApplicant) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_NameOfApplicant = NameOfApplicant;
	}

	@JSON
	@Override
	public String getNameOfCertification() {
		if (_nameOfCertification == null) {
			return "";
		}
		else {
			return _nameOfCertification;
		}
	}

	@Override
	public void setNameOfCertification(String nameOfCertification) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nameOfCertification = nameOfCertification;
	}

	@JSON
	@Override
	public String getScopeOfCertification() {
		if (_scopeOfCertification == null) {
			return "";
		}
		else {
			return _scopeOfCertification;
		}
	}

	@Override
	public void setScopeOfCertification(String scopeOfCertification) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_scopeOfCertification = scopeOfCertification;
	}

	@JSON
	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_issueDate = issueDate;
	}

	@JSON
	@Override
	public Date getExpirationDate() {
		return _expirationDate;
	}

	@Override
	public void setExpirationDate(Date expirationDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_expirationDate = expirationDate;
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
	public long getDocFileEntry() {
		return _docFileEntry;
	}

	@Override
	public void setDocFileEntry(long docFileEntry) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_docFileEntry = docFileEntry;
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
			getCompanyId(), NcbjLicenceCertificate.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NcbjLicenceCertificate toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, NcbjLicenceCertificate>
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
		NcbjLicenceCertificateImpl ncbjLicenceCertificateImpl =
			new NcbjLicenceCertificateImpl();

		ncbjLicenceCertificateImpl.setNcbjLicenceCertificateId(
			getNcbjLicenceCertificateId());
		ncbjLicenceCertificateImpl.setGroupId(getGroupId());
		ncbjLicenceCertificateImpl.setCompanyId(getCompanyId());
		ncbjLicenceCertificateImpl.setUserId(getUserId());
		ncbjLicenceCertificateImpl.setUserName(getUserName());
		ncbjLicenceCertificateImpl.setCreateDate(getCreateDate());
		ncbjLicenceCertificateImpl.setModifiedDate(getModifiedDate());
		ncbjLicenceCertificateImpl.setCaseId(getCaseId());
		ncbjLicenceCertificateImpl.setLicenceCertificate(
			getLicenceCertificate());
		ncbjLicenceCertificateImpl.setNameOfApplicant(getNameOfApplicant());
		ncbjLicenceCertificateImpl.setNameOfCertification(
			getNameOfCertification());
		ncbjLicenceCertificateImpl.setScopeOfCertification(
			getScopeOfCertification());
		ncbjLicenceCertificateImpl.setIssueDate(getIssueDate());
		ncbjLicenceCertificateImpl.setExpirationDate(getExpirationDate());
		ncbjLicenceCertificateImpl.setStatus(getStatus());
		ncbjLicenceCertificateImpl.setDocFileEntry(getDocFileEntry());

		ncbjLicenceCertificateImpl.resetOriginalValues();

		return ncbjLicenceCertificateImpl;
	}

	@Override
	public NcbjLicenceCertificate cloneWithOriginalValues() {
		NcbjLicenceCertificateImpl ncbjLicenceCertificateImpl =
			new NcbjLicenceCertificateImpl();

		ncbjLicenceCertificateImpl.setNcbjLicenceCertificateId(
			this.<Long>getColumnOriginalValue("ncbjLicenceCertificateId"));
		ncbjLicenceCertificateImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		ncbjLicenceCertificateImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		ncbjLicenceCertificateImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		ncbjLicenceCertificateImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		ncbjLicenceCertificateImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		ncbjLicenceCertificateImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		ncbjLicenceCertificateImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		ncbjLicenceCertificateImpl.setLicenceCertificate(
			this.<String>getColumnOriginalValue("licenceCertificate"));
		ncbjLicenceCertificateImpl.setNameOfApplicant(
			this.<String>getColumnOriginalValue("NameOfApplicant"));
		ncbjLicenceCertificateImpl.setNameOfCertification(
			this.<String>getColumnOriginalValue("nameOfCertification"));
		ncbjLicenceCertificateImpl.setScopeOfCertification(
			this.<String>getColumnOriginalValue("scopeOfCertification"));
		ncbjLicenceCertificateImpl.setIssueDate(
			this.<Date>getColumnOriginalValue("issueDate"));
		ncbjLicenceCertificateImpl.setExpirationDate(
			this.<Date>getColumnOriginalValue("expirationDate"));
		ncbjLicenceCertificateImpl.setStatus(
			this.<String>getColumnOriginalValue("status"));
		ncbjLicenceCertificateImpl.setDocFileEntry(
			this.<Long>getColumnOriginalValue("docFileEntry"));

		return ncbjLicenceCertificateImpl;
	}

	@Override
	public int compareTo(NcbjLicenceCertificate ncbjLicenceCertificate) {
		long primaryKey = ncbjLicenceCertificate.getPrimaryKey();

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

		if (!(object instanceof NcbjLicenceCertificate)) {
			return false;
		}

		NcbjLicenceCertificate ncbjLicenceCertificate =
			(NcbjLicenceCertificate)object;

		long primaryKey = ncbjLicenceCertificate.getPrimaryKey();

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
	public CacheModel<NcbjLicenceCertificate> toCacheModel() {
		NcbjLicenceCertificateCacheModel ncbjLicenceCertificateCacheModel =
			new NcbjLicenceCertificateCacheModel();

		ncbjLicenceCertificateCacheModel.ncbjLicenceCertificateId =
			getNcbjLicenceCertificateId();

		ncbjLicenceCertificateCacheModel.groupId = getGroupId();

		ncbjLicenceCertificateCacheModel.companyId = getCompanyId();

		ncbjLicenceCertificateCacheModel.userId = getUserId();

		ncbjLicenceCertificateCacheModel.userName = getUserName();

		String userName = ncbjLicenceCertificateCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ncbjLicenceCertificateCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ncbjLicenceCertificateCacheModel.createDate = createDate.getTime();
		}
		else {
			ncbjLicenceCertificateCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ncbjLicenceCertificateCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			ncbjLicenceCertificateCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ncbjLicenceCertificateCacheModel.caseId = getCaseId();

		String caseId = ncbjLicenceCertificateCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			ncbjLicenceCertificateCacheModel.caseId = null;
		}

		ncbjLicenceCertificateCacheModel.licenceCertificate =
			getLicenceCertificate();

		String licenceCertificate =
			ncbjLicenceCertificateCacheModel.licenceCertificate;

		if ((licenceCertificate != null) &&
			(licenceCertificate.length() == 0)) {

			ncbjLicenceCertificateCacheModel.licenceCertificate = null;
		}

		ncbjLicenceCertificateCacheModel.NameOfApplicant = getNameOfApplicant();

		String NameOfApplicant =
			ncbjLicenceCertificateCacheModel.NameOfApplicant;

		if ((NameOfApplicant != null) && (NameOfApplicant.length() == 0)) {
			ncbjLicenceCertificateCacheModel.NameOfApplicant = null;
		}

		ncbjLicenceCertificateCacheModel.nameOfCertification =
			getNameOfCertification();

		String nameOfCertification =
			ncbjLicenceCertificateCacheModel.nameOfCertification;

		if ((nameOfCertification != null) &&
			(nameOfCertification.length() == 0)) {

			ncbjLicenceCertificateCacheModel.nameOfCertification = null;
		}

		ncbjLicenceCertificateCacheModel.scopeOfCertification =
			getScopeOfCertification();

		String scopeOfCertification =
			ncbjLicenceCertificateCacheModel.scopeOfCertification;

		if ((scopeOfCertification != null) &&
			(scopeOfCertification.length() == 0)) {

			ncbjLicenceCertificateCacheModel.scopeOfCertification = null;
		}

		Date issueDate = getIssueDate();

		if (issueDate != null) {
			ncbjLicenceCertificateCacheModel.issueDate = issueDate.getTime();
		}
		else {
			ncbjLicenceCertificateCacheModel.issueDate = Long.MIN_VALUE;
		}

		Date expirationDate = getExpirationDate();

		if (expirationDate != null) {
			ncbjLicenceCertificateCacheModel.expirationDate =
				expirationDate.getTime();
		}
		else {
			ncbjLicenceCertificateCacheModel.expirationDate = Long.MIN_VALUE;
		}

		ncbjLicenceCertificateCacheModel.status = getStatus();

		String status = ncbjLicenceCertificateCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			ncbjLicenceCertificateCacheModel.status = null;
		}

		ncbjLicenceCertificateCacheModel.docFileEntry = getDocFileEntry();

		return ncbjLicenceCertificateCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<NcbjLicenceCertificate, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<NcbjLicenceCertificate, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcbjLicenceCertificate, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(NcbjLicenceCertificate)this);

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

		private static final Function<InvocationHandler, NcbjLicenceCertificate>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					NcbjLicenceCertificate.class, ModelWrapper.class);

	}

	private long _ncbjLicenceCertificateId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _caseId;
	private String _licenceCertificate;
	private String _NameOfApplicant;
	private String _nameOfCertification;
	private String _scopeOfCertification;
	private Date _issueDate;
	private Date _expirationDate;
	private String _status;
	private long _docFileEntry;

	public <T> T getColumnValue(String columnName) {
		Function<NcbjLicenceCertificate, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((NcbjLicenceCertificate)this);
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
			"ncbjLicenceCertificateId", _ncbjLicenceCertificateId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("licenceCertificate", _licenceCertificate);
		_columnOriginalValues.put("NameOfApplicant", _NameOfApplicant);
		_columnOriginalValues.put("nameOfCertification", _nameOfCertification);
		_columnOriginalValues.put(
			"scopeOfCertification", _scopeOfCertification);
		_columnOriginalValues.put("issueDate", _issueDate);
		_columnOriginalValues.put("expirationDate", _expirationDate);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("docFileEntry", _docFileEntry);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("ncbjLicenceCertificateId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("caseId", 128L);

		columnBitmasks.put("licenceCertificate", 256L);

		columnBitmasks.put("NameOfApplicant", 512L);

		columnBitmasks.put("nameOfCertification", 1024L);

		columnBitmasks.put("scopeOfCertification", 2048L);

		columnBitmasks.put("issueDate", 4096L);

		columnBitmasks.put("expirationDate", 8192L);

		columnBitmasks.put("status", 16384L);

		columnBitmasks.put("docFileEntry", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private NcbjLicenceCertificate _escapedModel;

}