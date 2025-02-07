/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;
import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAddModel;

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
 * The base model implementation for the NcbjNumOfEmpAdd service. Represents a row in the &quot;nbp_ncbj_num_of_emp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>NcbjNumOfEmpAddModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjNumOfEmpAddImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumOfEmpAddImpl
 * @generated
 */
@JSON(strict = true)
public class NcbjNumOfEmpAddModelImpl
	extends BaseModelImpl<NcbjNumOfEmpAdd> implements NcbjNumOfEmpAddModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj num of emp add model instance should use the <code>NcbjNumOfEmpAdd</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_ncbj_num_of_emp";

	public static final Object[][] TABLE_COLUMNS = {
		{"ncbjNumOfEmpAddId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"headOffice", Types.VARCHAR},
		{"administrationOffice", Types.VARCHAR},
		{"productionProcessing", Types.VARCHAR},
		{"maintenanceService", Types.VARCHAR}, {"logistics", Types.VARCHAR},
		{"total", Types.VARCHAR}, {"seasonal", Types.VARCHAR},
		{"temporary", Types.VARCHAR}, {"subcontracted", Types.VARCHAR},
		{"counter", Types.VARCHAR}, {"ncbjApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("ncbjNumOfEmpAddId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("headOffice", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("administrationOffice", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("productionProcessing", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("maintenanceService", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("logistics", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("total", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("seasonal", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("temporary", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subcontracted", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ncbjApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_ncbj_num_of_emp (ncbjNumOfEmpAddId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,headOffice VARCHAR(75) null,administrationOffice VARCHAR(75) null,productionProcessing VARCHAR(75) null,maintenanceService VARCHAR(75) null,logistics VARCHAR(75) null,total VARCHAR(75) null,seasonal VARCHAR(75) null,temporary VARCHAR(75) null,subcontracted VARCHAR(75) null,counter VARCHAR(75) null,ncbjApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_ncbj_num_of_emp";

	public static final String ORDER_BY_JPQL =
		" ORDER BY ncbjNumOfEmpAdd.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_ncbj_num_of_emp.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long NCBJAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public NcbjNumOfEmpAddModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ncbjNumOfEmpAddId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNcbjNumOfEmpAddId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ncbjNumOfEmpAddId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return NcbjNumOfEmpAdd.class;
	}

	@Override
	public String getModelClassName() {
		return NcbjNumOfEmpAdd.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<NcbjNumOfEmpAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<NcbjNumOfEmpAdd, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcbjNumOfEmpAdd, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((NcbjNumOfEmpAdd)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<NcbjNumOfEmpAdd, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<NcbjNumOfEmpAdd, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(NcbjNumOfEmpAdd)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<NcbjNumOfEmpAdd, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<NcbjNumOfEmpAdd, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<NcbjNumOfEmpAdd, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<NcbjNumOfEmpAdd, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<NcbjNumOfEmpAdd, Object>>();

			attributeGetterFunctions.put(
				"ncbjNumOfEmpAddId", NcbjNumOfEmpAdd::getNcbjNumOfEmpAddId);
			attributeGetterFunctions.put(
				"groupId", NcbjNumOfEmpAdd::getGroupId);
			attributeGetterFunctions.put(
				"companyId", NcbjNumOfEmpAdd::getCompanyId);
			attributeGetterFunctions.put("userId", NcbjNumOfEmpAdd::getUserId);
			attributeGetterFunctions.put(
				"userName", NcbjNumOfEmpAdd::getUserName);
			attributeGetterFunctions.put(
				"createDate", NcbjNumOfEmpAdd::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", NcbjNumOfEmpAdd::getModifiedDate);
			attributeGetterFunctions.put(
				"headOffice", NcbjNumOfEmpAdd::getHeadOffice);
			attributeGetterFunctions.put(
				"administrationOffice",
				NcbjNumOfEmpAdd::getAdministrationOffice);
			attributeGetterFunctions.put(
				"productionProcessing",
				NcbjNumOfEmpAdd::getProductionProcessing);
			attributeGetterFunctions.put(
				"maintenanceService", NcbjNumOfEmpAdd::getMaintenanceService);
			attributeGetterFunctions.put(
				"logistics", NcbjNumOfEmpAdd::getLogistics);
			attributeGetterFunctions.put("total", NcbjNumOfEmpAdd::getTotal);
			attributeGetterFunctions.put(
				"seasonal", NcbjNumOfEmpAdd::getSeasonal);
			attributeGetterFunctions.put(
				"temporary", NcbjNumOfEmpAdd::getTemporary);
			attributeGetterFunctions.put(
				"subcontracted", NcbjNumOfEmpAdd::getSubcontracted);
			attributeGetterFunctions.put(
				"counter", NcbjNumOfEmpAdd::getCounter);
			attributeGetterFunctions.put(
				"ncbjApplicationId", NcbjNumOfEmpAdd::getNcbjApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<NcbjNumOfEmpAdd, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<NcbjNumOfEmpAdd, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap<String, BiConsumer<NcbjNumOfEmpAdd, ?>>();

			attributeSetterBiConsumers.put(
				"ncbjNumOfEmpAddId",
				(BiConsumer<NcbjNumOfEmpAdd, Long>)
					NcbjNumOfEmpAdd::setNcbjNumOfEmpAddId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<NcbjNumOfEmpAdd, Long>)NcbjNumOfEmpAdd::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<NcbjNumOfEmpAdd, Long>)
					NcbjNumOfEmpAdd::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<NcbjNumOfEmpAdd, Long>)NcbjNumOfEmpAdd::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<NcbjNumOfEmpAdd, Date>)
					NcbjNumOfEmpAdd::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<NcbjNumOfEmpAdd, Date>)
					NcbjNumOfEmpAdd::setModifiedDate);
			attributeSetterBiConsumers.put(
				"headOffice",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setHeadOffice);
			attributeSetterBiConsumers.put(
				"administrationOffice",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setAdministrationOffice);
			attributeSetterBiConsumers.put(
				"productionProcessing",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setProductionProcessing);
			attributeSetterBiConsumers.put(
				"maintenanceService",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setMaintenanceService);
			attributeSetterBiConsumers.put(
				"logistics",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setLogistics);
			attributeSetterBiConsumers.put(
				"total",
				(BiConsumer<NcbjNumOfEmpAdd, String>)NcbjNumOfEmpAdd::setTotal);
			attributeSetterBiConsumers.put(
				"seasonal",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setSeasonal);
			attributeSetterBiConsumers.put(
				"temporary",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setTemporary);
			attributeSetterBiConsumers.put(
				"subcontracted",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setSubcontracted);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<NcbjNumOfEmpAdd, String>)
					NcbjNumOfEmpAdd::setCounter);
			attributeSetterBiConsumers.put(
				"ncbjApplicationId",
				(BiConsumer<NcbjNumOfEmpAdd, Long>)
					NcbjNumOfEmpAdd::setNcbjApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getNcbjNumOfEmpAddId() {
		return _ncbjNumOfEmpAddId;
	}

	@Override
	public void setNcbjNumOfEmpAddId(long ncbjNumOfEmpAddId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ncbjNumOfEmpAddId = ncbjNumOfEmpAddId;
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
	public String getHeadOffice() {
		if (_headOffice == null) {
			return "";
		}
		else {
			return _headOffice;
		}
	}

	@Override
	public void setHeadOffice(String headOffice) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_headOffice = headOffice;
	}

	@JSON
	@Override
	public String getAdministrationOffice() {
		if (_administrationOffice == null) {
			return "";
		}
		else {
			return _administrationOffice;
		}
	}

	@Override
	public void setAdministrationOffice(String administrationOffice) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_administrationOffice = administrationOffice;
	}

	@JSON
	@Override
	public String getProductionProcessing() {
		if (_productionProcessing == null) {
			return "";
		}
		else {
			return _productionProcessing;
		}
	}

	@Override
	public void setProductionProcessing(String productionProcessing) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_productionProcessing = productionProcessing;
	}

	@JSON
	@Override
	public String getMaintenanceService() {
		if (_maintenanceService == null) {
			return "";
		}
		else {
			return _maintenanceService;
		}
	}

	@Override
	public void setMaintenanceService(String maintenanceService) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_maintenanceService = maintenanceService;
	}

	@JSON
	@Override
	public String getLogistics() {
		if (_logistics == null) {
			return "";
		}
		else {
			return _logistics;
		}
	}

	@Override
	public void setLogistics(String logistics) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_logistics = logistics;
	}

	@JSON
	@Override
	public String getTotal() {
		if (_total == null) {
			return "";
		}
		else {
			return _total;
		}
	}

	@Override
	public void setTotal(String total) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_total = total;
	}

	@JSON
	@Override
	public String getSeasonal() {
		if (_seasonal == null) {
			return "";
		}
		else {
			return _seasonal;
		}
	}

	@Override
	public void setSeasonal(String seasonal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_seasonal = seasonal;
	}

	@JSON
	@Override
	public String getTemporary() {
		if (_temporary == null) {
			return "";
		}
		else {
			return _temporary;
		}
	}

	@Override
	public void setTemporary(String temporary) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_temporary = temporary;
	}

	@JSON
	@Override
	public String getSubcontracted() {
		if (_subcontracted == null) {
			return "";
		}
		else {
			return _subcontracted;
		}
	}

	@Override
	public void setSubcontracted(String subcontracted) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_subcontracted = subcontracted;
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

	@JSON
	@Override
	public long getNcbjApplicationId() {
		return _ncbjApplicationId;
	}

	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ncbjApplicationId = ncbjApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalNcbjApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("ncbjApplicationId"));
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
			getCompanyId(), NcbjNumOfEmpAdd.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NcbjNumOfEmpAdd toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, NcbjNumOfEmpAdd>
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
		NcbjNumOfEmpAddImpl ncbjNumOfEmpAddImpl = new NcbjNumOfEmpAddImpl();

		ncbjNumOfEmpAddImpl.setNcbjNumOfEmpAddId(getNcbjNumOfEmpAddId());
		ncbjNumOfEmpAddImpl.setGroupId(getGroupId());
		ncbjNumOfEmpAddImpl.setCompanyId(getCompanyId());
		ncbjNumOfEmpAddImpl.setUserId(getUserId());
		ncbjNumOfEmpAddImpl.setUserName(getUserName());
		ncbjNumOfEmpAddImpl.setCreateDate(getCreateDate());
		ncbjNumOfEmpAddImpl.setModifiedDate(getModifiedDate());
		ncbjNumOfEmpAddImpl.setHeadOffice(getHeadOffice());
		ncbjNumOfEmpAddImpl.setAdministrationOffice(getAdministrationOffice());
		ncbjNumOfEmpAddImpl.setProductionProcessing(getProductionProcessing());
		ncbjNumOfEmpAddImpl.setMaintenanceService(getMaintenanceService());
		ncbjNumOfEmpAddImpl.setLogistics(getLogistics());
		ncbjNumOfEmpAddImpl.setTotal(getTotal());
		ncbjNumOfEmpAddImpl.setSeasonal(getSeasonal());
		ncbjNumOfEmpAddImpl.setTemporary(getTemporary());
		ncbjNumOfEmpAddImpl.setSubcontracted(getSubcontracted());
		ncbjNumOfEmpAddImpl.setCounter(getCounter());
		ncbjNumOfEmpAddImpl.setNcbjApplicationId(getNcbjApplicationId());

		ncbjNumOfEmpAddImpl.resetOriginalValues();

		return ncbjNumOfEmpAddImpl;
	}

	@Override
	public NcbjNumOfEmpAdd cloneWithOriginalValues() {
		NcbjNumOfEmpAddImpl ncbjNumOfEmpAddImpl = new NcbjNumOfEmpAddImpl();

		ncbjNumOfEmpAddImpl.setNcbjNumOfEmpAddId(
			this.<Long>getColumnOriginalValue("ncbjNumOfEmpAddId"));
		ncbjNumOfEmpAddImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		ncbjNumOfEmpAddImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		ncbjNumOfEmpAddImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		ncbjNumOfEmpAddImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		ncbjNumOfEmpAddImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		ncbjNumOfEmpAddImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		ncbjNumOfEmpAddImpl.setHeadOffice(
			this.<String>getColumnOriginalValue("headOffice"));
		ncbjNumOfEmpAddImpl.setAdministrationOffice(
			this.<String>getColumnOriginalValue("administrationOffice"));
		ncbjNumOfEmpAddImpl.setProductionProcessing(
			this.<String>getColumnOriginalValue("productionProcessing"));
		ncbjNumOfEmpAddImpl.setMaintenanceService(
			this.<String>getColumnOriginalValue("maintenanceService"));
		ncbjNumOfEmpAddImpl.setLogistics(
			this.<String>getColumnOriginalValue("logistics"));
		ncbjNumOfEmpAddImpl.setTotal(
			this.<String>getColumnOriginalValue("total"));
		ncbjNumOfEmpAddImpl.setSeasonal(
			this.<String>getColumnOriginalValue("seasonal"));
		ncbjNumOfEmpAddImpl.setTemporary(
			this.<String>getColumnOriginalValue("temporary"));
		ncbjNumOfEmpAddImpl.setSubcontracted(
			this.<String>getColumnOriginalValue("subcontracted"));
		ncbjNumOfEmpAddImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		ncbjNumOfEmpAddImpl.setNcbjApplicationId(
			this.<Long>getColumnOriginalValue("ncbjApplicationId"));

		return ncbjNumOfEmpAddImpl;
	}

	@Override
	public int compareTo(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), ncbjNumOfEmpAdd.getCreateDate());

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

		if (!(object instanceof NcbjNumOfEmpAdd)) {
			return false;
		}

		NcbjNumOfEmpAdd ncbjNumOfEmpAdd = (NcbjNumOfEmpAdd)object;

		long primaryKey = ncbjNumOfEmpAdd.getPrimaryKey();

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
	public CacheModel<NcbjNumOfEmpAdd> toCacheModel() {
		NcbjNumOfEmpAddCacheModel ncbjNumOfEmpAddCacheModel =
			new NcbjNumOfEmpAddCacheModel();

		ncbjNumOfEmpAddCacheModel.ncbjNumOfEmpAddId = getNcbjNumOfEmpAddId();

		ncbjNumOfEmpAddCacheModel.groupId = getGroupId();

		ncbjNumOfEmpAddCacheModel.companyId = getCompanyId();

		ncbjNumOfEmpAddCacheModel.userId = getUserId();

		ncbjNumOfEmpAddCacheModel.userName = getUserName();

		String userName = ncbjNumOfEmpAddCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ncbjNumOfEmpAddCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ncbjNumOfEmpAddCacheModel.createDate = createDate.getTime();
		}
		else {
			ncbjNumOfEmpAddCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ncbjNumOfEmpAddCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			ncbjNumOfEmpAddCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ncbjNumOfEmpAddCacheModel.headOffice = getHeadOffice();

		String headOffice = ncbjNumOfEmpAddCacheModel.headOffice;

		if ((headOffice != null) && (headOffice.length() == 0)) {
			ncbjNumOfEmpAddCacheModel.headOffice = null;
		}

		ncbjNumOfEmpAddCacheModel.administrationOffice =
			getAdministrationOffice();

		String administrationOffice =
			ncbjNumOfEmpAddCacheModel.administrationOffice;

		if ((administrationOffice != null) &&
			(administrationOffice.length() == 0)) {

			ncbjNumOfEmpAddCacheModel.administrationOffice = null;
		}

		ncbjNumOfEmpAddCacheModel.productionProcessing =
			getProductionProcessing();

		String productionProcessing =
			ncbjNumOfEmpAddCacheModel.productionProcessing;

		if ((productionProcessing != null) &&
			(productionProcessing.length() == 0)) {

			ncbjNumOfEmpAddCacheModel.productionProcessing = null;
		}

		ncbjNumOfEmpAddCacheModel.maintenanceService = getMaintenanceService();

		String maintenanceService =
			ncbjNumOfEmpAddCacheModel.maintenanceService;

		if ((maintenanceService != null) &&
			(maintenanceService.length() == 0)) {

			ncbjNumOfEmpAddCacheModel.maintenanceService = null;
		}

		ncbjNumOfEmpAddCacheModel.logistics = getLogistics();

		String logistics = ncbjNumOfEmpAddCacheModel.logistics;

		if ((logistics != null) && (logistics.length() == 0)) {
			ncbjNumOfEmpAddCacheModel.logistics = null;
		}

		ncbjNumOfEmpAddCacheModel.total = getTotal();

		String total = ncbjNumOfEmpAddCacheModel.total;

		if ((total != null) && (total.length() == 0)) {
			ncbjNumOfEmpAddCacheModel.total = null;
		}

		ncbjNumOfEmpAddCacheModel.seasonal = getSeasonal();

		String seasonal = ncbjNumOfEmpAddCacheModel.seasonal;

		if ((seasonal != null) && (seasonal.length() == 0)) {
			ncbjNumOfEmpAddCacheModel.seasonal = null;
		}

		ncbjNumOfEmpAddCacheModel.temporary = getTemporary();

		String temporary = ncbjNumOfEmpAddCacheModel.temporary;

		if ((temporary != null) && (temporary.length() == 0)) {
			ncbjNumOfEmpAddCacheModel.temporary = null;
		}

		ncbjNumOfEmpAddCacheModel.subcontracted = getSubcontracted();

		String subcontracted = ncbjNumOfEmpAddCacheModel.subcontracted;

		if ((subcontracted != null) && (subcontracted.length() == 0)) {
			ncbjNumOfEmpAddCacheModel.subcontracted = null;
		}

		ncbjNumOfEmpAddCacheModel.counter = getCounter();

		String counter = ncbjNumOfEmpAddCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			ncbjNumOfEmpAddCacheModel.counter = null;
		}

		ncbjNumOfEmpAddCacheModel.ncbjApplicationId = getNcbjApplicationId();

		return ncbjNumOfEmpAddCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<NcbjNumOfEmpAdd, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<NcbjNumOfEmpAdd, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcbjNumOfEmpAdd, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((NcbjNumOfEmpAdd)this);

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

		private static final Function<InvocationHandler, NcbjNumOfEmpAdd>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					NcbjNumOfEmpAdd.class, ModelWrapper.class);

	}

	private long _ncbjNumOfEmpAddId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _headOffice;
	private String _administrationOffice;
	private String _productionProcessing;
	private String _maintenanceService;
	private String _logistics;
	private String _total;
	private String _seasonal;
	private String _temporary;
	private String _subcontracted;
	private String _counter;
	private long _ncbjApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<NcbjNumOfEmpAdd, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((NcbjNumOfEmpAdd)this);
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

		_columnOriginalValues.put("ncbjNumOfEmpAddId", _ncbjNumOfEmpAddId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("headOffice", _headOffice);
		_columnOriginalValues.put(
			"administrationOffice", _administrationOffice);
		_columnOriginalValues.put(
			"productionProcessing", _productionProcessing);
		_columnOriginalValues.put("maintenanceService", _maintenanceService);
		_columnOriginalValues.put("logistics", _logistics);
		_columnOriginalValues.put("total", _total);
		_columnOriginalValues.put("seasonal", _seasonal);
		_columnOriginalValues.put("temporary", _temporary);
		_columnOriginalValues.put("subcontracted", _subcontracted);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put("ncbjApplicationId", _ncbjApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("ncbjNumOfEmpAddId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("headOffice", 128L);

		columnBitmasks.put("administrationOffice", 256L);

		columnBitmasks.put("productionProcessing", 512L);

		columnBitmasks.put("maintenanceService", 1024L);

		columnBitmasks.put("logistics", 2048L);

		columnBitmasks.put("total", 4096L);

		columnBitmasks.put("seasonal", 8192L);

		columnBitmasks.put("temporary", 16384L);

		columnBitmasks.put("subcontracted", 32768L);

		columnBitmasks.put("counter", 65536L);

		columnBitmasks.put("ncbjApplicationId", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private NcbjNumOfEmpAdd _escapedModel;

}