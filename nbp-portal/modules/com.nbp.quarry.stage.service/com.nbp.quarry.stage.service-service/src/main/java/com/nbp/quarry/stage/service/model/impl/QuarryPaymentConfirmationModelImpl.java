/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.model.impl;

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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation;
import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmationModel;

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
 * The base model implementation for the QuarryPaymentConfirmation service. Represents a row in the &quot;nbp_quarry_payment_confirm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>QuarryPaymentConfirmationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuarryPaymentConfirmationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryPaymentConfirmationImpl
 * @generated
 */
@JSON(strict = true)
public class QuarryPaymentConfirmationModelImpl
	extends BaseModelImpl<QuarryPaymentConfirmation>
	implements QuarryPaymentConfirmationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a quarry payment confirmation model instance should use the <code>QuarryPaymentConfirmation</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_quarry_payment_confirm";

	public static final Object[][] TABLE_COLUMNS = {
		{"quarryPaymentConfirmationId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"caseId", Types.VARCHAR}, {"dateReceived", Types.TIMESTAMP},
		{"amountReceived", Types.VARCHAR}, {"amountDue", Types.VARCHAR},
		{"receiptNumber", Types.VARCHAR}, {"comment_", Types.VARCHAR},
		{"amountOutstanding", Types.VARCHAR}, {"dueDate", Types.TIMESTAMP},
		{"status", Types.VARCHAR}, {"docFileEntry", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("quarryPaymentConfirmationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateReceived", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("amountReceived", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("amountDue", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("receiptNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comment_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("amountOutstanding", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dueDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("docFileEntry", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_quarry_payment_confirm (quarryPaymentConfirmationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,caseId VARCHAR(75) null,dateReceived DATE null,amountReceived VARCHAR(75) null,amountDue VARCHAR(75) null,receiptNumber VARCHAR(75) null,comment_ VARCHAR(75) null,amountOutstanding VARCHAR(75) null,dueDate DATE null,status VARCHAR(75) null,docFileEntry LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_quarry_payment_confirm";

	public static final String ORDER_BY_JPQL =
		" ORDER BY quarryPaymentConfirmation.quarryPaymentConfirmationId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_quarry_payment_confirm.quarryPaymentConfirmationId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CASEID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long QUARRYPAYMENTCONFIRMATIONID_COLUMN_BITMASK = 2L;

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

	public QuarryPaymentConfirmationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _quarryPaymentConfirmationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setQuarryPaymentConfirmationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _quarryPaymentConfirmationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QuarryPaymentConfirmation.class;
	}

	@Override
	public String getModelClassName() {
		return QuarryPaymentConfirmation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<QuarryPaymentConfirmation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<QuarryPaymentConfirmation, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuarryPaymentConfirmation, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((QuarryPaymentConfirmation)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<QuarryPaymentConfirmation, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<QuarryPaymentConfirmation, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(QuarryPaymentConfirmation)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<QuarryPaymentConfirmation, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<QuarryPaymentConfirmation, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<QuarryPaymentConfirmation, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<QuarryPaymentConfirmation, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<QuarryPaymentConfirmation, Object>>();

			attributeGetterFunctions.put(
				"quarryPaymentConfirmationId",
				QuarryPaymentConfirmation::getQuarryPaymentConfirmationId);
			attributeGetterFunctions.put(
				"groupId", QuarryPaymentConfirmation::getGroupId);
			attributeGetterFunctions.put(
				"companyId", QuarryPaymentConfirmation::getCompanyId);
			attributeGetterFunctions.put(
				"userId", QuarryPaymentConfirmation::getUserId);
			attributeGetterFunctions.put(
				"userName", QuarryPaymentConfirmation::getUserName);
			attributeGetterFunctions.put(
				"createDate", QuarryPaymentConfirmation::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", QuarryPaymentConfirmation::getModifiedDate);
			attributeGetterFunctions.put(
				"caseId", QuarryPaymentConfirmation::getCaseId);
			attributeGetterFunctions.put(
				"dateReceived", QuarryPaymentConfirmation::getDateReceived);
			attributeGetterFunctions.put(
				"amountReceived", QuarryPaymentConfirmation::getAmountReceived);
			attributeGetterFunctions.put(
				"amountDue", QuarryPaymentConfirmation::getAmountDue);
			attributeGetterFunctions.put(
				"receiptNumber", QuarryPaymentConfirmation::getReceiptNumber);
			attributeGetterFunctions.put(
				"comment", QuarryPaymentConfirmation::getComment);
			attributeGetterFunctions.put(
				"amountOutstanding",
				QuarryPaymentConfirmation::getAmountOutstanding);
			attributeGetterFunctions.put(
				"dueDate", QuarryPaymentConfirmation::getDueDate);
			attributeGetterFunctions.put(
				"status", QuarryPaymentConfirmation::getStatus);
			attributeGetterFunctions.put(
				"docFileEntry", QuarryPaymentConfirmation::getDocFileEntry);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<QuarryPaymentConfirmation, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<QuarryPaymentConfirmation, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<QuarryPaymentConfirmation, ?>>();

			attributeSetterBiConsumers.put(
				"quarryPaymentConfirmationId",
				(BiConsumer<QuarryPaymentConfirmation, Long>)
					QuarryPaymentConfirmation::setQuarryPaymentConfirmationId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<QuarryPaymentConfirmation, Long>)
					QuarryPaymentConfirmation::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<QuarryPaymentConfirmation, Long>)
					QuarryPaymentConfirmation::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<QuarryPaymentConfirmation, Long>)
					QuarryPaymentConfirmation::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<QuarryPaymentConfirmation, String>)
					QuarryPaymentConfirmation::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<QuarryPaymentConfirmation, Date>)
					QuarryPaymentConfirmation::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<QuarryPaymentConfirmation, Date>)
					QuarryPaymentConfirmation::setModifiedDate);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<QuarryPaymentConfirmation, String>)
					QuarryPaymentConfirmation::setCaseId);
			attributeSetterBiConsumers.put(
				"dateReceived",
				(BiConsumer<QuarryPaymentConfirmation, Date>)
					QuarryPaymentConfirmation::setDateReceived);
			attributeSetterBiConsumers.put(
				"amountReceived",
				(BiConsumer<QuarryPaymentConfirmation, String>)
					QuarryPaymentConfirmation::setAmountReceived);
			attributeSetterBiConsumers.put(
				"amountDue",
				(BiConsumer<QuarryPaymentConfirmation, String>)
					QuarryPaymentConfirmation::setAmountDue);
			attributeSetterBiConsumers.put(
				"receiptNumber",
				(BiConsumer<QuarryPaymentConfirmation, String>)
					QuarryPaymentConfirmation::setReceiptNumber);
			attributeSetterBiConsumers.put(
				"comment",
				(BiConsumer<QuarryPaymentConfirmation, String>)
					QuarryPaymentConfirmation::setComment);
			attributeSetterBiConsumers.put(
				"amountOutstanding",
				(BiConsumer<QuarryPaymentConfirmation, String>)
					QuarryPaymentConfirmation::setAmountOutstanding);
			attributeSetterBiConsumers.put(
				"dueDate",
				(BiConsumer<QuarryPaymentConfirmation, Date>)
					QuarryPaymentConfirmation::setDueDate);
			attributeSetterBiConsumers.put(
				"status",
				(BiConsumer<QuarryPaymentConfirmation, String>)
					QuarryPaymentConfirmation::setStatus);
			attributeSetterBiConsumers.put(
				"docFileEntry",
				(BiConsumer<QuarryPaymentConfirmation, Long>)
					QuarryPaymentConfirmation::setDocFileEntry);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getQuarryPaymentConfirmationId() {
		return _quarryPaymentConfirmationId;
	}

	@Override
	public void setQuarryPaymentConfirmationId(
		long quarryPaymentConfirmationId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_quarryPaymentConfirmationId = quarryPaymentConfirmationId;
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
	public String getCaseId() {
		if (_caseId == null) {
			return "";
		}
		else {
			return _caseId;
		}
	}

	@Override
	public void setCaseId(String caseId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_caseId = caseId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalCaseId() {
		return getColumnOriginalValue("caseId");
	}

	@JSON
	@Override
	public Date getDateReceived() {
		return _dateReceived;
	}

	@Override
	public void setDateReceived(Date dateReceived) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateReceived = dateReceived;
	}

	@JSON
	@Override
	public String getAmountReceived() {
		if (_amountReceived == null) {
			return "";
		}
		else {
			return _amountReceived;
		}
	}

	@Override
	public void setAmountReceived(String amountReceived) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_amountReceived = amountReceived;
	}

	@JSON
	@Override
	public String getAmountDue() {
		if (_amountDue == null) {
			return "";
		}
		else {
			return _amountDue;
		}
	}

	@Override
	public void setAmountDue(String amountDue) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_amountDue = amountDue;
	}

	@JSON
	@Override
	public String getReceiptNumber() {
		if (_receiptNumber == null) {
			return "";
		}
		else {
			return _receiptNumber;
		}
	}

	@Override
	public void setReceiptNumber(String receiptNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_receiptNumber = receiptNumber;
	}

	@JSON
	@Override
	public String getComment() {
		if (_comment == null) {
			return "";
		}
		else {
			return _comment;
		}
	}

	@Override
	public void setComment(String comment) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comment = comment;
	}

	@JSON
	@Override
	public String getAmountOutstanding() {
		if (_amountOutstanding == null) {
			return "";
		}
		else {
			return _amountOutstanding;
		}
	}

	@Override
	public void setAmountOutstanding(String amountOutstanding) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_amountOutstanding = amountOutstanding;
	}

	@JSON
	@Override
	public Date getDueDate() {
		return _dueDate;
	}

	@Override
	public void setDueDate(Date dueDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dueDate = dueDate;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return "";
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_status = status;
	}

	@JSON
	@Override
	public long getDocFileEntry() {
		return _docFileEntry;
	}

	@Override
	public void setDocFileEntry(long docFileEntry) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_docFileEntry = docFileEntry;
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
			getCompanyId(), QuarryPaymentConfirmation.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QuarryPaymentConfirmation toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, QuarryPaymentConfirmation>
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
		QuarryPaymentConfirmationImpl quarryPaymentConfirmationImpl =
			new QuarryPaymentConfirmationImpl();

		quarryPaymentConfirmationImpl.setQuarryPaymentConfirmationId(
			getQuarryPaymentConfirmationId());
		quarryPaymentConfirmationImpl.setGroupId(getGroupId());
		quarryPaymentConfirmationImpl.setCompanyId(getCompanyId());
		quarryPaymentConfirmationImpl.setUserId(getUserId());
		quarryPaymentConfirmationImpl.setUserName(getUserName());
		quarryPaymentConfirmationImpl.setCreateDate(getCreateDate());
		quarryPaymentConfirmationImpl.setModifiedDate(getModifiedDate());
		quarryPaymentConfirmationImpl.setCaseId(getCaseId());
		quarryPaymentConfirmationImpl.setDateReceived(getDateReceived());
		quarryPaymentConfirmationImpl.setAmountReceived(getAmountReceived());
		quarryPaymentConfirmationImpl.setAmountDue(getAmountDue());
		quarryPaymentConfirmationImpl.setReceiptNumber(getReceiptNumber());
		quarryPaymentConfirmationImpl.setComment(getComment());
		quarryPaymentConfirmationImpl.setAmountOutstanding(
			getAmountOutstanding());
		quarryPaymentConfirmationImpl.setDueDate(getDueDate());
		quarryPaymentConfirmationImpl.setStatus(getStatus());
		quarryPaymentConfirmationImpl.setDocFileEntry(getDocFileEntry());

		quarryPaymentConfirmationImpl.resetOriginalValues();

		return quarryPaymentConfirmationImpl;
	}

	@Override
	public QuarryPaymentConfirmation cloneWithOriginalValues() {
		QuarryPaymentConfirmationImpl quarryPaymentConfirmationImpl =
			new QuarryPaymentConfirmationImpl();

		quarryPaymentConfirmationImpl.setQuarryPaymentConfirmationId(
			this.<Long>getColumnOriginalValue("quarryPaymentConfirmationId"));
		quarryPaymentConfirmationImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		quarryPaymentConfirmationImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		quarryPaymentConfirmationImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		quarryPaymentConfirmationImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		quarryPaymentConfirmationImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		quarryPaymentConfirmationImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		quarryPaymentConfirmationImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		quarryPaymentConfirmationImpl.setDateReceived(
			this.<Date>getColumnOriginalValue("dateReceived"));
		quarryPaymentConfirmationImpl.setAmountReceived(
			this.<String>getColumnOriginalValue("amountReceived"));
		quarryPaymentConfirmationImpl.setAmountDue(
			this.<String>getColumnOriginalValue("amountDue"));
		quarryPaymentConfirmationImpl.setReceiptNumber(
			this.<String>getColumnOriginalValue("receiptNumber"));
		quarryPaymentConfirmationImpl.setComment(
			this.<String>getColumnOriginalValue("comment_"));
		quarryPaymentConfirmationImpl.setAmountOutstanding(
			this.<String>getColumnOriginalValue("amountOutstanding"));
		quarryPaymentConfirmationImpl.setDueDate(
			this.<Date>getColumnOriginalValue("dueDate"));
		quarryPaymentConfirmationImpl.setStatus(
			this.<String>getColumnOriginalValue("status"));
		quarryPaymentConfirmationImpl.setDocFileEntry(
			this.<Long>getColumnOriginalValue("docFileEntry"));

		return quarryPaymentConfirmationImpl;
	}

	@Override
	public int compareTo(QuarryPaymentConfirmation quarryPaymentConfirmation) {
		long primaryKey = quarryPaymentConfirmation.getPrimaryKey();

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

		if (!(object instanceof QuarryPaymentConfirmation)) {
			return false;
		}

		QuarryPaymentConfirmation quarryPaymentConfirmation =
			(QuarryPaymentConfirmation)object;

		long primaryKey = quarryPaymentConfirmation.getPrimaryKey();

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
	public CacheModel<QuarryPaymentConfirmation> toCacheModel() {
		QuarryPaymentConfirmationCacheModel
			quarryPaymentConfirmationCacheModel =
				new QuarryPaymentConfirmationCacheModel();

		quarryPaymentConfirmationCacheModel.quarryPaymentConfirmationId =
			getQuarryPaymentConfirmationId();

		quarryPaymentConfirmationCacheModel.groupId = getGroupId();

		quarryPaymentConfirmationCacheModel.companyId = getCompanyId();

		quarryPaymentConfirmationCacheModel.userId = getUserId();

		quarryPaymentConfirmationCacheModel.userName = getUserName();

		String userName = quarryPaymentConfirmationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			quarryPaymentConfirmationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			quarryPaymentConfirmationCacheModel.createDate =
				createDate.getTime();
		}
		else {
			quarryPaymentConfirmationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			quarryPaymentConfirmationCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			quarryPaymentConfirmationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		quarryPaymentConfirmationCacheModel.caseId = getCaseId();

		String caseId = quarryPaymentConfirmationCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			quarryPaymentConfirmationCacheModel.caseId = null;
		}

		Date dateReceived = getDateReceived();

		if (dateReceived != null) {
			quarryPaymentConfirmationCacheModel.dateReceived =
				dateReceived.getTime();
		}
		else {
			quarryPaymentConfirmationCacheModel.dateReceived = Long.MIN_VALUE;
		}

		quarryPaymentConfirmationCacheModel.amountReceived =
			getAmountReceived();

		String amountReceived =
			quarryPaymentConfirmationCacheModel.amountReceived;

		if ((amountReceived != null) && (amountReceived.length() == 0)) {
			quarryPaymentConfirmationCacheModel.amountReceived = null;
		}

		quarryPaymentConfirmationCacheModel.amountDue = getAmountDue();

		String amountDue = quarryPaymentConfirmationCacheModel.amountDue;

		if ((amountDue != null) && (amountDue.length() == 0)) {
			quarryPaymentConfirmationCacheModel.amountDue = null;
		}

		quarryPaymentConfirmationCacheModel.receiptNumber = getReceiptNumber();

		String receiptNumber =
			quarryPaymentConfirmationCacheModel.receiptNumber;

		if ((receiptNumber != null) && (receiptNumber.length() == 0)) {
			quarryPaymentConfirmationCacheModel.receiptNumber = null;
		}

		quarryPaymentConfirmationCacheModel.comment = getComment();

		String comment = quarryPaymentConfirmationCacheModel.comment;

		if ((comment != null) && (comment.length() == 0)) {
			quarryPaymentConfirmationCacheModel.comment = null;
		}

		quarryPaymentConfirmationCacheModel.amountOutstanding =
			getAmountOutstanding();

		String amountOutstanding =
			quarryPaymentConfirmationCacheModel.amountOutstanding;

		if ((amountOutstanding != null) && (amountOutstanding.length() == 0)) {
			quarryPaymentConfirmationCacheModel.amountOutstanding = null;
		}

		Date dueDate = getDueDate();

		if (dueDate != null) {
			quarryPaymentConfirmationCacheModel.dueDate = dueDate.getTime();
		}
		else {
			quarryPaymentConfirmationCacheModel.dueDate = Long.MIN_VALUE;
		}

		quarryPaymentConfirmationCacheModel.status = getStatus();

		String status = quarryPaymentConfirmationCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			quarryPaymentConfirmationCacheModel.status = null;
		}

		quarryPaymentConfirmationCacheModel.docFileEntry = getDocFileEntry();

		return quarryPaymentConfirmationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<QuarryPaymentConfirmation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<QuarryPaymentConfirmation, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuarryPaymentConfirmation, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(QuarryPaymentConfirmation)this);

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
			<InvocationHandler, QuarryPaymentConfirmation>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						QuarryPaymentConfirmation.class, ModelWrapper.class);

	}

	private long _quarryPaymentConfirmationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _caseId;
	private Date _dateReceived;
	private String _amountReceived;
	private String _amountDue;
	private String _receiptNumber;
	private String _comment;
	private String _amountOutstanding;
	private Date _dueDate;
	private String _status;
	private long _docFileEntry;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<QuarryPaymentConfirmation, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((QuarryPaymentConfirmation)this);
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
			"quarryPaymentConfirmationId", _quarryPaymentConfirmationId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("dateReceived", _dateReceived);
		_columnOriginalValues.put("amountReceived", _amountReceived);
		_columnOriginalValues.put("amountDue", _amountDue);
		_columnOriginalValues.put("receiptNumber", _receiptNumber);
		_columnOriginalValues.put("comment_", _comment);
		_columnOriginalValues.put("amountOutstanding", _amountOutstanding);
		_columnOriginalValues.put("dueDate", _dueDate);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("docFileEntry", _docFileEntry);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("comment_", "comment");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("quarryPaymentConfirmationId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("caseId", 128L);

		columnBitmasks.put("dateReceived", 256L);

		columnBitmasks.put("amountReceived", 512L);

		columnBitmasks.put("amountDue", 1024L);

		columnBitmasks.put("receiptNumber", 2048L);

		columnBitmasks.put("comment_", 4096L);

		columnBitmasks.put("amountOutstanding", 8192L);

		columnBitmasks.put("dueDate", 16384L);

		columnBitmasks.put("status", 32768L);

		columnBitmasks.put("docFileEntry", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private QuarryPaymentConfirmation _escapedModel;

}