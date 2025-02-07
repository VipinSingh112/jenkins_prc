/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
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
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;
import com.nbp.jadsc.application.form.service.model.JADSCOathRequestModel;

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
 * The base model implementation for the JADSCOathRequest service. Represents a row in the &quot;nbp_jadsc_oath_request&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>JADSCOathRequestModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JADSCOathRequestImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequestImpl
 * @generated
 */
@JSON(strict = true)
public class JADSCOathRequestModelImpl
	extends BaseModelImpl<JADSCOathRequest> implements JADSCOathRequestModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a jadsc oath request model instance should use the <code>JADSCOathRequest</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_jadsc_oath_request";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"jadscOathRequestId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"investigationType", Types.VARCHAR}, {"partyName", Types.VARCHAR},
		{"requestReason", Types.VARCHAR}, {"comOfficial", Types.VARCHAR},
		{"signatureDate", Types.TIMESTAMP}, {"jadscApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jadscOathRequestId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("investigationType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("partyName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("requestReason", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comOfficial", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("signatureDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("jadscApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_jadsc_oath_request (uuid_ VARCHAR(75) null,jadscOathRequestId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,investigationType VARCHAR(75) null,partyName VARCHAR(75) null,requestReason VARCHAR(75) null,comOfficial VARCHAR(75) null,signatureDate DATE null,jadscApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_jadsc_oath_request";

	public static final String ORDER_BY_JPQL =
		" ORDER BY jadscOathRequest.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_jadsc_oath_request.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long JADSCAPPLICATIONID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 16L;

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

	public JADSCOathRequestModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _jadscOathRequestId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJadscOathRequestId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jadscOathRequestId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return JADSCOathRequest.class;
	}

	@Override
	public String getModelClassName() {
		return JADSCOathRequest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<JADSCOathRequest, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<JADSCOathRequest, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<JADSCOathRequest, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((JADSCOathRequest)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<JADSCOathRequest, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<JADSCOathRequest, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(JADSCOathRequest)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<JADSCOathRequest, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<JADSCOathRequest, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<JADSCOathRequest, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<JADSCOathRequest, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<JADSCOathRequest, Object>>();

			attributeGetterFunctions.put("uuid", JADSCOathRequest::getUuid);
			attributeGetterFunctions.put(
				"jadscOathRequestId", JADSCOathRequest::getJadscOathRequestId);
			attributeGetterFunctions.put(
				"groupId", JADSCOathRequest::getGroupId);
			attributeGetterFunctions.put(
				"companyId", JADSCOathRequest::getCompanyId);
			attributeGetterFunctions.put("userId", JADSCOathRequest::getUserId);
			attributeGetterFunctions.put(
				"userName", JADSCOathRequest::getUserName);
			attributeGetterFunctions.put(
				"createDate", JADSCOathRequest::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", JADSCOathRequest::getModifiedDate);
			attributeGetterFunctions.put(
				"investigationType", JADSCOathRequest::getInvestigationType);
			attributeGetterFunctions.put(
				"partyName", JADSCOathRequest::getPartyName);
			attributeGetterFunctions.put(
				"requestReason", JADSCOathRequest::getRequestReason);
			attributeGetterFunctions.put(
				"comOfficial", JADSCOathRequest::getComOfficial);
			attributeGetterFunctions.put(
				"signatureDate", JADSCOathRequest::getSignatureDate);
			attributeGetterFunctions.put(
				"jadscApplicationId", JADSCOathRequest::getJadscApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<JADSCOathRequest, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<JADSCOathRequest, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<JADSCOathRequest, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<JADSCOathRequest, String>)
					JADSCOathRequest::setUuid);
			attributeSetterBiConsumers.put(
				"jadscOathRequestId",
				(BiConsumer<JADSCOathRequest, Long>)
					JADSCOathRequest::setJadscOathRequestId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<JADSCOathRequest, Long>)
					JADSCOathRequest::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<JADSCOathRequest, Long>)
					JADSCOathRequest::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<JADSCOathRequest, Long>)
					JADSCOathRequest::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<JADSCOathRequest, String>)
					JADSCOathRequest::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<JADSCOathRequest, Date>)
					JADSCOathRequest::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<JADSCOathRequest, Date>)
					JADSCOathRequest::setModifiedDate);
			attributeSetterBiConsumers.put(
				"investigationType",
				(BiConsumer<JADSCOathRequest, String>)
					JADSCOathRequest::setInvestigationType);
			attributeSetterBiConsumers.put(
				"partyName",
				(BiConsumer<JADSCOathRequest, String>)
					JADSCOathRequest::setPartyName);
			attributeSetterBiConsumers.put(
				"requestReason",
				(BiConsumer<JADSCOathRequest, String>)
					JADSCOathRequest::setRequestReason);
			attributeSetterBiConsumers.put(
				"comOfficial",
				(BiConsumer<JADSCOathRequest, String>)
					JADSCOathRequest::setComOfficial);
			attributeSetterBiConsumers.put(
				"signatureDate",
				(BiConsumer<JADSCOathRequest, Date>)
					JADSCOathRequest::setSignatureDate);
			attributeSetterBiConsumers.put(
				"jadscApplicationId",
				(BiConsumer<JADSCOathRequest, Long>)
					JADSCOathRequest::setJadscApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getJadscOathRequestId() {
		return _jadscOathRequestId;
	}

	@Override
	public void setJadscOathRequestId(long jadscOathRequestId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jadscOathRequestId = jadscOathRequestId;
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

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
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

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
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
	public String getInvestigationType() {
		if (_investigationType == null) {
			return "";
		}
		else {
			return _investigationType;
		}
	}

	@Override
	public void setInvestigationType(String investigationType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_investigationType = investigationType;
	}

	@JSON
	@Override
	public String getPartyName() {
		if (_partyName == null) {
			return "";
		}
		else {
			return _partyName;
		}
	}

	@Override
	public void setPartyName(String partyName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_partyName = partyName;
	}

	@JSON
	@Override
	public String getRequestReason() {
		if (_requestReason == null) {
			return "";
		}
		else {
			return _requestReason;
		}
	}

	@Override
	public void setRequestReason(String requestReason) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_requestReason = requestReason;
	}

	@JSON
	@Override
	public String getComOfficial() {
		if (_comOfficial == null) {
			return "";
		}
		else {
			return _comOfficial;
		}
	}

	@Override
	public void setComOfficial(String comOfficial) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comOfficial = comOfficial;
	}

	@JSON
	@Override
	public Date getSignatureDate() {
		return _signatureDate;
	}

	@Override
	public void setSignatureDate(Date signatureDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_signatureDate = signatureDate;
	}

	@JSON
	@Override
	public long getJadscApplicationId() {
		return _jadscApplicationId;
	}

	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jadscApplicationId = jadscApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalJadscApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("jadscApplicationId"));
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(JADSCOathRequest.class.getName()));
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
			getCompanyId(), JADSCOathRequest.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public JADSCOathRequest toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, JADSCOathRequest>
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
		JADSCOathRequestImpl jadscOathRequestImpl = new JADSCOathRequestImpl();

		jadscOathRequestImpl.setUuid(getUuid());
		jadscOathRequestImpl.setJadscOathRequestId(getJadscOathRequestId());
		jadscOathRequestImpl.setGroupId(getGroupId());
		jadscOathRequestImpl.setCompanyId(getCompanyId());
		jadscOathRequestImpl.setUserId(getUserId());
		jadscOathRequestImpl.setUserName(getUserName());
		jadscOathRequestImpl.setCreateDate(getCreateDate());
		jadscOathRequestImpl.setModifiedDate(getModifiedDate());
		jadscOathRequestImpl.setInvestigationType(getInvestigationType());
		jadscOathRequestImpl.setPartyName(getPartyName());
		jadscOathRequestImpl.setRequestReason(getRequestReason());
		jadscOathRequestImpl.setComOfficial(getComOfficial());
		jadscOathRequestImpl.setSignatureDate(getSignatureDate());
		jadscOathRequestImpl.setJadscApplicationId(getJadscApplicationId());

		jadscOathRequestImpl.resetOriginalValues();

		return jadscOathRequestImpl;
	}

	@Override
	public JADSCOathRequest cloneWithOriginalValues() {
		JADSCOathRequestImpl jadscOathRequestImpl = new JADSCOathRequestImpl();

		jadscOathRequestImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		jadscOathRequestImpl.setJadscOathRequestId(
			this.<Long>getColumnOriginalValue("jadscOathRequestId"));
		jadscOathRequestImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		jadscOathRequestImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		jadscOathRequestImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		jadscOathRequestImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		jadscOathRequestImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		jadscOathRequestImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		jadscOathRequestImpl.setInvestigationType(
			this.<String>getColumnOriginalValue("investigationType"));
		jadscOathRequestImpl.setPartyName(
			this.<String>getColumnOriginalValue("partyName"));
		jadscOathRequestImpl.setRequestReason(
			this.<String>getColumnOriginalValue("requestReason"));
		jadscOathRequestImpl.setComOfficial(
			this.<String>getColumnOriginalValue("comOfficial"));
		jadscOathRequestImpl.setSignatureDate(
			this.<Date>getColumnOriginalValue("signatureDate"));
		jadscOathRequestImpl.setJadscApplicationId(
			this.<Long>getColumnOriginalValue("jadscApplicationId"));

		return jadscOathRequestImpl;
	}

	@Override
	public int compareTo(JADSCOathRequest jadscOathRequest) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), jadscOathRequest.getCreateDate());

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

		if (!(object instanceof JADSCOathRequest)) {
			return false;
		}

		JADSCOathRequest jadscOathRequest = (JADSCOathRequest)object;

		long primaryKey = jadscOathRequest.getPrimaryKey();

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
	public CacheModel<JADSCOathRequest> toCacheModel() {
		JADSCOathRequestCacheModel jadscOathRequestCacheModel =
			new JADSCOathRequestCacheModel();

		jadscOathRequestCacheModel.uuid = getUuid();

		String uuid = jadscOathRequestCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			jadscOathRequestCacheModel.uuid = null;
		}

		jadscOathRequestCacheModel.jadscOathRequestId = getJadscOathRequestId();

		jadscOathRequestCacheModel.groupId = getGroupId();

		jadscOathRequestCacheModel.companyId = getCompanyId();

		jadscOathRequestCacheModel.userId = getUserId();

		jadscOathRequestCacheModel.userName = getUserName();

		String userName = jadscOathRequestCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			jadscOathRequestCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			jadscOathRequestCacheModel.createDate = createDate.getTime();
		}
		else {
			jadscOathRequestCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			jadscOathRequestCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			jadscOathRequestCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		jadscOathRequestCacheModel.investigationType = getInvestigationType();

		String investigationType = jadscOathRequestCacheModel.investigationType;

		if ((investigationType != null) && (investigationType.length() == 0)) {
			jadscOathRequestCacheModel.investigationType = null;
		}

		jadscOathRequestCacheModel.partyName = getPartyName();

		String partyName = jadscOathRequestCacheModel.partyName;

		if ((partyName != null) && (partyName.length() == 0)) {
			jadscOathRequestCacheModel.partyName = null;
		}

		jadscOathRequestCacheModel.requestReason = getRequestReason();

		String requestReason = jadscOathRequestCacheModel.requestReason;

		if ((requestReason != null) && (requestReason.length() == 0)) {
			jadscOathRequestCacheModel.requestReason = null;
		}

		jadscOathRequestCacheModel.comOfficial = getComOfficial();

		String comOfficial = jadscOathRequestCacheModel.comOfficial;

		if ((comOfficial != null) && (comOfficial.length() == 0)) {
			jadscOathRequestCacheModel.comOfficial = null;
		}

		Date signatureDate = getSignatureDate();

		if (signatureDate != null) {
			jadscOathRequestCacheModel.signatureDate = signatureDate.getTime();
		}
		else {
			jadscOathRequestCacheModel.signatureDate = Long.MIN_VALUE;
		}

		jadscOathRequestCacheModel.jadscApplicationId = getJadscApplicationId();

		return jadscOathRequestCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<JADSCOathRequest, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<JADSCOathRequest, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<JADSCOathRequest, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(JADSCOathRequest)this);

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

		private static final Function<InvocationHandler, JADSCOathRequest>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					JADSCOathRequest.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _jadscOathRequestId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _investigationType;
	private String _partyName;
	private String _requestReason;
	private String _comOfficial;
	private Date _signatureDate;
	private long _jadscApplicationId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<JADSCOathRequest, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((JADSCOathRequest)this);
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

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("jadscOathRequestId", _jadscOathRequestId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("investigationType", _investigationType);
		_columnOriginalValues.put("partyName", _partyName);
		_columnOriginalValues.put("requestReason", _requestReason);
		_columnOriginalValues.put("comOfficial", _comOfficial);
		_columnOriginalValues.put("signatureDate", _signatureDate);
		_columnOriginalValues.put("jadscApplicationId", _jadscApplicationId);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("jadscOathRequestId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("investigationType", 256L);

		columnBitmasks.put("partyName", 512L);

		columnBitmasks.put("requestReason", 1024L);

		columnBitmasks.put("comOfficial", 2048L);

		columnBitmasks.put("signatureDate", 4096L);

		columnBitmasks.put("jadscApplicationId", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private JADSCOathRequest _escapedModel;

}