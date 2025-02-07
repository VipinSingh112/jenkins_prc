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

import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo;
import com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfoModel;

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
 * The base model implementation for the JtbAddBranchDetailInfo service. Represents a row in the &quot;nbp_jtb_branch_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>JtbAddBranchDetailInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JtbAddBranchDetailInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddBranchDetailInfoImpl
 * @generated
 */
@JSON(strict = true)
public class JtbAddBranchDetailInfoModelImpl
	extends BaseModelImpl<JtbAddBranchDetailInfo>
	implements JtbAddBranchDetailInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jtb add branch detail info model instance should use the <code>JtbAddBranchDetailInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_jtb_branch_detail";

	public static final Object[][] TABLE_COLUMNS = {
		{"jtbBranchDetailInfoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"counter", Types.VARCHAR},
		{"branchOfficeDetails", Types.VARCHAR},
		{"branchOfficeLocation", Types.VARCHAR},
		{"jtbApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("jtbBranchDetailInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("branchOfficeDetails", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("branchOfficeLocation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jtbApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_jtb_branch_detail (jtbBranchDetailInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,counter VARCHAR(75) null,branchOfficeDetails VARCHAR(75) null,branchOfficeLocation VARCHAR(75) null,jtbApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_jtb_branch_detail";

	public static final String ORDER_BY_JPQL =
		" ORDER BY jtbAddBranchDetailInfo.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_jtb_branch_detail.createDate DESC";

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

	public JtbAddBranchDetailInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jtbBranchDetailInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJtbBranchDetailInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jtbBranchDetailInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return JtbAddBranchDetailInfo.class;
	}

	@Override
	public String getModelClassName() {
		return JtbAddBranchDetailInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<JtbAddBranchDetailInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<JtbAddBranchDetailInfo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<JtbAddBranchDetailInfo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((JtbAddBranchDetailInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<JtbAddBranchDetailInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<JtbAddBranchDetailInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(JtbAddBranchDetailInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<JtbAddBranchDetailInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<JtbAddBranchDetailInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<JtbAddBranchDetailInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<JtbAddBranchDetailInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<JtbAddBranchDetailInfo, Object>>();

			attributeGetterFunctions.put(
				"jtbBranchDetailInfoId",
				JtbAddBranchDetailInfo::getJtbBranchDetailInfoId);
			attributeGetterFunctions.put(
				"groupId", JtbAddBranchDetailInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", JtbAddBranchDetailInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", JtbAddBranchDetailInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", JtbAddBranchDetailInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", JtbAddBranchDetailInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", JtbAddBranchDetailInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"counter", JtbAddBranchDetailInfo::getCounter);
			attributeGetterFunctions.put(
				"branchOfficeDetails",
				JtbAddBranchDetailInfo::getBranchOfficeDetails);
			attributeGetterFunctions.put(
				"branchOfficeLocation",
				JtbAddBranchDetailInfo::getBranchOfficeLocation);
			attributeGetterFunctions.put(
				"jtbApplicationId",
				JtbAddBranchDetailInfo::getJtbApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<JtbAddBranchDetailInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<JtbAddBranchDetailInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<JtbAddBranchDetailInfo, ?>>();

			attributeSetterBiConsumers.put(
				"jtbBranchDetailInfoId",
				(BiConsumer<JtbAddBranchDetailInfo, Long>)
					JtbAddBranchDetailInfo::setJtbBranchDetailInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<JtbAddBranchDetailInfo, Long>)
					JtbAddBranchDetailInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<JtbAddBranchDetailInfo, Long>)
					JtbAddBranchDetailInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<JtbAddBranchDetailInfo, Long>)
					JtbAddBranchDetailInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<JtbAddBranchDetailInfo, String>)
					JtbAddBranchDetailInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<JtbAddBranchDetailInfo, Date>)
					JtbAddBranchDetailInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<JtbAddBranchDetailInfo, Date>)
					JtbAddBranchDetailInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<JtbAddBranchDetailInfo, String>)
					JtbAddBranchDetailInfo::setCounter);
			attributeSetterBiConsumers.put(
				"branchOfficeDetails",
				(BiConsumer<JtbAddBranchDetailInfo, String>)
					JtbAddBranchDetailInfo::setBranchOfficeDetails);
			attributeSetterBiConsumers.put(
				"branchOfficeLocation",
				(BiConsumer<JtbAddBranchDetailInfo, String>)
					JtbAddBranchDetailInfo::setBranchOfficeLocation);
			attributeSetterBiConsumers.put(
				"jtbApplicationId",
				(BiConsumer<JtbAddBranchDetailInfo, Long>)
					JtbAddBranchDetailInfo::setJtbApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getJtbBranchDetailInfoId() {
		return _jtbBranchDetailInfoId;
	}

	@Override
	public void setJtbBranchDetailInfoId(long jtbBranchDetailInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jtbBranchDetailInfoId = jtbBranchDetailInfoId;
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
	public String getBranchOfficeDetails() {
		if (_branchOfficeDetails == null) {
			return "";
		}
		else {
			return _branchOfficeDetails;
		}
	}

	@Override
	public void setBranchOfficeDetails(String branchOfficeDetails) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_branchOfficeDetails = branchOfficeDetails;
	}

	@JSON
	@Override
	public String getBranchOfficeLocation() {
		if (_branchOfficeLocation == null) {
			return "";
		}
		else {
			return _branchOfficeLocation;
		}
	}

	@Override
	public void setBranchOfficeLocation(String branchOfficeLocation) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_branchOfficeLocation = branchOfficeLocation;
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
			getCompanyId(), JtbAddBranchDetailInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public JtbAddBranchDetailInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, JtbAddBranchDetailInfo>
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
		JtbAddBranchDetailInfoImpl jtbAddBranchDetailInfoImpl =
			new JtbAddBranchDetailInfoImpl();

		jtbAddBranchDetailInfoImpl.setJtbBranchDetailInfoId(
			getJtbBranchDetailInfoId());
		jtbAddBranchDetailInfoImpl.setGroupId(getGroupId());
		jtbAddBranchDetailInfoImpl.setCompanyId(getCompanyId());
		jtbAddBranchDetailInfoImpl.setUserId(getUserId());
		jtbAddBranchDetailInfoImpl.setUserName(getUserName());
		jtbAddBranchDetailInfoImpl.setCreateDate(getCreateDate());
		jtbAddBranchDetailInfoImpl.setModifiedDate(getModifiedDate());
		jtbAddBranchDetailInfoImpl.setCounter(getCounter());
		jtbAddBranchDetailInfoImpl.setBranchOfficeDetails(
			getBranchOfficeDetails());
		jtbAddBranchDetailInfoImpl.setBranchOfficeLocation(
			getBranchOfficeLocation());
		jtbAddBranchDetailInfoImpl.setJtbApplicationId(getJtbApplicationId());

		jtbAddBranchDetailInfoImpl.resetOriginalValues();

		return jtbAddBranchDetailInfoImpl;
	}

	@Override
	public JtbAddBranchDetailInfo cloneWithOriginalValues() {
		JtbAddBranchDetailInfoImpl jtbAddBranchDetailInfoImpl =
			new JtbAddBranchDetailInfoImpl();

		jtbAddBranchDetailInfoImpl.setJtbBranchDetailInfoId(
			this.<Long>getColumnOriginalValue("jtbBranchDetailInfoId"));
		jtbAddBranchDetailInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		jtbAddBranchDetailInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		jtbAddBranchDetailInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		jtbAddBranchDetailInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		jtbAddBranchDetailInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		jtbAddBranchDetailInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		jtbAddBranchDetailInfoImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		jtbAddBranchDetailInfoImpl.setBranchOfficeDetails(
			this.<String>getColumnOriginalValue("branchOfficeDetails"));
		jtbAddBranchDetailInfoImpl.setBranchOfficeLocation(
			this.<String>getColumnOriginalValue("branchOfficeLocation"));
		jtbAddBranchDetailInfoImpl.setJtbApplicationId(
			this.<Long>getColumnOriginalValue("jtbApplicationId"));

		return jtbAddBranchDetailInfoImpl;
	}

	@Override
	public int compareTo(JtbAddBranchDetailInfo jtbAddBranchDetailInfo) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), jtbAddBranchDetailInfo.getCreateDate());

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

		if (!(object instanceof JtbAddBranchDetailInfo)) {
			return false;
		}

		JtbAddBranchDetailInfo jtbAddBranchDetailInfo =
			(JtbAddBranchDetailInfo)object;

		long primaryKey = jtbAddBranchDetailInfo.getPrimaryKey();

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
	public CacheModel<JtbAddBranchDetailInfo> toCacheModel() {
		JtbAddBranchDetailInfoCacheModel jtbAddBranchDetailInfoCacheModel =
			new JtbAddBranchDetailInfoCacheModel();

		jtbAddBranchDetailInfoCacheModel.jtbBranchDetailInfoId =
			getJtbBranchDetailInfoId();

		jtbAddBranchDetailInfoCacheModel.groupId = getGroupId();

		jtbAddBranchDetailInfoCacheModel.companyId = getCompanyId();

		jtbAddBranchDetailInfoCacheModel.userId = getUserId();

		jtbAddBranchDetailInfoCacheModel.userName = getUserName();

		String userName = jtbAddBranchDetailInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			jtbAddBranchDetailInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			jtbAddBranchDetailInfoCacheModel.createDate = createDate.getTime();
		}
		else {
			jtbAddBranchDetailInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			jtbAddBranchDetailInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			jtbAddBranchDetailInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		jtbAddBranchDetailInfoCacheModel.counter = getCounter();

		String counter = jtbAddBranchDetailInfoCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			jtbAddBranchDetailInfoCacheModel.counter = null;
		}

		jtbAddBranchDetailInfoCacheModel.branchOfficeDetails =
			getBranchOfficeDetails();

		String branchOfficeDetails =
			jtbAddBranchDetailInfoCacheModel.branchOfficeDetails;

		if ((branchOfficeDetails != null) &&
			(branchOfficeDetails.length() == 0)) {

			jtbAddBranchDetailInfoCacheModel.branchOfficeDetails = null;
		}

		jtbAddBranchDetailInfoCacheModel.branchOfficeLocation =
			getBranchOfficeLocation();

		String branchOfficeLocation =
			jtbAddBranchDetailInfoCacheModel.branchOfficeLocation;

		if ((branchOfficeLocation != null) &&
			(branchOfficeLocation.length() == 0)) {

			jtbAddBranchDetailInfoCacheModel.branchOfficeLocation = null;
		}

		jtbAddBranchDetailInfoCacheModel.jtbApplicationId =
			getJtbApplicationId();

		return jtbAddBranchDetailInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<JtbAddBranchDetailInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<JtbAddBranchDetailInfo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<JtbAddBranchDetailInfo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(JtbAddBranchDetailInfo)this);

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

		private static final Function<InvocationHandler, JtbAddBranchDetailInfo>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					JtbAddBranchDetailInfo.class, ModelWrapper.class);

	}

	private long _jtbBranchDetailInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _counter;
	private String _branchOfficeDetails;
	private String _branchOfficeLocation;
	private long _jtbApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<JtbAddBranchDetailInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((JtbAddBranchDetailInfo)this);
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
			"jtbBranchDetailInfoId", _jtbBranchDetailInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put("branchOfficeDetails", _branchOfficeDetails);
		_columnOriginalValues.put(
			"branchOfficeLocation", _branchOfficeLocation);
		_columnOriginalValues.put("jtbApplicationId", _jtbApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("jtbBranchDetailInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("counter", 128L);

		columnBitmasks.put("branchOfficeDetails", 256L);

		columnBitmasks.put("branchOfficeLocation", 512L);

		columnBitmasks.put("jtbApplicationId", 1024L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private JtbAddBranchDetailInfo _escapedModel;

}