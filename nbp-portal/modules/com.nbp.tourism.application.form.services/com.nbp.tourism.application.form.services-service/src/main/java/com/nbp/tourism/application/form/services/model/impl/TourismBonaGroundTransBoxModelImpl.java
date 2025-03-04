/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
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

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBox;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBoxModel;

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
 * The base model implementation for the TourismBonaGroundTransBox service. Represents a row in the &quot;nbp_tourism_bona_ground_box&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismBonaGroundTransBoxModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaGroundTransBoxImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBoxImpl
 * @generated
 */
@JSON(strict = true)
public class TourismBonaGroundTransBoxModelImpl
	extends BaseModelImpl<TourismBonaGroundTransBox>
	implements TourismBonaGroundTransBoxModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona ground trans box model instance should use the <code>TourismBonaGroundTransBox</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_bona_ground_box";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismVehicleBoxBonaId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"vehicleMakeBona", Types.VARCHAR},
		{"vehiclemodelBona", Types.VARCHAR}, {"vehicleYearBona", Types.VARCHAR},
		{"vehicleCounter", Types.VARCHAR},
		{"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismVehicleBoxBonaId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("vehicleMakeBona", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("vehiclemodelBona", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("vehicleYearBona", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("vehicleCounter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_bona_ground_box (tourismVehicleBoxBonaId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,vehicleMakeBona VARCHAR(75) null,vehiclemodelBona VARCHAR(75) null,vehicleYearBona VARCHAR(75) null,vehicleCounter VARCHAR(75) null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_bona_ground_box";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismBonaGroundTransBox.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_bona_ground_box.createDate ASC";

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

	public TourismBonaGroundTransBoxModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismVehicleBoxBonaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismVehicleBoxBonaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismVehicleBoxBonaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismBonaGroundTransBox.class;
	}

	@Override
	public String getModelClassName() {
		return TourismBonaGroundTransBox.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismBonaGroundTransBox, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TourismBonaGroundTransBox, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaGroundTransBox, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((TourismBonaGroundTransBox)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismBonaGroundTransBox, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismBonaGroundTransBox, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismBonaGroundTransBox)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismBonaGroundTransBox, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismBonaGroundTransBox, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<TourismBonaGroundTransBox, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<TourismBonaGroundTransBox, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<TourismBonaGroundTransBox, Object>>();

			attributeGetterFunctions.put(
				"tourismVehicleBoxBonaId",
				TourismBonaGroundTransBox::getTourismVehicleBoxBonaId);
			attributeGetterFunctions.put(
				"groupId", TourismBonaGroundTransBox::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismBonaGroundTransBox::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismBonaGroundTransBox::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismBonaGroundTransBox::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismBonaGroundTransBox::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", TourismBonaGroundTransBox::getModifiedDate);
			attributeGetterFunctions.put(
				"vehicleMakeBona",
				TourismBonaGroundTransBox::getVehicleMakeBona);
			attributeGetterFunctions.put(
				"vehiclemodelBona",
				TourismBonaGroundTransBox::getVehiclemodelBona);
			attributeGetterFunctions.put(
				"vehicleYearBona",
				TourismBonaGroundTransBox::getVehicleYearBona);
			attributeGetterFunctions.put(
				"vehicleCounter", TourismBonaGroundTransBox::getVehicleCounter);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismBonaGroundTransBox::getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<TourismBonaGroundTransBox, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismBonaGroundTransBox, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<TourismBonaGroundTransBox, ?>>();

			attributeSetterBiConsumers.put(
				"tourismVehicleBoxBonaId",
				(BiConsumer<TourismBonaGroundTransBox, Long>)
					TourismBonaGroundTransBox::setTourismVehicleBoxBonaId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismBonaGroundTransBox, Long>)
					TourismBonaGroundTransBox::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismBonaGroundTransBox, Long>)
					TourismBonaGroundTransBox::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismBonaGroundTransBox, Long>)
					TourismBonaGroundTransBox::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismBonaGroundTransBox, String>)
					TourismBonaGroundTransBox::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismBonaGroundTransBox, Date>)
					TourismBonaGroundTransBox::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismBonaGroundTransBox, Date>)
					TourismBonaGroundTransBox::setModifiedDate);
			attributeSetterBiConsumers.put(
				"vehicleMakeBona",
				(BiConsumer<TourismBonaGroundTransBox, String>)
					TourismBonaGroundTransBox::setVehicleMakeBona);
			attributeSetterBiConsumers.put(
				"vehiclemodelBona",
				(BiConsumer<TourismBonaGroundTransBox, String>)
					TourismBonaGroundTransBox::setVehiclemodelBona);
			attributeSetterBiConsumers.put(
				"vehicleYearBona",
				(BiConsumer<TourismBonaGroundTransBox, String>)
					TourismBonaGroundTransBox::setVehicleYearBona);
			attributeSetterBiConsumers.put(
				"vehicleCounter",
				(BiConsumer<TourismBonaGroundTransBox, String>)
					TourismBonaGroundTransBox::setVehicleCounter);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismBonaGroundTransBox, Long>)
					TourismBonaGroundTransBox::setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismVehicleBoxBonaId() {
		return _tourismVehicleBoxBonaId;
	}

	@Override
	public void setTourismVehicleBoxBonaId(long tourismVehicleBoxBonaId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismVehicleBoxBonaId = tourismVehicleBoxBonaId;
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
	public String getVehicleMakeBona() {
		if (_vehicleMakeBona == null) {
			return "";
		}
		else {
			return _vehicleMakeBona;
		}
	}

	@Override
	public void setVehicleMakeBona(String vehicleMakeBona) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_vehicleMakeBona = vehicleMakeBona;
	}

	@JSON
	@Override
	public String getVehiclemodelBona() {
		if (_vehiclemodelBona == null) {
			return "";
		}
		else {
			return _vehiclemodelBona;
		}
	}

	@Override
	public void setVehiclemodelBona(String vehiclemodelBona) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_vehiclemodelBona = vehiclemodelBona;
	}

	@JSON
	@Override
	public String getVehicleYearBona() {
		if (_vehicleYearBona == null) {
			return "";
		}
		else {
			return _vehicleYearBona;
		}
	}

	@Override
	public void setVehicleYearBona(String vehicleYearBona) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_vehicleYearBona = vehicleYearBona;
	}

	@JSON
	@Override
	public String getVehicleCounter() {
		if (_vehicleCounter == null) {
			return "";
		}
		else {
			return _vehicleCounter;
		}
	}

	@Override
	public void setVehicleCounter(String vehicleCounter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_vehicleCounter = vehicleCounter;
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
			getCompanyId(), TourismBonaGroundTransBox.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismBonaGroundTransBox toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismBonaGroundTransBox>
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
		TourismBonaGroundTransBoxImpl tourismBonaGroundTransBoxImpl =
			new TourismBonaGroundTransBoxImpl();

		tourismBonaGroundTransBoxImpl.setTourismVehicleBoxBonaId(
			getTourismVehicleBoxBonaId());
		tourismBonaGroundTransBoxImpl.setGroupId(getGroupId());
		tourismBonaGroundTransBoxImpl.setCompanyId(getCompanyId());
		tourismBonaGroundTransBoxImpl.setUserId(getUserId());
		tourismBonaGroundTransBoxImpl.setUserName(getUserName());
		tourismBonaGroundTransBoxImpl.setCreateDate(getCreateDate());
		tourismBonaGroundTransBoxImpl.setModifiedDate(getModifiedDate());
		tourismBonaGroundTransBoxImpl.setVehicleMakeBona(getVehicleMakeBona());
		tourismBonaGroundTransBoxImpl.setVehiclemodelBona(
			getVehiclemodelBona());
		tourismBonaGroundTransBoxImpl.setVehicleYearBona(getVehicleYearBona());
		tourismBonaGroundTransBoxImpl.setVehicleCounter(getVehicleCounter());
		tourismBonaGroundTransBoxImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismBonaGroundTransBoxImpl.resetOriginalValues();

		return tourismBonaGroundTransBoxImpl;
	}

	@Override
	public TourismBonaGroundTransBox cloneWithOriginalValues() {
		TourismBonaGroundTransBoxImpl tourismBonaGroundTransBoxImpl =
			new TourismBonaGroundTransBoxImpl();

		tourismBonaGroundTransBoxImpl.setTourismVehicleBoxBonaId(
			this.<Long>getColumnOriginalValue("tourismVehicleBoxBonaId"));
		tourismBonaGroundTransBoxImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismBonaGroundTransBoxImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismBonaGroundTransBoxImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismBonaGroundTransBoxImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismBonaGroundTransBoxImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismBonaGroundTransBoxImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismBonaGroundTransBoxImpl.setVehicleMakeBona(
			this.<String>getColumnOriginalValue("vehicleMakeBona"));
		tourismBonaGroundTransBoxImpl.setVehiclemodelBona(
			this.<String>getColumnOriginalValue("vehiclemodelBona"));
		tourismBonaGroundTransBoxImpl.setVehicleYearBona(
			this.<String>getColumnOriginalValue("vehicleYearBona"));
		tourismBonaGroundTransBoxImpl.setVehicleCounter(
			this.<String>getColumnOriginalValue("vehicleCounter"));
		tourismBonaGroundTransBoxImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismBonaGroundTransBoxImpl;
	}

	@Override
	public int compareTo(TourismBonaGroundTransBox tourismBonaGroundTransBox) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), tourismBonaGroundTransBox.getCreateDate());

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

		if (!(object instanceof TourismBonaGroundTransBox)) {
			return false;
		}

		TourismBonaGroundTransBox tourismBonaGroundTransBox =
			(TourismBonaGroundTransBox)object;

		long primaryKey = tourismBonaGroundTransBox.getPrimaryKey();

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
	public CacheModel<TourismBonaGroundTransBox> toCacheModel() {
		TourismBonaGroundTransBoxCacheModel
			tourismBonaGroundTransBoxCacheModel =
				new TourismBonaGroundTransBoxCacheModel();

		tourismBonaGroundTransBoxCacheModel.tourismVehicleBoxBonaId =
			getTourismVehicleBoxBonaId();

		tourismBonaGroundTransBoxCacheModel.groupId = getGroupId();

		tourismBonaGroundTransBoxCacheModel.companyId = getCompanyId();

		tourismBonaGroundTransBoxCacheModel.userId = getUserId();

		tourismBonaGroundTransBoxCacheModel.userName = getUserName();

		String userName = tourismBonaGroundTransBoxCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismBonaGroundTransBoxCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismBonaGroundTransBoxCacheModel.createDate =
				createDate.getTime();
		}
		else {
			tourismBonaGroundTransBoxCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismBonaGroundTransBoxCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismBonaGroundTransBoxCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tourismBonaGroundTransBoxCacheModel.vehicleMakeBona =
			getVehicleMakeBona();

		String vehicleMakeBona =
			tourismBonaGroundTransBoxCacheModel.vehicleMakeBona;

		if ((vehicleMakeBona != null) && (vehicleMakeBona.length() == 0)) {
			tourismBonaGroundTransBoxCacheModel.vehicleMakeBona = null;
		}

		tourismBonaGroundTransBoxCacheModel.vehiclemodelBona =
			getVehiclemodelBona();

		String vehiclemodelBona =
			tourismBonaGroundTransBoxCacheModel.vehiclemodelBona;

		if ((vehiclemodelBona != null) && (vehiclemodelBona.length() == 0)) {
			tourismBonaGroundTransBoxCacheModel.vehiclemodelBona = null;
		}

		tourismBonaGroundTransBoxCacheModel.vehicleYearBona =
			getVehicleYearBona();

		String vehicleYearBona =
			tourismBonaGroundTransBoxCacheModel.vehicleYearBona;

		if ((vehicleYearBona != null) && (vehicleYearBona.length() == 0)) {
			tourismBonaGroundTransBoxCacheModel.vehicleYearBona = null;
		}

		tourismBonaGroundTransBoxCacheModel.vehicleCounter =
			getVehicleCounter();

		String vehicleCounter =
			tourismBonaGroundTransBoxCacheModel.vehicleCounter;

		if ((vehicleCounter != null) && (vehicleCounter.length() == 0)) {
			tourismBonaGroundTransBoxCacheModel.vehicleCounter = null;
		}

		tourismBonaGroundTransBoxCacheModel.tourismApplicationId =
			getTourismApplicationId();

		return tourismBonaGroundTransBoxCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismBonaGroundTransBox, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TourismBonaGroundTransBox, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaGroundTransBox, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismBonaGroundTransBox)this);

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
			<InvocationHandler, TourismBonaGroundTransBox>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismBonaGroundTransBox.class, ModelWrapper.class);

	}

	private long _tourismVehicleBoxBonaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _vehicleMakeBona;
	private String _vehiclemodelBona;
	private String _vehicleYearBona;
	private String _vehicleCounter;
	private long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<TourismBonaGroundTransBox, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismBonaGroundTransBox)this);
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
			"tourismVehicleBoxBonaId", _tourismVehicleBoxBonaId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("vehicleMakeBona", _vehicleMakeBona);
		_columnOriginalValues.put("vehiclemodelBona", _vehiclemodelBona);
		_columnOriginalValues.put("vehicleYearBona", _vehicleYearBona);
		_columnOriginalValues.put("vehicleCounter", _vehicleCounter);
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

		columnBitmasks.put("tourismVehicleBoxBonaId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("vehicleMakeBona", 128L);

		columnBitmasks.put("vehiclemodelBona", 256L);

		columnBitmasks.put("vehicleYearBona", 512L);

		columnBitmasks.put("vehicleCounter", 1024L);

		columnBitmasks.put("tourismApplicationId", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismBonaGroundTransBox _escapedModel;

}