/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model.impl;

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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThird;
import com.nbp.janaac.application.form.service.model.AddInsOrgInfoThirdModel;

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
 * The base model implementation for the AddInsOrgInfoThird service. Represents a row in the &quot;nbp_janaac_add_ins_org_third&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AddInsOrgInfoThirdModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddInsOrgInfoThirdImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThirdImpl
 * @generated
 */
@JSON(strict = true)
public class AddInsOrgInfoThirdModelImpl
	extends BaseModelImpl<AddInsOrgInfoThird>
	implements AddInsOrgInfoThirdModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add ins org info third model instance should use the <code>AddInsOrgInfoThird</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_janaac_add_ins_org_third";

	public static final Object[][] TABLE_COLUMNS = {
		{"AddInsOrgInfoThirdId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"inspectionActivity", Types.VARCHAR},
		{"fieldOfInspection", Types.VARCHAR},
		{"typeOfInspection", Types.VARCHAR}, {"method", Types.VARCHAR},
		{"eqipment", Types.VARCHAR}, {"limitsOfCapabilities", Types.VARCHAR},
		{"janaacApplicationId", Types.BIGINT}, {"counter", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("AddInsOrgInfoThirdId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("inspectionActivity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fieldOfInspection", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("typeOfInspection", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("method", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("eqipment", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("limitsOfCapabilities", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("janaacApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_janaac_add_ins_org_third (AddInsOrgInfoThirdId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,inspectionActivity VARCHAR(75) null,fieldOfInspection VARCHAR(75) null,typeOfInspection VARCHAR(75) null,method VARCHAR(75) null,eqipment VARCHAR(75) null,limitsOfCapabilities VARCHAR(75) null,janaacApplicationId LONG,counter VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_janaac_add_ins_org_third";

	public static final String ORDER_BY_JPQL =
		" ORDER BY addInsOrgInfoThird.AddInsOrgInfoThirdId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_janaac_add_ins_org_third.AddInsOrgInfoThirdId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long JANAACAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ADDINSORGINFOTHIRDID_COLUMN_BITMASK = 2L;

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

	public AddInsOrgInfoThirdModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _AddInsOrgInfoThirdId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAddInsOrgInfoThirdId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _AddInsOrgInfoThirdId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AddInsOrgInfoThird.class;
	}

	@Override
	public String getModelClassName() {
		return AddInsOrgInfoThird.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AddInsOrgInfoThird, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AddInsOrgInfoThird, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddInsOrgInfoThird, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AddInsOrgInfoThird)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AddInsOrgInfoThird, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AddInsOrgInfoThird, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AddInsOrgInfoThird)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AddInsOrgInfoThird, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AddInsOrgInfoThird, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<AddInsOrgInfoThird, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<AddInsOrgInfoThird, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AddInsOrgInfoThird, Object>>();

			attributeGetterFunctions.put(
				"AddInsOrgInfoThirdId",
				AddInsOrgInfoThird::getAddInsOrgInfoThirdId);
			attributeGetterFunctions.put(
				"groupId", AddInsOrgInfoThird::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AddInsOrgInfoThird::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AddInsOrgInfoThird::getUserId);
			attributeGetterFunctions.put(
				"userName", AddInsOrgInfoThird::getUserName);
			attributeGetterFunctions.put(
				"createDate", AddInsOrgInfoThird::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AddInsOrgInfoThird::getModifiedDate);
			attributeGetterFunctions.put(
				"inspectionActivity",
				AddInsOrgInfoThird::getInspectionActivity);
			attributeGetterFunctions.put(
				"fieldOfInspection", AddInsOrgInfoThird::getFieldOfInspection);
			attributeGetterFunctions.put(
				"typeOfInspection", AddInsOrgInfoThird::getTypeOfInspection);
			attributeGetterFunctions.put(
				"method", AddInsOrgInfoThird::getMethod);
			attributeGetterFunctions.put(
				"eqipment", AddInsOrgInfoThird::getEqipment);
			attributeGetterFunctions.put(
				"limitsOfCapabilities",
				AddInsOrgInfoThird::getLimitsOfCapabilities);
			attributeGetterFunctions.put(
				"janaacApplicationId",
				AddInsOrgInfoThird::getJanaacApplicationId);
			attributeGetterFunctions.put(
				"counter", AddInsOrgInfoThird::getCounter);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<AddInsOrgInfoThird, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AddInsOrgInfoThird, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AddInsOrgInfoThird, ?>>();

			attributeSetterBiConsumers.put(
				"AddInsOrgInfoThirdId",
				(BiConsumer<AddInsOrgInfoThird, Long>)
					AddInsOrgInfoThird::setAddInsOrgInfoThirdId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AddInsOrgInfoThird, Long>)
					AddInsOrgInfoThird::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AddInsOrgInfoThird, Long>)
					AddInsOrgInfoThird::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AddInsOrgInfoThird, Long>)
					AddInsOrgInfoThird::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AddInsOrgInfoThird, String>)
					AddInsOrgInfoThird::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AddInsOrgInfoThird, Date>)
					AddInsOrgInfoThird::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AddInsOrgInfoThird, Date>)
					AddInsOrgInfoThird::setModifiedDate);
			attributeSetterBiConsumers.put(
				"inspectionActivity",
				(BiConsumer<AddInsOrgInfoThird, String>)
					AddInsOrgInfoThird::setInspectionActivity);
			attributeSetterBiConsumers.put(
				"fieldOfInspection",
				(BiConsumer<AddInsOrgInfoThird, String>)
					AddInsOrgInfoThird::setFieldOfInspection);
			attributeSetterBiConsumers.put(
				"typeOfInspection",
				(BiConsumer<AddInsOrgInfoThird, String>)
					AddInsOrgInfoThird::setTypeOfInspection);
			attributeSetterBiConsumers.put(
				"method",
				(BiConsumer<AddInsOrgInfoThird, String>)
					AddInsOrgInfoThird::setMethod);
			attributeSetterBiConsumers.put(
				"eqipment",
				(BiConsumer<AddInsOrgInfoThird, String>)
					AddInsOrgInfoThird::setEqipment);
			attributeSetterBiConsumers.put(
				"limitsOfCapabilities",
				(BiConsumer<AddInsOrgInfoThird, String>)
					AddInsOrgInfoThird::setLimitsOfCapabilities);
			attributeSetterBiConsumers.put(
				"janaacApplicationId",
				(BiConsumer<AddInsOrgInfoThird, Long>)
					AddInsOrgInfoThird::setJanaacApplicationId);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<AddInsOrgInfoThird, String>)
					AddInsOrgInfoThird::setCounter);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAddInsOrgInfoThirdId() {
		return _AddInsOrgInfoThirdId;
	}

	@Override
	public void setAddInsOrgInfoThirdId(long AddInsOrgInfoThirdId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_AddInsOrgInfoThirdId = AddInsOrgInfoThirdId;
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
	public String getInspectionActivity() {
		if (_inspectionActivity == null) {
			return "";
		}
		else {
			return _inspectionActivity;
		}
	}

	@Override
	public void setInspectionActivity(String inspectionActivity) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_inspectionActivity = inspectionActivity;
	}

	@JSON
	@Override
	public String getFieldOfInspection() {
		if (_fieldOfInspection == null) {
			return "";
		}
		else {
			return _fieldOfInspection;
		}
	}

	@Override
	public void setFieldOfInspection(String fieldOfInspection) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fieldOfInspection = fieldOfInspection;
	}

	@JSON
	@Override
	public String getTypeOfInspection() {
		if (_typeOfInspection == null) {
			return "";
		}
		else {
			return _typeOfInspection;
		}
	}

	@Override
	public void setTypeOfInspection(String typeOfInspection) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_typeOfInspection = typeOfInspection;
	}

	@JSON
	@Override
	public String getMethod() {
		if (_method == null) {
			return "";
		}
		else {
			return _method;
		}
	}

	@Override
	public void setMethod(String method) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_method = method;
	}

	@JSON
	@Override
	public String getEqipment() {
		if (_eqipment == null) {
			return "";
		}
		else {
			return _eqipment;
		}
	}

	@Override
	public void setEqipment(String eqipment) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_eqipment = eqipment;
	}

	@JSON
	@Override
	public String getLimitsOfCapabilities() {
		if (_limitsOfCapabilities == null) {
			return "";
		}
		else {
			return _limitsOfCapabilities;
		}
	}

	@Override
	public void setLimitsOfCapabilities(String limitsOfCapabilities) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_limitsOfCapabilities = limitsOfCapabilities;
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
			getCompanyId(), AddInsOrgInfoThird.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AddInsOrgInfoThird toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AddInsOrgInfoThird>
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
		AddInsOrgInfoThirdImpl addInsOrgInfoThirdImpl =
			new AddInsOrgInfoThirdImpl();

		addInsOrgInfoThirdImpl.setAddInsOrgInfoThirdId(
			getAddInsOrgInfoThirdId());
		addInsOrgInfoThirdImpl.setGroupId(getGroupId());
		addInsOrgInfoThirdImpl.setCompanyId(getCompanyId());
		addInsOrgInfoThirdImpl.setUserId(getUserId());
		addInsOrgInfoThirdImpl.setUserName(getUserName());
		addInsOrgInfoThirdImpl.setCreateDate(getCreateDate());
		addInsOrgInfoThirdImpl.setModifiedDate(getModifiedDate());
		addInsOrgInfoThirdImpl.setInspectionActivity(getInspectionActivity());
		addInsOrgInfoThirdImpl.setFieldOfInspection(getFieldOfInspection());
		addInsOrgInfoThirdImpl.setTypeOfInspection(getTypeOfInspection());
		addInsOrgInfoThirdImpl.setMethod(getMethod());
		addInsOrgInfoThirdImpl.setEqipment(getEqipment());
		addInsOrgInfoThirdImpl.setLimitsOfCapabilities(
			getLimitsOfCapabilities());
		addInsOrgInfoThirdImpl.setJanaacApplicationId(getJanaacApplicationId());
		addInsOrgInfoThirdImpl.setCounter(getCounter());

		addInsOrgInfoThirdImpl.resetOriginalValues();

		return addInsOrgInfoThirdImpl;
	}

	@Override
	public AddInsOrgInfoThird cloneWithOriginalValues() {
		AddInsOrgInfoThirdImpl addInsOrgInfoThirdImpl =
			new AddInsOrgInfoThirdImpl();

		addInsOrgInfoThirdImpl.setAddInsOrgInfoThirdId(
			this.<Long>getColumnOriginalValue("AddInsOrgInfoThirdId"));
		addInsOrgInfoThirdImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		addInsOrgInfoThirdImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		addInsOrgInfoThirdImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		addInsOrgInfoThirdImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		addInsOrgInfoThirdImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		addInsOrgInfoThirdImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		addInsOrgInfoThirdImpl.setInspectionActivity(
			this.<String>getColumnOriginalValue("inspectionActivity"));
		addInsOrgInfoThirdImpl.setFieldOfInspection(
			this.<String>getColumnOriginalValue("fieldOfInspection"));
		addInsOrgInfoThirdImpl.setTypeOfInspection(
			this.<String>getColumnOriginalValue("typeOfInspection"));
		addInsOrgInfoThirdImpl.setMethod(
			this.<String>getColumnOriginalValue("method"));
		addInsOrgInfoThirdImpl.setEqipment(
			this.<String>getColumnOriginalValue("eqipment"));
		addInsOrgInfoThirdImpl.setLimitsOfCapabilities(
			this.<String>getColumnOriginalValue("limitsOfCapabilities"));
		addInsOrgInfoThirdImpl.setJanaacApplicationId(
			this.<Long>getColumnOriginalValue("janaacApplicationId"));
		addInsOrgInfoThirdImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));

		return addInsOrgInfoThirdImpl;
	}

	@Override
	public int compareTo(AddInsOrgInfoThird addInsOrgInfoThird) {
		long primaryKey = addInsOrgInfoThird.getPrimaryKey();

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

		if (!(object instanceof AddInsOrgInfoThird)) {
			return false;
		}

		AddInsOrgInfoThird addInsOrgInfoThird = (AddInsOrgInfoThird)object;

		long primaryKey = addInsOrgInfoThird.getPrimaryKey();

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
	public CacheModel<AddInsOrgInfoThird> toCacheModel() {
		AddInsOrgInfoThirdCacheModel addInsOrgInfoThirdCacheModel =
			new AddInsOrgInfoThirdCacheModel();

		addInsOrgInfoThirdCacheModel.AddInsOrgInfoThirdId =
			getAddInsOrgInfoThirdId();

		addInsOrgInfoThirdCacheModel.groupId = getGroupId();

		addInsOrgInfoThirdCacheModel.companyId = getCompanyId();

		addInsOrgInfoThirdCacheModel.userId = getUserId();

		addInsOrgInfoThirdCacheModel.userName = getUserName();

		String userName = addInsOrgInfoThirdCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			addInsOrgInfoThirdCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			addInsOrgInfoThirdCacheModel.createDate = createDate.getTime();
		}
		else {
			addInsOrgInfoThirdCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			addInsOrgInfoThirdCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			addInsOrgInfoThirdCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		addInsOrgInfoThirdCacheModel.inspectionActivity =
			getInspectionActivity();

		String inspectionActivity =
			addInsOrgInfoThirdCacheModel.inspectionActivity;

		if ((inspectionActivity != null) &&
			(inspectionActivity.length() == 0)) {

			addInsOrgInfoThirdCacheModel.inspectionActivity = null;
		}

		addInsOrgInfoThirdCacheModel.fieldOfInspection = getFieldOfInspection();

		String fieldOfInspection =
			addInsOrgInfoThirdCacheModel.fieldOfInspection;

		if ((fieldOfInspection != null) && (fieldOfInspection.length() == 0)) {
			addInsOrgInfoThirdCacheModel.fieldOfInspection = null;
		}

		addInsOrgInfoThirdCacheModel.typeOfInspection = getTypeOfInspection();

		String typeOfInspection = addInsOrgInfoThirdCacheModel.typeOfInspection;

		if ((typeOfInspection != null) && (typeOfInspection.length() == 0)) {
			addInsOrgInfoThirdCacheModel.typeOfInspection = null;
		}

		addInsOrgInfoThirdCacheModel.method = getMethod();

		String method = addInsOrgInfoThirdCacheModel.method;

		if ((method != null) && (method.length() == 0)) {
			addInsOrgInfoThirdCacheModel.method = null;
		}

		addInsOrgInfoThirdCacheModel.eqipment = getEqipment();

		String eqipment = addInsOrgInfoThirdCacheModel.eqipment;

		if ((eqipment != null) && (eqipment.length() == 0)) {
			addInsOrgInfoThirdCacheModel.eqipment = null;
		}

		addInsOrgInfoThirdCacheModel.limitsOfCapabilities =
			getLimitsOfCapabilities();

		String limitsOfCapabilities =
			addInsOrgInfoThirdCacheModel.limitsOfCapabilities;

		if ((limitsOfCapabilities != null) &&
			(limitsOfCapabilities.length() == 0)) {

			addInsOrgInfoThirdCacheModel.limitsOfCapabilities = null;
		}

		addInsOrgInfoThirdCacheModel.janaacApplicationId =
			getJanaacApplicationId();

		addInsOrgInfoThirdCacheModel.counter = getCounter();

		String counter = addInsOrgInfoThirdCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			addInsOrgInfoThirdCacheModel.counter = null;
		}

		return addInsOrgInfoThirdCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AddInsOrgInfoThird, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AddInsOrgInfoThird, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddInsOrgInfoThird, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AddInsOrgInfoThird)this);

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

		private static final Function<InvocationHandler, AddInsOrgInfoThird>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AddInsOrgInfoThird.class, ModelWrapper.class);

	}

	private long _AddInsOrgInfoThirdId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _inspectionActivity;
	private String _fieldOfInspection;
	private String _typeOfInspection;
	private String _method;
	private String _eqipment;
	private String _limitsOfCapabilities;
	private long _janaacApplicationId;
	private String _counter;

	public <T> T getColumnValue(String columnName) {
		Function<AddInsOrgInfoThird, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AddInsOrgInfoThird)this);
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
			"AddInsOrgInfoThirdId", _AddInsOrgInfoThirdId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("inspectionActivity", _inspectionActivity);
		_columnOriginalValues.put("fieldOfInspection", _fieldOfInspection);
		_columnOriginalValues.put("typeOfInspection", _typeOfInspection);
		_columnOriginalValues.put("method", _method);
		_columnOriginalValues.put("eqipment", _eqipment);
		_columnOriginalValues.put(
			"limitsOfCapabilities", _limitsOfCapabilities);
		_columnOriginalValues.put("janaacApplicationId", _janaacApplicationId);
		_columnOriginalValues.put("counter", _counter);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("AddInsOrgInfoThirdId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("inspectionActivity", 128L);

		columnBitmasks.put("fieldOfInspection", 256L);

		columnBitmasks.put("typeOfInspection", 512L);

		columnBitmasks.put("method", 1024L);

		columnBitmasks.put("eqipment", 2048L);

		columnBitmasks.put("limitsOfCapabilities", 4096L);

		columnBitmasks.put("janaacApplicationId", 8192L);

		columnBitmasks.put("counter", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AddInsOrgInfoThird _escapedModel;

}