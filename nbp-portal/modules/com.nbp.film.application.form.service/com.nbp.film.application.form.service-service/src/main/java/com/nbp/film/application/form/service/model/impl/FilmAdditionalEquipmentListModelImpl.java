/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model.impl;

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

import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;
import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentListModel;

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
 * The base model implementation for the FilmAdditionalEquipmentList service. Represents a row in the &quot;nbp_film_additional_equip_list&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>FilmAdditionalEquipmentListModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FilmAdditionalEquipmentListImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentListImpl
 * @generated
 */
@JSON(strict = true)
public class FilmAdditionalEquipmentListModelImpl
	extends BaseModelImpl<FilmAdditionalEquipmentList>
	implements FilmAdditionalEquipmentListModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a film additional equipment list model instance should use the <code>FilmAdditionalEquipmentList</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_film_additional_equip_list";

	public static final Object[][] TABLE_COLUMNS = {
		{"FilmAdditionalEquipmentListId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"arrivalDate", Types.TIMESTAMP}, {"airlineShipper", Types.VARCHAR},
		{"flightVesselNum", Types.VARCHAR}, {"passengerName", Types.VARCHAR},
		{"entryPort", Types.VARCHAR}, {"customsBroker", Types.VARCHAR},
		{"flightNumber", Types.VARCHAR}, {"counter", Types.VARCHAR},
		{"filmApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("FilmAdditionalEquipmentListId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("arrivalDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("airlineShipper", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("flightVesselNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("passengerName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("entryPort", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("customsBroker", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("flightNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("filmApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_film_additional_equip_list (FilmAdditionalEquipmentListId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,arrivalDate DATE null,airlineShipper VARCHAR(75) null,flightVesselNum VARCHAR(75) null,passengerName VARCHAR(75) null,entryPort VARCHAR(75) null,customsBroker VARCHAR(75) null,flightNumber VARCHAR(75) null,counter VARCHAR(75) null,filmApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_film_additional_equip_list";

	public static final String ORDER_BY_JPQL =
		" ORDER BY filmAdditionalEquipmentList.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_film_additional_equip_list.createDate ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long FILMAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public FilmAdditionalEquipmentListModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _FilmAdditionalEquipmentListId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFilmAdditionalEquipmentListId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _FilmAdditionalEquipmentListId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FilmAdditionalEquipmentList.class;
	}

	@Override
	public String getModelClassName() {
		return FilmAdditionalEquipmentList.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<FilmAdditionalEquipmentList, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<FilmAdditionalEquipmentList, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FilmAdditionalEquipmentList, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(FilmAdditionalEquipmentList)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<FilmAdditionalEquipmentList, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<FilmAdditionalEquipmentList, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(FilmAdditionalEquipmentList)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<FilmAdditionalEquipmentList, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<FilmAdditionalEquipmentList, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<FilmAdditionalEquipmentList, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<FilmAdditionalEquipmentList, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<FilmAdditionalEquipmentList, Object>>();

			attributeGetterFunctions.put(
				"FilmAdditionalEquipmentListId",
				FilmAdditionalEquipmentList::getFilmAdditionalEquipmentListId);
			attributeGetterFunctions.put(
				"groupId", FilmAdditionalEquipmentList::getGroupId);
			attributeGetterFunctions.put(
				"companyId", FilmAdditionalEquipmentList::getCompanyId);
			attributeGetterFunctions.put(
				"userId", FilmAdditionalEquipmentList::getUserId);
			attributeGetterFunctions.put(
				"userName", FilmAdditionalEquipmentList::getUserName);
			attributeGetterFunctions.put(
				"createDate", FilmAdditionalEquipmentList::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", FilmAdditionalEquipmentList::getModifiedDate);
			attributeGetterFunctions.put(
				"arrivalDate", FilmAdditionalEquipmentList::getArrivalDate);
			attributeGetterFunctions.put(
				"airlineShipper",
				FilmAdditionalEquipmentList::getAirlineShipper);
			attributeGetterFunctions.put(
				"flightVesselNum",
				FilmAdditionalEquipmentList::getFlightVesselNum);
			attributeGetterFunctions.put(
				"passengerName", FilmAdditionalEquipmentList::getPassengerName);
			attributeGetterFunctions.put(
				"entryPort", FilmAdditionalEquipmentList::getEntryPort);
			attributeGetterFunctions.put(
				"customsBroker", FilmAdditionalEquipmentList::getCustomsBroker);
			attributeGetterFunctions.put(
				"flightNumber", FilmAdditionalEquipmentList::getFlightNumber);
			attributeGetterFunctions.put(
				"counter", FilmAdditionalEquipmentList::getCounter);
			attributeGetterFunctions.put(
				"filmApplicationId",
				FilmAdditionalEquipmentList::getFilmApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<FilmAdditionalEquipmentList, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<FilmAdditionalEquipmentList, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<FilmAdditionalEquipmentList, ?>>();

			attributeSetterBiConsumers.put(
				"FilmAdditionalEquipmentListId",
				(BiConsumer<FilmAdditionalEquipmentList, Long>)
					FilmAdditionalEquipmentList::
						setFilmAdditionalEquipmentListId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<FilmAdditionalEquipmentList, Long>)
					FilmAdditionalEquipmentList::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<FilmAdditionalEquipmentList, Long>)
					FilmAdditionalEquipmentList::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<FilmAdditionalEquipmentList, Long>)
					FilmAdditionalEquipmentList::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<FilmAdditionalEquipmentList, String>)
					FilmAdditionalEquipmentList::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<FilmAdditionalEquipmentList, Date>)
					FilmAdditionalEquipmentList::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<FilmAdditionalEquipmentList, Date>)
					FilmAdditionalEquipmentList::setModifiedDate);
			attributeSetterBiConsumers.put(
				"arrivalDate",
				(BiConsumer<FilmAdditionalEquipmentList, Date>)
					FilmAdditionalEquipmentList::setArrivalDate);
			attributeSetterBiConsumers.put(
				"airlineShipper",
				(BiConsumer<FilmAdditionalEquipmentList, String>)
					FilmAdditionalEquipmentList::setAirlineShipper);
			attributeSetterBiConsumers.put(
				"flightVesselNum",
				(BiConsumer<FilmAdditionalEquipmentList, String>)
					FilmAdditionalEquipmentList::setFlightVesselNum);
			attributeSetterBiConsumers.put(
				"passengerName",
				(BiConsumer<FilmAdditionalEquipmentList, String>)
					FilmAdditionalEquipmentList::setPassengerName);
			attributeSetterBiConsumers.put(
				"entryPort",
				(BiConsumer<FilmAdditionalEquipmentList, String>)
					FilmAdditionalEquipmentList::setEntryPort);
			attributeSetterBiConsumers.put(
				"customsBroker",
				(BiConsumer<FilmAdditionalEquipmentList, String>)
					FilmAdditionalEquipmentList::setCustomsBroker);
			attributeSetterBiConsumers.put(
				"flightNumber",
				(BiConsumer<FilmAdditionalEquipmentList, String>)
					FilmAdditionalEquipmentList::setFlightNumber);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<FilmAdditionalEquipmentList, String>)
					FilmAdditionalEquipmentList::setCounter);
			attributeSetterBiConsumers.put(
				"filmApplicationId",
				(BiConsumer<FilmAdditionalEquipmentList, Long>)
					FilmAdditionalEquipmentList::setFilmApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getFilmAdditionalEquipmentListId() {
		return _FilmAdditionalEquipmentListId;
	}

	@Override
	public void setFilmAdditionalEquipmentListId(
		long FilmAdditionalEquipmentListId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_FilmAdditionalEquipmentListId = FilmAdditionalEquipmentListId;
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
	public Date getArrivalDate() {
		return _arrivalDate;
	}

	@Override
	public void setArrivalDate(Date arrivalDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_arrivalDate = arrivalDate;
	}

	@JSON
	@Override
	public String getAirlineShipper() {
		if (_airlineShipper == null) {
			return "";
		}
		else {
			return _airlineShipper;
		}
	}

	@Override
	public void setAirlineShipper(String airlineShipper) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_airlineShipper = airlineShipper;
	}

	@JSON
	@Override
	public String getFlightVesselNum() {
		if (_flightVesselNum == null) {
			return "";
		}
		else {
			return _flightVesselNum;
		}
	}

	@Override
	public void setFlightVesselNum(String flightVesselNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_flightVesselNum = flightVesselNum;
	}

	@JSON
	@Override
	public String getPassengerName() {
		if (_passengerName == null) {
			return "";
		}
		else {
			return _passengerName;
		}
	}

	@Override
	public void setPassengerName(String passengerName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_passengerName = passengerName;
	}

	@JSON
	@Override
	public String getEntryPort() {
		if (_entryPort == null) {
			return "";
		}
		else {
			return _entryPort;
		}
	}

	@Override
	public void setEntryPort(String entryPort) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_entryPort = entryPort;
	}

	@JSON
	@Override
	public String getCustomsBroker() {
		if (_customsBroker == null) {
			return "";
		}
		else {
			return _customsBroker;
		}
	}

	@Override
	public void setCustomsBroker(String customsBroker) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_customsBroker = customsBroker;
	}

	@JSON
	@Override
	public String getFlightNumber() {
		if (_flightNumber == null) {
			return "";
		}
		else {
			return _flightNumber;
		}
	}

	@Override
	public void setFlightNumber(String flightNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_flightNumber = flightNumber;
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
	public long getFilmApplicationId() {
		return _filmApplicationId;
	}

	@Override
	public void setFilmApplicationId(long filmApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_filmApplicationId = filmApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalFilmApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("filmApplicationId"));
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
			getCompanyId(), FilmAdditionalEquipmentList.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FilmAdditionalEquipmentList toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, FilmAdditionalEquipmentList>
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
		FilmAdditionalEquipmentListImpl filmAdditionalEquipmentListImpl =
			new FilmAdditionalEquipmentListImpl();

		filmAdditionalEquipmentListImpl.setFilmAdditionalEquipmentListId(
			getFilmAdditionalEquipmentListId());
		filmAdditionalEquipmentListImpl.setGroupId(getGroupId());
		filmAdditionalEquipmentListImpl.setCompanyId(getCompanyId());
		filmAdditionalEquipmentListImpl.setUserId(getUserId());
		filmAdditionalEquipmentListImpl.setUserName(getUserName());
		filmAdditionalEquipmentListImpl.setCreateDate(getCreateDate());
		filmAdditionalEquipmentListImpl.setModifiedDate(getModifiedDate());
		filmAdditionalEquipmentListImpl.setArrivalDate(getArrivalDate());
		filmAdditionalEquipmentListImpl.setAirlineShipper(getAirlineShipper());
		filmAdditionalEquipmentListImpl.setFlightVesselNum(
			getFlightVesselNum());
		filmAdditionalEquipmentListImpl.setPassengerName(getPassengerName());
		filmAdditionalEquipmentListImpl.setEntryPort(getEntryPort());
		filmAdditionalEquipmentListImpl.setCustomsBroker(getCustomsBroker());
		filmAdditionalEquipmentListImpl.setFlightNumber(getFlightNumber());
		filmAdditionalEquipmentListImpl.setCounter(getCounter());
		filmAdditionalEquipmentListImpl.setFilmApplicationId(
			getFilmApplicationId());

		filmAdditionalEquipmentListImpl.resetOriginalValues();

		return filmAdditionalEquipmentListImpl;
	}

	@Override
	public FilmAdditionalEquipmentList cloneWithOriginalValues() {
		FilmAdditionalEquipmentListImpl filmAdditionalEquipmentListImpl =
			new FilmAdditionalEquipmentListImpl();

		filmAdditionalEquipmentListImpl.setFilmAdditionalEquipmentListId(
			this.<Long>getColumnOriginalValue("FilmAdditionalEquipmentListId"));
		filmAdditionalEquipmentListImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		filmAdditionalEquipmentListImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		filmAdditionalEquipmentListImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		filmAdditionalEquipmentListImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		filmAdditionalEquipmentListImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		filmAdditionalEquipmentListImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		filmAdditionalEquipmentListImpl.setArrivalDate(
			this.<Date>getColumnOriginalValue("arrivalDate"));
		filmAdditionalEquipmentListImpl.setAirlineShipper(
			this.<String>getColumnOriginalValue("airlineShipper"));
		filmAdditionalEquipmentListImpl.setFlightVesselNum(
			this.<String>getColumnOriginalValue("flightVesselNum"));
		filmAdditionalEquipmentListImpl.setPassengerName(
			this.<String>getColumnOriginalValue("passengerName"));
		filmAdditionalEquipmentListImpl.setEntryPort(
			this.<String>getColumnOriginalValue("entryPort"));
		filmAdditionalEquipmentListImpl.setCustomsBroker(
			this.<String>getColumnOriginalValue("customsBroker"));
		filmAdditionalEquipmentListImpl.setFlightNumber(
			this.<String>getColumnOriginalValue("flightNumber"));
		filmAdditionalEquipmentListImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		filmAdditionalEquipmentListImpl.setFilmApplicationId(
			this.<Long>getColumnOriginalValue("filmApplicationId"));

		return filmAdditionalEquipmentListImpl;
	}

	@Override
	public int compareTo(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), filmAdditionalEquipmentList.getCreateDate());

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

		if (!(object instanceof FilmAdditionalEquipmentList)) {
			return false;
		}

		FilmAdditionalEquipmentList filmAdditionalEquipmentList =
			(FilmAdditionalEquipmentList)object;

		long primaryKey = filmAdditionalEquipmentList.getPrimaryKey();

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
	public CacheModel<FilmAdditionalEquipmentList> toCacheModel() {
		FilmAdditionalEquipmentListCacheModel
			filmAdditionalEquipmentListCacheModel =
				new FilmAdditionalEquipmentListCacheModel();

		filmAdditionalEquipmentListCacheModel.FilmAdditionalEquipmentListId =
			getFilmAdditionalEquipmentListId();

		filmAdditionalEquipmentListCacheModel.groupId = getGroupId();

		filmAdditionalEquipmentListCacheModel.companyId = getCompanyId();

		filmAdditionalEquipmentListCacheModel.userId = getUserId();

		filmAdditionalEquipmentListCacheModel.userName = getUserName();

		String userName = filmAdditionalEquipmentListCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			filmAdditionalEquipmentListCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			filmAdditionalEquipmentListCacheModel.createDate =
				createDate.getTime();
		}
		else {
			filmAdditionalEquipmentListCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			filmAdditionalEquipmentListCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			filmAdditionalEquipmentListCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date arrivalDate = getArrivalDate();

		if (arrivalDate != null) {
			filmAdditionalEquipmentListCacheModel.arrivalDate =
				arrivalDate.getTime();
		}
		else {
			filmAdditionalEquipmentListCacheModel.arrivalDate = Long.MIN_VALUE;
		}

		filmAdditionalEquipmentListCacheModel.airlineShipper =
			getAirlineShipper();

		String airlineShipper =
			filmAdditionalEquipmentListCacheModel.airlineShipper;

		if ((airlineShipper != null) && (airlineShipper.length() == 0)) {
			filmAdditionalEquipmentListCacheModel.airlineShipper = null;
		}

		filmAdditionalEquipmentListCacheModel.flightVesselNum =
			getFlightVesselNum();

		String flightVesselNum =
			filmAdditionalEquipmentListCacheModel.flightVesselNum;

		if ((flightVesselNum != null) && (flightVesselNum.length() == 0)) {
			filmAdditionalEquipmentListCacheModel.flightVesselNum = null;
		}

		filmAdditionalEquipmentListCacheModel.passengerName =
			getPassengerName();

		String passengerName =
			filmAdditionalEquipmentListCacheModel.passengerName;

		if ((passengerName != null) && (passengerName.length() == 0)) {
			filmAdditionalEquipmentListCacheModel.passengerName = null;
		}

		filmAdditionalEquipmentListCacheModel.entryPort = getEntryPort();

		String entryPort = filmAdditionalEquipmentListCacheModel.entryPort;

		if ((entryPort != null) && (entryPort.length() == 0)) {
			filmAdditionalEquipmentListCacheModel.entryPort = null;
		}

		filmAdditionalEquipmentListCacheModel.customsBroker =
			getCustomsBroker();

		String customsBroker =
			filmAdditionalEquipmentListCacheModel.customsBroker;

		if ((customsBroker != null) && (customsBroker.length() == 0)) {
			filmAdditionalEquipmentListCacheModel.customsBroker = null;
		}

		filmAdditionalEquipmentListCacheModel.flightNumber = getFlightNumber();

		String flightNumber =
			filmAdditionalEquipmentListCacheModel.flightNumber;

		if ((flightNumber != null) && (flightNumber.length() == 0)) {
			filmAdditionalEquipmentListCacheModel.flightNumber = null;
		}

		filmAdditionalEquipmentListCacheModel.counter = getCounter();

		String counter = filmAdditionalEquipmentListCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			filmAdditionalEquipmentListCacheModel.counter = null;
		}

		filmAdditionalEquipmentListCacheModel.filmApplicationId =
			getFilmApplicationId();

		return filmAdditionalEquipmentListCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<FilmAdditionalEquipmentList, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<FilmAdditionalEquipmentList, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FilmAdditionalEquipmentList, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(FilmAdditionalEquipmentList)this);

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
			<InvocationHandler, FilmAdditionalEquipmentList>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						FilmAdditionalEquipmentList.class, ModelWrapper.class);

	}

	private long _FilmAdditionalEquipmentListId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private Date _arrivalDate;
	private String _airlineShipper;
	private String _flightVesselNum;
	private String _passengerName;
	private String _entryPort;
	private String _customsBroker;
	private String _flightNumber;
	private String _counter;
	private long _filmApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<FilmAdditionalEquipmentList, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((FilmAdditionalEquipmentList)this);
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
			"FilmAdditionalEquipmentListId", _FilmAdditionalEquipmentListId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("arrivalDate", _arrivalDate);
		_columnOriginalValues.put("airlineShipper", _airlineShipper);
		_columnOriginalValues.put("flightVesselNum", _flightVesselNum);
		_columnOriginalValues.put("passengerName", _passengerName);
		_columnOriginalValues.put("entryPort", _entryPort);
		_columnOriginalValues.put("customsBroker", _customsBroker);
		_columnOriginalValues.put("flightNumber", _flightNumber);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put("filmApplicationId", _filmApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("FilmAdditionalEquipmentListId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("arrivalDate", 128L);

		columnBitmasks.put("airlineShipper", 256L);

		columnBitmasks.put("flightVesselNum", 512L);

		columnBitmasks.put("passengerName", 1024L);

		columnBitmasks.put("entryPort", 2048L);

		columnBitmasks.put("customsBroker", 4096L);

		columnBitmasks.put("flightNumber", 8192L);

		columnBitmasks.put("counter", 16384L);

		columnBitmasks.put("filmApplicationId", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private FilmAdditionalEquipmentList _escapedModel;

}