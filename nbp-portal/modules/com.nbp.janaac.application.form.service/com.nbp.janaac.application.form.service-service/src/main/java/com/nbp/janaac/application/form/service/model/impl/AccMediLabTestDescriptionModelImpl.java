/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

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

import com.nbp.janaac.application.form.service.model.AccMediLabTestDescription;
import com.nbp.janaac.application.form.service.model.AccMediLabTestDescriptionModel;

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
 * The base model implementation for the AccMediLabTestDescription service. Represents a row in the &quot;nbp_janaac_acc_med_test_desc&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AccMediLabTestDescriptionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AccMediLabTestDescriptionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestDescriptionImpl
 * @generated
 */
@JSON(strict = true)
public class AccMediLabTestDescriptionModelImpl
	extends BaseModelImpl<AccMediLabTestDescription>
	implements AccMediLabTestDescriptionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acc medi lab test description model instance should use the <code>AccMediLabTestDescription</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_janaac_acc_med_test_desc";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"accMediLabTestDescriptionId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"testClinicalActivity", Types.VARCHAR},
		{"testLabShiftWork", Types.VARCHAR},
		{"testLabSpecimenNo", Types.VARCHAR},
		{"testSpecimenLocation", Types.VARCHAR},
		{"janaacApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("accMediLabTestDescriptionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("testClinicalActivity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("testLabShiftWork", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("testLabSpecimenNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("testSpecimenLocation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("janaacApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_janaac_acc_med_test_desc (uuid_ VARCHAR(75) null,accMediLabTestDescriptionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,testClinicalActivity VARCHAR(75) null,testLabShiftWork VARCHAR(75) null,testLabSpecimenNo VARCHAR(75) null,testSpecimenLocation VARCHAR(75) null,janaacApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_janaac_acc_med_test_desc";

	public static final String ORDER_BY_JPQL =
		" ORDER BY accMediLabTestDescription.accMediLabTestDescriptionId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_janaac_acc_med_test_desc.accMediLabTestDescriptionId ASC";

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
	public static final long JANAACAPPLICATIONID_COLUMN_BITMASK = 4L;

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
	public static final long ACCMEDILABTESTDESCRIPTIONID_COLUMN_BITMASK = 16L;

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

	public AccMediLabTestDescriptionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _accMediLabTestDescriptionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAccMediLabTestDescriptionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _accMediLabTestDescriptionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AccMediLabTestDescription.class;
	}

	@Override
	public String getModelClassName() {
		return AccMediLabTestDescription.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AccMediLabTestDescription, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AccMediLabTestDescription, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AccMediLabTestDescription, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AccMediLabTestDescription)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AccMediLabTestDescription, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AccMediLabTestDescription, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AccMediLabTestDescription)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AccMediLabTestDescription, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AccMediLabTestDescription, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<AccMediLabTestDescription, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<AccMediLabTestDescription, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AccMediLabTestDescription, Object>>();

			attributeGetterFunctions.put(
				"uuid", AccMediLabTestDescription::getUuid);
			attributeGetterFunctions.put(
				"accMediLabTestDescriptionId",
				AccMediLabTestDescription::getAccMediLabTestDescriptionId);
			attributeGetterFunctions.put(
				"groupId", AccMediLabTestDescription::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AccMediLabTestDescription::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AccMediLabTestDescription::getUserId);
			attributeGetterFunctions.put(
				"userName", AccMediLabTestDescription::getUserName);
			attributeGetterFunctions.put(
				"createDate", AccMediLabTestDescription::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AccMediLabTestDescription::getModifiedDate);
			attributeGetterFunctions.put(
				"testClinicalActivity",
				AccMediLabTestDescription::getTestClinicalActivity);
			attributeGetterFunctions.put(
				"testLabShiftWork",
				AccMediLabTestDescription::getTestLabShiftWork);
			attributeGetterFunctions.put(
				"testLabSpecimenNo",
				AccMediLabTestDescription::getTestLabSpecimenNo);
			attributeGetterFunctions.put(
				"testSpecimenLocation",
				AccMediLabTestDescription::getTestSpecimenLocation);
			attributeGetterFunctions.put(
				"janaacApplicationId",
				AccMediLabTestDescription::getJanaacApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AccMediLabTestDescription, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AccMediLabTestDescription, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AccMediLabTestDescription, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<AccMediLabTestDescription, String>)
					AccMediLabTestDescription::setUuid);
			attributeSetterBiConsumers.put(
				"accMediLabTestDescriptionId",
				(BiConsumer<AccMediLabTestDescription, Long>)
					AccMediLabTestDescription::setAccMediLabTestDescriptionId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AccMediLabTestDescription, Long>)
					AccMediLabTestDescription::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AccMediLabTestDescription, Long>)
					AccMediLabTestDescription::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AccMediLabTestDescription, Long>)
					AccMediLabTestDescription::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AccMediLabTestDescription, String>)
					AccMediLabTestDescription::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AccMediLabTestDescription, Date>)
					AccMediLabTestDescription::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AccMediLabTestDescription, Date>)
					AccMediLabTestDescription::setModifiedDate);
			attributeSetterBiConsumers.put(
				"testClinicalActivity",
				(BiConsumer<AccMediLabTestDescription, String>)
					AccMediLabTestDescription::setTestClinicalActivity);
			attributeSetterBiConsumers.put(
				"testLabShiftWork",
				(BiConsumer<AccMediLabTestDescription, String>)
					AccMediLabTestDescription::setTestLabShiftWork);
			attributeSetterBiConsumers.put(
				"testLabSpecimenNo",
				(BiConsumer<AccMediLabTestDescription, String>)
					AccMediLabTestDescription::setTestLabSpecimenNo);
			attributeSetterBiConsumers.put(
				"testSpecimenLocation",
				(BiConsumer<AccMediLabTestDescription, String>)
					AccMediLabTestDescription::setTestSpecimenLocation);
			attributeSetterBiConsumers.put(
				"janaacApplicationId",
				(BiConsumer<AccMediLabTestDescription, Long>)
					AccMediLabTestDescription::setJanaacApplicationId);

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
	public long getAccMediLabTestDescriptionId() {
		return _accMediLabTestDescriptionId;
	}

	@Override
	public void setAccMediLabTestDescriptionId(
		long accMediLabTestDescriptionId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_accMediLabTestDescriptionId = accMediLabTestDescriptionId;
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
	public String getTestClinicalActivity() {
		if (_testClinicalActivity == null) {
			return "";
		}
		else {
			return _testClinicalActivity;
		}
	}

	@Override
	public void setTestClinicalActivity(String testClinicalActivity) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_testClinicalActivity = testClinicalActivity;
	}

	@JSON
	@Override
	public String getTestLabShiftWork() {
		if (_testLabShiftWork == null) {
			return "";
		}
		else {
			return _testLabShiftWork;
		}
	}

	@Override
	public void setTestLabShiftWork(String testLabShiftWork) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_testLabShiftWork = testLabShiftWork;
	}

	@JSON
	@Override
	public String getTestLabSpecimenNo() {
		if (_testLabSpecimenNo == null) {
			return "";
		}
		else {
			return _testLabSpecimenNo;
		}
	}

	@Override
	public void setTestLabSpecimenNo(String testLabSpecimenNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_testLabSpecimenNo = testLabSpecimenNo;
	}

	@JSON
	@Override
	public String getTestSpecimenLocation() {
		if (_testSpecimenLocation == null) {
			return "";
		}
		else {
			return _testSpecimenLocation;
		}
	}

	@Override
	public void setTestSpecimenLocation(String testSpecimenLocation) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_testSpecimenLocation = testSpecimenLocation;
	}

	@JSON
	@Override
	public long getJanaacApplicationId() {
		return _janaacApplicationId;
	}

	@Override
	public void setJanaacApplicationId(long janaacApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_janaacApplicationId = janaacApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalJanaacApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("janaacApplicationId"));
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				AccMediLabTestDescription.class.getName()));
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
			getCompanyId(), AccMediLabTestDescription.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AccMediLabTestDescription toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AccMediLabTestDescription>
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
		AccMediLabTestDescriptionImpl accMediLabTestDescriptionImpl =
			new AccMediLabTestDescriptionImpl();

		accMediLabTestDescriptionImpl.setUuid(getUuid());
		accMediLabTestDescriptionImpl.setAccMediLabTestDescriptionId(
			getAccMediLabTestDescriptionId());
		accMediLabTestDescriptionImpl.setGroupId(getGroupId());
		accMediLabTestDescriptionImpl.setCompanyId(getCompanyId());
		accMediLabTestDescriptionImpl.setUserId(getUserId());
		accMediLabTestDescriptionImpl.setUserName(getUserName());
		accMediLabTestDescriptionImpl.setCreateDate(getCreateDate());
		accMediLabTestDescriptionImpl.setModifiedDate(getModifiedDate());
		accMediLabTestDescriptionImpl.setTestClinicalActivity(
			getTestClinicalActivity());
		accMediLabTestDescriptionImpl.setTestLabShiftWork(
			getTestLabShiftWork());
		accMediLabTestDescriptionImpl.setTestLabSpecimenNo(
			getTestLabSpecimenNo());
		accMediLabTestDescriptionImpl.setTestSpecimenLocation(
			getTestSpecimenLocation());
		accMediLabTestDescriptionImpl.setJanaacApplicationId(
			getJanaacApplicationId());

		accMediLabTestDescriptionImpl.resetOriginalValues();

		return accMediLabTestDescriptionImpl;
	}

	@Override
	public AccMediLabTestDescription cloneWithOriginalValues() {
		AccMediLabTestDescriptionImpl accMediLabTestDescriptionImpl =
			new AccMediLabTestDescriptionImpl();

		accMediLabTestDescriptionImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		accMediLabTestDescriptionImpl.setAccMediLabTestDescriptionId(
			this.<Long>getColumnOriginalValue("accMediLabTestDescriptionId"));
		accMediLabTestDescriptionImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		accMediLabTestDescriptionImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		accMediLabTestDescriptionImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		accMediLabTestDescriptionImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		accMediLabTestDescriptionImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		accMediLabTestDescriptionImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		accMediLabTestDescriptionImpl.setTestClinicalActivity(
			this.<String>getColumnOriginalValue("testClinicalActivity"));
		accMediLabTestDescriptionImpl.setTestLabShiftWork(
			this.<String>getColumnOriginalValue("testLabShiftWork"));
		accMediLabTestDescriptionImpl.setTestLabSpecimenNo(
			this.<String>getColumnOriginalValue("testLabSpecimenNo"));
		accMediLabTestDescriptionImpl.setTestSpecimenLocation(
			this.<String>getColumnOriginalValue("testSpecimenLocation"));
		accMediLabTestDescriptionImpl.setJanaacApplicationId(
			this.<Long>getColumnOriginalValue("janaacApplicationId"));

		return accMediLabTestDescriptionImpl;
	}

	@Override
	public int compareTo(AccMediLabTestDescription accMediLabTestDescription) {
		long primaryKey = accMediLabTestDescription.getPrimaryKey();

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

		if (!(object instanceof AccMediLabTestDescription)) {
			return false;
		}

		AccMediLabTestDescription accMediLabTestDescription =
			(AccMediLabTestDescription)object;

		long primaryKey = accMediLabTestDescription.getPrimaryKey();

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
	public CacheModel<AccMediLabTestDescription> toCacheModel() {
		AccMediLabTestDescriptionCacheModel
			accMediLabTestDescriptionCacheModel =
				new AccMediLabTestDescriptionCacheModel();

		accMediLabTestDescriptionCacheModel.uuid = getUuid();

		String uuid = accMediLabTestDescriptionCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			accMediLabTestDescriptionCacheModel.uuid = null;
		}

		accMediLabTestDescriptionCacheModel.accMediLabTestDescriptionId =
			getAccMediLabTestDescriptionId();

		accMediLabTestDescriptionCacheModel.groupId = getGroupId();

		accMediLabTestDescriptionCacheModel.companyId = getCompanyId();

		accMediLabTestDescriptionCacheModel.userId = getUserId();

		accMediLabTestDescriptionCacheModel.userName = getUserName();

		String userName = accMediLabTestDescriptionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			accMediLabTestDescriptionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			accMediLabTestDescriptionCacheModel.createDate =
				createDate.getTime();
		}
		else {
			accMediLabTestDescriptionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			accMediLabTestDescriptionCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			accMediLabTestDescriptionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		accMediLabTestDescriptionCacheModel.testClinicalActivity =
			getTestClinicalActivity();

		String testClinicalActivity =
			accMediLabTestDescriptionCacheModel.testClinicalActivity;

		if ((testClinicalActivity != null) &&
			(testClinicalActivity.length() == 0)) {

			accMediLabTestDescriptionCacheModel.testClinicalActivity = null;
		}

		accMediLabTestDescriptionCacheModel.testLabShiftWork =
			getTestLabShiftWork();

		String testLabShiftWork =
			accMediLabTestDescriptionCacheModel.testLabShiftWork;

		if ((testLabShiftWork != null) && (testLabShiftWork.length() == 0)) {
			accMediLabTestDescriptionCacheModel.testLabShiftWork = null;
		}

		accMediLabTestDescriptionCacheModel.testLabSpecimenNo =
			getTestLabSpecimenNo();

		String testLabSpecimenNo =
			accMediLabTestDescriptionCacheModel.testLabSpecimenNo;

		if ((testLabSpecimenNo != null) && (testLabSpecimenNo.length() == 0)) {
			accMediLabTestDescriptionCacheModel.testLabSpecimenNo = null;
		}

		accMediLabTestDescriptionCacheModel.testSpecimenLocation =
			getTestSpecimenLocation();

		String testSpecimenLocation =
			accMediLabTestDescriptionCacheModel.testSpecimenLocation;

		if ((testSpecimenLocation != null) &&
			(testSpecimenLocation.length() == 0)) {

			accMediLabTestDescriptionCacheModel.testSpecimenLocation = null;
		}

		accMediLabTestDescriptionCacheModel.janaacApplicationId =
			getJanaacApplicationId();

		return accMediLabTestDescriptionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AccMediLabTestDescription, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AccMediLabTestDescription, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AccMediLabTestDescription, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AccMediLabTestDescription)this);

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
			<InvocationHandler, AccMediLabTestDescription>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						AccMediLabTestDescription.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _accMediLabTestDescriptionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _testClinicalActivity;
	private String _testLabShiftWork;
	private String _testLabSpecimenNo;
	private String _testSpecimenLocation;
	private long _janaacApplicationId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<AccMediLabTestDescription, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AccMediLabTestDescription)this);
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
			"accMediLabTestDescriptionId", _accMediLabTestDescriptionId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"testClinicalActivity", _testClinicalActivity);
		_columnOriginalValues.put("testLabShiftWork", _testLabShiftWork);
		_columnOriginalValues.put("testLabSpecimenNo", _testLabSpecimenNo);
		_columnOriginalValues.put(
			"testSpecimenLocation", _testSpecimenLocation);
		_columnOriginalValues.put("janaacApplicationId", _janaacApplicationId);
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

		columnBitmasks.put("accMediLabTestDescriptionId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("testClinicalActivity", 256L);

		columnBitmasks.put("testLabShiftWork", 512L);

		columnBitmasks.put("testLabSpecimenNo", 1024L);

		columnBitmasks.put("testSpecimenLocation", 2048L);

		columnBitmasks.put("janaacApplicationId", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AccMediLabTestDescription _escapedModel;

}