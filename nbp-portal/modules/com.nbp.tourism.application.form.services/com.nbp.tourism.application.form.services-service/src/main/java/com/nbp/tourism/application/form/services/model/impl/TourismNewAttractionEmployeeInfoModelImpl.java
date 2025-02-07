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

import com.nbp.tourism.application.form.services.model.TourismNewAttractionEmployeeInfo;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionEmployeeInfoModel;

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
 * The base model implementation for the TourismNewAttractionEmployeeInfo service. Represents a row in the &quot;nbp_tourism_new_attrac_emp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismNewAttractionEmployeeInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismNewAttractionEmployeeInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionEmployeeInfoImpl
 * @generated
 */
@JSON(strict = true)
public class TourismNewAttractionEmployeeInfoModelImpl
	extends BaseModelImpl<TourismNewAttractionEmployeeInfo>
	implements TourismNewAttractionEmployeeInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism new attraction employee info model instance should use the <code>TourismNewAttractionEmployeeInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_new_attrac_emp";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismNewAttractionEmploId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"actualPermanent", Types.VARCHAR}, {"actualTemporary", Types.VARCHAR},
		{"actualForeign", Types.VARCHAR}, {"actualLocal", Types.VARCHAR},
		{"actualPayroll", Types.VARCHAR}, {"projectedPermanent", Types.VARCHAR},
		{"projectedTemporary", Types.VARCHAR},
		{"projectedForeign", Types.VARCHAR}, {"projectedLocal", Types.VARCHAR},
		{"projectedPayroll", Types.VARCHAR},
		{"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismNewAttractionEmploId", Types.BIGINT);
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
		"create table nbp_tourism_new_attrac_emp (tourismNewAttractionEmploId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,actualPermanent VARCHAR(75) null,actualTemporary VARCHAR(75) null,actualForeign VARCHAR(75) null,actualLocal VARCHAR(75) null,actualPayroll VARCHAR(75) null,projectedPermanent VARCHAR(75) null,projectedTemporary VARCHAR(75) null,projectedForeign VARCHAR(75) null,projectedLocal VARCHAR(75) null,projectedPayroll VARCHAR(75) null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_new_attrac_emp";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismNewAttractionEmployeeInfo.tourismNewAttractionEmploId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_new_attrac_emp.tourismNewAttractionEmploId ASC";

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
	public static final long TOURISMNEWATTRACTIONEMPLOID_COLUMN_BITMASK = 2L;

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

	public TourismNewAttractionEmployeeInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismNewAttractionEmploId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismNewAttractionEmploId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismNewAttractionEmploId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismNewAttractionEmployeeInfo.class;
	}

	@Override
	public String getModelClassName() {
		return TourismNewAttractionEmployeeInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismNewAttractionEmployeeInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String, Function<TourismNewAttractionEmployeeInfo, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismNewAttractionEmployeeInfo, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(TourismNewAttractionEmployeeInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismNewAttractionEmployeeInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismNewAttractionEmployeeInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismNewAttractionEmployeeInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismNewAttractionEmployeeInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismNewAttractionEmployeeInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<TourismNewAttractionEmployeeInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<TourismNewAttractionEmployeeInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<TourismNewAttractionEmployeeInfo, Object>>();

			attributeGetterFunctions.put(
				"tourismNewAttractionEmploId",
				TourismNewAttractionEmployeeInfo::
					getTourismNewAttractionEmploId);
			attributeGetterFunctions.put(
				"groupId", TourismNewAttractionEmployeeInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismNewAttractionEmployeeInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismNewAttractionEmployeeInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismNewAttractionEmployeeInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismNewAttractionEmployeeInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate",
				TourismNewAttractionEmployeeInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"actualPermanent",
				TourismNewAttractionEmployeeInfo::getActualPermanent);
			attributeGetterFunctions.put(
				"actualTemporary",
				TourismNewAttractionEmployeeInfo::getActualTemporary);
			attributeGetterFunctions.put(
				"actualForeign",
				TourismNewAttractionEmployeeInfo::getActualForeign);
			attributeGetterFunctions.put(
				"actualLocal",
				TourismNewAttractionEmployeeInfo::getActualLocal);
			attributeGetterFunctions.put(
				"actualPayroll",
				TourismNewAttractionEmployeeInfo::getActualPayroll);
			attributeGetterFunctions.put(
				"projectedPermanent",
				TourismNewAttractionEmployeeInfo::getProjectedPermanent);
			attributeGetterFunctions.put(
				"projectedTemporary",
				TourismNewAttractionEmployeeInfo::getProjectedTemporary);
			attributeGetterFunctions.put(
				"projectedForeign",
				TourismNewAttractionEmployeeInfo::getProjectedForeign);
			attributeGetterFunctions.put(
				"projectedLocal",
				TourismNewAttractionEmployeeInfo::getProjectedLocal);
			attributeGetterFunctions.put(
				"projectedPayroll",
				TourismNewAttractionEmployeeInfo::getProjectedPayroll);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismNewAttractionEmployeeInfo::getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<TourismNewAttractionEmployeeInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismNewAttractionEmployeeInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String,
						 BiConsumer<TourismNewAttractionEmployeeInfo, ?>>();

			attributeSetterBiConsumers.put(
				"tourismNewAttractionEmploId",
				(BiConsumer<TourismNewAttractionEmployeeInfo, Long>)
					TourismNewAttractionEmployeeInfo::
						setTourismNewAttractionEmploId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismNewAttractionEmployeeInfo, Long>)
					TourismNewAttractionEmployeeInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismNewAttractionEmployeeInfo, Long>)
					TourismNewAttractionEmployeeInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismNewAttractionEmployeeInfo, Long>)
					TourismNewAttractionEmployeeInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismNewAttractionEmployeeInfo, Date>)
					TourismNewAttractionEmployeeInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismNewAttractionEmployeeInfo, Date>)
					TourismNewAttractionEmployeeInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"actualPermanent",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setActualPermanent);
			attributeSetterBiConsumers.put(
				"actualTemporary",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setActualTemporary);
			attributeSetterBiConsumers.put(
				"actualForeign",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setActualForeign);
			attributeSetterBiConsumers.put(
				"actualLocal",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setActualLocal);
			attributeSetterBiConsumers.put(
				"actualPayroll",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setActualPayroll);
			attributeSetterBiConsumers.put(
				"projectedPermanent",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setProjectedPermanent);
			attributeSetterBiConsumers.put(
				"projectedTemporary",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setProjectedTemporary);
			attributeSetterBiConsumers.put(
				"projectedForeign",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setProjectedForeign);
			attributeSetterBiConsumers.put(
				"projectedLocal",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setProjectedLocal);
			attributeSetterBiConsumers.put(
				"projectedPayroll",
				(BiConsumer<TourismNewAttractionEmployeeInfo, String>)
					TourismNewAttractionEmployeeInfo::setProjectedPayroll);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismNewAttractionEmployeeInfo, Long>)
					TourismNewAttractionEmployeeInfo::setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismNewAttractionEmploId() {
		return _tourismNewAttractionEmploId;
	}

	@Override
	public void setTourismNewAttractionEmploId(
		long tourismNewAttractionEmploId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismNewAttractionEmploId = tourismNewAttractionEmploId;
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
			getCompanyId(), TourismNewAttractionEmployeeInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismNewAttractionEmployeeInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismNewAttractionEmployeeInfo>
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
		TourismNewAttractionEmployeeInfoImpl
			tourismNewAttractionEmployeeInfoImpl =
				new TourismNewAttractionEmployeeInfoImpl();

		tourismNewAttractionEmployeeInfoImpl.setTourismNewAttractionEmploId(
			getTourismNewAttractionEmploId());
		tourismNewAttractionEmployeeInfoImpl.setGroupId(getGroupId());
		tourismNewAttractionEmployeeInfoImpl.setCompanyId(getCompanyId());
		tourismNewAttractionEmployeeInfoImpl.setUserId(getUserId());
		tourismNewAttractionEmployeeInfoImpl.setUserName(getUserName());
		tourismNewAttractionEmployeeInfoImpl.setCreateDate(getCreateDate());
		tourismNewAttractionEmployeeInfoImpl.setModifiedDate(getModifiedDate());
		tourismNewAttractionEmployeeInfoImpl.setActualPermanent(
			getActualPermanent());
		tourismNewAttractionEmployeeInfoImpl.setActualTemporary(
			getActualTemporary());
		tourismNewAttractionEmployeeInfoImpl.setActualForeign(
			getActualForeign());
		tourismNewAttractionEmployeeInfoImpl.setActualLocal(getActualLocal());
		tourismNewAttractionEmployeeInfoImpl.setActualPayroll(
			getActualPayroll());
		tourismNewAttractionEmployeeInfoImpl.setProjectedPermanent(
			getProjectedPermanent());
		tourismNewAttractionEmployeeInfoImpl.setProjectedTemporary(
			getProjectedTemporary());
		tourismNewAttractionEmployeeInfoImpl.setProjectedForeign(
			getProjectedForeign());
		tourismNewAttractionEmployeeInfoImpl.setProjectedLocal(
			getProjectedLocal());
		tourismNewAttractionEmployeeInfoImpl.setProjectedPayroll(
			getProjectedPayroll());
		tourismNewAttractionEmployeeInfoImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismNewAttractionEmployeeInfoImpl.resetOriginalValues();

		return tourismNewAttractionEmployeeInfoImpl;
	}

	@Override
	public TourismNewAttractionEmployeeInfo cloneWithOriginalValues() {
		TourismNewAttractionEmployeeInfoImpl
			tourismNewAttractionEmployeeInfoImpl =
				new TourismNewAttractionEmployeeInfoImpl();

		tourismNewAttractionEmployeeInfoImpl.setTourismNewAttractionEmploId(
			this.<Long>getColumnOriginalValue("tourismNewAttractionEmploId"));
		tourismNewAttractionEmployeeInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismNewAttractionEmployeeInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismNewAttractionEmployeeInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismNewAttractionEmployeeInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismNewAttractionEmployeeInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismNewAttractionEmployeeInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismNewAttractionEmployeeInfoImpl.setActualPermanent(
			this.<String>getColumnOriginalValue("actualPermanent"));
		tourismNewAttractionEmployeeInfoImpl.setActualTemporary(
			this.<String>getColumnOriginalValue("actualTemporary"));
		tourismNewAttractionEmployeeInfoImpl.setActualForeign(
			this.<String>getColumnOriginalValue("actualForeign"));
		tourismNewAttractionEmployeeInfoImpl.setActualLocal(
			this.<String>getColumnOriginalValue("actualLocal"));
		tourismNewAttractionEmployeeInfoImpl.setActualPayroll(
			this.<String>getColumnOriginalValue("actualPayroll"));
		tourismNewAttractionEmployeeInfoImpl.setProjectedPermanent(
			this.<String>getColumnOriginalValue("projectedPermanent"));
		tourismNewAttractionEmployeeInfoImpl.setProjectedTemporary(
			this.<String>getColumnOriginalValue("projectedTemporary"));
		tourismNewAttractionEmployeeInfoImpl.setProjectedForeign(
			this.<String>getColumnOriginalValue("projectedForeign"));
		tourismNewAttractionEmployeeInfoImpl.setProjectedLocal(
			this.<String>getColumnOriginalValue("projectedLocal"));
		tourismNewAttractionEmployeeInfoImpl.setProjectedPayroll(
			this.<String>getColumnOriginalValue("projectedPayroll"));
		tourismNewAttractionEmployeeInfoImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismNewAttractionEmployeeInfoImpl;
	}

	@Override
	public int compareTo(
		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo) {

		long primaryKey = tourismNewAttractionEmployeeInfo.getPrimaryKey();

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

		if (!(object instanceof TourismNewAttractionEmployeeInfo)) {
			return false;
		}

		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo =
			(TourismNewAttractionEmployeeInfo)object;

		long primaryKey = tourismNewAttractionEmployeeInfo.getPrimaryKey();

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
	public CacheModel<TourismNewAttractionEmployeeInfo> toCacheModel() {
		TourismNewAttractionEmployeeInfoCacheModel
			tourismNewAttractionEmployeeInfoCacheModel =
				new TourismNewAttractionEmployeeInfoCacheModel();

		tourismNewAttractionEmployeeInfoCacheModel.tourismNewAttractionEmploId =
			getTourismNewAttractionEmploId();

		tourismNewAttractionEmployeeInfoCacheModel.groupId = getGroupId();

		tourismNewAttractionEmployeeInfoCacheModel.companyId = getCompanyId();

		tourismNewAttractionEmployeeInfoCacheModel.userId = getUserId();

		tourismNewAttractionEmployeeInfoCacheModel.userName = getUserName();

		String userName = tourismNewAttractionEmployeeInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismNewAttractionEmployeeInfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			tourismNewAttractionEmployeeInfoCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismNewAttractionEmployeeInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismNewAttractionEmployeeInfoCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		tourismNewAttractionEmployeeInfoCacheModel.actualPermanent =
			getActualPermanent();

		String actualPermanent =
			tourismNewAttractionEmployeeInfoCacheModel.actualPermanent;

		if ((actualPermanent != null) && (actualPermanent.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.actualPermanent = null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.actualTemporary =
			getActualTemporary();

		String actualTemporary =
			tourismNewAttractionEmployeeInfoCacheModel.actualTemporary;

		if ((actualTemporary != null) && (actualTemporary.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.actualTemporary = null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.actualForeign =
			getActualForeign();

		String actualForeign =
			tourismNewAttractionEmployeeInfoCacheModel.actualForeign;

		if ((actualForeign != null) && (actualForeign.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.actualForeign = null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.actualLocal =
			getActualLocal();

		String actualLocal =
			tourismNewAttractionEmployeeInfoCacheModel.actualLocal;

		if ((actualLocal != null) && (actualLocal.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.actualLocal = null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.actualPayroll =
			getActualPayroll();

		String actualPayroll =
			tourismNewAttractionEmployeeInfoCacheModel.actualPayroll;

		if ((actualPayroll != null) && (actualPayroll.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.actualPayroll = null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.projectedPermanent =
			getProjectedPermanent();

		String projectedPermanent =
			tourismNewAttractionEmployeeInfoCacheModel.projectedPermanent;

		if ((projectedPermanent != null) &&
			(projectedPermanent.length() == 0)) {

			tourismNewAttractionEmployeeInfoCacheModel.projectedPermanent =
				null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.projectedTemporary =
			getProjectedTemporary();

		String projectedTemporary =
			tourismNewAttractionEmployeeInfoCacheModel.projectedTemporary;

		if ((projectedTemporary != null) &&
			(projectedTemporary.length() == 0)) {

			tourismNewAttractionEmployeeInfoCacheModel.projectedTemporary =
				null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.projectedForeign =
			getProjectedForeign();

		String projectedForeign =
			tourismNewAttractionEmployeeInfoCacheModel.projectedForeign;

		if ((projectedForeign != null) && (projectedForeign.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.projectedForeign = null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.projectedLocal =
			getProjectedLocal();

		String projectedLocal =
			tourismNewAttractionEmployeeInfoCacheModel.projectedLocal;

		if ((projectedLocal != null) && (projectedLocal.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.projectedLocal = null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.projectedPayroll =
			getProjectedPayroll();

		String projectedPayroll =
			tourismNewAttractionEmployeeInfoCacheModel.projectedPayroll;

		if ((projectedPayroll != null) && (projectedPayroll.length() == 0)) {
			tourismNewAttractionEmployeeInfoCacheModel.projectedPayroll = null;
		}

		tourismNewAttractionEmployeeInfoCacheModel.tourismApplicationId =
			getTourismApplicationId();

		return tourismNewAttractionEmployeeInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismNewAttractionEmployeeInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry
				<String, Function<TourismNewAttractionEmployeeInfo, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismNewAttractionEmployeeInfo, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismNewAttractionEmployeeInfo)this);

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
			<InvocationHandler, TourismNewAttractionEmployeeInfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismNewAttractionEmployeeInfo.class,
						ModelWrapper.class);

	}

	private long _tourismNewAttractionEmploId;
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
		Function<TourismNewAttractionEmployeeInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismNewAttractionEmployeeInfo)this);
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
			"tourismNewAttractionEmploId", _tourismNewAttractionEmploId);
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

		columnBitmasks.put("tourismNewAttractionEmploId", 1L);

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
	private TourismNewAttractionEmployeeInfo _escapedModel;

}