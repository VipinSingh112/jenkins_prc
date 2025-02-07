/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

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

import com.nbp.osi.insolvency.application.form.services.model.CompanyTotalLiability;
import com.nbp.osi.insolvency.application.form.services.model.CompanyTotalLiabilityModel;

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
 * The base model implementation for the CompanyTotalLiability service. Represents a row in the &quot;nbp_osi_insolv_total_liab&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CompanyTotalLiabilityModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyTotalLiabilityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyTotalLiabilityImpl
 * @generated
 */
@JSON(strict = true)
public class CompanyTotalLiabilityModelImpl
	extends BaseModelImpl<CompanyTotalLiability>
	implements CompanyTotalLiabilityModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company total liability model instance should use the <code>CompanyTotalLiability</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_insolv_total_liab";

	public static final Object[][] TABLE_COLUMNS = {
		{"companyTotalLiabilityId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"comTotalLiability", Types.VARCHAR},
		{"osiInsolvencyId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("companyTotalLiabilityId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("comTotalLiability", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiInsolvencyId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_insolv_total_liab (companyTotalLiabilityId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,comTotalLiability VARCHAR(75) null,osiInsolvencyId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_insolv_total_liab";

	public static final String ORDER_BY_JPQL =
		" ORDER BY companyTotalLiability.companyTotalLiabilityId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_insolv_total_liab.companyTotalLiabilityId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long OSIINSOLVENCYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYTOTALLIABILITYID_COLUMN_BITMASK = 2L;

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

	public CompanyTotalLiabilityModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _companyTotalLiabilityId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCompanyTotalLiabilityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _companyTotalLiabilityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CompanyTotalLiability.class;
	}

	@Override
	public String getModelClassName() {
		return CompanyTotalLiability.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CompanyTotalLiability, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CompanyTotalLiability, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CompanyTotalLiability, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CompanyTotalLiability)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CompanyTotalLiability, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CompanyTotalLiability, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CompanyTotalLiability)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CompanyTotalLiability, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CompanyTotalLiability, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<CompanyTotalLiability, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<CompanyTotalLiability, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<CompanyTotalLiability, Object>>();

			attributeGetterFunctions.put(
				"companyTotalLiabilityId",
				CompanyTotalLiability::getCompanyTotalLiabilityId);
			attributeGetterFunctions.put(
				"groupId", CompanyTotalLiability::getGroupId);
			attributeGetterFunctions.put(
				"companyId", CompanyTotalLiability::getCompanyId);
			attributeGetterFunctions.put(
				"userId", CompanyTotalLiability::getUserId);
			attributeGetterFunctions.put(
				"userName", CompanyTotalLiability::getUserName);
			attributeGetterFunctions.put(
				"createDate", CompanyTotalLiability::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", CompanyTotalLiability::getModifiedDate);
			attributeGetterFunctions.put(
				"comTotalLiability",
				CompanyTotalLiability::getComTotalLiability);
			attributeGetterFunctions.put(
				"osiInsolvencyId", CompanyTotalLiability::getOsiInsolvencyId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<CompanyTotalLiability, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<CompanyTotalLiability, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<CompanyTotalLiability, ?>>();

			attributeSetterBiConsumers.put(
				"companyTotalLiabilityId",
				(BiConsumer<CompanyTotalLiability, Long>)
					CompanyTotalLiability::setCompanyTotalLiabilityId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<CompanyTotalLiability, Long>)
					CompanyTotalLiability::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<CompanyTotalLiability, Long>)
					CompanyTotalLiability::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<CompanyTotalLiability, Long>)
					CompanyTotalLiability::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<CompanyTotalLiability, String>)
					CompanyTotalLiability::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<CompanyTotalLiability, Date>)
					CompanyTotalLiability::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<CompanyTotalLiability, Date>)
					CompanyTotalLiability::setModifiedDate);
			attributeSetterBiConsumers.put(
				"comTotalLiability",
				(BiConsumer<CompanyTotalLiability, String>)
					CompanyTotalLiability::setComTotalLiability);
			attributeSetterBiConsumers.put(
				"osiInsolvencyId",
				(BiConsumer<CompanyTotalLiability, Long>)
					CompanyTotalLiability::setOsiInsolvencyId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getCompanyTotalLiabilityId() {
		return _companyTotalLiabilityId;
	}

	@Override
	public void setCompanyTotalLiabilityId(long companyTotalLiabilityId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyTotalLiabilityId = companyTotalLiabilityId;
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
	public String getComTotalLiability() {
		if (_comTotalLiability == null) {
			return "";
		}
		else {
			return _comTotalLiability;
		}
	}

	@Override
	public void setComTotalLiability(String comTotalLiability) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comTotalLiability = comTotalLiability;
	}

	@JSON
	@Override
	public long getOsiInsolvencyId() {
		return _osiInsolvencyId;
	}

	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiInsolvencyId = osiInsolvencyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalOsiInsolvencyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));
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
			getCompanyId(), CompanyTotalLiability.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CompanyTotalLiability toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CompanyTotalLiability>
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
		CompanyTotalLiabilityImpl companyTotalLiabilityImpl =
			new CompanyTotalLiabilityImpl();

		companyTotalLiabilityImpl.setCompanyTotalLiabilityId(
			getCompanyTotalLiabilityId());
		companyTotalLiabilityImpl.setGroupId(getGroupId());
		companyTotalLiabilityImpl.setCompanyId(getCompanyId());
		companyTotalLiabilityImpl.setUserId(getUserId());
		companyTotalLiabilityImpl.setUserName(getUserName());
		companyTotalLiabilityImpl.setCreateDate(getCreateDate());
		companyTotalLiabilityImpl.setModifiedDate(getModifiedDate());
		companyTotalLiabilityImpl.setComTotalLiability(getComTotalLiability());
		companyTotalLiabilityImpl.setOsiInsolvencyId(getOsiInsolvencyId());

		companyTotalLiabilityImpl.resetOriginalValues();

		return companyTotalLiabilityImpl;
	}

	@Override
	public CompanyTotalLiability cloneWithOriginalValues() {
		CompanyTotalLiabilityImpl companyTotalLiabilityImpl =
			new CompanyTotalLiabilityImpl();

		companyTotalLiabilityImpl.setCompanyTotalLiabilityId(
			this.<Long>getColumnOriginalValue("companyTotalLiabilityId"));
		companyTotalLiabilityImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		companyTotalLiabilityImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		companyTotalLiabilityImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		companyTotalLiabilityImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		companyTotalLiabilityImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		companyTotalLiabilityImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		companyTotalLiabilityImpl.setComTotalLiability(
			this.<String>getColumnOriginalValue("comTotalLiability"));
		companyTotalLiabilityImpl.setOsiInsolvencyId(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));

		return companyTotalLiabilityImpl;
	}

	@Override
	public int compareTo(CompanyTotalLiability companyTotalLiability) {
		long primaryKey = companyTotalLiability.getPrimaryKey();

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

		if (!(object instanceof CompanyTotalLiability)) {
			return false;
		}

		CompanyTotalLiability companyTotalLiability =
			(CompanyTotalLiability)object;

		long primaryKey = companyTotalLiability.getPrimaryKey();

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
	public CacheModel<CompanyTotalLiability> toCacheModel() {
		CompanyTotalLiabilityCacheModel companyTotalLiabilityCacheModel =
			new CompanyTotalLiabilityCacheModel();

		companyTotalLiabilityCacheModel.companyTotalLiabilityId =
			getCompanyTotalLiabilityId();

		companyTotalLiabilityCacheModel.groupId = getGroupId();

		companyTotalLiabilityCacheModel.companyId = getCompanyId();

		companyTotalLiabilityCacheModel.userId = getUserId();

		companyTotalLiabilityCacheModel.userName = getUserName();

		String userName = companyTotalLiabilityCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			companyTotalLiabilityCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			companyTotalLiabilityCacheModel.createDate = createDate.getTime();
		}
		else {
			companyTotalLiabilityCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			companyTotalLiabilityCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			companyTotalLiabilityCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		companyTotalLiabilityCacheModel.comTotalLiability =
			getComTotalLiability();

		String comTotalLiability =
			companyTotalLiabilityCacheModel.comTotalLiability;

		if ((comTotalLiability != null) && (comTotalLiability.length() == 0)) {
			companyTotalLiabilityCacheModel.comTotalLiability = null;
		}

		companyTotalLiabilityCacheModel.osiInsolvencyId = getOsiInsolvencyId();

		return companyTotalLiabilityCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CompanyTotalLiability, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CompanyTotalLiability, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CompanyTotalLiability, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(CompanyTotalLiability)this);

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

		private static final Function<InvocationHandler, CompanyTotalLiability>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					CompanyTotalLiability.class, ModelWrapper.class);

	}

	private long _companyTotalLiabilityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _comTotalLiability;
	private long _osiInsolvencyId;

	public <T> T getColumnValue(String columnName) {
		Function<CompanyTotalLiability, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((CompanyTotalLiability)this);
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
			"companyTotalLiabilityId", _companyTotalLiabilityId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("comTotalLiability", _comTotalLiability);
		_columnOriginalValues.put("osiInsolvencyId", _osiInsolvencyId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("companyTotalLiabilityId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("comTotalLiability", 128L);

		columnBitmasks.put("osiInsolvencyId", 256L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private CompanyTotalLiability _escapedModel;

}