/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model.impl;

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

import com.nbp.creative.application.form.service.model.CreativeIndividualGeneralInformation;
import com.nbp.creative.application.form.service.model.CreativeIndividualGeneralInformationModel;

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
 * The base model implementation for the CreativeIndividualGeneralInformation service. Represents a row in the &quot;nbp_creative_indi_general_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CreativeIndividualGeneralInformationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CreativeIndividualGeneralInformationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualGeneralInformationImpl
 * @generated
 */
@JSON(strict = true)
public class CreativeIndividualGeneralInformationModelImpl
	extends BaseModelImpl<CreativeIndividualGeneralInformation>
	implements CreativeIndividualGeneralInformationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a creative individual general information model instance should use the <code>CreativeIndividualGeneralInformation</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_creative_indi_general_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"creativeIndiGeneralInfoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"profile", Types.VARCHAR},
		{"CreativeApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("creativeIndiGeneralInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("profile", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("CreativeApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_creative_indi_general_info (creativeIndiGeneralInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,profile VARCHAR(75) null,CreativeApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_creative_indi_general_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY creativeIndividualGeneralInformation.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_creative_indi_general_info.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATIVEAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public CreativeIndividualGeneralInformationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _creativeIndiGeneralInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCreativeIndiGeneralInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _creativeIndiGeneralInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CreativeIndividualGeneralInformation.class;
	}

	@Override
	public String getModelClassName() {
		return CreativeIndividualGeneralInformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CreativeIndividualGeneralInformation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String, Function<CreativeIndividualGeneralInformation, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CreativeIndividualGeneralInformation, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(CreativeIndividualGeneralInformation)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CreativeIndividualGeneralInformation, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CreativeIndividualGeneralInformation, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CreativeIndividualGeneralInformation)this,
					entry.getValue());
			}
		}
	}

	public Map<String, Function<CreativeIndividualGeneralInformation, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CreativeIndividualGeneralInformation, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<CreativeIndividualGeneralInformation, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<CreativeIndividualGeneralInformation, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function
							 <CreativeIndividualGeneralInformation, Object>>();

			attributeGetterFunctions.put(
				"creativeIndiGeneralInfoId",
				CreativeIndividualGeneralInformation::
					getCreativeIndiGeneralInfoId);
			attributeGetterFunctions.put(
				"groupId", CreativeIndividualGeneralInformation::getGroupId);
			attributeGetterFunctions.put(
				"companyId",
				CreativeIndividualGeneralInformation::getCompanyId);
			attributeGetterFunctions.put(
				"userId", CreativeIndividualGeneralInformation::getUserId);
			attributeGetterFunctions.put(
				"userName", CreativeIndividualGeneralInformation::getUserName);
			attributeGetterFunctions.put(
				"createDate",
				CreativeIndividualGeneralInformation::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate",
				CreativeIndividualGeneralInformation::getModifiedDate);
			attributeGetterFunctions.put(
				"profile", CreativeIndividualGeneralInformation::getProfile);
			attributeGetterFunctions.put(
				"CreativeApplicationId",
				CreativeIndividualGeneralInformation::getCreativeApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<CreativeIndividualGeneralInformation, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<CreativeIndividualGeneralInformation, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String,
						 BiConsumer<CreativeIndividualGeneralInformation, ?>>();

			attributeSetterBiConsumers.put(
				"creativeIndiGeneralInfoId",
				(BiConsumer<CreativeIndividualGeneralInformation, Long>)
					CreativeIndividualGeneralInformation::
						setCreativeIndiGeneralInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<CreativeIndividualGeneralInformation, Long>)
					CreativeIndividualGeneralInformation::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<CreativeIndividualGeneralInformation, Long>)
					CreativeIndividualGeneralInformation::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<CreativeIndividualGeneralInformation, Long>)
					CreativeIndividualGeneralInformation::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<CreativeIndividualGeneralInformation, String>)
					CreativeIndividualGeneralInformation::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<CreativeIndividualGeneralInformation, Date>)
					CreativeIndividualGeneralInformation::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<CreativeIndividualGeneralInformation, Date>)
					CreativeIndividualGeneralInformation::setModifiedDate);
			attributeSetterBiConsumers.put(
				"profile",
				(BiConsumer<CreativeIndividualGeneralInformation, String>)
					CreativeIndividualGeneralInformation::setProfile);
			attributeSetterBiConsumers.put(
				"CreativeApplicationId",
				(BiConsumer<CreativeIndividualGeneralInformation, Long>)
					CreativeIndividualGeneralInformation::
						setCreativeApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getCreativeIndiGeneralInfoId() {
		return _creativeIndiGeneralInfoId;
	}

	@Override
	public void setCreativeIndiGeneralInfoId(long creativeIndiGeneralInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_creativeIndiGeneralInfoId = creativeIndiGeneralInfoId;
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
	public String getProfile() {
		if (_profile == null) {
			return "";
		}
		else {
			return _profile;
		}
	}

	@Override
	public void setProfile(String profile) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_profile = profile;
	}

	@JSON
	@Override
	public long getCreativeApplicationId() {
		return _CreativeApplicationId;
	}

	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_CreativeApplicationId = CreativeApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCreativeApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("CreativeApplicationId"));
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
			getCompanyId(),
			CreativeIndividualGeneralInformation.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CreativeIndividualGeneralInformation toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CreativeIndividualGeneralInformation>
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
		CreativeIndividualGeneralInformationImpl
			creativeIndividualGeneralInformationImpl =
				new CreativeIndividualGeneralInformationImpl();

		creativeIndividualGeneralInformationImpl.setCreativeIndiGeneralInfoId(
			getCreativeIndiGeneralInfoId());
		creativeIndividualGeneralInformationImpl.setGroupId(getGroupId());
		creativeIndividualGeneralInformationImpl.setCompanyId(getCompanyId());
		creativeIndividualGeneralInformationImpl.setUserId(getUserId());
		creativeIndividualGeneralInformationImpl.setUserName(getUserName());
		creativeIndividualGeneralInformationImpl.setCreateDate(getCreateDate());
		creativeIndividualGeneralInformationImpl.setModifiedDate(
			getModifiedDate());
		creativeIndividualGeneralInformationImpl.setProfile(getProfile());
		creativeIndividualGeneralInformationImpl.setCreativeApplicationId(
			getCreativeApplicationId());

		creativeIndividualGeneralInformationImpl.resetOriginalValues();

		return creativeIndividualGeneralInformationImpl;
	}

	@Override
	public CreativeIndividualGeneralInformation cloneWithOriginalValues() {
		CreativeIndividualGeneralInformationImpl
			creativeIndividualGeneralInformationImpl =
				new CreativeIndividualGeneralInformationImpl();

		creativeIndividualGeneralInformationImpl.setCreativeIndiGeneralInfoId(
			this.<Long>getColumnOriginalValue("creativeIndiGeneralInfoId"));
		creativeIndividualGeneralInformationImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		creativeIndividualGeneralInformationImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		creativeIndividualGeneralInformationImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		creativeIndividualGeneralInformationImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		creativeIndividualGeneralInformationImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		creativeIndividualGeneralInformationImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		creativeIndividualGeneralInformationImpl.setProfile(
			this.<String>getColumnOriginalValue("profile"));
		creativeIndividualGeneralInformationImpl.setCreativeApplicationId(
			this.<Long>getColumnOriginalValue("CreativeApplicationId"));

		return creativeIndividualGeneralInformationImpl;
	}

	@Override
	public int compareTo(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(),
			creativeIndividualGeneralInformation.getCreateDate());

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

		if (!(object instanceof CreativeIndividualGeneralInformation)) {
			return false;
		}

		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation =
				(CreativeIndividualGeneralInformation)object;

		long primaryKey = creativeIndividualGeneralInformation.getPrimaryKey();

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
	public CacheModel<CreativeIndividualGeneralInformation> toCacheModel() {
		CreativeIndividualGeneralInformationCacheModel
			creativeIndividualGeneralInformationCacheModel =
				new CreativeIndividualGeneralInformationCacheModel();

		creativeIndividualGeneralInformationCacheModel.
			creativeIndiGeneralInfoId = getCreativeIndiGeneralInfoId();

		creativeIndividualGeneralInformationCacheModel.groupId = getGroupId();

		creativeIndividualGeneralInformationCacheModel.companyId =
			getCompanyId();

		creativeIndividualGeneralInformationCacheModel.userId = getUserId();

		creativeIndividualGeneralInformationCacheModel.userName = getUserName();

		String userName =
			creativeIndividualGeneralInformationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			creativeIndividualGeneralInformationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			creativeIndividualGeneralInformationCacheModel.createDate =
				createDate.getTime();
		}
		else {
			creativeIndividualGeneralInformationCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			creativeIndividualGeneralInformationCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			creativeIndividualGeneralInformationCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		creativeIndividualGeneralInformationCacheModel.profile = getProfile();

		String profile = creativeIndividualGeneralInformationCacheModel.profile;

		if ((profile != null) && (profile.length() == 0)) {
			creativeIndividualGeneralInformationCacheModel.profile = null;
		}

		creativeIndividualGeneralInformationCacheModel.CreativeApplicationId =
			getCreativeApplicationId();

		return creativeIndividualGeneralInformationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CreativeIndividualGeneralInformation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry
				<String, Function<CreativeIndividualGeneralInformation, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CreativeIndividualGeneralInformation, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(CreativeIndividualGeneralInformation)this);

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
			<InvocationHandler, CreativeIndividualGeneralInformation>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						CreativeIndividualGeneralInformation.class,
						ModelWrapper.class);

	}

	private long _creativeIndiGeneralInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _profile;
	private long _CreativeApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<CreativeIndividualGeneralInformation, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((CreativeIndividualGeneralInformation)this);
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
			"creativeIndiGeneralInfoId", _creativeIndiGeneralInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("profile", _profile);
		_columnOriginalValues.put(
			"CreativeApplicationId", _CreativeApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("creativeIndiGeneralInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("profile", 128L);

		columnBitmasks.put("CreativeApplicationId", 256L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private CreativeIndividualGeneralInformation _escapedModel;

}