/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.model.impl;

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

import com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox;
import com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBoxModel;

import java.io.Serializable;

import java.lang.reflect.Constructor;
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
 * The base model implementation for the TourismNewVehicleAddBox service. Represents a row in the &quot;nbp_tourism_new_vehicle_box&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismNewVehicleAddBoxModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismNewVehicleAddBoxImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewVehicleAddBoxImpl
 * @generated
 */
@JSON(strict = true)
public class TourismNewVehicleAddBoxModelImpl
	extends BaseModelImpl<TourismNewVehicleAddBox>
	implements TourismNewVehicleAddBoxModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism new vehicle add box model instance should use the <code>TourismNewVehicleAddBox</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_new_vehicle_box";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismNewVehBoxId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"newMake", Types.VARCHAR},
		{"newYear", Types.VARCHAR}, {"newModel", Types.VARCHAR},
		{"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismNewVehBoxId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("newMake", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("newYear", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("newModel", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_new_vehicle_box (tourismNewVehBoxId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,newMake VARCHAR(75) null,newYear VARCHAR(75) null,newModel VARCHAR(75) null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_new_vehicle_box";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismNewVehicleAddBox.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_new_vehicle_box.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TOURISMAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public TourismNewVehicleAddBoxModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismNewVehBoxId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismNewVehBoxId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismNewVehBoxId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismNewVehicleAddBox.class;
	}

	@Override
	public String getModelClassName() {
		return TourismNewVehicleAddBox.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismNewVehicleAddBox, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TourismNewVehicleAddBox, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismNewVehicleAddBox, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((TourismNewVehicleAddBox)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismNewVehicleAddBox, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismNewVehicleAddBox, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismNewVehicleAddBox)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismNewVehicleAddBox, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismNewVehicleAddBox, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, TourismNewVehicleAddBox>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			TourismNewVehicleAddBox.class.getClassLoader(),
			TourismNewVehicleAddBox.class, ModelWrapper.class);

		try {
			Constructor<TourismNewVehicleAddBox> constructor =
				(Constructor<TourismNewVehicleAddBox>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<TourismNewVehicleAddBox, Object>>
		_attributeGetterFunctions;
	private static final Map
		<String, BiConsumer<TourismNewVehicleAddBox, Object>>
			_attributeSetterBiConsumers;

	static {
		Map<String, Function<TourismNewVehicleAddBox, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<TourismNewVehicleAddBox, Object>>();
		Map<String, BiConsumer<TourismNewVehicleAddBox, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<TourismNewVehicleAddBox, ?>>();

		attributeGetterFunctions.put(
			"tourismNewVehBoxId",
			TourismNewVehicleAddBox::getTourismNewVehBoxId);
		attributeSetterBiConsumers.put(
			"tourismNewVehBoxId",
			(BiConsumer<TourismNewVehicleAddBox, Long>)
				TourismNewVehicleAddBox::setTourismNewVehBoxId);
		attributeGetterFunctions.put(
			"groupId", TourismNewVehicleAddBox::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<TourismNewVehicleAddBox, Long>)
				TourismNewVehicleAddBox::setGroupId);
		attributeGetterFunctions.put(
			"companyId", TourismNewVehicleAddBox::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<TourismNewVehicleAddBox, Long>)
				TourismNewVehicleAddBox::setCompanyId);
		attributeGetterFunctions.put(
			"userId", TourismNewVehicleAddBox::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<TourismNewVehicleAddBox, Long>)
				TourismNewVehicleAddBox::setUserId);
		attributeGetterFunctions.put(
			"userName", TourismNewVehicleAddBox::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<TourismNewVehicleAddBox, String>)
				TourismNewVehicleAddBox::setUserName);
		attributeGetterFunctions.put(
			"createDate", TourismNewVehicleAddBox::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<TourismNewVehicleAddBox, Date>)
				TourismNewVehicleAddBox::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", TourismNewVehicleAddBox::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<TourismNewVehicleAddBox, Date>)
				TourismNewVehicleAddBox::setModifiedDate);
		attributeGetterFunctions.put(
			"newMake", TourismNewVehicleAddBox::getNewMake);
		attributeSetterBiConsumers.put(
			"newMake",
			(BiConsumer<TourismNewVehicleAddBox, String>)
				TourismNewVehicleAddBox::setNewMake);
		attributeGetterFunctions.put(
			"newYear", TourismNewVehicleAddBox::getNewYear);
		attributeSetterBiConsumers.put(
			"newYear",
			(BiConsumer<TourismNewVehicleAddBox, String>)
				TourismNewVehicleAddBox::setNewYear);
		attributeGetterFunctions.put(
			"newModel", TourismNewVehicleAddBox::getNewModel);
		attributeSetterBiConsumers.put(
			"newModel",
			(BiConsumer<TourismNewVehicleAddBox, String>)
				TourismNewVehicleAddBox::setNewModel);
		attributeGetterFunctions.put(
			"tourismApplicationId",
			TourismNewVehicleAddBox::getTourismApplicationId);
		attributeSetterBiConsumers.put(
			"tourismApplicationId",
			(BiConsumer<TourismNewVehicleAddBox, Long>)
				TourismNewVehicleAddBox::setTourismApplicationId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getTourismNewVehBoxId() {
		return _tourismNewVehBoxId;
	}

	@Override
	public void setTourismNewVehBoxId(long tourismNewVehBoxId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismNewVehBoxId = tourismNewVehBoxId;
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
	public String getNewMake() {
		if (_newMake == null) {
			return "";
		}
		else {
			return _newMake;
		}
	}

	@Override
	public void setNewMake(String newMake) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newMake = newMake;
	}

	@JSON
	@Override
	public String getNewYear() {
		if (_newYear == null) {
			return "";
		}
		else {
			return _newYear;
		}
	}

	@Override
	public void setNewYear(String newYear) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newYear = newYear;
	}

	@JSON
	@Override
	public String getNewModel() {
		if (_newModel == null) {
			return "";
		}
		else {
			return _newModel;
		}
	}

	@Override
	public void setNewModel(String newModel) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newModel = newModel;
	}

	@JSON
	@Override
	public long getTourismApplicationId() {
		return _tourismApplicationId;
	}

	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismApplicationId = tourismApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalTourismApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));
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
			getCompanyId(), TourismNewVehicleAddBox.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismNewVehicleAddBox toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismNewVehicleAddBox>
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
		TourismNewVehicleAddBoxImpl tourismNewVehicleAddBoxImpl =
			new TourismNewVehicleAddBoxImpl();

		tourismNewVehicleAddBoxImpl.setTourismNewVehBoxId(
			getTourismNewVehBoxId());
		tourismNewVehicleAddBoxImpl.setGroupId(getGroupId());
		tourismNewVehicleAddBoxImpl.setCompanyId(getCompanyId());
		tourismNewVehicleAddBoxImpl.setUserId(getUserId());
		tourismNewVehicleAddBoxImpl.setUserName(getUserName());
		tourismNewVehicleAddBoxImpl.setCreateDate(getCreateDate());
		tourismNewVehicleAddBoxImpl.setModifiedDate(getModifiedDate());
		tourismNewVehicleAddBoxImpl.setNewMake(getNewMake());
		tourismNewVehicleAddBoxImpl.setNewYear(getNewYear());
		tourismNewVehicleAddBoxImpl.setNewModel(getNewModel());
		tourismNewVehicleAddBoxImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismNewVehicleAddBoxImpl.resetOriginalValues();

		return tourismNewVehicleAddBoxImpl;
	}

	@Override
	public TourismNewVehicleAddBox cloneWithOriginalValues() {
		TourismNewVehicleAddBoxImpl tourismNewVehicleAddBoxImpl =
			new TourismNewVehicleAddBoxImpl();

		tourismNewVehicleAddBoxImpl.setTourismNewVehBoxId(
			this.<Long>getColumnOriginalValue("tourismNewVehBoxId"));
		tourismNewVehicleAddBoxImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismNewVehicleAddBoxImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismNewVehicleAddBoxImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismNewVehicleAddBoxImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismNewVehicleAddBoxImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismNewVehicleAddBoxImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismNewVehicleAddBoxImpl.setNewMake(
			this.<String>getColumnOriginalValue("newMake"));
		tourismNewVehicleAddBoxImpl.setNewYear(
			this.<String>getColumnOriginalValue("newYear"));
		tourismNewVehicleAddBoxImpl.setNewModel(
			this.<String>getColumnOriginalValue("newModel"));
		tourismNewVehicleAddBoxImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismNewVehicleAddBoxImpl;
	}

	@Override
	public int compareTo(TourismNewVehicleAddBox tourismNewVehicleAddBox) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), tourismNewVehicleAddBox.getCreateDate());

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

		if (!(object instanceof TourismNewVehicleAddBox)) {
			return false;
		}

		TourismNewVehicleAddBox tourismNewVehicleAddBox =
			(TourismNewVehicleAddBox)object;

		long primaryKey = tourismNewVehicleAddBox.getPrimaryKey();

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
	public CacheModel<TourismNewVehicleAddBox> toCacheModel() {
		TourismNewVehicleAddBoxCacheModel tourismNewVehicleAddBoxCacheModel =
			new TourismNewVehicleAddBoxCacheModel();

		tourismNewVehicleAddBoxCacheModel.tourismNewVehBoxId =
			getTourismNewVehBoxId();

		tourismNewVehicleAddBoxCacheModel.groupId = getGroupId();

		tourismNewVehicleAddBoxCacheModel.companyId = getCompanyId();

		tourismNewVehicleAddBoxCacheModel.userId = getUserId();

		tourismNewVehicleAddBoxCacheModel.userName = getUserName();

		String userName = tourismNewVehicleAddBoxCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismNewVehicleAddBoxCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismNewVehicleAddBoxCacheModel.createDate = createDate.getTime();
		}
		else {
			tourismNewVehicleAddBoxCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismNewVehicleAddBoxCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismNewVehicleAddBoxCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tourismNewVehicleAddBoxCacheModel.newMake = getNewMake();

		String newMake = tourismNewVehicleAddBoxCacheModel.newMake;

		if ((newMake != null) && (newMake.length() == 0)) {
			tourismNewVehicleAddBoxCacheModel.newMake = null;
		}

		tourismNewVehicleAddBoxCacheModel.newYear = getNewYear();

		String newYear = tourismNewVehicleAddBoxCacheModel.newYear;

		if ((newYear != null) && (newYear.length() == 0)) {
			tourismNewVehicleAddBoxCacheModel.newYear = null;
		}

		tourismNewVehicleAddBoxCacheModel.newModel = getNewModel();

		String newModel = tourismNewVehicleAddBoxCacheModel.newModel;

		if ((newModel != null) && (newModel.length() == 0)) {
			tourismNewVehicleAddBoxCacheModel.newModel = null;
		}

		tourismNewVehicleAddBoxCacheModel.tourismApplicationId =
			getTourismApplicationId();

		return tourismNewVehicleAddBoxCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismNewVehicleAddBox, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TourismNewVehicleAddBox, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismNewVehicleAddBox, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismNewVehicleAddBox)this);

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
			<InvocationHandler, TourismNewVehicleAddBox>
				_escapedModelProxyProviderFunction =
					_getProxyProviderFunction();

	}

	private long _tourismNewVehBoxId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _newMake;
	private String _newYear;
	private String _newModel;
	private long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<TourismNewVehicleAddBox, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismNewVehicleAddBox)this);
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

		_columnOriginalValues.put("tourismNewVehBoxId", _tourismNewVehBoxId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("newMake", _newMake);
		_columnOriginalValues.put("newYear", _newYear);
		_columnOriginalValues.put("newModel", _newModel);
		_columnOriginalValues.put(
			"tourismApplicationId", _tourismApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("tourismNewVehBoxId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("newMake", 128L);

		columnBitmasks.put("newYear", 256L);

		columnBitmasks.put("newModel", 512L);

		columnBitmasks.put("tourismApplicationId", 1024L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismNewVehicleAddBox _escapedModel;

}