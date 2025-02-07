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

import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirstModel;

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
 * The base model implementation for the AddCerPersonnelFirst service. Represents a row in the &quot;nbp_janaac_add_cer_per_first&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AddCerPersonnelFirstModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddCerPersonnelFirstImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddCerPersonnelFirstImpl
 * @generated
 */
@JSON(strict = true)
public class AddCerPersonnelFirstModelImpl
	extends BaseModelImpl<AddCerPersonnelFirst>
	implements AddCerPersonnelFirstModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add cer personnel first model instance should use the <code>AddCerPersonnelFirst</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_janaac_add_cer_per_first";

	public static final Object[][] TABLE_COLUMNS = {
		{"addCerPersonnelFirstId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"nameOfStaff", Types.VARCHAR},
		{"jobTitle", Types.VARCHAR}, {"majorResponsibility", Types.VARCHAR},
		{"specificFunctions", Types.VARCHAR},
		{"janaacApplicationId", Types.BIGINT}, {"counter", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("addCerPersonnelFirstId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("nameOfStaff", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jobTitle", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("majorResponsibility", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specificFunctions", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("janaacApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_janaac_add_cer_per_first (addCerPersonnelFirstId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,nameOfStaff VARCHAR(75) null,jobTitle VARCHAR(75) null,majorResponsibility VARCHAR(75) null,specificFunctions VARCHAR(75) null,janaacApplicationId LONG,counter VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_janaac_add_cer_per_first";

	public static final String ORDER_BY_JPQL =
		" ORDER BY addCerPersonnelFirst.addCerPersonnelFirstId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_janaac_add_cer_per_first.addCerPersonnelFirstId ASC";

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
	public static final long ADDCERPERSONNELFIRSTID_COLUMN_BITMASK = 2L;

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

	public AddCerPersonnelFirstModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _addCerPersonnelFirstId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAddCerPersonnelFirstId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addCerPersonnelFirstId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AddCerPersonnelFirst.class;
	}

	@Override
	public String getModelClassName() {
		return AddCerPersonnelFirst.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AddCerPersonnelFirst, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AddCerPersonnelFirst, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddCerPersonnelFirst, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AddCerPersonnelFirst)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AddCerPersonnelFirst, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AddCerPersonnelFirst, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AddCerPersonnelFirst)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AddCerPersonnelFirst, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AddCerPersonnelFirst, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<AddCerPersonnelFirst, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<AddCerPersonnelFirst, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AddCerPersonnelFirst, Object>>();

			attributeGetterFunctions.put(
				"addCerPersonnelFirstId",
				AddCerPersonnelFirst::getAddCerPersonnelFirstId);
			attributeGetterFunctions.put(
				"groupId", AddCerPersonnelFirst::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AddCerPersonnelFirst::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AddCerPersonnelFirst::getUserId);
			attributeGetterFunctions.put(
				"userName", AddCerPersonnelFirst::getUserName);
			attributeGetterFunctions.put(
				"createDate", AddCerPersonnelFirst::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AddCerPersonnelFirst::getModifiedDate);
			attributeGetterFunctions.put(
				"nameOfStaff", AddCerPersonnelFirst::getNameOfStaff);
			attributeGetterFunctions.put(
				"jobTitle", AddCerPersonnelFirst::getJobTitle);
			attributeGetterFunctions.put(
				"majorResponsibility",
				AddCerPersonnelFirst::getMajorResponsibility);
			attributeGetterFunctions.put(
				"specificFunctions",
				AddCerPersonnelFirst::getSpecificFunctions);
			attributeGetterFunctions.put(
				"janaacApplicationId",
				AddCerPersonnelFirst::getJanaacApplicationId);
			attributeGetterFunctions.put(
				"counter", AddCerPersonnelFirst::getCounter);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AddCerPersonnelFirst, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AddCerPersonnelFirst, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AddCerPersonnelFirst, ?>>();

			attributeSetterBiConsumers.put(
				"addCerPersonnelFirstId",
				(BiConsumer<AddCerPersonnelFirst, Long>)
					AddCerPersonnelFirst::setAddCerPersonnelFirstId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AddCerPersonnelFirst, Long>)
					AddCerPersonnelFirst::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AddCerPersonnelFirst, Long>)
					AddCerPersonnelFirst::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AddCerPersonnelFirst, Long>)
					AddCerPersonnelFirst::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AddCerPersonnelFirst, String>)
					AddCerPersonnelFirst::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AddCerPersonnelFirst, Date>)
					AddCerPersonnelFirst::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AddCerPersonnelFirst, Date>)
					AddCerPersonnelFirst::setModifiedDate);
			attributeSetterBiConsumers.put(
				"nameOfStaff",
				(BiConsumer<AddCerPersonnelFirst, String>)
					AddCerPersonnelFirst::setNameOfStaff);
			attributeSetterBiConsumers.put(
				"jobTitle",
				(BiConsumer<AddCerPersonnelFirst, String>)
					AddCerPersonnelFirst::setJobTitle);
			attributeSetterBiConsumers.put(
				"majorResponsibility",
				(BiConsumer<AddCerPersonnelFirst, String>)
					AddCerPersonnelFirst::setMajorResponsibility);
			attributeSetterBiConsumers.put(
				"specificFunctions",
				(BiConsumer<AddCerPersonnelFirst, String>)
					AddCerPersonnelFirst::setSpecificFunctions);
			attributeSetterBiConsumers.put(
				"janaacApplicationId",
				(BiConsumer<AddCerPersonnelFirst, Long>)
					AddCerPersonnelFirst::setJanaacApplicationId);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<AddCerPersonnelFirst, String>)
					AddCerPersonnelFirst::setCounter);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAddCerPersonnelFirstId() {
		return _addCerPersonnelFirstId;
	}

	@Override
	public void setAddCerPersonnelFirstId(long addCerPersonnelFirstId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_addCerPersonnelFirstId = addCerPersonnelFirstId;
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
	public String getNameOfStaff() {
		if (_nameOfStaff == null) {
			return "";
		}
		else {
			return _nameOfStaff;
		}
	}

	@Override
	public void setNameOfStaff(String nameOfStaff) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nameOfStaff = nameOfStaff;
	}

	@JSON
	@Override
	public String getJobTitle() {
		if (_jobTitle == null) {
			return "";
		}
		else {
			return _jobTitle;
		}
	}

	@Override
	public void setJobTitle(String jobTitle) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jobTitle = jobTitle;
	}

	@JSON
	@Override
	public String getMajorResponsibility() {
		if (_majorResponsibility == null) {
			return "";
		}
		else {
			return _majorResponsibility;
		}
	}

	@Override
	public void setMajorResponsibility(String majorResponsibility) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_majorResponsibility = majorResponsibility;
	}

	@JSON
	@Override
	public String getSpecificFunctions() {
		if (_specificFunctions == null) {
			return "";
		}
		else {
			return _specificFunctions;
		}
	}

	@Override
	public void setSpecificFunctions(String specificFunctions) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_specificFunctions = specificFunctions;
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
			getCompanyId(), AddCerPersonnelFirst.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AddCerPersonnelFirst toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AddCerPersonnelFirst>
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
		AddCerPersonnelFirstImpl addCerPersonnelFirstImpl =
			new AddCerPersonnelFirstImpl();

		addCerPersonnelFirstImpl.setAddCerPersonnelFirstId(
			getAddCerPersonnelFirstId());
		addCerPersonnelFirstImpl.setGroupId(getGroupId());
		addCerPersonnelFirstImpl.setCompanyId(getCompanyId());
		addCerPersonnelFirstImpl.setUserId(getUserId());
		addCerPersonnelFirstImpl.setUserName(getUserName());
		addCerPersonnelFirstImpl.setCreateDate(getCreateDate());
		addCerPersonnelFirstImpl.setModifiedDate(getModifiedDate());
		addCerPersonnelFirstImpl.setNameOfStaff(getNameOfStaff());
		addCerPersonnelFirstImpl.setJobTitle(getJobTitle());
		addCerPersonnelFirstImpl.setMajorResponsibility(
			getMajorResponsibility());
		addCerPersonnelFirstImpl.setSpecificFunctions(getSpecificFunctions());
		addCerPersonnelFirstImpl.setJanaacApplicationId(
			getJanaacApplicationId());
		addCerPersonnelFirstImpl.setCounter(getCounter());

		addCerPersonnelFirstImpl.resetOriginalValues();

		return addCerPersonnelFirstImpl;
	}

	@Override
	public AddCerPersonnelFirst cloneWithOriginalValues() {
		AddCerPersonnelFirstImpl addCerPersonnelFirstImpl =
			new AddCerPersonnelFirstImpl();

		addCerPersonnelFirstImpl.setAddCerPersonnelFirstId(
			this.<Long>getColumnOriginalValue("addCerPersonnelFirstId"));
		addCerPersonnelFirstImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		addCerPersonnelFirstImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		addCerPersonnelFirstImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		addCerPersonnelFirstImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		addCerPersonnelFirstImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		addCerPersonnelFirstImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		addCerPersonnelFirstImpl.setNameOfStaff(
			this.<String>getColumnOriginalValue("nameOfStaff"));
		addCerPersonnelFirstImpl.setJobTitle(
			this.<String>getColumnOriginalValue("jobTitle"));
		addCerPersonnelFirstImpl.setMajorResponsibility(
			this.<String>getColumnOriginalValue("majorResponsibility"));
		addCerPersonnelFirstImpl.setSpecificFunctions(
			this.<String>getColumnOriginalValue("specificFunctions"));
		addCerPersonnelFirstImpl.setJanaacApplicationId(
			this.<Long>getColumnOriginalValue("janaacApplicationId"));
		addCerPersonnelFirstImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));

		return addCerPersonnelFirstImpl;
	}

	@Override
	public int compareTo(AddCerPersonnelFirst addCerPersonnelFirst) {
		long primaryKey = addCerPersonnelFirst.getPrimaryKey();

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

		if (!(object instanceof AddCerPersonnelFirst)) {
			return false;
		}

		AddCerPersonnelFirst addCerPersonnelFirst =
			(AddCerPersonnelFirst)object;

		long primaryKey = addCerPersonnelFirst.getPrimaryKey();

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
	public CacheModel<AddCerPersonnelFirst> toCacheModel() {
		AddCerPersonnelFirstCacheModel addCerPersonnelFirstCacheModel =
			new AddCerPersonnelFirstCacheModel();

		addCerPersonnelFirstCacheModel.addCerPersonnelFirstId =
			getAddCerPersonnelFirstId();

		addCerPersonnelFirstCacheModel.groupId = getGroupId();

		addCerPersonnelFirstCacheModel.companyId = getCompanyId();

		addCerPersonnelFirstCacheModel.userId = getUserId();

		addCerPersonnelFirstCacheModel.userName = getUserName();

		String userName = addCerPersonnelFirstCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			addCerPersonnelFirstCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			addCerPersonnelFirstCacheModel.createDate = createDate.getTime();
		}
		else {
			addCerPersonnelFirstCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			addCerPersonnelFirstCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			addCerPersonnelFirstCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		addCerPersonnelFirstCacheModel.nameOfStaff = getNameOfStaff();

		String nameOfStaff = addCerPersonnelFirstCacheModel.nameOfStaff;

		if ((nameOfStaff != null) && (nameOfStaff.length() == 0)) {
			addCerPersonnelFirstCacheModel.nameOfStaff = null;
		}

		addCerPersonnelFirstCacheModel.jobTitle = getJobTitle();

		String jobTitle = addCerPersonnelFirstCacheModel.jobTitle;

		if ((jobTitle != null) && (jobTitle.length() == 0)) {
			addCerPersonnelFirstCacheModel.jobTitle = null;
		}

		addCerPersonnelFirstCacheModel.majorResponsibility =
			getMajorResponsibility();

		String majorResponsibility =
			addCerPersonnelFirstCacheModel.majorResponsibility;

		if ((majorResponsibility != null) &&
			(majorResponsibility.length() == 0)) {

			addCerPersonnelFirstCacheModel.majorResponsibility = null;
		}

		addCerPersonnelFirstCacheModel.specificFunctions =
			getSpecificFunctions();

		String specificFunctions =
			addCerPersonnelFirstCacheModel.specificFunctions;

		if ((specificFunctions != null) && (specificFunctions.length() == 0)) {
			addCerPersonnelFirstCacheModel.specificFunctions = null;
		}

		addCerPersonnelFirstCacheModel.janaacApplicationId =
			getJanaacApplicationId();

		addCerPersonnelFirstCacheModel.counter = getCounter();

		String counter = addCerPersonnelFirstCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			addCerPersonnelFirstCacheModel.counter = null;
		}

		return addCerPersonnelFirstCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AddCerPersonnelFirst, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AddCerPersonnelFirst, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddCerPersonnelFirst, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AddCerPersonnelFirst)this);

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

		private static final Function<InvocationHandler, AddCerPersonnelFirst>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AddCerPersonnelFirst.class, ModelWrapper.class);

	}

	private long _addCerPersonnelFirstId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _nameOfStaff;
	private String _jobTitle;
	private String _majorResponsibility;
	private String _specificFunctions;
	private long _janaacApplicationId;
	private String _counter;

	public <T> T getColumnValue(String columnName) {
		Function<AddCerPersonnelFirst, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AddCerPersonnelFirst)this);
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
			"addCerPersonnelFirstId", _addCerPersonnelFirstId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("nameOfStaff", _nameOfStaff);
		_columnOriginalValues.put("jobTitle", _jobTitle);
		_columnOriginalValues.put("majorResponsibility", _majorResponsibility);
		_columnOriginalValues.put("specificFunctions", _specificFunctions);
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

		columnBitmasks.put("addCerPersonnelFirstId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("nameOfStaff", 128L);

		columnBitmasks.put("jobTitle", 256L);

		columnBitmasks.put("majorResponsibility", 512L);

		columnBitmasks.put("specificFunctions", 1024L);

		columnBitmasks.put("janaacApplicationId", 2048L);

		columnBitmasks.put("counter", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AddCerPersonnelFirst _escapedModel;

}