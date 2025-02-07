/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.model.impl;

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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddress;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddressModel;

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
 * The base model implementation for the CannabisApplicationIndividualAddress service. Represents a row in the &quot;nbp_cannabis_ind_address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CannabisApplicationIndividualAddressModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CannabisApplicationIndividualAddressImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualAddressImpl
 * @generated
 */
@JSON(strict = true)
public class CannabisApplicationIndividualAddressModelImpl
	extends BaseModelImpl<CannabisApplicationIndividualAddress>
	implements CannabisApplicationIndividualAddressModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cannabis application individual address model instance should use the <code>CannabisApplicationIndividualAddress</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_cannabis_ind_address";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"IndividualAddressId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"addressType", Types.VARCHAR}, {"streetName", Types.VARCHAR},
		{"town", Types.VARCHAR}, {"parish", Types.VARCHAR},
		{"applicationNumber", Types.VARCHAR},
		{"cannabisApplicationId", Types.BIGINT},
		{"individualInformationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("IndividualAddressId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("addressType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("streetName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("town", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("parish", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicationNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("cannabisApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("individualInformationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_cannabis_ind_address (uuid_ VARCHAR(75) null,IndividualAddressId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,addressType VARCHAR(75) null,streetName VARCHAR(75) null,town VARCHAR(75) null,parish VARCHAR(75) null,applicationNumber VARCHAR(75) null,cannabisApplicationId LONG,individualInformationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_cannabis_ind_address";

	public static final String ORDER_BY_JPQL =
		" ORDER BY cannabisApplicationIndividualAddress.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_cannabis_ind_address.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ADDRESSTYPE_COLUMN_BITMASK = 1L;

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
	public static final long INDIVIDUALINFORMATIONID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 16L;

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

	public CannabisApplicationIndividualAddressModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _IndividualAddressId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIndividualAddressId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _IndividualAddressId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CannabisApplicationIndividualAddress.class;
	}

	@Override
	public String getModelClassName() {
		return CannabisApplicationIndividualAddress.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CannabisApplicationIndividualAddress, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String, Function<CannabisApplicationIndividualAddress, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CannabisApplicationIndividualAddress, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(CannabisApplicationIndividualAddress)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CannabisApplicationIndividualAddress, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CannabisApplicationIndividualAddress, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CannabisApplicationIndividualAddress)this,
					entry.getValue());
			}
		}
	}

	public Map<String, Function<CannabisApplicationIndividualAddress, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CannabisApplicationIndividualAddress, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<CannabisApplicationIndividualAddress, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<CannabisApplicationIndividualAddress, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function
							 <CannabisApplicationIndividualAddress, Object>>();

			attributeGetterFunctions.put(
				"uuid", CannabisApplicationIndividualAddress::getUuid);
			attributeGetterFunctions.put(
				"IndividualAddressId",
				CannabisApplicationIndividualAddress::getIndividualAddressId);
			attributeGetterFunctions.put(
				"groupId", CannabisApplicationIndividualAddress::getGroupId);
			attributeGetterFunctions.put(
				"companyId",
				CannabisApplicationIndividualAddress::getCompanyId);
			attributeGetterFunctions.put(
				"userId", CannabisApplicationIndividualAddress::getUserId);
			attributeGetterFunctions.put(
				"userName", CannabisApplicationIndividualAddress::getUserName);
			attributeGetterFunctions.put(
				"createDate",
				CannabisApplicationIndividualAddress::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate",
				CannabisApplicationIndividualAddress::getModifiedDate);
			attributeGetterFunctions.put(
				"addressType",
				CannabisApplicationIndividualAddress::getAddressType);
			attributeGetterFunctions.put(
				"streetName",
				CannabisApplicationIndividualAddress::getStreetName);
			attributeGetterFunctions.put(
				"town", CannabisApplicationIndividualAddress::getTown);
			attributeGetterFunctions.put(
				"parish", CannabisApplicationIndividualAddress::getParish);
			attributeGetterFunctions.put(
				"applicationNumber",
				CannabisApplicationIndividualAddress::getApplicationNumber);
			attributeGetterFunctions.put(
				"cannabisApplicationId",
				CannabisApplicationIndividualAddress::getCannabisApplicationId);
			attributeGetterFunctions.put(
				"individualInformationId",
				CannabisApplicationIndividualAddress::
					getIndividualInformationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<CannabisApplicationIndividualAddress, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<CannabisApplicationIndividualAddress, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String,
						 BiConsumer<CannabisApplicationIndividualAddress, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<CannabisApplicationIndividualAddress, String>)
					CannabisApplicationIndividualAddress::setUuid);
			attributeSetterBiConsumers.put(
				"IndividualAddressId",
				(BiConsumer<CannabisApplicationIndividualAddress, Long>)
					CannabisApplicationIndividualAddress::
						setIndividualAddressId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<CannabisApplicationIndividualAddress, Long>)
					CannabisApplicationIndividualAddress::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<CannabisApplicationIndividualAddress, Long>)
					CannabisApplicationIndividualAddress::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<CannabisApplicationIndividualAddress, Long>)
					CannabisApplicationIndividualAddress::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<CannabisApplicationIndividualAddress, String>)
					CannabisApplicationIndividualAddress::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<CannabisApplicationIndividualAddress, Date>)
					CannabisApplicationIndividualAddress::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<CannabisApplicationIndividualAddress, Date>)
					CannabisApplicationIndividualAddress::setModifiedDate);
			attributeSetterBiConsumers.put(
				"addressType",
				(BiConsumer<CannabisApplicationIndividualAddress, String>)
					CannabisApplicationIndividualAddress::setAddressType);
			attributeSetterBiConsumers.put(
				"streetName",
				(BiConsumer<CannabisApplicationIndividualAddress, String>)
					CannabisApplicationIndividualAddress::setStreetName);
			attributeSetterBiConsumers.put(
				"town",
				(BiConsumer<CannabisApplicationIndividualAddress, String>)
					CannabisApplicationIndividualAddress::setTown);
			attributeSetterBiConsumers.put(
				"parish",
				(BiConsumer<CannabisApplicationIndividualAddress, String>)
					CannabisApplicationIndividualAddress::setParish);
			attributeSetterBiConsumers.put(
				"applicationNumber",
				(BiConsumer<CannabisApplicationIndividualAddress, String>)
					CannabisApplicationIndividualAddress::setApplicationNumber);
			attributeSetterBiConsumers.put(
				"cannabisApplicationId",
				(BiConsumer<CannabisApplicationIndividualAddress, Long>)
					CannabisApplicationIndividualAddress::
						setCannabisApplicationId);
			attributeSetterBiConsumers.put(
				"individualInformationId",
				(BiConsumer<CannabisApplicationIndividualAddress, Long>)
					CannabisApplicationIndividualAddress::
						setIndividualInformationId);

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
	public long getIndividualAddressId() {
		return _IndividualAddressId;
	}

	@Override
	public void setIndividualAddressId(long IndividualAddressId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_IndividualAddressId = IndividualAddressId;
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
	public String getAddressType() {
		if (_addressType == null) {
			return "";
		}
		else {
			return _addressType;
		}
	}

	@Override
	public void setAddressType(String addressType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_addressType = addressType;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalAddressType() {
		return getColumnOriginalValue("addressType");
	}

	@JSON
	@Override
	public String getStreetName() {
		if (_streetName == null) {
			return "";
		}
		else {
			return _streetName;
		}
	}

	@Override
	public void setStreetName(String streetName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_streetName = streetName;
	}

	@JSON
	@Override
	public String getTown() {
		if (_town == null) {
			return "";
		}
		else {
			return _town;
		}
	}

	@Override
	public void setTown(String town) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_town = town;
	}

	@JSON
	@Override
	public String getParish() {
		if (_parish == null) {
			return "";
		}
		else {
			return _parish;
		}
	}

	@Override
	public void setParish(String parish) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_parish = parish;
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

	@JSON
	@Override
	public long getCannabisApplicationId() {
		return _cannabisApplicationId;
	}

	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_cannabisApplicationId = cannabisApplicationId;
	}

	@JSON
	@Override
	public long getIndividualInformationId() {
		return _individualInformationId;
	}

	@Override
	public void setIndividualInformationId(long individualInformationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_individualInformationId = individualInformationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalIndividualInformationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("individualInformationId"));
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				CannabisApplicationIndividualAddress.class.getName()));
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
			getCompanyId(),
			CannabisApplicationIndividualAddress.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CannabisApplicationIndividualAddress toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CannabisApplicationIndividualAddress>
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
		CannabisApplicationIndividualAddressImpl
			cannabisApplicationIndividualAddressImpl =
				new CannabisApplicationIndividualAddressImpl();

		cannabisApplicationIndividualAddressImpl.setUuid(getUuid());
		cannabisApplicationIndividualAddressImpl.setIndividualAddressId(
			getIndividualAddressId());
		cannabisApplicationIndividualAddressImpl.setGroupId(getGroupId());
		cannabisApplicationIndividualAddressImpl.setCompanyId(getCompanyId());
		cannabisApplicationIndividualAddressImpl.setUserId(getUserId());
		cannabisApplicationIndividualAddressImpl.setUserName(getUserName());
		cannabisApplicationIndividualAddressImpl.setCreateDate(getCreateDate());
		cannabisApplicationIndividualAddressImpl.setModifiedDate(
			getModifiedDate());
		cannabisApplicationIndividualAddressImpl.setAddressType(
			getAddressType());
		cannabisApplicationIndividualAddressImpl.setStreetName(getStreetName());
		cannabisApplicationIndividualAddressImpl.setTown(getTown());
		cannabisApplicationIndividualAddressImpl.setParish(getParish());
		cannabisApplicationIndividualAddressImpl.setApplicationNumber(
			getApplicationNumber());
		cannabisApplicationIndividualAddressImpl.setCannabisApplicationId(
			getCannabisApplicationId());
		cannabisApplicationIndividualAddressImpl.setIndividualInformationId(
			getIndividualInformationId());

		cannabisApplicationIndividualAddressImpl.resetOriginalValues();

		return cannabisApplicationIndividualAddressImpl;
	}

	@Override
	public CannabisApplicationIndividualAddress cloneWithOriginalValues() {
		CannabisApplicationIndividualAddressImpl
			cannabisApplicationIndividualAddressImpl =
				new CannabisApplicationIndividualAddressImpl();

		cannabisApplicationIndividualAddressImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		cannabisApplicationIndividualAddressImpl.setIndividualAddressId(
			this.<Long>getColumnOriginalValue("IndividualAddressId"));
		cannabisApplicationIndividualAddressImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		cannabisApplicationIndividualAddressImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		cannabisApplicationIndividualAddressImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		cannabisApplicationIndividualAddressImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		cannabisApplicationIndividualAddressImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		cannabisApplicationIndividualAddressImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		cannabisApplicationIndividualAddressImpl.setAddressType(
			this.<String>getColumnOriginalValue("addressType"));
		cannabisApplicationIndividualAddressImpl.setStreetName(
			this.<String>getColumnOriginalValue("streetName"));
		cannabisApplicationIndividualAddressImpl.setTown(
			this.<String>getColumnOriginalValue("town"));
		cannabisApplicationIndividualAddressImpl.setParish(
			this.<String>getColumnOriginalValue("parish"));
		cannabisApplicationIndividualAddressImpl.setApplicationNumber(
			this.<String>getColumnOriginalValue("applicationNumber"));
		cannabisApplicationIndividualAddressImpl.setCannabisApplicationId(
			this.<Long>getColumnOriginalValue("cannabisApplicationId"));
		cannabisApplicationIndividualAddressImpl.setIndividualInformationId(
			this.<Long>getColumnOriginalValue("individualInformationId"));

		return cannabisApplicationIndividualAddressImpl;
	}

	@Override
	public int compareTo(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(),
			cannabisApplicationIndividualAddress.getCreateDate());

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

		if (!(object instanceof CannabisApplicationIndividualAddress)) {
			return false;
		}

		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress =
				(CannabisApplicationIndividualAddress)object;

		long primaryKey = cannabisApplicationIndividualAddress.getPrimaryKey();

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
	public CacheModel<CannabisApplicationIndividualAddress> toCacheModel() {
		CannabisApplicationIndividualAddressCacheModel
			cannabisApplicationIndividualAddressCacheModel =
				new CannabisApplicationIndividualAddressCacheModel();

		cannabisApplicationIndividualAddressCacheModel.uuid = getUuid();

		String uuid = cannabisApplicationIndividualAddressCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			cannabisApplicationIndividualAddressCacheModel.uuid = null;
		}

		cannabisApplicationIndividualAddressCacheModel.IndividualAddressId =
			getIndividualAddressId();

		cannabisApplicationIndividualAddressCacheModel.groupId = getGroupId();

		cannabisApplicationIndividualAddressCacheModel.companyId =
			getCompanyId();

		cannabisApplicationIndividualAddressCacheModel.userId = getUserId();

		cannabisApplicationIndividualAddressCacheModel.userName = getUserName();

		String userName =
			cannabisApplicationIndividualAddressCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			cannabisApplicationIndividualAddressCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			cannabisApplicationIndividualAddressCacheModel.createDate =
				createDate.getTime();
		}
		else {
			cannabisApplicationIndividualAddressCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			cannabisApplicationIndividualAddressCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			cannabisApplicationIndividualAddressCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		cannabisApplicationIndividualAddressCacheModel.addressType =
			getAddressType();

		String addressType =
			cannabisApplicationIndividualAddressCacheModel.addressType;

		if ((addressType != null) && (addressType.length() == 0)) {
			cannabisApplicationIndividualAddressCacheModel.addressType = null;
		}

		cannabisApplicationIndividualAddressCacheModel.streetName =
			getStreetName();

		String streetName =
			cannabisApplicationIndividualAddressCacheModel.streetName;

		if ((streetName != null) && (streetName.length() == 0)) {
			cannabisApplicationIndividualAddressCacheModel.streetName = null;
		}

		cannabisApplicationIndividualAddressCacheModel.town = getTown();

		String town = cannabisApplicationIndividualAddressCacheModel.town;

		if ((town != null) && (town.length() == 0)) {
			cannabisApplicationIndividualAddressCacheModel.town = null;
		}

		cannabisApplicationIndividualAddressCacheModel.parish = getParish();

		String parish = cannabisApplicationIndividualAddressCacheModel.parish;

		if ((parish != null) && (parish.length() == 0)) {
			cannabisApplicationIndividualAddressCacheModel.parish = null;
		}

		cannabisApplicationIndividualAddressCacheModel.applicationNumber =
			getApplicationNumber();

		String applicationNumber =
			cannabisApplicationIndividualAddressCacheModel.applicationNumber;

		if ((applicationNumber != null) && (applicationNumber.length() == 0)) {
			cannabisApplicationIndividualAddressCacheModel.applicationNumber =
				null;
		}

		cannabisApplicationIndividualAddressCacheModel.cannabisApplicationId =
			getCannabisApplicationId();

		cannabisApplicationIndividualAddressCacheModel.individualInformationId =
			getIndividualInformationId();

		return cannabisApplicationIndividualAddressCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CannabisApplicationIndividualAddress, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry
				<String, Function<CannabisApplicationIndividualAddress, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CannabisApplicationIndividualAddress, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(CannabisApplicationIndividualAddress)this);

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
			<InvocationHandler, CannabisApplicationIndividualAddress>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						CannabisApplicationIndividualAddress.class,
						ModelWrapper.class);

	}

	private String _uuid;
	private long _IndividualAddressId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _addressType;
	private String _streetName;
	private String _town;
	private String _parish;
	private String _applicationNumber;
	private long _cannabisApplicationId;
	private long _individualInformationId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<CannabisApplicationIndividualAddress, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((CannabisApplicationIndividualAddress)this);
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
		_columnOriginalValues.put("IndividualAddressId", _IndividualAddressId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("addressType", _addressType);
		_columnOriginalValues.put("streetName", _streetName);
		_columnOriginalValues.put("town", _town);
		_columnOriginalValues.put("parish", _parish);
		_columnOriginalValues.put("applicationNumber", _applicationNumber);
		_columnOriginalValues.put(
			"cannabisApplicationId", _cannabisApplicationId);
		_columnOriginalValues.put(
			"individualInformationId", _individualInformationId);
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

		columnBitmasks.put("IndividualAddressId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("addressType", 256L);

		columnBitmasks.put("streetName", 512L);

		columnBitmasks.put("town", 1024L);

		columnBitmasks.put("parish", 2048L);

		columnBitmasks.put("applicationNumber", 4096L);

		columnBitmasks.put("cannabisApplicationId", 8192L);

		columnBitmasks.put("individualInformationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private CannabisApplicationIndividualAddress _escapedModel;

}