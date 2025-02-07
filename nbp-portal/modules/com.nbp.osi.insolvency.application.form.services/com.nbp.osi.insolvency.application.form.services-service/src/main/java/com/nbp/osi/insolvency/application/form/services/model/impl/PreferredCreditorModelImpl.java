/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model.impl;

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

import com.nbp.osi.insolvency.application.form.services.model.PreferredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.PreferredCreditorModel;

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
 * The base model implementation for the PreferredCreditor service. Represents a row in the &quot;nbp_osi_preferred_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PreferredCreditorModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PreferredCreditorImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PreferredCreditorImpl
 * @generated
 */
@JSON(strict = true)
public class PreferredCreditorModelImpl
	extends BaseModelImpl<PreferredCreditor> implements PreferredCreditorModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a preferred creditor model instance should use the <code>PreferredCreditor</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_preferred_detail";

	public static final Object[][] TABLE_COLUMNS = {
		{"preferredCreditorId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"preferredCreditorName", Types.VARCHAR},
		{"preferredCreditorLiability", Types.VARCHAR},
		{"preferredCreditorAmount", Types.VARCHAR},
		{"preferredCreditorPayment", Types.VARCHAR},
		{"preferredCreditorCounter", Types.VARCHAR},
		{"preferredCreditorDate", Types.TIMESTAMP},
		{"osiInsolvencyId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("preferredCreditorId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("preferredCreditorName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("preferredCreditorLiability", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("preferredCreditorAmount", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("preferredCreditorPayment", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("preferredCreditorCounter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("preferredCreditorDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("osiInsolvencyId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_preferred_detail (preferredCreditorId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,preferredCreditorName VARCHAR(75) null,preferredCreditorLiability VARCHAR(75) null,preferredCreditorAmount VARCHAR(75) null,preferredCreditorPayment VARCHAR(75) null,preferredCreditorCounter VARCHAR(75) null,preferredCreditorDate DATE null,osiInsolvencyId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_preferred_detail";

	public static final String ORDER_BY_JPQL =
		" ORDER BY preferredCreditor.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_preferred_detail.createDate ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long OSIINSOLVENCYID_COLUMN_BITMASK = 1L;

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

	public PreferredCreditorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _preferredCreditorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPreferredCreditorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _preferredCreditorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PreferredCreditor.class;
	}

	@Override
	public String getModelClassName() {
		return PreferredCreditor.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<PreferredCreditor, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<PreferredCreditor, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PreferredCreditor, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((PreferredCreditor)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<PreferredCreditor, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<PreferredCreditor, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(PreferredCreditor)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<PreferredCreditor, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<PreferredCreditor, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<PreferredCreditor, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<PreferredCreditor, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<PreferredCreditor, Object>>();

			attributeGetterFunctions.put(
				"preferredCreditorId",
				PreferredCreditor::getPreferredCreditorId);
			attributeGetterFunctions.put(
				"groupId", PreferredCreditor::getGroupId);
			attributeGetterFunctions.put(
				"companyId", PreferredCreditor::getCompanyId);
			attributeGetterFunctions.put(
				"userId", PreferredCreditor::getUserId);
			attributeGetterFunctions.put(
				"userName", PreferredCreditor::getUserName);
			attributeGetterFunctions.put(
				"createDate", PreferredCreditor::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", PreferredCreditor::getModifiedDate);
			attributeGetterFunctions.put(
				"preferredCreditorName",
				PreferredCreditor::getPreferredCreditorName);
			attributeGetterFunctions.put(
				"preferredCreditorLiability",
				PreferredCreditor::getPreferredCreditorLiability);
			attributeGetterFunctions.put(
				"preferredCreditorAmount",
				PreferredCreditor::getPreferredCreditorAmount);
			attributeGetterFunctions.put(
				"preferredCreditorPayment",
				PreferredCreditor::getPreferredCreditorPayment);
			attributeGetterFunctions.put(
				"preferredCreditorCounter",
				PreferredCreditor::getPreferredCreditorCounter);
			attributeGetterFunctions.put(
				"preferredCreditorDate",
				PreferredCreditor::getPreferredCreditorDate);
			attributeGetterFunctions.put(
				"osiInsolvencyId", PreferredCreditor::getOsiInsolvencyId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<PreferredCreditor, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<PreferredCreditor, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<PreferredCreditor, ?>>();

			attributeSetterBiConsumers.put(
				"preferredCreditorId",
				(BiConsumer<PreferredCreditor, Long>)
					PreferredCreditor::setPreferredCreditorId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<PreferredCreditor, Long>)
					PreferredCreditor::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<PreferredCreditor, Long>)
					PreferredCreditor::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<PreferredCreditor, Long>)
					PreferredCreditor::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<PreferredCreditor, String>)
					PreferredCreditor::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<PreferredCreditor, Date>)
					PreferredCreditor::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<PreferredCreditor, Date>)
					PreferredCreditor::setModifiedDate);
			attributeSetterBiConsumers.put(
				"preferredCreditorName",
				(BiConsumer<PreferredCreditor, String>)
					PreferredCreditor::setPreferredCreditorName);
			attributeSetterBiConsumers.put(
				"preferredCreditorLiability",
				(BiConsumer<PreferredCreditor, String>)
					PreferredCreditor::setPreferredCreditorLiability);
			attributeSetterBiConsumers.put(
				"preferredCreditorAmount",
				(BiConsumer<PreferredCreditor, String>)
					PreferredCreditor::setPreferredCreditorAmount);
			attributeSetterBiConsumers.put(
				"preferredCreditorPayment",
				(BiConsumer<PreferredCreditor, String>)
					PreferredCreditor::setPreferredCreditorPayment);
			attributeSetterBiConsumers.put(
				"preferredCreditorCounter",
				(BiConsumer<PreferredCreditor, String>)
					PreferredCreditor::setPreferredCreditorCounter);
			attributeSetterBiConsumers.put(
				"preferredCreditorDate",
				(BiConsumer<PreferredCreditor, Date>)
					PreferredCreditor::setPreferredCreditorDate);
			attributeSetterBiConsumers.put(
				"osiInsolvencyId",
				(BiConsumer<PreferredCreditor, Long>)
					PreferredCreditor::setOsiInsolvencyId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getPreferredCreditorId() {
		return _preferredCreditorId;
	}

	@Override
	public void setPreferredCreditorId(long preferredCreditorId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_preferredCreditorId = preferredCreditorId;
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
	public String getPreferredCreditorName() {
		if (_preferredCreditorName == null) {
			return "";
		}
		else {
			return _preferredCreditorName;
		}
	}

	@Override
	public void setPreferredCreditorName(String preferredCreditorName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_preferredCreditorName = preferredCreditorName;
	}

	@JSON
	@Override
	public String getPreferredCreditorLiability() {
		if (_preferredCreditorLiability == null) {
			return "";
		}
		else {
			return _preferredCreditorLiability;
		}
	}

	@Override
	public void setPreferredCreditorLiability(
		String preferredCreditorLiability) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_preferredCreditorLiability = preferredCreditorLiability;
	}

	@JSON
	@Override
	public String getPreferredCreditorAmount() {
		if (_preferredCreditorAmount == null) {
			return "";
		}
		else {
			return _preferredCreditorAmount;
		}
	}

	@Override
	public void setPreferredCreditorAmount(String preferredCreditorAmount) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_preferredCreditorAmount = preferredCreditorAmount;
	}

	@JSON
	@Override
	public String getPreferredCreditorPayment() {
		if (_preferredCreditorPayment == null) {
			return "";
		}
		else {
			return _preferredCreditorPayment;
		}
	}

	@Override
	public void setPreferredCreditorPayment(String preferredCreditorPayment) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_preferredCreditorPayment = preferredCreditorPayment;
	}

	@JSON
	@Override
	public String getPreferredCreditorCounter() {
		if (_preferredCreditorCounter == null) {
			return "";
		}
		else {
			return _preferredCreditorCounter;
		}
	}

	@Override
	public void setPreferredCreditorCounter(String preferredCreditorCounter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_preferredCreditorCounter = preferredCreditorCounter;
	}

	@JSON
	@Override
	public Date getPreferredCreditorDate() {
		return _preferredCreditorDate;
	}

	@Override
	public void setPreferredCreditorDate(Date preferredCreditorDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_preferredCreditorDate = preferredCreditorDate;
	}

	@JSON
	@Override
	public long getOsiInsolvencyId() {
		return _osiInsolvencyId;
	}

	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiInsolvencyId = osiInsolvencyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalOsiInsolvencyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));
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
			getCompanyId(), PreferredCreditor.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PreferredCreditor toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, PreferredCreditor>
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
		PreferredCreditorImpl preferredCreditorImpl =
			new PreferredCreditorImpl();

		preferredCreditorImpl.setPreferredCreditorId(getPreferredCreditorId());
		preferredCreditorImpl.setGroupId(getGroupId());
		preferredCreditorImpl.setCompanyId(getCompanyId());
		preferredCreditorImpl.setUserId(getUserId());
		preferredCreditorImpl.setUserName(getUserName());
		preferredCreditorImpl.setCreateDate(getCreateDate());
		preferredCreditorImpl.setModifiedDate(getModifiedDate());
		preferredCreditorImpl.setPreferredCreditorName(
			getPreferredCreditorName());
		preferredCreditorImpl.setPreferredCreditorLiability(
			getPreferredCreditorLiability());
		preferredCreditorImpl.setPreferredCreditorAmount(
			getPreferredCreditorAmount());
		preferredCreditorImpl.setPreferredCreditorPayment(
			getPreferredCreditorPayment());
		preferredCreditorImpl.setPreferredCreditorCounter(
			getPreferredCreditorCounter());
		preferredCreditorImpl.setPreferredCreditorDate(
			getPreferredCreditorDate());
		preferredCreditorImpl.setOsiInsolvencyId(getOsiInsolvencyId());

		preferredCreditorImpl.resetOriginalValues();

		return preferredCreditorImpl;
	}

	@Override
	public PreferredCreditor cloneWithOriginalValues() {
		PreferredCreditorImpl preferredCreditorImpl =
			new PreferredCreditorImpl();

		preferredCreditorImpl.setPreferredCreditorId(
			this.<Long>getColumnOriginalValue("preferredCreditorId"));
		preferredCreditorImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		preferredCreditorImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		preferredCreditorImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		preferredCreditorImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		preferredCreditorImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		preferredCreditorImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		preferredCreditorImpl.setPreferredCreditorName(
			this.<String>getColumnOriginalValue("preferredCreditorName"));
		preferredCreditorImpl.setPreferredCreditorLiability(
			this.<String>getColumnOriginalValue("preferredCreditorLiability"));
		preferredCreditorImpl.setPreferredCreditorAmount(
			this.<String>getColumnOriginalValue("preferredCreditorAmount"));
		preferredCreditorImpl.setPreferredCreditorPayment(
			this.<String>getColumnOriginalValue("preferredCreditorPayment"));
		preferredCreditorImpl.setPreferredCreditorCounter(
			this.<String>getColumnOriginalValue("preferredCreditorCounter"));
		preferredCreditorImpl.setPreferredCreditorDate(
			this.<Date>getColumnOriginalValue("preferredCreditorDate"));
		preferredCreditorImpl.setOsiInsolvencyId(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));

		return preferredCreditorImpl;
	}

	@Override
	public int compareTo(PreferredCreditor preferredCreditor) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), preferredCreditor.getCreateDate());

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

		if (!(object instanceof PreferredCreditor)) {
			return false;
		}

		PreferredCreditor preferredCreditor = (PreferredCreditor)object;

		long primaryKey = preferredCreditor.getPrimaryKey();

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
	public CacheModel<PreferredCreditor> toCacheModel() {
		PreferredCreditorCacheModel preferredCreditorCacheModel =
			new PreferredCreditorCacheModel();

		preferredCreditorCacheModel.preferredCreditorId =
			getPreferredCreditorId();

		preferredCreditorCacheModel.groupId = getGroupId();

		preferredCreditorCacheModel.companyId = getCompanyId();

		preferredCreditorCacheModel.userId = getUserId();

		preferredCreditorCacheModel.userName = getUserName();

		String userName = preferredCreditorCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			preferredCreditorCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			preferredCreditorCacheModel.createDate = createDate.getTime();
		}
		else {
			preferredCreditorCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			preferredCreditorCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			preferredCreditorCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		preferredCreditorCacheModel.preferredCreditorName =
			getPreferredCreditorName();

		String preferredCreditorName =
			preferredCreditorCacheModel.preferredCreditorName;

		if ((preferredCreditorName != null) &&
			(preferredCreditorName.length() == 0)) {

			preferredCreditorCacheModel.preferredCreditorName = null;
		}

		preferredCreditorCacheModel.preferredCreditorLiability =
			getPreferredCreditorLiability();

		String preferredCreditorLiability =
			preferredCreditorCacheModel.preferredCreditorLiability;

		if ((preferredCreditorLiability != null) &&
			(preferredCreditorLiability.length() == 0)) {

			preferredCreditorCacheModel.preferredCreditorLiability = null;
		}

		preferredCreditorCacheModel.preferredCreditorAmount =
			getPreferredCreditorAmount();

		String preferredCreditorAmount =
			preferredCreditorCacheModel.preferredCreditorAmount;

		if ((preferredCreditorAmount != null) &&
			(preferredCreditorAmount.length() == 0)) {

			preferredCreditorCacheModel.preferredCreditorAmount = null;
		}

		preferredCreditorCacheModel.preferredCreditorPayment =
			getPreferredCreditorPayment();

		String preferredCreditorPayment =
			preferredCreditorCacheModel.preferredCreditorPayment;

		if ((preferredCreditorPayment != null) &&
			(preferredCreditorPayment.length() == 0)) {

			preferredCreditorCacheModel.preferredCreditorPayment = null;
		}

		preferredCreditorCacheModel.preferredCreditorCounter =
			getPreferredCreditorCounter();

		String preferredCreditorCounter =
			preferredCreditorCacheModel.preferredCreditorCounter;

		if ((preferredCreditorCounter != null) &&
			(preferredCreditorCounter.length() == 0)) {

			preferredCreditorCacheModel.preferredCreditorCounter = null;
		}

		Date preferredCreditorDate = getPreferredCreditorDate();

		if (preferredCreditorDate != null) {
			preferredCreditorCacheModel.preferredCreditorDate =
				preferredCreditorDate.getTime();
		}
		else {
			preferredCreditorCacheModel.preferredCreditorDate = Long.MIN_VALUE;
		}

		preferredCreditorCacheModel.osiInsolvencyId = getOsiInsolvencyId();

		return preferredCreditorCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<PreferredCreditor, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<PreferredCreditor, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PreferredCreditor, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(PreferredCreditor)this);

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

		private static final Function<InvocationHandler, PreferredCreditor>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					PreferredCreditor.class, ModelWrapper.class);

	}

	private long _preferredCreditorId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _preferredCreditorName;
	private String _preferredCreditorLiability;
	private String _preferredCreditorAmount;
	private String _preferredCreditorPayment;
	private String _preferredCreditorCounter;
	private Date _preferredCreditorDate;
	private long _osiInsolvencyId;

	public <T> T getColumnValue(String columnName) {
		Function<PreferredCreditor, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((PreferredCreditor)this);
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

		_columnOriginalValues.put("preferredCreditorId", _preferredCreditorId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"preferredCreditorName", _preferredCreditorName);
		_columnOriginalValues.put(
			"preferredCreditorLiability", _preferredCreditorLiability);
		_columnOriginalValues.put(
			"preferredCreditorAmount", _preferredCreditorAmount);
		_columnOriginalValues.put(
			"preferredCreditorPayment", _preferredCreditorPayment);
		_columnOriginalValues.put(
			"preferredCreditorCounter", _preferredCreditorCounter);
		_columnOriginalValues.put(
			"preferredCreditorDate", _preferredCreditorDate);
		_columnOriginalValues.put("osiInsolvencyId", _osiInsolvencyId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("preferredCreditorId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("preferredCreditorName", 128L);

		columnBitmasks.put("preferredCreditorLiability", 256L);

		columnBitmasks.put("preferredCreditorAmount", 512L);

		columnBitmasks.put("preferredCreditorPayment", 1024L);

		columnBitmasks.put("preferredCreditorCounter", 2048L);

		columnBitmasks.put("preferredCreditorDate", 4096L);

		columnBitmasks.put("osiInsolvencyId", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private PreferredCreditor _escapedModel;

}