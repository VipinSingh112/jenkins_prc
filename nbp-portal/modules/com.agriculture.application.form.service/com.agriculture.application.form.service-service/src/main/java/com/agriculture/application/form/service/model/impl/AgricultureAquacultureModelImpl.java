/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.model.impl;

import com.agriculture.application.form.service.model.AgricultureAquaculture;
import com.agriculture.application.form.service.model.AgricultureAquacultureModel;

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
 * The base model implementation for the AgricultureAquaculture service. Represents a row in the &quot;agriculture_aqaculture&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AgricultureAquacultureModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AgricultureAquacultureImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquacultureImpl
 * @generated
 */
@JSON(strict = true)
public class AgricultureAquacultureModelImpl
	extends BaseModelImpl<AgricultureAquaculture>
	implements AgricultureAquacultureModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a agriculture aquaculture model instance should use the <code>AgricultureAquaculture</code> interface instead.
	 */
	public static final String TABLE_NAME = "agriculture_aqaculture";

	public static final Object[][] TABLE_COLUMNS = {
		{"agricultureAquacultureId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"aquacultureType", Types.VARCHAR},
		{"waterHectare", Types.VARCHAR},
		{"averageAnnualProduction", Types.VARCHAR},
		{"marketLocal", Types.VARCHAR}, {"marketForeign", Types.VARCHAR},
		{"valueOfSale", Types.VARCHAR}, {"aquacultureCounter", Types.VARCHAR},
		{"agricultureApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("agricultureAquacultureId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("aquacultureType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("waterHectare", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("averageAnnualProduction", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("marketLocal", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("marketForeign", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("valueOfSale", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("aquacultureCounter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("agricultureApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table agriculture_aqaculture (agricultureAquacultureId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,aquacultureType VARCHAR(75) null,waterHectare VARCHAR(75) null,averageAnnualProduction VARCHAR(75) null,marketLocal VARCHAR(75) null,marketForeign VARCHAR(75) null,valueOfSale VARCHAR(75) null,aquacultureCounter VARCHAR(75) null,agricultureApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table agriculture_aqaculture";

	public static final String ORDER_BY_JPQL =
		" ORDER BY agricultureAquaculture.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY agriculture_aqaculture.createDate ASC";

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

	public AgricultureAquacultureModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _agricultureAquacultureId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAgricultureAquacultureId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _agricultureAquacultureId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AgricultureAquaculture.class;
	}

	@Override
	public String getModelClassName() {
		return AgricultureAquaculture.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AgricultureAquaculture, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AgricultureAquaculture, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AgricultureAquaculture, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AgricultureAquaculture)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AgricultureAquaculture, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AgricultureAquaculture, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AgricultureAquaculture)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AgricultureAquaculture, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AgricultureAquaculture, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<AgricultureAquaculture, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<AgricultureAquaculture, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AgricultureAquaculture, Object>>();

			attributeGetterFunctions.put(
				"agricultureAquacultureId",
				AgricultureAquaculture::getAgricultureAquacultureId);
			attributeGetterFunctions.put(
				"groupId", AgricultureAquaculture::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AgricultureAquaculture::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AgricultureAquaculture::getUserId);
			attributeGetterFunctions.put(
				"userName", AgricultureAquaculture::getUserName);
			attributeGetterFunctions.put(
				"createDate", AgricultureAquaculture::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AgricultureAquaculture::getModifiedDate);
			attributeGetterFunctions.put(
				"aquacultureType", AgricultureAquaculture::getAquacultureType);
			attributeGetterFunctions.put(
				"waterHectare", AgricultureAquaculture::getWaterHectare);
			attributeGetterFunctions.put(
				"averageAnnualProduction",
				AgricultureAquaculture::getAverageAnnualProduction);
			attributeGetterFunctions.put(
				"marketLocal", AgricultureAquaculture::getMarketLocal);
			attributeGetterFunctions.put(
				"marketForeign", AgricultureAquaculture::getMarketForeign);
			attributeGetterFunctions.put(
				"valueOfSale", AgricultureAquaculture::getValueOfSale);
			attributeGetterFunctions.put(
				"aquacultureCounter",
				AgricultureAquaculture::getAquacultureCounter);
			attributeGetterFunctions.put(
				"agricultureApplicationId",
				AgricultureAquaculture::getAgricultureApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AgricultureAquaculture, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AgricultureAquaculture, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AgricultureAquaculture, ?>>();

			attributeSetterBiConsumers.put(
				"agricultureAquacultureId",
				(BiConsumer<AgricultureAquaculture, Long>)
					AgricultureAquaculture::setAgricultureAquacultureId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AgricultureAquaculture, Long>)
					AgricultureAquaculture::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AgricultureAquaculture, Long>)
					AgricultureAquaculture::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AgricultureAquaculture, Long>)
					AgricultureAquaculture::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AgricultureAquaculture, String>)
					AgricultureAquaculture::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AgricultureAquaculture, Date>)
					AgricultureAquaculture::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AgricultureAquaculture, Date>)
					AgricultureAquaculture::setModifiedDate);
			attributeSetterBiConsumers.put(
				"aquacultureType",
				(BiConsumer<AgricultureAquaculture, String>)
					AgricultureAquaculture::setAquacultureType);
			attributeSetterBiConsumers.put(
				"waterHectare",
				(BiConsumer<AgricultureAquaculture, String>)
					AgricultureAquaculture::setWaterHectare);
			attributeSetterBiConsumers.put(
				"averageAnnualProduction",
				(BiConsumer<AgricultureAquaculture, String>)
					AgricultureAquaculture::setAverageAnnualProduction);
			attributeSetterBiConsumers.put(
				"marketLocal",
				(BiConsumer<AgricultureAquaculture, String>)
					AgricultureAquaculture::setMarketLocal);
			attributeSetterBiConsumers.put(
				"marketForeign",
				(BiConsumer<AgricultureAquaculture, String>)
					AgricultureAquaculture::setMarketForeign);
			attributeSetterBiConsumers.put(
				"valueOfSale",
				(BiConsumer<AgricultureAquaculture, String>)
					AgricultureAquaculture::setValueOfSale);
			attributeSetterBiConsumers.put(
				"aquacultureCounter",
				(BiConsumer<AgricultureAquaculture, String>)
					AgricultureAquaculture::setAquacultureCounter);
			attributeSetterBiConsumers.put(
				"agricultureApplicationId",
				(BiConsumer<AgricultureAquaculture, Long>)
					AgricultureAquaculture::setAgricultureApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAgricultureAquacultureId() {
		return _agricultureAquacultureId;
	}

	@Override
	public void setAgricultureAquacultureId(long agricultureAquacultureId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_agricultureAquacultureId = agricultureAquacultureId;
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
	public String getAquacultureType() {
		if (_aquacultureType == null) {
			return "";
		}
		else {
			return _aquacultureType;
		}
	}

	@Override
	public void setAquacultureType(String aquacultureType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_aquacultureType = aquacultureType;
	}

	@JSON
	@Override
	public String getWaterHectare() {
		if (_waterHectare == null) {
			return "";
		}
		else {
			return _waterHectare;
		}
	}

	@Override
	public void setWaterHectare(String waterHectare) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_waterHectare = waterHectare;
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
	public String getMarketLocal() {
		if (_marketLocal == null) {
			return "";
		}
		else {
			return _marketLocal;
		}
	}

	@Override
	public void setMarketLocal(String marketLocal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_marketLocal = marketLocal;
	}

	@JSON
	@Override
	public String getMarketForeign() {
		if (_marketForeign == null) {
			return "";
		}
		else {
			return _marketForeign;
		}
	}

	@Override
	public void setMarketForeign(String marketForeign) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_marketForeign = marketForeign;
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
	public String getAquacultureCounter() {
		if (_aquacultureCounter == null) {
			return "";
		}
		else {
			return _aquacultureCounter;
		}
	}

	@Override
	public void setAquacultureCounter(String aquacultureCounter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_aquacultureCounter = aquacultureCounter;
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
			getCompanyId(), AgricultureAquaculture.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AgricultureAquaculture toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AgricultureAquaculture>
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
		AgricultureAquacultureImpl agricultureAquacultureImpl =
			new AgricultureAquacultureImpl();

		agricultureAquacultureImpl.setAgricultureAquacultureId(
			getAgricultureAquacultureId());
		agricultureAquacultureImpl.setGroupId(getGroupId());
		agricultureAquacultureImpl.setCompanyId(getCompanyId());
		agricultureAquacultureImpl.setUserId(getUserId());
		agricultureAquacultureImpl.setUserName(getUserName());
		agricultureAquacultureImpl.setCreateDate(getCreateDate());
		agricultureAquacultureImpl.setModifiedDate(getModifiedDate());
		agricultureAquacultureImpl.setAquacultureType(getAquacultureType());
		agricultureAquacultureImpl.setWaterHectare(getWaterHectare());
		agricultureAquacultureImpl.setAverageAnnualProduction(
			getAverageAnnualProduction());
		agricultureAquacultureImpl.setMarketLocal(getMarketLocal());
		agricultureAquacultureImpl.setMarketForeign(getMarketForeign());
		agricultureAquacultureImpl.setValueOfSale(getValueOfSale());
		agricultureAquacultureImpl.setAquacultureCounter(
			getAquacultureCounter());
		agricultureAquacultureImpl.setAgricultureApplicationId(
			getAgricultureApplicationId());

		agricultureAquacultureImpl.resetOriginalValues();

		return agricultureAquacultureImpl;
	}

	@Override
	public AgricultureAquaculture cloneWithOriginalValues() {
		AgricultureAquacultureImpl agricultureAquacultureImpl =
			new AgricultureAquacultureImpl();

		agricultureAquacultureImpl.setAgricultureAquacultureId(
			this.<Long>getColumnOriginalValue("agricultureAquacultureId"));
		agricultureAquacultureImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		agricultureAquacultureImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		agricultureAquacultureImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		agricultureAquacultureImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		agricultureAquacultureImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		agricultureAquacultureImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		agricultureAquacultureImpl.setAquacultureType(
			this.<String>getColumnOriginalValue("aquacultureType"));
		agricultureAquacultureImpl.setWaterHectare(
			this.<String>getColumnOriginalValue("waterHectare"));
		agricultureAquacultureImpl.setAverageAnnualProduction(
			this.<String>getColumnOriginalValue("averageAnnualProduction"));
		agricultureAquacultureImpl.setMarketLocal(
			this.<String>getColumnOriginalValue("marketLocal"));
		agricultureAquacultureImpl.setMarketForeign(
			this.<String>getColumnOriginalValue("marketForeign"));
		agricultureAquacultureImpl.setValueOfSale(
			this.<String>getColumnOriginalValue("valueOfSale"));
		agricultureAquacultureImpl.setAquacultureCounter(
			this.<String>getColumnOriginalValue("aquacultureCounter"));
		agricultureAquacultureImpl.setAgricultureApplicationId(
			this.<Long>getColumnOriginalValue("agricultureApplicationId"));

		return agricultureAquacultureImpl;
	}

	@Override
	public int compareTo(AgricultureAquaculture agricultureAquaculture) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), agricultureAquaculture.getCreateDate());

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

		if (!(object instanceof AgricultureAquaculture)) {
			return false;
		}

		AgricultureAquaculture agricultureAquaculture =
			(AgricultureAquaculture)object;

		long primaryKey = agricultureAquaculture.getPrimaryKey();

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
	public CacheModel<AgricultureAquaculture> toCacheModel() {
		AgricultureAquacultureCacheModel agricultureAquacultureCacheModel =
			new AgricultureAquacultureCacheModel();

		agricultureAquacultureCacheModel.agricultureAquacultureId =
			getAgricultureAquacultureId();

		agricultureAquacultureCacheModel.groupId = getGroupId();

		agricultureAquacultureCacheModel.companyId = getCompanyId();

		agricultureAquacultureCacheModel.userId = getUserId();

		agricultureAquacultureCacheModel.userName = getUserName();

		String userName = agricultureAquacultureCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			agricultureAquacultureCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			agricultureAquacultureCacheModel.createDate = createDate.getTime();
		}
		else {
			agricultureAquacultureCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			agricultureAquacultureCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			agricultureAquacultureCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		agricultureAquacultureCacheModel.aquacultureType = getAquacultureType();

		String aquacultureType =
			agricultureAquacultureCacheModel.aquacultureType;

		if ((aquacultureType != null) && (aquacultureType.length() == 0)) {
			agricultureAquacultureCacheModel.aquacultureType = null;
		}

		agricultureAquacultureCacheModel.waterHectare = getWaterHectare();

		String waterHectare = agricultureAquacultureCacheModel.waterHectare;

		if ((waterHectare != null) && (waterHectare.length() == 0)) {
			agricultureAquacultureCacheModel.waterHectare = null;
		}

		agricultureAquacultureCacheModel.averageAnnualProduction =
			getAverageAnnualProduction();

		String averageAnnualProduction =
			agricultureAquacultureCacheModel.averageAnnualProduction;

		if ((averageAnnualProduction != null) &&
			(averageAnnualProduction.length() == 0)) {

			agricultureAquacultureCacheModel.averageAnnualProduction = null;
		}

		agricultureAquacultureCacheModel.marketLocal = getMarketLocal();

		String marketLocal = agricultureAquacultureCacheModel.marketLocal;

		if ((marketLocal != null) && (marketLocal.length() == 0)) {
			agricultureAquacultureCacheModel.marketLocal = null;
		}

		agricultureAquacultureCacheModel.marketForeign = getMarketForeign();

		String marketForeign = agricultureAquacultureCacheModel.marketForeign;

		if ((marketForeign != null) && (marketForeign.length() == 0)) {
			agricultureAquacultureCacheModel.marketForeign = null;
		}

		agricultureAquacultureCacheModel.valueOfSale = getValueOfSale();

		String valueOfSale = agricultureAquacultureCacheModel.valueOfSale;

		if ((valueOfSale != null) && (valueOfSale.length() == 0)) {
			agricultureAquacultureCacheModel.valueOfSale = null;
		}

		agricultureAquacultureCacheModel.aquacultureCounter =
			getAquacultureCounter();

		String aquacultureCounter =
			agricultureAquacultureCacheModel.aquacultureCounter;

		if ((aquacultureCounter != null) &&
			(aquacultureCounter.length() == 0)) {

			agricultureAquacultureCacheModel.aquacultureCounter = null;
		}

		agricultureAquacultureCacheModel.agricultureApplicationId =
			getAgricultureApplicationId();

		return agricultureAquacultureCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AgricultureAquaculture, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AgricultureAquaculture, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AgricultureAquaculture, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AgricultureAquaculture)this);

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

		private static final Function<InvocationHandler, AgricultureAquaculture>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AgricultureAquaculture.class, ModelWrapper.class);

	}

	private long _agricultureAquacultureId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _aquacultureType;
	private String _waterHectare;
	private String _averageAnnualProduction;
	private String _marketLocal;
	private String _marketForeign;
	private String _valueOfSale;
	private String _aquacultureCounter;
	private long _agricultureApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<AgricultureAquaculture, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AgricultureAquaculture)this);
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
			"agricultureAquacultureId", _agricultureAquacultureId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("aquacultureType", _aquacultureType);
		_columnOriginalValues.put("waterHectare", _waterHectare);
		_columnOriginalValues.put(
			"averageAnnualProduction", _averageAnnualProduction);
		_columnOriginalValues.put("marketLocal", _marketLocal);
		_columnOriginalValues.put("marketForeign", _marketForeign);
		_columnOriginalValues.put("valueOfSale", _valueOfSale);
		_columnOriginalValues.put("aquacultureCounter", _aquacultureCounter);
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

		columnBitmasks.put("agricultureAquacultureId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("aquacultureType", 128L);

		columnBitmasks.put("waterHectare", 256L);

		columnBitmasks.put("averageAnnualProduction", 512L);

		columnBitmasks.put("marketLocal", 1024L);

		columnBitmasks.put("marketForeign", 2048L);

		columnBitmasks.put("valueOfSale", 4096L);

		columnBitmasks.put("aquacultureCounter", 8192L);

		columnBitmasks.put("agricultureApplicationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AgricultureAquaculture _escapedModel;

}