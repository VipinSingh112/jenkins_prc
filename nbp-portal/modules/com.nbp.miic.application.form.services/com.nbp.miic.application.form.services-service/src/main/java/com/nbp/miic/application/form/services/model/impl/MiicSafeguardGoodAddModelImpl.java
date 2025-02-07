/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model.impl;

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

import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAdd;
import com.nbp.miic.application.form.services.model.MiicSafeguardGoodAddModel;

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
 * The base model implementation for the MiicSafeguardGoodAdd service. Represents a row in the &quot;nbp_miic_safeguard_good&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MiicSafeguardGoodAddModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MiicSafeguardGoodAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSafeguardGoodAddImpl
 * @generated
 */
@JSON(strict = true)
public class MiicSafeguardGoodAddModelImpl
	extends BaseModelImpl<MiicSafeguardGoodAdd>
	implements MiicSafeguardGoodAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a miic safeguard good add model instance should use the <code>MiicSafeguardGoodAdd</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_miic_safeguard_good";

	public static final Object[][] TABLE_COLUMNS = {
		{"miicSafeguardGoodAddId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"tariffHeadingNum", Types.VARCHAR},
		{"description", Types.VARCHAR}, {"amountQuantity", Types.VARCHAR},
		{"amountEstimate", Types.VARCHAR}, {"resonForRequest", Types.VARCHAR},
		{"counter", Types.VARCHAR}, {"miicApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("miicSafeguardGoodAddId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("tariffHeadingNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("amountQuantity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("amountEstimate", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("resonForRequest", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("miicApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_miic_safeguard_good (miicSafeguardGoodAddId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,tariffHeadingNum VARCHAR(75) null,description VARCHAR(500) null,amountQuantity VARCHAR(75) null,amountEstimate VARCHAR(75) null,resonForRequest VARCHAR(75) null,counter VARCHAR(75) null,miicApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_miic_safeguard_good";

	public static final String ORDER_BY_JPQL =
		" ORDER BY miicSafeguardGoodAdd.miicSafeguardGoodAddId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_miic_safeguard_good.miicSafeguardGoodAddId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long MIICAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long MIICSAFEGUARDGOODADDID_COLUMN_BITMASK = 2L;

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

	public MiicSafeguardGoodAddModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _miicSafeguardGoodAddId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMiicSafeguardGoodAddId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _miicSafeguardGoodAddId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MiicSafeguardGoodAdd.class;
	}

	@Override
	public String getModelClassName() {
		return MiicSafeguardGoodAdd.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<MiicSafeguardGoodAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<MiicSafeguardGoodAdd, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MiicSafeguardGoodAdd, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((MiicSafeguardGoodAdd)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<MiicSafeguardGoodAdd, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<MiicSafeguardGoodAdd, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(MiicSafeguardGoodAdd)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<MiicSafeguardGoodAdd, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<MiicSafeguardGoodAdd, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<MiicSafeguardGoodAdd, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<MiicSafeguardGoodAdd, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<MiicSafeguardGoodAdd, Object>>();

			attributeGetterFunctions.put(
				"miicSafeguardGoodAddId",
				MiicSafeguardGoodAdd::getMiicSafeguardGoodAddId);
			attributeGetterFunctions.put(
				"groupId", MiicSafeguardGoodAdd::getGroupId);
			attributeGetterFunctions.put(
				"companyId", MiicSafeguardGoodAdd::getCompanyId);
			attributeGetterFunctions.put(
				"userId", MiicSafeguardGoodAdd::getUserId);
			attributeGetterFunctions.put(
				"userName", MiicSafeguardGoodAdd::getUserName);
			attributeGetterFunctions.put(
				"createDate", MiicSafeguardGoodAdd::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", MiicSafeguardGoodAdd::getModifiedDate);
			attributeGetterFunctions.put(
				"tariffHeadingNum", MiicSafeguardGoodAdd::getTariffHeadingNum);
			attributeGetterFunctions.put(
				"description", MiicSafeguardGoodAdd::getDescription);
			attributeGetterFunctions.put(
				"amountQuantity", MiicSafeguardGoodAdd::getAmountQuantity);
			attributeGetterFunctions.put(
				"amountEstimate", MiicSafeguardGoodAdd::getAmountEstimate);
			attributeGetterFunctions.put(
				"resonForRequest", MiicSafeguardGoodAdd::getResonForRequest);
			attributeGetterFunctions.put(
				"counter", MiicSafeguardGoodAdd::getCounter);
			attributeGetterFunctions.put(
				"miicApplicationId",
				MiicSafeguardGoodAdd::getMiicApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<MiicSafeguardGoodAdd, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<MiicSafeguardGoodAdd, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<MiicSafeguardGoodAdd, ?>>();

			attributeSetterBiConsumers.put(
				"miicSafeguardGoodAddId",
				(BiConsumer<MiicSafeguardGoodAdd, Long>)
					MiicSafeguardGoodAdd::setMiicSafeguardGoodAddId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<MiicSafeguardGoodAdd, Long>)
					MiicSafeguardGoodAdd::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<MiicSafeguardGoodAdd, Long>)
					MiicSafeguardGoodAdd::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<MiicSafeguardGoodAdd, Long>)
					MiicSafeguardGoodAdd::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<MiicSafeguardGoodAdd, String>)
					MiicSafeguardGoodAdd::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<MiicSafeguardGoodAdd, Date>)
					MiicSafeguardGoodAdd::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<MiicSafeguardGoodAdd, Date>)
					MiicSafeguardGoodAdd::setModifiedDate);
			attributeSetterBiConsumers.put(
				"tariffHeadingNum",
				(BiConsumer<MiicSafeguardGoodAdd, String>)
					MiicSafeguardGoodAdd::setTariffHeadingNum);
			attributeSetterBiConsumers.put(
				"description",
				(BiConsumer<MiicSafeguardGoodAdd, String>)
					MiicSafeguardGoodAdd::setDescription);
			attributeSetterBiConsumers.put(
				"amountQuantity",
				(BiConsumer<MiicSafeguardGoodAdd, String>)
					MiicSafeguardGoodAdd::setAmountQuantity);
			attributeSetterBiConsumers.put(
				"amountEstimate",
				(BiConsumer<MiicSafeguardGoodAdd, String>)
					MiicSafeguardGoodAdd::setAmountEstimate);
			attributeSetterBiConsumers.put(
				"resonForRequest",
				(BiConsumer<MiicSafeguardGoodAdd, String>)
					MiicSafeguardGoodAdd::setResonForRequest);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<MiicSafeguardGoodAdd, String>)
					MiicSafeguardGoodAdd::setCounter);
			attributeSetterBiConsumers.put(
				"miicApplicationId",
				(BiConsumer<MiicSafeguardGoodAdd, Long>)
					MiicSafeguardGoodAdd::setMiicApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getMiicSafeguardGoodAddId() {
		return _miicSafeguardGoodAddId;
	}

	@Override
	public void setMiicSafeguardGoodAddId(long miicSafeguardGoodAddId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_miicSafeguardGoodAddId = miicSafeguardGoodAddId;
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
	public String getTariffHeadingNum() {
		if (_tariffHeadingNum == null) {
			return "";
		}
		else {
			return _tariffHeadingNum;
		}
	}

	@Override
	public void setTariffHeadingNum(String tariffHeadingNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tariffHeadingNum = tariffHeadingNum;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_description = description;
	}

	@JSON
	@Override
	public String getAmountQuantity() {
		if (_amountQuantity == null) {
			return "";
		}
		else {
			return _amountQuantity;
		}
	}

	@Override
	public void setAmountQuantity(String amountQuantity) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_amountQuantity = amountQuantity;
	}

	@JSON
	@Override
	public String getAmountEstimate() {
		if (_amountEstimate == null) {
			return "";
		}
		else {
			return _amountEstimate;
		}
	}

	@Override
	public void setAmountEstimate(String amountEstimate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_amountEstimate = amountEstimate;
	}

	@JSON
	@Override
	public String getResonForRequest() {
		if (_resonForRequest == null) {
			return "";
		}
		else {
			return _resonForRequest;
		}
	}

	@Override
	public void setResonForRequest(String resonForRequest) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_resonForRequest = resonForRequest;
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
	public long getMiicApplicationId() {
		return _miicApplicationId;
	}

	@Override
	public void setMiicApplicationId(long miicApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_miicApplicationId = miicApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalMiicApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("miicApplicationId"));
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
			getCompanyId(), MiicSafeguardGoodAdd.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MiicSafeguardGoodAdd toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, MiicSafeguardGoodAdd>
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
		MiicSafeguardGoodAddImpl miicSafeguardGoodAddImpl =
			new MiicSafeguardGoodAddImpl();

		miicSafeguardGoodAddImpl.setMiicSafeguardGoodAddId(
			getMiicSafeguardGoodAddId());
		miicSafeguardGoodAddImpl.setGroupId(getGroupId());
		miicSafeguardGoodAddImpl.setCompanyId(getCompanyId());
		miicSafeguardGoodAddImpl.setUserId(getUserId());
		miicSafeguardGoodAddImpl.setUserName(getUserName());
		miicSafeguardGoodAddImpl.setCreateDate(getCreateDate());
		miicSafeguardGoodAddImpl.setModifiedDate(getModifiedDate());
		miicSafeguardGoodAddImpl.setTariffHeadingNum(getTariffHeadingNum());
		miicSafeguardGoodAddImpl.setDescription(getDescription());
		miicSafeguardGoodAddImpl.setAmountQuantity(getAmountQuantity());
		miicSafeguardGoodAddImpl.setAmountEstimate(getAmountEstimate());
		miicSafeguardGoodAddImpl.setResonForRequest(getResonForRequest());
		miicSafeguardGoodAddImpl.setCounter(getCounter());
		miicSafeguardGoodAddImpl.setMiicApplicationId(getMiicApplicationId());

		miicSafeguardGoodAddImpl.resetOriginalValues();

		return miicSafeguardGoodAddImpl;
	}

	@Override
	public MiicSafeguardGoodAdd cloneWithOriginalValues() {
		MiicSafeguardGoodAddImpl miicSafeguardGoodAddImpl =
			new MiicSafeguardGoodAddImpl();

		miicSafeguardGoodAddImpl.setMiicSafeguardGoodAddId(
			this.<Long>getColumnOriginalValue("miicSafeguardGoodAddId"));
		miicSafeguardGoodAddImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		miicSafeguardGoodAddImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		miicSafeguardGoodAddImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		miicSafeguardGoodAddImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		miicSafeguardGoodAddImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		miicSafeguardGoodAddImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		miicSafeguardGoodAddImpl.setTariffHeadingNum(
			this.<String>getColumnOriginalValue("tariffHeadingNum"));
		miicSafeguardGoodAddImpl.setDescription(
			this.<String>getColumnOriginalValue("description"));
		miicSafeguardGoodAddImpl.setAmountQuantity(
			this.<String>getColumnOriginalValue("amountQuantity"));
		miicSafeguardGoodAddImpl.setAmountEstimate(
			this.<String>getColumnOriginalValue("amountEstimate"));
		miicSafeguardGoodAddImpl.setResonForRequest(
			this.<String>getColumnOriginalValue("resonForRequest"));
		miicSafeguardGoodAddImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		miicSafeguardGoodAddImpl.setMiicApplicationId(
			this.<Long>getColumnOriginalValue("miicApplicationId"));

		return miicSafeguardGoodAddImpl;
	}

	@Override
	public int compareTo(MiicSafeguardGoodAdd miicSafeguardGoodAdd) {
		long primaryKey = miicSafeguardGoodAdd.getPrimaryKey();

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

		if (!(object instanceof MiicSafeguardGoodAdd)) {
			return false;
		}

		MiicSafeguardGoodAdd miicSafeguardGoodAdd =
			(MiicSafeguardGoodAdd)object;

		long primaryKey = miicSafeguardGoodAdd.getPrimaryKey();

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
	public CacheModel<MiicSafeguardGoodAdd> toCacheModel() {
		MiicSafeguardGoodAddCacheModel miicSafeguardGoodAddCacheModel =
			new MiicSafeguardGoodAddCacheModel();

		miicSafeguardGoodAddCacheModel.miicSafeguardGoodAddId =
			getMiicSafeguardGoodAddId();

		miicSafeguardGoodAddCacheModel.groupId = getGroupId();

		miicSafeguardGoodAddCacheModel.companyId = getCompanyId();

		miicSafeguardGoodAddCacheModel.userId = getUserId();

		miicSafeguardGoodAddCacheModel.userName = getUserName();

		String userName = miicSafeguardGoodAddCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			miicSafeguardGoodAddCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			miicSafeguardGoodAddCacheModel.createDate = createDate.getTime();
		}
		else {
			miicSafeguardGoodAddCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			miicSafeguardGoodAddCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			miicSafeguardGoodAddCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		miicSafeguardGoodAddCacheModel.tariffHeadingNum = getTariffHeadingNum();

		String tariffHeadingNum =
			miicSafeguardGoodAddCacheModel.tariffHeadingNum;

		if ((tariffHeadingNum != null) && (tariffHeadingNum.length() == 0)) {
			miicSafeguardGoodAddCacheModel.tariffHeadingNum = null;
		}

		miicSafeguardGoodAddCacheModel.description = getDescription();

		String description = miicSafeguardGoodAddCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			miicSafeguardGoodAddCacheModel.description = null;
		}

		miicSafeguardGoodAddCacheModel.amountQuantity = getAmountQuantity();

		String amountQuantity = miicSafeguardGoodAddCacheModel.amountQuantity;

		if ((amountQuantity != null) && (amountQuantity.length() == 0)) {
			miicSafeguardGoodAddCacheModel.amountQuantity = null;
		}

		miicSafeguardGoodAddCacheModel.amountEstimate = getAmountEstimate();

		String amountEstimate = miicSafeguardGoodAddCacheModel.amountEstimate;

		if ((amountEstimate != null) && (amountEstimate.length() == 0)) {
			miicSafeguardGoodAddCacheModel.amountEstimate = null;
		}

		miicSafeguardGoodAddCacheModel.resonForRequest = getResonForRequest();

		String resonForRequest = miicSafeguardGoodAddCacheModel.resonForRequest;

		if ((resonForRequest != null) && (resonForRequest.length() == 0)) {
			miicSafeguardGoodAddCacheModel.resonForRequest = null;
		}

		miicSafeguardGoodAddCacheModel.counter = getCounter();

		String counter = miicSafeguardGoodAddCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			miicSafeguardGoodAddCacheModel.counter = null;
		}

		miicSafeguardGoodAddCacheModel.miicApplicationId =
			getMiicApplicationId();

		return miicSafeguardGoodAddCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<MiicSafeguardGoodAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<MiicSafeguardGoodAdd, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MiicSafeguardGoodAdd, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(MiicSafeguardGoodAdd)this);

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

		private static final Function<InvocationHandler, MiicSafeguardGoodAdd>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					MiicSafeguardGoodAdd.class, ModelWrapper.class);

	}

	private long _miicSafeguardGoodAddId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _tariffHeadingNum;
	private String _description;
	private String _amountQuantity;
	private String _amountEstimate;
	private String _resonForRequest;
	private String _counter;
	private long _miicApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<MiicSafeguardGoodAdd, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((MiicSafeguardGoodAdd)this);
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
			"miicSafeguardGoodAddId", _miicSafeguardGoodAddId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("tariffHeadingNum", _tariffHeadingNum);
		_columnOriginalValues.put("description", _description);
		_columnOriginalValues.put("amountQuantity", _amountQuantity);
		_columnOriginalValues.put("amountEstimate", _amountEstimate);
		_columnOriginalValues.put("resonForRequest", _resonForRequest);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put("miicApplicationId", _miicApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("miicSafeguardGoodAddId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("tariffHeadingNum", 128L);

		columnBitmasks.put("description", 256L);

		columnBitmasks.put("amountQuantity", 512L);

		columnBitmasks.put("amountEstimate", 1024L);

		columnBitmasks.put("resonForRequest", 2048L);

		columnBitmasks.put("counter", 4096L);

		columnBitmasks.put("miicApplicationId", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private MiicSafeguardGoodAdd _escapedModel;

}