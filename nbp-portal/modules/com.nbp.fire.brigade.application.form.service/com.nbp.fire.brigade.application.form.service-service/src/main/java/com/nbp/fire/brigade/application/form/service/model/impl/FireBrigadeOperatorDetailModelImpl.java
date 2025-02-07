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

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetailModel;

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
 * The base model implementation for the FireBrigadeOperatorDetail service. Represents a row in the &quot;nbp_fire_operator_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>FireBrigadeOperatorDetailModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FireBrigadeOperatorDetailImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetailImpl
 * @generated
 */
@JSON(strict = true)
public class FireBrigadeOperatorDetailModelImpl
	extends BaseModelImpl<FireBrigadeOperatorDetail>
	implements FireBrigadeOperatorDetailModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fire brigade operator detail model instance should use the <code>FireBrigadeOperatorDetail</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_fire_operator_detail";

	public static final Object[][] TABLE_COLUMNS = {
		{"fireBrigadeOperatorDetailId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"operatorName", Types.VARCHAR}, {"businessName", Types.VARCHAR},
		{"address", Types.VARCHAR}, {"premisesUses", Types.VARCHAR},
		{"premisesOccupancy", Types.VARCHAR},
		{"premisesBusiness", Types.VARCHAR},
		{"maxWorkingPersons", Types.VARCHAR},
		{"maxNumPersonsAtAnyOneTime", Types.VARCHAR},
		{"fireBrigadeApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("fireBrigadeOperatorDetailId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("operatorName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("businessName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("premisesUses", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("premisesOccupancy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("premisesBusiness", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("maxWorkingPersons", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("maxNumPersonsAtAnyOneTime", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fireBrigadeApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_fire_operator_detail (fireBrigadeOperatorDetailId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,operatorName VARCHAR(75) null,businessName VARCHAR(75) null,address VARCHAR(500) null,premisesUses VARCHAR(75) null,premisesOccupancy VARCHAR(75) null,premisesBusiness VARCHAR(75) null,maxWorkingPersons VARCHAR(75) null,maxNumPersonsAtAnyOneTime VARCHAR(75) null,fireBrigadeApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_fire_operator_detail";

	public static final String ORDER_BY_JPQL =
		" ORDER BY fireBrigadeOperatorDetail.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_fire_operator_detail.createDate DESC";

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

	public FireBrigadeOperatorDetailModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _fireBrigadeOperatorDetailId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFireBrigadeOperatorDetailId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fireBrigadeOperatorDetailId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FireBrigadeOperatorDetail.class;
	}

	@Override
	public String getModelClassName() {
		return FireBrigadeOperatorDetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<FireBrigadeOperatorDetail, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<FireBrigadeOperatorDetail, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FireBrigadeOperatorDetail, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((FireBrigadeOperatorDetail)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<FireBrigadeOperatorDetail, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<FireBrigadeOperatorDetail, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(FireBrigadeOperatorDetail)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<FireBrigadeOperatorDetail, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<FireBrigadeOperatorDetail, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<FireBrigadeOperatorDetail, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<FireBrigadeOperatorDetail, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<FireBrigadeOperatorDetail, Object>>();

			attributeGetterFunctions.put(
				"fireBrigadeOperatorDetailId",
				FireBrigadeOperatorDetail::getFireBrigadeOperatorDetailId);
			attributeGetterFunctions.put(
				"groupId", FireBrigadeOperatorDetail::getGroupId);
			attributeGetterFunctions.put(
				"companyId", FireBrigadeOperatorDetail::getCompanyId);
			attributeGetterFunctions.put(
				"userId", FireBrigadeOperatorDetail::getUserId);
			attributeGetterFunctions.put(
				"userName", FireBrigadeOperatorDetail::getUserName);
			attributeGetterFunctions.put(
				"createDate", FireBrigadeOperatorDetail::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", FireBrigadeOperatorDetail::getModifiedDate);
			attributeGetterFunctions.put(
				"operatorName", FireBrigadeOperatorDetail::getOperatorName);
			attributeGetterFunctions.put(
				"businessName", FireBrigadeOperatorDetail::getBusinessName);
			attributeGetterFunctions.put(
				"address", FireBrigadeOperatorDetail::getAddress);
			attributeGetterFunctions.put(
				"premisesUses", FireBrigadeOperatorDetail::getPremisesUses);
			attributeGetterFunctions.put(
				"premisesOccupancy",
				FireBrigadeOperatorDetail::getPremisesOccupancy);
			attributeGetterFunctions.put(
				"premisesBusiness",
				FireBrigadeOperatorDetail::getPremisesBusiness);
			attributeGetterFunctions.put(
				"maxWorkingPersons",
				FireBrigadeOperatorDetail::getMaxWorkingPersons);
			attributeGetterFunctions.put(
				"maxNumPersonsAtAnyOneTime",
				FireBrigadeOperatorDetail::getMaxNumPersonsAtAnyOneTime);
			attributeGetterFunctions.put(
				"fireBrigadeApplicationId",
				FireBrigadeOperatorDetail::getFireBrigadeApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<FireBrigadeOperatorDetail, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<FireBrigadeOperatorDetail, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<FireBrigadeOperatorDetail, ?>>();

			attributeSetterBiConsumers.put(
				"fireBrigadeOperatorDetailId",
				(BiConsumer<FireBrigadeOperatorDetail, Long>)
					FireBrigadeOperatorDetail::setFireBrigadeOperatorDetailId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<FireBrigadeOperatorDetail, Long>)
					FireBrigadeOperatorDetail::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<FireBrigadeOperatorDetail, Long>)
					FireBrigadeOperatorDetail::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<FireBrigadeOperatorDetail, Long>)
					FireBrigadeOperatorDetail::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<FireBrigadeOperatorDetail, Date>)
					FireBrigadeOperatorDetail::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<FireBrigadeOperatorDetail, Date>)
					FireBrigadeOperatorDetail::setModifiedDate);
			attributeSetterBiConsumers.put(
				"operatorName",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setOperatorName);
			attributeSetterBiConsumers.put(
				"businessName",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setBusinessName);
			attributeSetterBiConsumers.put(
				"address",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setAddress);
			attributeSetterBiConsumers.put(
				"premisesUses",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setPremisesUses);
			attributeSetterBiConsumers.put(
				"premisesOccupancy",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setPremisesOccupancy);
			attributeSetterBiConsumers.put(
				"premisesBusiness",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setPremisesBusiness);
			attributeSetterBiConsumers.put(
				"maxWorkingPersons",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setMaxWorkingPersons);
			attributeSetterBiConsumers.put(
				"maxNumPersonsAtAnyOneTime",
				(BiConsumer<FireBrigadeOperatorDetail, String>)
					FireBrigadeOperatorDetail::setMaxNumPersonsAtAnyOneTime);
			attributeSetterBiConsumers.put(
				"fireBrigadeApplicationId",
				(BiConsumer<FireBrigadeOperatorDetail, Long>)
					FireBrigadeOperatorDetail::setFireBrigadeApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getFireBrigadeOperatorDetailId() {
		return _fireBrigadeOperatorDetailId;
	}

	@Override
	public void setFireBrigadeOperatorDetailId(
		long fireBrigadeOperatorDetailId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fireBrigadeOperatorDetailId = fireBrigadeOperatorDetailId;
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
	public String getOperatorName() {
		if (_operatorName == null) {
			return "";
		}
		else {
			return _operatorName;
		}
	}

	@Override
	public void setOperatorName(String operatorName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_operatorName = operatorName;
	}

	@JSON
	@Override
	public String getBusinessName() {
		if (_businessName == null) {
			return "";
		}
		else {
			return _businessName;
		}
	}

	@Override
	public void setBusinessName(String businessName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_businessName = businessName;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_address = address;
	}

	@JSON
	@Override
	public String getPremisesUses() {
		if (_premisesUses == null) {
			return "";
		}
		else {
			return _premisesUses;
		}
	}

	@Override
	public void setPremisesUses(String premisesUses) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_premisesUses = premisesUses;
	}

	@JSON
	@Override
	public String getPremisesOccupancy() {
		if (_premisesOccupancy == null) {
			return "";
		}
		else {
			return _premisesOccupancy;
		}
	}

	@Override
	public void setPremisesOccupancy(String premisesOccupancy) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_premisesOccupancy = premisesOccupancy;
	}

	@JSON
	@Override
	public String getPremisesBusiness() {
		if (_premisesBusiness == null) {
			return "";
		}
		else {
			return _premisesBusiness;
		}
	}

	@Override
	public void setPremisesBusiness(String premisesBusiness) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_premisesBusiness = premisesBusiness;
	}

	@JSON
	@Override
	public String getMaxWorkingPersons() {
		if (_maxWorkingPersons == null) {
			return "";
		}
		else {
			return _maxWorkingPersons;
		}
	}

	@Override
	public void setMaxWorkingPersons(String maxWorkingPersons) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_maxWorkingPersons = maxWorkingPersons;
	}

	@JSON
	@Override
	public String getMaxNumPersonsAtAnyOneTime() {
		if (_maxNumPersonsAtAnyOneTime == null) {
			return "";
		}
		else {
			return _maxNumPersonsAtAnyOneTime;
		}
	}

	@Override
	public void setMaxNumPersonsAtAnyOneTime(String maxNumPersonsAtAnyOneTime) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_maxNumPersonsAtAnyOneTime = maxNumPersonsAtAnyOneTime;
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
			getCompanyId(), FireBrigadeOperatorDetail.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FireBrigadeOperatorDetail toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, FireBrigadeOperatorDetail>
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
		FireBrigadeOperatorDetailImpl fireBrigadeOperatorDetailImpl =
			new FireBrigadeOperatorDetailImpl();

		fireBrigadeOperatorDetailImpl.setFireBrigadeOperatorDetailId(
			getFireBrigadeOperatorDetailId());
		fireBrigadeOperatorDetailImpl.setGroupId(getGroupId());
		fireBrigadeOperatorDetailImpl.setCompanyId(getCompanyId());
		fireBrigadeOperatorDetailImpl.setUserId(getUserId());
		fireBrigadeOperatorDetailImpl.setUserName(getUserName());
		fireBrigadeOperatorDetailImpl.setCreateDate(getCreateDate());
		fireBrigadeOperatorDetailImpl.setModifiedDate(getModifiedDate());
		fireBrigadeOperatorDetailImpl.setOperatorName(getOperatorName());
		fireBrigadeOperatorDetailImpl.setBusinessName(getBusinessName());
		fireBrigadeOperatorDetailImpl.setAddress(getAddress());
		fireBrigadeOperatorDetailImpl.setPremisesUses(getPremisesUses());
		fireBrigadeOperatorDetailImpl.setPremisesOccupancy(
			getPremisesOccupancy());
		fireBrigadeOperatorDetailImpl.setPremisesBusiness(
			getPremisesBusiness());
		fireBrigadeOperatorDetailImpl.setMaxWorkingPersons(
			getMaxWorkingPersons());
		fireBrigadeOperatorDetailImpl.setMaxNumPersonsAtAnyOneTime(
			getMaxNumPersonsAtAnyOneTime());
		fireBrigadeOperatorDetailImpl.setFireBrigadeApplicationId(
			getFireBrigadeApplicationId());

		fireBrigadeOperatorDetailImpl.resetOriginalValues();

		return fireBrigadeOperatorDetailImpl;
	}

	@Override
	public FireBrigadeOperatorDetail cloneWithOriginalValues() {
		FireBrigadeOperatorDetailImpl fireBrigadeOperatorDetailImpl =
			new FireBrigadeOperatorDetailImpl();

		fireBrigadeOperatorDetailImpl.setFireBrigadeOperatorDetailId(
			this.<Long>getColumnOriginalValue("fireBrigadeOperatorDetailId"));
		fireBrigadeOperatorDetailImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		fireBrigadeOperatorDetailImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		fireBrigadeOperatorDetailImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		fireBrigadeOperatorDetailImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		fireBrigadeOperatorDetailImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		fireBrigadeOperatorDetailImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		fireBrigadeOperatorDetailImpl.setOperatorName(
			this.<String>getColumnOriginalValue("operatorName"));
		fireBrigadeOperatorDetailImpl.setBusinessName(
			this.<String>getColumnOriginalValue("businessName"));
		fireBrigadeOperatorDetailImpl.setAddress(
			this.<String>getColumnOriginalValue("address"));
		fireBrigadeOperatorDetailImpl.setPremisesUses(
			this.<String>getColumnOriginalValue("premisesUses"));
		fireBrigadeOperatorDetailImpl.setPremisesOccupancy(
			this.<String>getColumnOriginalValue("premisesOccupancy"));
		fireBrigadeOperatorDetailImpl.setPremisesBusiness(
			this.<String>getColumnOriginalValue("premisesBusiness"));
		fireBrigadeOperatorDetailImpl.setMaxWorkingPersons(
			this.<String>getColumnOriginalValue("maxWorkingPersons"));
		fireBrigadeOperatorDetailImpl.setMaxNumPersonsAtAnyOneTime(
			this.<String>getColumnOriginalValue("maxNumPersonsAtAnyOneTime"));
		fireBrigadeOperatorDetailImpl.setFireBrigadeApplicationId(
			this.<Long>getColumnOriginalValue("fireBrigadeApplicationId"));

		return fireBrigadeOperatorDetailImpl;
	}

	@Override
	public int compareTo(FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), fireBrigadeOperatorDetail.getCreateDate());

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

		if (!(object instanceof FireBrigadeOperatorDetail)) {
			return false;
		}

		FireBrigadeOperatorDetail fireBrigadeOperatorDetail =
			(FireBrigadeOperatorDetail)object;

		long primaryKey = fireBrigadeOperatorDetail.getPrimaryKey();

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
	public CacheModel<FireBrigadeOperatorDetail> toCacheModel() {
		FireBrigadeOperatorDetailCacheModel
			fireBrigadeOperatorDetailCacheModel =
				new FireBrigadeOperatorDetailCacheModel();

		fireBrigadeOperatorDetailCacheModel.fireBrigadeOperatorDetailId =
			getFireBrigadeOperatorDetailId();

		fireBrigadeOperatorDetailCacheModel.groupId = getGroupId();

		fireBrigadeOperatorDetailCacheModel.companyId = getCompanyId();

		fireBrigadeOperatorDetailCacheModel.userId = getUserId();

		fireBrigadeOperatorDetailCacheModel.userName = getUserName();

		String userName = fireBrigadeOperatorDetailCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			fireBrigadeOperatorDetailCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			fireBrigadeOperatorDetailCacheModel.createDate =
				createDate.getTime();
		}
		else {
			fireBrigadeOperatorDetailCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			fireBrigadeOperatorDetailCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			fireBrigadeOperatorDetailCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		fireBrigadeOperatorDetailCacheModel.operatorName = getOperatorName();

		String operatorName = fireBrigadeOperatorDetailCacheModel.operatorName;

		if ((operatorName != null) && (operatorName.length() == 0)) {
			fireBrigadeOperatorDetailCacheModel.operatorName = null;
		}

		fireBrigadeOperatorDetailCacheModel.businessName = getBusinessName();

		String businessName = fireBrigadeOperatorDetailCacheModel.businessName;

		if ((businessName != null) && (businessName.length() == 0)) {
			fireBrigadeOperatorDetailCacheModel.businessName = null;
		}

		fireBrigadeOperatorDetailCacheModel.address = getAddress();

		String address = fireBrigadeOperatorDetailCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			fireBrigadeOperatorDetailCacheModel.address = null;
		}

		fireBrigadeOperatorDetailCacheModel.premisesUses = getPremisesUses();

		String premisesUses = fireBrigadeOperatorDetailCacheModel.premisesUses;

		if ((premisesUses != null) && (premisesUses.length() == 0)) {
			fireBrigadeOperatorDetailCacheModel.premisesUses = null;
		}

		fireBrigadeOperatorDetailCacheModel.premisesOccupancy =
			getPremisesOccupancy();

		String premisesOccupancy =
			fireBrigadeOperatorDetailCacheModel.premisesOccupancy;

		if ((premisesOccupancy != null) && (premisesOccupancy.length() == 0)) {
			fireBrigadeOperatorDetailCacheModel.premisesOccupancy = null;
		}

		fireBrigadeOperatorDetailCacheModel.premisesBusiness =
			getPremisesBusiness();

		String premisesBusiness =
			fireBrigadeOperatorDetailCacheModel.premisesBusiness;

		if ((premisesBusiness != null) && (premisesBusiness.length() == 0)) {
			fireBrigadeOperatorDetailCacheModel.premisesBusiness = null;
		}

		fireBrigadeOperatorDetailCacheModel.maxWorkingPersons =
			getMaxWorkingPersons();

		String maxWorkingPersons =
			fireBrigadeOperatorDetailCacheModel.maxWorkingPersons;

		if ((maxWorkingPersons != null) && (maxWorkingPersons.length() == 0)) {
			fireBrigadeOperatorDetailCacheModel.maxWorkingPersons = null;
		}

		fireBrigadeOperatorDetailCacheModel.maxNumPersonsAtAnyOneTime =
			getMaxNumPersonsAtAnyOneTime();

		String maxNumPersonsAtAnyOneTime =
			fireBrigadeOperatorDetailCacheModel.maxNumPersonsAtAnyOneTime;

		if ((maxNumPersonsAtAnyOneTime != null) &&
			(maxNumPersonsAtAnyOneTime.length() == 0)) {

			fireBrigadeOperatorDetailCacheModel.maxNumPersonsAtAnyOneTime =
				null;
		}

		fireBrigadeOperatorDetailCacheModel.fireBrigadeApplicationId =
			getFireBrigadeApplicationId();

		return fireBrigadeOperatorDetailCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<FireBrigadeOperatorDetail, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<FireBrigadeOperatorDetail, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FireBrigadeOperatorDetail, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(FireBrigadeOperatorDetail)this);

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
			<InvocationHandler, FireBrigadeOperatorDetail>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						FireBrigadeOperatorDetail.class, ModelWrapper.class);

	}

	private long _fireBrigadeOperatorDetailId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _operatorName;
	private String _businessName;
	private String _address;
	private String _premisesUses;
	private String _premisesOccupancy;
	private String _premisesBusiness;
	private String _maxWorkingPersons;
	private String _maxNumPersonsAtAnyOneTime;
	private long _fireBrigadeApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<FireBrigadeOperatorDetail, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((FireBrigadeOperatorDetail)this);
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
			"fireBrigadeOperatorDetailId", _fireBrigadeOperatorDetailId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("operatorName", _operatorName);
		_columnOriginalValues.put("businessName", _businessName);
		_columnOriginalValues.put("address", _address);
		_columnOriginalValues.put("premisesUses", _premisesUses);
		_columnOriginalValues.put("premisesOccupancy", _premisesOccupancy);
		_columnOriginalValues.put("premisesBusiness", _premisesBusiness);
		_columnOriginalValues.put("maxWorkingPersons", _maxWorkingPersons);
		_columnOriginalValues.put(
			"maxNumPersonsAtAnyOneTime", _maxNumPersonsAtAnyOneTime);
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

		columnBitmasks.put("fireBrigadeOperatorDetailId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("operatorName", 128L);

		columnBitmasks.put("businessName", 256L);

		columnBitmasks.put("address", 512L);

		columnBitmasks.put("premisesUses", 1024L);

		columnBitmasks.put("premisesOccupancy", 2048L);

		columnBitmasks.put("premisesBusiness", 4096L);

		columnBitmasks.put("maxWorkingPersons", 8192L);

		columnBitmasks.put("maxNumPersonsAtAnyOneTime", 16384L);

		columnBitmasks.put("fireBrigadeApplicationId", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private FireBrigadeOperatorDetail _escapedModel;

}