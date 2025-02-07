/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureCrop;
import com.agriculture.application.form.service.model.AgricultureCropModel;

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
 * The base model implementation for the AgricultureCrop service. Represents a row in the &quot;agriculture_crop&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AgricultureCropModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AgricultureCropImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureCropImpl
 * @generated
 */
@JSON(strict = true)
public class AgricultureCropModelImpl
	extends BaseModelImpl<AgricultureCrop> implements AgricultureCropModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a agriculture crop model instance should use the <code>AgricultureCrop</code> interface instead.
	 */
	public static final String TABLE_NAME = "agriculture_crop";

	public static final Object[][] TABLE_COLUMNS = {
		{"agricultureCropId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"cropType", Types.VARCHAR},
		{"cropHectare", Types.VARCHAR},
		{"averageAnnualProduction", Types.VARCHAR},
		{"cropMarketLocal", Types.VARCHAR},
		{"cropMarketForeign", Types.VARCHAR}, {"valueOfSale", Types.VARCHAR},
		{"cropCounter", Types.VARCHAR},
		{"agricultureApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("agricultureCropId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("cropType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("cropHectare", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("averageAnnualProduction", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("cropMarketLocal", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("cropMarketForeign", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("valueOfSale", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("cropCounter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("agricultureApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table agriculture_crop (agricultureCropId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,cropType VARCHAR(75) null,cropHectare VARCHAR(75) null,averageAnnualProduction VARCHAR(75) null,cropMarketLocal VARCHAR(75) null,cropMarketForeign VARCHAR(75) null,valueOfSale VARCHAR(75) null,cropCounter VARCHAR(75) null,agricultureApplicationId LONG)";

	public static final String TABLE_SQL_DROP = "drop table agriculture_crop";

	public static final String ORDER_BY_JPQL =
		" ORDER BY agricultureCrop.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY agriculture_crop.createDate ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long AGRICULTUREAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public AgricultureCropModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _agricultureCropId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAgricultureCropId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _agricultureCropId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AgricultureCrop.class;
	}

	@Override
	public String getModelClassName() {
		return AgricultureCrop.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AgricultureCrop, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AgricultureCrop, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AgricultureCrop, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AgricultureCrop)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AgricultureCrop, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AgricultureCrop, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AgricultureCrop)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AgricultureCrop, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AgricultureCrop, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<AgricultureCrop, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<AgricultureCrop, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AgricultureCrop, Object>>();

			attributeGetterFunctions.put(
				"agricultureCropId", AgricultureCrop::getAgricultureCropId);
			attributeGetterFunctions.put(
				"groupId", AgricultureCrop::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AgricultureCrop::getCompanyId);
			attributeGetterFunctions.put("userId", AgricultureCrop::getUserId);
			attributeGetterFunctions.put(
				"userName", AgricultureCrop::getUserName);
			attributeGetterFunctions.put(
				"createDate", AgricultureCrop::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AgricultureCrop::getModifiedDate);
			attributeGetterFunctions.put(
				"cropType", AgricultureCrop::getCropType);
			attributeGetterFunctions.put(
				"cropHectare", AgricultureCrop::getCropHectare);
			attributeGetterFunctions.put(
				"averageAnnualProduction",
				AgricultureCrop::getAverageAnnualProduction);
			attributeGetterFunctions.put(
				"cropMarketLocal", AgricultureCrop::getCropMarketLocal);
			attributeGetterFunctions.put(
				"cropMarketForeign", AgricultureCrop::getCropMarketForeign);
			attributeGetterFunctions.put(
				"valueOfSale", AgricultureCrop::getValueOfSale);
			attributeGetterFunctions.put(
				"cropCounter", AgricultureCrop::getCropCounter);
			attributeGetterFunctions.put(
				"agricultureApplicationId",
				AgricultureCrop::getAgricultureApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<AgricultureCrop, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AgricultureCrop, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap<String, BiConsumer<AgricultureCrop, ?>>();

			attributeSetterBiConsumers.put(
				"agricultureCropId",
				(BiConsumer<AgricultureCrop, Long>)
					AgricultureCrop::setAgricultureCropId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AgricultureCrop, Long>)AgricultureCrop::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AgricultureCrop, Long>)
					AgricultureCrop::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AgricultureCrop, Long>)AgricultureCrop::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AgricultureCrop, String>)
					AgricultureCrop::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AgricultureCrop, Date>)
					AgricultureCrop::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AgricultureCrop, Date>)
					AgricultureCrop::setModifiedDate);
			attributeSetterBiConsumers.put(
				"cropType",
				(BiConsumer<AgricultureCrop, String>)
					AgricultureCrop::setCropType);
			attributeSetterBiConsumers.put(
				"cropHectare",
				(BiConsumer<AgricultureCrop, String>)
					AgricultureCrop::setCropHectare);
			attributeSetterBiConsumers.put(
				"averageAnnualProduction",
				(BiConsumer<AgricultureCrop, String>)
					AgricultureCrop::setAverageAnnualProduction);
			attributeSetterBiConsumers.put(
				"cropMarketLocal",
				(BiConsumer<AgricultureCrop, String>)
					AgricultureCrop::setCropMarketLocal);
			attributeSetterBiConsumers.put(
				"cropMarketForeign",
				(BiConsumer<AgricultureCrop, String>)
					AgricultureCrop::setCropMarketForeign);
			attributeSetterBiConsumers.put(
				"valueOfSale",
				(BiConsumer<AgricultureCrop, String>)
					AgricultureCrop::setValueOfSale);
			attributeSetterBiConsumers.put(
				"cropCounter",
				(BiConsumer<AgricultureCrop, String>)
					AgricultureCrop::setCropCounter);
			attributeSetterBiConsumers.put(
				"agricultureApplicationId",
				(BiConsumer<AgricultureCrop, Long>)
					AgricultureCrop::setAgricultureApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAgricultureCropId() {
		return _agricultureCropId;
	}

	@Override
	public void setAgricultureCropId(long agricultureCropId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_agricultureCropId = agricultureCropId;
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
	public String getCropType() {
		if (_cropType == null) {
			return "";
		}
		else {
			return _cropType;
		}
	}

	@Override
	public void setCropType(String cropType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_cropType = cropType;
	}

	@JSON
	@Override
	public String getCropHectare() {
		if (_cropHectare == null) {
			return "";
		}
		else {
			return _cropHectare;
		}
	}

	@Override
	public void setCropHectare(String cropHectare) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_cropHectare = cropHectare;
	}

	@JSON
	@Override
	public String getAverageAnnualProduction() {
		if (_averageAnnualProduction == null) {
			return "";
		}
		else {
			return _averageAnnualProduction;
		}
	}

	@Override
	public void setAverageAnnualProduction(String averageAnnualProduction) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_averageAnnualProduction = averageAnnualProduction;
	}

	@JSON
	@Override
	public String getCropMarketLocal() {
		if (_cropMarketLocal == null) {
			return "";
		}
		else {
			return _cropMarketLocal;
		}
	}

	@Override
	public void setCropMarketLocal(String cropMarketLocal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_cropMarketLocal = cropMarketLocal;
	}

	@JSON
	@Override
	public String getCropMarketForeign() {
		if (_cropMarketForeign == null) {
			return "";
		}
		else {
			return _cropMarketForeign;
		}
	}

	@Override
	public void setCropMarketForeign(String cropMarketForeign) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_cropMarketForeign = cropMarketForeign;
	}

	@JSON
	@Override
	public String getValueOfSale() {
		if (_valueOfSale == null) {
			return "";
		}
		else {
			return _valueOfSale;
		}
	}

	@Override
	public void setValueOfSale(String valueOfSale) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_valueOfSale = valueOfSale;
	}

	@JSON
	@Override
	public String getCropCounter() {
		if (_cropCounter == null) {
			return "";
		}
		else {
			return _cropCounter;
		}
	}

	@Override
	public void setCropCounter(String cropCounter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_cropCounter = cropCounter;
	}

	@JSON
	@Override
	public long getAgricultureApplicationId() {
		return _agricultureApplicationId;
	}

	@Override
	public void setAgricultureApplicationId(long agricultureApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_agricultureApplicationId = agricultureApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalAgricultureApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("agricultureApplicationId"));
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
			getCompanyId(), AgricultureCrop.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AgricultureCrop toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AgricultureCrop>
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
		AgricultureCropImpl agricultureCropImpl = new AgricultureCropImpl();

		agricultureCropImpl.setAgricultureCropId(getAgricultureCropId());
		agricultureCropImpl.setGroupId(getGroupId());
		agricultureCropImpl.setCompanyId(getCompanyId());
		agricultureCropImpl.setUserId(getUserId());
		agricultureCropImpl.setUserName(getUserName());
		agricultureCropImpl.setCreateDate(getCreateDate());
		agricultureCropImpl.setModifiedDate(getModifiedDate());
		agricultureCropImpl.setCropType(getCropType());
		agricultureCropImpl.setCropHectare(getCropHectare());
		agricultureCropImpl.setAverageAnnualProduction(
			getAverageAnnualProduction());
		agricultureCropImpl.setCropMarketLocal(getCropMarketLocal());
		agricultureCropImpl.setCropMarketForeign(getCropMarketForeign());
		agricultureCropImpl.setValueOfSale(getValueOfSale());
		agricultureCropImpl.setCropCounter(getCropCounter());
		agricultureCropImpl.setAgricultureApplicationId(
			getAgricultureApplicationId());

		agricultureCropImpl.resetOriginalValues();

		return agricultureCropImpl;
	}

	@Override
	public AgricultureCrop cloneWithOriginalValues() {
		AgricultureCropImpl agricultureCropImpl = new AgricultureCropImpl();

		agricultureCropImpl.setAgricultureCropId(
			this.<Long>getColumnOriginalValue("agricultureCropId"));
		agricultureCropImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		agricultureCropImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		agricultureCropImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		agricultureCropImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		agricultureCropImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		agricultureCropImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		agricultureCropImpl.setCropType(
			this.<String>getColumnOriginalValue("cropType"));
		agricultureCropImpl.setCropHectare(
			this.<String>getColumnOriginalValue("cropHectare"));
		agricultureCropImpl.setAverageAnnualProduction(
			this.<String>getColumnOriginalValue("averageAnnualProduction"));
		agricultureCropImpl.setCropMarketLocal(
			this.<String>getColumnOriginalValue("cropMarketLocal"));
		agricultureCropImpl.setCropMarketForeign(
			this.<String>getColumnOriginalValue("cropMarketForeign"));
		agricultureCropImpl.setValueOfSale(
			this.<String>getColumnOriginalValue("valueOfSale"));
		agricultureCropImpl.setCropCounter(
			this.<String>getColumnOriginalValue("cropCounter"));
		agricultureCropImpl.setAgricultureApplicationId(
			this.<Long>getColumnOriginalValue("agricultureApplicationId"));

		return agricultureCropImpl;
	}

	@Override
	public int compareTo(AgricultureCrop agricultureCrop) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), agricultureCrop.getCreateDate());

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

		if (!(object instanceof AgricultureCrop)) {
			return false;
		}

		AgricultureCrop agricultureCrop = (AgricultureCrop)object;

		long primaryKey = agricultureCrop.getPrimaryKey();

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
	public CacheModel<AgricultureCrop> toCacheModel() {
		AgricultureCropCacheModel agricultureCropCacheModel =
			new AgricultureCropCacheModel();

		agricultureCropCacheModel.agricultureCropId = getAgricultureCropId();

		agricultureCropCacheModel.groupId = getGroupId();

		agricultureCropCacheModel.companyId = getCompanyId();

		agricultureCropCacheModel.userId = getUserId();

		agricultureCropCacheModel.userName = getUserName();

		String userName = agricultureCropCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			agricultureCropCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			agricultureCropCacheModel.createDate = createDate.getTime();
		}
		else {
			agricultureCropCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			agricultureCropCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			agricultureCropCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		agricultureCropCacheModel.cropType = getCropType();

		String cropType = agricultureCropCacheModel.cropType;

		if ((cropType != null) && (cropType.length() == 0)) {
			agricultureCropCacheModel.cropType = null;
		}

		agricultureCropCacheModel.cropHectare = getCropHectare();

		String cropHectare = agricultureCropCacheModel.cropHectare;

		if ((cropHectare != null) && (cropHectare.length() == 0)) {
			agricultureCropCacheModel.cropHectare = null;
		}

		agricultureCropCacheModel.averageAnnualProduction =
			getAverageAnnualProduction();

		String averageAnnualProduction =
			agricultureCropCacheModel.averageAnnualProduction;

		if ((averageAnnualProduction != null) &&
			(averageAnnualProduction.length() == 0)) {

			agricultureCropCacheModel.averageAnnualProduction = null;
		}

		agricultureCropCacheModel.cropMarketLocal = getCropMarketLocal();

		String cropMarketLocal = agricultureCropCacheModel.cropMarketLocal;

		if ((cropMarketLocal != null) && (cropMarketLocal.length() == 0)) {
			agricultureCropCacheModel.cropMarketLocal = null;
		}

		agricultureCropCacheModel.cropMarketForeign = getCropMarketForeign();

		String cropMarketForeign = agricultureCropCacheModel.cropMarketForeign;

		if ((cropMarketForeign != null) && (cropMarketForeign.length() == 0)) {
			agricultureCropCacheModel.cropMarketForeign = null;
		}

		agricultureCropCacheModel.valueOfSale = getValueOfSale();

		String valueOfSale = agricultureCropCacheModel.valueOfSale;

		if ((valueOfSale != null) && (valueOfSale.length() == 0)) {
			agricultureCropCacheModel.valueOfSale = null;
		}

		agricultureCropCacheModel.cropCounter = getCropCounter();

		String cropCounter = agricultureCropCacheModel.cropCounter;

		if ((cropCounter != null) && (cropCounter.length() == 0)) {
			agricultureCropCacheModel.cropCounter = null;
		}

		agricultureCropCacheModel.agricultureApplicationId =
			getAgricultureApplicationId();

		return agricultureCropCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AgricultureCrop, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AgricultureCrop, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AgricultureCrop, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((AgricultureCrop)this);

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

		private static final Function<InvocationHandler, AgricultureCrop>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AgricultureCrop.class, ModelWrapper.class);

	}

	private long _agricultureCropId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _cropType;
	private String _cropHectare;
	private String _averageAnnualProduction;
	private String _cropMarketLocal;
	private String _cropMarketForeign;
	private String _valueOfSale;
	private String _cropCounter;
	private long _agricultureApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<AgricultureCrop, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AgricultureCrop)this);
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

		_columnOriginalValues.put("agricultureCropId", _agricultureCropId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("cropType", _cropType);
		_columnOriginalValues.put("cropHectare", _cropHectare);
		_columnOriginalValues.put(
			"averageAnnualProduction", _averageAnnualProduction);
		_columnOriginalValues.put("cropMarketLocal", _cropMarketLocal);
		_columnOriginalValues.put("cropMarketForeign", _cropMarketForeign);
		_columnOriginalValues.put("valueOfSale", _valueOfSale);
		_columnOriginalValues.put("cropCounter", _cropCounter);
		_columnOriginalValues.put(
			"agricultureApplicationId", _agricultureApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("agricultureCropId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("cropType", 128L);

		columnBitmasks.put("cropHectare", 256L);

		columnBitmasks.put("averageAnnualProduction", 512L);

		columnBitmasks.put("cropMarketLocal", 1024L);

		columnBitmasks.put("cropMarketForeign", 2048L);

		columnBitmasks.put("valueOfSale", 4096L);

		columnBitmasks.put("cropCounter", 8192L);

		columnBitmasks.put("agricultureApplicationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AgricultureCrop _escapedModel;

}