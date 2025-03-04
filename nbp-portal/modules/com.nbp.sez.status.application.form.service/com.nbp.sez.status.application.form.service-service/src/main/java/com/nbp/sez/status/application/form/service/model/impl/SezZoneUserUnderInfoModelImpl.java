/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

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

import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfoModel;

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
 * The base model implementation for the SezZoneUserUnderInfo service. Represents a row in the &quot;nbp_sez_zone_user_under_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezZoneUserUnderInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezZoneUserUnderInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfoImpl
 * @generated
 */
@JSON(strict = true)
public class SezZoneUserUnderInfoModelImpl
	extends BaseModelImpl<SezZoneUserUnderInfo>
	implements SezZoneUserUnderInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez zone user under info model instance should use the <code>SezZoneUserUnderInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_zone_user_under_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezZoneUserUnderInfoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"declarantTitle", Types.VARCHAR},
		{"declarantName", Types.VARCHAR}, {"declarantTeleNum", Types.VARCHAR},
		{"declarantEmail", Types.VARCHAR},
		{"applicantSignatureDate", Types.TIMESTAMP},
		{"publicNotaryName", Types.VARCHAR},
		{"publicNotarySignatureDate", Types.TIMESTAMP},
		{"sezStatusApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezZoneUserUnderInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("declarantTitle", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("declarantName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("declarantTeleNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("declarantEmail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicantSignatureDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("publicNotaryName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("publicNotarySignatureDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("sezStatusApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_zone_user_under_info (sezZoneUserUnderInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,declarantTitle VARCHAR(75) null,declarantName VARCHAR(75) null,declarantTeleNum VARCHAR(75) null,declarantEmail VARCHAR(75) null,applicantSignatureDate DATE null,publicNotaryName VARCHAR(75) null,publicNotarySignatureDate DATE null,sezStatusApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_zone_user_under_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezZoneUserUnderInfo.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_zone_user_under_info.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long SEZSTATUSAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 2L;

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

	public SezZoneUserUnderInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezZoneUserUnderInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezZoneUserUnderInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezZoneUserUnderInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezZoneUserUnderInfo.class;
	}

	@Override
	public String getModelClassName() {
		return SezZoneUserUnderInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezZoneUserUnderInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezZoneUserUnderInfo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezZoneUserUnderInfo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezZoneUserUnderInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezZoneUserUnderInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezZoneUserUnderInfo, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezZoneUserUnderInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezZoneUserUnderInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezZoneUserUnderInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<SezZoneUserUnderInfo, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<SezZoneUserUnderInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezZoneUserUnderInfo, Object>>();

			attributeGetterFunctions.put(
				"sezZoneUserUnderInfoId",
				SezZoneUserUnderInfo::getSezZoneUserUnderInfoId);
			attributeGetterFunctions.put(
				"groupId", SezZoneUserUnderInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezZoneUserUnderInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezZoneUserUnderInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", SezZoneUserUnderInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezZoneUserUnderInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezZoneUserUnderInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"declarantTitle", SezZoneUserUnderInfo::getDeclarantTitle);
			attributeGetterFunctions.put(
				"declarantName", SezZoneUserUnderInfo::getDeclarantName);
			attributeGetterFunctions.put(
				"declarantTeleNum", SezZoneUserUnderInfo::getDeclarantTeleNum);
			attributeGetterFunctions.put(
				"declarantEmail", SezZoneUserUnderInfo::getDeclarantEmail);
			attributeGetterFunctions.put(
				"applicantSignatureDate",
				SezZoneUserUnderInfo::getApplicantSignatureDate);
			attributeGetterFunctions.put(
				"publicNotaryName", SezZoneUserUnderInfo::getPublicNotaryName);
			attributeGetterFunctions.put(
				"publicNotarySignatureDate",
				SezZoneUserUnderInfo::getPublicNotarySignatureDate);
			attributeGetterFunctions.put(
				"sezStatusApplicationId",
				SezZoneUserUnderInfo::getSezStatusApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<SezZoneUserUnderInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezZoneUserUnderInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezZoneUserUnderInfo, ?>>();

			attributeSetterBiConsumers.put(
				"sezZoneUserUnderInfoId",
				(BiConsumer<SezZoneUserUnderInfo, Long>)
					SezZoneUserUnderInfo::setSezZoneUserUnderInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezZoneUserUnderInfo, Long>)
					SezZoneUserUnderInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezZoneUserUnderInfo, Long>)
					SezZoneUserUnderInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezZoneUserUnderInfo, Long>)
					SezZoneUserUnderInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezZoneUserUnderInfo, String>)
					SezZoneUserUnderInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezZoneUserUnderInfo, Date>)
					SezZoneUserUnderInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezZoneUserUnderInfo, Date>)
					SezZoneUserUnderInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"declarantTitle",
				(BiConsumer<SezZoneUserUnderInfo, String>)
					SezZoneUserUnderInfo::setDeclarantTitle);
			attributeSetterBiConsumers.put(
				"declarantName",
				(BiConsumer<SezZoneUserUnderInfo, String>)
					SezZoneUserUnderInfo::setDeclarantName);
			attributeSetterBiConsumers.put(
				"declarantTeleNum",
				(BiConsumer<SezZoneUserUnderInfo, String>)
					SezZoneUserUnderInfo::setDeclarantTeleNum);
			attributeSetterBiConsumers.put(
				"declarantEmail",
				(BiConsumer<SezZoneUserUnderInfo, String>)
					SezZoneUserUnderInfo::setDeclarantEmail);
			attributeSetterBiConsumers.put(
				"applicantSignatureDate",
				(BiConsumer<SezZoneUserUnderInfo, Date>)
					SezZoneUserUnderInfo::setApplicantSignatureDate);
			attributeSetterBiConsumers.put(
				"publicNotaryName",
				(BiConsumer<SezZoneUserUnderInfo, String>)
					SezZoneUserUnderInfo::setPublicNotaryName);
			attributeSetterBiConsumers.put(
				"publicNotarySignatureDate",
				(BiConsumer<SezZoneUserUnderInfo, Date>)
					SezZoneUserUnderInfo::setPublicNotarySignatureDate);
			attributeSetterBiConsumers.put(
				"sezStatusApplicationId",
				(BiConsumer<SezZoneUserUnderInfo, Long>)
					SezZoneUserUnderInfo::setSezStatusApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezZoneUserUnderInfoId() {
		return _sezZoneUserUnderInfoId;
	}

	@Override
	public void setSezZoneUserUnderInfoId(long sezZoneUserUnderInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezZoneUserUnderInfoId = sezZoneUserUnderInfoId;
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
	public String getDeclarantTitle() {
		if (_declarantTitle == null) {
			return "";
		}
		else {
			return _declarantTitle;
		}
	}

	@Override
	public void setDeclarantTitle(String declarantTitle) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_declarantTitle = declarantTitle;
	}

	@JSON
	@Override
	public String getDeclarantName() {
		if (_declarantName == null) {
			return "";
		}
		else {
			return _declarantName;
		}
	}

	@Override
	public void setDeclarantName(String declarantName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_declarantName = declarantName;
	}

	@JSON
	@Override
	public String getDeclarantTeleNum() {
		if (_declarantTeleNum == null) {
			return "";
		}
		else {
			return _declarantTeleNum;
		}
	}

	@Override
	public void setDeclarantTeleNum(String declarantTeleNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_declarantTeleNum = declarantTeleNum;
	}

	@JSON
	@Override
	public String getDeclarantEmail() {
		if (_declarantEmail == null) {
			return "";
		}
		else {
			return _declarantEmail;
		}
	}

	@Override
	public void setDeclarantEmail(String declarantEmail) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_declarantEmail = declarantEmail;
	}

	@JSON
	@Override
	public Date getApplicantSignatureDate() {
		return _applicantSignatureDate;
	}

	@Override
	public void setApplicantSignatureDate(Date applicantSignatureDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicantSignatureDate = applicantSignatureDate;
	}

	@JSON
	@Override
	public String getPublicNotaryName() {
		if (_publicNotaryName == null) {
			return "";
		}
		else {
			return _publicNotaryName;
		}
	}

	@Override
	public void setPublicNotaryName(String publicNotaryName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_publicNotaryName = publicNotaryName;
	}

	@JSON
	@Override
	public Date getPublicNotarySignatureDate() {
		return _publicNotarySignatureDate;
	}

	@Override
	public void setPublicNotarySignatureDate(Date publicNotarySignatureDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_publicNotarySignatureDate = publicNotarySignatureDate;
	}

	@JSON
	@Override
	public long getSezStatusApplicationId() {
		return _sezStatusApplicationId;
	}

	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezStatusApplicationId = sezStatusApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalSezStatusApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));
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
			getCompanyId(), SezZoneUserUnderInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezZoneUserUnderInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezZoneUserUnderInfo>
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
		SezZoneUserUnderInfoImpl sezZoneUserUnderInfoImpl =
			new SezZoneUserUnderInfoImpl();

		sezZoneUserUnderInfoImpl.setSezZoneUserUnderInfoId(
			getSezZoneUserUnderInfoId());
		sezZoneUserUnderInfoImpl.setGroupId(getGroupId());
		sezZoneUserUnderInfoImpl.setCompanyId(getCompanyId());
		sezZoneUserUnderInfoImpl.setUserId(getUserId());
		sezZoneUserUnderInfoImpl.setUserName(getUserName());
		sezZoneUserUnderInfoImpl.setCreateDate(getCreateDate());
		sezZoneUserUnderInfoImpl.setModifiedDate(getModifiedDate());
		sezZoneUserUnderInfoImpl.setDeclarantTitle(getDeclarantTitle());
		sezZoneUserUnderInfoImpl.setDeclarantName(getDeclarantName());
		sezZoneUserUnderInfoImpl.setDeclarantTeleNum(getDeclarantTeleNum());
		sezZoneUserUnderInfoImpl.setDeclarantEmail(getDeclarantEmail());
		sezZoneUserUnderInfoImpl.setApplicantSignatureDate(
			getApplicantSignatureDate());
		sezZoneUserUnderInfoImpl.setPublicNotaryName(getPublicNotaryName());
		sezZoneUserUnderInfoImpl.setPublicNotarySignatureDate(
			getPublicNotarySignatureDate());
		sezZoneUserUnderInfoImpl.setSezStatusApplicationId(
			getSezStatusApplicationId());

		sezZoneUserUnderInfoImpl.resetOriginalValues();

		return sezZoneUserUnderInfoImpl;
	}

	@Override
	public SezZoneUserUnderInfo cloneWithOriginalValues() {
		SezZoneUserUnderInfoImpl sezZoneUserUnderInfoImpl =
			new SezZoneUserUnderInfoImpl();

		sezZoneUserUnderInfoImpl.setSezZoneUserUnderInfoId(
			this.<Long>getColumnOriginalValue("sezZoneUserUnderInfoId"));
		sezZoneUserUnderInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezZoneUserUnderInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezZoneUserUnderInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezZoneUserUnderInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezZoneUserUnderInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezZoneUserUnderInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezZoneUserUnderInfoImpl.setDeclarantTitle(
			this.<String>getColumnOriginalValue("declarantTitle"));
		sezZoneUserUnderInfoImpl.setDeclarantName(
			this.<String>getColumnOriginalValue("declarantName"));
		sezZoneUserUnderInfoImpl.setDeclarantTeleNum(
			this.<String>getColumnOriginalValue("declarantTeleNum"));
		sezZoneUserUnderInfoImpl.setDeclarantEmail(
			this.<String>getColumnOriginalValue("declarantEmail"));
		sezZoneUserUnderInfoImpl.setApplicantSignatureDate(
			this.<Date>getColumnOriginalValue("applicantSignatureDate"));
		sezZoneUserUnderInfoImpl.setPublicNotaryName(
			this.<String>getColumnOriginalValue("publicNotaryName"));
		sezZoneUserUnderInfoImpl.setPublicNotarySignatureDate(
			this.<Date>getColumnOriginalValue("publicNotarySignatureDate"));
		sezZoneUserUnderInfoImpl.setSezStatusApplicationId(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));

		return sezZoneUserUnderInfoImpl;
	}

	@Override
	public int compareTo(SezZoneUserUnderInfo sezZoneUserUnderInfo) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezZoneUserUnderInfo.getCreateDate());

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

		if (!(object instanceof SezZoneUserUnderInfo)) {
			return false;
		}

		SezZoneUserUnderInfo sezZoneUserUnderInfo =
			(SezZoneUserUnderInfo)object;

		long primaryKey = sezZoneUserUnderInfo.getPrimaryKey();

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
	public CacheModel<SezZoneUserUnderInfo> toCacheModel() {
		SezZoneUserUnderInfoCacheModel sezZoneUserUnderInfoCacheModel =
			new SezZoneUserUnderInfoCacheModel();

		sezZoneUserUnderInfoCacheModel.sezZoneUserUnderInfoId =
			getSezZoneUserUnderInfoId();

		sezZoneUserUnderInfoCacheModel.groupId = getGroupId();

		sezZoneUserUnderInfoCacheModel.companyId = getCompanyId();

		sezZoneUserUnderInfoCacheModel.userId = getUserId();

		sezZoneUserUnderInfoCacheModel.userName = getUserName();

		String userName = sezZoneUserUnderInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezZoneUserUnderInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezZoneUserUnderInfoCacheModel.createDate = createDate.getTime();
		}
		else {
			sezZoneUserUnderInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezZoneUserUnderInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			sezZoneUserUnderInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezZoneUserUnderInfoCacheModel.declarantTitle = getDeclarantTitle();

		String declarantTitle = sezZoneUserUnderInfoCacheModel.declarantTitle;

		if ((declarantTitle != null) && (declarantTitle.length() == 0)) {
			sezZoneUserUnderInfoCacheModel.declarantTitle = null;
		}

		sezZoneUserUnderInfoCacheModel.declarantName = getDeclarantName();

		String declarantName = sezZoneUserUnderInfoCacheModel.declarantName;

		if ((declarantName != null) && (declarantName.length() == 0)) {
			sezZoneUserUnderInfoCacheModel.declarantName = null;
		}

		sezZoneUserUnderInfoCacheModel.declarantTeleNum = getDeclarantTeleNum();

		String declarantTeleNum =
			sezZoneUserUnderInfoCacheModel.declarantTeleNum;

		if ((declarantTeleNum != null) && (declarantTeleNum.length() == 0)) {
			sezZoneUserUnderInfoCacheModel.declarantTeleNum = null;
		}

		sezZoneUserUnderInfoCacheModel.declarantEmail = getDeclarantEmail();

		String declarantEmail = sezZoneUserUnderInfoCacheModel.declarantEmail;

		if ((declarantEmail != null) && (declarantEmail.length() == 0)) {
			sezZoneUserUnderInfoCacheModel.declarantEmail = null;
		}

		Date applicantSignatureDate = getApplicantSignatureDate();

		if (applicantSignatureDate != null) {
			sezZoneUserUnderInfoCacheModel.applicantSignatureDate =
				applicantSignatureDate.getTime();
		}
		else {
			sezZoneUserUnderInfoCacheModel.applicantSignatureDate =
				Long.MIN_VALUE;
		}

		sezZoneUserUnderInfoCacheModel.publicNotaryName = getPublicNotaryName();

		String publicNotaryName =
			sezZoneUserUnderInfoCacheModel.publicNotaryName;

		if ((publicNotaryName != null) && (publicNotaryName.length() == 0)) {
			sezZoneUserUnderInfoCacheModel.publicNotaryName = null;
		}

		Date publicNotarySignatureDate = getPublicNotarySignatureDate();

		if (publicNotarySignatureDate != null) {
			sezZoneUserUnderInfoCacheModel.publicNotarySignatureDate =
				publicNotarySignatureDate.getTime();
		}
		else {
			sezZoneUserUnderInfoCacheModel.publicNotarySignatureDate =
				Long.MIN_VALUE;
		}

		sezZoneUserUnderInfoCacheModel.sezStatusApplicationId =
			getSezStatusApplicationId();

		return sezZoneUserUnderInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezZoneUserUnderInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezZoneUserUnderInfo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezZoneUserUnderInfo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezZoneUserUnderInfo)this);

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

		private static final Function<InvocationHandler, SezZoneUserUnderInfo>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					SezZoneUserUnderInfo.class, ModelWrapper.class);

	}

	private long _sezZoneUserUnderInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _declarantTitle;
	private String _declarantName;
	private String _declarantTeleNum;
	private String _declarantEmail;
	private Date _applicantSignatureDate;
	private String _publicNotaryName;
	private Date _publicNotarySignatureDate;
	private long _sezStatusApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<SezZoneUserUnderInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezZoneUserUnderInfo)this);
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
			"sezZoneUserUnderInfoId", _sezZoneUserUnderInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("declarantTitle", _declarantTitle);
		_columnOriginalValues.put("declarantName", _declarantName);
		_columnOriginalValues.put("declarantTeleNum", _declarantTeleNum);
		_columnOriginalValues.put("declarantEmail", _declarantEmail);
		_columnOriginalValues.put(
			"applicantSignatureDate", _applicantSignatureDate);
		_columnOriginalValues.put("publicNotaryName", _publicNotaryName);
		_columnOriginalValues.put(
			"publicNotarySignatureDate", _publicNotarySignatureDate);
		_columnOriginalValues.put(
			"sezStatusApplicationId", _sezStatusApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("sezZoneUserUnderInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("declarantTitle", 128L);

		columnBitmasks.put("declarantName", 256L);

		columnBitmasks.put("declarantTeleNum", 512L);

		columnBitmasks.put("declarantEmail", 1024L);

		columnBitmasks.put("applicantSignatureDate", 2048L);

		columnBitmasks.put("publicNotaryName", 4096L);

		columnBitmasks.put("publicNotarySignatureDate", 8192L);

		columnBitmasks.put("sezStatusApplicationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezZoneUserUnderInfo _escapedModel;

}