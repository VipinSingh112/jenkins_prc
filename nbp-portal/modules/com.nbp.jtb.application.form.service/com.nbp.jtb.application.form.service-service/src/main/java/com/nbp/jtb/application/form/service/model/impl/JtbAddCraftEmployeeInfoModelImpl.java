/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

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

import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo;
import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfoModel;

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
 * The base model implementation for the JtbAddCraftEmployeeInfo service. Represents a row in the &quot;nbp_jtb_craft_employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>JtbAddCraftEmployeeInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JtbAddCraftEmployeeInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftEmployeeInfoImpl
 * @generated
 */
@JSON(strict = true)
public class JtbAddCraftEmployeeInfoModelImpl
	extends BaseModelImpl<JtbAddCraftEmployeeInfo>
	implements JtbAddCraftEmployeeInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jtb add craft employee info model instance should use the <code>JtbAddCraftEmployeeInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_jtb_craft_employee";

	public static final Object[][] TABLE_COLUMNS = {
		{"jtbAddCraftEmployeeInfoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"counter", Types.VARCHAR},
		{"empName", Types.VARCHAR}, {"empAddress", Types.VARCHAR},
		{"empPhoneNo", Types.VARCHAR}, {"jtbApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("jtbAddCraftEmployeeInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("empName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("empAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("empPhoneNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jtbApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_jtb_craft_employee (jtbAddCraftEmployeeInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,counter VARCHAR(75) null,empName VARCHAR(75) null,empAddress VARCHAR(75) null,empPhoneNo VARCHAR(75) null,jtbApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_jtb_craft_employee";

	public static final String ORDER_BY_JPQL =
		" ORDER BY jtbAddCraftEmployeeInfo.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_jtb_craft_employee.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long JTBAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public JtbAddCraftEmployeeInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jtbAddCraftEmployeeInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJtbAddCraftEmployeeInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jtbAddCraftEmployeeInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return JtbAddCraftEmployeeInfo.class;
	}

	@Override
	public String getModelClassName() {
		return JtbAddCraftEmployeeInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<JtbAddCraftEmployeeInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<JtbAddCraftEmployeeInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<JtbAddCraftEmployeeInfo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((JtbAddCraftEmployeeInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<JtbAddCraftEmployeeInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<JtbAddCraftEmployeeInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(JtbAddCraftEmployeeInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<JtbAddCraftEmployeeInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<JtbAddCraftEmployeeInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<JtbAddCraftEmployeeInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<JtbAddCraftEmployeeInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<JtbAddCraftEmployeeInfo, Object>>();

			attributeGetterFunctions.put(
				"jtbAddCraftEmployeeInfoId",
				JtbAddCraftEmployeeInfo::getJtbAddCraftEmployeeInfoId);
			attributeGetterFunctions.put(
				"groupId", JtbAddCraftEmployeeInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", JtbAddCraftEmployeeInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", JtbAddCraftEmployeeInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", JtbAddCraftEmployeeInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", JtbAddCraftEmployeeInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", JtbAddCraftEmployeeInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"counter", JtbAddCraftEmployeeInfo::getCounter);
			attributeGetterFunctions.put(
				"empName", JtbAddCraftEmployeeInfo::getEmpName);
			attributeGetterFunctions.put(
				"empAddress", JtbAddCraftEmployeeInfo::getEmpAddress);
			attributeGetterFunctions.put(
				"empPhoneNo", JtbAddCraftEmployeeInfo::getEmpPhoneNo);
			attributeGetterFunctions.put(
				"jtbApplicationId",
				JtbAddCraftEmployeeInfo::getJtbApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<JtbAddCraftEmployeeInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<JtbAddCraftEmployeeInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<JtbAddCraftEmployeeInfo, ?>>();

			attributeSetterBiConsumers.put(
				"jtbAddCraftEmployeeInfoId",
				(BiConsumer<JtbAddCraftEmployeeInfo, Long>)
					JtbAddCraftEmployeeInfo::setJtbAddCraftEmployeeInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<JtbAddCraftEmployeeInfo, Long>)
					JtbAddCraftEmployeeInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<JtbAddCraftEmployeeInfo, Long>)
					JtbAddCraftEmployeeInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<JtbAddCraftEmployeeInfo, Long>)
					JtbAddCraftEmployeeInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<JtbAddCraftEmployeeInfo, String>)
					JtbAddCraftEmployeeInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<JtbAddCraftEmployeeInfo, Date>)
					JtbAddCraftEmployeeInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<JtbAddCraftEmployeeInfo, Date>)
					JtbAddCraftEmployeeInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<JtbAddCraftEmployeeInfo, String>)
					JtbAddCraftEmployeeInfo::setCounter);
			attributeSetterBiConsumers.put(
				"empName",
				(BiConsumer<JtbAddCraftEmployeeInfo, String>)
					JtbAddCraftEmployeeInfo::setEmpName);
			attributeSetterBiConsumers.put(
				"empAddress",
				(BiConsumer<JtbAddCraftEmployeeInfo, String>)
					JtbAddCraftEmployeeInfo::setEmpAddress);
			attributeSetterBiConsumers.put(
				"empPhoneNo",
				(BiConsumer<JtbAddCraftEmployeeInfo, String>)
					JtbAddCraftEmployeeInfo::setEmpPhoneNo);
			attributeSetterBiConsumers.put(
				"jtbApplicationId",
				(BiConsumer<JtbAddCraftEmployeeInfo, Long>)
					JtbAddCraftEmployeeInfo::setJtbApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getJtbAddCraftEmployeeInfoId() {
		return _jtbAddCraftEmployeeInfoId;
	}

	@Override
	public void setJtbAddCraftEmployeeInfoId(long jtbAddCraftEmployeeInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jtbAddCraftEmployeeInfoId = jtbAddCraftEmployeeInfoId;
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
	public String getEmpName() {
		if (_empName == null) {
			return "";
		}
		else {
			return _empName;
		}
	}

	@Override
	public void setEmpName(String empName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_empName = empName;
	}

	@JSON
	@Override
	public String getEmpAddress() {
		if (_empAddress == null) {
			return "";
		}
		else {
			return _empAddress;
		}
	}

	@Override
	public void setEmpAddress(String empAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_empAddress = empAddress;
	}

	@JSON
	@Override
	public String getEmpPhoneNo() {
		if (_empPhoneNo == null) {
			return "";
		}
		else {
			return _empPhoneNo;
		}
	}

	@Override
	public void setEmpPhoneNo(String empPhoneNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_empPhoneNo = empPhoneNo;
	}

	@JSON
	@Override
	public long getJtbApplicationId() {
		return _jtbApplicationId;
	}

	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jtbApplicationId = jtbApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalJtbApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("jtbApplicationId"));
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
			getCompanyId(), JtbAddCraftEmployeeInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public JtbAddCraftEmployeeInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, JtbAddCraftEmployeeInfo>
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
		JtbAddCraftEmployeeInfoImpl jtbAddCraftEmployeeInfoImpl =
			new JtbAddCraftEmployeeInfoImpl();

		jtbAddCraftEmployeeInfoImpl.setJtbAddCraftEmployeeInfoId(
			getJtbAddCraftEmployeeInfoId());
		jtbAddCraftEmployeeInfoImpl.setGroupId(getGroupId());
		jtbAddCraftEmployeeInfoImpl.setCompanyId(getCompanyId());
		jtbAddCraftEmployeeInfoImpl.setUserId(getUserId());
		jtbAddCraftEmployeeInfoImpl.setUserName(getUserName());
		jtbAddCraftEmployeeInfoImpl.setCreateDate(getCreateDate());
		jtbAddCraftEmployeeInfoImpl.setModifiedDate(getModifiedDate());
		jtbAddCraftEmployeeInfoImpl.setCounter(getCounter());
		jtbAddCraftEmployeeInfoImpl.setEmpName(getEmpName());
		jtbAddCraftEmployeeInfoImpl.setEmpAddress(getEmpAddress());
		jtbAddCraftEmployeeInfoImpl.setEmpPhoneNo(getEmpPhoneNo());
		jtbAddCraftEmployeeInfoImpl.setJtbApplicationId(getJtbApplicationId());

		jtbAddCraftEmployeeInfoImpl.resetOriginalValues();

		return jtbAddCraftEmployeeInfoImpl;
	}

	@Override
	public JtbAddCraftEmployeeInfo cloneWithOriginalValues() {
		JtbAddCraftEmployeeInfoImpl jtbAddCraftEmployeeInfoImpl =
			new JtbAddCraftEmployeeInfoImpl();

		jtbAddCraftEmployeeInfoImpl.setJtbAddCraftEmployeeInfoId(
			this.<Long>getColumnOriginalValue("jtbAddCraftEmployeeInfoId"));
		jtbAddCraftEmployeeInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		jtbAddCraftEmployeeInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		jtbAddCraftEmployeeInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		jtbAddCraftEmployeeInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		jtbAddCraftEmployeeInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		jtbAddCraftEmployeeInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		jtbAddCraftEmployeeInfoImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		jtbAddCraftEmployeeInfoImpl.setEmpName(
			this.<String>getColumnOriginalValue("empName"));
		jtbAddCraftEmployeeInfoImpl.setEmpAddress(
			this.<String>getColumnOriginalValue("empAddress"));
		jtbAddCraftEmployeeInfoImpl.setEmpPhoneNo(
			this.<String>getColumnOriginalValue("empPhoneNo"));
		jtbAddCraftEmployeeInfoImpl.setJtbApplicationId(
			this.<Long>getColumnOriginalValue("jtbApplicationId"));

		return jtbAddCraftEmployeeInfoImpl;
	}

	@Override
	public int compareTo(JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), jtbAddCraftEmployeeInfo.getCreateDate());

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

		if (!(object instanceof JtbAddCraftEmployeeInfo)) {
			return false;
		}

		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo =
			(JtbAddCraftEmployeeInfo)object;

		long primaryKey = jtbAddCraftEmployeeInfo.getPrimaryKey();

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
	public CacheModel<JtbAddCraftEmployeeInfo> toCacheModel() {
		JtbAddCraftEmployeeInfoCacheModel jtbAddCraftEmployeeInfoCacheModel =
			new JtbAddCraftEmployeeInfoCacheModel();

		jtbAddCraftEmployeeInfoCacheModel.jtbAddCraftEmployeeInfoId =
			getJtbAddCraftEmployeeInfoId();

		jtbAddCraftEmployeeInfoCacheModel.groupId = getGroupId();

		jtbAddCraftEmployeeInfoCacheModel.companyId = getCompanyId();

		jtbAddCraftEmployeeInfoCacheModel.userId = getUserId();

		jtbAddCraftEmployeeInfoCacheModel.userName = getUserName();

		String userName = jtbAddCraftEmployeeInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			jtbAddCraftEmployeeInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			jtbAddCraftEmployeeInfoCacheModel.createDate = createDate.getTime();
		}
		else {
			jtbAddCraftEmployeeInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			jtbAddCraftEmployeeInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			jtbAddCraftEmployeeInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		jtbAddCraftEmployeeInfoCacheModel.counter = getCounter();

		String counter = jtbAddCraftEmployeeInfoCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			jtbAddCraftEmployeeInfoCacheModel.counter = null;
		}

		jtbAddCraftEmployeeInfoCacheModel.empName = getEmpName();

		String empName = jtbAddCraftEmployeeInfoCacheModel.empName;

		if ((empName != null) && (empName.length() == 0)) {
			jtbAddCraftEmployeeInfoCacheModel.empName = null;
		}

		jtbAddCraftEmployeeInfoCacheModel.empAddress = getEmpAddress();

		String empAddress = jtbAddCraftEmployeeInfoCacheModel.empAddress;

		if ((empAddress != null) && (empAddress.length() == 0)) {
			jtbAddCraftEmployeeInfoCacheModel.empAddress = null;
		}

		jtbAddCraftEmployeeInfoCacheModel.empPhoneNo = getEmpPhoneNo();

		String empPhoneNo = jtbAddCraftEmployeeInfoCacheModel.empPhoneNo;

		if ((empPhoneNo != null) && (empPhoneNo.length() == 0)) {
			jtbAddCraftEmployeeInfoCacheModel.empPhoneNo = null;
		}

		jtbAddCraftEmployeeInfoCacheModel.jtbApplicationId =
			getJtbApplicationId();

		return jtbAddCraftEmployeeInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<JtbAddCraftEmployeeInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<JtbAddCraftEmployeeInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<JtbAddCraftEmployeeInfo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(JtbAddCraftEmployeeInfo)this);

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
			<InvocationHandler, JtbAddCraftEmployeeInfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						JtbAddCraftEmployeeInfo.class, ModelWrapper.class);

	}

	private long _jtbAddCraftEmployeeInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _counter;
	private String _empName;
	private String _empAddress;
	private String _empPhoneNo;
	private long _jtbApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<JtbAddCraftEmployeeInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((JtbAddCraftEmployeeInfo)this);
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
			"jtbAddCraftEmployeeInfoId", _jtbAddCraftEmployeeInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put("empName", _empName);
		_columnOriginalValues.put("empAddress", _empAddress);
		_columnOriginalValues.put("empPhoneNo", _empPhoneNo);
		_columnOriginalValues.put("jtbApplicationId", _jtbApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("jtbAddCraftEmployeeInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("counter", 128L);

		columnBitmasks.put("empName", 256L);

		columnBitmasks.put("empAddress", 512L);

		columnBitmasks.put("empPhoneNo", 1024L);

		columnBitmasks.put("jtbApplicationId", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private JtbAddCraftEmployeeInfo _escapedModel;

}