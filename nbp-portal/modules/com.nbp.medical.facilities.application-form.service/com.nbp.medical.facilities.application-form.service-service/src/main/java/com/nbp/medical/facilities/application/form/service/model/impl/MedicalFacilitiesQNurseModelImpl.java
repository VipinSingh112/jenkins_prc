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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurse;
import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesQNurseModel;

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
 * The base model implementation for the MedicalFacilitiesQNurse service. Represents a row in the &quot;nbp_medical_nurse_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MedicalFacilitiesQNurseModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MedicalFacilitiesQNurseImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesQNurseImpl
 * @generated
 */
@JSON(strict = true)
public class MedicalFacilitiesQNurseModelImpl
	extends BaseModelImpl<MedicalFacilitiesQNurse>
	implements MedicalFacilitiesQNurseModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a medical facilities q nurse model instance should use the <code>MedicalFacilitiesQNurse</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_medical_nurse_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"medicalFacilitiesQNurseId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"checkQualifiedNurse", Types.VARCHAR}, {"name", Types.VARCHAR},
		{"qualification", Types.VARCHAR},
		{"nursingStaffCategory", Types.VARCHAR}, {"qNurseName", Types.VARCHAR},
		{"qNurseQualification", Types.VARCHAR},
		{"ratioOfQNurses", Types.VARCHAR},
		{"medicalFacilitiesAppId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medicalFacilitiesQNurseId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("checkQualifiedNurse", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("qualification", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nursingStaffCategory", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("qNurseName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("qNurseQualification", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ratioOfQNurses", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medicalFacilitiesAppId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_medical_nurse_info (uuid_ VARCHAR(75) null,medicalFacilitiesQNurseId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,checkQualifiedNurse VARCHAR(75) null,name VARCHAR(75) null,qualification VARCHAR(75) null,nursingStaffCategory VARCHAR(75) null,qNurseName VARCHAR(75) null,qNurseQualification VARCHAR(75) null,ratioOfQNurses VARCHAR(75) null,medicalFacilitiesAppId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_medical_nurse_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY medicalFacilitiesQNurse.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_medical_nurse_info.createDate DESC";

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

	public MedicalFacilitiesQNurseModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _medicalFacilitiesQNurseId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMedicalFacilitiesQNurseId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _medicalFacilitiesQNurseId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MedicalFacilitiesQNurse.class;
	}

	@Override
	public String getModelClassName() {
		return MedicalFacilitiesQNurse.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<MedicalFacilitiesQNurse, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<MedicalFacilitiesQNurse, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalFacilitiesQNurse, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((MedicalFacilitiesQNurse)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<MedicalFacilitiesQNurse, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<MedicalFacilitiesQNurse, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(MedicalFacilitiesQNurse)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<MedicalFacilitiesQNurse, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<MedicalFacilitiesQNurse, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<MedicalFacilitiesQNurse, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<MedicalFacilitiesQNurse, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<MedicalFacilitiesQNurse, Object>>();

			attributeGetterFunctions.put(
				"uuid", MedicalFacilitiesQNurse::getUuid);
			attributeGetterFunctions.put(
				"medicalFacilitiesQNurseId",
				MedicalFacilitiesQNurse::getMedicalFacilitiesQNurseId);
			attributeGetterFunctions.put(
				"groupId", MedicalFacilitiesQNurse::getGroupId);
			attributeGetterFunctions.put(
				"companyId", MedicalFacilitiesQNurse::getCompanyId);
			attributeGetterFunctions.put(
				"userId", MedicalFacilitiesQNurse::getUserId);
			attributeGetterFunctions.put(
				"userName", MedicalFacilitiesQNurse::getUserName);
			attributeGetterFunctions.put(
				"createDate", MedicalFacilitiesQNurse::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", MedicalFacilitiesQNurse::getModifiedDate);
			attributeGetterFunctions.put(
				"checkQualifiedNurse",
				MedicalFacilitiesQNurse::getCheckQualifiedNurse);
			attributeGetterFunctions.put(
				"name", MedicalFacilitiesQNurse::getName);
			attributeGetterFunctions.put(
				"qualification", MedicalFacilitiesQNurse::getQualification);
			attributeGetterFunctions.put(
				"nursingStaffCategory",
				MedicalFacilitiesQNurse::getNursingStaffCategory);
			attributeGetterFunctions.put(
				"qNurseName", MedicalFacilitiesQNurse::getQNurseName);
			attributeGetterFunctions.put(
				"qNurseQualification",
				MedicalFacilitiesQNurse::getQNurseQualification);
			attributeGetterFunctions.put(
				"ratioOfQNurses", MedicalFacilitiesQNurse::getRatioOfQNurses);
			attributeGetterFunctions.put(
				"medicalFacilitiesAppId",
				MedicalFacilitiesQNurse::getMedicalFacilitiesAppId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<MedicalFacilitiesQNurse, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<MedicalFacilitiesQNurse, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<MedicalFacilitiesQNurse, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setUuid);
			attributeSetterBiConsumers.put(
				"medicalFacilitiesQNurseId",
				(BiConsumer<MedicalFacilitiesQNurse, Long>)
					MedicalFacilitiesQNurse::setMedicalFacilitiesQNurseId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<MedicalFacilitiesQNurse, Long>)
					MedicalFacilitiesQNurse::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<MedicalFacilitiesQNurse, Long>)
					MedicalFacilitiesQNurse::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<MedicalFacilitiesQNurse, Long>)
					MedicalFacilitiesQNurse::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<MedicalFacilitiesQNurse, Date>)
					MedicalFacilitiesQNurse::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<MedicalFacilitiesQNurse, Date>)
					MedicalFacilitiesQNurse::setModifiedDate);
			attributeSetterBiConsumers.put(
				"checkQualifiedNurse",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setCheckQualifiedNurse);
			attributeSetterBiConsumers.put(
				"name",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setName);
			attributeSetterBiConsumers.put(
				"qualification",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setQualification);
			attributeSetterBiConsumers.put(
				"nursingStaffCategory",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setNursingStaffCategory);
			attributeSetterBiConsumers.put(
				"qNurseName",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setQNurseName);
			attributeSetterBiConsumers.put(
				"qNurseQualification",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setQNurseQualification);
			attributeSetterBiConsumers.put(
				"ratioOfQNurses",
				(BiConsumer<MedicalFacilitiesQNurse, String>)
					MedicalFacilitiesQNurse::setRatioOfQNurses);
			attributeSetterBiConsumers.put(
				"medicalFacilitiesAppId",
				(BiConsumer<MedicalFacilitiesQNurse, Long>)
					MedicalFacilitiesQNurse::setMedicalFacilitiesAppId);

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
	public long getMedicalFacilitiesQNurseId() {
		return _medicalFacilitiesQNurseId;
	}

	@Override
	public void setMedicalFacilitiesQNurseId(long medicalFacilitiesQNurseId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medicalFacilitiesQNurseId = medicalFacilitiesQNurseId;
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
	public String getCheckQualifiedNurse() {
		if (_checkQualifiedNurse == null) {
			return "";
		}
		else {
			return _checkQualifiedNurse;
		}
	}

	@Override
	public void setCheckQualifiedNurse(String checkQualifiedNurse) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_checkQualifiedNurse = checkQualifiedNurse;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public String getQualification() {
		if (_qualification == null) {
			return "";
		}
		else {
			return _qualification;
		}
	}

	@Override
	public void setQualification(String qualification) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_qualification = qualification;
	}

	@JSON
	@Override
	public String getNursingStaffCategory() {
		if (_nursingStaffCategory == null) {
			return "";
		}
		else {
			return _nursingStaffCategory;
		}
	}

	@Override
	public void setNursingStaffCategory(String nursingStaffCategory) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nursingStaffCategory = nursingStaffCategory;
	}

	@JSON
	@Override
	public String getQNurseName() {
		if (_qNurseName == null) {
			return "";
		}
		else {
			return _qNurseName;
		}
	}

	@Override
	public void setQNurseName(String qNurseName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_qNurseName = qNurseName;
	}

	@JSON
	@Override
	public String getQNurseQualification() {
		if (_qNurseQualification == null) {
			return "";
		}
		else {
			return _qNurseQualification;
		}
	}

	@Override
	public void setQNurseQualification(String qNurseQualification) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_qNurseQualification = qNurseQualification;
	}

	@JSON
	@Override
	public String getRatioOfQNurses() {
		if (_ratioOfQNurses == null) {
			return "";
		}
		else {
			return _ratioOfQNurses;
		}
	}

	@Override
	public void setRatioOfQNurses(String ratioOfQNurses) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ratioOfQNurses = ratioOfQNurses;
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
			PortalUtil.getClassNameId(MedicalFacilitiesQNurse.class.getName()));
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
			getCompanyId(), MedicalFacilitiesQNurse.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MedicalFacilitiesQNurse toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, MedicalFacilitiesQNurse>
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
		MedicalFacilitiesQNurseImpl medicalFacilitiesQNurseImpl =
			new MedicalFacilitiesQNurseImpl();

		medicalFacilitiesQNurseImpl.setUuid(getUuid());
		medicalFacilitiesQNurseImpl.setMedicalFacilitiesQNurseId(
			getMedicalFacilitiesQNurseId());
		medicalFacilitiesQNurseImpl.setGroupId(getGroupId());
		medicalFacilitiesQNurseImpl.setCompanyId(getCompanyId());
		medicalFacilitiesQNurseImpl.setUserId(getUserId());
		medicalFacilitiesQNurseImpl.setUserName(getUserName());
		medicalFacilitiesQNurseImpl.setCreateDate(getCreateDate());
		medicalFacilitiesQNurseImpl.setModifiedDate(getModifiedDate());
		medicalFacilitiesQNurseImpl.setCheckQualifiedNurse(
			getCheckQualifiedNurse());
		medicalFacilitiesQNurseImpl.setName(getName());
		medicalFacilitiesQNurseImpl.setQualification(getQualification());
		medicalFacilitiesQNurseImpl.setNursingStaffCategory(
			getNursingStaffCategory());
		medicalFacilitiesQNurseImpl.setQNurseName(getQNurseName());
		medicalFacilitiesQNurseImpl.setQNurseQualification(
			getQNurseQualification());
		medicalFacilitiesQNurseImpl.setRatioOfQNurses(getRatioOfQNurses());
		medicalFacilitiesQNurseImpl.setMedicalFacilitiesAppId(
			getMedicalFacilitiesAppId());

		medicalFacilitiesQNurseImpl.resetOriginalValues();

		return medicalFacilitiesQNurseImpl;
	}

	@Override
	public MedicalFacilitiesQNurse cloneWithOriginalValues() {
		MedicalFacilitiesQNurseImpl medicalFacilitiesQNurseImpl =
			new MedicalFacilitiesQNurseImpl();

		medicalFacilitiesQNurseImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		medicalFacilitiesQNurseImpl.setMedicalFacilitiesQNurseId(
			this.<Long>getColumnOriginalValue("medicalFacilitiesQNurseId"));
		medicalFacilitiesQNurseImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		medicalFacilitiesQNurseImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		medicalFacilitiesQNurseImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		medicalFacilitiesQNurseImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		medicalFacilitiesQNurseImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		medicalFacilitiesQNurseImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		medicalFacilitiesQNurseImpl.setCheckQualifiedNurse(
			this.<String>getColumnOriginalValue("checkQualifiedNurse"));
		medicalFacilitiesQNurseImpl.setName(
			this.<String>getColumnOriginalValue("name"));
		medicalFacilitiesQNurseImpl.setQualification(
			this.<String>getColumnOriginalValue("qualification"));
		medicalFacilitiesQNurseImpl.setNursingStaffCategory(
			this.<String>getColumnOriginalValue("nursingStaffCategory"));
		medicalFacilitiesQNurseImpl.setQNurseName(
			this.<String>getColumnOriginalValue("qNurseName"));
		medicalFacilitiesQNurseImpl.setQNurseQualification(
			this.<String>getColumnOriginalValue("qNurseQualification"));
		medicalFacilitiesQNurseImpl.setRatioOfQNurses(
			this.<String>getColumnOriginalValue("ratioOfQNurses"));
		medicalFacilitiesQNurseImpl.setMedicalFacilitiesAppId(
			this.<Long>getColumnOriginalValue("medicalFacilitiesAppId"));

		return medicalFacilitiesQNurseImpl;
	}

	@Override
	public int compareTo(MedicalFacilitiesQNurse medicalFacilitiesQNurse) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), medicalFacilitiesQNurse.getCreateDate());

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

		if (!(object instanceof MedicalFacilitiesQNurse)) {
			return false;
		}

		MedicalFacilitiesQNurse medicalFacilitiesQNurse =
			(MedicalFacilitiesQNurse)object;

		long primaryKey = medicalFacilitiesQNurse.getPrimaryKey();

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
	public CacheModel<MedicalFacilitiesQNurse> toCacheModel() {
		MedicalFacilitiesQNurseCacheModel medicalFacilitiesQNurseCacheModel =
			new MedicalFacilitiesQNurseCacheModel();

		medicalFacilitiesQNurseCacheModel.uuid = getUuid();

		String uuid = medicalFacilitiesQNurseCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			medicalFacilitiesQNurseCacheModel.uuid = null;
		}

		medicalFacilitiesQNurseCacheModel.medicalFacilitiesQNurseId =
			getMedicalFacilitiesQNurseId();

		medicalFacilitiesQNurseCacheModel.groupId = getGroupId();

		medicalFacilitiesQNurseCacheModel.companyId = getCompanyId();

		medicalFacilitiesQNurseCacheModel.userId = getUserId();

		medicalFacilitiesQNurseCacheModel.userName = getUserName();

		String userName = medicalFacilitiesQNurseCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			medicalFacilitiesQNurseCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			medicalFacilitiesQNurseCacheModel.createDate = createDate.getTime();
		}
		else {
			medicalFacilitiesQNurseCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			medicalFacilitiesQNurseCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			medicalFacilitiesQNurseCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		medicalFacilitiesQNurseCacheModel.checkQualifiedNurse =
			getCheckQualifiedNurse();

		String checkQualifiedNurse =
			medicalFacilitiesQNurseCacheModel.checkQualifiedNurse;

		if ((checkQualifiedNurse != null) &&
			(checkQualifiedNurse.length() == 0)) {

			medicalFacilitiesQNurseCacheModel.checkQualifiedNurse = null;
		}

		medicalFacilitiesQNurseCacheModel.name = getName();

		String name = medicalFacilitiesQNurseCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			medicalFacilitiesQNurseCacheModel.name = null;
		}

		medicalFacilitiesQNurseCacheModel.qualification = getQualification();

		String qualification = medicalFacilitiesQNurseCacheModel.qualification;

		if ((qualification != null) && (qualification.length() == 0)) {
			medicalFacilitiesQNurseCacheModel.qualification = null;
		}

		medicalFacilitiesQNurseCacheModel.nursingStaffCategory =
			getNursingStaffCategory();

		String nursingStaffCategory =
			medicalFacilitiesQNurseCacheModel.nursingStaffCategory;

		if ((nursingStaffCategory != null) &&
			(nursingStaffCategory.length() == 0)) {

			medicalFacilitiesQNurseCacheModel.nursingStaffCategory = null;
		}

		medicalFacilitiesQNurseCacheModel.qNurseName = getQNurseName();

		String qNurseName = medicalFacilitiesQNurseCacheModel.qNurseName;

		if ((qNurseName != null) && (qNurseName.length() == 0)) {
			medicalFacilitiesQNurseCacheModel.qNurseName = null;
		}

		medicalFacilitiesQNurseCacheModel.qNurseQualification =
			getQNurseQualification();

		String qNurseQualification =
			medicalFacilitiesQNurseCacheModel.qNurseQualification;

		if ((qNurseQualification != null) &&
			(qNurseQualification.length() == 0)) {

			medicalFacilitiesQNurseCacheModel.qNurseQualification = null;
		}

		medicalFacilitiesQNurseCacheModel.ratioOfQNurses = getRatioOfQNurses();

		String ratioOfQNurses =
			medicalFacilitiesQNurseCacheModel.ratioOfQNurses;

		if ((ratioOfQNurses != null) && (ratioOfQNurses.length() == 0)) {
			medicalFacilitiesQNurseCacheModel.ratioOfQNurses = null;
		}

		medicalFacilitiesQNurseCacheModel.medicalFacilitiesAppId =
			getMedicalFacilitiesAppId();

		return medicalFacilitiesQNurseCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<MedicalFacilitiesQNurse, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<MedicalFacilitiesQNurse, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MedicalFacilitiesQNurse, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(MedicalFacilitiesQNurse)this);

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
			<InvocationHandler, MedicalFacilitiesQNurse>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						MedicalFacilitiesQNurse.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _medicalFacilitiesQNurseId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _checkQualifiedNurse;
	private String _name;
	private String _qualification;
	private String _nursingStaffCategory;
	private String _qNurseName;
	private String _qNurseQualification;
	private String _ratioOfQNurses;
	private long _medicalFacilitiesAppId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<MedicalFacilitiesQNurse, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((MedicalFacilitiesQNurse)this);
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
			"medicalFacilitiesQNurseId", _medicalFacilitiesQNurseId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("checkQualifiedNurse", _checkQualifiedNurse);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("qualification", _qualification);
		_columnOriginalValues.put(
			"nursingStaffCategory", _nursingStaffCategory);
		_columnOriginalValues.put("qNurseName", _qNurseName);
		_columnOriginalValues.put("qNurseQualification", _qNurseQualification);
		_columnOriginalValues.put("ratioOfQNurses", _ratioOfQNurses);
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

		columnBitmasks.put("medicalFacilitiesQNurseId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("checkQualifiedNurse", 256L);

		columnBitmasks.put("name", 512L);

		columnBitmasks.put("qualification", 1024L);

		columnBitmasks.put("nursingStaffCategory", 2048L);

		columnBitmasks.put("qNurseName", 4096L);

		columnBitmasks.put("qNurseQualification", 8192L);

		columnBitmasks.put("ratioOfQNurses", 16384L);

		columnBitmasks.put("medicalFacilitiesAppId", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private MedicalFacilitiesQNurse _escapedModel;

}