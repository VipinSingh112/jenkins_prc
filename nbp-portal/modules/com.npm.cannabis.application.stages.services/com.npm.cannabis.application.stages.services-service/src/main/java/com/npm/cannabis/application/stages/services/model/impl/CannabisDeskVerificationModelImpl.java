/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.npm.cannabis.application.stages.services.model.impl;

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

import com.npm.cannabis.application.stages.services.model.CannabisDeskVerification;
import com.npm.cannabis.application.stages.services.model.CannabisDeskVerificationModel;

import java.io.Serializable;

import java.lang.reflect.Constructor;
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
 * The base model implementation for the CannabisDeskVerification service. Represents a row in the &quot;nbp_cannabis_desk_veri&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CannabisDeskVerificationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CannabisDeskVerificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeskVerificationImpl
 * @generated
 */
@JSON(strict = true)
public class CannabisDeskVerificationModelImpl
	extends BaseModelImpl<CannabisDeskVerification>
	implements CannabisDeskVerificationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cannabis desk verification model instance should use the <code>CannabisDeskVerification</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_cannabis_desk_veri";

	public static final Object[][] TABLE_COLUMNS = {
		{"cannabisDeskVerificationId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"cannabisApplicationId", Types.BIGINT},
		{"documentStatus", Types.VARCHAR}, {"documentName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("cannabisDeskVerificationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("cannabisApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("documentStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("documentName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_cannabis_desk_veri (cannabisDeskVerificationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,cannabisApplicationId LONG,documentStatus VARCHAR(75) null,documentName VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_cannabis_desk_veri";

	public static final String ORDER_BY_JPQL =
		" ORDER BY cannabisDeskVerification.cannabisDeskVerificationId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_cannabis_desk_veri.cannabisDeskVerificationId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CANNABISAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CANNABISDESKVERIFICATIONID_COLUMN_BITMASK = 2L;

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

	public CannabisDeskVerificationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _cannabisDeskVerificationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCannabisDeskVerificationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cannabisDeskVerificationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CannabisDeskVerification.class;
	}

	@Override
	public String getModelClassName() {
		return CannabisDeskVerification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CannabisDeskVerification, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CannabisDeskVerification, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CannabisDeskVerification, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CannabisDeskVerification)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CannabisDeskVerification, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CannabisDeskVerification, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CannabisDeskVerification)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CannabisDeskVerification, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CannabisDeskVerification, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, CannabisDeskVerification>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CannabisDeskVerification.class.getClassLoader(),
			CannabisDeskVerification.class, ModelWrapper.class);

		try {
			Constructor<CannabisDeskVerification> constructor =
				(Constructor<CannabisDeskVerification>)
					proxyClass.getConstructor(InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<CannabisDeskVerification, Object>>
		_attributeGetterFunctions;
	private static final Map
		<String, BiConsumer<CannabisDeskVerification, Object>>
			_attributeSetterBiConsumers;

	static {
		Map<String, Function<CannabisDeskVerification, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<CannabisDeskVerification, Object>>();
		Map<String, BiConsumer<CannabisDeskVerification, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<CannabisDeskVerification, ?>>();

		attributeGetterFunctions.put(
			"cannabisDeskVerificationId",
			CannabisDeskVerification::getCannabisDeskVerificationId);
		attributeSetterBiConsumers.put(
			"cannabisDeskVerificationId",
			(BiConsumer<CannabisDeskVerification, Long>)
				CannabisDeskVerification::setCannabisDeskVerificationId);
		attributeGetterFunctions.put(
			"groupId", CannabisDeskVerification::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<CannabisDeskVerification, Long>)
				CannabisDeskVerification::setGroupId);
		attributeGetterFunctions.put(
			"companyId", CannabisDeskVerification::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<CannabisDeskVerification, Long>)
				CannabisDeskVerification::setCompanyId);
		attributeGetterFunctions.put(
			"userId", CannabisDeskVerification::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<CannabisDeskVerification, Long>)
				CannabisDeskVerification::setUserId);
		attributeGetterFunctions.put(
			"userName", CannabisDeskVerification::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<CannabisDeskVerification, String>)
				CannabisDeskVerification::setUserName);
		attributeGetterFunctions.put(
			"createDate", CannabisDeskVerification::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<CannabisDeskVerification, Date>)
				CannabisDeskVerification::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", CannabisDeskVerification::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<CannabisDeskVerification, Date>)
				CannabisDeskVerification::setModifiedDate);
		attributeGetterFunctions.put(
			"cannabisApplicationId",
			CannabisDeskVerification::getCannabisApplicationId);
		attributeSetterBiConsumers.put(
			"cannabisApplicationId",
			(BiConsumer<CannabisDeskVerification, Long>)
				CannabisDeskVerification::setCannabisApplicationId);
		attributeGetterFunctions.put(
			"documentStatus", CannabisDeskVerification::getDocumentStatus);
		attributeSetterBiConsumers.put(
			"documentStatus",
			(BiConsumer<CannabisDeskVerification, String>)
				CannabisDeskVerification::setDocumentStatus);
		attributeGetterFunctions.put(
			"documentName", CannabisDeskVerification::getDocumentName);
		attributeSetterBiConsumers.put(
			"documentName",
			(BiConsumer<CannabisDeskVerification, String>)
				CannabisDeskVerification::setDocumentName);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getCannabisDeskVerificationId() {
		return _cannabisDeskVerificationId;
	}

	@Override
	public void setCannabisDeskVerificationId(long cannabisDeskVerificationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_cannabisDeskVerificationId = cannabisDeskVerificationId;
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
	public long getCannabisApplicationId() {
		return _cannabisApplicationId;
	}

	@Override
	public void setCannabisApplicationId(long cannabisApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_cannabisApplicationId = cannabisApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCannabisApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("cannabisApplicationId"));
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
			getCompanyId(), CannabisDeskVerification.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CannabisDeskVerification toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CannabisDeskVerification>
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
		CannabisDeskVerificationImpl cannabisDeskVerificationImpl =
			new CannabisDeskVerificationImpl();

		cannabisDeskVerificationImpl.setCannabisDeskVerificationId(
			getCannabisDeskVerificationId());
		cannabisDeskVerificationImpl.setGroupId(getGroupId());
		cannabisDeskVerificationImpl.setCompanyId(getCompanyId());
		cannabisDeskVerificationImpl.setUserId(getUserId());
		cannabisDeskVerificationImpl.setUserName(getUserName());
		cannabisDeskVerificationImpl.setCreateDate(getCreateDate());
		cannabisDeskVerificationImpl.setModifiedDate(getModifiedDate());
		cannabisDeskVerificationImpl.setCannabisApplicationId(
			getCannabisApplicationId());
		cannabisDeskVerificationImpl.setDocumentStatus(getDocumentStatus());
		cannabisDeskVerificationImpl.setDocumentName(getDocumentName());

		cannabisDeskVerificationImpl.resetOriginalValues();

		return cannabisDeskVerificationImpl;
	}

	@Override
	public CannabisDeskVerification cloneWithOriginalValues() {
		CannabisDeskVerificationImpl cannabisDeskVerificationImpl =
			new CannabisDeskVerificationImpl();

		cannabisDeskVerificationImpl.setCannabisDeskVerificationId(
			this.<Long>getColumnOriginalValue("cannabisDeskVerificationId"));
		cannabisDeskVerificationImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		cannabisDeskVerificationImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		cannabisDeskVerificationImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		cannabisDeskVerificationImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		cannabisDeskVerificationImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		cannabisDeskVerificationImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		cannabisDeskVerificationImpl.setCannabisApplicationId(
			this.<Long>getColumnOriginalValue("cannabisApplicationId"));
		cannabisDeskVerificationImpl.setDocumentStatus(
			this.<String>getColumnOriginalValue("documentStatus"));
		cannabisDeskVerificationImpl.setDocumentName(
			this.<String>getColumnOriginalValue("documentName"));

		return cannabisDeskVerificationImpl;
	}

	@Override
	public int compareTo(CannabisDeskVerification cannabisDeskVerification) {
		long primaryKey = cannabisDeskVerification.getPrimaryKey();

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

		if (!(object instanceof CannabisDeskVerification)) {
			return false;
		}

		CannabisDeskVerification cannabisDeskVerification =
			(CannabisDeskVerification)object;

		long primaryKey = cannabisDeskVerification.getPrimaryKey();

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
	public CacheModel<CannabisDeskVerification> toCacheModel() {
		CannabisDeskVerificationCacheModel cannabisDeskVerificationCacheModel =
			new CannabisDeskVerificationCacheModel();

		cannabisDeskVerificationCacheModel.cannabisDeskVerificationId =
			getCannabisDeskVerificationId();

		cannabisDeskVerificationCacheModel.groupId = getGroupId();

		cannabisDeskVerificationCacheModel.companyId = getCompanyId();

		cannabisDeskVerificationCacheModel.userId = getUserId();

		cannabisDeskVerificationCacheModel.userName = getUserName();

		String userName = cannabisDeskVerificationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			cannabisDeskVerificationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			cannabisDeskVerificationCacheModel.createDate =
				createDate.getTime();
		}
		else {
			cannabisDeskVerificationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			cannabisDeskVerificationCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			cannabisDeskVerificationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		cannabisDeskVerificationCacheModel.cannabisApplicationId =
			getCannabisApplicationId();

		cannabisDeskVerificationCacheModel.documentStatus = getDocumentStatus();

		String documentStatus =
			cannabisDeskVerificationCacheModel.documentStatus;

		if ((documentStatus != null) && (documentStatus.length() == 0)) {
			cannabisDeskVerificationCacheModel.documentStatus = null;
		}

		cannabisDeskVerificationCacheModel.documentName = getDocumentName();

		String documentName = cannabisDeskVerificationCacheModel.documentName;

		if ((documentName != null) && (documentName.length() == 0)) {
			cannabisDeskVerificationCacheModel.documentName = null;
		}

		return cannabisDeskVerificationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CannabisDeskVerification, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CannabisDeskVerification, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CannabisDeskVerification, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(CannabisDeskVerification)this);

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
			<InvocationHandler, CannabisDeskVerification>
				_escapedModelProxyProviderFunction =
					_getProxyProviderFunction();

	}

	private long _cannabisDeskVerificationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _cannabisApplicationId;
	private String _documentStatus;
	private String _documentName;

	public <T> T getColumnValue(String columnName) {
		Function<CannabisDeskVerification, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((CannabisDeskVerification)this);
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
			"cannabisDeskVerificationId", _cannabisDeskVerificationId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"cannabisApplicationId", _cannabisApplicationId);
		_columnOriginalValues.put("documentStatus", _documentStatus);
		_columnOriginalValues.put("documentName", _documentName);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("cannabisDeskVerificationId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("cannabisApplicationId", 128L);

		columnBitmasks.put("documentStatus", 256L);

		columnBitmasks.put("documentName", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private CannabisDeskVerification _escapedModel;

}