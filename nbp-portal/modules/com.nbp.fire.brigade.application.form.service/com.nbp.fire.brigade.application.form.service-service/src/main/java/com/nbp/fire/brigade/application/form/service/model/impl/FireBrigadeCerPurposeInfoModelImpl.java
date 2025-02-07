/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model.impl;

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

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfoModel;

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
 * The base model implementation for the FireBrigadeCerPurposeInfo service. Represents a row in the &quot;nbp_fire_certi_purpose_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>FireBrigadeCerPurposeInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FireBrigadeCerPurposeInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCerPurposeInfoImpl
 * @generated
 */
@JSON(strict = true)
public class FireBrigadeCerPurposeInfoModelImpl
	extends BaseModelImpl<FireBrigadeCerPurposeInfo>
	implements FireBrigadeCerPurposeInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fire brigade cer purpose info model instance should use the <code>FireBrigadeCerPurposeInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_fire_certi_purpose_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"fireBrigadeCerPurposeInfoId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"certificatePurposePre", Types.VARCHAR},
		{"otherCertificatePurpose", Types.VARCHAR},
		{"fireBrigadeApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("fireBrigadeCerPurposeInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("certificatePurposePre", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("otherCertificatePurpose", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fireBrigadeApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_fire_certi_purpose_info (fireBrigadeCerPurposeInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,certificatePurposePre VARCHAR(1000) null,otherCertificatePurpose VARCHAR(75) null,fireBrigadeApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_fire_certi_purpose_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY fireBrigadeCerPurposeInfo.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_fire_certi_purpose_info.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long FIREBRIGADEAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public FireBrigadeCerPurposeInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _fireBrigadeCerPurposeInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFireBrigadeCerPurposeInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fireBrigadeCerPurposeInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FireBrigadeCerPurposeInfo.class;
	}

	@Override
	public String getModelClassName() {
		return FireBrigadeCerPurposeInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<FireBrigadeCerPurposeInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<FireBrigadeCerPurposeInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FireBrigadeCerPurposeInfo, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((FireBrigadeCerPurposeInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<FireBrigadeCerPurposeInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<FireBrigadeCerPurposeInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(FireBrigadeCerPurposeInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<FireBrigadeCerPurposeInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<FireBrigadeCerPurposeInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<FireBrigadeCerPurposeInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<FireBrigadeCerPurposeInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<FireBrigadeCerPurposeInfo, Object>>();

			attributeGetterFunctions.put(
				"fireBrigadeCerPurposeInfoId",
				FireBrigadeCerPurposeInfo::getFireBrigadeCerPurposeInfoId);
			attributeGetterFunctions.put(
				"groupId", FireBrigadeCerPurposeInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", FireBrigadeCerPurposeInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", FireBrigadeCerPurposeInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", FireBrigadeCerPurposeInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", FireBrigadeCerPurposeInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", FireBrigadeCerPurposeInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"certificatePurposePre",
				FireBrigadeCerPurposeInfo::getCertificatePurposePre);
			attributeGetterFunctions.put(
				"otherCertificatePurpose",
				FireBrigadeCerPurposeInfo::getOtherCertificatePurpose);
			attributeGetterFunctions.put(
				"fireBrigadeApplicationId",
				FireBrigadeCerPurposeInfo::getFireBrigadeApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<FireBrigadeCerPurposeInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<FireBrigadeCerPurposeInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<FireBrigadeCerPurposeInfo, ?>>();

			attributeSetterBiConsumers.put(
				"fireBrigadeCerPurposeInfoId",
				(BiConsumer<FireBrigadeCerPurposeInfo, Long>)
					FireBrigadeCerPurposeInfo::setFireBrigadeCerPurposeInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<FireBrigadeCerPurposeInfo, Long>)
					FireBrigadeCerPurposeInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<FireBrigadeCerPurposeInfo, Long>)
					FireBrigadeCerPurposeInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<FireBrigadeCerPurposeInfo, Long>)
					FireBrigadeCerPurposeInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<FireBrigadeCerPurposeInfo, String>)
					FireBrigadeCerPurposeInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<FireBrigadeCerPurposeInfo, Date>)
					FireBrigadeCerPurposeInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<FireBrigadeCerPurposeInfo, Date>)
					FireBrigadeCerPurposeInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"certificatePurposePre",
				(BiConsumer<FireBrigadeCerPurposeInfo, String>)
					FireBrigadeCerPurposeInfo::setCertificatePurposePre);
			attributeSetterBiConsumers.put(
				"otherCertificatePurpose",
				(BiConsumer<FireBrigadeCerPurposeInfo, String>)
					FireBrigadeCerPurposeInfo::setOtherCertificatePurpose);
			attributeSetterBiConsumers.put(
				"fireBrigadeApplicationId",
				(BiConsumer<FireBrigadeCerPurposeInfo, Long>)
					FireBrigadeCerPurposeInfo::setFireBrigadeApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getFireBrigadeCerPurposeInfoId() {
		return _fireBrigadeCerPurposeInfoId;
	}

	@Override
	public void setFireBrigadeCerPurposeInfoId(
		long fireBrigadeCerPurposeInfoId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fireBrigadeCerPurposeInfoId = fireBrigadeCerPurposeInfoId;
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
	public String getCertificatePurposePre() {
		if (_certificatePurposePre == null) {
			return "";
		}
		else {
			return _certificatePurposePre;
		}
	}

	@Override
	public void setCertificatePurposePre(String certificatePurposePre) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_certificatePurposePre = certificatePurposePre;
	}

	@JSON
	@Override
	public String getOtherCertificatePurpose() {
		if (_otherCertificatePurpose == null) {
			return "";
		}
		else {
			return _otherCertificatePurpose;
		}
	}

	@Override
	public void setOtherCertificatePurpose(String otherCertificatePurpose) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_otherCertificatePurpose = otherCertificatePurpose;
	}

	@JSON
	@Override
	public long getFireBrigadeApplicationId() {
		return _fireBrigadeApplicationId;
	}

	@Override
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fireBrigadeApplicationId = fireBrigadeApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalFireBrigadeApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("fireBrigadeApplicationId"));
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
			getCompanyId(), FireBrigadeCerPurposeInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FireBrigadeCerPurposeInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, FireBrigadeCerPurposeInfo>
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
		FireBrigadeCerPurposeInfoImpl fireBrigadeCerPurposeInfoImpl =
			new FireBrigadeCerPurposeInfoImpl();

		fireBrigadeCerPurposeInfoImpl.setFireBrigadeCerPurposeInfoId(
			getFireBrigadeCerPurposeInfoId());
		fireBrigadeCerPurposeInfoImpl.setGroupId(getGroupId());
		fireBrigadeCerPurposeInfoImpl.setCompanyId(getCompanyId());
		fireBrigadeCerPurposeInfoImpl.setUserId(getUserId());
		fireBrigadeCerPurposeInfoImpl.setUserName(getUserName());
		fireBrigadeCerPurposeInfoImpl.setCreateDate(getCreateDate());
		fireBrigadeCerPurposeInfoImpl.setModifiedDate(getModifiedDate());
		fireBrigadeCerPurposeInfoImpl.setCertificatePurposePre(
			getCertificatePurposePre());
		fireBrigadeCerPurposeInfoImpl.setOtherCertificatePurpose(
			getOtherCertificatePurpose());
		fireBrigadeCerPurposeInfoImpl.setFireBrigadeApplicationId(
			getFireBrigadeApplicationId());

		fireBrigadeCerPurposeInfoImpl.resetOriginalValues();

		return fireBrigadeCerPurposeInfoImpl;
	}

	@Override
	public FireBrigadeCerPurposeInfo cloneWithOriginalValues() {
		FireBrigadeCerPurposeInfoImpl fireBrigadeCerPurposeInfoImpl =
			new FireBrigadeCerPurposeInfoImpl();

		fireBrigadeCerPurposeInfoImpl.setFireBrigadeCerPurposeInfoId(
			this.<Long>getColumnOriginalValue("fireBrigadeCerPurposeInfoId"));
		fireBrigadeCerPurposeInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		fireBrigadeCerPurposeInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		fireBrigadeCerPurposeInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		fireBrigadeCerPurposeInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		fireBrigadeCerPurposeInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		fireBrigadeCerPurposeInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		fireBrigadeCerPurposeInfoImpl.setCertificatePurposePre(
			this.<String>getColumnOriginalValue("certificatePurposePre"));
		fireBrigadeCerPurposeInfoImpl.setOtherCertificatePurpose(
			this.<String>getColumnOriginalValue("otherCertificatePurpose"));
		fireBrigadeCerPurposeInfoImpl.setFireBrigadeApplicationId(
			this.<Long>getColumnOriginalValue("fireBrigadeApplicationId"));

		return fireBrigadeCerPurposeInfoImpl;
	}

	@Override
	public int compareTo(FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), fireBrigadeCerPurposeInfo.getCreateDate());

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

		if (!(object instanceof FireBrigadeCerPurposeInfo)) {
			return false;
		}

		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo =
			(FireBrigadeCerPurposeInfo)object;

		long primaryKey = fireBrigadeCerPurposeInfo.getPrimaryKey();

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
	public CacheModel<FireBrigadeCerPurposeInfo> toCacheModel() {
		FireBrigadeCerPurposeInfoCacheModel
			fireBrigadeCerPurposeInfoCacheModel =
				new FireBrigadeCerPurposeInfoCacheModel();

		fireBrigadeCerPurposeInfoCacheModel.fireBrigadeCerPurposeInfoId =
			getFireBrigadeCerPurposeInfoId();

		fireBrigadeCerPurposeInfoCacheModel.groupId = getGroupId();

		fireBrigadeCerPurposeInfoCacheModel.companyId = getCompanyId();

		fireBrigadeCerPurposeInfoCacheModel.userId = getUserId();

		fireBrigadeCerPurposeInfoCacheModel.userName = getUserName();

		String userName = fireBrigadeCerPurposeInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			fireBrigadeCerPurposeInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			fireBrigadeCerPurposeInfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			fireBrigadeCerPurposeInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			fireBrigadeCerPurposeInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			fireBrigadeCerPurposeInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		fireBrigadeCerPurposeInfoCacheModel.certificatePurposePre =
			getCertificatePurposePre();

		String certificatePurposePre =
			fireBrigadeCerPurposeInfoCacheModel.certificatePurposePre;

		if ((certificatePurposePre != null) &&
			(certificatePurposePre.length() == 0)) {

			fireBrigadeCerPurposeInfoCacheModel.certificatePurposePre = null;
		}

		fireBrigadeCerPurposeInfoCacheModel.otherCertificatePurpose =
			getOtherCertificatePurpose();

		String otherCertificatePurpose =
			fireBrigadeCerPurposeInfoCacheModel.otherCertificatePurpose;

		if ((otherCertificatePurpose != null) &&
			(otherCertificatePurpose.length() == 0)) {

			fireBrigadeCerPurposeInfoCacheModel.otherCertificatePurpose = null;
		}

		fireBrigadeCerPurposeInfoCacheModel.fireBrigadeApplicationId =
			getFireBrigadeApplicationId();

		return fireBrigadeCerPurposeInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<FireBrigadeCerPurposeInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<FireBrigadeCerPurposeInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FireBrigadeCerPurposeInfo, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(FireBrigadeCerPurposeInfo)this);

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
			<InvocationHandler, FireBrigadeCerPurposeInfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						FireBrigadeCerPurposeInfo.class, ModelWrapper.class);

	}

	private long _fireBrigadeCerPurposeInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _certificatePurposePre;
	private String _otherCertificatePurpose;
	private long _fireBrigadeApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<FireBrigadeCerPurposeInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((FireBrigadeCerPurposeInfo)this);
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
			"fireBrigadeCerPurposeInfoId", _fireBrigadeCerPurposeInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"certificatePurposePre", _certificatePurposePre);
		_columnOriginalValues.put(
			"otherCertificatePurpose", _otherCertificatePurpose);
		_columnOriginalValues.put(
			"fireBrigadeApplicationId", _fireBrigadeApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("fireBrigadeCerPurposeInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("certificatePurposePre", 128L);

		columnBitmasks.put("otherCertificatePurpose", 256L);

		columnBitmasks.put("fireBrigadeApplicationId", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private FireBrigadeCerPurposeInfo _escapedModel;

}