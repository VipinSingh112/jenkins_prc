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

import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecond;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelSecondModel;

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
 * The base model implementation for the AddCerPersonnelSecond service. Represents a row in the &quot;nbp_janaac_add_cer_per_sec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AddCerPersonnelSecondModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddCerPersonnelSecondImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelSecondImpl
 * @generated
 */
@JSON(strict = true)
public class AddCerPersonnelSecondModelImpl
	extends BaseModelImpl<AddCerPersonnelSecond>
	implements AddCerPersonnelSecondModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add cer personnel second model instance should use the <code>AddCerPersonnelSecond</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_janaac_add_cer_per_sec";

	public static final Object[][] TABLE_COLUMNS = {
		{"addCerPersonnelSecondId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"name", Types.VARCHAR},
		{"role_", Types.VARCHAR}, {"certificateStandard", Types.VARCHAR},
		{"areaOfExpertise", Types.VARCHAR},
		{"janaacApplicationId", Types.BIGINT}, {"counter", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("addCerPersonnelSecondId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("role_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("certificateStandard", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("areaOfExpertise", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("janaacApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_janaac_add_cer_per_sec (addCerPersonnelSecondId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,role_ VARCHAR(75) null,certificateStandard VARCHAR(75) null,areaOfExpertise VARCHAR(75) null,janaacApplicationId LONG,counter VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_janaac_add_cer_per_sec";

	public static final String ORDER_BY_JPQL =
		" ORDER BY addCerPersonnelSecond.addCerPersonnelSecondId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_janaac_add_cer_per_sec.addCerPersonnelSecondId ASC";

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
	public static final long ADDCERPERSONNELSECONDID_COLUMN_BITMASK = 2L;

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

	public AddCerPersonnelSecondModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _addCerPersonnelSecondId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAddCerPersonnelSecondId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addCerPersonnelSecondId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AddCerPersonnelSecond.class;
	}

	@Override
	public String getModelClassName() {
		return AddCerPersonnelSecond.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AddCerPersonnelSecond, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AddCerPersonnelSecond, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddCerPersonnelSecond, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AddCerPersonnelSecond)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AddCerPersonnelSecond, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AddCerPersonnelSecond, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AddCerPersonnelSecond)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AddCerPersonnelSecond, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AddCerPersonnelSecond, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<AddCerPersonnelSecond, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<AddCerPersonnelSecond, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AddCerPersonnelSecond, Object>>();

			attributeGetterFunctions.put(
				"addCerPersonnelSecondId",
				AddCerPersonnelSecond::getAddCerPersonnelSecondId);
			attributeGetterFunctions.put(
				"groupId", AddCerPersonnelSecond::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AddCerPersonnelSecond::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AddCerPersonnelSecond::getUserId);
			attributeGetterFunctions.put(
				"userName", AddCerPersonnelSecond::getUserName);
			attributeGetterFunctions.put(
				"createDate", AddCerPersonnelSecond::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AddCerPersonnelSecond::getModifiedDate);
			attributeGetterFunctions.put(
				"name", AddCerPersonnelSecond::getName);
			attributeGetterFunctions.put(
				"role", AddCerPersonnelSecond::getRole);
			attributeGetterFunctions.put(
				"certificateStandard",
				AddCerPersonnelSecond::getCertificateStandard);
			attributeGetterFunctions.put(
				"areaOfExpertise", AddCerPersonnelSecond::getAreaOfExpertise);
			attributeGetterFunctions.put(
				"janaacApplicationId",
				AddCerPersonnelSecond::getJanaacApplicationId);
			attributeGetterFunctions.put(
				"counter", AddCerPersonnelSecond::getCounter);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AddCerPersonnelSecond, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AddCerPersonnelSecond, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AddCerPersonnelSecond, ?>>();

			attributeSetterBiConsumers.put(
				"addCerPersonnelSecondId",
				(BiConsumer<AddCerPersonnelSecond, Long>)
					AddCerPersonnelSecond::setAddCerPersonnelSecondId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AddCerPersonnelSecond, Long>)
					AddCerPersonnelSecond::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AddCerPersonnelSecond, Long>)
					AddCerPersonnelSecond::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AddCerPersonnelSecond, Long>)
					AddCerPersonnelSecond::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AddCerPersonnelSecond, String>)
					AddCerPersonnelSecond::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AddCerPersonnelSecond, Date>)
					AddCerPersonnelSecond::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AddCerPersonnelSecond, Date>)
					AddCerPersonnelSecond::setModifiedDate);
			attributeSetterBiConsumers.put(
				"name",
				(BiConsumer<AddCerPersonnelSecond, String>)
					AddCerPersonnelSecond::setName);
			attributeSetterBiConsumers.put(
				"role",
				(BiConsumer<AddCerPersonnelSecond, String>)
					AddCerPersonnelSecond::setRole);
			attributeSetterBiConsumers.put(
				"certificateStandard",
				(BiConsumer<AddCerPersonnelSecond, String>)
					AddCerPersonnelSecond::setCertificateStandard);
			attributeSetterBiConsumers.put(
				"areaOfExpertise",
				(BiConsumer<AddCerPersonnelSecond, String>)
					AddCerPersonnelSecond::setAreaOfExpertise);
			attributeSetterBiConsumers.put(
				"janaacApplicationId",
				(BiConsumer<AddCerPersonnelSecond, Long>)
					AddCerPersonnelSecond::setJanaacApplicationId);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<AddCerPersonnelSecond, String>)
					AddCerPersonnelSecond::setCounter);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAddCerPersonnelSecondId() {
		return _addCerPersonnelSecondId;
	}

	@Override
	public void setAddCerPersonnelSecondId(long addCerPersonnelSecondId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_addCerPersonnelSecondId = addCerPersonnelSecondId;
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
	public String getRole() {
		if (_role == null) {
			return "";
		}
		else {
			return _role;
		}
	}

	@Override
	public void setRole(String role) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_role = role;
	}

	@JSON
	@Override
	public String getCertificateStandard() {
		if (_certificateStandard == null) {
			return "";
		}
		else {
			return _certificateStandard;
		}
	}

	@Override
	public void setCertificateStandard(String certificateStandard) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_certificateStandard = certificateStandard;
	}

	@JSON
	@Override
	public String getAreaOfExpertise() {
		if (_areaOfExpertise == null) {
			return "";
		}
		else {
			return _areaOfExpertise;
		}
	}

	@Override
	public void setAreaOfExpertise(String areaOfExpertise) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_areaOfExpertise = areaOfExpertise;
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
			getCompanyId(), AddCerPersonnelSecond.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AddCerPersonnelSecond toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AddCerPersonnelSecond>
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
		AddCerPersonnelSecondImpl addCerPersonnelSecondImpl =
			new AddCerPersonnelSecondImpl();

		addCerPersonnelSecondImpl.setAddCerPersonnelSecondId(
			getAddCerPersonnelSecondId());
		addCerPersonnelSecondImpl.setGroupId(getGroupId());
		addCerPersonnelSecondImpl.setCompanyId(getCompanyId());
		addCerPersonnelSecondImpl.setUserId(getUserId());
		addCerPersonnelSecondImpl.setUserName(getUserName());
		addCerPersonnelSecondImpl.setCreateDate(getCreateDate());
		addCerPersonnelSecondImpl.setModifiedDate(getModifiedDate());
		addCerPersonnelSecondImpl.setName(getName());
		addCerPersonnelSecondImpl.setRole(getRole());
		addCerPersonnelSecondImpl.setCertificateStandard(
			getCertificateStandard());
		addCerPersonnelSecondImpl.setAreaOfExpertise(getAreaOfExpertise());
		addCerPersonnelSecondImpl.setJanaacApplicationId(
			getJanaacApplicationId());
		addCerPersonnelSecondImpl.setCounter(getCounter());

		addCerPersonnelSecondImpl.resetOriginalValues();

		return addCerPersonnelSecondImpl;
	}

	@Override
	public AddCerPersonnelSecond cloneWithOriginalValues() {
		AddCerPersonnelSecondImpl addCerPersonnelSecondImpl =
			new AddCerPersonnelSecondImpl();

		addCerPersonnelSecondImpl.setAddCerPersonnelSecondId(
			this.<Long>getColumnOriginalValue("addCerPersonnelSecondId"));
		addCerPersonnelSecondImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		addCerPersonnelSecondImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		addCerPersonnelSecondImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		addCerPersonnelSecondImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		addCerPersonnelSecondImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		addCerPersonnelSecondImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		addCerPersonnelSecondImpl.setName(
			this.<String>getColumnOriginalValue("name"));
		addCerPersonnelSecondImpl.setRole(
			this.<String>getColumnOriginalValue("role_"));
		addCerPersonnelSecondImpl.setCertificateStandard(
			this.<String>getColumnOriginalValue("certificateStandard"));
		addCerPersonnelSecondImpl.setAreaOfExpertise(
			this.<String>getColumnOriginalValue("areaOfExpertise"));
		addCerPersonnelSecondImpl.setJanaacApplicationId(
			this.<Long>getColumnOriginalValue("janaacApplicationId"));
		addCerPersonnelSecondImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));

		return addCerPersonnelSecondImpl;
	}

	@Override
	public int compareTo(AddCerPersonnelSecond addCerPersonnelSecond) {
		long primaryKey = addCerPersonnelSecond.getPrimaryKey();

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

		if (!(object instanceof AddCerPersonnelSecond)) {
			return false;
		}

		AddCerPersonnelSecond addCerPersonnelSecond =
			(AddCerPersonnelSecond)object;

		long primaryKey = addCerPersonnelSecond.getPrimaryKey();

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
	public CacheModel<AddCerPersonnelSecond> toCacheModel() {
		AddCerPersonnelSecondCacheModel addCerPersonnelSecondCacheModel =
			new AddCerPersonnelSecondCacheModel();

		addCerPersonnelSecondCacheModel.addCerPersonnelSecondId =
			getAddCerPersonnelSecondId();

		addCerPersonnelSecondCacheModel.groupId = getGroupId();

		addCerPersonnelSecondCacheModel.companyId = getCompanyId();

		addCerPersonnelSecondCacheModel.userId = getUserId();

		addCerPersonnelSecondCacheModel.userName = getUserName();

		String userName = addCerPersonnelSecondCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			addCerPersonnelSecondCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			addCerPersonnelSecondCacheModel.createDate = createDate.getTime();
		}
		else {
			addCerPersonnelSecondCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			addCerPersonnelSecondCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			addCerPersonnelSecondCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		addCerPersonnelSecondCacheModel.name = getName();

		String name = addCerPersonnelSecondCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			addCerPersonnelSecondCacheModel.name = null;
		}

		addCerPersonnelSecondCacheModel.role = getRole();

		String role = addCerPersonnelSecondCacheModel.role;

		if ((role != null) && (role.length() == 0)) {
			addCerPersonnelSecondCacheModel.role = null;
		}

		addCerPersonnelSecondCacheModel.certificateStandard =
			getCertificateStandard();

		String certificateStandard =
			addCerPersonnelSecondCacheModel.certificateStandard;

		if ((certificateStandard != null) &&
			(certificateStandard.length() == 0)) {

			addCerPersonnelSecondCacheModel.certificateStandard = null;
		}

		addCerPersonnelSecondCacheModel.areaOfExpertise = getAreaOfExpertise();

		String areaOfExpertise =
			addCerPersonnelSecondCacheModel.areaOfExpertise;

		if ((areaOfExpertise != null) && (areaOfExpertise.length() == 0)) {
			addCerPersonnelSecondCacheModel.areaOfExpertise = null;
		}

		addCerPersonnelSecondCacheModel.janaacApplicationId =
			getJanaacApplicationId();

		addCerPersonnelSecondCacheModel.counter = getCounter();

		String counter = addCerPersonnelSecondCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			addCerPersonnelSecondCacheModel.counter = null;
		}

		return addCerPersonnelSecondCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AddCerPersonnelSecond, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AddCerPersonnelSecond, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddCerPersonnelSecond, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AddCerPersonnelSecond)this);

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

		private static final Function<InvocationHandler, AddCerPersonnelSecond>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AddCerPersonnelSecond.class, ModelWrapper.class);

	}

	private long _addCerPersonnelSecondId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _name;
	private String _role;
	private String _certificateStandard;
	private String _areaOfExpertise;
	private long _janaacApplicationId;
	private String _counter;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<AddCerPersonnelSecond, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AddCerPersonnelSecond)this);
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
			"addCerPersonnelSecondId", _addCerPersonnelSecondId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("role_", _role);
		_columnOriginalValues.put("certificateStandard", _certificateStandard);
		_columnOriginalValues.put("areaOfExpertise", _areaOfExpertise);
		_columnOriginalValues.put("janaacApplicationId", _janaacApplicationId);
		_columnOriginalValues.put("counter", _counter);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("role_", "role");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("addCerPersonnelSecondId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("name", 128L);

		columnBitmasks.put("role_", 256L);

		columnBitmasks.put("certificateStandard", 512L);

		columnBitmasks.put("areaOfExpertise", 1024L);

		columnBitmasks.put("janaacApplicationId", 2048L);

		columnBitmasks.put("counter", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AddCerPersonnelSecond _escapedModel;

}