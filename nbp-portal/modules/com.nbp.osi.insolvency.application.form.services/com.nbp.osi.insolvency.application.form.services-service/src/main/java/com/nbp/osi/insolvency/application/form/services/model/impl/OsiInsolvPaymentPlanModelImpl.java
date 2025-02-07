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

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvPaymentPlan;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvPaymentPlanModel;

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
 * The base model implementation for the OsiInsolvPaymentPlan service. Represents a row in the &quot;nbp_osi_insolv_payment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OsiInsolvPaymentPlanModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiInsolvPaymentPlanImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvPaymentPlanImpl
 * @generated
 */
@JSON(strict = true)
public class OsiInsolvPaymentPlanModelImpl
	extends BaseModelImpl<OsiInsolvPaymentPlan>
	implements OsiInsolvPaymentPlanModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi insolv payment plan model instance should use the <code>OsiInsolvPaymentPlan</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_insolv_payment";

	public static final Object[][] TABLE_COLUMNS = {
		{"osiInsolvPaymentPlanId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"paymentMethod", Types.VARCHAR},
		{"amountPaid", Types.VARCHAR},
		{"paymentCurrencySelected", Types.VARCHAR},
		{"paymentMethodOther", Types.VARCHAR}, {"paymentDocId", Types.VARCHAR},
		{"osiInsolvencyId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("osiInsolvPaymentPlanId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("paymentMethod", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("amountPaid", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("paymentCurrencySelected", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("paymentMethodOther", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("paymentDocId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiInsolvencyId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_insolv_payment (osiInsolvPaymentPlanId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,paymentMethod VARCHAR(75) null,amountPaid VARCHAR(75) null,paymentCurrencySelected VARCHAR(75) null,paymentMethodOther VARCHAR(75) null,paymentDocId VARCHAR(75) null,osiInsolvencyId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_insolv_payment";

	public static final String ORDER_BY_JPQL =
		" ORDER BY osiInsolvPaymentPlan.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_insolv_payment.createDate ASC";

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

	public OsiInsolvPaymentPlanModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _osiInsolvPaymentPlanId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOsiInsolvPaymentPlanId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _osiInsolvPaymentPlanId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OsiInsolvPaymentPlan.class;
	}

	@Override
	public String getModelClassName() {
		return OsiInsolvPaymentPlan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<OsiInsolvPaymentPlan, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<OsiInsolvPaymentPlan, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiInsolvPaymentPlan, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((OsiInsolvPaymentPlan)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OsiInsolvPaymentPlan, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OsiInsolvPaymentPlan, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(OsiInsolvPaymentPlan)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OsiInsolvPaymentPlan, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OsiInsolvPaymentPlan, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<OsiInsolvPaymentPlan, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<OsiInsolvPaymentPlan, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<OsiInsolvPaymentPlan, Object>>();

			attributeGetterFunctions.put(
				"osiInsolvPaymentPlanId",
				OsiInsolvPaymentPlan::getOsiInsolvPaymentPlanId);
			attributeGetterFunctions.put(
				"groupId", OsiInsolvPaymentPlan::getGroupId);
			attributeGetterFunctions.put(
				"companyId", OsiInsolvPaymentPlan::getCompanyId);
			attributeGetterFunctions.put(
				"userId", OsiInsolvPaymentPlan::getUserId);
			attributeGetterFunctions.put(
				"userName", OsiInsolvPaymentPlan::getUserName);
			attributeGetterFunctions.put(
				"createDate", OsiInsolvPaymentPlan::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", OsiInsolvPaymentPlan::getModifiedDate);
			attributeGetterFunctions.put(
				"paymentMethod", OsiInsolvPaymentPlan::getPaymentMethod);
			attributeGetterFunctions.put(
				"amountPaid", OsiInsolvPaymentPlan::getAmountPaid);
			attributeGetterFunctions.put(
				"paymentCurrencySelected",
				OsiInsolvPaymentPlan::getPaymentCurrencySelected);
			attributeGetterFunctions.put(
				"paymentMethodOther",
				OsiInsolvPaymentPlan::getPaymentMethodOther);
			attributeGetterFunctions.put(
				"paymentDocId", OsiInsolvPaymentPlan::getPaymentDocId);
			attributeGetterFunctions.put(
				"osiInsolvencyId", OsiInsolvPaymentPlan::getOsiInsolvencyId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<OsiInsolvPaymentPlan, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<OsiInsolvPaymentPlan, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<OsiInsolvPaymentPlan, ?>>();

			attributeSetterBiConsumers.put(
				"osiInsolvPaymentPlanId",
				(BiConsumer<OsiInsolvPaymentPlan, Long>)
					OsiInsolvPaymentPlan::setOsiInsolvPaymentPlanId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<OsiInsolvPaymentPlan, Long>)
					OsiInsolvPaymentPlan::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<OsiInsolvPaymentPlan, Long>)
					OsiInsolvPaymentPlan::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<OsiInsolvPaymentPlan, Long>)
					OsiInsolvPaymentPlan::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<OsiInsolvPaymentPlan, String>)
					OsiInsolvPaymentPlan::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<OsiInsolvPaymentPlan, Date>)
					OsiInsolvPaymentPlan::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<OsiInsolvPaymentPlan, Date>)
					OsiInsolvPaymentPlan::setModifiedDate);
			attributeSetterBiConsumers.put(
				"paymentMethod",
				(BiConsumer<OsiInsolvPaymentPlan, String>)
					OsiInsolvPaymentPlan::setPaymentMethod);
			attributeSetterBiConsumers.put(
				"amountPaid",
				(BiConsumer<OsiInsolvPaymentPlan, String>)
					OsiInsolvPaymentPlan::setAmountPaid);
			attributeSetterBiConsumers.put(
				"paymentCurrencySelected",
				(BiConsumer<OsiInsolvPaymentPlan, String>)
					OsiInsolvPaymentPlan::setPaymentCurrencySelected);
			attributeSetterBiConsumers.put(
				"paymentMethodOther",
				(BiConsumer<OsiInsolvPaymentPlan, String>)
					OsiInsolvPaymentPlan::setPaymentMethodOther);
			attributeSetterBiConsumers.put(
				"paymentDocId",
				(BiConsumer<OsiInsolvPaymentPlan, String>)
					OsiInsolvPaymentPlan::setPaymentDocId);
			attributeSetterBiConsumers.put(
				"osiInsolvencyId",
				(BiConsumer<OsiInsolvPaymentPlan, Long>)
					OsiInsolvPaymentPlan::setOsiInsolvencyId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getOsiInsolvPaymentPlanId() {
		return _osiInsolvPaymentPlanId;
	}

	@Override
	public void setOsiInsolvPaymentPlanId(long osiInsolvPaymentPlanId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiInsolvPaymentPlanId = osiInsolvPaymentPlanId;
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
	public String getPaymentMethod() {
		if (_paymentMethod == null) {
			return "";
		}
		else {
			return _paymentMethod;
		}
	}

	@Override
	public void setPaymentMethod(String paymentMethod) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_paymentMethod = paymentMethod;
	}

	@JSON
	@Override
	public String getAmountPaid() {
		if (_amountPaid == null) {
			return "";
		}
		else {
			return _amountPaid;
		}
	}

	@Override
	public void setAmountPaid(String amountPaid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_amountPaid = amountPaid;
	}

	@JSON
	@Override
	public String getPaymentCurrencySelected() {
		if (_paymentCurrencySelected == null) {
			return "";
		}
		else {
			return _paymentCurrencySelected;
		}
	}

	@Override
	public void setPaymentCurrencySelected(String paymentCurrencySelected) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_paymentCurrencySelected = paymentCurrencySelected;
	}

	@JSON
	@Override
	public String getPaymentMethodOther() {
		if (_paymentMethodOther == null) {
			return "";
		}
		else {
			return _paymentMethodOther;
		}
	}

	@Override
	public void setPaymentMethodOther(String paymentMethodOther) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_paymentMethodOther = paymentMethodOther;
	}

	@JSON
	@Override
	public String getPaymentDocId() {
		if (_paymentDocId == null) {
			return "";
		}
		else {
			return _paymentDocId;
		}
	}

	@Override
	public void setPaymentDocId(String paymentDocId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_paymentDocId = paymentDocId;
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
			getCompanyId(), OsiInsolvPaymentPlan.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OsiInsolvPaymentPlan toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OsiInsolvPaymentPlan>
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
		OsiInsolvPaymentPlanImpl osiInsolvPaymentPlanImpl =
			new OsiInsolvPaymentPlanImpl();

		osiInsolvPaymentPlanImpl.setOsiInsolvPaymentPlanId(
			getOsiInsolvPaymentPlanId());
		osiInsolvPaymentPlanImpl.setGroupId(getGroupId());
		osiInsolvPaymentPlanImpl.setCompanyId(getCompanyId());
		osiInsolvPaymentPlanImpl.setUserId(getUserId());
		osiInsolvPaymentPlanImpl.setUserName(getUserName());
		osiInsolvPaymentPlanImpl.setCreateDate(getCreateDate());
		osiInsolvPaymentPlanImpl.setModifiedDate(getModifiedDate());
		osiInsolvPaymentPlanImpl.setPaymentMethod(getPaymentMethod());
		osiInsolvPaymentPlanImpl.setAmountPaid(getAmountPaid());
		osiInsolvPaymentPlanImpl.setPaymentCurrencySelected(
			getPaymentCurrencySelected());
		osiInsolvPaymentPlanImpl.setPaymentMethodOther(getPaymentMethodOther());
		osiInsolvPaymentPlanImpl.setPaymentDocId(getPaymentDocId());
		osiInsolvPaymentPlanImpl.setOsiInsolvencyId(getOsiInsolvencyId());

		osiInsolvPaymentPlanImpl.resetOriginalValues();

		return osiInsolvPaymentPlanImpl;
	}

	@Override
	public OsiInsolvPaymentPlan cloneWithOriginalValues() {
		OsiInsolvPaymentPlanImpl osiInsolvPaymentPlanImpl =
			new OsiInsolvPaymentPlanImpl();

		osiInsolvPaymentPlanImpl.setOsiInsolvPaymentPlanId(
			this.<Long>getColumnOriginalValue("osiInsolvPaymentPlanId"));
		osiInsolvPaymentPlanImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		osiInsolvPaymentPlanImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		osiInsolvPaymentPlanImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		osiInsolvPaymentPlanImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		osiInsolvPaymentPlanImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		osiInsolvPaymentPlanImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		osiInsolvPaymentPlanImpl.setPaymentMethod(
			this.<String>getColumnOriginalValue("paymentMethod"));
		osiInsolvPaymentPlanImpl.setAmountPaid(
			this.<String>getColumnOriginalValue("amountPaid"));
		osiInsolvPaymentPlanImpl.setPaymentCurrencySelected(
			this.<String>getColumnOriginalValue("paymentCurrencySelected"));
		osiInsolvPaymentPlanImpl.setPaymentMethodOther(
			this.<String>getColumnOriginalValue("paymentMethodOther"));
		osiInsolvPaymentPlanImpl.setPaymentDocId(
			this.<String>getColumnOriginalValue("paymentDocId"));
		osiInsolvPaymentPlanImpl.setOsiInsolvencyId(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));

		return osiInsolvPaymentPlanImpl;
	}

	@Override
	public int compareTo(OsiInsolvPaymentPlan osiInsolvPaymentPlan) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), osiInsolvPaymentPlan.getCreateDate());

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

		if (!(object instanceof OsiInsolvPaymentPlan)) {
			return false;
		}

		OsiInsolvPaymentPlan osiInsolvPaymentPlan =
			(OsiInsolvPaymentPlan)object;

		long primaryKey = osiInsolvPaymentPlan.getPrimaryKey();

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
	public CacheModel<OsiInsolvPaymentPlan> toCacheModel() {
		OsiInsolvPaymentPlanCacheModel osiInsolvPaymentPlanCacheModel =
			new OsiInsolvPaymentPlanCacheModel();

		osiInsolvPaymentPlanCacheModel.osiInsolvPaymentPlanId =
			getOsiInsolvPaymentPlanId();

		osiInsolvPaymentPlanCacheModel.groupId = getGroupId();

		osiInsolvPaymentPlanCacheModel.companyId = getCompanyId();

		osiInsolvPaymentPlanCacheModel.userId = getUserId();

		osiInsolvPaymentPlanCacheModel.userName = getUserName();

		String userName = osiInsolvPaymentPlanCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			osiInsolvPaymentPlanCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			osiInsolvPaymentPlanCacheModel.createDate = createDate.getTime();
		}
		else {
			osiInsolvPaymentPlanCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			osiInsolvPaymentPlanCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			osiInsolvPaymentPlanCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		osiInsolvPaymentPlanCacheModel.paymentMethod = getPaymentMethod();

		String paymentMethod = osiInsolvPaymentPlanCacheModel.paymentMethod;

		if ((paymentMethod != null) && (paymentMethod.length() == 0)) {
			osiInsolvPaymentPlanCacheModel.paymentMethod = null;
		}

		osiInsolvPaymentPlanCacheModel.amountPaid = getAmountPaid();

		String amountPaid = osiInsolvPaymentPlanCacheModel.amountPaid;

		if ((amountPaid != null) && (amountPaid.length() == 0)) {
			osiInsolvPaymentPlanCacheModel.amountPaid = null;
		}

		osiInsolvPaymentPlanCacheModel.paymentCurrencySelected =
			getPaymentCurrencySelected();

		String paymentCurrencySelected =
			osiInsolvPaymentPlanCacheModel.paymentCurrencySelected;

		if ((paymentCurrencySelected != null) &&
			(paymentCurrencySelected.length() == 0)) {

			osiInsolvPaymentPlanCacheModel.paymentCurrencySelected = null;
		}

		osiInsolvPaymentPlanCacheModel.paymentMethodOther =
			getPaymentMethodOther();

		String paymentMethodOther =
			osiInsolvPaymentPlanCacheModel.paymentMethodOther;

		if ((paymentMethodOther != null) &&
			(paymentMethodOther.length() == 0)) {

			osiInsolvPaymentPlanCacheModel.paymentMethodOther = null;
		}

		osiInsolvPaymentPlanCacheModel.paymentDocId = getPaymentDocId();

		String paymentDocId = osiInsolvPaymentPlanCacheModel.paymentDocId;

		if ((paymentDocId != null) && (paymentDocId.length() == 0)) {
			osiInsolvPaymentPlanCacheModel.paymentDocId = null;
		}

		osiInsolvPaymentPlanCacheModel.osiInsolvencyId = getOsiInsolvencyId();

		return osiInsolvPaymentPlanCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OsiInsolvPaymentPlan, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<OsiInsolvPaymentPlan, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiInsolvPaymentPlan, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(OsiInsolvPaymentPlan)this);

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

		private static final Function<InvocationHandler, OsiInsolvPaymentPlan>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					OsiInsolvPaymentPlan.class, ModelWrapper.class);

	}

	private long _osiInsolvPaymentPlanId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _paymentMethod;
	private String _amountPaid;
	private String _paymentCurrencySelected;
	private String _paymentMethodOther;
	private String _paymentDocId;
	private long _osiInsolvencyId;

	public <T> T getColumnValue(String columnName) {
		Function<OsiInsolvPaymentPlan, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((OsiInsolvPaymentPlan)this);
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
			"osiInsolvPaymentPlanId", _osiInsolvPaymentPlanId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("paymentMethod", _paymentMethod);
		_columnOriginalValues.put("amountPaid", _amountPaid);
		_columnOriginalValues.put(
			"paymentCurrencySelected", _paymentCurrencySelected);
		_columnOriginalValues.put("paymentMethodOther", _paymentMethodOther);
		_columnOriginalValues.put("paymentDocId", _paymentDocId);
		_columnOriginalValues.put("osiInsolvencyId", _osiInsolvencyId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("osiInsolvPaymentPlanId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("paymentMethod", 128L);

		columnBitmasks.put("amountPaid", 256L);

		columnBitmasks.put("paymentCurrencySelected", 512L);

		columnBitmasks.put("paymentMethodOther", 1024L);

		columnBitmasks.put("paymentDocId", 2048L);

		columnBitmasks.put("osiInsolvencyId", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private OsiInsolvPaymentPlan _escapedModel;

}