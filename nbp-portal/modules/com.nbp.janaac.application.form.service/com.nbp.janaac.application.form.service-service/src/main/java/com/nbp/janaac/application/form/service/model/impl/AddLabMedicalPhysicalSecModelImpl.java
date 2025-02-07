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

import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSec;
import com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalSecModel;

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
 * The base model implementation for the AddLabMedicalPhysicalSec service. Represents a row in the &quot;nbp_janaac_add_lab_med_phy_sec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AddLabMedicalPhysicalSecModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddLabMedicalPhysicalSecImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalSecImpl
 * @generated
 */
@JSON(strict = true)
public class AddLabMedicalPhysicalSecModelImpl
	extends BaseModelImpl<AddLabMedicalPhysicalSec>
	implements AddLabMedicalPhysicalSecModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add lab medical physical sec model instance should use the <code>AddLabMedicalPhysicalSec</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_janaac_add_lab_med_phy_sec";

	public static final Object[][] TABLE_COLUMNS = {
		{"addLabMedicalPhysicalSecId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"number_", Types.VARCHAR},
		{"location", Types.VARCHAR}, {"activitiesPerformed", Types.VARCHAR},
		{"contactDetails", Types.VARCHAR},
		{"janaacApplicationId", Types.BIGINT}, {"counter", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("addLabMedicalPhysicalSecId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("number_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("location", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("activitiesPerformed", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("contactDetails", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("janaacApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_janaac_add_lab_med_phy_sec (addLabMedicalPhysicalSecId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,number_ VARCHAR(75) null,location VARCHAR(75) null,activitiesPerformed VARCHAR(75) null,contactDetails VARCHAR(75) null,janaacApplicationId LONG,counter VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_janaac_add_lab_med_phy_sec";

	public static final String ORDER_BY_JPQL =
		" ORDER BY addLabMedicalPhysicalSec.addLabMedicalPhysicalSecId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_janaac_add_lab_med_phy_sec.addLabMedicalPhysicalSecId ASC";

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
	public static final long ADDLABMEDICALPHYSICALSECID_COLUMN_BITMASK = 2L;

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

	public AddLabMedicalPhysicalSecModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _addLabMedicalPhysicalSecId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAddLabMedicalPhysicalSecId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addLabMedicalPhysicalSecId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AddLabMedicalPhysicalSec.class;
	}

	@Override
	public String getModelClassName() {
		return AddLabMedicalPhysicalSec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AddLabMedicalPhysicalSec, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AddLabMedicalPhysicalSec, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddLabMedicalPhysicalSec, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AddLabMedicalPhysicalSec)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AddLabMedicalPhysicalSec, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AddLabMedicalPhysicalSec, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AddLabMedicalPhysicalSec)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AddLabMedicalPhysicalSec, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AddLabMedicalPhysicalSec, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<AddLabMedicalPhysicalSec, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<AddLabMedicalPhysicalSec, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AddLabMedicalPhysicalSec, Object>>();

			attributeGetterFunctions.put(
				"addLabMedicalPhysicalSecId",
				AddLabMedicalPhysicalSec::getAddLabMedicalPhysicalSecId);
			attributeGetterFunctions.put(
				"groupId", AddLabMedicalPhysicalSec::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AddLabMedicalPhysicalSec::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AddLabMedicalPhysicalSec::getUserId);
			attributeGetterFunctions.put(
				"userName", AddLabMedicalPhysicalSec::getUserName);
			attributeGetterFunctions.put(
				"createDate", AddLabMedicalPhysicalSec::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AddLabMedicalPhysicalSec::getModifiedDate);
			attributeGetterFunctions.put(
				"number", AddLabMedicalPhysicalSec::getNumber);
			attributeGetterFunctions.put(
				"location", AddLabMedicalPhysicalSec::getLocation);
			attributeGetterFunctions.put(
				"activitiesPerformed",
				AddLabMedicalPhysicalSec::getActivitiesPerformed);
			attributeGetterFunctions.put(
				"contactDetails", AddLabMedicalPhysicalSec::getContactDetails);
			attributeGetterFunctions.put(
				"janaacApplicationId",
				AddLabMedicalPhysicalSec::getJanaacApplicationId);
			attributeGetterFunctions.put(
				"counter", AddLabMedicalPhysicalSec::getCounter);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AddLabMedicalPhysicalSec, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AddLabMedicalPhysicalSec, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AddLabMedicalPhysicalSec, ?>>();

			attributeSetterBiConsumers.put(
				"addLabMedicalPhysicalSecId",
				(BiConsumer<AddLabMedicalPhysicalSec, Long>)
					AddLabMedicalPhysicalSec::setAddLabMedicalPhysicalSecId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AddLabMedicalPhysicalSec, Long>)
					AddLabMedicalPhysicalSec::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AddLabMedicalPhysicalSec, Long>)
					AddLabMedicalPhysicalSec::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AddLabMedicalPhysicalSec, Long>)
					AddLabMedicalPhysicalSec::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AddLabMedicalPhysicalSec, String>)
					AddLabMedicalPhysicalSec::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AddLabMedicalPhysicalSec, Date>)
					AddLabMedicalPhysicalSec::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AddLabMedicalPhysicalSec, Date>)
					AddLabMedicalPhysicalSec::setModifiedDate);
			attributeSetterBiConsumers.put(
				"number",
				(BiConsumer<AddLabMedicalPhysicalSec, String>)
					AddLabMedicalPhysicalSec::setNumber);
			attributeSetterBiConsumers.put(
				"location",
				(BiConsumer<AddLabMedicalPhysicalSec, String>)
					AddLabMedicalPhysicalSec::setLocation);
			attributeSetterBiConsumers.put(
				"activitiesPerformed",
				(BiConsumer<AddLabMedicalPhysicalSec, String>)
					AddLabMedicalPhysicalSec::setActivitiesPerformed);
			attributeSetterBiConsumers.put(
				"contactDetails",
				(BiConsumer<AddLabMedicalPhysicalSec, String>)
					AddLabMedicalPhysicalSec::setContactDetails);
			attributeSetterBiConsumers.put(
				"janaacApplicationId",
				(BiConsumer<AddLabMedicalPhysicalSec, Long>)
					AddLabMedicalPhysicalSec::setJanaacApplicationId);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<AddLabMedicalPhysicalSec, String>)
					AddLabMedicalPhysicalSec::setCounter);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAddLabMedicalPhysicalSecId() {
		return _addLabMedicalPhysicalSecId;
	}

	@Override
	public void setAddLabMedicalPhysicalSecId(long addLabMedicalPhysicalSecId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_addLabMedicalPhysicalSecId = addLabMedicalPhysicalSecId;
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
	public String getNumber() {
		if (_number == null) {
			return "";
		}
		else {
			return _number;
		}
	}

	@Override
	public void setNumber(String number) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_number = number;
	}

	@JSON
	@Override
	public String getLocation() {
		if (_location == null) {
			return "";
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_location = location;
	}

	@JSON
	@Override
	public String getActivitiesPerformed() {
		if (_activitiesPerformed == null) {
			return "";
		}
		else {
			return _activitiesPerformed;
		}
	}

	@Override
	public void setActivitiesPerformed(String activitiesPerformed) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_activitiesPerformed = activitiesPerformed;
	}

	@JSON
	@Override
	public String getContactDetails() {
		if (_contactDetails == null) {
			return "";
		}
		else {
			return _contactDetails;
		}
	}

	@Override
	public void setContactDetails(String contactDetails) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_contactDetails = contactDetails;
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
			getCompanyId(), AddLabMedicalPhysicalSec.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AddLabMedicalPhysicalSec toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AddLabMedicalPhysicalSec>
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
		AddLabMedicalPhysicalSecImpl addLabMedicalPhysicalSecImpl =
			new AddLabMedicalPhysicalSecImpl();

		addLabMedicalPhysicalSecImpl.setAddLabMedicalPhysicalSecId(
			getAddLabMedicalPhysicalSecId());
		addLabMedicalPhysicalSecImpl.setGroupId(getGroupId());
		addLabMedicalPhysicalSecImpl.setCompanyId(getCompanyId());
		addLabMedicalPhysicalSecImpl.setUserId(getUserId());
		addLabMedicalPhysicalSecImpl.setUserName(getUserName());
		addLabMedicalPhysicalSecImpl.setCreateDate(getCreateDate());
		addLabMedicalPhysicalSecImpl.setModifiedDate(getModifiedDate());
		addLabMedicalPhysicalSecImpl.setNumber(getNumber());
		addLabMedicalPhysicalSecImpl.setLocation(getLocation());
		addLabMedicalPhysicalSecImpl.setActivitiesPerformed(
			getActivitiesPerformed());
		addLabMedicalPhysicalSecImpl.setContactDetails(getContactDetails());
		addLabMedicalPhysicalSecImpl.setJanaacApplicationId(
			getJanaacApplicationId());
		addLabMedicalPhysicalSecImpl.setCounter(getCounter());

		addLabMedicalPhysicalSecImpl.resetOriginalValues();

		return addLabMedicalPhysicalSecImpl;
	}

	@Override
	public AddLabMedicalPhysicalSec cloneWithOriginalValues() {
		AddLabMedicalPhysicalSecImpl addLabMedicalPhysicalSecImpl =
			new AddLabMedicalPhysicalSecImpl();

		addLabMedicalPhysicalSecImpl.setAddLabMedicalPhysicalSecId(
			this.<Long>getColumnOriginalValue("addLabMedicalPhysicalSecId"));
		addLabMedicalPhysicalSecImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		addLabMedicalPhysicalSecImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		addLabMedicalPhysicalSecImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		addLabMedicalPhysicalSecImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		addLabMedicalPhysicalSecImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		addLabMedicalPhysicalSecImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		addLabMedicalPhysicalSecImpl.setNumber(
			this.<String>getColumnOriginalValue("number_"));
		addLabMedicalPhysicalSecImpl.setLocation(
			this.<String>getColumnOriginalValue("location"));
		addLabMedicalPhysicalSecImpl.setActivitiesPerformed(
			this.<String>getColumnOriginalValue("activitiesPerformed"));
		addLabMedicalPhysicalSecImpl.setContactDetails(
			this.<String>getColumnOriginalValue("contactDetails"));
		addLabMedicalPhysicalSecImpl.setJanaacApplicationId(
			this.<Long>getColumnOriginalValue("janaacApplicationId"));
		addLabMedicalPhysicalSecImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));

		return addLabMedicalPhysicalSecImpl;
	}

	@Override
	public int compareTo(AddLabMedicalPhysicalSec addLabMedicalPhysicalSec) {
		long primaryKey = addLabMedicalPhysicalSec.getPrimaryKey();

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

		if (!(object instanceof AddLabMedicalPhysicalSec)) {
			return false;
		}

		AddLabMedicalPhysicalSec addLabMedicalPhysicalSec =
			(AddLabMedicalPhysicalSec)object;

		long primaryKey = addLabMedicalPhysicalSec.getPrimaryKey();

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
	public CacheModel<AddLabMedicalPhysicalSec> toCacheModel() {
		AddLabMedicalPhysicalSecCacheModel addLabMedicalPhysicalSecCacheModel =
			new AddLabMedicalPhysicalSecCacheModel();

		addLabMedicalPhysicalSecCacheModel.addLabMedicalPhysicalSecId =
			getAddLabMedicalPhysicalSecId();

		addLabMedicalPhysicalSecCacheModel.groupId = getGroupId();

		addLabMedicalPhysicalSecCacheModel.companyId = getCompanyId();

		addLabMedicalPhysicalSecCacheModel.userId = getUserId();

		addLabMedicalPhysicalSecCacheModel.userName = getUserName();

		String userName = addLabMedicalPhysicalSecCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			addLabMedicalPhysicalSecCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			addLabMedicalPhysicalSecCacheModel.createDate =
				createDate.getTime();
		}
		else {
			addLabMedicalPhysicalSecCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			addLabMedicalPhysicalSecCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			addLabMedicalPhysicalSecCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		addLabMedicalPhysicalSecCacheModel.number = getNumber();

		String number = addLabMedicalPhysicalSecCacheModel.number;

		if ((number != null) && (number.length() == 0)) {
			addLabMedicalPhysicalSecCacheModel.number = null;
		}

		addLabMedicalPhysicalSecCacheModel.location = getLocation();

		String location = addLabMedicalPhysicalSecCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			addLabMedicalPhysicalSecCacheModel.location = null;
		}

		addLabMedicalPhysicalSecCacheModel.activitiesPerformed =
			getActivitiesPerformed();

		String activitiesPerformed =
			addLabMedicalPhysicalSecCacheModel.activitiesPerformed;

		if ((activitiesPerformed != null) &&
			(activitiesPerformed.length() == 0)) {

			addLabMedicalPhysicalSecCacheModel.activitiesPerformed = null;
		}

		addLabMedicalPhysicalSecCacheModel.contactDetails = getContactDetails();

		String contactDetails =
			addLabMedicalPhysicalSecCacheModel.contactDetails;

		if ((contactDetails != null) && (contactDetails.length() == 0)) {
			addLabMedicalPhysicalSecCacheModel.contactDetails = null;
		}

		addLabMedicalPhysicalSecCacheModel.janaacApplicationId =
			getJanaacApplicationId();

		addLabMedicalPhysicalSecCacheModel.counter = getCounter();

		String counter = addLabMedicalPhysicalSecCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			addLabMedicalPhysicalSecCacheModel.counter = null;
		}

		return addLabMedicalPhysicalSecCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AddLabMedicalPhysicalSec, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AddLabMedicalPhysicalSec, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddLabMedicalPhysicalSec, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AddLabMedicalPhysicalSec)this);

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
			<InvocationHandler, AddLabMedicalPhysicalSec>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						AddLabMedicalPhysicalSec.class, ModelWrapper.class);

	}

	private long _addLabMedicalPhysicalSecId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _number;
	private String _location;
	private String _activitiesPerformed;
	private String _contactDetails;
	private long _janaacApplicationId;
	private String _counter;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<AddLabMedicalPhysicalSec, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AddLabMedicalPhysicalSec)this);
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
			"addLabMedicalPhysicalSecId", _addLabMedicalPhysicalSecId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("number_", _number);
		_columnOriginalValues.put("location", _location);
		_columnOriginalValues.put("activitiesPerformed", _activitiesPerformed);
		_columnOriginalValues.put("contactDetails", _contactDetails);
		_columnOriginalValues.put("janaacApplicationId", _janaacApplicationId);
		_columnOriginalValues.put("counter", _counter);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("number_", "number");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("addLabMedicalPhysicalSecId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("number_", 128L);

		columnBitmasks.put("location", 256L);

		columnBitmasks.put("activitiesPerformed", 512L);

		columnBitmasks.put("contactDetails", 1024L);

		columnBitmasks.put("janaacApplicationId", 2048L);

		columnBitmasks.put("counter", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AddLabMedicalPhysicalSec _escapedModel;

}