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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.CompanyUnsecuredCreditorModel;

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
 * The base model implementation for the CompanyUnsecuredCreditor service. Represents a row in the &quot;nbp_osi_unsecured_cred&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CompanyUnsecuredCreditorModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CompanyUnsecuredCreditorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyUnsecuredCreditorImpl
 * @generated
 */
@JSON(strict = true)
public class CompanyUnsecuredCreditorModelImpl
	extends BaseModelImpl<CompanyUnsecuredCreditor>
	implements CompanyUnsecuredCreditorModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a company unsecured creditor model instance should use the <code>CompanyUnsecuredCreditor</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_unsecured_cred";

	public static final Object[][] TABLE_COLUMNS = {
		{"companyUnsecuredCreditorId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"unsecuredCreditor", Types.VARCHAR},
		{"unsecuredDebtor", Types.VARCHAR}, {"unsecuredPurpose", Types.VARCHAR},
		{"unsecuredLiabilty", Types.VARCHAR},
		{"unsecuredCounter", Types.VARCHAR}, {"osiInsolvencyId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("companyUnsecuredCreditorId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("unsecuredCreditor", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("unsecuredDebtor", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("unsecuredPurpose", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("unsecuredLiabilty", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("unsecuredCounter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiInsolvencyId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_unsecured_cred (companyUnsecuredCreditorId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,unsecuredCreditor VARCHAR(75) null,unsecuredDebtor VARCHAR(75) null,unsecuredPurpose VARCHAR(75) null,unsecuredLiabilty VARCHAR(75) null,unsecuredCounter VARCHAR(75) null,osiInsolvencyId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_unsecured_cred";

	public static final String ORDER_BY_JPQL =
		" ORDER BY companyUnsecuredCreditor.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_unsecured_cred.createDate ASC";

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

	public CompanyUnsecuredCreditorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _companyUnsecuredCreditorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCompanyUnsecuredCreditorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _companyUnsecuredCreditorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CompanyUnsecuredCreditor.class;
	}

	@Override
	public String getModelClassName() {
		return CompanyUnsecuredCreditor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CompanyUnsecuredCreditor, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CompanyUnsecuredCreditor, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CompanyUnsecuredCreditor, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CompanyUnsecuredCreditor)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CompanyUnsecuredCreditor, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CompanyUnsecuredCreditor, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CompanyUnsecuredCreditor)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CompanyUnsecuredCreditor, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CompanyUnsecuredCreditor, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<CompanyUnsecuredCreditor, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<CompanyUnsecuredCreditor, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<CompanyUnsecuredCreditor, Object>>();

			attributeGetterFunctions.put(
				"companyUnsecuredCreditorId",
				CompanyUnsecuredCreditor::getCompanyUnsecuredCreditorId);
			attributeGetterFunctions.put(
				"groupId", CompanyUnsecuredCreditor::getGroupId);
			attributeGetterFunctions.put(
				"companyId", CompanyUnsecuredCreditor::getCompanyId);
			attributeGetterFunctions.put(
				"userId", CompanyUnsecuredCreditor::getUserId);
			attributeGetterFunctions.put(
				"userName", CompanyUnsecuredCreditor::getUserName);
			attributeGetterFunctions.put(
				"createDate", CompanyUnsecuredCreditor::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", CompanyUnsecuredCreditor::getModifiedDate);
			attributeGetterFunctions.put(
				"unsecuredCreditor",
				CompanyUnsecuredCreditor::getUnsecuredCreditor);
			attributeGetterFunctions.put(
				"unsecuredDebtor",
				CompanyUnsecuredCreditor::getUnsecuredDebtor);
			attributeGetterFunctions.put(
				"unsecuredPurpose",
				CompanyUnsecuredCreditor::getUnsecuredPurpose);
			attributeGetterFunctions.put(
				"unsecuredLiabilty",
				CompanyUnsecuredCreditor::getUnsecuredLiabilty);
			attributeGetterFunctions.put(
				"unsecuredCounter",
				CompanyUnsecuredCreditor::getUnsecuredCounter);
			attributeGetterFunctions.put(
				"osiInsolvencyId",
				CompanyUnsecuredCreditor::getOsiInsolvencyId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<CompanyUnsecuredCreditor, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<CompanyUnsecuredCreditor, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<CompanyUnsecuredCreditor, ?>>();

			attributeSetterBiConsumers.put(
				"companyUnsecuredCreditorId",
				(BiConsumer<CompanyUnsecuredCreditor, Long>)
					CompanyUnsecuredCreditor::setCompanyUnsecuredCreditorId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<CompanyUnsecuredCreditor, Long>)
					CompanyUnsecuredCreditor::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<CompanyUnsecuredCreditor, Long>)
					CompanyUnsecuredCreditor::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<CompanyUnsecuredCreditor, Long>)
					CompanyUnsecuredCreditor::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<CompanyUnsecuredCreditor, String>)
					CompanyUnsecuredCreditor::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<CompanyUnsecuredCreditor, Date>)
					CompanyUnsecuredCreditor::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<CompanyUnsecuredCreditor, Date>)
					CompanyUnsecuredCreditor::setModifiedDate);
			attributeSetterBiConsumers.put(
				"unsecuredCreditor",
				(BiConsumer<CompanyUnsecuredCreditor, String>)
					CompanyUnsecuredCreditor::setUnsecuredCreditor);
			attributeSetterBiConsumers.put(
				"unsecuredDebtor",
				(BiConsumer<CompanyUnsecuredCreditor, String>)
					CompanyUnsecuredCreditor::setUnsecuredDebtor);
			attributeSetterBiConsumers.put(
				"unsecuredPurpose",
				(BiConsumer<CompanyUnsecuredCreditor, String>)
					CompanyUnsecuredCreditor::setUnsecuredPurpose);
			attributeSetterBiConsumers.put(
				"unsecuredLiabilty",
				(BiConsumer<CompanyUnsecuredCreditor, String>)
					CompanyUnsecuredCreditor::setUnsecuredLiabilty);
			attributeSetterBiConsumers.put(
				"unsecuredCounter",
				(BiConsumer<CompanyUnsecuredCreditor, String>)
					CompanyUnsecuredCreditor::setUnsecuredCounter);
			attributeSetterBiConsumers.put(
				"osiInsolvencyId",
				(BiConsumer<CompanyUnsecuredCreditor, Long>)
					CompanyUnsecuredCreditor::setOsiInsolvencyId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getCompanyUnsecuredCreditorId() {
		return _companyUnsecuredCreditorId;
	}

	@Override
	public void setCompanyUnsecuredCreditorId(long companyUnsecuredCreditorId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyUnsecuredCreditorId = companyUnsecuredCreditorId;
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
	public String getUnsecuredCreditor() {
		if (_unsecuredCreditor == null) {
			return "";
		}
		else {
			return _unsecuredCreditor;
		}
	}

	@Override
	public void setUnsecuredCreditor(String unsecuredCreditor) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_unsecuredCreditor = unsecuredCreditor;
	}

	@JSON
	@Override
	public String getUnsecuredDebtor() {
		if (_unsecuredDebtor == null) {
			return "";
		}
		else {
			return _unsecuredDebtor;
		}
	}

	@Override
	public void setUnsecuredDebtor(String unsecuredDebtor) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_unsecuredDebtor = unsecuredDebtor;
	}

	@JSON
	@Override
	public String getUnsecuredPurpose() {
		if (_unsecuredPurpose == null) {
			return "";
		}
		else {
			return _unsecuredPurpose;
		}
	}

	@Override
	public void setUnsecuredPurpose(String unsecuredPurpose) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_unsecuredPurpose = unsecuredPurpose;
	}

	@JSON
	@Override
	public String getUnsecuredLiabilty() {
		if (_unsecuredLiabilty == null) {
			return "";
		}
		else {
			return _unsecuredLiabilty;
		}
	}

	@Override
	public void setUnsecuredLiabilty(String unsecuredLiabilty) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_unsecuredLiabilty = unsecuredLiabilty;
	}

	@JSON
	@Override
	public String getUnsecuredCounter() {
		if (_unsecuredCounter == null) {
			return "";
		}
		else {
			return _unsecuredCounter;
		}
	}

	@Override
	public void setUnsecuredCounter(String unsecuredCounter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_unsecuredCounter = unsecuredCounter;
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
			getCompanyId(), CompanyUnsecuredCreditor.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CompanyUnsecuredCreditor toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CompanyUnsecuredCreditor>
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
		CompanyUnsecuredCreditorImpl companyUnsecuredCreditorImpl =
			new CompanyUnsecuredCreditorImpl();

		companyUnsecuredCreditorImpl.setCompanyUnsecuredCreditorId(
			getCompanyUnsecuredCreditorId());
		companyUnsecuredCreditorImpl.setGroupId(getGroupId());
		companyUnsecuredCreditorImpl.setCompanyId(getCompanyId());
		companyUnsecuredCreditorImpl.setUserId(getUserId());
		companyUnsecuredCreditorImpl.setUserName(getUserName());
		companyUnsecuredCreditorImpl.setCreateDate(getCreateDate());
		companyUnsecuredCreditorImpl.setModifiedDate(getModifiedDate());
		companyUnsecuredCreditorImpl.setUnsecuredCreditor(
			getUnsecuredCreditor());
		companyUnsecuredCreditorImpl.setUnsecuredDebtor(getUnsecuredDebtor());
		companyUnsecuredCreditorImpl.setUnsecuredPurpose(getUnsecuredPurpose());
		companyUnsecuredCreditorImpl.setUnsecuredLiabilty(
			getUnsecuredLiabilty());
		companyUnsecuredCreditorImpl.setUnsecuredCounter(getUnsecuredCounter());
		companyUnsecuredCreditorImpl.setOsiInsolvencyId(getOsiInsolvencyId());

		companyUnsecuredCreditorImpl.resetOriginalValues();

		return companyUnsecuredCreditorImpl;
	}

	@Override
	public CompanyUnsecuredCreditor cloneWithOriginalValues() {
		CompanyUnsecuredCreditorImpl companyUnsecuredCreditorImpl =
			new CompanyUnsecuredCreditorImpl();

		companyUnsecuredCreditorImpl.setCompanyUnsecuredCreditorId(
			this.<Long>getColumnOriginalValue("companyUnsecuredCreditorId"));
		companyUnsecuredCreditorImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		companyUnsecuredCreditorImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		companyUnsecuredCreditorImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		companyUnsecuredCreditorImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		companyUnsecuredCreditorImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		companyUnsecuredCreditorImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		companyUnsecuredCreditorImpl.setUnsecuredCreditor(
			this.<String>getColumnOriginalValue("unsecuredCreditor"));
		companyUnsecuredCreditorImpl.setUnsecuredDebtor(
			this.<String>getColumnOriginalValue("unsecuredDebtor"));
		companyUnsecuredCreditorImpl.setUnsecuredPurpose(
			this.<String>getColumnOriginalValue("unsecuredPurpose"));
		companyUnsecuredCreditorImpl.setUnsecuredLiabilty(
			this.<String>getColumnOriginalValue("unsecuredLiabilty"));
		companyUnsecuredCreditorImpl.setUnsecuredCounter(
			this.<String>getColumnOriginalValue("unsecuredCounter"));
		companyUnsecuredCreditorImpl.setOsiInsolvencyId(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));

		return companyUnsecuredCreditorImpl;
	}

	@Override
	public int compareTo(CompanyUnsecuredCreditor companyUnsecuredCreditor) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), companyUnsecuredCreditor.getCreateDate());

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

		if (!(object instanceof CompanyUnsecuredCreditor)) {
			return false;
		}

		CompanyUnsecuredCreditor companyUnsecuredCreditor =
			(CompanyUnsecuredCreditor)object;

		long primaryKey = companyUnsecuredCreditor.getPrimaryKey();

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
	public CacheModel<CompanyUnsecuredCreditor> toCacheModel() {
		CompanyUnsecuredCreditorCacheModel companyUnsecuredCreditorCacheModel =
			new CompanyUnsecuredCreditorCacheModel();

		companyUnsecuredCreditorCacheModel.companyUnsecuredCreditorId =
			getCompanyUnsecuredCreditorId();

		companyUnsecuredCreditorCacheModel.groupId = getGroupId();

		companyUnsecuredCreditorCacheModel.companyId = getCompanyId();

		companyUnsecuredCreditorCacheModel.userId = getUserId();

		companyUnsecuredCreditorCacheModel.userName = getUserName();

		String userName = companyUnsecuredCreditorCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			companyUnsecuredCreditorCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			companyUnsecuredCreditorCacheModel.createDate =
				createDate.getTime();
		}
		else {
			companyUnsecuredCreditorCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			companyUnsecuredCreditorCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			companyUnsecuredCreditorCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		companyUnsecuredCreditorCacheModel.unsecuredCreditor =
			getUnsecuredCreditor();

		String unsecuredCreditor =
			companyUnsecuredCreditorCacheModel.unsecuredCreditor;

		if ((unsecuredCreditor != null) && (unsecuredCreditor.length() == 0)) {
			companyUnsecuredCreditorCacheModel.unsecuredCreditor = null;
		}

		companyUnsecuredCreditorCacheModel.unsecuredDebtor =
			getUnsecuredDebtor();

		String unsecuredDebtor =
			companyUnsecuredCreditorCacheModel.unsecuredDebtor;

		if ((unsecuredDebtor != null) && (unsecuredDebtor.length() == 0)) {
			companyUnsecuredCreditorCacheModel.unsecuredDebtor = null;
		}

		companyUnsecuredCreditorCacheModel.unsecuredPurpose =
			getUnsecuredPurpose();

		String unsecuredPurpose =
			companyUnsecuredCreditorCacheModel.unsecuredPurpose;

		if ((unsecuredPurpose != null) && (unsecuredPurpose.length() == 0)) {
			companyUnsecuredCreditorCacheModel.unsecuredPurpose = null;
		}

		companyUnsecuredCreditorCacheModel.unsecuredLiabilty =
			getUnsecuredLiabilty();

		String unsecuredLiabilty =
			companyUnsecuredCreditorCacheModel.unsecuredLiabilty;

		if ((unsecuredLiabilty != null) && (unsecuredLiabilty.length() == 0)) {
			companyUnsecuredCreditorCacheModel.unsecuredLiabilty = null;
		}

		companyUnsecuredCreditorCacheModel.unsecuredCounter =
			getUnsecuredCounter();

		String unsecuredCounter =
			companyUnsecuredCreditorCacheModel.unsecuredCounter;

		if ((unsecuredCounter != null) && (unsecuredCounter.length() == 0)) {
			companyUnsecuredCreditorCacheModel.unsecuredCounter = null;
		}

		companyUnsecuredCreditorCacheModel.osiInsolvencyId =
			getOsiInsolvencyId();

		return companyUnsecuredCreditorCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CompanyUnsecuredCreditor, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CompanyUnsecuredCreditor, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CompanyUnsecuredCreditor, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(CompanyUnsecuredCreditor)this);

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
			<InvocationHandler, CompanyUnsecuredCreditor>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						CompanyUnsecuredCreditor.class, ModelWrapper.class);

	}

	private long _companyUnsecuredCreditorId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _unsecuredCreditor;
	private String _unsecuredDebtor;
	private String _unsecuredPurpose;
	private String _unsecuredLiabilty;
	private String _unsecuredCounter;
	private long _osiInsolvencyId;

	public <T> T getColumnValue(String columnName) {
		Function<CompanyUnsecuredCreditor, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((CompanyUnsecuredCreditor)this);
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
			"companyUnsecuredCreditorId", _companyUnsecuredCreditorId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("unsecuredCreditor", _unsecuredCreditor);
		_columnOriginalValues.put("unsecuredDebtor", _unsecuredDebtor);
		_columnOriginalValues.put("unsecuredPurpose", _unsecuredPurpose);
		_columnOriginalValues.put("unsecuredLiabilty", _unsecuredLiabilty);
		_columnOriginalValues.put("unsecuredCounter", _unsecuredCounter);
		_columnOriginalValues.put("osiInsolvencyId", _osiInsolvencyId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("companyUnsecuredCreditorId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("unsecuredCreditor", 128L);

		columnBitmasks.put("unsecuredDebtor", 256L);

		columnBitmasks.put("unsecuredPurpose", 512L);

		columnBitmasks.put("unsecuredLiabilty", 1024L);

		columnBitmasks.put("unsecuredCounter", 2048L);

		columnBitmasks.put("osiInsolvencyId", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private CompanyUnsecuredCreditor _escapedModel;

}