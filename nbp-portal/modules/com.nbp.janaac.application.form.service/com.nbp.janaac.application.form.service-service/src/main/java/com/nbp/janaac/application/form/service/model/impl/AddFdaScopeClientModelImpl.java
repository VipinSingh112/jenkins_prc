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

import com.nbp.janaac.application.form.service.model.AddFdaScopeClient;
import com.nbp.janaac.application.form.service.model.AddFdaScopeClientModel;

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
 * The base model implementation for the AddFdaScopeClient service. Represents a row in the &quot;nbp_janaac_add_fda_scop_client&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AddFdaScopeClientModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AddFdaScopeClientImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaScopeClientImpl
 * @generated
 */
@JSON(strict = true)
public class AddFdaScopeClientModelImpl
	extends BaseModelImpl<AddFdaScopeClient> implements AddFdaScopeClientModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a add fda scope client model instance should use the <code>AddFdaScopeClient</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_janaac_add_fda_scop_client";

	public static final Object[][] TABLE_COLUMNS = {
		{"addFdaScopeClientId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"clientOrganization", Types.VARCHAR}, {"foodProducts", Types.VARCHAR},
		{"fdaRegulations", Types.VARCHAR}, {"dateGranted", Types.TIMESTAMP},
		{"janaacApplicationId", Types.BIGINT}, {"counter", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("addFdaScopeClientId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("clientOrganization", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("foodProducts", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fdaRegulations", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateGranted", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("janaacApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_janaac_add_fda_scop_client (addFdaScopeClientId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,clientOrganization VARCHAR(75) null,foodProducts VARCHAR(75) null,fdaRegulations VARCHAR(75) null,dateGranted DATE null,janaacApplicationId LONG,counter VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_janaac_add_fda_scop_client";

	public static final String ORDER_BY_JPQL =
		" ORDER BY addFdaScopeClient.addFdaScopeClientId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_janaac_add_fda_scop_client.addFdaScopeClientId ASC";

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
	public static final long ADDFDASCOPECLIENTID_COLUMN_BITMASK = 2L;

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

	public AddFdaScopeClientModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _addFdaScopeClientId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAddFdaScopeClientId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addFdaScopeClientId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AddFdaScopeClient.class;
	}

	@Override
	public String getModelClassName() {
		return AddFdaScopeClient.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AddFdaScopeClient, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AddFdaScopeClient, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddFdaScopeClient, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AddFdaScopeClient)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AddFdaScopeClient, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AddFdaScopeClient, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AddFdaScopeClient)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AddFdaScopeClient, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AddFdaScopeClient, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<AddFdaScopeClient, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<AddFdaScopeClient, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AddFdaScopeClient, Object>>();

			attributeGetterFunctions.put(
				"addFdaScopeClientId",
				AddFdaScopeClient::getAddFdaScopeClientId);
			attributeGetterFunctions.put(
				"groupId", AddFdaScopeClient::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AddFdaScopeClient::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AddFdaScopeClient::getUserId);
			attributeGetterFunctions.put(
				"userName", AddFdaScopeClient::getUserName);
			attributeGetterFunctions.put(
				"createDate", AddFdaScopeClient::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AddFdaScopeClient::getModifiedDate);
			attributeGetterFunctions.put(
				"clientOrganization", AddFdaScopeClient::getClientOrganization);
			attributeGetterFunctions.put(
				"foodProducts", AddFdaScopeClient::getFoodProducts);
			attributeGetterFunctions.put(
				"fdaRegulations", AddFdaScopeClient::getFdaRegulations);
			attributeGetterFunctions.put(
				"dateGranted", AddFdaScopeClient::getDateGranted);
			attributeGetterFunctions.put(
				"janaacApplicationId",
				AddFdaScopeClient::getJanaacApplicationId);
			attributeGetterFunctions.put(
				"counter", AddFdaScopeClient::getCounter);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<AddFdaScopeClient, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AddFdaScopeClient, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AddFdaScopeClient, ?>>();

			attributeSetterBiConsumers.put(
				"addFdaScopeClientId",
				(BiConsumer<AddFdaScopeClient, Long>)
					AddFdaScopeClient::setAddFdaScopeClientId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AddFdaScopeClient, Long>)
					AddFdaScopeClient::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AddFdaScopeClient, Long>)
					AddFdaScopeClient::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AddFdaScopeClient, Long>)
					AddFdaScopeClient::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AddFdaScopeClient, String>)
					AddFdaScopeClient::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AddFdaScopeClient, Date>)
					AddFdaScopeClient::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AddFdaScopeClient, Date>)
					AddFdaScopeClient::setModifiedDate);
			attributeSetterBiConsumers.put(
				"clientOrganization",
				(BiConsumer<AddFdaScopeClient, String>)
					AddFdaScopeClient::setClientOrganization);
			attributeSetterBiConsumers.put(
				"foodProducts",
				(BiConsumer<AddFdaScopeClient, String>)
					AddFdaScopeClient::setFoodProducts);
			attributeSetterBiConsumers.put(
				"fdaRegulations",
				(BiConsumer<AddFdaScopeClient, String>)
					AddFdaScopeClient::setFdaRegulations);
			attributeSetterBiConsumers.put(
				"dateGranted",
				(BiConsumer<AddFdaScopeClient, Date>)
					AddFdaScopeClient::setDateGranted);
			attributeSetterBiConsumers.put(
				"janaacApplicationId",
				(BiConsumer<AddFdaScopeClient, Long>)
					AddFdaScopeClient::setJanaacApplicationId);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<AddFdaScopeClient, String>)
					AddFdaScopeClient::setCounter);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAddFdaScopeClientId() {
		return _addFdaScopeClientId;
	}

	@Override
	public void setAddFdaScopeClientId(long addFdaScopeClientId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_addFdaScopeClientId = addFdaScopeClientId;
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
	public String getClientOrganization() {
		if (_clientOrganization == null) {
			return "";
		}
		else {
			return _clientOrganization;
		}
	}

	@Override
	public void setClientOrganization(String clientOrganization) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_clientOrganization = clientOrganization;
	}

	@JSON
	@Override
	public String getFoodProducts() {
		if (_foodProducts == null) {
			return "";
		}
		else {
			return _foodProducts;
		}
	}

	@Override
	public void setFoodProducts(String foodProducts) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_foodProducts = foodProducts;
	}

	@JSON
	@Override
	public String getFdaRegulations() {
		if (_fdaRegulations == null) {
			return "";
		}
		else {
			return _fdaRegulations;
		}
	}

	@Override
	public void setFdaRegulations(String fdaRegulations) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fdaRegulations = fdaRegulations;
	}

	@JSON
	@Override
	public Date getDateGranted() {
		return _dateGranted;
	}

	@Override
	public void setDateGranted(Date dateGranted) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateGranted = dateGranted;
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
			getCompanyId(), AddFdaScopeClient.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AddFdaScopeClient toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AddFdaScopeClient>
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
		AddFdaScopeClientImpl addFdaScopeClientImpl =
			new AddFdaScopeClientImpl();

		addFdaScopeClientImpl.setAddFdaScopeClientId(getAddFdaScopeClientId());
		addFdaScopeClientImpl.setGroupId(getGroupId());
		addFdaScopeClientImpl.setCompanyId(getCompanyId());
		addFdaScopeClientImpl.setUserId(getUserId());
		addFdaScopeClientImpl.setUserName(getUserName());
		addFdaScopeClientImpl.setCreateDate(getCreateDate());
		addFdaScopeClientImpl.setModifiedDate(getModifiedDate());
		addFdaScopeClientImpl.setClientOrganization(getClientOrganization());
		addFdaScopeClientImpl.setFoodProducts(getFoodProducts());
		addFdaScopeClientImpl.setFdaRegulations(getFdaRegulations());
		addFdaScopeClientImpl.setDateGranted(getDateGranted());
		addFdaScopeClientImpl.setJanaacApplicationId(getJanaacApplicationId());
		addFdaScopeClientImpl.setCounter(getCounter());

		addFdaScopeClientImpl.resetOriginalValues();

		return addFdaScopeClientImpl;
	}

	@Override
	public AddFdaScopeClient cloneWithOriginalValues() {
		AddFdaScopeClientImpl addFdaScopeClientImpl =
			new AddFdaScopeClientImpl();

		addFdaScopeClientImpl.setAddFdaScopeClientId(
			this.<Long>getColumnOriginalValue("addFdaScopeClientId"));
		addFdaScopeClientImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		addFdaScopeClientImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		addFdaScopeClientImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		addFdaScopeClientImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		addFdaScopeClientImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		addFdaScopeClientImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		addFdaScopeClientImpl.setClientOrganization(
			this.<String>getColumnOriginalValue("clientOrganization"));
		addFdaScopeClientImpl.setFoodProducts(
			this.<String>getColumnOriginalValue("foodProducts"));
		addFdaScopeClientImpl.setFdaRegulations(
			this.<String>getColumnOriginalValue("fdaRegulations"));
		addFdaScopeClientImpl.setDateGranted(
			this.<Date>getColumnOriginalValue("dateGranted"));
		addFdaScopeClientImpl.setJanaacApplicationId(
			this.<Long>getColumnOriginalValue("janaacApplicationId"));
		addFdaScopeClientImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));

		return addFdaScopeClientImpl;
	}

	@Override
	public int compareTo(AddFdaScopeClient addFdaScopeClient) {
		long primaryKey = addFdaScopeClient.getPrimaryKey();

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

		if (!(object instanceof AddFdaScopeClient)) {
			return false;
		}

		AddFdaScopeClient addFdaScopeClient = (AddFdaScopeClient)object;

		long primaryKey = addFdaScopeClient.getPrimaryKey();

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
	public CacheModel<AddFdaScopeClient> toCacheModel() {
		AddFdaScopeClientCacheModel addFdaScopeClientCacheModel =
			new AddFdaScopeClientCacheModel();

		addFdaScopeClientCacheModel.addFdaScopeClientId =
			getAddFdaScopeClientId();

		addFdaScopeClientCacheModel.groupId = getGroupId();

		addFdaScopeClientCacheModel.companyId = getCompanyId();

		addFdaScopeClientCacheModel.userId = getUserId();

		addFdaScopeClientCacheModel.userName = getUserName();

		String userName = addFdaScopeClientCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			addFdaScopeClientCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			addFdaScopeClientCacheModel.createDate = createDate.getTime();
		}
		else {
			addFdaScopeClientCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			addFdaScopeClientCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			addFdaScopeClientCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		addFdaScopeClientCacheModel.clientOrganization =
			getClientOrganization();

		String clientOrganization =
			addFdaScopeClientCacheModel.clientOrganization;

		if ((clientOrganization != null) &&
			(clientOrganization.length() == 0)) {

			addFdaScopeClientCacheModel.clientOrganization = null;
		}

		addFdaScopeClientCacheModel.foodProducts = getFoodProducts();

		String foodProducts = addFdaScopeClientCacheModel.foodProducts;

		if ((foodProducts != null) && (foodProducts.length() == 0)) {
			addFdaScopeClientCacheModel.foodProducts = null;
		}

		addFdaScopeClientCacheModel.fdaRegulations = getFdaRegulations();

		String fdaRegulations = addFdaScopeClientCacheModel.fdaRegulations;

		if ((fdaRegulations != null) && (fdaRegulations.length() == 0)) {
			addFdaScopeClientCacheModel.fdaRegulations = null;
		}

		Date dateGranted = getDateGranted();

		if (dateGranted != null) {
			addFdaScopeClientCacheModel.dateGranted = dateGranted.getTime();
		}
		else {
			addFdaScopeClientCacheModel.dateGranted = Long.MIN_VALUE;
		}

		addFdaScopeClientCacheModel.janaacApplicationId =
			getJanaacApplicationId();

		addFdaScopeClientCacheModel.counter = getCounter();

		String counter = addFdaScopeClientCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			addFdaScopeClientCacheModel.counter = null;
		}

		return addFdaScopeClientCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AddFdaScopeClient, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AddFdaScopeClient, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AddFdaScopeClient, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AddFdaScopeClient)this);

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

		private static final Function<InvocationHandler, AddFdaScopeClient>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AddFdaScopeClient.class, ModelWrapper.class);

	}

	private long _addFdaScopeClientId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _clientOrganization;
	private String _foodProducts;
	private String _fdaRegulations;
	private Date _dateGranted;
	private long _janaacApplicationId;
	private String _counter;

	public <T> T getColumnValue(String columnName) {
		Function<AddFdaScopeClient, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AddFdaScopeClient)this);
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

		_columnOriginalValues.put("addFdaScopeClientId", _addFdaScopeClientId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("clientOrganization", _clientOrganization);
		_columnOriginalValues.put("foodProducts", _foodProducts);
		_columnOriginalValues.put("fdaRegulations", _fdaRegulations);
		_columnOriginalValues.put("dateGranted", _dateGranted);
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

		columnBitmasks.put("addFdaScopeClientId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("clientOrganization", 128L);

		columnBitmasks.put("foodProducts", 256L);

		columnBitmasks.put("fdaRegulations", 512L);

		columnBitmasks.put("dateGranted", 1024L);

		columnBitmasks.put("janaacApplicationId", 2048L);

		columnBitmasks.put("counter", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AddFdaScopeClient _escapedModel;

}