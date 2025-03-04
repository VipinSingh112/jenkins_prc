/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

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

import com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesAssignmentDetailinfoModel;

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
 * The base model implementation for the OsiServicesAssignmentDetailinfo service. Represents a row in the &quot;nbp_osi_services_assignm_det&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OsiServicesAssignmentDetailinfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiServicesAssignmentDetailinfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAssignmentDetailinfoImpl
 * @generated
 */
@JSON(strict = true)
public class OsiServicesAssignmentDetailinfoModelImpl
	extends BaseModelImpl<OsiServicesAssignmentDetailinfo>
	implements OsiServicesAssignmentDetailinfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi services assignment detailinfo model instance should use the <code>OsiServicesAssignmentDetailinfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_services_assignm_det";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"osiADId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"assignmentName", Types.VARCHAR}, {"assignmentDated", Types.TIMESTAMP},
		{"selectedAssignmentAttached", Types.VARCHAR},
		{"assignmentAddress", Types.VARCHAR}, {"trusteeAct", Types.VARCHAR},
		{"osiServicesApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiADId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("assignmentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("assignmentDated", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("selectedAssignmentAttached", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("assignmentAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("trusteeAct", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiServicesApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_services_assignm_det (uuid_ VARCHAR(75) null,osiADId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,assignmentName VARCHAR(75) null,assignmentDated DATE null,selectedAssignmentAttached VARCHAR(500) null,assignmentAddress VARCHAR(500) null,trusteeAct VARCHAR(75) null,osiServicesApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_services_assignm_det";

	public static final String ORDER_BY_JPQL =
		" ORDER BY osiServicesAssignmentDetailinfo.osiADId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_services_assignm_det.osiADId ASC";

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
	public static final long OSISERVICESAPPLICATIONID_COLUMN_BITMASK = 4L;

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
	public static final long OSIADID_COLUMN_BITMASK = 16L;

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

	public OsiServicesAssignmentDetailinfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _osiADId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOsiADId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _osiADId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OsiServicesAssignmentDetailinfo.class;
	}

	@Override
	public String getModelClassName() {
		return OsiServicesAssignmentDetailinfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<OsiServicesAssignmentDetailinfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String, Function<OsiServicesAssignmentDetailinfo, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiServicesAssignmentDetailinfo, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(OsiServicesAssignmentDetailinfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OsiServicesAssignmentDetailinfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OsiServicesAssignmentDetailinfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(OsiServicesAssignmentDetailinfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OsiServicesAssignmentDetailinfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OsiServicesAssignmentDetailinfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<OsiServicesAssignmentDetailinfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<OsiServicesAssignmentDetailinfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<OsiServicesAssignmentDetailinfo, Object>>();

			attributeGetterFunctions.put(
				"uuid", OsiServicesAssignmentDetailinfo::getUuid);
			attributeGetterFunctions.put(
				"osiADId", OsiServicesAssignmentDetailinfo::getOsiADId);
			attributeGetterFunctions.put(
				"groupId", OsiServicesAssignmentDetailinfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", OsiServicesAssignmentDetailinfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", OsiServicesAssignmentDetailinfo::getUserId);
			attributeGetterFunctions.put(
				"userName", OsiServicesAssignmentDetailinfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", OsiServicesAssignmentDetailinfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate",
				OsiServicesAssignmentDetailinfo::getModifiedDate);
			attributeGetterFunctions.put(
				"assignmentName",
				OsiServicesAssignmentDetailinfo::getAssignmentName);
			attributeGetterFunctions.put(
				"assignmentDated",
				OsiServicesAssignmentDetailinfo::getAssignmentDated);
			attributeGetterFunctions.put(
				"selectedAssignmentAttached",
				OsiServicesAssignmentDetailinfo::getSelectedAssignmentAttached);
			attributeGetterFunctions.put(
				"assignmentAddress",
				OsiServicesAssignmentDetailinfo::getAssignmentAddress);
			attributeGetterFunctions.put(
				"trusteeAct", OsiServicesAssignmentDetailinfo::getTrusteeAct);
			attributeGetterFunctions.put(
				"osiServicesApplicationId",
				OsiServicesAssignmentDetailinfo::getOsiServicesApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<OsiServicesAssignmentDetailinfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<OsiServicesAssignmentDetailinfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String,
						 BiConsumer<OsiServicesAssignmentDetailinfo, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<OsiServicesAssignmentDetailinfo, String>)
					OsiServicesAssignmentDetailinfo::setUuid);
			attributeSetterBiConsumers.put(
				"osiADId",
				(BiConsumer<OsiServicesAssignmentDetailinfo, Long>)
					OsiServicesAssignmentDetailinfo::setOsiADId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<OsiServicesAssignmentDetailinfo, Long>)
					OsiServicesAssignmentDetailinfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<OsiServicesAssignmentDetailinfo, Long>)
					OsiServicesAssignmentDetailinfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<OsiServicesAssignmentDetailinfo, Long>)
					OsiServicesAssignmentDetailinfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<OsiServicesAssignmentDetailinfo, String>)
					OsiServicesAssignmentDetailinfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<OsiServicesAssignmentDetailinfo, Date>)
					OsiServicesAssignmentDetailinfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<OsiServicesAssignmentDetailinfo, Date>)
					OsiServicesAssignmentDetailinfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"assignmentName",
				(BiConsumer<OsiServicesAssignmentDetailinfo, String>)
					OsiServicesAssignmentDetailinfo::setAssignmentName);
			attributeSetterBiConsumers.put(
				"assignmentDated",
				(BiConsumer<OsiServicesAssignmentDetailinfo, Date>)
					OsiServicesAssignmentDetailinfo::setAssignmentDated);
			attributeSetterBiConsumers.put(
				"selectedAssignmentAttached",
				(BiConsumer<OsiServicesAssignmentDetailinfo, String>)
					OsiServicesAssignmentDetailinfo::
						setSelectedAssignmentAttached);
			attributeSetterBiConsumers.put(
				"assignmentAddress",
				(BiConsumer<OsiServicesAssignmentDetailinfo, String>)
					OsiServicesAssignmentDetailinfo::setAssignmentAddress);
			attributeSetterBiConsumers.put(
				"trusteeAct",
				(BiConsumer<OsiServicesAssignmentDetailinfo, String>)
					OsiServicesAssignmentDetailinfo::setTrusteeAct);
			attributeSetterBiConsumers.put(
				"osiServicesApplicationId",
				(BiConsumer<OsiServicesAssignmentDetailinfo, Long>)
					OsiServicesAssignmentDetailinfo::
						setOsiServicesApplicationId);

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
	public long getOsiADId() {
		return _osiADId;
	}

	@Override
	public void setOsiADId(long osiADId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiADId = osiADId;
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
	public String getAssignmentName() {
		if (_assignmentName == null) {
			return "";
		}
		else {
			return _assignmentName;
		}
	}

	@Override
	public void setAssignmentName(String assignmentName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assignmentName = assignmentName;
	}

	@JSON
	@Override
	public Date getAssignmentDated() {
		return _assignmentDated;
	}

	@Override
	public void setAssignmentDated(Date assignmentDated) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assignmentDated = assignmentDated;
	}

	@JSON
	@Override
	public String getSelectedAssignmentAttached() {
		if (_selectedAssignmentAttached == null) {
			return "";
		}
		else {
			return _selectedAssignmentAttached;
		}
	}

	@Override
	public void setSelectedAssignmentAttached(
		String selectedAssignmentAttached) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_selectedAssignmentAttached = selectedAssignmentAttached;
	}

	@JSON
	@Override
	public String getAssignmentAddress() {
		if (_assignmentAddress == null) {
			return "";
		}
		else {
			return _assignmentAddress;
		}
	}

	@Override
	public void setAssignmentAddress(String assignmentAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_assignmentAddress = assignmentAddress;
	}

	@JSON
	@Override
	public String getTrusteeAct() {
		if (_trusteeAct == null) {
			return "";
		}
		else {
			return _trusteeAct;
		}
	}

	@Override
	public void setTrusteeAct(String trusteeAct) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_trusteeAct = trusteeAct;
	}

	@JSON
	@Override
	public long getOsiServicesApplicationId() {
		return _osiServicesApplicationId;
	}

	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiServicesApplicationId = osiServicesApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalOsiServicesApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("osiServicesApplicationId"));
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				OsiServicesAssignmentDetailinfo.class.getName()));
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
			getCompanyId(), OsiServicesAssignmentDetailinfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OsiServicesAssignmentDetailinfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OsiServicesAssignmentDetailinfo>
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
		OsiServicesAssignmentDetailinfoImpl
			osiServicesAssignmentDetailinfoImpl =
				new OsiServicesAssignmentDetailinfoImpl();

		osiServicesAssignmentDetailinfoImpl.setUuid(getUuid());
		osiServicesAssignmentDetailinfoImpl.setOsiADId(getOsiADId());
		osiServicesAssignmentDetailinfoImpl.setGroupId(getGroupId());
		osiServicesAssignmentDetailinfoImpl.setCompanyId(getCompanyId());
		osiServicesAssignmentDetailinfoImpl.setUserId(getUserId());
		osiServicesAssignmentDetailinfoImpl.setUserName(getUserName());
		osiServicesAssignmentDetailinfoImpl.setCreateDate(getCreateDate());
		osiServicesAssignmentDetailinfoImpl.setModifiedDate(getModifiedDate());
		osiServicesAssignmentDetailinfoImpl.setAssignmentName(
			getAssignmentName());
		osiServicesAssignmentDetailinfoImpl.setAssignmentDated(
			getAssignmentDated());
		osiServicesAssignmentDetailinfoImpl.setSelectedAssignmentAttached(
			getSelectedAssignmentAttached());
		osiServicesAssignmentDetailinfoImpl.setAssignmentAddress(
			getAssignmentAddress());
		osiServicesAssignmentDetailinfoImpl.setTrusteeAct(getTrusteeAct());
		osiServicesAssignmentDetailinfoImpl.setOsiServicesApplicationId(
			getOsiServicesApplicationId());

		osiServicesAssignmentDetailinfoImpl.resetOriginalValues();

		return osiServicesAssignmentDetailinfoImpl;
	}

	@Override
	public OsiServicesAssignmentDetailinfo cloneWithOriginalValues() {
		OsiServicesAssignmentDetailinfoImpl
			osiServicesAssignmentDetailinfoImpl =
				new OsiServicesAssignmentDetailinfoImpl();

		osiServicesAssignmentDetailinfoImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		osiServicesAssignmentDetailinfoImpl.setOsiADId(
			this.<Long>getColumnOriginalValue("osiADId"));
		osiServicesAssignmentDetailinfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		osiServicesAssignmentDetailinfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		osiServicesAssignmentDetailinfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		osiServicesAssignmentDetailinfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		osiServicesAssignmentDetailinfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		osiServicesAssignmentDetailinfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		osiServicesAssignmentDetailinfoImpl.setAssignmentName(
			this.<String>getColumnOriginalValue("assignmentName"));
		osiServicesAssignmentDetailinfoImpl.setAssignmentDated(
			this.<Date>getColumnOriginalValue("assignmentDated"));
		osiServicesAssignmentDetailinfoImpl.setSelectedAssignmentAttached(
			this.<String>getColumnOriginalValue("selectedAssignmentAttached"));
		osiServicesAssignmentDetailinfoImpl.setAssignmentAddress(
			this.<String>getColumnOriginalValue("assignmentAddress"));
		osiServicesAssignmentDetailinfoImpl.setTrusteeAct(
			this.<String>getColumnOriginalValue("trusteeAct"));
		osiServicesAssignmentDetailinfoImpl.setOsiServicesApplicationId(
			this.<Long>getColumnOriginalValue("osiServicesApplicationId"));

		return osiServicesAssignmentDetailinfoImpl;
	}

	@Override
	public int compareTo(
		OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo) {

		long primaryKey = osiServicesAssignmentDetailinfo.getPrimaryKey();

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

		if (!(object instanceof OsiServicesAssignmentDetailinfo)) {
			return false;
		}

		OsiServicesAssignmentDetailinfo osiServicesAssignmentDetailinfo =
			(OsiServicesAssignmentDetailinfo)object;

		long primaryKey = osiServicesAssignmentDetailinfo.getPrimaryKey();

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
	public CacheModel<OsiServicesAssignmentDetailinfo> toCacheModel() {
		OsiServicesAssignmentDetailinfoCacheModel
			osiServicesAssignmentDetailinfoCacheModel =
				new OsiServicesAssignmentDetailinfoCacheModel();

		osiServicesAssignmentDetailinfoCacheModel.uuid = getUuid();

		String uuid = osiServicesAssignmentDetailinfoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			osiServicesAssignmentDetailinfoCacheModel.uuid = null;
		}

		osiServicesAssignmentDetailinfoCacheModel.osiADId = getOsiADId();

		osiServicesAssignmentDetailinfoCacheModel.groupId = getGroupId();

		osiServicesAssignmentDetailinfoCacheModel.companyId = getCompanyId();

		osiServicesAssignmentDetailinfoCacheModel.userId = getUserId();

		osiServicesAssignmentDetailinfoCacheModel.userName = getUserName();

		String userName = osiServicesAssignmentDetailinfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			osiServicesAssignmentDetailinfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			osiServicesAssignmentDetailinfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			osiServicesAssignmentDetailinfoCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			osiServicesAssignmentDetailinfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			osiServicesAssignmentDetailinfoCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		osiServicesAssignmentDetailinfoCacheModel.assignmentName =
			getAssignmentName();

		String assignmentName =
			osiServicesAssignmentDetailinfoCacheModel.assignmentName;

		if ((assignmentName != null) && (assignmentName.length() == 0)) {
			osiServicesAssignmentDetailinfoCacheModel.assignmentName = null;
		}

		Date assignmentDated = getAssignmentDated();

		if (assignmentDated != null) {
			osiServicesAssignmentDetailinfoCacheModel.assignmentDated =
				assignmentDated.getTime();
		}
		else {
			osiServicesAssignmentDetailinfoCacheModel.assignmentDated =
				Long.MIN_VALUE;
		}

		osiServicesAssignmentDetailinfoCacheModel.selectedAssignmentAttached =
			getSelectedAssignmentAttached();

		String selectedAssignmentAttached =
			osiServicesAssignmentDetailinfoCacheModel.
				selectedAssignmentAttached;

		if ((selectedAssignmentAttached != null) &&
			(selectedAssignmentAttached.length() == 0)) {

			osiServicesAssignmentDetailinfoCacheModel.
				selectedAssignmentAttached = null;
		}

		osiServicesAssignmentDetailinfoCacheModel.assignmentAddress =
			getAssignmentAddress();

		String assignmentAddress =
			osiServicesAssignmentDetailinfoCacheModel.assignmentAddress;

		if ((assignmentAddress != null) && (assignmentAddress.length() == 0)) {
			osiServicesAssignmentDetailinfoCacheModel.assignmentAddress = null;
		}

		osiServicesAssignmentDetailinfoCacheModel.trusteeAct = getTrusteeAct();

		String trusteeAct =
			osiServicesAssignmentDetailinfoCacheModel.trusteeAct;

		if ((trusteeAct != null) && (trusteeAct.length() == 0)) {
			osiServicesAssignmentDetailinfoCacheModel.trusteeAct = null;
		}

		osiServicesAssignmentDetailinfoCacheModel.osiServicesApplicationId =
			getOsiServicesApplicationId();

		return osiServicesAssignmentDetailinfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OsiServicesAssignmentDetailinfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry
				<String, Function<OsiServicesAssignmentDetailinfo, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiServicesAssignmentDetailinfo, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(OsiServicesAssignmentDetailinfo)this);

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
			<InvocationHandler, OsiServicesAssignmentDetailinfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						OsiServicesAssignmentDetailinfo.class,
						ModelWrapper.class);

	}

	private String _uuid;
	private long _osiADId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _assignmentName;
	private Date _assignmentDated;
	private String _selectedAssignmentAttached;
	private String _assignmentAddress;
	private String _trusteeAct;
	private long _osiServicesApplicationId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<OsiServicesAssignmentDetailinfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((OsiServicesAssignmentDetailinfo)this);
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
		_columnOriginalValues.put("osiADId", _osiADId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("assignmentName", _assignmentName);
		_columnOriginalValues.put("assignmentDated", _assignmentDated);
		_columnOriginalValues.put(
			"selectedAssignmentAttached", _selectedAssignmentAttached);
		_columnOriginalValues.put("assignmentAddress", _assignmentAddress);
		_columnOriginalValues.put("trusteeAct", _trusteeAct);
		_columnOriginalValues.put(
			"osiServicesApplicationId", _osiServicesApplicationId);
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

		columnBitmasks.put("osiADId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("assignmentName", 256L);

		columnBitmasks.put("assignmentDated", 512L);

		columnBitmasks.put("selectedAssignmentAttached", 1024L);

		columnBitmasks.put("assignmentAddress", 2048L);

		columnBitmasks.put("trusteeAct", 4096L);

		columnBitmasks.put("osiServicesApplicationId", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private OsiServicesAssignmentDetailinfo _escapedModel;

}