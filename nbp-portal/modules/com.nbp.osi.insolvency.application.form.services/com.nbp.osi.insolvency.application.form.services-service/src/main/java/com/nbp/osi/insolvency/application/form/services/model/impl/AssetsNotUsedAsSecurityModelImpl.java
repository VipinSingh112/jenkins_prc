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

import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity;
import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurityModel;

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
 * The base model implementation for the AssetsNotUsedAsSecurity service. Represents a row in the &quot;nbp_osi_not_used_security&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AssetsNotUsedAsSecurityModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AssetsNotUsedAsSecurityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssetsNotUsedAsSecurityImpl
 * @generated
 */
@JSON(strict = true)
public class AssetsNotUsedAsSecurityModelImpl
	extends BaseModelImpl<AssetsNotUsedAsSecurity>
	implements AssetsNotUsedAsSecurityModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a assets not used as security model instance should use the <code>AssetsNotUsedAsSecurity</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_not_used_security";

	public static final Object[][] TABLE_COLUMNS = {
		{"assetsNotUsedAsSecurityId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"assetRealProp", Types.VARCHAR},
		{"assetNoValue", Types.VARCHAR}, {"assetDescription", Types.VARCHAR},
		{"assetNoCounter", Types.VARCHAR},
		{"comTotalAssetNotUsedSecurity", Types.VARCHAR},
		{"osiInsolvencyId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("assetsNotUsedAsSecurityId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("assetRealProp", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("assetNoValue", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("assetDescription", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("assetNoCounter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comTotalAssetNotUsedSecurity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiInsolvencyId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_not_used_security (assetsNotUsedAsSecurityId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,assetRealProp VARCHAR(75) null,assetNoValue VARCHAR(75) null,assetDescription VARCHAR(500) null,assetNoCounter VARCHAR(75) null,comTotalAssetNotUsedSecurity VARCHAR(75) null,osiInsolvencyId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_not_used_security";

	public static final String ORDER_BY_JPQL =
		" ORDER BY assetsNotUsedAsSecurity.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_not_used_security.createDate ASC";

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

	public AssetsNotUsedAsSecurityModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _assetsNotUsedAsSecurityId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAssetsNotUsedAsSecurityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _assetsNotUsedAsSecurityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AssetsNotUsedAsSecurity.class;
	}

	@Override
	public String getModelClassName() {
		return AssetsNotUsedAsSecurity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AssetsNotUsedAsSecurity, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AssetsNotUsedAsSecurity, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AssetsNotUsedAsSecurity, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AssetsNotUsedAsSecurity)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AssetsNotUsedAsSecurity, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AssetsNotUsedAsSecurity, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AssetsNotUsedAsSecurity)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AssetsNotUsedAsSecurity, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AssetsNotUsedAsSecurity, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<AssetsNotUsedAsSecurity, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<AssetsNotUsedAsSecurity, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AssetsNotUsedAsSecurity, Object>>();

			attributeGetterFunctions.put(
				"assetsNotUsedAsSecurityId",
				AssetsNotUsedAsSecurity::getAssetsNotUsedAsSecurityId);
			attributeGetterFunctions.put(
				"groupId", AssetsNotUsedAsSecurity::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AssetsNotUsedAsSecurity::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AssetsNotUsedAsSecurity::getUserId);
			attributeGetterFunctions.put(
				"userName", AssetsNotUsedAsSecurity::getUserName);
			attributeGetterFunctions.put(
				"createDate", AssetsNotUsedAsSecurity::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AssetsNotUsedAsSecurity::getModifiedDate);
			attributeGetterFunctions.put(
				"assetRealProp", AssetsNotUsedAsSecurity::getAssetRealProp);
			attributeGetterFunctions.put(
				"assetNoValue", AssetsNotUsedAsSecurity::getAssetNoValue);
			attributeGetterFunctions.put(
				"assetDescription",
				AssetsNotUsedAsSecurity::getAssetDescription);
			attributeGetterFunctions.put(
				"assetNoCounter", AssetsNotUsedAsSecurity::getAssetNoCounter);
			attributeGetterFunctions.put(
				"comTotalAssetNotUsedSecurity",
				AssetsNotUsedAsSecurity::getComTotalAssetNotUsedSecurity);
			attributeGetterFunctions.put(
				"osiInsolvencyId", AssetsNotUsedAsSecurity::getOsiInsolvencyId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AssetsNotUsedAsSecurity, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AssetsNotUsedAsSecurity, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AssetsNotUsedAsSecurity, ?>>();

			attributeSetterBiConsumers.put(
				"assetsNotUsedAsSecurityId",
				(BiConsumer<AssetsNotUsedAsSecurity, Long>)
					AssetsNotUsedAsSecurity::setAssetsNotUsedAsSecurityId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AssetsNotUsedAsSecurity, Long>)
					AssetsNotUsedAsSecurity::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AssetsNotUsedAsSecurity, Long>)
					AssetsNotUsedAsSecurity::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AssetsNotUsedAsSecurity, Long>)
					AssetsNotUsedAsSecurity::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AssetsNotUsedAsSecurity, String>)
					AssetsNotUsedAsSecurity::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AssetsNotUsedAsSecurity, Date>)
					AssetsNotUsedAsSecurity::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AssetsNotUsedAsSecurity, Date>)
					AssetsNotUsedAsSecurity::setModifiedDate);
			attributeSetterBiConsumers.put(
				"assetRealProp",
				(BiConsumer<AssetsNotUsedAsSecurity, String>)
					AssetsNotUsedAsSecurity::setAssetRealProp);
			attributeSetterBiConsumers.put(
				"assetNoValue",
				(BiConsumer<AssetsNotUsedAsSecurity, String>)
					AssetsNotUsedAsSecurity::setAssetNoValue);
			attributeSetterBiConsumers.put(
				"assetDescription",
				(BiConsumer<AssetsNotUsedAsSecurity, String>)
					AssetsNotUsedAsSecurity::setAssetDescription);
			attributeSetterBiConsumers.put(
				"assetNoCounter",
				(BiConsumer<AssetsNotUsedAsSecurity, String>)
					AssetsNotUsedAsSecurity::setAssetNoCounter);
			attributeSetterBiConsumers.put(
				"comTotalAssetNotUsedSecurity",
				(BiConsumer<AssetsNotUsedAsSecurity, String>)
					AssetsNotUsedAsSecurity::setComTotalAssetNotUsedSecurity);
			attributeSetterBiConsumers.put(
				"osiInsolvencyId",
				(BiConsumer<AssetsNotUsedAsSecurity, Long>)
					AssetsNotUsedAsSecurity::setOsiInsolvencyId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAssetsNotUsedAsSecurityId() {
		return _assetsNotUsedAsSecurityId;
	}

	@Override
	public void setAssetsNotUsedAsSecurityId(long assetsNotUsedAsSecurityId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assetsNotUsedAsSecurityId = assetsNotUsedAsSecurityId;
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
	public String getAssetRealProp() {
		if (_assetRealProp == null) {
			return "";
		}
		else {
			return _assetRealProp;
		}
	}

	@Override
	public void setAssetRealProp(String assetRealProp) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assetRealProp = assetRealProp;
	}

	@JSON
	@Override
	public String getAssetNoValue() {
		if (_assetNoValue == null) {
			return "";
		}
		else {
			return _assetNoValue;
		}
	}

	@Override
	public void setAssetNoValue(String assetNoValue) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assetNoValue = assetNoValue;
	}

	@JSON
	@Override
	public String getAssetDescription() {
		if (_assetDescription == null) {
			return "";
		}
		else {
			return _assetDescription;
		}
	}

	@Override
	public void setAssetDescription(String assetDescription) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assetDescription = assetDescription;
	}

	@JSON
	@Override
	public String getAssetNoCounter() {
		if (_assetNoCounter == null) {
			return "";
		}
		else {
			return _assetNoCounter;
		}
	}

	@Override
	public void setAssetNoCounter(String assetNoCounter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assetNoCounter = assetNoCounter;
	}

	@JSON
	@Override
	public String getComTotalAssetNotUsedSecurity() {
		if (_comTotalAssetNotUsedSecurity == null) {
			return "";
		}
		else {
			return _comTotalAssetNotUsedSecurity;
		}
	}

	@Override
	public void setComTotalAssetNotUsedSecurity(
		String comTotalAssetNotUsedSecurity) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comTotalAssetNotUsedSecurity = comTotalAssetNotUsedSecurity;
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
			getCompanyId(), AssetsNotUsedAsSecurity.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AssetsNotUsedAsSecurity toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AssetsNotUsedAsSecurity>
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
		AssetsNotUsedAsSecurityImpl assetsNotUsedAsSecurityImpl =
			new AssetsNotUsedAsSecurityImpl();

		assetsNotUsedAsSecurityImpl.setAssetsNotUsedAsSecurityId(
			getAssetsNotUsedAsSecurityId());
		assetsNotUsedAsSecurityImpl.setGroupId(getGroupId());
		assetsNotUsedAsSecurityImpl.setCompanyId(getCompanyId());
		assetsNotUsedAsSecurityImpl.setUserId(getUserId());
		assetsNotUsedAsSecurityImpl.setUserName(getUserName());
		assetsNotUsedAsSecurityImpl.setCreateDate(getCreateDate());
		assetsNotUsedAsSecurityImpl.setModifiedDate(getModifiedDate());
		assetsNotUsedAsSecurityImpl.setAssetRealProp(getAssetRealProp());
		assetsNotUsedAsSecurityImpl.setAssetNoValue(getAssetNoValue());
		assetsNotUsedAsSecurityImpl.setAssetDescription(getAssetDescription());
		assetsNotUsedAsSecurityImpl.setAssetNoCounter(getAssetNoCounter());
		assetsNotUsedAsSecurityImpl.setComTotalAssetNotUsedSecurity(
			getComTotalAssetNotUsedSecurity());
		assetsNotUsedAsSecurityImpl.setOsiInsolvencyId(getOsiInsolvencyId());

		assetsNotUsedAsSecurityImpl.resetOriginalValues();

		return assetsNotUsedAsSecurityImpl;
	}

	@Override
	public AssetsNotUsedAsSecurity cloneWithOriginalValues() {
		AssetsNotUsedAsSecurityImpl assetsNotUsedAsSecurityImpl =
			new AssetsNotUsedAsSecurityImpl();

		assetsNotUsedAsSecurityImpl.setAssetsNotUsedAsSecurityId(
			this.<Long>getColumnOriginalValue("assetsNotUsedAsSecurityId"));
		assetsNotUsedAsSecurityImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		assetsNotUsedAsSecurityImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		assetsNotUsedAsSecurityImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		assetsNotUsedAsSecurityImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		assetsNotUsedAsSecurityImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		assetsNotUsedAsSecurityImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		assetsNotUsedAsSecurityImpl.setAssetRealProp(
			this.<String>getColumnOriginalValue("assetRealProp"));
		assetsNotUsedAsSecurityImpl.setAssetNoValue(
			this.<String>getColumnOriginalValue("assetNoValue"));
		assetsNotUsedAsSecurityImpl.setAssetDescription(
			this.<String>getColumnOriginalValue("assetDescription"));
		assetsNotUsedAsSecurityImpl.setAssetNoCounter(
			this.<String>getColumnOriginalValue("assetNoCounter"));
		assetsNotUsedAsSecurityImpl.setComTotalAssetNotUsedSecurity(
			this.<String>getColumnOriginalValue(
				"comTotalAssetNotUsedSecurity"));
		assetsNotUsedAsSecurityImpl.setOsiInsolvencyId(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));

		return assetsNotUsedAsSecurityImpl;
	}

	@Override
	public int compareTo(AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), assetsNotUsedAsSecurity.getCreateDate());

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

		if (!(object instanceof AssetsNotUsedAsSecurity)) {
			return false;
		}

		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity =
			(AssetsNotUsedAsSecurity)object;

		long primaryKey = assetsNotUsedAsSecurity.getPrimaryKey();

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
	public CacheModel<AssetsNotUsedAsSecurity> toCacheModel() {
		AssetsNotUsedAsSecurityCacheModel assetsNotUsedAsSecurityCacheModel =
			new AssetsNotUsedAsSecurityCacheModel();

		assetsNotUsedAsSecurityCacheModel.assetsNotUsedAsSecurityId =
			getAssetsNotUsedAsSecurityId();

		assetsNotUsedAsSecurityCacheModel.groupId = getGroupId();

		assetsNotUsedAsSecurityCacheModel.companyId = getCompanyId();

		assetsNotUsedAsSecurityCacheModel.userId = getUserId();

		assetsNotUsedAsSecurityCacheModel.userName = getUserName();

		String userName = assetsNotUsedAsSecurityCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			assetsNotUsedAsSecurityCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			assetsNotUsedAsSecurityCacheModel.createDate = createDate.getTime();
		}
		else {
			assetsNotUsedAsSecurityCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			assetsNotUsedAsSecurityCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			assetsNotUsedAsSecurityCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		assetsNotUsedAsSecurityCacheModel.assetRealProp = getAssetRealProp();

		String assetRealProp = assetsNotUsedAsSecurityCacheModel.assetRealProp;

		if ((assetRealProp != null) && (assetRealProp.length() == 0)) {
			assetsNotUsedAsSecurityCacheModel.assetRealProp = null;
		}

		assetsNotUsedAsSecurityCacheModel.assetNoValue = getAssetNoValue();

		String assetNoValue = assetsNotUsedAsSecurityCacheModel.assetNoValue;

		if ((assetNoValue != null) && (assetNoValue.length() == 0)) {
			assetsNotUsedAsSecurityCacheModel.assetNoValue = null;
		}

		assetsNotUsedAsSecurityCacheModel.assetDescription =
			getAssetDescription();

		String assetDescription =
			assetsNotUsedAsSecurityCacheModel.assetDescription;

		if ((assetDescription != null) && (assetDescription.length() == 0)) {
			assetsNotUsedAsSecurityCacheModel.assetDescription = null;
		}

		assetsNotUsedAsSecurityCacheModel.assetNoCounter = getAssetNoCounter();

		String assetNoCounter =
			assetsNotUsedAsSecurityCacheModel.assetNoCounter;

		if ((assetNoCounter != null) && (assetNoCounter.length() == 0)) {
			assetsNotUsedAsSecurityCacheModel.assetNoCounter = null;
		}

		assetsNotUsedAsSecurityCacheModel.comTotalAssetNotUsedSecurity =
			getComTotalAssetNotUsedSecurity();

		String comTotalAssetNotUsedSecurity =
			assetsNotUsedAsSecurityCacheModel.comTotalAssetNotUsedSecurity;

		if ((comTotalAssetNotUsedSecurity != null) &&
			(comTotalAssetNotUsedSecurity.length() == 0)) {

			assetsNotUsedAsSecurityCacheModel.comTotalAssetNotUsedSecurity =
				null;
		}

		assetsNotUsedAsSecurityCacheModel.osiInsolvencyId =
			getOsiInsolvencyId();

		return assetsNotUsedAsSecurityCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AssetsNotUsedAsSecurity, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AssetsNotUsedAsSecurity, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AssetsNotUsedAsSecurity, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AssetsNotUsedAsSecurity)this);

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
			<InvocationHandler, AssetsNotUsedAsSecurity>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						AssetsNotUsedAsSecurity.class, ModelWrapper.class);

	}

	private long _assetsNotUsedAsSecurityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _assetRealProp;
	private String _assetNoValue;
	private String _assetDescription;
	private String _assetNoCounter;
	private String _comTotalAssetNotUsedSecurity;
	private long _osiInsolvencyId;

	public <T> T getColumnValue(String columnName) {
		Function<AssetsNotUsedAsSecurity, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AssetsNotUsedAsSecurity)this);
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
			"assetsNotUsedAsSecurityId", _assetsNotUsedAsSecurityId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("assetRealProp", _assetRealProp);
		_columnOriginalValues.put("assetNoValue", _assetNoValue);
		_columnOriginalValues.put("assetDescription", _assetDescription);
		_columnOriginalValues.put("assetNoCounter", _assetNoCounter);
		_columnOriginalValues.put(
			"comTotalAssetNotUsedSecurity", _comTotalAssetNotUsedSecurity);
		_columnOriginalValues.put("osiInsolvencyId", _osiInsolvencyId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("assetsNotUsedAsSecurityId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("assetRealProp", 128L);

		columnBitmasks.put("assetNoValue", 256L);

		columnBitmasks.put("assetDescription", 512L);

		columnBitmasks.put("assetNoCounter", 1024L);

		columnBitmasks.put("comTotalAssetNotUsedSecurity", 2048L);

		columnBitmasks.put("osiInsolvencyId", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AssetsNotUsedAsSecurity _escapedModel;

}