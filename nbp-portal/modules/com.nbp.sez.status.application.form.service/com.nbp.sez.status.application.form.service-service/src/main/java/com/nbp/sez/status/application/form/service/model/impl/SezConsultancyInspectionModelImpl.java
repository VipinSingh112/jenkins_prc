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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.sez.status.application.form.service.model.SezConsultancyInspection;
import com.nbp.sez.status.application.form.service.model.SezConsultancyInspectionModel;

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
 * The base model implementation for the SezConsultancyInspection service. Represents a row in the &quot;nbp_sez_consultancy_service&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SezConsultancyInspectionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SezConsultancyInspectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezConsultancyInspectionImpl
 * @generated
 */
@JSON(strict = true)
public class SezConsultancyInspectionModelImpl
	extends BaseModelImpl<SezConsultancyInspection>
	implements SezConsultancyInspectionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez consultancy inspection model instance should use the <code>SezConsultancyInspection</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_consultancy_service";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezConsultancyInspectionId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"doYouWant", Types.VARCHAR},
		{"consultancyName", Types.VARCHAR}, {"consultancyEmail", Types.VARCHAR},
		{"consultancyPhoneNum", Types.VARCHAR},
		{"consultancyDateBirth", Types.TIMESTAMP},
		{"consultancyBirthCountry", Types.VARCHAR},
		{"consultancyCountry", Types.VARCHAR},
		{"consultancySezStatus", Types.VARCHAR}, {"agendaName", Types.VARCHAR},
		{"dateForInspection", Types.TIMESTAMP},
		{"consultancyTime", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezConsultancyInspectionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("doYouWant", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("consultancyName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("consultancyEmail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("consultancyPhoneNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("consultancyDateBirth", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("consultancyBirthCountry", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("consultancyCountry", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("consultancySezStatus", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("agendaName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateForInspection", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("consultancyTime", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_consultancy_service (sezConsultancyInspectionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,doYouWant VARCHAR(75) null,consultancyName VARCHAR(75) null,consultancyEmail VARCHAR(75) null,consultancyPhoneNum VARCHAR(75) null,consultancyDateBirth DATE null,consultancyBirthCountry VARCHAR(75) null,consultancyCountry VARCHAR(75) null,consultancySezStatus VARCHAR(75) null,agendaName VARCHAR(75) null,dateForInspection DATE null,consultancyTime VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_consultancy_service";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezConsultancyInspection.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_consultancy_service.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long DOYOUWANT_COLUMN_BITMASK = 1L;

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

	public SezConsultancyInspectionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezConsultancyInspectionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezConsultancyInspectionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezConsultancyInspectionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SezConsultancyInspection.class;
	}

	@Override
	public String getModelClassName() {
		return SezConsultancyInspection.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SezConsultancyInspection, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SezConsultancyInspection, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezConsultancyInspection, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SezConsultancyInspection)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SezConsultancyInspection, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SezConsultancyInspection, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SezConsultancyInspection)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SezConsultancyInspection, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SezConsultancyInspection, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<SezConsultancyInspection, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<SezConsultancyInspection, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<SezConsultancyInspection, Object>>();

			attributeGetterFunctions.put(
				"sezConsultancyInspectionId",
				SezConsultancyInspection::getSezConsultancyInspectionId);
			attributeGetterFunctions.put(
				"groupId", SezConsultancyInspection::getGroupId);
			attributeGetterFunctions.put(
				"companyId", SezConsultancyInspection::getCompanyId);
			attributeGetterFunctions.put(
				"userId", SezConsultancyInspection::getUserId);
			attributeGetterFunctions.put(
				"userName", SezConsultancyInspection::getUserName);
			attributeGetterFunctions.put(
				"createDate", SezConsultancyInspection::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", SezConsultancyInspection::getModifiedDate);
			attributeGetterFunctions.put(
				"doYouWant", SezConsultancyInspection::getDoYouWant);
			attributeGetterFunctions.put(
				"consultancyName",
				SezConsultancyInspection::getConsultancyName);
			attributeGetterFunctions.put(
				"consultancyEmail",
				SezConsultancyInspection::getConsultancyEmail);
			attributeGetterFunctions.put(
				"consultancyPhoneNum",
				SezConsultancyInspection::getConsultancyPhoneNum);
			attributeGetterFunctions.put(
				"consultancyDateBirth",
				SezConsultancyInspection::getConsultancyDateBirth);
			attributeGetterFunctions.put(
				"consultancyBirthCountry",
				SezConsultancyInspection::getConsultancyBirthCountry);
			attributeGetterFunctions.put(
				"consultancyCountry",
				SezConsultancyInspection::getConsultancyCountry);
			attributeGetterFunctions.put(
				"consultancySezStatus",
				SezConsultancyInspection::getConsultancySezStatus);
			attributeGetterFunctions.put(
				"agendaName", SezConsultancyInspection::getAgendaName);
			attributeGetterFunctions.put(
				"dateForInspection",
				SezConsultancyInspection::getDateForInspection);
			attributeGetterFunctions.put(
				"consultancyTime",
				SezConsultancyInspection::getConsultancyTime);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<SezConsultancyInspection, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<SezConsultancyInspection, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<SezConsultancyInspection, ?>>();

			attributeSetterBiConsumers.put(
				"sezConsultancyInspectionId",
				(BiConsumer<SezConsultancyInspection, Long>)
					SezConsultancyInspection::setSezConsultancyInspectionId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<SezConsultancyInspection, Long>)
					SezConsultancyInspection::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<SezConsultancyInspection, Long>)
					SezConsultancyInspection::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<SezConsultancyInspection, Long>)
					SezConsultancyInspection::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<SezConsultancyInspection, Date>)
					SezConsultancyInspection::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<SezConsultancyInspection, Date>)
					SezConsultancyInspection::setModifiedDate);
			attributeSetterBiConsumers.put(
				"doYouWant",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setDoYouWant);
			attributeSetterBiConsumers.put(
				"consultancyName",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setConsultancyName);
			attributeSetterBiConsumers.put(
				"consultancyEmail",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setConsultancyEmail);
			attributeSetterBiConsumers.put(
				"consultancyPhoneNum",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setConsultancyPhoneNum);
			attributeSetterBiConsumers.put(
				"consultancyDateBirth",
				(BiConsumer<SezConsultancyInspection, Date>)
					SezConsultancyInspection::setConsultancyDateBirth);
			attributeSetterBiConsumers.put(
				"consultancyBirthCountry",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setConsultancyBirthCountry);
			attributeSetterBiConsumers.put(
				"consultancyCountry",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setConsultancyCountry);
			attributeSetterBiConsumers.put(
				"consultancySezStatus",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setConsultancySezStatus);
			attributeSetterBiConsumers.put(
				"agendaName",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setAgendaName);
			attributeSetterBiConsumers.put(
				"dateForInspection",
				(BiConsumer<SezConsultancyInspection, Date>)
					SezConsultancyInspection::setDateForInspection);
			attributeSetterBiConsumers.put(
				"consultancyTime",
				(BiConsumer<SezConsultancyInspection, String>)
					SezConsultancyInspection::setConsultancyTime);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezConsultancyInspectionId() {
		return _sezConsultancyInspectionId;
	}

	@Override
	public void setSezConsultancyInspectionId(long sezConsultancyInspectionId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezConsultancyInspectionId = sezConsultancyInspectionId;
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
	public String getDoYouWant() {
		if (_doYouWant == null) {
			return "";
		}
		else {
			return _doYouWant;
		}
	}

	@Override
	public void setDoYouWant(String doYouWant) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_doYouWant = doYouWant;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalDoYouWant() {
		return getColumnOriginalValue("doYouWant");
	}

	@JSON
	@Override
	public String getConsultancyName() {
		if (_consultancyName == null) {
			return "";
		}
		else {
			return _consultancyName;
		}
	}

	@Override
	public void setConsultancyName(String consultancyName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_consultancyName = consultancyName;
	}

	@JSON
	@Override
	public String getConsultancyEmail() {
		if (_consultancyEmail == null) {
			return "";
		}
		else {
			return _consultancyEmail;
		}
	}

	@Override
	public void setConsultancyEmail(String consultancyEmail) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_consultancyEmail = consultancyEmail;
	}

	@JSON
	@Override
	public String getConsultancyPhoneNum() {
		if (_consultancyPhoneNum == null) {
			return "";
		}
		else {
			return _consultancyPhoneNum;
		}
	}

	@Override
	public void setConsultancyPhoneNum(String consultancyPhoneNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_consultancyPhoneNum = consultancyPhoneNum;
	}

	@JSON
	@Override
	public Date getConsultancyDateBirth() {
		return _consultancyDateBirth;
	}

	@Override
	public void setConsultancyDateBirth(Date consultancyDateBirth) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_consultancyDateBirth = consultancyDateBirth;
	}

	@JSON
	@Override
	public String getConsultancyBirthCountry() {
		if (_consultancyBirthCountry == null) {
			return "";
		}
		else {
			return _consultancyBirthCountry;
		}
	}

	@Override
	public void setConsultancyBirthCountry(String consultancyBirthCountry) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_consultancyBirthCountry = consultancyBirthCountry;
	}

	@JSON
	@Override
	public String getConsultancyCountry() {
		if (_consultancyCountry == null) {
			return "";
		}
		else {
			return _consultancyCountry;
		}
	}

	@Override
	public void setConsultancyCountry(String consultancyCountry) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_consultancyCountry = consultancyCountry;
	}

	@JSON
	@Override
	public String getConsultancySezStatus() {
		if (_consultancySezStatus == null) {
			return "";
		}
		else {
			return _consultancySezStatus;
		}
	}

	@Override
	public void setConsultancySezStatus(String consultancySezStatus) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_consultancySezStatus = consultancySezStatus;
	}

	@JSON
	@Override
	public String getAgendaName() {
		if (_agendaName == null) {
			return "";
		}
		else {
			return _agendaName;
		}
	}

	@Override
	public void setAgendaName(String agendaName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_agendaName = agendaName;
	}

	@JSON
	@Override
	public Date getDateForInspection() {
		return _dateForInspection;
	}

	@Override
	public void setDateForInspection(Date dateForInspection) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateForInspection = dateForInspection;
	}

	@JSON
	@Override
	public String getConsultancyTime() {
		if (_consultancyTime == null) {
			return "";
		}
		else {
			return _consultancyTime;
		}
	}

	@Override
	public void setConsultancyTime(String consultancyTime) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_consultancyTime = consultancyTime;
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
			getCompanyId(), SezConsultancyInspection.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SezConsultancyInspection toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SezConsultancyInspection>
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
		SezConsultancyInspectionImpl sezConsultancyInspectionImpl =
			new SezConsultancyInspectionImpl();

		sezConsultancyInspectionImpl.setSezConsultancyInspectionId(
			getSezConsultancyInspectionId());
		sezConsultancyInspectionImpl.setGroupId(getGroupId());
		sezConsultancyInspectionImpl.setCompanyId(getCompanyId());
		sezConsultancyInspectionImpl.setUserId(getUserId());
		sezConsultancyInspectionImpl.setUserName(getUserName());
		sezConsultancyInspectionImpl.setCreateDate(getCreateDate());
		sezConsultancyInspectionImpl.setModifiedDate(getModifiedDate());
		sezConsultancyInspectionImpl.setDoYouWant(getDoYouWant());
		sezConsultancyInspectionImpl.setConsultancyName(getConsultancyName());
		sezConsultancyInspectionImpl.setConsultancyEmail(getConsultancyEmail());
		sezConsultancyInspectionImpl.setConsultancyPhoneNum(
			getConsultancyPhoneNum());
		sezConsultancyInspectionImpl.setConsultancyDateBirth(
			getConsultancyDateBirth());
		sezConsultancyInspectionImpl.setConsultancyBirthCountry(
			getConsultancyBirthCountry());
		sezConsultancyInspectionImpl.setConsultancyCountry(
			getConsultancyCountry());
		sezConsultancyInspectionImpl.setConsultancySezStatus(
			getConsultancySezStatus());
		sezConsultancyInspectionImpl.setAgendaName(getAgendaName());
		sezConsultancyInspectionImpl.setDateForInspection(
			getDateForInspection());
		sezConsultancyInspectionImpl.setConsultancyTime(getConsultancyTime());

		sezConsultancyInspectionImpl.resetOriginalValues();

		return sezConsultancyInspectionImpl;
	}

	@Override
	public SezConsultancyInspection cloneWithOriginalValues() {
		SezConsultancyInspectionImpl sezConsultancyInspectionImpl =
			new SezConsultancyInspectionImpl();

		sezConsultancyInspectionImpl.setSezConsultancyInspectionId(
			this.<Long>getColumnOriginalValue("sezConsultancyInspectionId"));
		sezConsultancyInspectionImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezConsultancyInspectionImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezConsultancyInspectionImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezConsultancyInspectionImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezConsultancyInspectionImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezConsultancyInspectionImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezConsultancyInspectionImpl.setDoYouWant(
			this.<String>getColumnOriginalValue("doYouWant"));
		sezConsultancyInspectionImpl.setConsultancyName(
			this.<String>getColumnOriginalValue("consultancyName"));
		sezConsultancyInspectionImpl.setConsultancyEmail(
			this.<String>getColumnOriginalValue("consultancyEmail"));
		sezConsultancyInspectionImpl.setConsultancyPhoneNum(
			this.<String>getColumnOriginalValue("consultancyPhoneNum"));
		sezConsultancyInspectionImpl.setConsultancyDateBirth(
			this.<Date>getColumnOriginalValue("consultancyDateBirth"));
		sezConsultancyInspectionImpl.setConsultancyBirthCountry(
			this.<String>getColumnOriginalValue("consultancyBirthCountry"));
		sezConsultancyInspectionImpl.setConsultancyCountry(
			this.<String>getColumnOriginalValue("consultancyCountry"));
		sezConsultancyInspectionImpl.setConsultancySezStatus(
			this.<String>getColumnOriginalValue("consultancySezStatus"));
		sezConsultancyInspectionImpl.setAgendaName(
			this.<String>getColumnOriginalValue("agendaName"));
		sezConsultancyInspectionImpl.setDateForInspection(
			this.<Date>getColumnOriginalValue("dateForInspection"));
		sezConsultancyInspectionImpl.setConsultancyTime(
			this.<String>getColumnOriginalValue("consultancyTime"));

		return sezConsultancyInspectionImpl;
	}

	@Override
	public int compareTo(SezConsultancyInspection sezConsultancyInspection) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezConsultancyInspection.getCreateDate());

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

		if (!(object instanceof SezConsultancyInspection)) {
			return false;
		}

		SezConsultancyInspection sezConsultancyInspection =
			(SezConsultancyInspection)object;

		long primaryKey = sezConsultancyInspection.getPrimaryKey();

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
	public CacheModel<SezConsultancyInspection> toCacheModel() {
		SezConsultancyInspectionCacheModel sezConsultancyInspectionCacheModel =
			new SezConsultancyInspectionCacheModel();

		sezConsultancyInspectionCacheModel.sezConsultancyInspectionId =
			getSezConsultancyInspectionId();

		sezConsultancyInspectionCacheModel.groupId = getGroupId();

		sezConsultancyInspectionCacheModel.companyId = getCompanyId();

		sezConsultancyInspectionCacheModel.userId = getUserId();

		sezConsultancyInspectionCacheModel.userName = getUserName();

		String userName = sezConsultancyInspectionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezConsultancyInspectionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezConsultancyInspectionCacheModel.createDate =
				createDate.getTime();
		}
		else {
			sezConsultancyInspectionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezConsultancyInspectionCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			sezConsultancyInspectionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezConsultancyInspectionCacheModel.doYouWant = getDoYouWant();

		String doYouWant = sezConsultancyInspectionCacheModel.doYouWant;

		if ((doYouWant != null) && (doYouWant.length() == 0)) {
			sezConsultancyInspectionCacheModel.doYouWant = null;
		}

		sezConsultancyInspectionCacheModel.consultancyName =
			getConsultancyName();

		String consultancyName =
			sezConsultancyInspectionCacheModel.consultancyName;

		if ((consultancyName != null) && (consultancyName.length() == 0)) {
			sezConsultancyInspectionCacheModel.consultancyName = null;
		}

		sezConsultancyInspectionCacheModel.consultancyEmail =
			getConsultancyEmail();

		String consultancyEmail =
			sezConsultancyInspectionCacheModel.consultancyEmail;

		if ((consultancyEmail != null) && (consultancyEmail.length() == 0)) {
			sezConsultancyInspectionCacheModel.consultancyEmail = null;
		}

		sezConsultancyInspectionCacheModel.consultancyPhoneNum =
			getConsultancyPhoneNum();

		String consultancyPhoneNum =
			sezConsultancyInspectionCacheModel.consultancyPhoneNum;

		if ((consultancyPhoneNum != null) &&
			(consultancyPhoneNum.length() == 0)) {

			sezConsultancyInspectionCacheModel.consultancyPhoneNum = null;
		}

		Date consultancyDateBirth = getConsultancyDateBirth();

		if (consultancyDateBirth != null) {
			sezConsultancyInspectionCacheModel.consultancyDateBirth =
				consultancyDateBirth.getTime();
		}
		else {
			sezConsultancyInspectionCacheModel.consultancyDateBirth =
				Long.MIN_VALUE;
		}

		sezConsultancyInspectionCacheModel.consultancyBirthCountry =
			getConsultancyBirthCountry();

		String consultancyBirthCountry =
			sezConsultancyInspectionCacheModel.consultancyBirthCountry;

		if ((consultancyBirthCountry != null) &&
			(consultancyBirthCountry.length() == 0)) {

			sezConsultancyInspectionCacheModel.consultancyBirthCountry = null;
		}

		sezConsultancyInspectionCacheModel.consultancyCountry =
			getConsultancyCountry();

		String consultancyCountry =
			sezConsultancyInspectionCacheModel.consultancyCountry;

		if ((consultancyCountry != null) &&
			(consultancyCountry.length() == 0)) {

			sezConsultancyInspectionCacheModel.consultancyCountry = null;
		}

		sezConsultancyInspectionCacheModel.consultancySezStatus =
			getConsultancySezStatus();

		String consultancySezStatus =
			sezConsultancyInspectionCacheModel.consultancySezStatus;

		if ((consultancySezStatus != null) &&
			(consultancySezStatus.length() == 0)) {

			sezConsultancyInspectionCacheModel.consultancySezStatus = null;
		}

		sezConsultancyInspectionCacheModel.agendaName = getAgendaName();

		String agendaName = sezConsultancyInspectionCacheModel.agendaName;

		if ((agendaName != null) && (agendaName.length() == 0)) {
			sezConsultancyInspectionCacheModel.agendaName = null;
		}

		Date dateForInspection = getDateForInspection();

		if (dateForInspection != null) {
			sezConsultancyInspectionCacheModel.dateForInspection =
				dateForInspection.getTime();
		}
		else {
			sezConsultancyInspectionCacheModel.dateForInspection =
				Long.MIN_VALUE;
		}

		sezConsultancyInspectionCacheModel.consultancyTime =
			getConsultancyTime();

		String consultancyTime =
			sezConsultancyInspectionCacheModel.consultancyTime;

		if ((consultancyTime != null) && (consultancyTime.length() == 0)) {
			sezConsultancyInspectionCacheModel.consultancyTime = null;
		}

		return sezConsultancyInspectionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SezConsultancyInspection, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SezConsultancyInspection, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SezConsultancyInspection, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(SezConsultancyInspection)this);

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
			<InvocationHandler, SezConsultancyInspection>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						SezConsultancyInspection.class, ModelWrapper.class);

	}

	private long _sezConsultancyInspectionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _doYouWant;
	private String _consultancyName;
	private String _consultancyEmail;
	private String _consultancyPhoneNum;
	private Date _consultancyDateBirth;
	private String _consultancyBirthCountry;
	private String _consultancyCountry;
	private String _consultancySezStatus;
	private String _agendaName;
	private Date _dateForInspection;
	private String _consultancyTime;

	public <T> T getColumnValue(String columnName) {
		Function<SezConsultancyInspection, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SezConsultancyInspection)this);
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
			"sezConsultancyInspectionId", _sezConsultancyInspectionId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("doYouWant", _doYouWant);
		_columnOriginalValues.put("consultancyName", _consultancyName);
		_columnOriginalValues.put("consultancyEmail", _consultancyEmail);
		_columnOriginalValues.put("consultancyPhoneNum", _consultancyPhoneNum);
		_columnOriginalValues.put(
			"consultancyDateBirth", _consultancyDateBirth);
		_columnOriginalValues.put(
			"consultancyBirthCountry", _consultancyBirthCountry);
		_columnOriginalValues.put("consultancyCountry", _consultancyCountry);
		_columnOriginalValues.put(
			"consultancySezStatus", _consultancySezStatus);
		_columnOriginalValues.put("agendaName", _agendaName);
		_columnOriginalValues.put("dateForInspection", _dateForInspection);
		_columnOriginalValues.put("consultancyTime", _consultancyTime);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("sezConsultancyInspectionId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("doYouWant", 128L);

		columnBitmasks.put("consultancyName", 256L);

		columnBitmasks.put("consultancyEmail", 512L);

		columnBitmasks.put("consultancyPhoneNum", 1024L);

		columnBitmasks.put("consultancyDateBirth", 2048L);

		columnBitmasks.put("consultancyBirthCountry", 4096L);

		columnBitmasks.put("consultancyCountry", 8192L);

		columnBitmasks.put("consultancySezStatus", 16384L);

		columnBitmasks.put("agendaName", 32768L);

		columnBitmasks.put("dateForInspection", 65536L);

		columnBitmasks.put("consultancyTime", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SezConsultancyInspection _escapedModel;

}