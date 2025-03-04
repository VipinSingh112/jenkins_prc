/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model.impl;

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

import com.nbp.hsra.application.service.model.GenEquipmentData;
import com.nbp.hsra.application.service.model.GenEquipmentDataModel;

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
 * The base model implementation for the GenEquipmentData service. Represents a row in the &quot;nbp_hsra_equipment_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>GenEquipmentDataModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GenEquipmentDataImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GenEquipmentDataImpl
 * @generated
 */
@JSON(strict = true)
public class GenEquipmentDataModelImpl
	extends BaseModelImpl<GenEquipmentData> implements GenEquipmentDataModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a gen equipment data model instance should use the <code>GenEquipmentData</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_hsra_equipment_add";

	public static final Object[][] TABLE_COLUMNS = {
		{"genEquipmentDataId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"manufacturerEquipment", Types.VARCHAR},
		{"equipmentModel", Types.VARCHAR}, {"equipmentSerial", Types.VARCHAR},
		{"operatingPotential", Types.VARCHAR},
		{"natureEquipment", Types.VARCHAR},
		{"radiationGeneratingLoc", Types.VARCHAR},
		{"equipmentModels", Types.VARCHAR},
		{"equipmentStatusDetail", Types.VARCHAR},
		{"equipmentDate", Types.TIMESTAMP}, {"counter", Types.VARCHAR},
		{"hsraApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("genEquipmentDataId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("manufacturerEquipment", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentModel", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentSerial", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("operatingPotential", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("natureEquipment", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("radiationGeneratingLoc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentModels", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentStatusDetail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hsraApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_hsra_equipment_add (genEquipmentDataId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,manufacturerEquipment VARCHAR(1000) null,equipmentModel VARCHAR(75) null,equipmentSerial VARCHAR(75) null,operatingPotential VARCHAR(75) null,natureEquipment VARCHAR(1000) null,radiationGeneratingLoc VARCHAR(1000) null,equipmentModels VARCHAR(75) null,equipmentStatusDetail VARCHAR(75) null,equipmentDate DATE null,counter VARCHAR(75) null,hsraApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_hsra_equipment_add";

	public static final String ORDER_BY_JPQL =
		" ORDER BY genEquipmentData.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_hsra_equipment_add.createDate ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long HSRAAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public GenEquipmentDataModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _genEquipmentDataId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGenEquipmentDataId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _genEquipmentDataId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return GenEquipmentData.class;
	}

	@Override
	public String getModelClassName() {
		return GenEquipmentData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<GenEquipmentData, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<GenEquipmentData, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<GenEquipmentData, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((GenEquipmentData)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<GenEquipmentData, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<GenEquipmentData, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(GenEquipmentData)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<GenEquipmentData, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<GenEquipmentData, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<GenEquipmentData, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<GenEquipmentData, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<GenEquipmentData, Object>>();

			attributeGetterFunctions.put(
				"genEquipmentDataId", GenEquipmentData::getGenEquipmentDataId);
			attributeGetterFunctions.put(
				"groupId", GenEquipmentData::getGroupId);
			attributeGetterFunctions.put(
				"companyId", GenEquipmentData::getCompanyId);
			attributeGetterFunctions.put("userId", GenEquipmentData::getUserId);
			attributeGetterFunctions.put(
				"userName", GenEquipmentData::getUserName);
			attributeGetterFunctions.put(
				"createDate", GenEquipmentData::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", GenEquipmentData::getModifiedDate);
			attributeGetterFunctions.put(
				"manufacturerEquipment",
				GenEquipmentData::getManufacturerEquipment);
			attributeGetterFunctions.put(
				"equipmentModel", GenEquipmentData::getEquipmentModel);
			attributeGetterFunctions.put(
				"equipmentSerial", GenEquipmentData::getEquipmentSerial);
			attributeGetterFunctions.put(
				"operatingPotential", GenEquipmentData::getOperatingPotential);
			attributeGetterFunctions.put(
				"natureEquipment", GenEquipmentData::getNatureEquipment);
			attributeGetterFunctions.put(
				"radiationGeneratingLoc",
				GenEquipmentData::getRadiationGeneratingLoc);
			attributeGetterFunctions.put(
				"equipmentModels", GenEquipmentData::getEquipmentModels);
			attributeGetterFunctions.put(
				"equipmentStatusDetail",
				GenEquipmentData::getEquipmentStatusDetail);
			attributeGetterFunctions.put(
				"equipmentDate", GenEquipmentData::getEquipmentDate);
			attributeGetterFunctions.put(
				"counter", GenEquipmentData::getCounter);
			attributeGetterFunctions.put(
				"hsraApplicationId", GenEquipmentData::getHsraApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<GenEquipmentData, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<GenEquipmentData, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<GenEquipmentData, ?>>();

			attributeSetterBiConsumers.put(
				"genEquipmentDataId",
				(BiConsumer<GenEquipmentData, Long>)
					GenEquipmentData::setGenEquipmentDataId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<GenEquipmentData, Long>)
					GenEquipmentData::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<GenEquipmentData, Long>)
					GenEquipmentData::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<GenEquipmentData, Long>)
					GenEquipmentData::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<GenEquipmentData, Date>)
					GenEquipmentData::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<GenEquipmentData, Date>)
					GenEquipmentData::setModifiedDate);
			attributeSetterBiConsumers.put(
				"manufacturerEquipment",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setManufacturerEquipment);
			attributeSetterBiConsumers.put(
				"equipmentModel",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setEquipmentModel);
			attributeSetterBiConsumers.put(
				"equipmentSerial",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setEquipmentSerial);
			attributeSetterBiConsumers.put(
				"operatingPotential",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setOperatingPotential);
			attributeSetterBiConsumers.put(
				"natureEquipment",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setNatureEquipment);
			attributeSetterBiConsumers.put(
				"radiationGeneratingLoc",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setRadiationGeneratingLoc);
			attributeSetterBiConsumers.put(
				"equipmentModels",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setEquipmentModels);
			attributeSetterBiConsumers.put(
				"equipmentStatusDetail",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setEquipmentStatusDetail);
			attributeSetterBiConsumers.put(
				"equipmentDate",
				(BiConsumer<GenEquipmentData, Date>)
					GenEquipmentData::setEquipmentDate);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<GenEquipmentData, String>)
					GenEquipmentData::setCounter);
			attributeSetterBiConsumers.put(
				"hsraApplicationId",
				(BiConsumer<GenEquipmentData, Long>)
					GenEquipmentData::setHsraApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getGenEquipmentDataId() {
		return _genEquipmentDataId;
	}

	@Override
	public void setGenEquipmentDataId(long genEquipmentDataId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_genEquipmentDataId = genEquipmentDataId;
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
	public String getManufacturerEquipment() {
		if (_manufacturerEquipment == null) {
			return "";
		}
		else {
			return _manufacturerEquipment;
		}
	}

	@Override
	public void setManufacturerEquipment(String manufacturerEquipment) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_manufacturerEquipment = manufacturerEquipment;
	}

	@JSON
	@Override
	public String getEquipmentModel() {
		if (_equipmentModel == null) {
			return "";
		}
		else {
			return _equipmentModel;
		}
	}

	@Override
	public void setEquipmentModel(String equipmentModel) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_equipmentModel = equipmentModel;
	}

	@JSON
	@Override
	public String getEquipmentSerial() {
		if (_equipmentSerial == null) {
			return "";
		}
		else {
			return _equipmentSerial;
		}
	}

	@Override
	public void setEquipmentSerial(String equipmentSerial) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_equipmentSerial = equipmentSerial;
	}

	@JSON
	@Override
	public String getOperatingPotential() {
		if (_operatingPotential == null) {
			return "";
		}
		else {
			return _operatingPotential;
		}
	}

	@Override
	public void setOperatingPotential(String operatingPotential) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_operatingPotential = operatingPotential;
	}

	@JSON
	@Override
	public String getNatureEquipment() {
		if (_natureEquipment == null) {
			return "";
		}
		else {
			return _natureEquipment;
		}
	}

	@Override
	public void setNatureEquipment(String natureEquipment) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_natureEquipment = natureEquipment;
	}

	@JSON
	@Override
	public String getRadiationGeneratingLoc() {
		if (_radiationGeneratingLoc == null) {
			return "";
		}
		else {
			return _radiationGeneratingLoc;
		}
	}

	@Override
	public void setRadiationGeneratingLoc(String radiationGeneratingLoc) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_radiationGeneratingLoc = radiationGeneratingLoc;
	}

	@JSON
	@Override
	public String getEquipmentModels() {
		if (_equipmentModels == null) {
			return "";
		}
		else {
			return _equipmentModels;
		}
	}

	@Override
	public void setEquipmentModels(String equipmentModels) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_equipmentModels = equipmentModels;
	}

	@JSON
	@Override
	public String getEquipmentStatusDetail() {
		if (_equipmentStatusDetail == null) {
			return "";
		}
		else {
			return _equipmentStatusDetail;
		}
	}

	@Override
	public void setEquipmentStatusDetail(String equipmentStatusDetail) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_equipmentStatusDetail = equipmentStatusDetail;
	}

	@JSON
	@Override
	public Date getEquipmentDate() {
		return _equipmentDate;
	}

	@Override
	public void setEquipmentDate(Date equipmentDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_equipmentDate = equipmentDate;
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
	public long getHsraApplicationId() {
		return _hsraApplicationId;
	}

	@Override
	public void setHsraApplicationId(long hsraApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hsraApplicationId = hsraApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalHsraApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("hsraApplicationId"));
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
			getCompanyId(), GenEquipmentData.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public GenEquipmentData toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, GenEquipmentData>
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
		GenEquipmentDataImpl genEquipmentDataImpl = new GenEquipmentDataImpl();

		genEquipmentDataImpl.setGenEquipmentDataId(getGenEquipmentDataId());
		genEquipmentDataImpl.setGroupId(getGroupId());
		genEquipmentDataImpl.setCompanyId(getCompanyId());
		genEquipmentDataImpl.setUserId(getUserId());
		genEquipmentDataImpl.setUserName(getUserName());
		genEquipmentDataImpl.setCreateDate(getCreateDate());
		genEquipmentDataImpl.setModifiedDate(getModifiedDate());
		genEquipmentDataImpl.setManufacturerEquipment(
			getManufacturerEquipment());
		genEquipmentDataImpl.setEquipmentModel(getEquipmentModel());
		genEquipmentDataImpl.setEquipmentSerial(getEquipmentSerial());
		genEquipmentDataImpl.setOperatingPotential(getOperatingPotential());
		genEquipmentDataImpl.setNatureEquipment(getNatureEquipment());
		genEquipmentDataImpl.setRadiationGeneratingLoc(
			getRadiationGeneratingLoc());
		genEquipmentDataImpl.setEquipmentModels(getEquipmentModels());
		genEquipmentDataImpl.setEquipmentStatusDetail(
			getEquipmentStatusDetail());
		genEquipmentDataImpl.setEquipmentDate(getEquipmentDate());
		genEquipmentDataImpl.setCounter(getCounter());
		genEquipmentDataImpl.setHsraApplicationId(getHsraApplicationId());

		genEquipmentDataImpl.resetOriginalValues();

		return genEquipmentDataImpl;
	}

	@Override
	public GenEquipmentData cloneWithOriginalValues() {
		GenEquipmentDataImpl genEquipmentDataImpl = new GenEquipmentDataImpl();

		genEquipmentDataImpl.setGenEquipmentDataId(
			this.<Long>getColumnOriginalValue("genEquipmentDataId"));
		genEquipmentDataImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		genEquipmentDataImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		genEquipmentDataImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		genEquipmentDataImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		genEquipmentDataImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		genEquipmentDataImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		genEquipmentDataImpl.setManufacturerEquipment(
			this.<String>getColumnOriginalValue("manufacturerEquipment"));
		genEquipmentDataImpl.setEquipmentModel(
			this.<String>getColumnOriginalValue("equipmentModel"));
		genEquipmentDataImpl.setEquipmentSerial(
			this.<String>getColumnOriginalValue("equipmentSerial"));
		genEquipmentDataImpl.setOperatingPotential(
			this.<String>getColumnOriginalValue("operatingPotential"));
		genEquipmentDataImpl.setNatureEquipment(
			this.<String>getColumnOriginalValue("natureEquipment"));
		genEquipmentDataImpl.setRadiationGeneratingLoc(
			this.<String>getColumnOriginalValue("radiationGeneratingLoc"));
		genEquipmentDataImpl.setEquipmentModels(
			this.<String>getColumnOriginalValue("equipmentModels"));
		genEquipmentDataImpl.setEquipmentStatusDetail(
			this.<String>getColumnOriginalValue("equipmentStatusDetail"));
		genEquipmentDataImpl.setEquipmentDate(
			this.<Date>getColumnOriginalValue("equipmentDate"));
		genEquipmentDataImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		genEquipmentDataImpl.setHsraApplicationId(
			this.<Long>getColumnOriginalValue("hsraApplicationId"));

		return genEquipmentDataImpl;
	}

	@Override
	public int compareTo(GenEquipmentData genEquipmentData) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), genEquipmentData.getCreateDate());

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

		if (!(object instanceof GenEquipmentData)) {
			return false;
		}

		GenEquipmentData genEquipmentData = (GenEquipmentData)object;

		long primaryKey = genEquipmentData.getPrimaryKey();

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
	public CacheModel<GenEquipmentData> toCacheModel() {
		GenEquipmentDataCacheModel genEquipmentDataCacheModel =
			new GenEquipmentDataCacheModel();

		genEquipmentDataCacheModel.genEquipmentDataId = getGenEquipmentDataId();

		genEquipmentDataCacheModel.groupId = getGroupId();

		genEquipmentDataCacheModel.companyId = getCompanyId();

		genEquipmentDataCacheModel.userId = getUserId();

		genEquipmentDataCacheModel.userName = getUserName();

		String userName = genEquipmentDataCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			genEquipmentDataCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			genEquipmentDataCacheModel.createDate = createDate.getTime();
		}
		else {
			genEquipmentDataCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			genEquipmentDataCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			genEquipmentDataCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		genEquipmentDataCacheModel.manufacturerEquipment =
			getManufacturerEquipment();

		String manufacturerEquipment =
			genEquipmentDataCacheModel.manufacturerEquipment;

		if ((manufacturerEquipment != null) &&
			(manufacturerEquipment.length() == 0)) {

			genEquipmentDataCacheModel.manufacturerEquipment = null;
		}

		genEquipmentDataCacheModel.equipmentModel = getEquipmentModel();

		String equipmentModel = genEquipmentDataCacheModel.equipmentModel;

		if ((equipmentModel != null) && (equipmentModel.length() == 0)) {
			genEquipmentDataCacheModel.equipmentModel = null;
		}

		genEquipmentDataCacheModel.equipmentSerial = getEquipmentSerial();

		String equipmentSerial = genEquipmentDataCacheModel.equipmentSerial;

		if ((equipmentSerial != null) && (equipmentSerial.length() == 0)) {
			genEquipmentDataCacheModel.equipmentSerial = null;
		}

		genEquipmentDataCacheModel.operatingPotential = getOperatingPotential();

		String operatingPotential =
			genEquipmentDataCacheModel.operatingPotential;

		if ((operatingPotential != null) &&
			(operatingPotential.length() == 0)) {

			genEquipmentDataCacheModel.operatingPotential = null;
		}

		genEquipmentDataCacheModel.natureEquipment = getNatureEquipment();

		String natureEquipment = genEquipmentDataCacheModel.natureEquipment;

		if ((natureEquipment != null) && (natureEquipment.length() == 0)) {
			genEquipmentDataCacheModel.natureEquipment = null;
		}

		genEquipmentDataCacheModel.radiationGeneratingLoc =
			getRadiationGeneratingLoc();

		String radiationGeneratingLoc =
			genEquipmentDataCacheModel.radiationGeneratingLoc;

		if ((radiationGeneratingLoc != null) &&
			(radiationGeneratingLoc.length() == 0)) {

			genEquipmentDataCacheModel.radiationGeneratingLoc = null;
		}

		genEquipmentDataCacheModel.equipmentModels = getEquipmentModels();

		String equipmentModels = genEquipmentDataCacheModel.equipmentModels;

		if ((equipmentModels != null) && (equipmentModels.length() == 0)) {
			genEquipmentDataCacheModel.equipmentModels = null;
		}

		genEquipmentDataCacheModel.equipmentStatusDetail =
			getEquipmentStatusDetail();

		String equipmentStatusDetail =
			genEquipmentDataCacheModel.equipmentStatusDetail;

		if ((equipmentStatusDetail != null) &&
			(equipmentStatusDetail.length() == 0)) {

			genEquipmentDataCacheModel.equipmentStatusDetail = null;
		}

		Date equipmentDate = getEquipmentDate();

		if (equipmentDate != null) {
			genEquipmentDataCacheModel.equipmentDate = equipmentDate.getTime();
		}
		else {
			genEquipmentDataCacheModel.equipmentDate = Long.MIN_VALUE;
		}

		genEquipmentDataCacheModel.counter = getCounter();

		String counter = genEquipmentDataCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			genEquipmentDataCacheModel.counter = null;
		}

		genEquipmentDataCacheModel.hsraApplicationId = getHsraApplicationId();

		return genEquipmentDataCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<GenEquipmentData, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<GenEquipmentData, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<GenEquipmentData, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(GenEquipmentData)this);

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

		private static final Function<InvocationHandler, GenEquipmentData>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					GenEquipmentData.class, ModelWrapper.class);

	}

	private long _genEquipmentDataId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _manufacturerEquipment;
	private String _equipmentModel;
	private String _equipmentSerial;
	private String _operatingPotential;
	private String _natureEquipment;
	private String _radiationGeneratingLoc;
	private String _equipmentModels;
	private String _equipmentStatusDetail;
	private Date _equipmentDate;
	private String _counter;
	private long _hsraApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<GenEquipmentData, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((GenEquipmentData)this);
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

		_columnOriginalValues.put("genEquipmentDataId", _genEquipmentDataId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"manufacturerEquipment", _manufacturerEquipment);
		_columnOriginalValues.put("equipmentModel", _equipmentModel);
		_columnOriginalValues.put("equipmentSerial", _equipmentSerial);
		_columnOriginalValues.put("operatingPotential", _operatingPotential);
		_columnOriginalValues.put("natureEquipment", _natureEquipment);
		_columnOriginalValues.put(
			"radiationGeneratingLoc", _radiationGeneratingLoc);
		_columnOriginalValues.put("equipmentModels", _equipmentModels);
		_columnOriginalValues.put(
			"equipmentStatusDetail", _equipmentStatusDetail);
		_columnOriginalValues.put("equipmentDate", _equipmentDate);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put("hsraApplicationId", _hsraApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("genEquipmentDataId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("manufacturerEquipment", 128L);

		columnBitmasks.put("equipmentModel", 256L);

		columnBitmasks.put("equipmentSerial", 512L);

		columnBitmasks.put("operatingPotential", 1024L);

		columnBitmasks.put("natureEquipment", 2048L);

		columnBitmasks.put("radiationGeneratingLoc", 4096L);

		columnBitmasks.put("equipmentModels", 8192L);

		columnBitmasks.put("equipmentStatusDetail", 16384L);

		columnBitmasks.put("equipmentDate", 32768L);

		columnBitmasks.put("counter", 65536L);

		columnBitmasks.put("hsraApplicationId", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private GenEquipmentData _escapedModel;

}