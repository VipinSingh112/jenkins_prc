/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

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

import com.nbp.sez.status.application.form.service.model.SezDeveloperDetails;
import com.nbp.sez.status.application.form.service.model.SezDeveloperDetailsModel;

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
 * The base model implementation for the SezDeveloperDetails service. Represents a row in the &quot;nbp_sez_dev_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezDeveloperDetailsModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezDeveloperDetailsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetailsImpl
 * @generated
 */
@JSON(strict = true)
public class SezDeveloperDetailsModelImpl
	extends BaseModelImpl<SezDeveloperDetails>
	implements SezDeveloperDetailsModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez developer details model instance should use the <code>SezDeveloperDetails</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_dev_details";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezDeveloperDetailsId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"developerName", Types.VARCHAR},
		{"developerNumber", Types.VARCHAR}, {"developerControl", Types.VARCHAR},
		{"letterOfApprovalDate", Types.TIMESTAMP},
		{"sezDeveloperDate", Types.TIMESTAMP},
		{"letterOfApprovalEntrtyId", Types.BIGINT},
		{"sezDeveloperAgreementEntryId", Types.BIGINT},
		{"sezStatusApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezDeveloperDetailsId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("developerName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("developerNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("developerControl", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("letterOfApprovalDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("sezDeveloperDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("letterOfApprovalEntrtyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("sezDeveloperAgreementEntryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("sezStatusApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_dev_details (sezDeveloperDetailsId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,developerName VARCHAR(75) null,developerNumber VARCHAR(75) null,developerControl VARCHAR(75) null,letterOfApprovalDate DATE null,sezDeveloperDate DATE null,letterOfApprovalEntrtyId LONG,sezDeveloperAgreementEntryId LONG,sezStatusApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_dev_details";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezDeveloperDetails.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_dev_details.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long SEZSTATUSAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public SezDeveloperDetailsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezDeveloperDetailsId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezDeveloperDetailsId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezDeveloperDetailsId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezDeveloperDetails.class;
	}

	@Override
	public String getModelClassName() {
		return SezDeveloperDetails.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezDeveloperDetails, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezDeveloperDetails, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezDeveloperDetails, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezDeveloperDetails)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezDeveloperDetails, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezDeveloperDetails, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezDeveloperDetails)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezDeveloperDetails, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezDeveloperDetails, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<SezDeveloperDetails, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<SezDeveloperDetails, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezDeveloperDetails, Object>>();

			attributeGetterFunctions.put(
				"sezDeveloperDetailsId",
				SezDeveloperDetails::getSezDeveloperDetailsId);
			attributeGetterFunctions.put(
				"groupId", SezDeveloperDetails::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezDeveloperDetails::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezDeveloperDetails::getUserId);
			attributeGetterFunctions.put(
				"userName", SezDeveloperDetails::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezDeveloperDetails::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezDeveloperDetails::getModifiedDate);
			attributeGetterFunctions.put(
				"developerName", SezDeveloperDetails::getDeveloperName);
			attributeGetterFunctions.put(
				"developerNumber", SezDeveloperDetails::getDeveloperNumber);
			attributeGetterFunctions.put(
				"developerControl", SezDeveloperDetails::getDeveloperControl);
			attributeGetterFunctions.put(
				"letterOfApprovalDate",
				SezDeveloperDetails::getLetterOfApprovalDate);
			attributeGetterFunctions.put(
				"sezDeveloperDate", SezDeveloperDetails::getSezDeveloperDate);
			attributeGetterFunctions.put(
				"letterOfApprovalEntrtyId",
				SezDeveloperDetails::getLetterOfApprovalEntrtyId);
			attributeGetterFunctions.put(
				"sezDeveloperAgreementEntryId",
				SezDeveloperDetails::getSezDeveloperAgreementEntryId);
			attributeGetterFunctions.put(
				"sezStatusApplicationId",
				SezDeveloperDetails::getSezStatusApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<SezDeveloperDetails, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezDeveloperDetails, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezDeveloperDetails, ?>>();

			attributeSetterBiConsumers.put(
				"sezDeveloperDetailsId",
				(BiConsumer<SezDeveloperDetails, Long>)
					SezDeveloperDetails::setSezDeveloperDetailsId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezDeveloperDetails, Long>)
					SezDeveloperDetails::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezDeveloperDetails, Long>)
					SezDeveloperDetails::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezDeveloperDetails, Long>)
					SezDeveloperDetails::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezDeveloperDetails, String>)
					SezDeveloperDetails::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezDeveloperDetails, Date>)
					SezDeveloperDetails::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezDeveloperDetails, Date>)
					SezDeveloperDetails::setModifiedDate);
			attributeSetterBiConsumers.put(
				"developerName",
				(BiConsumer<SezDeveloperDetails, String>)
					SezDeveloperDetails::setDeveloperName);
			attributeSetterBiConsumers.put(
				"developerNumber",
				(BiConsumer<SezDeveloperDetails, String>)
					SezDeveloperDetails::setDeveloperNumber);
			attributeSetterBiConsumers.put(
				"developerControl",
				(BiConsumer<SezDeveloperDetails, String>)
					SezDeveloperDetails::setDeveloperControl);
			attributeSetterBiConsumers.put(
				"letterOfApprovalDate",
				(BiConsumer<SezDeveloperDetails, Date>)
					SezDeveloperDetails::setLetterOfApprovalDate);
			attributeSetterBiConsumers.put(
				"sezDeveloperDate",
				(BiConsumer<SezDeveloperDetails, Date>)
					SezDeveloperDetails::setSezDeveloperDate);
			attributeSetterBiConsumers.put(
				"letterOfApprovalEntrtyId",
				(BiConsumer<SezDeveloperDetails, Long>)
					SezDeveloperDetails::setLetterOfApprovalEntrtyId);
			attributeSetterBiConsumers.put(
				"sezDeveloperAgreementEntryId",
				(BiConsumer<SezDeveloperDetails, Long>)
					SezDeveloperDetails::setSezDeveloperAgreementEntryId);
			attributeSetterBiConsumers.put(
				"sezStatusApplicationId",
				(BiConsumer<SezDeveloperDetails, Long>)
					SezDeveloperDetails::setSezStatusApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezDeveloperDetailsId() {
		return _sezDeveloperDetailsId;
	}

	@Override
	public void setSezDeveloperDetailsId(long sezDeveloperDetailsId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezDeveloperDetailsId = sezDeveloperDetailsId;
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
	public String getDeveloperName() {
		if (_developerName == null) {
			return "";
		}
		else {
			return _developerName;
		}
	}

	@Override
	public void setDeveloperName(String developerName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_developerName = developerName;
	}

	@JSON
	@Override
	public String getDeveloperNumber() {
		if (_developerNumber == null) {
			return "";
		}
		else {
			return _developerNumber;
		}
	}

	@Override
	public void setDeveloperNumber(String developerNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_developerNumber = developerNumber;
	}

	@JSON
	@Override
	public String getDeveloperControl() {
		if (_developerControl == null) {
			return "";
		}
		else {
			return _developerControl;
		}
	}

	@Override
	public void setDeveloperControl(String developerControl) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_developerControl = developerControl;
	}

	@JSON
	@Override
	public Date getLetterOfApprovalDate() {
		return _letterOfApprovalDate;
	}

	@Override
	public void setLetterOfApprovalDate(Date letterOfApprovalDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_letterOfApprovalDate = letterOfApprovalDate;
	}

	@JSON
	@Override
	public Date getSezDeveloperDate() {
		return _sezDeveloperDate;
	}

	@Override
	public void setSezDeveloperDate(Date sezDeveloperDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezDeveloperDate = sezDeveloperDate;
	}

	@JSON
	@Override
	public long getLetterOfApprovalEntrtyId() {
		return _letterOfApprovalEntrtyId;
	}

	@Override
	public void setLetterOfApprovalEntrtyId(long letterOfApprovalEntrtyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_letterOfApprovalEntrtyId = letterOfApprovalEntrtyId;
	}

	@JSON
	@Override
	public long getSezDeveloperAgreementEntryId() {
		return _sezDeveloperAgreementEntryId;
	}

	@Override
	public void setSezDeveloperAgreementEntryId(
		long sezDeveloperAgreementEntryId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezDeveloperAgreementEntryId = sezDeveloperAgreementEntryId;
	}

	@JSON
	@Override
	public long getSezStatusApplicationId() {
		return _sezStatusApplicationId;
	}

	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezStatusApplicationId = sezStatusApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalSezStatusApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));
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
			getCompanyId(), SezDeveloperDetails.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezDeveloperDetails toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezDeveloperDetails>
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
		SezDeveloperDetailsImpl sezDeveloperDetailsImpl =
			new SezDeveloperDetailsImpl();

		sezDeveloperDetailsImpl.setSezDeveloperDetailsId(
			getSezDeveloperDetailsId());
		sezDeveloperDetailsImpl.setGroupId(getGroupId());
		sezDeveloperDetailsImpl.setCompanyId(getCompanyId());
		sezDeveloperDetailsImpl.setUserId(getUserId());
		sezDeveloperDetailsImpl.setUserName(getUserName());
		sezDeveloperDetailsImpl.setCreateDate(getCreateDate());
		sezDeveloperDetailsImpl.setModifiedDate(getModifiedDate());
		sezDeveloperDetailsImpl.setDeveloperName(getDeveloperName());
		sezDeveloperDetailsImpl.setDeveloperNumber(getDeveloperNumber());
		sezDeveloperDetailsImpl.setDeveloperControl(getDeveloperControl());
		sezDeveloperDetailsImpl.setLetterOfApprovalDate(
			getLetterOfApprovalDate());
		sezDeveloperDetailsImpl.setSezDeveloperDate(getSezDeveloperDate());
		sezDeveloperDetailsImpl.setLetterOfApprovalEntrtyId(
			getLetterOfApprovalEntrtyId());
		sezDeveloperDetailsImpl.setSezDeveloperAgreementEntryId(
			getSezDeveloperAgreementEntryId());
		sezDeveloperDetailsImpl.setSezStatusApplicationId(
			getSezStatusApplicationId());

		sezDeveloperDetailsImpl.resetOriginalValues();

		return sezDeveloperDetailsImpl;
	}

	@Override
	public SezDeveloperDetails cloneWithOriginalValues() {
		SezDeveloperDetailsImpl sezDeveloperDetailsImpl =
			new SezDeveloperDetailsImpl();

		sezDeveloperDetailsImpl.setSezDeveloperDetailsId(
			this.<Long>getColumnOriginalValue("sezDeveloperDetailsId"));
		sezDeveloperDetailsImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezDeveloperDetailsImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezDeveloperDetailsImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezDeveloperDetailsImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezDeveloperDetailsImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezDeveloperDetailsImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezDeveloperDetailsImpl.setDeveloperName(
			this.<String>getColumnOriginalValue("developerName"));
		sezDeveloperDetailsImpl.setDeveloperNumber(
			this.<String>getColumnOriginalValue("developerNumber"));
		sezDeveloperDetailsImpl.setDeveloperControl(
			this.<String>getColumnOriginalValue("developerControl"));
		sezDeveloperDetailsImpl.setLetterOfApprovalDate(
			this.<Date>getColumnOriginalValue("letterOfApprovalDate"));
		sezDeveloperDetailsImpl.setSezDeveloperDate(
			this.<Date>getColumnOriginalValue("sezDeveloperDate"));
		sezDeveloperDetailsImpl.setLetterOfApprovalEntrtyId(
			this.<Long>getColumnOriginalValue("letterOfApprovalEntrtyId"));
		sezDeveloperDetailsImpl.setSezDeveloperAgreementEntryId(
			this.<Long>getColumnOriginalValue("sezDeveloperAgreementEntryId"));
		sezDeveloperDetailsImpl.setSezStatusApplicationId(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));

		return sezDeveloperDetailsImpl;
	}

	@Override
	public int compareTo(SezDeveloperDetails sezDeveloperDetails) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezDeveloperDetails.getCreateDate());

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

		if (!(object instanceof SezDeveloperDetails)) {
			return false;
		}

		SezDeveloperDetails sezDeveloperDetails = (SezDeveloperDetails)object;

		long primaryKey = sezDeveloperDetails.getPrimaryKey();

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
	public CacheModel<SezDeveloperDetails> toCacheModel() {
		SezDeveloperDetailsCacheModel sezDeveloperDetailsCacheModel =
			new SezDeveloperDetailsCacheModel();

		sezDeveloperDetailsCacheModel.sezDeveloperDetailsId =
			getSezDeveloperDetailsId();

		sezDeveloperDetailsCacheModel.groupId = getGroupId();

		sezDeveloperDetailsCacheModel.companyId = getCompanyId();

		sezDeveloperDetailsCacheModel.userId = getUserId();

		sezDeveloperDetailsCacheModel.userName = getUserName();

		String userName = sezDeveloperDetailsCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezDeveloperDetailsCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezDeveloperDetailsCacheModel.createDate = createDate.getTime();
		}
		else {
			sezDeveloperDetailsCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezDeveloperDetailsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			sezDeveloperDetailsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezDeveloperDetailsCacheModel.developerName = getDeveloperName();

		String developerName = sezDeveloperDetailsCacheModel.developerName;

		if ((developerName != null) && (developerName.length() == 0)) {
			sezDeveloperDetailsCacheModel.developerName = null;
		}

		sezDeveloperDetailsCacheModel.developerNumber = getDeveloperNumber();

		String developerNumber = sezDeveloperDetailsCacheModel.developerNumber;

		if ((developerNumber != null) && (developerNumber.length() == 0)) {
			sezDeveloperDetailsCacheModel.developerNumber = null;
		}

		sezDeveloperDetailsCacheModel.developerControl = getDeveloperControl();

		String developerControl =
			sezDeveloperDetailsCacheModel.developerControl;

		if ((developerControl != null) && (developerControl.length() == 0)) {
			sezDeveloperDetailsCacheModel.developerControl = null;
		}

		Date letterOfApprovalDate = getLetterOfApprovalDate();

		if (letterOfApprovalDate != null) {
			sezDeveloperDetailsCacheModel.letterOfApprovalDate =
				letterOfApprovalDate.getTime();
		}
		else {
			sezDeveloperDetailsCacheModel.letterOfApprovalDate = Long.MIN_VALUE;
		}

		Date sezDeveloperDate = getSezDeveloperDate();

		if (sezDeveloperDate != null) {
			sezDeveloperDetailsCacheModel.sezDeveloperDate =
				sezDeveloperDate.getTime();
		}
		else {
			sezDeveloperDetailsCacheModel.sezDeveloperDate = Long.MIN_VALUE;
		}

		sezDeveloperDetailsCacheModel.letterOfApprovalEntrtyId =
			getLetterOfApprovalEntrtyId();

		sezDeveloperDetailsCacheModel.sezDeveloperAgreementEntryId =
			getSezDeveloperAgreementEntryId();

		sezDeveloperDetailsCacheModel.sezStatusApplicationId =
			getSezStatusApplicationId();

		return sezDeveloperDetailsCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezDeveloperDetails, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezDeveloperDetails, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezDeveloperDetails, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezDeveloperDetails)this);

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

		private static final Function<InvocationHandler, SezDeveloperDetails>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					SezDeveloperDetails.class, ModelWrapper.class);

	}

	private long _sezDeveloperDetailsId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _developerName;
	private String _developerNumber;
	private String _developerControl;
	private Date _letterOfApprovalDate;
	private Date _sezDeveloperDate;
	private long _letterOfApprovalEntrtyId;
	private long _sezDeveloperAgreementEntryId;
	private long _sezStatusApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<SezDeveloperDetails, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezDeveloperDetails)this);
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
			"sezDeveloperDetailsId", _sezDeveloperDetailsId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("developerName", _developerName);
		_columnOriginalValues.put("developerNumber", _developerNumber);
		_columnOriginalValues.put("developerControl", _developerControl);
		_columnOriginalValues.put(
			"letterOfApprovalDate", _letterOfApprovalDate);
		_columnOriginalValues.put("sezDeveloperDate", _sezDeveloperDate);
		_columnOriginalValues.put(
			"letterOfApprovalEntrtyId", _letterOfApprovalEntrtyId);
		_columnOriginalValues.put(
			"sezDeveloperAgreementEntryId", _sezDeveloperAgreementEntryId);
		_columnOriginalValues.put(
			"sezStatusApplicationId", _sezStatusApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("sezDeveloperDetailsId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("developerName", 128L);

		columnBitmasks.put("developerNumber", 256L);

		columnBitmasks.put("developerControl", 512L);

		columnBitmasks.put("letterOfApprovalDate", 1024L);

		columnBitmasks.put("sezDeveloperDate", 2048L);

		columnBitmasks.put("letterOfApprovalEntrtyId", 4096L);

		columnBitmasks.put("sezDeveloperAgreementEntryId", 8192L);

		columnBitmasks.put("sezStatusApplicationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezDeveloperDetails _escapedModel;

}