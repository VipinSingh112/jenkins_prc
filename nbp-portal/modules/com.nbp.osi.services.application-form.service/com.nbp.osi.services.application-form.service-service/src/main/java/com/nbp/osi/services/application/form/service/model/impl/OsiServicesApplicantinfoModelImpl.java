/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicantinfoModel;

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
 * The base model implementation for the OsiServicesApplicantinfo service. Represents a row in the &quot;nbp_osi_services_appli_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OsiServicesApplicantinfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiServicesApplicantinfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicantinfoImpl
 * @generated
 */
@JSON(strict = true)
public class OsiServicesApplicantinfoModelImpl
	extends BaseModelImpl<OsiServicesApplicantinfo>
	implements OsiServicesApplicantinfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi services applicantinfo model instance should use the <code>OsiServicesApplicantinfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_services_appli_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"osiServicesApplicanId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"applicantNature", Types.VARCHAR}, {"indiFirstName", Types.VARCHAR},
		{"indiLastName", Types.VARCHAR}, {"companyName", Types.VARCHAR},
		{"address", Types.VARCHAR}, {"emailAddress", Types.VARCHAR},
		{"telephone", Types.VARCHAR}, {"applicationDate", Types.TIMESTAMP},
		{"trnNumber", Types.VARCHAR}, {"osiServicesApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiServicesApplicanId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("applicantNature", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("indiFirstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("indiLastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("companyName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("emailAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("telephone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicationDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("trnNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiServicesApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_services_appli_info (uuid_ VARCHAR(75) null,osiServicesApplicanId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,applicantNature VARCHAR(75) null,indiFirstName VARCHAR(75) null,indiLastName VARCHAR(75) null,companyName VARCHAR(75) null,address VARCHAR(500) null,emailAddress VARCHAR(75) null,telephone VARCHAR(75) null,applicationDate DATE null,trnNumber VARCHAR(75) null,osiServicesApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_services_appli_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY osiServicesApplicantinfo.osiServicesApplicanId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_services_appli_info.osiServicesApplicanId ASC";

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
	public static final long OSISERVICESAPPLICATIONID_COLUMN_BITMASK = 4L;

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
	public static final long OSISERVICESAPPLICANID_COLUMN_BITMASK = 16L;

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

	public OsiServicesApplicantinfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _osiServicesApplicanId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOsiServicesApplicanId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _osiServicesApplicanId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OsiServicesApplicantinfo.class;
	}

	@Override
	public String getModelClassName() {
		return OsiServicesApplicantinfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<OsiServicesApplicantinfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<OsiServicesApplicantinfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiServicesApplicantinfo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((OsiServicesApplicantinfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OsiServicesApplicantinfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OsiServicesApplicantinfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(OsiServicesApplicantinfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OsiServicesApplicantinfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OsiServicesApplicantinfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<OsiServicesApplicantinfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<OsiServicesApplicantinfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<OsiServicesApplicantinfo, Object>>();

			attributeGetterFunctions.put(
				"uuid", OsiServicesApplicantinfo::getUuid);
			attributeGetterFunctions.put(
				"osiServicesApplicanId",
				OsiServicesApplicantinfo::getOsiServicesApplicanId);
			attributeGetterFunctions.put(
				"groupId", OsiServicesApplicantinfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", OsiServicesApplicantinfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", OsiServicesApplicantinfo::getUserId);
			attributeGetterFunctions.put(
				"userName", OsiServicesApplicantinfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", OsiServicesApplicantinfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", OsiServicesApplicantinfo::getModifiedDate);
			attributeGetterFunctions.put(
				"applicantNature",
				OsiServicesApplicantinfo::getApplicantNature);
			attributeGetterFunctions.put(
				"indiFirstName", OsiServicesApplicantinfo::getIndiFirstName);
			attributeGetterFunctions.put(
				"indiLastName", OsiServicesApplicantinfo::getIndiLastName);
			attributeGetterFunctions.put(
				"companyName", OsiServicesApplicantinfo::getCompanyName);
			attributeGetterFunctions.put(
				"address", OsiServicesApplicantinfo::getAddress);
			attributeGetterFunctions.put(
				"emailAddress", OsiServicesApplicantinfo::getEmailAddress);
			attributeGetterFunctions.put(
				"telephone", OsiServicesApplicantinfo::getTelephone);
			attributeGetterFunctions.put(
				"applicationDate",
				OsiServicesApplicantinfo::getApplicationDate);
			attributeGetterFunctions.put(
				"trnNumber", OsiServicesApplicantinfo::getTrnNumber);
			attributeGetterFunctions.put(
				"osiServicesApplicationId",
				OsiServicesApplicantinfo::getOsiServicesApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<OsiServicesApplicantinfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<OsiServicesApplicantinfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<OsiServicesApplicantinfo, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setUuid);
			attributeSetterBiConsumers.put(
				"osiServicesApplicanId",
				(BiConsumer<OsiServicesApplicantinfo, Long>)
					OsiServicesApplicantinfo::setOsiServicesApplicanId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<OsiServicesApplicantinfo, Long>)
					OsiServicesApplicantinfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<OsiServicesApplicantinfo, Long>)
					OsiServicesApplicantinfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<OsiServicesApplicantinfo, Long>)
					OsiServicesApplicantinfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<OsiServicesApplicantinfo, Date>)
					OsiServicesApplicantinfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<OsiServicesApplicantinfo, Date>)
					OsiServicesApplicantinfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"applicantNature",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setApplicantNature);
			attributeSetterBiConsumers.put(
				"indiFirstName",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setIndiFirstName);
			attributeSetterBiConsumers.put(
				"indiLastName",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setIndiLastName);
			attributeSetterBiConsumers.put(
				"companyName",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setCompanyName);
			attributeSetterBiConsumers.put(
				"address",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setAddress);
			attributeSetterBiConsumers.put(
				"emailAddress",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setEmailAddress);
			attributeSetterBiConsumers.put(
				"telephone",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setTelephone);
			attributeSetterBiConsumers.put(
				"applicationDate",
				(BiConsumer<OsiServicesApplicantinfo, Date>)
					OsiServicesApplicantinfo::setApplicationDate);
			attributeSetterBiConsumers.put(
				"trnNumber",
				(BiConsumer<OsiServicesApplicantinfo, String>)
					OsiServicesApplicantinfo::setTrnNumber);
			attributeSetterBiConsumers.put(
				"osiServicesApplicationId",
				(BiConsumer<OsiServicesApplicantinfo, Long>)
					OsiServicesApplicantinfo::setOsiServicesApplicationId);

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
	public long getOsiServicesApplicanId() {
		return _osiServicesApplicanId;
	}

	@Override
	public void setOsiServicesApplicanId(long osiServicesApplicanId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiServicesApplicanId = osiServicesApplicanId;
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
	public String getApplicantNature() {
		if (_applicantNature == null) {
			return "";
		}
		else {
			return _applicantNature;
		}
	}

	@Override
	public void setApplicantNature(String applicantNature) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicantNature = applicantNature;
	}

	@JSON
	@Override
	public String getIndiFirstName() {
		if (_indiFirstName == null) {
			return "";
		}
		else {
			return _indiFirstName;
		}
	}

	@Override
	public void setIndiFirstName(String indiFirstName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_indiFirstName = indiFirstName;
	}

	@JSON
	@Override
	public String getIndiLastName() {
		if (_indiLastName == null) {
			return "";
		}
		else {
			return _indiLastName;
		}
	}

	@Override
	public void setIndiLastName(String indiLastName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_indiLastName = indiLastName;
	}

	@JSON
	@Override
	public String getCompanyName() {
		if (_companyName == null) {
			return "";
		}
		else {
			return _companyName;
		}
	}

	@Override
	public void setCompanyName(String companyName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyName = companyName;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_address = address;
	}

	@JSON
	@Override
	public String getEmailAddress() {
		if (_emailAddress == null) {
			return "";
		}
		else {
			return _emailAddress;
		}
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_emailAddress = emailAddress;
	}

	@JSON
	@Override
	public String getTelephone() {
		if (_telephone == null) {
			return "";
		}
		else {
			return _telephone;
		}
	}

	@Override
	public void setTelephone(String telephone) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_telephone = telephone;
	}

	@JSON
	@Override
	public Date getApplicationDate() {
		return _applicationDate;
	}

	@Override
	public void setApplicationDate(Date applicationDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicationDate = applicationDate;
	}

	@JSON
	@Override
	public String getTrnNumber() {
		if (_trnNumber == null) {
			return "";
		}
		else {
			return _trnNumber;
		}
	}

	@Override
	public void setTrnNumber(String trnNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_trnNumber = trnNumber;
	}

	@JSON
	@Override
	public long getOsiServicesApplicationId() {
		return _osiServicesApplicationId;
	}

	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiServicesApplicationId = osiServicesApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalOsiServicesApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("osiServicesApplicationId"));
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				OsiServicesApplicantinfo.class.getName()));
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
			getCompanyId(), OsiServicesApplicantinfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OsiServicesApplicantinfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OsiServicesApplicantinfo>
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
		OsiServicesApplicantinfoImpl osiServicesApplicantinfoImpl =
			new OsiServicesApplicantinfoImpl();

		osiServicesApplicantinfoImpl.setUuid(getUuid());
		osiServicesApplicantinfoImpl.setOsiServicesApplicanId(
			getOsiServicesApplicanId());
		osiServicesApplicantinfoImpl.setGroupId(getGroupId());
		osiServicesApplicantinfoImpl.setCompanyId(getCompanyId());
		osiServicesApplicantinfoImpl.setUserId(getUserId());
		osiServicesApplicantinfoImpl.setUserName(getUserName());
		osiServicesApplicantinfoImpl.setCreateDate(getCreateDate());
		osiServicesApplicantinfoImpl.setModifiedDate(getModifiedDate());
		osiServicesApplicantinfoImpl.setApplicantNature(getApplicantNature());
		osiServicesApplicantinfoImpl.setIndiFirstName(getIndiFirstName());
		osiServicesApplicantinfoImpl.setIndiLastName(getIndiLastName());
		osiServicesApplicantinfoImpl.setCompanyName(getCompanyName());
		osiServicesApplicantinfoImpl.setAddress(getAddress());
		osiServicesApplicantinfoImpl.setEmailAddress(getEmailAddress());
		osiServicesApplicantinfoImpl.setTelephone(getTelephone());
		osiServicesApplicantinfoImpl.setApplicationDate(getApplicationDate());
		osiServicesApplicantinfoImpl.setTrnNumber(getTrnNumber());
		osiServicesApplicantinfoImpl.setOsiServicesApplicationId(
			getOsiServicesApplicationId());

		osiServicesApplicantinfoImpl.resetOriginalValues();

		return osiServicesApplicantinfoImpl;
	}

	@Override
	public OsiServicesApplicantinfo cloneWithOriginalValues() {
		OsiServicesApplicantinfoImpl osiServicesApplicantinfoImpl =
			new OsiServicesApplicantinfoImpl();

		osiServicesApplicantinfoImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		osiServicesApplicantinfoImpl.setOsiServicesApplicanId(
			this.<Long>getColumnOriginalValue("osiServicesApplicanId"));
		osiServicesApplicantinfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		osiServicesApplicantinfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		osiServicesApplicantinfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		osiServicesApplicantinfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		osiServicesApplicantinfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		osiServicesApplicantinfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		osiServicesApplicantinfoImpl.setApplicantNature(
			this.<String>getColumnOriginalValue("applicantNature"));
		osiServicesApplicantinfoImpl.setIndiFirstName(
			this.<String>getColumnOriginalValue("indiFirstName"));
		osiServicesApplicantinfoImpl.setIndiLastName(
			this.<String>getColumnOriginalValue("indiLastName"));
		osiServicesApplicantinfoImpl.setCompanyName(
			this.<String>getColumnOriginalValue("companyName"));
		osiServicesApplicantinfoImpl.setAddress(
			this.<String>getColumnOriginalValue("address"));
		osiServicesApplicantinfoImpl.setEmailAddress(
			this.<String>getColumnOriginalValue("emailAddress"));
		osiServicesApplicantinfoImpl.setTelephone(
			this.<String>getColumnOriginalValue("telephone"));
		osiServicesApplicantinfoImpl.setApplicationDate(
			this.<Date>getColumnOriginalValue("applicationDate"));
		osiServicesApplicantinfoImpl.setTrnNumber(
			this.<String>getColumnOriginalValue("trnNumber"));
		osiServicesApplicantinfoImpl.setOsiServicesApplicationId(
			this.<Long>getColumnOriginalValue("osiServicesApplicationId"));

		return osiServicesApplicantinfoImpl;
	}

	@Override
	public int compareTo(OsiServicesApplicantinfo osiServicesApplicantinfo) {
		long primaryKey = osiServicesApplicantinfo.getPrimaryKey();

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

		if (!(object instanceof OsiServicesApplicantinfo)) {
			return false;
		}

		OsiServicesApplicantinfo osiServicesApplicantinfo =
			(OsiServicesApplicantinfo)object;

		long primaryKey = osiServicesApplicantinfo.getPrimaryKey();

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
	public CacheModel<OsiServicesApplicantinfo> toCacheModel() {
		OsiServicesApplicantinfoCacheModel osiServicesApplicantinfoCacheModel =
			new OsiServicesApplicantinfoCacheModel();

		osiServicesApplicantinfoCacheModel.uuid = getUuid();

		String uuid = osiServicesApplicantinfoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			osiServicesApplicantinfoCacheModel.uuid = null;
		}

		osiServicesApplicantinfoCacheModel.osiServicesApplicanId =
			getOsiServicesApplicanId();

		osiServicesApplicantinfoCacheModel.groupId = getGroupId();

		osiServicesApplicantinfoCacheModel.companyId = getCompanyId();

		osiServicesApplicantinfoCacheModel.userId = getUserId();

		osiServicesApplicantinfoCacheModel.userName = getUserName();

		String userName = osiServicesApplicantinfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			osiServicesApplicantinfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			osiServicesApplicantinfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			osiServicesApplicantinfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			osiServicesApplicantinfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			osiServicesApplicantinfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		osiServicesApplicantinfoCacheModel.applicantNature =
			getApplicantNature();

		String applicantNature =
			osiServicesApplicantinfoCacheModel.applicantNature;

		if ((applicantNature != null) && (applicantNature.length() == 0)) {
			osiServicesApplicantinfoCacheModel.applicantNature = null;
		}

		osiServicesApplicantinfoCacheModel.indiFirstName = getIndiFirstName();

		String indiFirstName = osiServicesApplicantinfoCacheModel.indiFirstName;

		if ((indiFirstName != null) && (indiFirstName.length() == 0)) {
			osiServicesApplicantinfoCacheModel.indiFirstName = null;
		}

		osiServicesApplicantinfoCacheModel.indiLastName = getIndiLastName();

		String indiLastName = osiServicesApplicantinfoCacheModel.indiLastName;

		if ((indiLastName != null) && (indiLastName.length() == 0)) {
			osiServicesApplicantinfoCacheModel.indiLastName = null;
		}

		osiServicesApplicantinfoCacheModel.companyName = getCompanyName();

		String companyName = osiServicesApplicantinfoCacheModel.companyName;

		if ((companyName != null) && (companyName.length() == 0)) {
			osiServicesApplicantinfoCacheModel.companyName = null;
		}

		osiServicesApplicantinfoCacheModel.address = getAddress();

		String address = osiServicesApplicantinfoCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			osiServicesApplicantinfoCacheModel.address = null;
		}

		osiServicesApplicantinfoCacheModel.emailAddress = getEmailAddress();

		String emailAddress = osiServicesApplicantinfoCacheModel.emailAddress;

		if ((emailAddress != null) && (emailAddress.length() == 0)) {
			osiServicesApplicantinfoCacheModel.emailAddress = null;
		}

		osiServicesApplicantinfoCacheModel.telephone = getTelephone();

		String telephone = osiServicesApplicantinfoCacheModel.telephone;

		if ((telephone != null) && (telephone.length() == 0)) {
			osiServicesApplicantinfoCacheModel.telephone = null;
		}

		Date applicationDate = getApplicationDate();

		if (applicationDate != null) {
			osiServicesApplicantinfoCacheModel.applicationDate =
				applicationDate.getTime();
		}
		else {
			osiServicesApplicantinfoCacheModel.applicationDate = Long.MIN_VALUE;
		}

		osiServicesApplicantinfoCacheModel.trnNumber = getTrnNumber();

		String trnNumber = osiServicesApplicantinfoCacheModel.trnNumber;

		if ((trnNumber != null) && (trnNumber.length() == 0)) {
			osiServicesApplicantinfoCacheModel.trnNumber = null;
		}

		osiServicesApplicantinfoCacheModel.osiServicesApplicationId =
			getOsiServicesApplicationId();

		return osiServicesApplicantinfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OsiServicesApplicantinfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<OsiServicesApplicantinfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiServicesApplicantinfo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(OsiServicesApplicantinfo)this);

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
			<InvocationHandler, OsiServicesApplicantinfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						OsiServicesApplicantinfo.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _osiServicesApplicanId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _applicantNature;
	private String _indiFirstName;
	private String _indiLastName;
	private String _companyName;
	private String _address;
	private String _emailAddress;
	private String _telephone;
	private Date _applicationDate;
	private String _trnNumber;
	private long _osiServicesApplicationId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<OsiServicesApplicantinfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((OsiServicesApplicantinfo)this);
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
			"osiServicesApplicanId", _osiServicesApplicanId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("applicantNature", _applicantNature);
		_columnOriginalValues.put("indiFirstName", _indiFirstName);
		_columnOriginalValues.put("indiLastName", _indiLastName);
		_columnOriginalValues.put("companyName", _companyName);
		_columnOriginalValues.put("address", _address);
		_columnOriginalValues.put("emailAddress", _emailAddress);
		_columnOriginalValues.put("telephone", _telephone);
		_columnOriginalValues.put("applicationDate", _applicationDate);
		_columnOriginalValues.put("trnNumber", _trnNumber);
		_columnOriginalValues.put(
			"osiServicesApplicationId", _osiServicesApplicationId);
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

		columnBitmasks.put("osiServicesApplicanId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("applicantNature", 256L);

		columnBitmasks.put("indiFirstName", 512L);

		columnBitmasks.put("indiLastName", 1024L);

		columnBitmasks.put("companyName", 2048L);

		columnBitmasks.put("address", 4096L);

		columnBitmasks.put("emailAddress", 8192L);

		columnBitmasks.put("telephone", 16384L);

		columnBitmasks.put("applicationDate", 32768L);

		columnBitmasks.put("trnNumber", 65536L);

		columnBitmasks.put("osiServicesApplicationId", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private OsiServicesApplicantinfo _escapedModel;

}