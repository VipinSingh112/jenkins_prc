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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportEmployeeInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportEmployeeInfoModel;

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
 * The base model implementation for the TourismBonaWaterSportEmployeeInfo service. Represents a row in the &quot;nbp_tourism_bona_water_emp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismBonaWaterSportEmployeeInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaWaterSportEmployeeInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportEmployeeInfoImpl
 * @generated
 */
@JSON(strict = true)
public class TourismBonaWaterSportEmployeeInfoModelImpl
	extends BaseModelImpl<TourismBonaWaterSportEmployeeInfo>
	implements TourismBonaWaterSportEmployeeInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona water sport employee info model instance should use the <code>TourismBonaWaterSportEmployeeInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_bona_water_emp";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismBonaWSEmplId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"actualPermanent", Types.VARCHAR},
		{"actualTemporary", Types.VARCHAR}, {"actualForeign", Types.VARCHAR},
		{"actualLocal", Types.VARCHAR}, {"actualPayroll", Types.VARCHAR},
		{"projectedPermanent", Types.VARCHAR},
		{"projectedTemporary", Types.VARCHAR},
		{"projectedForeign", Types.VARCHAR}, {"projectedLocal", Types.VARCHAR},
		{"projectedPayroll", Types.VARCHAR},
		{"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismBonaWSEmplId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("actualPermanent", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actualTemporary", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actualForeign", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actualLocal", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("actualPayroll", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("projectedPermanent", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("projectedTemporary", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("projectedForeign", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("projectedLocal", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("projectedPayroll", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_bona_water_emp (tourismBonaWSEmplId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,actualPermanent VARCHAR(75) null,actualTemporary VARCHAR(75) null,actualForeign VARCHAR(75) null,actualLocal VARCHAR(75) null,actualPayroll VARCHAR(75) null,projectedPermanent VARCHAR(75) null,projectedTemporary VARCHAR(75) null,projectedForeign VARCHAR(75) null,projectedLocal VARCHAR(75) null,projectedPayroll VARCHAR(75) null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_bona_water_emp";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismBonaWaterSportEmployeeInfo.tourismBonaWSEmplId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_bona_water_emp.tourismBonaWSEmplId ASC";

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
	public static final long TOURISMBONAWSEMPLID_COLUMN_BITMASK = 2L;

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

	public TourismBonaWaterSportEmployeeInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismBonaWSEmplId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismBonaWSEmplId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismBonaWSEmplId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismBonaWaterSportEmployeeInfo.class;
	}

	@Override
	public String getModelClassName() {
		return TourismBonaWaterSportEmployeeInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismBonaWaterSportEmployeeInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String, Function<TourismBonaWaterSportEmployeeInfo, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaWaterSportEmployeeInfo, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(TourismBonaWaterSportEmployeeInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismBonaWaterSportEmployeeInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismBonaWaterSportEmployeeInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismBonaWaterSportEmployeeInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismBonaWaterSportEmployeeInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismBonaWaterSportEmployeeInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<TourismBonaWaterSportEmployeeInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<TourismBonaWaterSportEmployeeInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<TourismBonaWaterSportEmployeeInfo, Object>>();

			attributeGetterFunctions.put(
				"tourismBonaWSEmplId",
				TourismBonaWaterSportEmployeeInfo::getTourismBonaWSEmplId);
			attributeGetterFunctions.put(
				"groupId", TourismBonaWaterSportEmployeeInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismBonaWaterSportEmployeeInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismBonaWaterSportEmployeeInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismBonaWaterSportEmployeeInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismBonaWaterSportEmployeeInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate",
				TourismBonaWaterSportEmployeeInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"actualPermanent",
				TourismBonaWaterSportEmployeeInfo::getActualPermanent);
			attributeGetterFunctions.put(
				"actualTemporary",
				TourismBonaWaterSportEmployeeInfo::getActualTemporary);
			attributeGetterFunctions.put(
				"actualForeign",
				TourismBonaWaterSportEmployeeInfo::getActualForeign);
			attributeGetterFunctions.put(
				"actualLocal",
				TourismBonaWaterSportEmployeeInfo::getActualLocal);
			attributeGetterFunctions.put(
				"actualPayroll",
				TourismBonaWaterSportEmployeeInfo::getActualPayroll);
			attributeGetterFunctions.put(
				"projectedPermanent",
				TourismBonaWaterSportEmployeeInfo::getProjectedPermanent);
			attributeGetterFunctions.put(
				"projectedTemporary",
				TourismBonaWaterSportEmployeeInfo::getProjectedTemporary);
			attributeGetterFunctions.put(
				"projectedForeign",
				TourismBonaWaterSportEmployeeInfo::getProjectedForeign);
			attributeGetterFunctions.put(
				"projectedLocal",
				TourismBonaWaterSportEmployeeInfo::getProjectedLocal);
			attributeGetterFunctions.put(
				"projectedPayroll",
				TourismBonaWaterSportEmployeeInfo::getProjectedPayroll);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismBonaWaterSportEmployeeInfo::getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<TourismBonaWaterSportEmployeeInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismBonaWaterSportEmployeeInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String,
						 BiConsumer<TourismBonaWaterSportEmployeeInfo, ?>>();

			attributeSetterBiConsumers.put(
				"tourismBonaWSEmplId",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, Long>)
					TourismBonaWaterSportEmployeeInfo::setTourismBonaWSEmplId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, Long>)
					TourismBonaWaterSportEmployeeInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, Long>)
					TourismBonaWaterSportEmployeeInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, Long>)
					TourismBonaWaterSportEmployeeInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, Date>)
					TourismBonaWaterSportEmployeeInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, Date>)
					TourismBonaWaterSportEmployeeInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"actualPermanent",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setActualPermanent);
			attributeSetterBiConsumers.put(
				"actualTemporary",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setActualTemporary);
			attributeSetterBiConsumers.put(
				"actualForeign",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setActualForeign);
			attributeSetterBiConsumers.put(
				"actualLocal",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setActualLocal);
			attributeSetterBiConsumers.put(
				"actualPayroll",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setActualPayroll);
			attributeSetterBiConsumers.put(
				"projectedPermanent",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setProjectedPermanent);
			attributeSetterBiConsumers.put(
				"projectedTemporary",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setProjectedTemporary);
			attributeSetterBiConsumers.put(
				"projectedForeign",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setProjectedForeign);
			attributeSetterBiConsumers.put(
				"projectedLocal",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setProjectedLocal);
			attributeSetterBiConsumers.put(
				"projectedPayroll",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, String>)
					TourismBonaWaterSportEmployeeInfo::setProjectedPayroll);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismBonaWaterSportEmployeeInfo, Long>)
					TourismBonaWaterSportEmployeeInfo::setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismBonaWSEmplId() {
		return _tourismBonaWSEmplId;
	}

	@Override
	public void setTourismBonaWSEmplId(long tourismBonaWSEmplId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismBonaWSEmplId = tourismBonaWSEmplId;
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
	public String getActualPermanent() {
		if (_actualPermanent == null) {
			return "";
		}
		else {
			return _actualPermanent;
		}
	}

	@Override
	public void setActualPermanent(String actualPermanent) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_actualPermanent = actualPermanent;
	}

	@JSON
	@Override
	public String getActualTemporary() {
		if (_actualTemporary == null) {
			return "";
		}
		else {
			return _actualTemporary;
		}
	}

	@Override
	public void setActualTemporary(String actualTemporary) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_actualTemporary = actualTemporary;
	}

	@JSON
	@Override
	public String getActualForeign() {
		if (_actualForeign == null) {
			return "";
		}
		else {
			return _actualForeign;
		}
	}

	@Override
	public void setActualForeign(String actualForeign) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_actualForeign = actualForeign;
	}

	@JSON
	@Override
	public String getActualLocal() {
		if (_actualLocal == null) {
			return "";
		}
		else {
			return _actualLocal;
		}
	}

	@Override
	public void setActualLocal(String actualLocal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_actualLocal = actualLocal;
	}

	@JSON
	@Override
	public String getActualPayroll() {
		if (_actualPayroll == null) {
			return "";
		}
		else {
			return _actualPayroll;
		}
	}

	@Override
	public void setActualPayroll(String actualPayroll) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_actualPayroll = actualPayroll;
	}

	@JSON
	@Override
	public String getProjectedPermanent() {
		if (_projectedPermanent == null) {
			return "";
		}
		else {
			return _projectedPermanent;
		}
	}

	@Override
	public void setProjectedPermanent(String projectedPermanent) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_projectedPermanent = projectedPermanent;
	}

	@JSON
	@Override
	public String getProjectedTemporary() {
		if (_projectedTemporary == null) {
			return "";
		}
		else {
			return _projectedTemporary;
		}
	}

	@Override
	public void setProjectedTemporary(String projectedTemporary) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_projectedTemporary = projectedTemporary;
	}

	@JSON
	@Override
	public String getProjectedForeign() {
		if (_projectedForeign == null) {
			return "";
		}
		else {
			return _projectedForeign;
		}
	}

	@Override
	public void setProjectedForeign(String projectedForeign) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_projectedForeign = projectedForeign;
	}

	@JSON
	@Override
	public String getProjectedLocal() {
		if (_projectedLocal == null) {
			return "";
		}
		else {
			return _projectedLocal;
		}
	}

	@Override
	public void setProjectedLocal(String projectedLocal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_projectedLocal = projectedLocal;
	}

	@JSON
	@Override
	public String getProjectedPayroll() {
		if (_projectedPayroll == null) {
			return "";
		}
		else {
			return _projectedPayroll;
		}
	}

	@Override
	public void setProjectedPayroll(String projectedPayroll) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_projectedPayroll = projectedPayroll;
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
			getCompanyId(), TourismBonaWaterSportEmployeeInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismBonaWaterSportEmployeeInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismBonaWaterSportEmployeeInfo>
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
		TourismBonaWaterSportEmployeeInfoImpl
			tourismBonaWaterSportEmployeeInfoImpl =
				new TourismBonaWaterSportEmployeeInfoImpl();

		tourismBonaWaterSportEmployeeInfoImpl.setTourismBonaWSEmplId(
			getTourismBonaWSEmplId());
		tourismBonaWaterSportEmployeeInfoImpl.setGroupId(getGroupId());
		tourismBonaWaterSportEmployeeInfoImpl.setCompanyId(getCompanyId());
		tourismBonaWaterSportEmployeeInfoImpl.setUserId(getUserId());
		tourismBonaWaterSportEmployeeInfoImpl.setUserName(getUserName());
		tourismBonaWaterSportEmployeeInfoImpl.setCreateDate(getCreateDate());
		tourismBonaWaterSportEmployeeInfoImpl.setModifiedDate(
			getModifiedDate());
		tourismBonaWaterSportEmployeeInfoImpl.setActualPermanent(
			getActualPermanent());
		tourismBonaWaterSportEmployeeInfoImpl.setActualTemporary(
			getActualTemporary());
		tourismBonaWaterSportEmployeeInfoImpl.setActualForeign(
			getActualForeign());
		tourismBonaWaterSportEmployeeInfoImpl.setActualLocal(getActualLocal());
		tourismBonaWaterSportEmployeeInfoImpl.setActualPayroll(
			getActualPayroll());
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedPermanent(
			getProjectedPermanent());
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedTemporary(
			getProjectedTemporary());
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedForeign(
			getProjectedForeign());
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedLocal(
			getProjectedLocal());
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedPayroll(
			getProjectedPayroll());
		tourismBonaWaterSportEmployeeInfoImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismBonaWaterSportEmployeeInfoImpl.resetOriginalValues();

		return tourismBonaWaterSportEmployeeInfoImpl;
	}

	@Override
	public TourismBonaWaterSportEmployeeInfo cloneWithOriginalValues() {
		TourismBonaWaterSportEmployeeInfoImpl
			tourismBonaWaterSportEmployeeInfoImpl =
				new TourismBonaWaterSportEmployeeInfoImpl();

		tourismBonaWaterSportEmployeeInfoImpl.setTourismBonaWSEmplId(
			this.<Long>getColumnOriginalValue("tourismBonaWSEmplId"));
		tourismBonaWaterSportEmployeeInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismBonaWaterSportEmployeeInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismBonaWaterSportEmployeeInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismBonaWaterSportEmployeeInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismBonaWaterSportEmployeeInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismBonaWaterSportEmployeeInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismBonaWaterSportEmployeeInfoImpl.setActualPermanent(
			this.<String>getColumnOriginalValue("actualPermanent"));
		tourismBonaWaterSportEmployeeInfoImpl.setActualTemporary(
			this.<String>getColumnOriginalValue("actualTemporary"));
		tourismBonaWaterSportEmployeeInfoImpl.setActualForeign(
			this.<String>getColumnOriginalValue("actualForeign"));
		tourismBonaWaterSportEmployeeInfoImpl.setActualLocal(
			this.<String>getColumnOriginalValue("actualLocal"));
		tourismBonaWaterSportEmployeeInfoImpl.setActualPayroll(
			this.<String>getColumnOriginalValue("actualPayroll"));
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedPermanent(
			this.<String>getColumnOriginalValue("projectedPermanent"));
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedTemporary(
			this.<String>getColumnOriginalValue("projectedTemporary"));
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedForeign(
			this.<String>getColumnOriginalValue("projectedForeign"));
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedLocal(
			this.<String>getColumnOriginalValue("projectedLocal"));
		tourismBonaWaterSportEmployeeInfoImpl.setProjectedPayroll(
			this.<String>getColumnOriginalValue("projectedPayroll"));
		tourismBonaWaterSportEmployeeInfoImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismBonaWaterSportEmployeeInfoImpl;
	}

	@Override
	public int compareTo(
		TourismBonaWaterSportEmployeeInfo tourismBonaWaterSportEmployeeInfo) {

		long primaryKey = tourismBonaWaterSportEmployeeInfo.getPrimaryKey();

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

		if (!(object instanceof TourismBonaWaterSportEmployeeInfo)) {
			return false;
		}

		TourismBonaWaterSportEmployeeInfo tourismBonaWaterSportEmployeeInfo =
			(TourismBonaWaterSportEmployeeInfo)object;

		long primaryKey = tourismBonaWaterSportEmployeeInfo.getPrimaryKey();

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
	public CacheModel<TourismBonaWaterSportEmployeeInfo> toCacheModel() {
		TourismBonaWaterSportEmployeeInfoCacheModel
			tourismBonaWaterSportEmployeeInfoCacheModel =
				new TourismBonaWaterSportEmployeeInfoCacheModel();

		tourismBonaWaterSportEmployeeInfoCacheModel.tourismBonaWSEmplId =
			getTourismBonaWSEmplId();

		tourismBonaWaterSportEmployeeInfoCacheModel.groupId = getGroupId();

		tourismBonaWaterSportEmployeeInfoCacheModel.companyId = getCompanyId();

		tourismBonaWaterSportEmployeeInfoCacheModel.userId = getUserId();

		tourismBonaWaterSportEmployeeInfoCacheModel.userName = getUserName();

		String userName = tourismBonaWaterSportEmployeeInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismBonaWaterSportEmployeeInfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			tourismBonaWaterSportEmployeeInfoCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismBonaWaterSportEmployeeInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismBonaWaterSportEmployeeInfoCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.actualPermanent =
			getActualPermanent();

		String actualPermanent =
			tourismBonaWaterSportEmployeeInfoCacheModel.actualPermanent;

		if ((actualPermanent != null) && (actualPermanent.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.actualPermanent = null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.actualTemporary =
			getActualTemporary();

		String actualTemporary =
			tourismBonaWaterSportEmployeeInfoCacheModel.actualTemporary;

		if ((actualTemporary != null) && (actualTemporary.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.actualTemporary = null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.actualForeign =
			getActualForeign();

		String actualForeign =
			tourismBonaWaterSportEmployeeInfoCacheModel.actualForeign;

		if ((actualForeign != null) && (actualForeign.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.actualForeign = null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.actualLocal =
			getActualLocal();

		String actualLocal =
			tourismBonaWaterSportEmployeeInfoCacheModel.actualLocal;

		if ((actualLocal != null) && (actualLocal.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.actualLocal = null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.actualPayroll =
			getActualPayroll();

		String actualPayroll =
			tourismBonaWaterSportEmployeeInfoCacheModel.actualPayroll;

		if ((actualPayroll != null) && (actualPayroll.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.actualPayroll = null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.projectedPermanent =
			getProjectedPermanent();

		String projectedPermanent =
			tourismBonaWaterSportEmployeeInfoCacheModel.projectedPermanent;

		if ((projectedPermanent != null) &&
			(projectedPermanent.length() == 0)) {

			tourismBonaWaterSportEmployeeInfoCacheModel.projectedPermanent =
				null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.projectedTemporary =
			getProjectedTemporary();

		String projectedTemporary =
			tourismBonaWaterSportEmployeeInfoCacheModel.projectedTemporary;

		if ((projectedTemporary != null) &&
			(projectedTemporary.length() == 0)) {

			tourismBonaWaterSportEmployeeInfoCacheModel.projectedTemporary =
				null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.projectedForeign =
			getProjectedForeign();

		String projectedForeign =
			tourismBonaWaterSportEmployeeInfoCacheModel.projectedForeign;

		if ((projectedForeign != null) && (projectedForeign.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.projectedForeign = null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.projectedLocal =
			getProjectedLocal();

		String projectedLocal =
			tourismBonaWaterSportEmployeeInfoCacheModel.projectedLocal;

		if ((projectedLocal != null) && (projectedLocal.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.projectedLocal = null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.projectedPayroll =
			getProjectedPayroll();

		String projectedPayroll =
			tourismBonaWaterSportEmployeeInfoCacheModel.projectedPayroll;

		if ((projectedPayroll != null) && (projectedPayroll.length() == 0)) {
			tourismBonaWaterSportEmployeeInfoCacheModel.projectedPayroll = null;
		}

		tourismBonaWaterSportEmployeeInfoCacheModel.tourismApplicationId =
			getTourismApplicationId();

		return tourismBonaWaterSportEmployeeInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismBonaWaterSportEmployeeInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry
				<String, Function<TourismBonaWaterSportEmployeeInfo, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaWaterSportEmployeeInfo, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismBonaWaterSportEmployeeInfo)this);

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
			<InvocationHandler, TourismBonaWaterSportEmployeeInfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismBonaWaterSportEmployeeInfo.class,
						ModelWrapper.class);

	}

	private long _tourismBonaWSEmplId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _actualPermanent;
	private String _actualTemporary;
	private String _actualForeign;
	private String _actualLocal;
	private String _actualPayroll;
	private String _projectedPermanent;
	private String _projectedTemporary;
	private String _projectedForeign;
	private String _projectedLocal;
	private String _projectedPayroll;
	private long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<TourismBonaWaterSportEmployeeInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismBonaWaterSportEmployeeInfo)this);
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

		_columnOriginalValues.put("tourismBonaWSEmplId", _tourismBonaWSEmplId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("actualPermanent", _actualPermanent);
		_columnOriginalValues.put("actualTemporary", _actualTemporary);
		_columnOriginalValues.put("actualForeign", _actualForeign);
		_columnOriginalValues.put("actualLocal", _actualLocal);
		_columnOriginalValues.put("actualPayroll", _actualPayroll);
		_columnOriginalValues.put("projectedPermanent", _projectedPermanent);
		_columnOriginalValues.put("projectedTemporary", _projectedTemporary);
		_columnOriginalValues.put("projectedForeign", _projectedForeign);
		_columnOriginalValues.put("projectedLocal", _projectedLocal);
		_columnOriginalValues.put("projectedPayroll", _projectedPayroll);
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

		columnBitmasks.put("tourismBonaWSEmplId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("actualPermanent", 128L);

		columnBitmasks.put("actualTemporary", 256L);

		columnBitmasks.put("actualForeign", 512L);

		columnBitmasks.put("actualLocal", 1024L);

		columnBitmasks.put("actualPayroll", 2048L);

		columnBitmasks.put("projectedPermanent", 4096L);

		columnBitmasks.put("projectedTemporary", 8192L);

		columnBitmasks.put("projectedForeign", 16384L);

		columnBitmasks.put("projectedLocal", 32768L);

		columnBitmasks.put("projectedPayroll", 65536L);

		columnBitmasks.put("tourismApplicationId", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismBonaWaterSportEmployeeInfo _escapedModel;

}