/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model.impl;

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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.application.form.services.model.OfficialUse;
import com.nbp.osi.application.form.services.model.OfficialUseModel;

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
 * The base model implementation for the OfficialUse service. Represents a row in the &quot;nbp_osi_official_use&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OfficialUseModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OfficialUseImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OfficialUseImpl
 * @generated
 */
@JSON(strict = true)
public class OfficialUseModelImpl
	extends BaseModelImpl<OfficialUse> implements OfficialUseModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a official use model instance should use the <code>OfficialUse</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_official_use";

	public static final Object[][] TABLE_COLUMNS = {
		{"officialUseId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"receivedBy", Types.VARCHAR},
		{"receivedByDate", Types.TIMESTAMP}, {"verifiedBy", Types.VARCHAR},
		{"verifiedByDate", Types.TIMESTAMP},
		{"applicationAccepted", Types.VARCHAR},
		{"dateCertificateIssued", Types.TIMESTAMP},
		{"certificateNumber", Types.VARCHAR}, {"remarksNotes", Types.VARCHAR},
		{"osiApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("officialUseId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("receivedBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("receivedByDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("verifiedBy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("verifiedByDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("applicationAccepted", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateCertificateIssued", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("certificateNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("remarksNotes", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_official_use (officialUseId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,receivedBy VARCHAR(75) null,receivedByDate DATE null,verifiedBy VARCHAR(75) null,verifiedByDate DATE null,applicationAccepted VARCHAR(75) null,dateCertificateIssued DATE null,certificateNumber VARCHAR(75) null,remarksNotes VARCHAR(500) null,osiApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_official_use";

	public static final String ORDER_BY_JPQL =
		" ORDER BY officialUse.officialUseId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_official_use.officialUseId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long OSIAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long OFFICIALUSEID_COLUMN_BITMASK = 2L;

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

	public OfficialUseModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _officialUseId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOfficialUseId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _officialUseId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OfficialUse.class;
	}

	@Override
	public String getModelClassName() {
		return OfficialUse.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<OfficialUse, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<OfficialUse, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OfficialUse, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((OfficialUse)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OfficialUse, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OfficialUse, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(OfficialUse)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OfficialUse, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OfficialUse, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<OfficialUse, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<OfficialUse, Object>>
				attributeGetterFunctions =
					new LinkedHashMap<String, Function<OfficialUse, Object>>();

			attributeGetterFunctions.put(
				"officialUseId", OfficialUse::getOfficialUseId);
			attributeGetterFunctions.put("groupId", OfficialUse::getGroupId);
			attributeGetterFunctions.put(
				"companyId", OfficialUse::getCompanyId);
			attributeGetterFunctions.put("userId", OfficialUse::getUserId);
			attributeGetterFunctions.put("userName", OfficialUse::getUserName);
			attributeGetterFunctions.put(
				"createDate", OfficialUse::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", OfficialUse::getModifiedDate);
			attributeGetterFunctions.put(
				"receivedBy", OfficialUse::getReceivedBy);
			attributeGetterFunctions.put(
				"receivedByDate", OfficialUse::getReceivedByDate);
			attributeGetterFunctions.put(
				"verifiedBy", OfficialUse::getVerifiedBy);
			attributeGetterFunctions.put(
				"verifiedByDate", OfficialUse::getVerifiedByDate);
			attributeGetterFunctions.put(
				"applicationAccepted", OfficialUse::getApplicationAccepted);
			attributeGetterFunctions.put(
				"dateCertificateIssued", OfficialUse::getDateCertificateIssued);
			attributeGetterFunctions.put(
				"certificateNumber", OfficialUse::getCertificateNumber);
			attributeGetterFunctions.put(
				"remarksNotes", OfficialUse::getRemarksNotes);
			attributeGetterFunctions.put(
				"osiApplicationId", OfficialUse::getOsiApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<OfficialUse, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<OfficialUse, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<OfficialUse, ?>>();

			attributeSetterBiConsumers.put(
				"officialUseId",
				(BiConsumer<OfficialUse, Long>)OfficialUse::setOfficialUseId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<OfficialUse, Long>)OfficialUse::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<OfficialUse, Long>)OfficialUse::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<OfficialUse, Long>)OfficialUse::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<OfficialUse, String>)OfficialUse::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<OfficialUse, Date>)OfficialUse::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<OfficialUse, Date>)OfficialUse::setModifiedDate);
			attributeSetterBiConsumers.put(
				"receivedBy",
				(BiConsumer<OfficialUse, String>)OfficialUse::setReceivedBy);
			attributeSetterBiConsumers.put(
				"receivedByDate",
				(BiConsumer<OfficialUse, Date>)OfficialUse::setReceivedByDate);
			attributeSetterBiConsumers.put(
				"verifiedBy",
				(BiConsumer<OfficialUse, String>)OfficialUse::setVerifiedBy);
			attributeSetterBiConsumers.put(
				"verifiedByDate",
				(BiConsumer<OfficialUse, Date>)OfficialUse::setVerifiedByDate);
			attributeSetterBiConsumers.put(
				"applicationAccepted",
				(BiConsumer<OfficialUse, String>)
					OfficialUse::setApplicationAccepted);
			attributeSetterBiConsumers.put(
				"dateCertificateIssued",
				(BiConsumer<OfficialUse, Date>)
					OfficialUse::setDateCertificateIssued);
			attributeSetterBiConsumers.put(
				"certificateNumber",
				(BiConsumer<OfficialUse, String>)
					OfficialUse::setCertificateNumber);
			attributeSetterBiConsumers.put(
				"remarksNotes",
				(BiConsumer<OfficialUse, String>)OfficialUse::setRemarksNotes);
			attributeSetterBiConsumers.put(
				"osiApplicationId",
				(BiConsumer<OfficialUse, Long>)
					OfficialUse::setOsiApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getOfficialUseId() {
		return _officialUseId;
	}

	@Override
	public void setOfficialUseId(long officialUseId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_officialUseId = officialUseId;
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
	public String getReceivedBy() {
		if (_receivedBy == null) {
			return "";
		}
		else {
			return _receivedBy;
		}
	}

	@Override
	public void setReceivedBy(String receivedBy) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_receivedBy = receivedBy;
	}

	@JSON
	@Override
	public Date getReceivedByDate() {
		return _receivedByDate;
	}

	@Override
	public void setReceivedByDate(Date receivedByDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_receivedByDate = receivedByDate;
	}

	@JSON
	@Override
	public String getVerifiedBy() {
		if (_verifiedBy == null) {
			return "";
		}
		else {
			return _verifiedBy;
		}
	}

	@Override
	public void setVerifiedBy(String verifiedBy) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_verifiedBy = verifiedBy;
	}

	@JSON
	@Override
	public Date getVerifiedByDate() {
		return _verifiedByDate;
	}

	@Override
	public void setVerifiedByDate(Date verifiedByDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_verifiedByDate = verifiedByDate;
	}

	@JSON
	@Override
	public String getApplicationAccepted() {
		if (_applicationAccepted == null) {
			return "";
		}
		else {
			return _applicationAccepted;
		}
	}

	@Override
	public void setApplicationAccepted(String applicationAccepted) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicationAccepted = applicationAccepted;
	}

	@JSON
	@Override
	public Date getDateCertificateIssued() {
		return _dateCertificateIssued;
	}

	@Override
	public void setDateCertificateIssued(Date dateCertificateIssued) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateCertificateIssued = dateCertificateIssued;
	}

	@JSON
	@Override
	public String getCertificateNumber() {
		if (_certificateNumber == null) {
			return "";
		}
		else {
			return _certificateNumber;
		}
	}

	@Override
	public void setCertificateNumber(String certificateNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_certificateNumber = certificateNumber;
	}

	@JSON
	@Override
	public String getRemarksNotes() {
		if (_remarksNotes == null) {
			return "";
		}
		else {
			return _remarksNotes;
		}
	}

	@Override
	public void setRemarksNotes(String remarksNotes) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_remarksNotes = remarksNotes;
	}

	@JSON
	@Override
	public long getOsiApplicationId() {
		return _osiApplicationId;
	}

	@Override
	public void setOsiApplicationId(long osiApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiApplicationId = osiApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalOsiApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("osiApplicationId"));
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
			getCompanyId(), OfficialUse.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OfficialUse toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OfficialUse>
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
		OfficialUseImpl officialUseImpl = new OfficialUseImpl();

		officialUseImpl.setOfficialUseId(getOfficialUseId());
		officialUseImpl.setGroupId(getGroupId());
		officialUseImpl.setCompanyId(getCompanyId());
		officialUseImpl.setUserId(getUserId());
		officialUseImpl.setUserName(getUserName());
		officialUseImpl.setCreateDate(getCreateDate());
		officialUseImpl.setModifiedDate(getModifiedDate());
		officialUseImpl.setReceivedBy(getReceivedBy());
		officialUseImpl.setReceivedByDate(getReceivedByDate());
		officialUseImpl.setVerifiedBy(getVerifiedBy());
		officialUseImpl.setVerifiedByDate(getVerifiedByDate());
		officialUseImpl.setApplicationAccepted(getApplicationAccepted());
		officialUseImpl.setDateCertificateIssued(getDateCertificateIssued());
		officialUseImpl.setCertificateNumber(getCertificateNumber());
		officialUseImpl.setRemarksNotes(getRemarksNotes());
		officialUseImpl.setOsiApplicationId(getOsiApplicationId());

		officialUseImpl.resetOriginalValues();

		return officialUseImpl;
	}

	@Override
	public OfficialUse cloneWithOriginalValues() {
		OfficialUseImpl officialUseImpl = new OfficialUseImpl();

		officialUseImpl.setOfficialUseId(
			this.<Long>getColumnOriginalValue("officialUseId"));
		officialUseImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		officialUseImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		officialUseImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		officialUseImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		officialUseImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		officialUseImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		officialUseImpl.setReceivedBy(
			this.<String>getColumnOriginalValue("receivedBy"));
		officialUseImpl.setReceivedByDate(
			this.<Date>getColumnOriginalValue("receivedByDate"));
		officialUseImpl.setVerifiedBy(
			this.<String>getColumnOriginalValue("verifiedBy"));
		officialUseImpl.setVerifiedByDate(
			this.<Date>getColumnOriginalValue("verifiedByDate"));
		officialUseImpl.setApplicationAccepted(
			this.<String>getColumnOriginalValue("applicationAccepted"));
		officialUseImpl.setDateCertificateIssued(
			this.<Date>getColumnOriginalValue("dateCertificateIssued"));
		officialUseImpl.setCertificateNumber(
			this.<String>getColumnOriginalValue("certificateNumber"));
		officialUseImpl.setRemarksNotes(
			this.<String>getColumnOriginalValue("remarksNotes"));
		officialUseImpl.setOsiApplicationId(
			this.<Long>getColumnOriginalValue("osiApplicationId"));

		return officialUseImpl;
	}

	@Override
	public int compareTo(OfficialUse officialUse) {
		long primaryKey = officialUse.getPrimaryKey();

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

		if (!(object instanceof OfficialUse)) {
			return false;
		}

		OfficialUse officialUse = (OfficialUse)object;

		long primaryKey = officialUse.getPrimaryKey();

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
	public CacheModel<OfficialUse> toCacheModel() {
		OfficialUseCacheModel officialUseCacheModel =
			new OfficialUseCacheModel();

		officialUseCacheModel.officialUseId = getOfficialUseId();

		officialUseCacheModel.groupId = getGroupId();

		officialUseCacheModel.companyId = getCompanyId();

		officialUseCacheModel.userId = getUserId();

		officialUseCacheModel.userName = getUserName();

		String userName = officialUseCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			officialUseCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			officialUseCacheModel.createDate = createDate.getTime();
		}
		else {
			officialUseCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			officialUseCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			officialUseCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		officialUseCacheModel.receivedBy = getReceivedBy();

		String receivedBy = officialUseCacheModel.receivedBy;

		if ((receivedBy != null) && (receivedBy.length() == 0)) {
			officialUseCacheModel.receivedBy = null;
		}

		Date receivedByDate = getReceivedByDate();

		if (receivedByDate != null) {
			officialUseCacheModel.receivedByDate = receivedByDate.getTime();
		}
		else {
			officialUseCacheModel.receivedByDate = Long.MIN_VALUE;
		}

		officialUseCacheModel.verifiedBy = getVerifiedBy();

		String verifiedBy = officialUseCacheModel.verifiedBy;

		if ((verifiedBy != null) && (verifiedBy.length() == 0)) {
			officialUseCacheModel.verifiedBy = null;
		}

		Date verifiedByDate = getVerifiedByDate();

		if (verifiedByDate != null) {
			officialUseCacheModel.verifiedByDate = verifiedByDate.getTime();
		}
		else {
			officialUseCacheModel.verifiedByDate = Long.MIN_VALUE;
		}

		officialUseCacheModel.applicationAccepted = getApplicationAccepted();

		String applicationAccepted = officialUseCacheModel.applicationAccepted;

		if ((applicationAccepted != null) &&
			(applicationAccepted.length() == 0)) {

			officialUseCacheModel.applicationAccepted = null;
		}

		Date dateCertificateIssued = getDateCertificateIssued();

		if (dateCertificateIssued != null) {
			officialUseCacheModel.dateCertificateIssued =
				dateCertificateIssued.getTime();
		}
		else {
			officialUseCacheModel.dateCertificateIssued = Long.MIN_VALUE;
		}

		officialUseCacheModel.certificateNumber = getCertificateNumber();

		String certificateNumber = officialUseCacheModel.certificateNumber;

		if ((certificateNumber != null) && (certificateNumber.length() == 0)) {
			officialUseCacheModel.certificateNumber = null;
		}

		officialUseCacheModel.remarksNotes = getRemarksNotes();

		String remarksNotes = officialUseCacheModel.remarksNotes;

		if ((remarksNotes != null) && (remarksNotes.length() == 0)) {
			officialUseCacheModel.remarksNotes = null;
		}

		officialUseCacheModel.osiApplicationId = getOsiApplicationId();

		return officialUseCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OfficialUse, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<OfficialUse, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OfficialUse, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((OfficialUse)this);

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

		private static final Function<InvocationHandler, OfficialUse>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					OfficialUse.class, ModelWrapper.class);

	}

	private long _officialUseId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _receivedBy;
	private Date _receivedByDate;
	private String _verifiedBy;
	private Date _verifiedByDate;
	private String _applicationAccepted;
	private Date _dateCertificateIssued;
	private String _certificateNumber;
	private String _remarksNotes;
	private long _osiApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<OfficialUse, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((OfficialUse)this);
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

		_columnOriginalValues.put("officialUseId", _officialUseId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("receivedBy", _receivedBy);
		_columnOriginalValues.put("receivedByDate", _receivedByDate);
		_columnOriginalValues.put("verifiedBy", _verifiedBy);
		_columnOriginalValues.put("verifiedByDate", _verifiedByDate);
		_columnOriginalValues.put("applicationAccepted", _applicationAccepted);
		_columnOriginalValues.put(
			"dateCertificateIssued", _dateCertificateIssued);
		_columnOriginalValues.put("certificateNumber", _certificateNumber);
		_columnOriginalValues.put("remarksNotes", _remarksNotes);
		_columnOriginalValues.put("osiApplicationId", _osiApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("officialUseId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("receivedBy", 128L);

		columnBitmasks.put("receivedByDate", 256L);

		columnBitmasks.put("verifiedBy", 512L);

		columnBitmasks.put("verifiedByDate", 1024L);

		columnBitmasks.put("applicationAccepted", 2048L);

		columnBitmasks.put("dateCertificateIssued", 4096L);

		columnBitmasks.put("certificateNumber", 8192L);

		columnBitmasks.put("remarksNotes", 16384L);

		columnBitmasks.put("osiApplicationId", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private OfficialUse _escapedModel;

}