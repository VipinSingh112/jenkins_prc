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

import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirector;
import com.nbp.sez.status.application.form.service.model.SezOccupantPrincipleDirectorModel;

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
 * The base model implementation for the SezOccupantPrincipleDirector service. Represents a row in the &quot;nbp_sez_occ_princ_dir_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezOccupantPrincipleDirectorModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezOccupantPrincipleDirectorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleDirectorImpl
 * @generated
 */
@JSON(strict = true)
public class SezOccupantPrincipleDirectorModelImpl
	extends BaseModelImpl<SezOccupantPrincipleDirector>
	implements SezOccupantPrincipleDirectorModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez occupant principle director model instance should use the <code>SezOccupantPrincipleDirector</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_occ_princ_dir_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezOccPrincDirectId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"occShareholderName", Types.VARCHAR},
		{"occShareholderNation", Types.VARCHAR},
		{"occShareholderShares", Types.VARCHAR},
		{"occShareholderCounter", Types.VARCHAR},
		{"sezStatusApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezOccPrincDirectId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("occShareholderName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("occShareholderNation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("occShareholderShares", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("occShareholderCounter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezStatusApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_occ_princ_dir_info (sezOccPrincDirectId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,occShareholderName VARCHAR(75) null,occShareholderNation VARCHAR(75) null,occShareholderShares VARCHAR(75) null,occShareholderCounter VARCHAR(75) null,sezStatusApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_occ_princ_dir_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezOccupantPrincipleDirector.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_occ_princ_dir_info.createDate ASC";

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

	public SezOccupantPrincipleDirectorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezOccPrincDirectId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezOccPrincDirectId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezOccPrincDirectId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezOccupantPrincipleDirector.class;
	}

	@Override
	public String getModelClassName() {
		return SezOccupantPrincipleDirector.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezOccupantPrincipleDirector, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezOccupantPrincipleDirector, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezOccupantPrincipleDirector, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(SezOccupantPrincipleDirector)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezOccupantPrincipleDirector, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezOccupantPrincipleDirector, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezOccupantPrincipleDirector)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezOccupantPrincipleDirector, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezOccupantPrincipleDirector, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<SezOccupantPrincipleDirector, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<SezOccupantPrincipleDirector, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<SezOccupantPrincipleDirector, Object>>();

			attributeGetterFunctions.put(
				"sezOccPrincDirectId",
				SezOccupantPrincipleDirector::getSezOccPrincDirectId);
			attributeGetterFunctions.put(
				"groupId", SezOccupantPrincipleDirector::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezOccupantPrincipleDirector::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezOccupantPrincipleDirector::getUserId);
			attributeGetterFunctions.put(
				"userName", SezOccupantPrincipleDirector::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezOccupantPrincipleDirector::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezOccupantPrincipleDirector::getModifiedDate);
			attributeGetterFunctions.put(
				"occShareholderName",
				SezOccupantPrincipleDirector::getOccShareholderName);
			attributeGetterFunctions.put(
				"occShareholderNation",
				SezOccupantPrincipleDirector::getOccShareholderNation);
			attributeGetterFunctions.put(
				"occShareholderShares",
				SezOccupantPrincipleDirector::getOccShareholderShares);
			attributeGetterFunctions.put(
				"occShareholderCounter",
				SezOccupantPrincipleDirector::getOccShareholderCounter);
			attributeGetterFunctions.put(
				"sezStatusApplicationId",
				SezOccupantPrincipleDirector::getSezStatusApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<SezOccupantPrincipleDirector, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezOccupantPrincipleDirector, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezOccupantPrincipleDirector, ?>>();

			attributeSetterBiConsumers.put(
				"sezOccPrincDirectId",
				(BiConsumer<SezOccupantPrincipleDirector, Long>)
					SezOccupantPrincipleDirector::setSezOccPrincDirectId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezOccupantPrincipleDirector, Long>)
					SezOccupantPrincipleDirector::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezOccupantPrincipleDirector, Long>)
					SezOccupantPrincipleDirector::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezOccupantPrincipleDirector, Long>)
					SezOccupantPrincipleDirector::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezOccupantPrincipleDirector, String>)
					SezOccupantPrincipleDirector::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezOccupantPrincipleDirector, Date>)
					SezOccupantPrincipleDirector::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezOccupantPrincipleDirector, Date>)
					SezOccupantPrincipleDirector::setModifiedDate);
			attributeSetterBiConsumers.put(
				"occShareholderName",
				(BiConsumer<SezOccupantPrincipleDirector, String>)
					SezOccupantPrincipleDirector::setOccShareholderName);
			attributeSetterBiConsumers.put(
				"occShareholderNation",
				(BiConsumer<SezOccupantPrincipleDirector, String>)
					SezOccupantPrincipleDirector::setOccShareholderNation);
			attributeSetterBiConsumers.put(
				"occShareholderShares",
				(BiConsumer<SezOccupantPrincipleDirector, String>)
					SezOccupantPrincipleDirector::setOccShareholderShares);
			attributeSetterBiConsumers.put(
				"occShareholderCounter",
				(BiConsumer<SezOccupantPrincipleDirector, String>)
					SezOccupantPrincipleDirector::setOccShareholderCounter);
			attributeSetterBiConsumers.put(
				"sezStatusApplicationId",
				(BiConsumer<SezOccupantPrincipleDirector, Long>)
					SezOccupantPrincipleDirector::setSezStatusApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezOccPrincDirectId() {
		return _sezOccPrincDirectId;
	}

	@Override
	public void setSezOccPrincDirectId(long sezOccPrincDirectId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezOccPrincDirectId = sezOccPrincDirectId;
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
	public String getOccShareholderName() {
		if (_occShareholderName == null) {
			return "";
		}
		else {
			return _occShareholderName;
		}
	}

	@Override
	public void setOccShareholderName(String occShareholderName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_occShareholderName = occShareholderName;
	}

	@JSON
	@Override
	public String getOccShareholderNation() {
		if (_occShareholderNation == null) {
			return "";
		}
		else {
			return _occShareholderNation;
		}
	}

	@Override
	public void setOccShareholderNation(String occShareholderNation) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_occShareholderNation = occShareholderNation;
	}

	@JSON
	@Override
	public String getOccShareholderShares() {
		if (_occShareholderShares == null) {
			return "";
		}
		else {
			return _occShareholderShares;
		}
	}

	@Override
	public void setOccShareholderShares(String occShareholderShares) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_occShareholderShares = occShareholderShares;
	}

	@JSON
	@Override
	public String getOccShareholderCounter() {
		if (_occShareholderCounter == null) {
			return "";
		}
		else {
			return _occShareholderCounter;
		}
	}

	@Override
	public void setOccShareholderCounter(String occShareholderCounter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_occShareholderCounter = occShareholderCounter;
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
			getCompanyId(), SezOccupantPrincipleDirector.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezOccupantPrincipleDirector toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezOccupantPrincipleDirector>
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
		SezOccupantPrincipleDirectorImpl sezOccupantPrincipleDirectorImpl =
			new SezOccupantPrincipleDirectorImpl();

		sezOccupantPrincipleDirectorImpl.setSezOccPrincDirectId(
			getSezOccPrincDirectId());
		sezOccupantPrincipleDirectorImpl.setGroupId(getGroupId());
		sezOccupantPrincipleDirectorImpl.setCompanyId(getCompanyId());
		sezOccupantPrincipleDirectorImpl.setUserId(getUserId());
		sezOccupantPrincipleDirectorImpl.setUserName(getUserName());
		sezOccupantPrincipleDirectorImpl.setCreateDate(getCreateDate());
		sezOccupantPrincipleDirectorImpl.setModifiedDate(getModifiedDate());
		sezOccupantPrincipleDirectorImpl.setOccShareholderName(
			getOccShareholderName());
		sezOccupantPrincipleDirectorImpl.setOccShareholderNation(
			getOccShareholderNation());
		sezOccupantPrincipleDirectorImpl.setOccShareholderShares(
			getOccShareholderShares());
		sezOccupantPrincipleDirectorImpl.setOccShareholderCounter(
			getOccShareholderCounter());
		sezOccupantPrincipleDirectorImpl.setSezStatusApplicationId(
			getSezStatusApplicationId());

		sezOccupantPrincipleDirectorImpl.resetOriginalValues();

		return sezOccupantPrincipleDirectorImpl;
	}

	@Override
	public SezOccupantPrincipleDirector cloneWithOriginalValues() {
		SezOccupantPrincipleDirectorImpl sezOccupantPrincipleDirectorImpl =
			new SezOccupantPrincipleDirectorImpl();

		sezOccupantPrincipleDirectorImpl.setSezOccPrincDirectId(
			this.<Long>getColumnOriginalValue("sezOccPrincDirectId"));
		sezOccupantPrincipleDirectorImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezOccupantPrincipleDirectorImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezOccupantPrincipleDirectorImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezOccupantPrincipleDirectorImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezOccupantPrincipleDirectorImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezOccupantPrincipleDirectorImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezOccupantPrincipleDirectorImpl.setOccShareholderName(
			this.<String>getColumnOriginalValue("occShareholderName"));
		sezOccupantPrincipleDirectorImpl.setOccShareholderNation(
			this.<String>getColumnOriginalValue("occShareholderNation"));
		sezOccupantPrincipleDirectorImpl.setOccShareholderShares(
			this.<String>getColumnOriginalValue("occShareholderShares"));
		sezOccupantPrincipleDirectorImpl.setOccShareholderCounter(
			this.<String>getColumnOriginalValue("occShareholderCounter"));
		sezOccupantPrincipleDirectorImpl.setSezStatusApplicationId(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));

		return sezOccupantPrincipleDirectorImpl;
	}

	@Override
	public int compareTo(
		SezOccupantPrincipleDirector sezOccupantPrincipleDirector) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezOccupantPrincipleDirector.getCreateDate());

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

		if (!(object instanceof SezOccupantPrincipleDirector)) {
			return false;
		}

		SezOccupantPrincipleDirector sezOccupantPrincipleDirector =
			(SezOccupantPrincipleDirector)object;

		long primaryKey = sezOccupantPrincipleDirector.getPrimaryKey();

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
	public CacheModel<SezOccupantPrincipleDirector> toCacheModel() {
		SezOccupantPrincipleDirectorCacheModel
			sezOccupantPrincipleDirectorCacheModel =
				new SezOccupantPrincipleDirectorCacheModel();

		sezOccupantPrincipleDirectorCacheModel.sezOccPrincDirectId =
			getSezOccPrincDirectId();

		sezOccupantPrincipleDirectorCacheModel.groupId = getGroupId();

		sezOccupantPrincipleDirectorCacheModel.companyId = getCompanyId();

		sezOccupantPrincipleDirectorCacheModel.userId = getUserId();

		sezOccupantPrincipleDirectorCacheModel.userName = getUserName();

		String userName = sezOccupantPrincipleDirectorCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezOccupantPrincipleDirectorCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezOccupantPrincipleDirectorCacheModel.createDate =
				createDate.getTime();
		}
		else {
			sezOccupantPrincipleDirectorCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezOccupantPrincipleDirectorCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			sezOccupantPrincipleDirectorCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		sezOccupantPrincipleDirectorCacheModel.occShareholderName =
			getOccShareholderName();

		String occShareholderName =
			sezOccupantPrincipleDirectorCacheModel.occShareholderName;

		if ((occShareholderName != null) &&
			(occShareholderName.length() == 0)) {

			sezOccupantPrincipleDirectorCacheModel.occShareholderName = null;
		}

		sezOccupantPrincipleDirectorCacheModel.occShareholderNation =
			getOccShareholderNation();

		String occShareholderNation =
			sezOccupantPrincipleDirectorCacheModel.occShareholderNation;

		if ((occShareholderNation != null) &&
			(occShareholderNation.length() == 0)) {

			sezOccupantPrincipleDirectorCacheModel.occShareholderNation = null;
		}

		sezOccupantPrincipleDirectorCacheModel.occShareholderShares =
			getOccShareholderShares();

		String occShareholderShares =
			sezOccupantPrincipleDirectorCacheModel.occShareholderShares;

		if ((occShareholderShares != null) &&
			(occShareholderShares.length() == 0)) {

			sezOccupantPrincipleDirectorCacheModel.occShareholderShares = null;
		}

		sezOccupantPrincipleDirectorCacheModel.occShareholderCounter =
			getOccShareholderCounter();

		String occShareholderCounter =
			sezOccupantPrincipleDirectorCacheModel.occShareholderCounter;

		if ((occShareholderCounter != null) &&
			(occShareholderCounter.length() == 0)) {

			sezOccupantPrincipleDirectorCacheModel.occShareholderCounter = null;
		}

		sezOccupantPrincipleDirectorCacheModel.sezStatusApplicationId =
			getSezStatusApplicationId();

		return sezOccupantPrincipleDirectorCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezOccupantPrincipleDirector, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezOccupantPrincipleDirector, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezOccupantPrincipleDirector, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezOccupantPrincipleDirector)this);

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
			<InvocationHandler, SezOccupantPrincipleDirector>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						SezOccupantPrincipleDirector.class, ModelWrapper.class);

	}

	private long _sezOccPrincDirectId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _occShareholderName;
	private String _occShareholderNation;
	private String _occShareholderShares;
	private String _occShareholderCounter;
	private long _sezStatusApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<SezOccupantPrincipleDirector, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezOccupantPrincipleDirector)this);
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

		_columnOriginalValues.put("sezOccPrincDirectId", _sezOccPrincDirectId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("occShareholderName", _occShareholderName);
		_columnOriginalValues.put(
			"occShareholderNation", _occShareholderNation);
		_columnOriginalValues.put(
			"occShareholderShares", _occShareholderShares);
		_columnOriginalValues.put(
			"occShareholderCounter", _occShareholderCounter);
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

		columnBitmasks.put("sezOccPrincDirectId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("occShareholderName", 128L);

		columnBitmasks.put("occShareholderNation", 256L);

		columnBitmasks.put("occShareholderShares", 512L);

		columnBitmasks.put("occShareholderCounter", 1024L);

		columnBitmasks.put("sezStatusApplicationId", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezOccupantPrincipleDirector _escapedModel;

}