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

import com.nbp.hsra.application.service.model.PurposeOfPropLicence;
import com.nbp.hsra.application.service.model.PurposeOfPropLicenceModel;

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
 * The base model implementation for the PurposeOfPropLicence service. Represents a row in the &quot;nbp_hsra_purpose_regst&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PurposeOfPropLicenceModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PurposeOfPropLicenceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PurposeOfPropLicenceImpl
 * @generated
 */
@JSON(strict = true)
public class PurposeOfPropLicenceModelImpl
	extends BaseModelImpl<PurposeOfPropLicence>
	implements PurposeOfPropLicenceModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a purpose of prop licence model instance should use the <code>PurposeOfPropLicence</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_hsra_purpose_regst";

	public static final Object[][] TABLE_COLUMNS = {
		{"purposeOfPropLicenceId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"nuclearRegstLic", Types.VARCHAR},
		{"nuclearBusinessPlace", Types.VARCHAR},
		{"nuclearActivityMainAdd", Types.VARCHAR},
		{"applicationType", Types.VARCHAR},
		{"nuclearAdditionalLoc", Types.VARCHAR},
		{"hsraApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("purposeOfPropLicenceId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("nuclearRegstLic", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nuclearBusinessPlace", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nuclearActivityMainAdd", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicationType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nuclearAdditionalLoc", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hsraApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_hsra_purpose_regst (purposeOfPropLicenceId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,nuclearRegstLic VARCHAR(75) null,nuclearBusinessPlace VARCHAR(500) null,nuclearActivityMainAdd VARCHAR(500) null,applicationType VARCHAR(75) null,nuclearAdditionalLoc VARCHAR(500) null,hsraApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_hsra_purpose_regst";

	public static final String ORDER_BY_JPQL =
		" ORDER BY purposeOfPropLicence.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_hsra_purpose_regst.createDate ASC";

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

	public PurposeOfPropLicenceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _purposeOfPropLicenceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPurposeOfPropLicenceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _purposeOfPropLicenceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PurposeOfPropLicence.class;
	}

	@Override
	public String getModelClassName() {
		return PurposeOfPropLicence.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<PurposeOfPropLicence, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<PurposeOfPropLicence, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PurposeOfPropLicence, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((PurposeOfPropLicence)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<PurposeOfPropLicence, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<PurposeOfPropLicence, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(PurposeOfPropLicence)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<PurposeOfPropLicence, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<PurposeOfPropLicence, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<PurposeOfPropLicence, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<PurposeOfPropLicence, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<PurposeOfPropLicence, Object>>();

			attributeGetterFunctions.put(
				"purposeOfPropLicenceId",
				PurposeOfPropLicence::getPurposeOfPropLicenceId);
			attributeGetterFunctions.put(
				"groupId", PurposeOfPropLicence::getGroupId);
			attributeGetterFunctions.put(
				"companyId", PurposeOfPropLicence::getCompanyId);
			attributeGetterFunctions.put(
				"userId", PurposeOfPropLicence::getUserId);
			attributeGetterFunctions.put(
				"userName", PurposeOfPropLicence::getUserName);
			attributeGetterFunctions.put(
				"createDate", PurposeOfPropLicence::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", PurposeOfPropLicence::getModifiedDate);
			attributeGetterFunctions.put(
				"nuclearRegstLic", PurposeOfPropLicence::getNuclearRegstLic);
			attributeGetterFunctions.put(
				"nuclearBusinessPlace",
				PurposeOfPropLicence::getNuclearBusinessPlace);
			attributeGetterFunctions.put(
				"nuclearActivityMainAdd",
				PurposeOfPropLicence::getNuclearActivityMainAdd);
			attributeGetterFunctions.put(
				"applicationType", PurposeOfPropLicence::getApplicationType);
			attributeGetterFunctions.put(
				"nuclearAdditionalLoc",
				PurposeOfPropLicence::getNuclearAdditionalLoc);
			attributeGetterFunctions.put(
				"hsraApplicationId",
				PurposeOfPropLicence::getHsraApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<PurposeOfPropLicence, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<PurposeOfPropLicence, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<PurposeOfPropLicence, ?>>();

			attributeSetterBiConsumers.put(
				"purposeOfPropLicenceId",
				(BiConsumer<PurposeOfPropLicence, Long>)
					PurposeOfPropLicence::setPurposeOfPropLicenceId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<PurposeOfPropLicence, Long>)
					PurposeOfPropLicence::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<PurposeOfPropLicence, Long>)
					PurposeOfPropLicence::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<PurposeOfPropLicence, Long>)
					PurposeOfPropLicence::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<PurposeOfPropLicence, String>)
					PurposeOfPropLicence::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<PurposeOfPropLicence, Date>)
					PurposeOfPropLicence::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<PurposeOfPropLicence, Date>)
					PurposeOfPropLicence::setModifiedDate);
			attributeSetterBiConsumers.put(
				"nuclearRegstLic",
				(BiConsumer<PurposeOfPropLicence, String>)
					PurposeOfPropLicence::setNuclearRegstLic);
			attributeSetterBiConsumers.put(
				"nuclearBusinessPlace",
				(BiConsumer<PurposeOfPropLicence, String>)
					PurposeOfPropLicence::setNuclearBusinessPlace);
			attributeSetterBiConsumers.put(
				"nuclearActivityMainAdd",
				(BiConsumer<PurposeOfPropLicence, String>)
					PurposeOfPropLicence::setNuclearActivityMainAdd);
			attributeSetterBiConsumers.put(
				"applicationType",
				(BiConsumer<PurposeOfPropLicence, String>)
					PurposeOfPropLicence::setApplicationType);
			attributeSetterBiConsumers.put(
				"nuclearAdditionalLoc",
				(BiConsumer<PurposeOfPropLicence, String>)
					PurposeOfPropLicence::setNuclearAdditionalLoc);
			attributeSetterBiConsumers.put(
				"hsraApplicationId",
				(BiConsumer<PurposeOfPropLicence, Long>)
					PurposeOfPropLicence::setHsraApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getPurposeOfPropLicenceId() {
		return _purposeOfPropLicenceId;
	}

	@Override
	public void setPurposeOfPropLicenceId(long purposeOfPropLicenceId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_purposeOfPropLicenceId = purposeOfPropLicenceId;
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
	public String getNuclearRegstLic() {
		if (_nuclearRegstLic == null) {
			return "";
		}
		else {
			return _nuclearRegstLic;
		}
	}

	@Override
	public void setNuclearRegstLic(String nuclearRegstLic) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nuclearRegstLic = nuclearRegstLic;
	}

	@JSON
	@Override
	public String getNuclearBusinessPlace() {
		if (_nuclearBusinessPlace == null) {
			return "";
		}
		else {
			return _nuclearBusinessPlace;
		}
	}

	@Override
	public void setNuclearBusinessPlace(String nuclearBusinessPlace) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nuclearBusinessPlace = nuclearBusinessPlace;
	}

	@JSON
	@Override
	public String getNuclearActivityMainAdd() {
		if (_nuclearActivityMainAdd == null) {
			return "";
		}
		else {
			return _nuclearActivityMainAdd;
		}
	}

	@Override
	public void setNuclearActivityMainAdd(String nuclearActivityMainAdd) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nuclearActivityMainAdd = nuclearActivityMainAdd;
	}

	@JSON
	@Override
	public String getApplicationType() {
		if (_applicationType == null) {
			return "";
		}
		else {
			return _applicationType;
		}
	}

	@Override
	public void setApplicationType(String applicationType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicationType = applicationType;
	}

	@JSON
	@Override
	public String getNuclearAdditionalLoc() {
		if (_nuclearAdditionalLoc == null) {
			return "";
		}
		else {
			return _nuclearAdditionalLoc;
		}
	}

	@Override
	public void setNuclearAdditionalLoc(String nuclearAdditionalLoc) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nuclearAdditionalLoc = nuclearAdditionalLoc;
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
			getCompanyId(), PurposeOfPropLicence.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PurposeOfPropLicence toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, PurposeOfPropLicence>
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
		PurposeOfPropLicenceImpl purposeOfPropLicenceImpl =
			new PurposeOfPropLicenceImpl();

		purposeOfPropLicenceImpl.setPurposeOfPropLicenceId(
			getPurposeOfPropLicenceId());
		purposeOfPropLicenceImpl.setGroupId(getGroupId());
		purposeOfPropLicenceImpl.setCompanyId(getCompanyId());
		purposeOfPropLicenceImpl.setUserId(getUserId());
		purposeOfPropLicenceImpl.setUserName(getUserName());
		purposeOfPropLicenceImpl.setCreateDate(getCreateDate());
		purposeOfPropLicenceImpl.setModifiedDate(getModifiedDate());
		purposeOfPropLicenceImpl.setNuclearRegstLic(getNuclearRegstLic());
		purposeOfPropLicenceImpl.setNuclearBusinessPlace(
			getNuclearBusinessPlace());
		purposeOfPropLicenceImpl.setNuclearActivityMainAdd(
			getNuclearActivityMainAdd());
		purposeOfPropLicenceImpl.setApplicationType(getApplicationType());
		purposeOfPropLicenceImpl.setNuclearAdditionalLoc(
			getNuclearAdditionalLoc());
		purposeOfPropLicenceImpl.setHsraApplicationId(getHsraApplicationId());

		purposeOfPropLicenceImpl.resetOriginalValues();

		return purposeOfPropLicenceImpl;
	}

	@Override
	public PurposeOfPropLicence cloneWithOriginalValues() {
		PurposeOfPropLicenceImpl purposeOfPropLicenceImpl =
			new PurposeOfPropLicenceImpl();

		purposeOfPropLicenceImpl.setPurposeOfPropLicenceId(
			this.<Long>getColumnOriginalValue("purposeOfPropLicenceId"));
		purposeOfPropLicenceImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		purposeOfPropLicenceImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		purposeOfPropLicenceImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		purposeOfPropLicenceImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		purposeOfPropLicenceImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		purposeOfPropLicenceImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		purposeOfPropLicenceImpl.setNuclearRegstLic(
			this.<String>getColumnOriginalValue("nuclearRegstLic"));
		purposeOfPropLicenceImpl.setNuclearBusinessPlace(
			this.<String>getColumnOriginalValue("nuclearBusinessPlace"));
		purposeOfPropLicenceImpl.setNuclearActivityMainAdd(
			this.<String>getColumnOriginalValue("nuclearActivityMainAdd"));
		purposeOfPropLicenceImpl.setApplicationType(
			this.<String>getColumnOriginalValue("applicationType"));
		purposeOfPropLicenceImpl.setNuclearAdditionalLoc(
			this.<String>getColumnOriginalValue("nuclearAdditionalLoc"));
		purposeOfPropLicenceImpl.setHsraApplicationId(
			this.<Long>getColumnOriginalValue("hsraApplicationId"));

		return purposeOfPropLicenceImpl;
	}

	@Override
	public int compareTo(PurposeOfPropLicence purposeOfPropLicence) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), purposeOfPropLicence.getCreateDate());

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

		if (!(object instanceof PurposeOfPropLicence)) {
			return false;
		}

		PurposeOfPropLicence purposeOfPropLicence =
			(PurposeOfPropLicence)object;

		long primaryKey = purposeOfPropLicence.getPrimaryKey();

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
	public CacheModel<PurposeOfPropLicence> toCacheModel() {
		PurposeOfPropLicenceCacheModel purposeOfPropLicenceCacheModel =
			new PurposeOfPropLicenceCacheModel();

		purposeOfPropLicenceCacheModel.purposeOfPropLicenceId =
			getPurposeOfPropLicenceId();

		purposeOfPropLicenceCacheModel.groupId = getGroupId();

		purposeOfPropLicenceCacheModel.companyId = getCompanyId();

		purposeOfPropLicenceCacheModel.userId = getUserId();

		purposeOfPropLicenceCacheModel.userName = getUserName();

		String userName = purposeOfPropLicenceCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			purposeOfPropLicenceCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			purposeOfPropLicenceCacheModel.createDate = createDate.getTime();
		}
		else {
			purposeOfPropLicenceCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			purposeOfPropLicenceCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			purposeOfPropLicenceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		purposeOfPropLicenceCacheModel.nuclearRegstLic = getNuclearRegstLic();

		String nuclearRegstLic = purposeOfPropLicenceCacheModel.nuclearRegstLic;

		if ((nuclearRegstLic != null) && (nuclearRegstLic.length() == 0)) {
			purposeOfPropLicenceCacheModel.nuclearRegstLic = null;
		}

		purposeOfPropLicenceCacheModel.nuclearBusinessPlace =
			getNuclearBusinessPlace();

		String nuclearBusinessPlace =
			purposeOfPropLicenceCacheModel.nuclearBusinessPlace;

		if ((nuclearBusinessPlace != null) &&
			(nuclearBusinessPlace.length() == 0)) {

			purposeOfPropLicenceCacheModel.nuclearBusinessPlace = null;
		}

		purposeOfPropLicenceCacheModel.nuclearActivityMainAdd =
			getNuclearActivityMainAdd();

		String nuclearActivityMainAdd =
			purposeOfPropLicenceCacheModel.nuclearActivityMainAdd;

		if ((nuclearActivityMainAdd != null) &&
			(nuclearActivityMainAdd.length() == 0)) {

			purposeOfPropLicenceCacheModel.nuclearActivityMainAdd = null;
		}

		purposeOfPropLicenceCacheModel.applicationType = getApplicationType();

		String applicationType = purposeOfPropLicenceCacheModel.applicationType;

		if ((applicationType != null) && (applicationType.length() == 0)) {
			purposeOfPropLicenceCacheModel.applicationType = null;
		}

		purposeOfPropLicenceCacheModel.nuclearAdditionalLoc =
			getNuclearAdditionalLoc();

		String nuclearAdditionalLoc =
			purposeOfPropLicenceCacheModel.nuclearAdditionalLoc;

		if ((nuclearAdditionalLoc != null) &&
			(nuclearAdditionalLoc.length() == 0)) {

			purposeOfPropLicenceCacheModel.nuclearAdditionalLoc = null;
		}

		purposeOfPropLicenceCacheModel.hsraApplicationId =
			getHsraApplicationId();

		return purposeOfPropLicenceCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<PurposeOfPropLicence, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<PurposeOfPropLicence, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PurposeOfPropLicence, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(PurposeOfPropLicence)this);

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

		private static final Function<InvocationHandler, PurposeOfPropLicence>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					PurposeOfPropLicence.class, ModelWrapper.class);

	}

	private long _purposeOfPropLicenceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _nuclearRegstLic;
	private String _nuclearBusinessPlace;
	private String _nuclearActivityMainAdd;
	private String _applicationType;
	private String _nuclearAdditionalLoc;
	private long _hsraApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<PurposeOfPropLicence, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((PurposeOfPropLicence)this);
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
			"purposeOfPropLicenceId", _purposeOfPropLicenceId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("nuclearRegstLic", _nuclearRegstLic);
		_columnOriginalValues.put(
			"nuclearBusinessPlace", _nuclearBusinessPlace);
		_columnOriginalValues.put(
			"nuclearActivityMainAdd", _nuclearActivityMainAdd);
		_columnOriginalValues.put("applicationType", _applicationType);
		_columnOriginalValues.put(
			"nuclearAdditionalLoc", _nuclearAdditionalLoc);
		_columnOriginalValues.put("hsraApplicationId", _hsraApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("purposeOfPropLicenceId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("nuclearRegstLic", 128L);

		columnBitmasks.put("nuclearBusinessPlace", 256L);

		columnBitmasks.put("nuclearActivityMainAdd", 512L);

		columnBitmasks.put("applicationType", 1024L);

		columnBitmasks.put("nuclearAdditionalLoc", 2048L);

		columnBitmasks.put("hsraApplicationId", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private PurposeOfPropLicence _escapedModel;

}