/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model.impl;

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

import com.nbp.acquire.application.form.service.model.AcquirePaymentPlan;
import com.nbp.acquire.application.form.service.model.AcquirePaymentPlanModel;

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
 * The base model implementation for the AcquirePaymentPlan service. Represents a row in the &quot;nbp_acquire_payment_plan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AcquirePaymentPlanModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AcquirePaymentPlanImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlanImpl
 * @generated
 */
@JSON(strict = true)
public class AcquirePaymentPlanModelImpl
	extends BaseModelImpl<AcquirePaymentPlan>
	implements AcquirePaymentPlanModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a acquire payment plan model instance should use the <code>AcquirePaymentPlan</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_acquire_payment_plan";

	public static final Object[][] TABLE_COLUMNS = {
		{"acquirePaymentPlanId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"paymentMethod", Types.VARCHAR},
		{"amountPaid", Types.VARCHAR},
		{"paymentCurrencySelected", Types.VARCHAR},
		{"paymentMethodOther", Types.VARCHAR}, {"paymentDocId", Types.VARCHAR},
		{"acquireApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("acquirePaymentPlanId", Types.BIGINT);
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
		TABLE_COLUMNS_MAP.put("acquireApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_acquire_payment_plan (acquirePaymentPlanId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,paymentMethod VARCHAR(75) null,amountPaid VARCHAR(75) null,paymentCurrencySelected VARCHAR(75) null,paymentMethodOther VARCHAR(75) null,paymentDocId VARCHAR(75) null,acquireApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_acquire_payment_plan";

	public static final String ORDER_BY_JPQL =
		" ORDER BY acquirePaymentPlan.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_acquire_payment_plan.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ACQUIREAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public AcquirePaymentPlanModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _acquirePaymentPlanId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAcquirePaymentPlanId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _acquirePaymentPlanId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AcquirePaymentPlan.class;
	}

	@Override
	public String getModelClassName() {
		return AcquirePaymentPlan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AcquirePaymentPlan, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AcquirePaymentPlan, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AcquirePaymentPlan, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AcquirePaymentPlan)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AcquirePaymentPlan, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AcquirePaymentPlan, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AcquirePaymentPlan)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AcquirePaymentPlan, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AcquirePaymentPlan, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<AcquirePaymentPlan, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<AcquirePaymentPlan, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AcquirePaymentPlan, Object>>();

			attributeGetterFunctions.put(
				"acquirePaymentPlanId",
				AcquirePaymentPlan::getAcquirePaymentPlanId);
			attributeGetterFunctions.put(
				"groupId", AcquirePaymentPlan::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AcquirePaymentPlan::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AcquirePaymentPlan::getUserId);
			attributeGetterFunctions.put(
				"userName", AcquirePaymentPlan::getUserName);
			attributeGetterFunctions.put(
				"createDate", AcquirePaymentPlan::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AcquirePaymentPlan::getModifiedDate);
			attributeGetterFunctions.put(
				"paymentMethod", AcquirePaymentPlan::getPaymentMethod);
			attributeGetterFunctions.put(
				"amountPaid", AcquirePaymentPlan::getAmountPaid);
			attributeGetterFunctions.put(
				"paymentCurrencySelected",
				AcquirePaymentPlan::getPaymentCurrencySelected);
			attributeGetterFunctions.put(
				"paymentMethodOther",
				AcquirePaymentPlan::getPaymentMethodOther);
			attributeGetterFunctions.put(
				"paymentDocId", AcquirePaymentPlan::getPaymentDocId);
			attributeGetterFunctions.put(
				"acquireApplicationId",
				AcquirePaymentPlan::getAcquireApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<AcquirePaymentPlan, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AcquirePaymentPlan, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AcquirePaymentPlan, ?>>();

			attributeSetterBiConsumers.put(
				"acquirePaymentPlanId",
				(BiConsumer<AcquirePaymentPlan, Long>)
					AcquirePaymentPlan::setAcquirePaymentPlanId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AcquirePaymentPlan, Long>)
					AcquirePaymentPlan::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AcquirePaymentPlan, Long>)
					AcquirePaymentPlan::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AcquirePaymentPlan, Long>)
					AcquirePaymentPlan::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AcquirePaymentPlan, String>)
					AcquirePaymentPlan::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AcquirePaymentPlan, Date>)
					AcquirePaymentPlan::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AcquirePaymentPlan, Date>)
					AcquirePaymentPlan::setModifiedDate);
			attributeSetterBiConsumers.put(
				"paymentMethod",
				(BiConsumer<AcquirePaymentPlan, String>)
					AcquirePaymentPlan::setPaymentMethod);
			attributeSetterBiConsumers.put(
				"amountPaid",
				(BiConsumer<AcquirePaymentPlan, String>)
					AcquirePaymentPlan::setAmountPaid);
			attributeSetterBiConsumers.put(
				"paymentCurrencySelected",
				(BiConsumer<AcquirePaymentPlan, String>)
					AcquirePaymentPlan::setPaymentCurrencySelected);
			attributeSetterBiConsumers.put(
				"paymentMethodOther",
				(BiConsumer<AcquirePaymentPlan, String>)
					AcquirePaymentPlan::setPaymentMethodOther);
			attributeSetterBiConsumers.put(
				"paymentDocId",
				(BiConsumer<AcquirePaymentPlan, String>)
					AcquirePaymentPlan::setPaymentDocId);
			attributeSetterBiConsumers.put(
				"acquireApplicationId",
				(BiConsumer<AcquirePaymentPlan, Long>)
					AcquirePaymentPlan::setAcquireApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAcquirePaymentPlanId() {
		return _acquirePaymentPlanId;
	}

	@Override
	public void setAcquirePaymentPlanId(long acquirePaymentPlanId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_acquirePaymentPlanId = acquirePaymentPlanId;
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
	public long getAcquireApplicationId() {
		return _acquireApplicationId;
	}

	@Override
	public void setAcquireApplicationId(long acquireApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_acquireApplicationId = acquireApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalAcquireApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("acquireApplicationId"));
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
			getCompanyId(), AcquirePaymentPlan.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AcquirePaymentPlan toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AcquirePaymentPlan>
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
		AcquirePaymentPlanImpl acquirePaymentPlanImpl =
			new AcquirePaymentPlanImpl();

		acquirePaymentPlanImpl.setAcquirePaymentPlanId(
			getAcquirePaymentPlanId());
		acquirePaymentPlanImpl.setGroupId(getGroupId());
		acquirePaymentPlanImpl.setCompanyId(getCompanyId());
		acquirePaymentPlanImpl.setUserId(getUserId());
		acquirePaymentPlanImpl.setUserName(getUserName());
		acquirePaymentPlanImpl.setCreateDate(getCreateDate());
		acquirePaymentPlanImpl.setModifiedDate(getModifiedDate());
		acquirePaymentPlanImpl.setPaymentMethod(getPaymentMethod());
		acquirePaymentPlanImpl.setAmountPaid(getAmountPaid());
		acquirePaymentPlanImpl.setPaymentCurrencySelected(
			getPaymentCurrencySelected());
		acquirePaymentPlanImpl.setPaymentMethodOther(getPaymentMethodOther());
		acquirePaymentPlanImpl.setPaymentDocId(getPaymentDocId());
		acquirePaymentPlanImpl.setAcquireApplicationId(
			getAcquireApplicationId());

		acquirePaymentPlanImpl.resetOriginalValues();

		return acquirePaymentPlanImpl;
	}

	@Override
	public AcquirePaymentPlan cloneWithOriginalValues() {
		AcquirePaymentPlanImpl acquirePaymentPlanImpl =
			new AcquirePaymentPlanImpl();

		acquirePaymentPlanImpl.setAcquirePaymentPlanId(
			this.<Long>getColumnOriginalValue("acquirePaymentPlanId"));
		acquirePaymentPlanImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		acquirePaymentPlanImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		acquirePaymentPlanImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		acquirePaymentPlanImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		acquirePaymentPlanImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		acquirePaymentPlanImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		acquirePaymentPlanImpl.setPaymentMethod(
			this.<String>getColumnOriginalValue("paymentMethod"));
		acquirePaymentPlanImpl.setAmountPaid(
			this.<String>getColumnOriginalValue("amountPaid"));
		acquirePaymentPlanImpl.setPaymentCurrencySelected(
			this.<String>getColumnOriginalValue("paymentCurrencySelected"));
		acquirePaymentPlanImpl.setPaymentMethodOther(
			this.<String>getColumnOriginalValue("paymentMethodOther"));
		acquirePaymentPlanImpl.setPaymentDocId(
			this.<String>getColumnOriginalValue("paymentDocId"));
		acquirePaymentPlanImpl.setAcquireApplicationId(
			this.<Long>getColumnOriginalValue("acquireApplicationId"));

		return acquirePaymentPlanImpl;
	}

	@Override
	public int compareTo(AcquirePaymentPlan acquirePaymentPlan) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), acquirePaymentPlan.getCreateDate());

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

		if (!(object instanceof AcquirePaymentPlan)) {
			return false;
		}

		AcquirePaymentPlan acquirePaymentPlan = (AcquirePaymentPlan)object;

		long primaryKey = acquirePaymentPlan.getPrimaryKey();

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
	public CacheModel<AcquirePaymentPlan> toCacheModel() {
		AcquirePaymentPlanCacheModel acquirePaymentPlanCacheModel =
			new AcquirePaymentPlanCacheModel();

		acquirePaymentPlanCacheModel.acquirePaymentPlanId =
			getAcquirePaymentPlanId();

		acquirePaymentPlanCacheModel.groupId = getGroupId();

		acquirePaymentPlanCacheModel.companyId = getCompanyId();

		acquirePaymentPlanCacheModel.userId = getUserId();

		acquirePaymentPlanCacheModel.userName = getUserName();

		String userName = acquirePaymentPlanCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			acquirePaymentPlanCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			acquirePaymentPlanCacheModel.createDate = createDate.getTime();
		}
		else {
			acquirePaymentPlanCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			acquirePaymentPlanCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			acquirePaymentPlanCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		acquirePaymentPlanCacheModel.paymentMethod = getPaymentMethod();

		String paymentMethod = acquirePaymentPlanCacheModel.paymentMethod;

		if ((paymentMethod != null) && (paymentMethod.length() == 0)) {
			acquirePaymentPlanCacheModel.paymentMethod = null;
		}

		acquirePaymentPlanCacheModel.amountPaid = getAmountPaid();

		String amountPaid = acquirePaymentPlanCacheModel.amountPaid;

		if ((amountPaid != null) && (amountPaid.length() == 0)) {
			acquirePaymentPlanCacheModel.amountPaid = null;
		}

		acquirePaymentPlanCacheModel.paymentCurrencySelected =
			getPaymentCurrencySelected();

		String paymentCurrencySelected =
			acquirePaymentPlanCacheModel.paymentCurrencySelected;

		if ((paymentCurrencySelected != null) &&
			(paymentCurrencySelected.length() == 0)) {

			acquirePaymentPlanCacheModel.paymentCurrencySelected = null;
		}

		acquirePaymentPlanCacheModel.paymentMethodOther =
			getPaymentMethodOther();

		String paymentMethodOther =
			acquirePaymentPlanCacheModel.paymentMethodOther;

		if ((paymentMethodOther != null) &&
			(paymentMethodOther.length() == 0)) {

			acquirePaymentPlanCacheModel.paymentMethodOther = null;
		}

		acquirePaymentPlanCacheModel.paymentDocId = getPaymentDocId();

		String paymentDocId = acquirePaymentPlanCacheModel.paymentDocId;

		if ((paymentDocId != null) && (paymentDocId.length() == 0)) {
			acquirePaymentPlanCacheModel.paymentDocId = null;
		}

		acquirePaymentPlanCacheModel.acquireApplicationId =
			getAcquireApplicationId();

		return acquirePaymentPlanCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AcquirePaymentPlan, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AcquirePaymentPlan, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AcquirePaymentPlan, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AcquirePaymentPlan)this);

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

		private static final Function<InvocationHandler, AcquirePaymentPlan>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					AcquirePaymentPlan.class, ModelWrapper.class);

	}

	private long _acquirePaymentPlanId;
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
	private long _acquireApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<AcquirePaymentPlan, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AcquirePaymentPlan)this);
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
			"acquirePaymentPlanId", _acquirePaymentPlanId);
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
		_columnOriginalValues.put(
			"acquireApplicationId", _acquireApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("acquirePaymentPlanId", 1L);

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

		columnBitmasks.put("acquireApplicationId", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AcquirePaymentPlan _escapedModel;

}