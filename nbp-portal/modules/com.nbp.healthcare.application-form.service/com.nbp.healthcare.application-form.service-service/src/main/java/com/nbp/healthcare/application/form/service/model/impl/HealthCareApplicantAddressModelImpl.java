/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model.impl;

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

import com.nbp.healthcare.application.form.service.model.HealthCareApplicantAddress;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantAddressModel;

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
 * The base model implementation for the HealthCareApplicantAddress service. Represents a row in the &quot;nbp_healthcare_applicant_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>HealthCareApplicantAddressModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HealthCareApplicantAddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantAddressImpl
 * @generated
 */
@JSON(strict = true)
public class HealthCareApplicantAddressModelImpl
	extends BaseModelImpl<HealthCareApplicantAddress>
	implements HealthCareApplicantAddressModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a health care applicant address model instance should use the <code>HealthCareApplicantAddress</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_healthcare_applicant_add";

	public static final Object[][] TABLE_COLUMNS = {
		{"healthCareApplicantAddressId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"applicantMailingAddress", Types.VARCHAR},
		{"healthCareApplicationId", Types.BIGINT},
		{"healthCareApplicantInfoId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("healthCareApplicantAddressId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("applicantMailingAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("healthCareApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("healthCareApplicantInfoId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_healthcare_applicant_add (healthCareApplicantAddressId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,applicantMailingAddress VARCHAR(500) null,healthCareApplicationId LONG,healthCareApplicantInfoId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_healthcare_applicant_add";

	public static final String ORDER_BY_JPQL =
		" ORDER BY healthCareApplicantAddress.healthCareApplicantAddressId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_healthcare_applicant_add.healthCareApplicantAddressId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long HEALTHCAREAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long HEALTHCAREAPPLICANTADDRESSID_COLUMN_BITMASK = 2L;

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

	public HealthCareApplicantAddressModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _healthCareApplicantAddressId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setHealthCareApplicantAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _healthCareApplicantAddressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return HealthCareApplicantAddress.class;
	}

	@Override
	public String getModelClassName() {
		return HealthCareApplicantAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<HealthCareApplicantAddress, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<HealthCareApplicantAddress, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<HealthCareApplicantAddress, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(HealthCareApplicantAddress)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<HealthCareApplicantAddress, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<HealthCareApplicantAddress, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(HealthCareApplicantAddress)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<HealthCareApplicantAddress, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<HealthCareApplicantAddress, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<HealthCareApplicantAddress, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<HealthCareApplicantAddress, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<HealthCareApplicantAddress, Object>>();

			attributeGetterFunctions.put(
				"healthCareApplicantAddressId",
				HealthCareApplicantAddress::getHealthCareApplicantAddressId);
			attributeGetterFunctions.put(
				"groupId", HealthCareApplicantAddress::getGroupId);
			attributeGetterFunctions.put(
				"companyId", HealthCareApplicantAddress::getCompanyId);
			attributeGetterFunctions.put(
				"userId", HealthCareApplicantAddress::getUserId);
			attributeGetterFunctions.put(
				"userName", HealthCareApplicantAddress::getUserName);
			attributeGetterFunctions.put(
				"createDate", HealthCareApplicantAddress::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", HealthCareApplicantAddress::getModifiedDate);
			attributeGetterFunctions.put(
				"applicantMailingAddress",
				HealthCareApplicantAddress::getApplicantMailingAddress);
			attributeGetterFunctions.put(
				"healthCareApplicationId",
				HealthCareApplicantAddress::getHealthCareApplicationId);
			attributeGetterFunctions.put(
				"healthCareApplicantInfoId",
				HealthCareApplicantAddress::getHealthCareApplicantInfoId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<HealthCareApplicantAddress, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<HealthCareApplicantAddress, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<HealthCareApplicantAddress, ?>>();

			attributeSetterBiConsumers.put(
				"healthCareApplicantAddressId",
				(BiConsumer<HealthCareApplicantAddress, Long>)
					HealthCareApplicantAddress::
						setHealthCareApplicantAddressId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<HealthCareApplicantAddress, Long>)
					HealthCareApplicantAddress::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<HealthCareApplicantAddress, Long>)
					HealthCareApplicantAddress::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<HealthCareApplicantAddress, Long>)
					HealthCareApplicantAddress::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<HealthCareApplicantAddress, String>)
					HealthCareApplicantAddress::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<HealthCareApplicantAddress, Date>)
					HealthCareApplicantAddress::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<HealthCareApplicantAddress, Date>)
					HealthCareApplicantAddress::setModifiedDate);
			attributeSetterBiConsumers.put(
				"applicantMailingAddress",
				(BiConsumer<HealthCareApplicantAddress, String>)
					HealthCareApplicantAddress::setApplicantMailingAddress);
			attributeSetterBiConsumers.put(
				"healthCareApplicationId",
				(BiConsumer<HealthCareApplicantAddress, Long>)
					HealthCareApplicantAddress::setHealthCareApplicationId);
			attributeSetterBiConsumers.put(
				"healthCareApplicantInfoId",
				(BiConsumer<HealthCareApplicantAddress, Long>)
					HealthCareApplicantAddress::setHealthCareApplicantInfoId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getHealthCareApplicantAddressId() {
		return _healthCareApplicantAddressId;
	}

	@Override
	public void setHealthCareApplicantAddressId(
		long healthCareApplicantAddressId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_healthCareApplicantAddressId = healthCareApplicantAddressId;
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
	public String getApplicantMailingAddress() {
		if (_applicantMailingAddress == null) {
			return "";
		}
		else {
			return _applicantMailingAddress;
		}
	}

	@Override
	public void setApplicantMailingAddress(String applicantMailingAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicantMailingAddress = applicantMailingAddress;
	}

	@JSON
	@Override
	public long getHealthCareApplicationId() {
		return _healthCareApplicationId;
	}

	@Override
	public void setHealthCareApplicationId(long healthCareApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_healthCareApplicationId = healthCareApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalHealthCareApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("healthCareApplicationId"));
	}

	@JSON
	@Override
	public long getHealthCareApplicantInfoId() {
		return _healthCareApplicantInfoId;
	}

	@Override
	public void setHealthCareApplicantInfoId(long healthCareApplicantInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_healthCareApplicantInfoId = healthCareApplicantInfoId;
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
			getCompanyId(), HealthCareApplicantAddress.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public HealthCareApplicantAddress toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, HealthCareApplicantAddress>
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
		HealthCareApplicantAddressImpl healthCareApplicantAddressImpl =
			new HealthCareApplicantAddressImpl();

		healthCareApplicantAddressImpl.setHealthCareApplicantAddressId(
			getHealthCareApplicantAddressId());
		healthCareApplicantAddressImpl.setGroupId(getGroupId());
		healthCareApplicantAddressImpl.setCompanyId(getCompanyId());
		healthCareApplicantAddressImpl.setUserId(getUserId());
		healthCareApplicantAddressImpl.setUserName(getUserName());
		healthCareApplicantAddressImpl.setCreateDate(getCreateDate());
		healthCareApplicantAddressImpl.setModifiedDate(getModifiedDate());
		healthCareApplicantAddressImpl.setApplicantMailingAddress(
			getApplicantMailingAddress());
		healthCareApplicantAddressImpl.setHealthCareApplicationId(
			getHealthCareApplicationId());
		healthCareApplicantAddressImpl.setHealthCareApplicantInfoId(
			getHealthCareApplicantInfoId());

		healthCareApplicantAddressImpl.resetOriginalValues();

		return healthCareApplicantAddressImpl;
	}

	@Override
	public HealthCareApplicantAddress cloneWithOriginalValues() {
		HealthCareApplicantAddressImpl healthCareApplicantAddressImpl =
			new HealthCareApplicantAddressImpl();

		healthCareApplicantAddressImpl.setHealthCareApplicantAddressId(
			this.<Long>getColumnOriginalValue("healthCareApplicantAddressId"));
		healthCareApplicantAddressImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		healthCareApplicantAddressImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		healthCareApplicantAddressImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		healthCareApplicantAddressImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		healthCareApplicantAddressImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		healthCareApplicantAddressImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		healthCareApplicantAddressImpl.setApplicantMailingAddress(
			this.<String>getColumnOriginalValue("applicantMailingAddress"));
		healthCareApplicantAddressImpl.setHealthCareApplicationId(
			this.<Long>getColumnOriginalValue("healthCareApplicationId"));
		healthCareApplicantAddressImpl.setHealthCareApplicantInfoId(
			this.<Long>getColumnOriginalValue("healthCareApplicantInfoId"));

		return healthCareApplicantAddressImpl;
	}

	@Override
	public int compareTo(
		HealthCareApplicantAddress healthCareApplicantAddress) {

		long primaryKey = healthCareApplicantAddress.getPrimaryKey();

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

		if (!(object instanceof HealthCareApplicantAddress)) {
			return false;
		}

		HealthCareApplicantAddress healthCareApplicantAddress =
			(HealthCareApplicantAddress)object;

		long primaryKey = healthCareApplicantAddress.getPrimaryKey();

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
	public CacheModel<HealthCareApplicantAddress> toCacheModel() {
		HealthCareApplicantAddressCacheModel
			healthCareApplicantAddressCacheModel =
				new HealthCareApplicantAddressCacheModel();

		healthCareApplicantAddressCacheModel.healthCareApplicantAddressId =
			getHealthCareApplicantAddressId();

		healthCareApplicantAddressCacheModel.groupId = getGroupId();

		healthCareApplicantAddressCacheModel.companyId = getCompanyId();

		healthCareApplicantAddressCacheModel.userId = getUserId();

		healthCareApplicantAddressCacheModel.userName = getUserName();

		String userName = healthCareApplicantAddressCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			healthCareApplicantAddressCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			healthCareApplicantAddressCacheModel.createDate =
				createDate.getTime();
		}
		else {
			healthCareApplicantAddressCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			healthCareApplicantAddressCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			healthCareApplicantAddressCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		healthCareApplicantAddressCacheModel.applicantMailingAddress =
			getApplicantMailingAddress();

		String applicantMailingAddress =
			healthCareApplicantAddressCacheModel.applicantMailingAddress;

		if ((applicantMailingAddress != null) &&
			(applicantMailingAddress.length() == 0)) {

			healthCareApplicantAddressCacheModel.applicantMailingAddress = null;
		}

		healthCareApplicantAddressCacheModel.healthCareApplicationId =
			getHealthCareApplicationId();

		healthCareApplicantAddressCacheModel.healthCareApplicantInfoId =
			getHealthCareApplicantInfoId();

		return healthCareApplicantAddressCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<HealthCareApplicantAddress, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<HealthCareApplicantAddress, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<HealthCareApplicantAddress, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(HealthCareApplicantAddress)this);

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
			<InvocationHandler, HealthCareApplicantAddress>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						HealthCareApplicantAddress.class, ModelWrapper.class);

	}

	private long _healthCareApplicantAddressId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _applicantMailingAddress;
	private long _healthCareApplicationId;
	private long _healthCareApplicantInfoId;

	public <T> T getColumnValue(String columnName) {
		Function<HealthCareApplicantAddress, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((HealthCareApplicantAddress)this);
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
			"healthCareApplicantAddressId", _healthCareApplicantAddressId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"applicantMailingAddress", _applicantMailingAddress);
		_columnOriginalValues.put(
			"healthCareApplicationId", _healthCareApplicationId);
		_columnOriginalValues.put(
			"healthCareApplicantInfoId", _healthCareApplicantInfoId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("healthCareApplicantAddressId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("applicantMailingAddress", 128L);

		columnBitmasks.put("healthCareApplicationId", 256L);

		columnBitmasks.put("healthCareApplicantInfoId", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private HealthCareApplicantAddress _escapedModel;

}