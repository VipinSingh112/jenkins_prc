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

import com.nbp.sez.status.application.form.service.model.SezZoneLocationAdd;
import com.nbp.sez.status.application.form.service.model.SezZoneLocationAddModel;

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
 * The base model implementation for the SezZoneLocationAdd service. Represents a row in the &quot;nbp_sez_zone_location_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezZoneLocationAddModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezZoneLocationAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneLocationAddImpl
 * @generated
 */
@JSON(strict = true)
public class SezZoneLocationAddModelImpl
	extends BaseModelImpl<SezZoneLocationAdd>
	implements SezZoneLocationAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez zone location add model instance should use the <code>SezZoneLocationAdd</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_zone_location_add";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezZoneLocationAddId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"developerLocation", Types.VARCHAR},
		{"developerLocationDescription", Types.VARCHAR},
		{"counter", Types.VARCHAR}, {"sezStatusApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezZoneLocationAddId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("developerLocation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("developerLocationDescription", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezStatusApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_zone_location_add (sezZoneLocationAddId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,developerLocation VARCHAR(75) null,developerLocationDescription VARCHAR(75) null,counter VARCHAR(75) null,sezStatusApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_zone_location_add";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezZoneLocationAdd.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_zone_location_add.createDate ASC";

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

	public SezZoneLocationAddModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezZoneLocationAddId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezZoneLocationAddId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezZoneLocationAddId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezZoneLocationAdd.class;
	}

	@Override
	public String getModelClassName() {
		return SezZoneLocationAdd.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezZoneLocationAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezZoneLocationAdd, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezZoneLocationAdd, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezZoneLocationAdd)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezZoneLocationAdd, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezZoneLocationAdd, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezZoneLocationAdd)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezZoneLocationAdd, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezZoneLocationAdd, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<SezZoneLocationAdd, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<SezZoneLocationAdd, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezZoneLocationAdd, Object>>();

			attributeGetterFunctions.put(
				"sezZoneLocationAddId",
				SezZoneLocationAdd::getSezZoneLocationAddId);
			attributeGetterFunctions.put(
				"groupId", SezZoneLocationAdd::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezZoneLocationAdd::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezZoneLocationAdd::getUserId);
			attributeGetterFunctions.put(
				"userName", SezZoneLocationAdd::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezZoneLocationAdd::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezZoneLocationAdd::getModifiedDate);
			attributeGetterFunctions.put(
				"developerLocation", SezZoneLocationAdd::getDeveloperLocation);
			attributeGetterFunctions.put(
				"developerLocationDescription",
				SezZoneLocationAdd::getDeveloperLocationDescription);
			attributeGetterFunctions.put(
				"counter", SezZoneLocationAdd::getCounter);
			attributeGetterFunctions.put(
				"sezStatusApplicationId",
				SezZoneLocationAdd::getSezStatusApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<SezZoneLocationAdd, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezZoneLocationAdd, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezZoneLocationAdd, ?>>();

			attributeSetterBiConsumers.put(
				"sezZoneLocationAddId",
				(BiConsumer<SezZoneLocationAdd, Long>)
					SezZoneLocationAdd::setSezZoneLocationAddId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezZoneLocationAdd, Long>)
					SezZoneLocationAdd::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezZoneLocationAdd, Long>)
					SezZoneLocationAdd::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezZoneLocationAdd, Long>)
					SezZoneLocationAdd::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezZoneLocationAdd, String>)
					SezZoneLocationAdd::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezZoneLocationAdd, Date>)
					SezZoneLocationAdd::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezZoneLocationAdd, Date>)
					SezZoneLocationAdd::setModifiedDate);
			attributeSetterBiConsumers.put(
				"developerLocation",
				(BiConsumer<SezZoneLocationAdd, String>)
					SezZoneLocationAdd::setDeveloperLocation);
			attributeSetterBiConsumers.put(
				"developerLocationDescription",
				(BiConsumer<SezZoneLocationAdd, String>)
					SezZoneLocationAdd::setDeveloperLocationDescription);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<SezZoneLocationAdd, String>)
					SezZoneLocationAdd::setCounter);
			attributeSetterBiConsumers.put(
				"sezStatusApplicationId",
				(BiConsumer<SezZoneLocationAdd, Long>)
					SezZoneLocationAdd::setSezStatusApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezZoneLocationAddId() {
		return _sezZoneLocationAddId;
	}

	@Override
	public void setSezZoneLocationAddId(long sezZoneLocationAddId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezZoneLocationAddId = sezZoneLocationAddId;
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
	public String getDeveloperLocation() {
		if (_developerLocation == null) {
			return "";
		}
		else {
			return _developerLocation;
		}
	}

	@Override
	public void setDeveloperLocation(String developerLocation) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_developerLocation = developerLocation;
	}

	@JSON
	@Override
	public String getDeveloperLocationDescription() {
		if (_developerLocationDescription == null) {
			return "";
		}
		else {
			return _developerLocationDescription;
		}
	}

	@Override
	public void setDeveloperLocationDescription(
		String developerLocationDescription) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_developerLocationDescription = developerLocationDescription;
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
			getCompanyId(), SezZoneLocationAdd.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezZoneLocationAdd toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezZoneLocationAdd>
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
		SezZoneLocationAddImpl sezZoneLocationAddImpl =
			new SezZoneLocationAddImpl();

		sezZoneLocationAddImpl.setSezZoneLocationAddId(
			getSezZoneLocationAddId());
		sezZoneLocationAddImpl.setGroupId(getGroupId());
		sezZoneLocationAddImpl.setCompanyId(getCompanyId());
		sezZoneLocationAddImpl.setUserId(getUserId());
		sezZoneLocationAddImpl.setUserName(getUserName());
		sezZoneLocationAddImpl.setCreateDate(getCreateDate());
		sezZoneLocationAddImpl.setModifiedDate(getModifiedDate());
		sezZoneLocationAddImpl.setDeveloperLocation(getDeveloperLocation());
		sezZoneLocationAddImpl.setDeveloperLocationDescription(
			getDeveloperLocationDescription());
		sezZoneLocationAddImpl.setCounter(getCounter());
		sezZoneLocationAddImpl.setSezStatusApplicationId(
			getSezStatusApplicationId());

		sezZoneLocationAddImpl.resetOriginalValues();

		return sezZoneLocationAddImpl;
	}

	@Override
	public SezZoneLocationAdd cloneWithOriginalValues() {
		SezZoneLocationAddImpl sezZoneLocationAddImpl =
			new SezZoneLocationAddImpl();

		sezZoneLocationAddImpl.setSezZoneLocationAddId(
			this.<Long>getColumnOriginalValue("sezZoneLocationAddId"));
		sezZoneLocationAddImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezZoneLocationAddImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezZoneLocationAddImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezZoneLocationAddImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezZoneLocationAddImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezZoneLocationAddImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezZoneLocationAddImpl.setDeveloperLocation(
			this.<String>getColumnOriginalValue("developerLocation"));
		sezZoneLocationAddImpl.setDeveloperLocationDescription(
			this.<String>getColumnOriginalValue(
				"developerLocationDescription"));
		sezZoneLocationAddImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		sezZoneLocationAddImpl.setSezStatusApplicationId(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));

		return sezZoneLocationAddImpl;
	}

	@Override
	public int compareTo(SezZoneLocationAdd sezZoneLocationAdd) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezZoneLocationAdd.getCreateDate());

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

		if (!(object instanceof SezZoneLocationAdd)) {
			return false;
		}

		SezZoneLocationAdd sezZoneLocationAdd = (SezZoneLocationAdd)object;

		long primaryKey = sezZoneLocationAdd.getPrimaryKey();

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
	public CacheModel<SezZoneLocationAdd> toCacheModel() {
		SezZoneLocationAddCacheModel sezZoneLocationAddCacheModel =
			new SezZoneLocationAddCacheModel();

		sezZoneLocationAddCacheModel.sezZoneLocationAddId =
			getSezZoneLocationAddId();

		sezZoneLocationAddCacheModel.groupId = getGroupId();

		sezZoneLocationAddCacheModel.companyId = getCompanyId();

		sezZoneLocationAddCacheModel.userId = getUserId();

		sezZoneLocationAddCacheModel.userName = getUserName();

		String userName = sezZoneLocationAddCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezZoneLocationAddCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezZoneLocationAddCacheModel.createDate = createDate.getTime();
		}
		else {
			sezZoneLocationAddCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezZoneLocationAddCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			sezZoneLocationAddCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezZoneLocationAddCacheModel.developerLocation = getDeveloperLocation();

		String developerLocation =
			sezZoneLocationAddCacheModel.developerLocation;

		if ((developerLocation != null) && (developerLocation.length() == 0)) {
			sezZoneLocationAddCacheModel.developerLocation = null;
		}

		sezZoneLocationAddCacheModel.developerLocationDescription =
			getDeveloperLocationDescription();

		String developerLocationDescription =
			sezZoneLocationAddCacheModel.developerLocationDescription;

		if ((developerLocationDescription != null) &&
			(developerLocationDescription.length() == 0)) {

			sezZoneLocationAddCacheModel.developerLocationDescription = null;
		}

		sezZoneLocationAddCacheModel.counter = getCounter();

		String counter = sezZoneLocationAddCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			sezZoneLocationAddCacheModel.counter = null;
		}

		sezZoneLocationAddCacheModel.sezStatusApplicationId =
			getSezStatusApplicationId();

		return sezZoneLocationAddCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezZoneLocationAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezZoneLocationAdd, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezZoneLocationAdd, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezZoneLocationAdd)this);

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

		private static final Function<InvocationHandler, SezZoneLocationAdd>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					SezZoneLocationAdd.class, ModelWrapper.class);

	}

	private long _sezZoneLocationAddId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _developerLocation;
	private String _developerLocationDescription;
	private String _counter;
	private long _sezStatusApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<SezZoneLocationAdd, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezZoneLocationAdd)this);
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
			"sezZoneLocationAddId", _sezZoneLocationAddId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("developerLocation", _developerLocation);
		_columnOriginalValues.put(
			"developerLocationDescription", _developerLocationDescription);
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

		columnBitmasks.put("sezZoneLocationAddId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("developerLocation", 128L);

		columnBitmasks.put("developerLocationDescription", 256L);

		columnBitmasks.put("counter", 512L);

		columnBitmasks.put("sezStatusApplicationId", 1024L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezZoneLocationAdd _escapedModel;

}