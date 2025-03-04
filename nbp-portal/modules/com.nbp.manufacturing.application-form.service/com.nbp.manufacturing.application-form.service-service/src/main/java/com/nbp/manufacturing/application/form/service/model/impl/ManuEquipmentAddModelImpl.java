/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model.impl;

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

import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd;
import com.nbp.manufacturing.application.form.service.model.ManuEquipmentAddModel;

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
 * The base model implementation for the ManuEquipmentAdd service. Represents a row in the &quot;nbp_manu_equipment_Add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ManuEquipmentAddModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ManuEquipmentAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentAddImpl
 * @generated
 */
@JSON(strict = true)
public class ManuEquipmentAddModelImpl
	extends BaseModelImpl<ManuEquipmentAdd> implements ManuEquipmentAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a manu equipment add model instance should use the <code>ManuEquipmentAdd</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_manu_equipment_Add";

	public static final Object[][] TABLE_COLUMNS = {
		{"manuEquipmentAddId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"equipmentName", Types.VARCHAR},
		{"jamaicanDollor", Types.VARCHAR}, {"counter", Types.VARCHAR},
		{"manufacturingApplicationId", Types.BIGINT},
		{"manuEquipmentId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("manuEquipmentAddId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("equipmentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jamaicanDollor", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("manufacturingApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("manuEquipmentId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_manu_equipment_Add (manuEquipmentAddId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,equipmentName VARCHAR(500) null,jamaicanDollor VARCHAR(75) null,counter VARCHAR(75) null,manufacturingApplicationId LONG,manuEquipmentId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_manu_equipment_Add";

	public static final String ORDER_BY_JPQL =
		" ORDER BY manuEquipmentAdd.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_manu_equipment_Add.createDate ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long MANUEQUIPMENTID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long MANUFACTURINGAPPLICATIONID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 4L;

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

	public ManuEquipmentAddModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _manuEquipmentAddId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setManuEquipmentAddId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _manuEquipmentAddId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ManuEquipmentAdd.class;
	}

	@Override
	public String getModelClassName() {
		return ManuEquipmentAdd.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<ManuEquipmentAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<ManuEquipmentAdd, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ManuEquipmentAdd, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((ManuEquipmentAdd)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<ManuEquipmentAdd, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<ManuEquipmentAdd, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(ManuEquipmentAdd)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<ManuEquipmentAdd, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<ManuEquipmentAdd, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<ManuEquipmentAdd, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<ManuEquipmentAdd, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<ManuEquipmentAdd, Object>>();

			attributeGetterFunctions.put(
				"manuEquipmentAddId", ManuEquipmentAdd::getManuEquipmentAddId);
			attributeGetterFunctions.put(
				"groupId", ManuEquipmentAdd::getGroupId);
			attributeGetterFunctions.put(
				"companyId", ManuEquipmentAdd::getCompanyId);
			attributeGetterFunctions.put("userId", ManuEquipmentAdd::getUserId);
			attributeGetterFunctions.put(
				"userName", ManuEquipmentAdd::getUserName);
			attributeGetterFunctions.put(
				"createDate", ManuEquipmentAdd::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", ManuEquipmentAdd::getModifiedDate);
			attributeGetterFunctions.put(
				"equipmentName", ManuEquipmentAdd::getEquipmentName);
			attributeGetterFunctions.put(
				"jamaicanDollor", ManuEquipmentAdd::getJamaicanDollor);
			attributeGetterFunctions.put(
				"counter", ManuEquipmentAdd::getCounter);
			attributeGetterFunctions.put(
				"manufacturingApplicationId",
				ManuEquipmentAdd::getManufacturingApplicationId);
			attributeGetterFunctions.put(
				"manuEquipmentId", ManuEquipmentAdd::getManuEquipmentId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<ManuEquipmentAdd, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<ManuEquipmentAdd, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<ManuEquipmentAdd, ?>>();

			attributeSetterBiConsumers.put(
				"manuEquipmentAddId",
				(BiConsumer<ManuEquipmentAdd, Long>)
					ManuEquipmentAdd::setManuEquipmentAddId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<ManuEquipmentAdd, Long>)
					ManuEquipmentAdd::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<ManuEquipmentAdd, Long>)
					ManuEquipmentAdd::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<ManuEquipmentAdd, Long>)
					ManuEquipmentAdd::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<ManuEquipmentAdd, String>)
					ManuEquipmentAdd::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<ManuEquipmentAdd, Date>)
					ManuEquipmentAdd::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<ManuEquipmentAdd, Date>)
					ManuEquipmentAdd::setModifiedDate);
			attributeSetterBiConsumers.put(
				"equipmentName",
				(BiConsumer<ManuEquipmentAdd, String>)
					ManuEquipmentAdd::setEquipmentName);
			attributeSetterBiConsumers.put(
				"jamaicanDollor",
				(BiConsumer<ManuEquipmentAdd, String>)
					ManuEquipmentAdd::setJamaicanDollor);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<ManuEquipmentAdd, String>)
					ManuEquipmentAdd::setCounter);
			attributeSetterBiConsumers.put(
				"manufacturingApplicationId",
				(BiConsumer<ManuEquipmentAdd, Long>)
					ManuEquipmentAdd::setManufacturingApplicationId);
			attributeSetterBiConsumers.put(
				"manuEquipmentId",
				(BiConsumer<ManuEquipmentAdd, Long>)
					ManuEquipmentAdd::setManuEquipmentId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getManuEquipmentAddId() {
		return _manuEquipmentAddId;
	}

	@Override
	public void setManuEquipmentAddId(long manuEquipmentAddId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_manuEquipmentAddId = manuEquipmentAddId;
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
	public String getEquipmentName() {
		if (_equipmentName == null) {
			return "";
		}
		else {
			return _equipmentName;
		}
	}

	@Override
	public void setEquipmentName(String equipmentName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_equipmentName = equipmentName;
	}

	@JSON
	@Override
	public String getJamaicanDollor() {
		if (_jamaicanDollor == null) {
			return "";
		}
		else {
			return _jamaicanDollor;
		}
	}

	@Override
	public void setJamaicanDollor(String jamaicanDollor) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jamaicanDollor = jamaicanDollor;
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
	public long getManufacturingApplicationId() {
		return _manufacturingApplicationId;
	}

	@Override
	public void setManufacturingApplicationId(long manufacturingApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_manufacturingApplicationId = manufacturingApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalManufacturingApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("manufacturingApplicationId"));
	}

	@JSON
	@Override
	public long getManuEquipmentId() {
		return _manuEquipmentId;
	}

	@Override
	public void setManuEquipmentId(long manuEquipmentId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_manuEquipmentId = manuEquipmentId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalManuEquipmentId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("manuEquipmentId"));
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
			getCompanyId(), ManuEquipmentAdd.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ManuEquipmentAdd toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, ManuEquipmentAdd>
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
		ManuEquipmentAddImpl manuEquipmentAddImpl = new ManuEquipmentAddImpl();

		manuEquipmentAddImpl.setManuEquipmentAddId(getManuEquipmentAddId());
		manuEquipmentAddImpl.setGroupId(getGroupId());
		manuEquipmentAddImpl.setCompanyId(getCompanyId());
		manuEquipmentAddImpl.setUserId(getUserId());
		manuEquipmentAddImpl.setUserName(getUserName());
		manuEquipmentAddImpl.setCreateDate(getCreateDate());
		manuEquipmentAddImpl.setModifiedDate(getModifiedDate());
		manuEquipmentAddImpl.setEquipmentName(getEquipmentName());
		manuEquipmentAddImpl.setJamaicanDollor(getJamaicanDollor());
		manuEquipmentAddImpl.setCounter(getCounter());
		manuEquipmentAddImpl.setManufacturingApplicationId(
			getManufacturingApplicationId());
		manuEquipmentAddImpl.setManuEquipmentId(getManuEquipmentId());

		manuEquipmentAddImpl.resetOriginalValues();

		return manuEquipmentAddImpl;
	}

	@Override
	public ManuEquipmentAdd cloneWithOriginalValues() {
		ManuEquipmentAddImpl manuEquipmentAddImpl = new ManuEquipmentAddImpl();

		manuEquipmentAddImpl.setManuEquipmentAddId(
			this.<Long>getColumnOriginalValue("manuEquipmentAddId"));
		manuEquipmentAddImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		manuEquipmentAddImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		manuEquipmentAddImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		manuEquipmentAddImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		manuEquipmentAddImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		manuEquipmentAddImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		manuEquipmentAddImpl.setEquipmentName(
			this.<String>getColumnOriginalValue("equipmentName"));
		manuEquipmentAddImpl.setJamaicanDollor(
			this.<String>getColumnOriginalValue("jamaicanDollor"));
		manuEquipmentAddImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		manuEquipmentAddImpl.setManufacturingApplicationId(
			this.<Long>getColumnOriginalValue("manufacturingApplicationId"));
		manuEquipmentAddImpl.setManuEquipmentId(
			this.<Long>getColumnOriginalValue("manuEquipmentId"));

		return manuEquipmentAddImpl;
	}

	@Override
	public int compareTo(ManuEquipmentAdd manuEquipmentAdd) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), manuEquipmentAdd.getCreateDate());

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

		if (!(object instanceof ManuEquipmentAdd)) {
			return false;
		}

		ManuEquipmentAdd manuEquipmentAdd = (ManuEquipmentAdd)object;

		long primaryKey = manuEquipmentAdd.getPrimaryKey();

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
	public CacheModel<ManuEquipmentAdd> toCacheModel() {
		ManuEquipmentAddCacheModel manuEquipmentAddCacheModel =
			new ManuEquipmentAddCacheModel();

		manuEquipmentAddCacheModel.manuEquipmentAddId = getManuEquipmentAddId();

		manuEquipmentAddCacheModel.groupId = getGroupId();

		manuEquipmentAddCacheModel.companyId = getCompanyId();

		manuEquipmentAddCacheModel.userId = getUserId();

		manuEquipmentAddCacheModel.userName = getUserName();

		String userName = manuEquipmentAddCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			manuEquipmentAddCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			manuEquipmentAddCacheModel.createDate = createDate.getTime();
		}
		else {
			manuEquipmentAddCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			manuEquipmentAddCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			manuEquipmentAddCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		manuEquipmentAddCacheModel.equipmentName = getEquipmentName();

		String equipmentName = manuEquipmentAddCacheModel.equipmentName;

		if ((equipmentName != null) && (equipmentName.length() == 0)) {
			manuEquipmentAddCacheModel.equipmentName = null;
		}

		manuEquipmentAddCacheModel.jamaicanDollor = getJamaicanDollor();

		String jamaicanDollor = manuEquipmentAddCacheModel.jamaicanDollor;

		if ((jamaicanDollor != null) && (jamaicanDollor.length() == 0)) {
			manuEquipmentAddCacheModel.jamaicanDollor = null;
		}

		manuEquipmentAddCacheModel.counter = getCounter();

		String counter = manuEquipmentAddCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			manuEquipmentAddCacheModel.counter = null;
		}

		manuEquipmentAddCacheModel.manufacturingApplicationId =
			getManufacturingApplicationId();

		manuEquipmentAddCacheModel.manuEquipmentId = getManuEquipmentId();

		return manuEquipmentAddCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<ManuEquipmentAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<ManuEquipmentAdd, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ManuEquipmentAdd, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(ManuEquipmentAdd)this);

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

		private static final Function<InvocationHandler, ManuEquipmentAdd>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					ManuEquipmentAdd.class, ModelWrapper.class);

	}

	private long _manuEquipmentAddId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _equipmentName;
	private String _jamaicanDollor;
	private String _counter;
	private long _manufacturingApplicationId;
	private long _manuEquipmentId;

	public <T> T getColumnValue(String columnName) {
		Function<ManuEquipmentAdd, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((ManuEquipmentAdd)this);
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

		_columnOriginalValues.put("manuEquipmentAddId", _manuEquipmentAddId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("equipmentName", _equipmentName);
		_columnOriginalValues.put("jamaicanDollor", _jamaicanDollor);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put(
			"manufacturingApplicationId", _manufacturingApplicationId);
		_columnOriginalValues.put("manuEquipmentId", _manuEquipmentId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("manuEquipmentAddId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("equipmentName", 128L);

		columnBitmasks.put("jamaicanDollor", 256L);

		columnBitmasks.put("counter", 512L);

		columnBitmasks.put("manufacturingApplicationId", 1024L);

		columnBitmasks.put("manuEquipmentId", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private ManuEquipmentAdd _escapedModel;

}