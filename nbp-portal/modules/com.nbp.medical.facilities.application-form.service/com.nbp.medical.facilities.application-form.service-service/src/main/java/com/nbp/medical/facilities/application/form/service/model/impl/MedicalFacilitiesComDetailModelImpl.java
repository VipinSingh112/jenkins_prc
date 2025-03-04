/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.model.impl;

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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetail;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesComDetailModel;

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
 * The base model implementation for the MedicalFacilitiesComDetail service. Represents a row in the &quot;nbp_medical_company_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MedicalFacilitiesComDetailModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalFacilitiesComDetailImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesComDetailImpl
 * @generated
 */
@JSON(strict = true)
public class MedicalFacilitiesComDetailModelImpl
	extends BaseModelImpl<MedicalFacilitiesComDetail>
	implements MedicalFacilitiesComDetailModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical facilities com detail model instance should use the <code>MedicalFacilitiesComDetail</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_medical_company_detail";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR},
		{"medicalFacilitiesComDetailId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"fullName", Types.VARCHAR}, {"privateAddress", Types.VARCHAR},
		{"registeredOffice", Types.VARCHAR}, {"counter", Types.VARCHAR},
		{"medicalFacilitiesAppId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medicalFacilitiesComDetailId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fullName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("privateAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("registeredOffice", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medicalFacilitiesAppId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_medical_company_detail (uuid_ VARCHAR(75) null,medicalFacilitiesComDetailId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,fullName VARCHAR(75) null,privateAddress VARCHAR(500) null,registeredOffice VARCHAR(75) null,counter VARCHAR(75) null,medicalFacilitiesAppId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_medical_company_detail";

	public static final String ORDER_BY_JPQL =
		" ORDER BY medicalFacilitiesComDetail.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_medical_company_detail.createDate DESC";

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
	public static final long MEDICALFACILITIESAPPID_COLUMN_BITMASK = 4L;

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

	public MedicalFacilitiesComDetailModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _medicalFacilitiesComDetailId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMedicalFacilitiesComDetailId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _medicalFacilitiesComDetailId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MedicalFacilitiesComDetail.class;
	}

	@Override
	public String getModelClassName() {
		return MedicalFacilitiesComDetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<MedicalFacilitiesComDetail, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<MedicalFacilitiesComDetail, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalFacilitiesComDetail, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(MedicalFacilitiesComDetail)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<MedicalFacilitiesComDetail, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<MedicalFacilitiesComDetail, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(MedicalFacilitiesComDetail)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<MedicalFacilitiesComDetail, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<MedicalFacilitiesComDetail, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<MedicalFacilitiesComDetail, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<MedicalFacilitiesComDetail, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<MedicalFacilitiesComDetail, Object>>();

			attributeGetterFunctions.put(
				"uuid", MedicalFacilitiesComDetail::getUuid);
			attributeGetterFunctions.put(
				"medicalFacilitiesComDetailId",
				MedicalFacilitiesComDetail::getMedicalFacilitiesComDetailId);
			attributeGetterFunctions.put(
				"groupId", MedicalFacilitiesComDetail::getGroupId);
			attributeGetterFunctions.put(
				"companyId", MedicalFacilitiesComDetail::getCompanyId);
			attributeGetterFunctions.put(
				"userId", MedicalFacilitiesComDetail::getUserId);
			attributeGetterFunctions.put(
				"userName", MedicalFacilitiesComDetail::getUserName);
			attributeGetterFunctions.put(
				"createDate", MedicalFacilitiesComDetail::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", MedicalFacilitiesComDetail::getModifiedDate);
			attributeGetterFunctions.put(
				"fullName", MedicalFacilitiesComDetail::getFullName);
			attributeGetterFunctions.put(
				"privateAddress",
				MedicalFacilitiesComDetail::getPrivateAddress);
			attributeGetterFunctions.put(
				"registeredOffice",
				MedicalFacilitiesComDetail::getRegisteredOffice);
			attributeGetterFunctions.put(
				"counter", MedicalFacilitiesComDetail::getCounter);
			attributeGetterFunctions.put(
				"medicalFacilitiesAppId",
				MedicalFacilitiesComDetail::getMedicalFacilitiesAppId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<MedicalFacilitiesComDetail, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<MedicalFacilitiesComDetail, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<MedicalFacilitiesComDetail, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<MedicalFacilitiesComDetail, String>)
					MedicalFacilitiesComDetail::setUuid);
			attributeSetterBiConsumers.put(
				"medicalFacilitiesComDetailId",
				(BiConsumer<MedicalFacilitiesComDetail, Long>)
					MedicalFacilitiesComDetail::
						setMedicalFacilitiesComDetailId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<MedicalFacilitiesComDetail, Long>)
					MedicalFacilitiesComDetail::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<MedicalFacilitiesComDetail, Long>)
					MedicalFacilitiesComDetail::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<MedicalFacilitiesComDetail, Long>)
					MedicalFacilitiesComDetail::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<MedicalFacilitiesComDetail, String>)
					MedicalFacilitiesComDetail::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<MedicalFacilitiesComDetail, Date>)
					MedicalFacilitiesComDetail::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<MedicalFacilitiesComDetail, Date>)
					MedicalFacilitiesComDetail::setModifiedDate);
			attributeSetterBiConsumers.put(
				"fullName",
				(BiConsumer<MedicalFacilitiesComDetail, String>)
					MedicalFacilitiesComDetail::setFullName);
			attributeSetterBiConsumers.put(
				"privateAddress",
				(BiConsumer<MedicalFacilitiesComDetail, String>)
					MedicalFacilitiesComDetail::setPrivateAddress);
			attributeSetterBiConsumers.put(
				"registeredOffice",
				(BiConsumer<MedicalFacilitiesComDetail, String>)
					MedicalFacilitiesComDetail::setRegisteredOffice);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<MedicalFacilitiesComDetail, String>)
					MedicalFacilitiesComDetail::setCounter);
			attributeSetterBiConsumers.put(
				"medicalFacilitiesAppId",
				(BiConsumer<MedicalFacilitiesComDetail, Long>)
					MedicalFacilitiesComDetail::setMedicalFacilitiesAppId);

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
	public long getMedicalFacilitiesComDetailId() {
		return _medicalFacilitiesComDetailId;
	}

	@Override
	public void setMedicalFacilitiesComDetailId(
		long medicalFacilitiesComDetailId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medicalFacilitiesComDetailId = medicalFacilitiesComDetailId;
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
	public String getFullName() {
		if (_fullName == null) {
			return "";
		}
		else {
			return _fullName;
		}
	}

	@Override
	public void setFullName(String fullName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fullName = fullName;
	}

	@JSON
	@Override
	public String getPrivateAddress() {
		if (_privateAddress == null) {
			return "";
		}
		else {
			return _privateAddress;
		}
	}

	@Override
	public void setPrivateAddress(String privateAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_privateAddress = privateAddress;
	}

	@JSON
	@Override
	public String getRegisteredOffice() {
		if (_registeredOffice == null) {
			return "";
		}
		else {
			return _registeredOffice;
		}
	}

	@Override
	public void setRegisteredOffice(String registeredOffice) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_registeredOffice = registeredOffice;
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
	public long getMedicalFacilitiesAppId() {
		return _medicalFacilitiesAppId;
	}

	@Override
	public void setMedicalFacilitiesAppId(long medicalFacilitiesAppId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medicalFacilitiesAppId = medicalFacilitiesAppId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalMedicalFacilitiesAppId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("medicalFacilitiesAppId"));
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				MedicalFacilitiesComDetail.class.getName()));
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
			getCompanyId(), MedicalFacilitiesComDetail.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MedicalFacilitiesComDetail toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, MedicalFacilitiesComDetail>
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
		MedicalFacilitiesComDetailImpl medicalFacilitiesComDetailImpl =
			new MedicalFacilitiesComDetailImpl();

		medicalFacilitiesComDetailImpl.setUuid(getUuid());
		medicalFacilitiesComDetailImpl.setMedicalFacilitiesComDetailId(
			getMedicalFacilitiesComDetailId());
		medicalFacilitiesComDetailImpl.setGroupId(getGroupId());
		medicalFacilitiesComDetailImpl.setCompanyId(getCompanyId());
		medicalFacilitiesComDetailImpl.setUserId(getUserId());
		medicalFacilitiesComDetailImpl.setUserName(getUserName());
		medicalFacilitiesComDetailImpl.setCreateDate(getCreateDate());
		medicalFacilitiesComDetailImpl.setModifiedDate(getModifiedDate());
		medicalFacilitiesComDetailImpl.setFullName(getFullName());
		medicalFacilitiesComDetailImpl.setPrivateAddress(getPrivateAddress());
		medicalFacilitiesComDetailImpl.setRegisteredOffice(
			getRegisteredOffice());
		medicalFacilitiesComDetailImpl.setCounter(getCounter());
		medicalFacilitiesComDetailImpl.setMedicalFacilitiesAppId(
			getMedicalFacilitiesAppId());

		medicalFacilitiesComDetailImpl.resetOriginalValues();

		return medicalFacilitiesComDetailImpl;
	}

	@Override
	public MedicalFacilitiesComDetail cloneWithOriginalValues() {
		MedicalFacilitiesComDetailImpl medicalFacilitiesComDetailImpl =
			new MedicalFacilitiesComDetailImpl();

		medicalFacilitiesComDetailImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		medicalFacilitiesComDetailImpl.setMedicalFacilitiesComDetailId(
			this.<Long>getColumnOriginalValue("medicalFacilitiesComDetailId"));
		medicalFacilitiesComDetailImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		medicalFacilitiesComDetailImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		medicalFacilitiesComDetailImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		medicalFacilitiesComDetailImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		medicalFacilitiesComDetailImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		medicalFacilitiesComDetailImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		medicalFacilitiesComDetailImpl.setFullName(
			this.<String>getColumnOriginalValue("fullName"));
		medicalFacilitiesComDetailImpl.setPrivateAddress(
			this.<String>getColumnOriginalValue("privateAddress"));
		medicalFacilitiesComDetailImpl.setRegisteredOffice(
			this.<String>getColumnOriginalValue("registeredOffice"));
		medicalFacilitiesComDetailImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		medicalFacilitiesComDetailImpl.setMedicalFacilitiesAppId(
			this.<Long>getColumnOriginalValue("medicalFacilitiesAppId"));

		return medicalFacilitiesComDetailImpl;
	}

	@Override
	public int compareTo(
		MedicalFacilitiesComDetail medicalFacilitiesComDetail) {

		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), medicalFacilitiesComDetail.getCreateDate());

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

		if (!(object instanceof MedicalFacilitiesComDetail)) {
			return false;
		}

		MedicalFacilitiesComDetail medicalFacilitiesComDetail =
			(MedicalFacilitiesComDetail)object;

		long primaryKey = medicalFacilitiesComDetail.getPrimaryKey();

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
	public CacheModel<MedicalFacilitiesComDetail> toCacheModel() {
		MedicalFacilitiesComDetailCacheModel
			medicalFacilitiesComDetailCacheModel =
				new MedicalFacilitiesComDetailCacheModel();

		medicalFacilitiesComDetailCacheModel.uuid = getUuid();

		String uuid = medicalFacilitiesComDetailCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			medicalFacilitiesComDetailCacheModel.uuid = null;
		}

		medicalFacilitiesComDetailCacheModel.medicalFacilitiesComDetailId =
			getMedicalFacilitiesComDetailId();

		medicalFacilitiesComDetailCacheModel.groupId = getGroupId();

		medicalFacilitiesComDetailCacheModel.companyId = getCompanyId();

		medicalFacilitiesComDetailCacheModel.userId = getUserId();

		medicalFacilitiesComDetailCacheModel.userName = getUserName();

		String userName = medicalFacilitiesComDetailCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			medicalFacilitiesComDetailCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			medicalFacilitiesComDetailCacheModel.createDate =
				createDate.getTime();
		}
		else {
			medicalFacilitiesComDetailCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			medicalFacilitiesComDetailCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			medicalFacilitiesComDetailCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		medicalFacilitiesComDetailCacheModel.fullName = getFullName();

		String fullName = medicalFacilitiesComDetailCacheModel.fullName;

		if ((fullName != null) && (fullName.length() == 0)) {
			medicalFacilitiesComDetailCacheModel.fullName = null;
		}

		medicalFacilitiesComDetailCacheModel.privateAddress =
			getPrivateAddress();

		String privateAddress =
			medicalFacilitiesComDetailCacheModel.privateAddress;

		if ((privateAddress != null) && (privateAddress.length() == 0)) {
			medicalFacilitiesComDetailCacheModel.privateAddress = null;
		}

		medicalFacilitiesComDetailCacheModel.registeredOffice =
			getRegisteredOffice();

		String registeredOffice =
			medicalFacilitiesComDetailCacheModel.registeredOffice;

		if ((registeredOffice != null) && (registeredOffice.length() == 0)) {
			medicalFacilitiesComDetailCacheModel.registeredOffice = null;
		}

		medicalFacilitiesComDetailCacheModel.counter = getCounter();

		String counter = medicalFacilitiesComDetailCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			medicalFacilitiesComDetailCacheModel.counter = null;
		}

		medicalFacilitiesComDetailCacheModel.medicalFacilitiesAppId =
			getMedicalFacilitiesAppId();

		return medicalFacilitiesComDetailCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<MedicalFacilitiesComDetail, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<MedicalFacilitiesComDetail, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalFacilitiesComDetail, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(MedicalFacilitiesComDetail)this);

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
			<InvocationHandler, MedicalFacilitiesComDetail>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						MedicalFacilitiesComDetail.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _medicalFacilitiesComDetailId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _fullName;
	private String _privateAddress;
	private String _registeredOffice;
	private String _counter;
	private long _medicalFacilitiesAppId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<MedicalFacilitiesComDetail, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((MedicalFacilitiesComDetail)this);
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
		_columnOriginalValues.put(
			"medicalFacilitiesComDetailId", _medicalFacilitiesComDetailId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("fullName", _fullName);
		_columnOriginalValues.put("privateAddress", _privateAddress);
		_columnOriginalValues.put("registeredOffice", _registeredOffice);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put(
			"medicalFacilitiesAppId", _medicalFacilitiesAppId);
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

		columnBitmasks.put("medicalFacilitiesComDetailId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("fullName", 256L);

		columnBitmasks.put("privateAddress", 512L);

		columnBitmasks.put("registeredOffice", 1024L);

		columnBitmasks.put("counter", 2048L);

		columnBitmasks.put("medicalFacilitiesAppId", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private MedicalFacilitiesComDetail _escapedModel;

}