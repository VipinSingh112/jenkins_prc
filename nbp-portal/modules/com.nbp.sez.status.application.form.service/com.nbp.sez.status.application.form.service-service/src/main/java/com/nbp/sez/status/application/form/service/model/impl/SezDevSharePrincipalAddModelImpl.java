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

import com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAdd;
import com.nbp.sez.status.application.form.service.model.SezDevSharePrincipalAddModel;

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
 * The base model implementation for the SezDevSharePrincipalAdd service. Represents a row in the &quot;nbp_sez_dev_share_pricipal_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezDevSharePrincipalAddModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezDevSharePrincipalAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevSharePrincipalAddImpl
 * @generated
 */
@JSON(strict = true)
public class SezDevSharePrincipalAddModelImpl
	extends BaseModelImpl<SezDevSharePrincipalAdd>
	implements SezDevSharePrincipalAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez dev share principal add model instance should use the <code>SezDevSharePrincipalAdd</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_dev_share_pricipal_add";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezDevSharePrincipalAddId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"name", Types.VARCHAR},
		{"buildingNum", Types.VARCHAR}, {"parishPost", Types.VARCHAR},
		{"country", Types.VARCHAR}, {"nationality", Types.VARCHAR},
		{"taxRegistrationNum", Types.VARCHAR}, {"counter", Types.VARCHAR},
		{"sezStatusApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezDevSharePrincipalAddId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("buildingNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("parishPost", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("country", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nationality", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("taxRegistrationNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezStatusApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_dev_share_pricipal_add (sezDevSharePrincipalAddId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,buildingNum VARCHAR(75) null,parishPost VARCHAR(75) null,country VARCHAR(75) null,nationality VARCHAR(75) null,taxRegistrationNum VARCHAR(75) null,counter VARCHAR(75) null,sezStatusApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_dev_share_pricipal_add";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezDevSharePrincipalAdd.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_dev_share_pricipal_add.createDate ASC";

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

	public SezDevSharePrincipalAddModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezDevSharePrincipalAddId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezDevSharePrincipalAddId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezDevSharePrincipalAddId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezDevSharePrincipalAdd.class;
	}

	@Override
	public String getModelClassName() {
		return SezDevSharePrincipalAdd.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezDevSharePrincipalAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezDevSharePrincipalAdd, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezDevSharePrincipalAdd, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezDevSharePrincipalAdd)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezDevSharePrincipalAdd, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezDevSharePrincipalAdd, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezDevSharePrincipalAdd)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezDevSharePrincipalAdd, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezDevSharePrincipalAdd, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<SezDevSharePrincipalAdd, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<SezDevSharePrincipalAdd, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezDevSharePrincipalAdd, Object>>();

			attributeGetterFunctions.put(
				"sezDevSharePrincipalAddId",
				SezDevSharePrincipalAdd::getSezDevSharePrincipalAddId);
			attributeGetterFunctions.put(
				"groupId", SezDevSharePrincipalAdd::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezDevSharePrincipalAdd::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezDevSharePrincipalAdd::getUserId);
			attributeGetterFunctions.put(
				"userName", SezDevSharePrincipalAdd::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezDevSharePrincipalAdd::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezDevSharePrincipalAdd::getModifiedDate);
			attributeGetterFunctions.put(
				"name", SezDevSharePrincipalAdd::getName);
			attributeGetterFunctions.put(
				"buildingNum", SezDevSharePrincipalAdd::getBuildingNum);
			attributeGetterFunctions.put(
				"parishPost", SezDevSharePrincipalAdd::getParishPost);
			attributeGetterFunctions.put(
				"country", SezDevSharePrincipalAdd::getCountry);
			attributeGetterFunctions.put(
				"nationality", SezDevSharePrincipalAdd::getNationality);
			attributeGetterFunctions.put(
				"taxRegistrationNum",
				SezDevSharePrincipalAdd::getTaxRegistrationNum);
			attributeGetterFunctions.put(
				"counter", SezDevSharePrincipalAdd::getCounter);
			attributeGetterFunctions.put(
				"sezStatusApplicationId",
				SezDevSharePrincipalAdd::getSezStatusApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<SezDevSharePrincipalAdd, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezDevSharePrincipalAdd, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezDevSharePrincipalAdd, ?>>();

			attributeSetterBiConsumers.put(
				"sezDevSharePrincipalAddId",
				(BiConsumer<SezDevSharePrincipalAdd, Long>)
					SezDevSharePrincipalAdd::setSezDevSharePrincipalAddId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezDevSharePrincipalAdd, Long>)
					SezDevSharePrincipalAdd::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezDevSharePrincipalAdd, Long>)
					SezDevSharePrincipalAdd::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezDevSharePrincipalAdd, Long>)
					SezDevSharePrincipalAdd::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezDevSharePrincipalAdd, String>)
					SezDevSharePrincipalAdd::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezDevSharePrincipalAdd, Date>)
					SezDevSharePrincipalAdd::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezDevSharePrincipalAdd, Date>)
					SezDevSharePrincipalAdd::setModifiedDate);
			attributeSetterBiConsumers.put(
				"name",
				(BiConsumer<SezDevSharePrincipalAdd, String>)
					SezDevSharePrincipalAdd::setName);
			attributeSetterBiConsumers.put(
				"buildingNum",
				(BiConsumer<SezDevSharePrincipalAdd, String>)
					SezDevSharePrincipalAdd::setBuildingNum);
			attributeSetterBiConsumers.put(
				"parishPost",
				(BiConsumer<SezDevSharePrincipalAdd, String>)
					SezDevSharePrincipalAdd::setParishPost);
			attributeSetterBiConsumers.put(
				"country",
				(BiConsumer<SezDevSharePrincipalAdd, String>)
					SezDevSharePrincipalAdd::setCountry);
			attributeSetterBiConsumers.put(
				"nationality",
				(BiConsumer<SezDevSharePrincipalAdd, String>)
					SezDevSharePrincipalAdd::setNationality);
			attributeSetterBiConsumers.put(
				"taxRegistrationNum",
				(BiConsumer<SezDevSharePrincipalAdd, String>)
					SezDevSharePrincipalAdd::setTaxRegistrationNum);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<SezDevSharePrincipalAdd, String>)
					SezDevSharePrincipalAdd::setCounter);
			attributeSetterBiConsumers.put(
				"sezStatusApplicationId",
				(BiConsumer<SezDevSharePrincipalAdd, Long>)
					SezDevSharePrincipalAdd::setSezStatusApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezDevSharePrincipalAddId() {
		return _sezDevSharePrincipalAddId;
	}

	@Override
	public void setSezDevSharePrincipalAddId(long sezDevSharePrincipalAddId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezDevSharePrincipalAddId = sezDevSharePrincipalAddId;
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
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
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
	public String getParishPost() {
		if (_parishPost == null) {
			return "";
		}
		else {
			return _parishPost;
		}
	}

	@Override
	public void setParishPost(String parishPost) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_parishPost = parishPost;
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
	public String getNationality() {
		if (_nationality == null) {
			return "";
		}
		else {
			return _nationality;
		}
	}

	@Override
	public void setNationality(String nationality) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nationality = nationality;
	}

	@JSON
	@Override
	public String getTaxRegistrationNum() {
		if (_taxRegistrationNum == null) {
			return "";
		}
		else {
			return _taxRegistrationNum;
		}
	}

	@Override
	public void setTaxRegistrationNum(String taxRegistrationNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_taxRegistrationNum = taxRegistrationNum;
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
			getCompanyId(), SezDevSharePrincipalAdd.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezDevSharePrincipalAdd toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezDevSharePrincipalAdd>
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
		SezDevSharePrincipalAddImpl sezDevSharePrincipalAddImpl =
			new SezDevSharePrincipalAddImpl();

		sezDevSharePrincipalAddImpl.setSezDevSharePrincipalAddId(
			getSezDevSharePrincipalAddId());
		sezDevSharePrincipalAddImpl.setGroupId(getGroupId());
		sezDevSharePrincipalAddImpl.setCompanyId(getCompanyId());
		sezDevSharePrincipalAddImpl.setUserId(getUserId());
		sezDevSharePrincipalAddImpl.setUserName(getUserName());
		sezDevSharePrincipalAddImpl.setCreateDate(getCreateDate());
		sezDevSharePrincipalAddImpl.setModifiedDate(getModifiedDate());
		sezDevSharePrincipalAddImpl.setName(getName());
		sezDevSharePrincipalAddImpl.setBuildingNum(getBuildingNum());
		sezDevSharePrincipalAddImpl.setParishPost(getParishPost());
		sezDevSharePrincipalAddImpl.setCountry(getCountry());
		sezDevSharePrincipalAddImpl.setNationality(getNationality());
		sezDevSharePrincipalAddImpl.setTaxRegistrationNum(
			getTaxRegistrationNum());
		sezDevSharePrincipalAddImpl.setCounter(getCounter());
		sezDevSharePrincipalAddImpl.setSezStatusApplicationId(
			getSezStatusApplicationId());

		sezDevSharePrincipalAddImpl.resetOriginalValues();

		return sezDevSharePrincipalAddImpl;
	}

	@Override
	public SezDevSharePrincipalAdd cloneWithOriginalValues() {
		SezDevSharePrincipalAddImpl sezDevSharePrincipalAddImpl =
			new SezDevSharePrincipalAddImpl();

		sezDevSharePrincipalAddImpl.setSezDevSharePrincipalAddId(
			this.<Long>getColumnOriginalValue("sezDevSharePrincipalAddId"));
		sezDevSharePrincipalAddImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezDevSharePrincipalAddImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezDevSharePrincipalAddImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezDevSharePrincipalAddImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezDevSharePrincipalAddImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezDevSharePrincipalAddImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezDevSharePrincipalAddImpl.setName(
			this.<String>getColumnOriginalValue("name"));
		sezDevSharePrincipalAddImpl.setBuildingNum(
			this.<String>getColumnOriginalValue("buildingNum"));
		sezDevSharePrincipalAddImpl.setParishPost(
			this.<String>getColumnOriginalValue("parishPost"));
		sezDevSharePrincipalAddImpl.setCountry(
			this.<String>getColumnOriginalValue("country"));
		sezDevSharePrincipalAddImpl.setNationality(
			this.<String>getColumnOriginalValue("nationality"));
		sezDevSharePrincipalAddImpl.setTaxRegistrationNum(
			this.<String>getColumnOriginalValue("taxRegistrationNum"));
		sezDevSharePrincipalAddImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		sezDevSharePrincipalAddImpl.setSezStatusApplicationId(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));

		return sezDevSharePrincipalAddImpl;
	}

	@Override
	public int compareTo(SezDevSharePrincipalAdd sezDevSharePrincipalAdd) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezDevSharePrincipalAdd.getCreateDate());

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

		if (!(object instanceof SezDevSharePrincipalAdd)) {
			return false;
		}

		SezDevSharePrincipalAdd sezDevSharePrincipalAdd =
			(SezDevSharePrincipalAdd)object;

		long primaryKey = sezDevSharePrincipalAdd.getPrimaryKey();

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
	public CacheModel<SezDevSharePrincipalAdd> toCacheModel() {
		SezDevSharePrincipalAddCacheModel sezDevSharePrincipalAddCacheModel =
			new SezDevSharePrincipalAddCacheModel();

		sezDevSharePrincipalAddCacheModel.sezDevSharePrincipalAddId =
			getSezDevSharePrincipalAddId();

		sezDevSharePrincipalAddCacheModel.groupId = getGroupId();

		sezDevSharePrincipalAddCacheModel.companyId = getCompanyId();

		sezDevSharePrincipalAddCacheModel.userId = getUserId();

		sezDevSharePrincipalAddCacheModel.userName = getUserName();

		String userName = sezDevSharePrincipalAddCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezDevSharePrincipalAddCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezDevSharePrincipalAddCacheModel.createDate = createDate.getTime();
		}
		else {
			sezDevSharePrincipalAddCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezDevSharePrincipalAddCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			sezDevSharePrincipalAddCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezDevSharePrincipalAddCacheModel.name = getName();

		String name = sezDevSharePrincipalAddCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			sezDevSharePrincipalAddCacheModel.name = null;
		}

		sezDevSharePrincipalAddCacheModel.buildingNum = getBuildingNum();

		String buildingNum = sezDevSharePrincipalAddCacheModel.buildingNum;

		if ((buildingNum != null) && (buildingNum.length() == 0)) {
			sezDevSharePrincipalAddCacheModel.buildingNum = null;
		}

		sezDevSharePrincipalAddCacheModel.parishPost = getParishPost();

		String parishPost = sezDevSharePrincipalAddCacheModel.parishPost;

		if ((parishPost != null) && (parishPost.length() == 0)) {
			sezDevSharePrincipalAddCacheModel.parishPost = null;
		}

		sezDevSharePrincipalAddCacheModel.country = getCountry();

		String country = sezDevSharePrincipalAddCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			sezDevSharePrincipalAddCacheModel.country = null;
		}

		sezDevSharePrincipalAddCacheModel.nationality = getNationality();

		String nationality = sezDevSharePrincipalAddCacheModel.nationality;

		if ((nationality != null) && (nationality.length() == 0)) {
			sezDevSharePrincipalAddCacheModel.nationality = null;
		}

		sezDevSharePrincipalAddCacheModel.taxRegistrationNum =
			getTaxRegistrationNum();

		String taxRegistrationNum =
			sezDevSharePrincipalAddCacheModel.taxRegistrationNum;

		if ((taxRegistrationNum != null) &&
			(taxRegistrationNum.length() == 0)) {

			sezDevSharePrincipalAddCacheModel.taxRegistrationNum = null;
		}

		sezDevSharePrincipalAddCacheModel.counter = getCounter();

		String counter = sezDevSharePrincipalAddCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			sezDevSharePrincipalAddCacheModel.counter = null;
		}

		sezDevSharePrincipalAddCacheModel.sezStatusApplicationId =
			getSezStatusApplicationId();

		return sezDevSharePrincipalAddCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezDevSharePrincipalAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezDevSharePrincipalAdd, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezDevSharePrincipalAdd, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezDevSharePrincipalAdd)this);

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
			<InvocationHandler, SezDevSharePrincipalAdd>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						SezDevSharePrincipalAdd.class, ModelWrapper.class);

	}

	private long _sezDevSharePrincipalAddId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _name;
	private String _buildingNum;
	private String _parishPost;
	private String _country;
	private String _nationality;
	private String _taxRegistrationNum;
	private String _counter;
	private long _sezStatusApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<SezDevSharePrincipalAdd, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezDevSharePrincipalAdd)this);
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
			"sezDevSharePrincipalAddId", _sezDevSharePrincipalAddId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("buildingNum", _buildingNum);
		_columnOriginalValues.put("parishPost", _parishPost);
		_columnOriginalValues.put("country", _country);
		_columnOriginalValues.put("nationality", _nationality);
		_columnOriginalValues.put("taxRegistrationNum", _taxRegistrationNum);
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

		columnBitmasks.put("sezDevSharePrincipalAddId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("name", 128L);

		columnBitmasks.put("buildingNum", 256L);

		columnBitmasks.put("parishPost", 512L);

		columnBitmasks.put("country", 1024L);

		columnBitmasks.put("nationality", 2048L);

		columnBitmasks.put("taxRegistrationNum", 4096L);

		columnBitmasks.put("counter", 8192L);

		columnBitmasks.put("sezStatusApplicationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezDevSharePrincipalAdd _escapedModel;

}