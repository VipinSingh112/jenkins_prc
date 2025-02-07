/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model.impl;

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

import com.nbp.acquire.stages.service.model.AcquireDeskVerification;
import com.nbp.acquire.stages.service.model.AcquireDeskVerificationModel;

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
 * The base model implementation for the AcquireDeskVerification service. Represents a row in the &quot;nbp_acquire_desk_verification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AcquireDeskVerificationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AcquireDeskVerificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDeskVerificationImpl
 * @generated
 */
@JSON(strict = true)
public class AcquireDeskVerificationModelImpl
	extends BaseModelImpl<AcquireDeskVerification>
	implements AcquireDeskVerificationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acquire desk verification model instance should use the <code>AcquireDeskVerification</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_acquire_desk_verification";

	public static final Object[][] TABLE_COLUMNS = {
		{"acquireDeskVerificationId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"acquireApplicationId", Types.BIGINT}, {"documentName", Types.VARCHAR},
		{"documentStatus", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("acquireDeskVerificationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("acquireApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("documentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("documentStatus", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_acquire_desk_verification (acquireDeskVerificationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,acquireApplicationId LONG,documentName VARCHAR(75) null,documentStatus VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_acquire_desk_verification";

	public static final String ORDER_BY_JPQL =
		" ORDER BY acquireDeskVerification.acquireDeskVerificationId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_acquire_desk_verification.acquireDeskVerificationId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ACQUIREAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ACQUIREDESKVERIFICATIONID_COLUMN_BITMASK = 2L;

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

	public AcquireDeskVerificationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _acquireDeskVerificationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAcquireDeskVerificationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _acquireDeskVerificationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AcquireDeskVerification.class;
	}

	@Override
	public String getModelClassName() {
		return AcquireDeskVerification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AcquireDeskVerification, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AcquireDeskVerification, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AcquireDeskVerification, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AcquireDeskVerification)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AcquireDeskVerification, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AcquireDeskVerification, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AcquireDeskVerification)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AcquireDeskVerification, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AcquireDeskVerification, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<AcquireDeskVerification, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<AcquireDeskVerification, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AcquireDeskVerification, Object>>();

			attributeGetterFunctions.put(
				"acquireDeskVerificationId",
				AcquireDeskVerification::getAcquireDeskVerificationId);
			attributeGetterFunctions.put(
				"groupId", AcquireDeskVerification::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AcquireDeskVerification::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AcquireDeskVerification::getUserId);
			attributeGetterFunctions.put(
				"userName", AcquireDeskVerification::getUserName);
			attributeGetterFunctions.put(
				"createDate", AcquireDeskVerification::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AcquireDeskVerification::getModifiedDate);
			attributeGetterFunctions.put(
				"acquireApplicationId",
				AcquireDeskVerification::getAcquireApplicationId);
			attributeGetterFunctions.put(
				"documentName", AcquireDeskVerification::getDocumentName);
			attributeGetterFunctions.put(
				"documentStatus", AcquireDeskVerification::getDocumentStatus);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AcquireDeskVerification, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AcquireDeskVerification, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AcquireDeskVerification, ?>>();

			attributeSetterBiConsumers.put(
				"acquireDeskVerificationId",
				(BiConsumer<AcquireDeskVerification, Long>)
					AcquireDeskVerification::setAcquireDeskVerificationId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AcquireDeskVerification, Long>)
					AcquireDeskVerification::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AcquireDeskVerification, Long>)
					AcquireDeskVerification::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AcquireDeskVerification, Long>)
					AcquireDeskVerification::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AcquireDeskVerification, String>)
					AcquireDeskVerification::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AcquireDeskVerification, Date>)
					AcquireDeskVerification::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AcquireDeskVerification, Date>)
					AcquireDeskVerification::setModifiedDate);
			attributeSetterBiConsumers.put(
				"acquireApplicationId",
				(BiConsumer<AcquireDeskVerification, Long>)
					AcquireDeskVerification::setAcquireApplicationId);
			attributeSetterBiConsumers.put(
				"documentName",
				(BiConsumer<AcquireDeskVerification, String>)
					AcquireDeskVerification::setDocumentName);
			attributeSetterBiConsumers.put(
				"documentStatus",
				(BiConsumer<AcquireDeskVerification, String>)
					AcquireDeskVerification::setDocumentStatus);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAcquireDeskVerificationId() {
		return _acquireDeskVerificationId;
	}

	@Override
	public void setAcquireDeskVerificationId(long acquireDeskVerificationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_acquireDeskVerificationId = acquireDeskVerificationId;
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
	public long getAcquireApplicationId() {
		return _acquireApplicationId;
	}

	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_acquireApplicationId = acquireApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalAcquireApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("acquireApplicationId"));
	}

	@JSON
	@Override
	public String getDocumentName() {
		if (_documentName == null) {
			return "";
		}
		else {
			return _documentName;
		}
	}

	@Override
	public void setDocumentName(String documentName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_documentName = documentName;
	}

	@JSON
	@Override
	public String getDocumentStatus() {
		if (_documentStatus == null) {
			return "";
		}
		else {
			return _documentStatus;
		}
	}

	@Override
	public void setDocumentStatus(String documentStatus) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_documentStatus = documentStatus;
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
			getCompanyId(), AcquireDeskVerification.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AcquireDeskVerification toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AcquireDeskVerification>
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
		AcquireDeskVerificationImpl acquireDeskVerificationImpl =
			new AcquireDeskVerificationImpl();

		acquireDeskVerificationImpl.setAcquireDeskVerificationId(
			getAcquireDeskVerificationId());
		acquireDeskVerificationImpl.setGroupId(getGroupId());
		acquireDeskVerificationImpl.setCompanyId(getCompanyId());
		acquireDeskVerificationImpl.setUserId(getUserId());
		acquireDeskVerificationImpl.setUserName(getUserName());
		acquireDeskVerificationImpl.setCreateDate(getCreateDate());
		acquireDeskVerificationImpl.setModifiedDate(getModifiedDate());
		acquireDeskVerificationImpl.setAcquireApplicationId(
			getAcquireApplicationId());
		acquireDeskVerificationImpl.setDocumentName(getDocumentName());
		acquireDeskVerificationImpl.setDocumentStatus(getDocumentStatus());

		acquireDeskVerificationImpl.resetOriginalValues();

		return acquireDeskVerificationImpl;
	}

	@Override
	public AcquireDeskVerification cloneWithOriginalValues() {
		AcquireDeskVerificationImpl acquireDeskVerificationImpl =
			new AcquireDeskVerificationImpl();

		acquireDeskVerificationImpl.setAcquireDeskVerificationId(
			this.<Long>getColumnOriginalValue("acquireDeskVerificationId"));
		acquireDeskVerificationImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		acquireDeskVerificationImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		acquireDeskVerificationImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		acquireDeskVerificationImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		acquireDeskVerificationImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		acquireDeskVerificationImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		acquireDeskVerificationImpl.setAcquireApplicationId(
			this.<Long>getColumnOriginalValue("acquireApplicationId"));
		acquireDeskVerificationImpl.setDocumentName(
			this.<String>getColumnOriginalValue("documentName"));
		acquireDeskVerificationImpl.setDocumentStatus(
			this.<String>getColumnOriginalValue("documentStatus"));

		return acquireDeskVerificationImpl;
	}

	@Override
	public int compareTo(AcquireDeskVerification acquireDeskVerification) {
		long primaryKey = acquireDeskVerification.getPrimaryKey();

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

		if (!(object instanceof AcquireDeskVerification)) {
			return false;
		}

		AcquireDeskVerification acquireDeskVerification =
			(AcquireDeskVerification)object;

		long primaryKey = acquireDeskVerification.getPrimaryKey();

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
	public CacheModel<AcquireDeskVerification> toCacheModel() {
		AcquireDeskVerificationCacheModel acquireDeskVerificationCacheModel =
			new AcquireDeskVerificationCacheModel();

		acquireDeskVerificationCacheModel.acquireDeskVerificationId =
			getAcquireDeskVerificationId();

		acquireDeskVerificationCacheModel.groupId = getGroupId();

		acquireDeskVerificationCacheModel.companyId = getCompanyId();

		acquireDeskVerificationCacheModel.userId = getUserId();

		acquireDeskVerificationCacheModel.userName = getUserName();

		String userName = acquireDeskVerificationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			acquireDeskVerificationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			acquireDeskVerificationCacheModel.createDate = createDate.getTime();
		}
		else {
			acquireDeskVerificationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			acquireDeskVerificationCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			acquireDeskVerificationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		acquireDeskVerificationCacheModel.acquireApplicationId =
			getAcquireApplicationId();

		acquireDeskVerificationCacheModel.documentName = getDocumentName();

		String documentName = acquireDeskVerificationCacheModel.documentName;

		if ((documentName != null) && (documentName.length() == 0)) {
			acquireDeskVerificationCacheModel.documentName = null;
		}

		acquireDeskVerificationCacheModel.documentStatus = getDocumentStatus();

		String documentStatus =
			acquireDeskVerificationCacheModel.documentStatus;

		if ((documentStatus != null) && (documentStatus.length() == 0)) {
			acquireDeskVerificationCacheModel.documentStatus = null;
		}

		return acquireDeskVerificationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AcquireDeskVerification, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AcquireDeskVerification, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AcquireDeskVerification, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AcquireDeskVerification)this);

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
			<InvocationHandler, AcquireDeskVerification>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						AcquireDeskVerification.class, ModelWrapper.class);

	}

	private long _acquireDeskVerificationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _acquireApplicationId;
	private String _documentName;
	private String _documentStatus;

	public <T> T getColumnValue(String columnName) {
		Function<AcquireDeskVerification, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AcquireDeskVerification)this);
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
			"acquireDeskVerificationId", _acquireDeskVerificationId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"acquireApplicationId", _acquireApplicationId);
		_columnOriginalValues.put("documentName", _documentName);
		_columnOriginalValues.put("documentStatus", _documentStatus);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("acquireDeskVerificationId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("acquireApplicationId", 128L);

		columnBitmasks.put("documentName", 256L);

		columnBitmasks.put("documentStatus", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AcquireDeskVerification _escapedModel;

}