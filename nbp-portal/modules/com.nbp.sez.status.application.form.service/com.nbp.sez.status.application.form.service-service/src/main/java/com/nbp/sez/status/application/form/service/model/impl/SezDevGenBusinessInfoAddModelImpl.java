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

import com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAdd;
import com.nbp.sez.status.application.form.service.model.SezDevGenBusinessInfoAddModel;

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
 * The base model implementation for the SezDevGenBusinessInfoAdd service. Represents a row in the &quot;nbp_sez_dev_gen_busi_info_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezDevGenBusinessInfoAddModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezDevGenBusinessInfoAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevGenBusinessInfoAddImpl
 * @generated
 */
@JSON(strict = true)
public class SezDevGenBusinessInfoAddModelImpl
	extends BaseModelImpl<SezDevGenBusinessInfoAdd>
	implements SezDevGenBusinessInfoAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez dev gen business info add model instance should use the <code>SezDevGenBusinessInfoAdd</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_dev_gen_busi_info_add";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezDevGenBusinessInfoAddId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"companyName", Types.VARCHAR},
		{"buildingNum", Types.VARCHAR}, {"townCity", Types.VARCHAR},
		{"parish", Types.VARCHAR}, {"country", Types.VARCHAR},
		{"telephoneNum", Types.VARCHAR}, {"faxNum", Types.VARCHAR},
		{"emailAddress", Types.VARCHAR}, {"counter", Types.VARCHAR},
		{"sezStatusApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezDevGenBusinessInfoAddId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("companyName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("buildingNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("townCity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("parish", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("country", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("telephoneNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("faxNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("emailAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezStatusApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_dev_gen_busi_info_add (sezDevGenBusinessInfoAddId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,companyName VARCHAR(75) null,buildingNum VARCHAR(75) null,townCity VARCHAR(75) null,parish VARCHAR(75) null,country VARCHAR(75) null,telephoneNum VARCHAR(75) null,faxNum VARCHAR(75) null,emailAddress VARCHAR(75) null,counter VARCHAR(75) null,sezStatusApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_dev_gen_busi_info_add";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezDevGenBusinessInfoAdd.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_dev_gen_busi_info_add.createDate ASC";

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

	public SezDevGenBusinessInfoAddModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezDevGenBusinessInfoAddId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezDevGenBusinessInfoAddId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezDevGenBusinessInfoAddId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezDevGenBusinessInfoAdd.class;
	}

	@Override
	public String getModelClassName() {
		return SezDevGenBusinessInfoAdd.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezDevGenBusinessInfoAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezDevGenBusinessInfoAdd, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezDevGenBusinessInfoAdd, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezDevGenBusinessInfoAdd)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezDevGenBusinessInfoAdd, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezDevGenBusinessInfoAdd, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezDevGenBusinessInfoAdd)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezDevGenBusinessInfoAdd, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezDevGenBusinessInfoAdd, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<SezDevGenBusinessInfoAdd, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<SezDevGenBusinessInfoAdd, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezDevGenBusinessInfoAdd, Object>>();

			attributeGetterFunctions.put(
				"sezDevGenBusinessInfoAddId",
				SezDevGenBusinessInfoAdd::getSezDevGenBusinessInfoAddId);
			attributeGetterFunctions.put(
				"groupId", SezDevGenBusinessInfoAdd::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezDevGenBusinessInfoAdd::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezDevGenBusinessInfoAdd::getUserId);
			attributeGetterFunctions.put(
				"userName", SezDevGenBusinessInfoAdd::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezDevGenBusinessInfoAdd::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezDevGenBusinessInfoAdd::getModifiedDate);
			attributeGetterFunctions.put(
				"companyName", SezDevGenBusinessInfoAdd::getCompanyName);
			attributeGetterFunctions.put(
				"buildingNum", SezDevGenBusinessInfoAdd::getBuildingNum);
			attributeGetterFunctions.put(
				"townCity", SezDevGenBusinessInfoAdd::getTownCity);
			attributeGetterFunctions.put(
				"parish", SezDevGenBusinessInfoAdd::getParish);
			attributeGetterFunctions.put(
				"country", SezDevGenBusinessInfoAdd::getCountry);
			attributeGetterFunctions.put(
				"telephoneNum", SezDevGenBusinessInfoAdd::getTelephoneNum);
			attributeGetterFunctions.put(
				"faxNum", SezDevGenBusinessInfoAdd::getFaxNum);
			attributeGetterFunctions.put(
				"emailAddress", SezDevGenBusinessInfoAdd::getEmailAddress);
			attributeGetterFunctions.put(
				"counter", SezDevGenBusinessInfoAdd::getCounter);
			attributeGetterFunctions.put(
				"sezStatusApplicationId",
				SezDevGenBusinessInfoAdd::getSezStatusApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<SezDevGenBusinessInfoAdd, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezDevGenBusinessInfoAdd, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezDevGenBusinessInfoAdd, ?>>();

			attributeSetterBiConsumers.put(
				"sezDevGenBusinessInfoAddId",
				(BiConsumer<SezDevGenBusinessInfoAdd, Long>)
					SezDevGenBusinessInfoAdd::setSezDevGenBusinessInfoAddId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezDevGenBusinessInfoAdd, Long>)
					SezDevGenBusinessInfoAdd::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezDevGenBusinessInfoAdd, Long>)
					SezDevGenBusinessInfoAdd::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezDevGenBusinessInfoAdd, Long>)
					SezDevGenBusinessInfoAdd::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezDevGenBusinessInfoAdd, Date>)
					SezDevGenBusinessInfoAdd::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezDevGenBusinessInfoAdd, Date>)
					SezDevGenBusinessInfoAdd::setModifiedDate);
			attributeSetterBiConsumers.put(
				"companyName",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setCompanyName);
			attributeSetterBiConsumers.put(
				"buildingNum",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setBuildingNum);
			attributeSetterBiConsumers.put(
				"townCity",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setTownCity);
			attributeSetterBiConsumers.put(
				"parish",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setParish);
			attributeSetterBiConsumers.put(
				"country",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setCountry);
			attributeSetterBiConsumers.put(
				"telephoneNum",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setTelephoneNum);
			attributeSetterBiConsumers.put(
				"faxNum",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setFaxNum);
			attributeSetterBiConsumers.put(
				"emailAddress",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setEmailAddress);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<SezDevGenBusinessInfoAdd, String>)
					SezDevGenBusinessInfoAdd::setCounter);
			attributeSetterBiConsumers.put(
				"sezStatusApplicationId",
				(BiConsumer<SezDevGenBusinessInfoAdd, Long>)
					SezDevGenBusinessInfoAdd::setSezStatusApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezDevGenBusinessInfoAddId() {
		return _sezDevGenBusinessInfoAddId;
	}

	@Override
	public void setSezDevGenBusinessInfoAddId(long sezDevGenBusinessInfoAddId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezDevGenBusinessInfoAddId = sezDevGenBusinessInfoAddId;
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
	public String getCompanyName() {
		if (_companyName == null) {
			return "";
		}
		else {
			return _companyName;
		}
	}

	@Override
	public void setCompanyName(String companyName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyName = companyName;
	}

	@JSON
	@Override
	public String getBuildingNum() {
		if (_buildingNum == null) {
			return "";
		}
		else {
			return _buildingNum;
		}
	}

	@Override
	public void setBuildingNum(String buildingNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_buildingNum = buildingNum;
	}

	@JSON
	@Override
	public String getTownCity() {
		if (_townCity == null) {
			return "";
		}
		else {
			return _townCity;
		}
	}

	@Override
	public void setTownCity(String townCity) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_townCity = townCity;
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
	public String getCountry() {
		if (_country == null) {
			return "";
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_country = country;
	}

	@JSON
	@Override
	public String getTelephoneNum() {
		if (_telephoneNum == null) {
			return "";
		}
		else {
			return _telephoneNum;
		}
	}

	@Override
	public void setTelephoneNum(String telephoneNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_telephoneNum = telephoneNum;
	}

	@JSON
	@Override
	public String getFaxNum() {
		if (_faxNum == null) {
			return "";
		}
		else {
			return _faxNum;
		}
	}

	@Override
	public void setFaxNum(String faxNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_faxNum = faxNum;
	}

	@JSON
	@Override
	public String getEmailAddress() {
		if (_emailAddress == null) {
			return "";
		}
		else {
			return _emailAddress;
		}
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_emailAddress = emailAddress;
	}

	@JSON
	@Override
	public String getCounter() {
		if (_counter == null) {
			return "";
		}
		else {
			return _counter;
		}
	}

	@Override
	public void setCounter(String counter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_counter = counter;
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
			getCompanyId(), SezDevGenBusinessInfoAdd.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezDevGenBusinessInfoAdd toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezDevGenBusinessInfoAdd>
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
		SezDevGenBusinessInfoAddImpl sezDevGenBusinessInfoAddImpl =
			new SezDevGenBusinessInfoAddImpl();

		sezDevGenBusinessInfoAddImpl.setSezDevGenBusinessInfoAddId(
			getSezDevGenBusinessInfoAddId());
		sezDevGenBusinessInfoAddImpl.setGroupId(getGroupId());
		sezDevGenBusinessInfoAddImpl.setCompanyId(getCompanyId());
		sezDevGenBusinessInfoAddImpl.setUserId(getUserId());
		sezDevGenBusinessInfoAddImpl.setUserName(getUserName());
		sezDevGenBusinessInfoAddImpl.setCreateDate(getCreateDate());
		sezDevGenBusinessInfoAddImpl.setModifiedDate(getModifiedDate());
		sezDevGenBusinessInfoAddImpl.setCompanyName(getCompanyName());
		sezDevGenBusinessInfoAddImpl.setBuildingNum(getBuildingNum());
		sezDevGenBusinessInfoAddImpl.setTownCity(getTownCity());
		sezDevGenBusinessInfoAddImpl.setParish(getParish());
		sezDevGenBusinessInfoAddImpl.setCountry(getCountry());
		sezDevGenBusinessInfoAddImpl.setTelephoneNum(getTelephoneNum());
		sezDevGenBusinessInfoAddImpl.setFaxNum(getFaxNum());
		sezDevGenBusinessInfoAddImpl.setEmailAddress(getEmailAddress());
		sezDevGenBusinessInfoAddImpl.setCounter(getCounter());
		sezDevGenBusinessInfoAddImpl.setSezStatusApplicationId(
			getSezStatusApplicationId());

		sezDevGenBusinessInfoAddImpl.resetOriginalValues();

		return sezDevGenBusinessInfoAddImpl;
	}

	@Override
	public SezDevGenBusinessInfoAdd cloneWithOriginalValues() {
		SezDevGenBusinessInfoAddImpl sezDevGenBusinessInfoAddImpl =
			new SezDevGenBusinessInfoAddImpl();

		sezDevGenBusinessInfoAddImpl.setSezDevGenBusinessInfoAddId(
			this.<Long>getColumnOriginalValue("sezDevGenBusinessInfoAddId"));
		sezDevGenBusinessInfoAddImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezDevGenBusinessInfoAddImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezDevGenBusinessInfoAddImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezDevGenBusinessInfoAddImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezDevGenBusinessInfoAddImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezDevGenBusinessInfoAddImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezDevGenBusinessInfoAddImpl.setCompanyName(
			this.<String>getColumnOriginalValue("companyName"));
		sezDevGenBusinessInfoAddImpl.setBuildingNum(
			this.<String>getColumnOriginalValue("buildingNum"));
		sezDevGenBusinessInfoAddImpl.setTownCity(
			this.<String>getColumnOriginalValue("townCity"));
		sezDevGenBusinessInfoAddImpl.setParish(
			this.<String>getColumnOriginalValue("parish"));
		sezDevGenBusinessInfoAddImpl.setCountry(
			this.<String>getColumnOriginalValue("country"));
		sezDevGenBusinessInfoAddImpl.setTelephoneNum(
			this.<String>getColumnOriginalValue("telephoneNum"));
		sezDevGenBusinessInfoAddImpl.setFaxNum(
			this.<String>getColumnOriginalValue("faxNum"));
		sezDevGenBusinessInfoAddImpl.setEmailAddress(
			this.<String>getColumnOriginalValue("emailAddress"));
		sezDevGenBusinessInfoAddImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		sezDevGenBusinessInfoAddImpl.setSezStatusApplicationId(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));

		return sezDevGenBusinessInfoAddImpl;
	}

	@Override
	public int compareTo(SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezDevGenBusinessInfoAdd.getCreateDate());

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

		if (!(object instanceof SezDevGenBusinessInfoAdd)) {
			return false;
		}

		SezDevGenBusinessInfoAdd sezDevGenBusinessInfoAdd =
			(SezDevGenBusinessInfoAdd)object;

		long primaryKey = sezDevGenBusinessInfoAdd.getPrimaryKey();

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
	public CacheModel<SezDevGenBusinessInfoAdd> toCacheModel() {
		SezDevGenBusinessInfoAddCacheModel sezDevGenBusinessInfoAddCacheModel =
			new SezDevGenBusinessInfoAddCacheModel();

		sezDevGenBusinessInfoAddCacheModel.sezDevGenBusinessInfoAddId =
			getSezDevGenBusinessInfoAddId();

		sezDevGenBusinessInfoAddCacheModel.groupId = getGroupId();

		sezDevGenBusinessInfoAddCacheModel.companyId = getCompanyId();

		sezDevGenBusinessInfoAddCacheModel.userId = getUserId();

		sezDevGenBusinessInfoAddCacheModel.userName = getUserName();

		String userName = sezDevGenBusinessInfoAddCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezDevGenBusinessInfoAddCacheModel.createDate =
				createDate.getTime();
		}
		else {
			sezDevGenBusinessInfoAddCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezDevGenBusinessInfoAddCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			sezDevGenBusinessInfoAddCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezDevGenBusinessInfoAddCacheModel.companyName = getCompanyName();

		String companyName = sezDevGenBusinessInfoAddCacheModel.companyName;

		if ((companyName != null) && (companyName.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.companyName = null;
		}

		sezDevGenBusinessInfoAddCacheModel.buildingNum = getBuildingNum();

		String buildingNum = sezDevGenBusinessInfoAddCacheModel.buildingNum;

		if ((buildingNum != null) && (buildingNum.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.buildingNum = null;
		}

		sezDevGenBusinessInfoAddCacheModel.townCity = getTownCity();

		String townCity = sezDevGenBusinessInfoAddCacheModel.townCity;

		if ((townCity != null) && (townCity.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.townCity = null;
		}

		sezDevGenBusinessInfoAddCacheModel.parish = getParish();

		String parish = sezDevGenBusinessInfoAddCacheModel.parish;

		if ((parish != null) && (parish.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.parish = null;
		}

		sezDevGenBusinessInfoAddCacheModel.country = getCountry();

		String country = sezDevGenBusinessInfoAddCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.country = null;
		}

		sezDevGenBusinessInfoAddCacheModel.telephoneNum = getTelephoneNum();

		String telephoneNum = sezDevGenBusinessInfoAddCacheModel.telephoneNum;

		if ((telephoneNum != null) && (telephoneNum.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.telephoneNum = null;
		}

		sezDevGenBusinessInfoAddCacheModel.faxNum = getFaxNum();

		String faxNum = sezDevGenBusinessInfoAddCacheModel.faxNum;

		if ((faxNum != null) && (faxNum.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.faxNum = null;
		}

		sezDevGenBusinessInfoAddCacheModel.emailAddress = getEmailAddress();

		String emailAddress = sezDevGenBusinessInfoAddCacheModel.emailAddress;

		if ((emailAddress != null) && (emailAddress.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.emailAddress = null;
		}

		sezDevGenBusinessInfoAddCacheModel.counter = getCounter();

		String counter = sezDevGenBusinessInfoAddCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			sezDevGenBusinessInfoAddCacheModel.counter = null;
		}

		sezDevGenBusinessInfoAddCacheModel.sezStatusApplicationId =
			getSezStatusApplicationId();

		return sezDevGenBusinessInfoAddCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezDevGenBusinessInfoAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezDevGenBusinessInfoAdd, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezDevGenBusinessInfoAdd, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezDevGenBusinessInfoAdd)this);

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
			<InvocationHandler, SezDevGenBusinessInfoAdd>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						SezDevGenBusinessInfoAdd.class, ModelWrapper.class);

	}

	private long _sezDevGenBusinessInfoAddId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _companyName;
	private String _buildingNum;
	private String _townCity;
	private String _parish;
	private String _country;
	private String _telephoneNum;
	private String _faxNum;
	private String _emailAddress;
	private String _counter;
	private long _sezStatusApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<SezDevGenBusinessInfoAdd, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezDevGenBusinessInfoAdd)this);
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
			"sezDevGenBusinessInfoAddId", _sezDevGenBusinessInfoAddId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("companyName", _companyName);
		_columnOriginalValues.put("buildingNum", _buildingNum);
		_columnOriginalValues.put("townCity", _townCity);
		_columnOriginalValues.put("parish", _parish);
		_columnOriginalValues.put("country", _country);
		_columnOriginalValues.put("telephoneNum", _telephoneNum);
		_columnOriginalValues.put("faxNum", _faxNum);
		_columnOriginalValues.put("emailAddress", _emailAddress);
		_columnOriginalValues.put("counter", _counter);
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

		columnBitmasks.put("sezDevGenBusinessInfoAddId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("companyName", 128L);

		columnBitmasks.put("buildingNum", 256L);

		columnBitmasks.put("townCity", 512L);

		columnBitmasks.put("parish", 1024L);

		columnBitmasks.put("country", 2048L);

		columnBitmasks.put("telephoneNum", 4096L);

		columnBitmasks.put("faxNum", 8192L);

		columnBitmasks.put("emailAddress", 16384L);

		columnBitmasks.put("counter", 32768L);

		columnBitmasks.put("sezStatusApplicationId", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezDevGenBusinessInfoAdd _escapedModel;

}