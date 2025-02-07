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

import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfoModel;

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
 * The base model implementation for the SezZoneEmployInfo service. Represents a row in the &quot;nbp_sez_zone_emp_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezZoneEmployInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezZoneEmployInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmployInfoImpl
 * @generated
 */
@JSON(strict = true)
public class SezZoneEmployInfoModelImpl
	extends BaseModelImpl<SezZoneEmployInfo> implements SezZoneEmployInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez zone employ info model instance should use the <code>SezZoneEmployInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_zone_emp_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezZoneEmpInfoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"labourRequirementYear", Types.VARCHAR},
		{"labourRequirementDirect", Types.VARCHAR},
		{"labourRequirementMale", Types.VARCHAR},
		{"labourRequirementFemale", Types.VARCHAR},
		{"labourRequirementLocal", Types.VARCHAR},
		{"labourRequirementForeign", Types.VARCHAR}, {"counter", Types.VARCHAR},
		{"sezStatusApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezZoneEmpInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("labourRequirementYear", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("labourRequirementDirect", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("labourRequirementMale", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("labourRequirementFemale", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("labourRequirementLocal", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("labourRequirementForeign", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sezStatusApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_zone_emp_info (sezZoneEmpInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,labourRequirementYear VARCHAR(75) null,labourRequirementDirect VARCHAR(75) null,labourRequirementMale VARCHAR(75) null,labourRequirementFemale VARCHAR(75) null,labourRequirementLocal VARCHAR(75) null,labourRequirementForeign VARCHAR(75) null,counter VARCHAR(75) null,sezStatusApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_zone_emp_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezZoneEmployInfo.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_zone_emp_info.createDate ASC";

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

	public SezZoneEmployInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezZoneEmpInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezZoneEmpInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezZoneEmpInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezZoneEmployInfo.class;
	}

	@Override
	public String getModelClassName() {
		return SezZoneEmployInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezZoneEmployInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezZoneEmployInfo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezZoneEmployInfo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezZoneEmployInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezZoneEmployInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezZoneEmployInfo, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezZoneEmployInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezZoneEmployInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezZoneEmployInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<SezZoneEmployInfo, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<SezZoneEmployInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezZoneEmployInfo, Object>>();

			attributeGetterFunctions.put(
				"sezZoneEmpInfoId", SezZoneEmployInfo::getSezZoneEmpInfoId);
			attributeGetterFunctions.put(
				"groupId", SezZoneEmployInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezZoneEmployInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezZoneEmployInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", SezZoneEmployInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezZoneEmployInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezZoneEmployInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"labourRequirementYear",
				SezZoneEmployInfo::getLabourRequirementYear);
			attributeGetterFunctions.put(
				"labourRequirementDirect",
				SezZoneEmployInfo::getLabourRequirementDirect);
			attributeGetterFunctions.put(
				"labourRequirementMale",
				SezZoneEmployInfo::getLabourRequirementMale);
			attributeGetterFunctions.put(
				"labourRequirementFemale",
				SezZoneEmployInfo::getLabourRequirementFemale);
			attributeGetterFunctions.put(
				"labourRequirementLocal",
				SezZoneEmployInfo::getLabourRequirementLocal);
			attributeGetterFunctions.put(
				"labourRequirementForeign",
				SezZoneEmployInfo::getLabourRequirementForeign);
			attributeGetterFunctions.put(
				"counter", SezZoneEmployInfo::getCounter);
			attributeGetterFunctions.put(
				"sezStatusApplicationId",
				SezZoneEmployInfo::getSezStatusApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<SezZoneEmployInfo, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezZoneEmployInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezZoneEmployInfo, ?>>();

			attributeSetterBiConsumers.put(
				"sezZoneEmpInfoId",
				(BiConsumer<SezZoneEmployInfo, Long>)
					SezZoneEmployInfo::setSezZoneEmpInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezZoneEmployInfo, Long>)
					SezZoneEmployInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezZoneEmployInfo, Long>)
					SezZoneEmployInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezZoneEmployInfo, Long>)
					SezZoneEmployInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezZoneEmployInfo, String>)
					SezZoneEmployInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezZoneEmployInfo, Date>)
					SezZoneEmployInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezZoneEmployInfo, Date>)
					SezZoneEmployInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"labourRequirementYear",
				(BiConsumer<SezZoneEmployInfo, String>)
					SezZoneEmployInfo::setLabourRequirementYear);
			attributeSetterBiConsumers.put(
				"labourRequirementDirect",
				(BiConsumer<SezZoneEmployInfo, String>)
					SezZoneEmployInfo::setLabourRequirementDirect);
			attributeSetterBiConsumers.put(
				"labourRequirementMale",
				(BiConsumer<SezZoneEmployInfo, String>)
					SezZoneEmployInfo::setLabourRequirementMale);
			attributeSetterBiConsumers.put(
				"labourRequirementFemale",
				(BiConsumer<SezZoneEmployInfo, String>)
					SezZoneEmployInfo::setLabourRequirementFemale);
			attributeSetterBiConsumers.put(
				"labourRequirementLocal",
				(BiConsumer<SezZoneEmployInfo, String>)
					SezZoneEmployInfo::setLabourRequirementLocal);
			attributeSetterBiConsumers.put(
				"labourRequirementForeign",
				(BiConsumer<SezZoneEmployInfo, String>)
					SezZoneEmployInfo::setLabourRequirementForeign);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<SezZoneEmployInfo, String>)
					SezZoneEmployInfo::setCounter);
			attributeSetterBiConsumers.put(
				"sezStatusApplicationId",
				(BiConsumer<SezZoneEmployInfo, Long>)
					SezZoneEmployInfo::setSezStatusApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezZoneEmpInfoId() {
		return _sezZoneEmpInfoId;
	}

	@Override
	public void setSezZoneEmpInfoId(long sezZoneEmpInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezZoneEmpInfoId = sezZoneEmpInfoId;
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
	public String getLabourRequirementYear() {
		if (_labourRequirementYear == null) {
			return "";
		}
		else {
			return _labourRequirementYear;
		}
	}

	@Override
	public void setLabourRequirementYear(String labourRequirementYear) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_labourRequirementYear = labourRequirementYear;
	}

	@JSON
	@Override
	public String getLabourRequirementDirect() {
		if (_labourRequirementDirect == null) {
			return "";
		}
		else {
			return _labourRequirementDirect;
		}
	}

	@Override
	public void setLabourRequirementDirect(String labourRequirementDirect) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_labourRequirementDirect = labourRequirementDirect;
	}

	@JSON
	@Override
	public String getLabourRequirementMale() {
		if (_labourRequirementMale == null) {
			return "";
		}
		else {
			return _labourRequirementMale;
		}
	}

	@Override
	public void setLabourRequirementMale(String labourRequirementMale) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_labourRequirementMale = labourRequirementMale;
	}

	@JSON
	@Override
	public String getLabourRequirementFemale() {
		if (_labourRequirementFemale == null) {
			return "";
		}
		else {
			return _labourRequirementFemale;
		}
	}

	@Override
	public void setLabourRequirementFemale(String labourRequirementFemale) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_labourRequirementFemale = labourRequirementFemale;
	}

	@JSON
	@Override
	public String getLabourRequirementLocal() {
		if (_labourRequirementLocal == null) {
			return "";
		}
		else {
			return _labourRequirementLocal;
		}
	}

	@Override
	public void setLabourRequirementLocal(String labourRequirementLocal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_labourRequirementLocal = labourRequirementLocal;
	}

	@JSON
	@Override
	public String getLabourRequirementForeign() {
		if (_labourRequirementForeign == null) {
			return "";
		}
		else {
			return _labourRequirementForeign;
		}
	}

	@Override
	public void setLabourRequirementForeign(String labourRequirementForeign) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_labourRequirementForeign = labourRequirementForeign;
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
			getCompanyId(), SezZoneEmployInfo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezZoneEmployInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezZoneEmployInfo>
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
		SezZoneEmployInfoImpl sezZoneEmployInfoImpl =
			new SezZoneEmployInfoImpl();

		sezZoneEmployInfoImpl.setSezZoneEmpInfoId(getSezZoneEmpInfoId());
		sezZoneEmployInfoImpl.setGroupId(getGroupId());
		sezZoneEmployInfoImpl.setCompanyId(getCompanyId());
		sezZoneEmployInfoImpl.setUserId(getUserId());
		sezZoneEmployInfoImpl.setUserName(getUserName());
		sezZoneEmployInfoImpl.setCreateDate(getCreateDate());
		sezZoneEmployInfoImpl.setModifiedDate(getModifiedDate());
		sezZoneEmployInfoImpl.setLabourRequirementYear(
			getLabourRequirementYear());
		sezZoneEmployInfoImpl.setLabourRequirementDirect(
			getLabourRequirementDirect());
		sezZoneEmployInfoImpl.setLabourRequirementMale(
			getLabourRequirementMale());
		sezZoneEmployInfoImpl.setLabourRequirementFemale(
			getLabourRequirementFemale());
		sezZoneEmployInfoImpl.setLabourRequirementLocal(
			getLabourRequirementLocal());
		sezZoneEmployInfoImpl.setLabourRequirementForeign(
			getLabourRequirementForeign());
		sezZoneEmployInfoImpl.setCounter(getCounter());
		sezZoneEmployInfoImpl.setSezStatusApplicationId(
			getSezStatusApplicationId());

		sezZoneEmployInfoImpl.resetOriginalValues();

		return sezZoneEmployInfoImpl;
	}

	@Override
	public SezZoneEmployInfo cloneWithOriginalValues() {
		SezZoneEmployInfoImpl sezZoneEmployInfoImpl =
			new SezZoneEmployInfoImpl();

		sezZoneEmployInfoImpl.setSezZoneEmpInfoId(
			this.<Long>getColumnOriginalValue("sezZoneEmpInfoId"));
		sezZoneEmployInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezZoneEmployInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezZoneEmployInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezZoneEmployInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezZoneEmployInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezZoneEmployInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezZoneEmployInfoImpl.setLabourRequirementYear(
			this.<String>getColumnOriginalValue("labourRequirementYear"));
		sezZoneEmployInfoImpl.setLabourRequirementDirect(
			this.<String>getColumnOriginalValue("labourRequirementDirect"));
		sezZoneEmployInfoImpl.setLabourRequirementMale(
			this.<String>getColumnOriginalValue("labourRequirementMale"));
		sezZoneEmployInfoImpl.setLabourRequirementFemale(
			this.<String>getColumnOriginalValue("labourRequirementFemale"));
		sezZoneEmployInfoImpl.setLabourRequirementLocal(
			this.<String>getColumnOriginalValue("labourRequirementLocal"));
		sezZoneEmployInfoImpl.setLabourRequirementForeign(
			this.<String>getColumnOriginalValue("labourRequirementForeign"));
		sezZoneEmployInfoImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		sezZoneEmployInfoImpl.setSezStatusApplicationId(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));

		return sezZoneEmployInfoImpl;
	}

	@Override
	public int compareTo(SezZoneEmployInfo sezZoneEmployInfo) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezZoneEmployInfo.getCreateDate());

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

		if (!(object instanceof SezZoneEmployInfo)) {
			return false;
		}

		SezZoneEmployInfo sezZoneEmployInfo = (SezZoneEmployInfo)object;

		long primaryKey = sezZoneEmployInfo.getPrimaryKey();

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
	public CacheModel<SezZoneEmployInfo> toCacheModel() {
		SezZoneEmployInfoCacheModel sezZoneEmployInfoCacheModel =
			new SezZoneEmployInfoCacheModel();

		sezZoneEmployInfoCacheModel.sezZoneEmpInfoId = getSezZoneEmpInfoId();

		sezZoneEmployInfoCacheModel.groupId = getGroupId();

		sezZoneEmployInfoCacheModel.companyId = getCompanyId();

		sezZoneEmployInfoCacheModel.userId = getUserId();

		sezZoneEmployInfoCacheModel.userName = getUserName();

		String userName = sezZoneEmployInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezZoneEmployInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezZoneEmployInfoCacheModel.createDate = createDate.getTime();
		}
		else {
			sezZoneEmployInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezZoneEmployInfoCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			sezZoneEmployInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezZoneEmployInfoCacheModel.labourRequirementYear =
			getLabourRequirementYear();

		String labourRequirementYear =
			sezZoneEmployInfoCacheModel.labourRequirementYear;

		if ((labourRequirementYear != null) &&
			(labourRequirementYear.length() == 0)) {

			sezZoneEmployInfoCacheModel.labourRequirementYear = null;
		}

		sezZoneEmployInfoCacheModel.labourRequirementDirect =
			getLabourRequirementDirect();

		String labourRequirementDirect =
			sezZoneEmployInfoCacheModel.labourRequirementDirect;

		if ((labourRequirementDirect != null) &&
			(labourRequirementDirect.length() == 0)) {

			sezZoneEmployInfoCacheModel.labourRequirementDirect = null;
		}

		sezZoneEmployInfoCacheModel.labourRequirementMale =
			getLabourRequirementMale();

		String labourRequirementMale =
			sezZoneEmployInfoCacheModel.labourRequirementMale;

		if ((labourRequirementMale != null) &&
			(labourRequirementMale.length() == 0)) {

			sezZoneEmployInfoCacheModel.labourRequirementMale = null;
		}

		sezZoneEmployInfoCacheModel.labourRequirementFemale =
			getLabourRequirementFemale();

		String labourRequirementFemale =
			sezZoneEmployInfoCacheModel.labourRequirementFemale;

		if ((labourRequirementFemale != null) &&
			(labourRequirementFemale.length() == 0)) {

			sezZoneEmployInfoCacheModel.labourRequirementFemale = null;
		}

		sezZoneEmployInfoCacheModel.labourRequirementLocal =
			getLabourRequirementLocal();

		String labourRequirementLocal =
			sezZoneEmployInfoCacheModel.labourRequirementLocal;

		if ((labourRequirementLocal != null) &&
			(labourRequirementLocal.length() == 0)) {

			sezZoneEmployInfoCacheModel.labourRequirementLocal = null;
		}

		sezZoneEmployInfoCacheModel.labourRequirementForeign =
			getLabourRequirementForeign();

		String labourRequirementForeign =
			sezZoneEmployInfoCacheModel.labourRequirementForeign;

		if ((labourRequirementForeign != null) &&
			(labourRequirementForeign.length() == 0)) {

			sezZoneEmployInfoCacheModel.labourRequirementForeign = null;
		}

		sezZoneEmployInfoCacheModel.counter = getCounter();

		String counter = sezZoneEmployInfoCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			sezZoneEmployInfoCacheModel.counter = null;
		}

		sezZoneEmployInfoCacheModel.sezStatusApplicationId =
			getSezStatusApplicationId();

		return sezZoneEmployInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezZoneEmployInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezZoneEmployInfo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezZoneEmployInfo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezZoneEmployInfo)this);

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

		private static final Function<InvocationHandler, SezZoneEmployInfo>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					SezZoneEmployInfo.class, ModelWrapper.class);

	}

	private long _sezZoneEmpInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _labourRequirementYear;
	private String _labourRequirementDirect;
	private String _labourRequirementMale;
	private String _labourRequirementFemale;
	private String _labourRequirementLocal;
	private String _labourRequirementForeign;
	private String _counter;
	private long _sezStatusApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<SezZoneEmployInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezZoneEmployInfo)this);
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

		_columnOriginalValues.put("sezZoneEmpInfoId", _sezZoneEmpInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"labourRequirementYear", _labourRequirementYear);
		_columnOriginalValues.put(
			"labourRequirementDirect", _labourRequirementDirect);
		_columnOriginalValues.put(
			"labourRequirementMale", _labourRequirementMale);
		_columnOriginalValues.put(
			"labourRequirementFemale", _labourRequirementFemale);
		_columnOriginalValues.put(
			"labourRequirementLocal", _labourRequirementLocal);
		_columnOriginalValues.put(
			"labourRequirementForeign", _labourRequirementForeign);
		_columnOriginalValues.put("counter", _counter);
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

		columnBitmasks.put("sezZoneEmpInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("labourRequirementYear", 128L);

		columnBitmasks.put("labourRequirementDirect", 256L);

		columnBitmasks.put("labourRequirementMale", 512L);

		columnBitmasks.put("labourRequirementFemale", 1024L);

		columnBitmasks.put("labourRequirementLocal", 2048L);

		columnBitmasks.put("labourRequirementForeign", 4096L);

		columnBitmasks.put("counter", 8192L);

		columnBitmasks.put("sezStatusApplicationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezZoneEmployInfo _escapedModel;

}