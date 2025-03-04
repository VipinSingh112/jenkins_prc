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

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThird;
import com.nbp.janaac.application.form.service.model.AddFdaPersonnelThirdModel;

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
 * The base model implementation for the AddFdaPersonnelThird service. Represents a row in the &quot;nbp_janaac_add_fda_per_third&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AddFdaPersonnelThirdModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddFdaPersonnelThirdImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelThirdImpl
 * @generated
 */
@JSON(strict = true)
public class AddFdaPersonnelThirdModelImpl
	extends BaseModelImpl<AddFdaPersonnelThird>
	implements AddFdaPersonnelThirdModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add fda personnel third model instance should use the <code>AddFdaPersonnelThird</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_janaac_add_fda_per_third";

	public static final Object[][] TABLE_COLUMNS = {
		{"addFdaPersonnelThirdId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"outsourcedActivity", Types.VARCHAR},
		{"supplierServiceProvider", Types.VARCHAR},
		{"janaacApplicationId", Types.BIGINT}, {"counter", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("addFdaPersonnelThirdId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("outsourcedActivity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("supplierServiceProvider", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("janaacApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_janaac_add_fda_per_third (addFdaPersonnelThirdId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,outsourcedActivity VARCHAR(75) null,supplierServiceProvider VARCHAR(75) null,janaacApplicationId LONG,counter VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_janaac_add_fda_per_third";

	public static final String ORDER_BY_JPQL =
		" ORDER BY addFdaPersonnelThird.addFdaPersonnelThirdId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_janaac_add_fda_per_third.addFdaPersonnelThirdId ASC";

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
	public static final long ADDFDAPERSONNELTHIRDID_COLUMN_BITMASK = 2L;

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

	public AddFdaPersonnelThirdModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _addFdaPersonnelThirdId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAddFdaPersonnelThirdId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addFdaPersonnelThirdId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AddFdaPersonnelThird.class;
	}

	@Override
	public String getModelClassName() {
		return AddFdaPersonnelThird.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AddFdaPersonnelThird, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AddFdaPersonnelThird, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddFdaPersonnelThird, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AddFdaPersonnelThird)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AddFdaPersonnelThird, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AddFdaPersonnelThird, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AddFdaPersonnelThird)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AddFdaPersonnelThird, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AddFdaPersonnelThird, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<AddFdaPersonnelThird, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<AddFdaPersonnelThird, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AddFdaPersonnelThird, Object>>();

			attributeGetterFunctions.put(
				"addFdaPersonnelThirdId",
				AddFdaPersonnelThird::getAddFdaPersonnelThirdId);
			attributeGetterFunctions.put(
				"groupId", AddFdaPersonnelThird::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AddFdaPersonnelThird::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AddFdaPersonnelThird::getUserId);
			attributeGetterFunctions.put(
				"userName", AddFdaPersonnelThird::getUserName);
			attributeGetterFunctions.put(
				"createDate", AddFdaPersonnelThird::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AddFdaPersonnelThird::getModifiedDate);
			attributeGetterFunctions.put(
				"outsourcedActivity",
				AddFdaPersonnelThird::getOutsourcedActivity);
			attributeGetterFunctions.put(
				"supplierServiceProvider",
				AddFdaPersonnelThird::getSupplierServiceProvider);
			attributeGetterFunctions.put(
				"janaacApplicationId",
				AddFdaPersonnelThird::getJanaacApplicationId);
			attributeGetterFunctions.put(
				"counter", AddFdaPersonnelThird::getCounter);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AddFdaPersonnelThird, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AddFdaPersonnelThird, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AddFdaPersonnelThird, ?>>();

			attributeSetterBiConsumers.put(
				"addFdaPersonnelThirdId",
				(BiConsumer<AddFdaPersonnelThird, Long>)
					AddFdaPersonnelThird::setAddFdaPersonnelThirdId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AddFdaPersonnelThird, Long>)
					AddFdaPersonnelThird::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AddFdaPersonnelThird, Long>)
					AddFdaPersonnelThird::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AddFdaPersonnelThird, Long>)
					AddFdaPersonnelThird::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AddFdaPersonnelThird, String>)
					AddFdaPersonnelThird::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AddFdaPersonnelThird, Date>)
					AddFdaPersonnelThird::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AddFdaPersonnelThird, Date>)
					AddFdaPersonnelThird::setModifiedDate);
			attributeSetterBiConsumers.put(
				"outsourcedActivity",
				(BiConsumer<AddFdaPersonnelThird, String>)
					AddFdaPersonnelThird::setOutsourcedActivity);
			attributeSetterBiConsumers.put(
				"supplierServiceProvider",
				(BiConsumer<AddFdaPersonnelThird, String>)
					AddFdaPersonnelThird::setSupplierServiceProvider);
			attributeSetterBiConsumers.put(
				"janaacApplicationId",
				(BiConsumer<AddFdaPersonnelThird, Long>)
					AddFdaPersonnelThird::setJanaacApplicationId);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<AddFdaPersonnelThird, String>)
					AddFdaPersonnelThird::setCounter);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAddFdaPersonnelThirdId() {
		return _addFdaPersonnelThirdId;
	}

	@Override
	public void setAddFdaPersonnelThirdId(long addFdaPersonnelThirdId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_addFdaPersonnelThirdId = addFdaPersonnelThirdId;
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
	public String getOutsourcedActivity() {
		if (_outsourcedActivity == null) {
			return "";
		}
		else {
			return _outsourcedActivity;
		}
	}

	@Override
	public void setOutsourcedActivity(String outsourcedActivity) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_outsourcedActivity = outsourcedActivity;
	}

	@JSON
	@Override
	public String getSupplierServiceProvider() {
		if (_supplierServiceProvider == null) {
			return "";
		}
		else {
			return _supplierServiceProvider;
		}
	}

	@Override
	public void setSupplierServiceProvider(String supplierServiceProvider) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_supplierServiceProvider = supplierServiceProvider;
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
			getCompanyId(), AddFdaPersonnelThird.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AddFdaPersonnelThird toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AddFdaPersonnelThird>
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
		AddFdaPersonnelThirdImpl addFdaPersonnelThirdImpl =
			new AddFdaPersonnelThirdImpl();

		addFdaPersonnelThirdImpl.setAddFdaPersonnelThirdId(
			getAddFdaPersonnelThirdId());
		addFdaPersonnelThirdImpl.setGroupId(getGroupId());
		addFdaPersonnelThirdImpl.setCompanyId(getCompanyId());
		addFdaPersonnelThirdImpl.setUserId(getUserId());
		addFdaPersonnelThirdImpl.setUserName(getUserName());
		addFdaPersonnelThirdImpl.setCreateDate(getCreateDate());
		addFdaPersonnelThirdImpl.setModifiedDate(getModifiedDate());
		addFdaPersonnelThirdImpl.setOutsourcedActivity(getOutsourcedActivity());
		addFdaPersonnelThirdImpl.setSupplierServiceProvider(
			getSupplierServiceProvider());
		addFdaPersonnelThirdImpl.setJanaacApplicationId(
			getJanaacApplicationId());
		addFdaPersonnelThirdImpl.setCounter(getCounter());

		addFdaPersonnelThirdImpl.resetOriginalValues();

		return addFdaPersonnelThirdImpl;
	}

	@Override
	public AddFdaPersonnelThird cloneWithOriginalValues() {
		AddFdaPersonnelThirdImpl addFdaPersonnelThirdImpl =
			new AddFdaPersonnelThirdImpl();

		addFdaPersonnelThirdImpl.setAddFdaPersonnelThirdId(
			this.<Long>getColumnOriginalValue("addFdaPersonnelThirdId"));
		addFdaPersonnelThirdImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		addFdaPersonnelThirdImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		addFdaPersonnelThirdImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		addFdaPersonnelThirdImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		addFdaPersonnelThirdImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		addFdaPersonnelThirdImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		addFdaPersonnelThirdImpl.setOutsourcedActivity(
			this.<String>getColumnOriginalValue("outsourcedActivity"));
		addFdaPersonnelThirdImpl.setSupplierServiceProvider(
			this.<String>getColumnOriginalValue("supplierServiceProvider"));
		addFdaPersonnelThirdImpl.setJanaacApplicationId(
			this.<Long>getColumnOriginalValue("janaacApplicationId"));
		addFdaPersonnelThirdImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));

		return addFdaPersonnelThirdImpl;
	}

	@Override
	public int compareTo(AddFdaPersonnelThird addFdaPersonnelThird) {
		long primaryKey = addFdaPersonnelThird.getPrimaryKey();

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

		if (!(object instanceof AddFdaPersonnelThird)) {
			return false;
		}

		AddFdaPersonnelThird addFdaPersonnelThird =
			(AddFdaPersonnelThird)object;

		long primaryKey = addFdaPersonnelThird.getPrimaryKey();

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
	public CacheModel<AddFdaPersonnelThird> toCacheModel() {
		AddFdaPersonnelThirdCacheModel addFdaPersonnelThirdCacheModel =
			new AddFdaPersonnelThirdCacheModel();

		addFdaPersonnelThirdCacheModel.addFdaPersonnelThirdId =
			getAddFdaPersonnelThirdId();

		addFdaPersonnelThirdCacheModel.groupId = getGroupId();

		addFdaPersonnelThirdCacheModel.companyId = getCompanyId();

		addFdaPersonnelThirdCacheModel.userId = getUserId();

		addFdaPersonnelThirdCacheModel.userName = getUserName();

		String userName = addFdaPersonnelThirdCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			addFdaPersonnelThirdCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			addFdaPersonnelThirdCacheModel.createDate = createDate.getTime();
		}
		else {
			addFdaPersonnelThirdCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			addFdaPersonnelThirdCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			addFdaPersonnelThirdCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		addFdaPersonnelThirdCacheModel.outsourcedActivity =
			getOutsourcedActivity();

		String outsourcedActivity =
			addFdaPersonnelThirdCacheModel.outsourcedActivity;

		if ((outsourcedActivity != null) &&
			(outsourcedActivity.length() == 0)) {

			addFdaPersonnelThirdCacheModel.outsourcedActivity = null;
		}

		addFdaPersonnelThirdCacheModel.supplierServiceProvider =
			getSupplierServiceProvider();

		String supplierServiceProvider =
			addFdaPersonnelThirdCacheModel.supplierServiceProvider;

		if ((supplierServiceProvider != null) &&
			(supplierServiceProvider.length() == 0)) {

			addFdaPersonnelThirdCacheModel.supplierServiceProvider = null;
		}

		addFdaPersonnelThirdCacheModel.janaacApplicationId =
			getJanaacApplicationId();

		addFdaPersonnelThirdCacheModel.counter = getCounter();

		String counter = addFdaPersonnelThirdCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			addFdaPersonnelThirdCacheModel.counter = null;
		}

		return addFdaPersonnelThirdCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AddFdaPersonnelThird, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AddFdaPersonnelThird, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddFdaPersonnelThird, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AddFdaPersonnelThird)this);

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

		private static final Function<InvocationHandler, AddFdaPersonnelThird>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AddFdaPersonnelThird.class, ModelWrapper.class);

	}

	private long _addFdaPersonnelThirdId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _outsourcedActivity;
	private String _supplierServiceProvider;
	private long _janaacApplicationId;
	private String _counter;

	public <T> T getColumnValue(String columnName) {
		Function<AddFdaPersonnelThird, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AddFdaPersonnelThird)this);
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
			"addFdaPersonnelThirdId", _addFdaPersonnelThirdId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("outsourcedActivity", _outsourcedActivity);
		_columnOriginalValues.put(
			"supplierServiceProvider", _supplierServiceProvider);
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

		columnBitmasks.put("addFdaPersonnelThirdId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("outsourcedActivity", 128L);

		columnBitmasks.put("supplierServiceProvider", 256L);

		columnBitmasks.put("janaacApplicationId", 512L);

		columnBitmasks.put("counter", 1024L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AddFdaPersonnelThird _escapedModel;

}