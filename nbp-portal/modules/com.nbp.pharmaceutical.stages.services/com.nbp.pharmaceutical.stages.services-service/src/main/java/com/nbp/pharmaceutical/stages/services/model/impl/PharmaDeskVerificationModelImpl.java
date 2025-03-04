/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model.impl;

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

import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification;
import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerificationModel;

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
 * The base model implementation for the PharmaDeskVerification service. Represents a row in the &quot;nbp_pharma_desk_verification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PharmaDeskVerificationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PharmaDeskVerificationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDeskVerificationImpl
 * @generated
 */
@JSON(strict = true)
public class PharmaDeskVerificationModelImpl
	extends BaseModelImpl<PharmaDeskVerification>
	implements PharmaDeskVerificationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a pharma desk verification model instance should use the <code>PharmaDeskVerification</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_pharma_desk_verification";

	public static final Object[][] TABLE_COLUMNS = {
		{"pharmaDeskVerificationId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"pharmaApplicationId", Types.BIGINT}, {"document", Types.VARCHAR},
		{"documentName", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("pharmaDeskVerificationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("pharmaApplicationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("document", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("documentName", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_pharma_desk_verification (pharmaDeskVerificationId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,pharmaApplicationId LONG,document VARCHAR(75) null,documentName VARCHAR(500) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_pharma_desk_verification";

	public static final String ORDER_BY_JPQL =
		" ORDER BY pharmaDeskVerification.pharmaDeskVerificationId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_pharma_desk_verification.pharmaDeskVerificationId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long PHARMAAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long PHARMADESKVERIFICATIONID_COLUMN_BITMASK = 2L;

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

	public PharmaDeskVerificationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _pharmaDeskVerificationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPharmaDeskVerificationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pharmaDeskVerificationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PharmaDeskVerification.class;
	}

	@Override
	public String getModelClassName() {
		return PharmaDeskVerification.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<PharmaDeskVerification, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<PharmaDeskVerification, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PharmaDeskVerification, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((PharmaDeskVerification)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<PharmaDeskVerification, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<PharmaDeskVerification, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(PharmaDeskVerification)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<PharmaDeskVerification, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<PharmaDeskVerification, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<PharmaDeskVerification, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<PharmaDeskVerification, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<PharmaDeskVerification, Object>>();

			attributeGetterFunctions.put(
				"pharmaDeskVerificationId",
				PharmaDeskVerification::getPharmaDeskVerificationId);
			attributeGetterFunctions.put(
				"groupId", PharmaDeskVerification::getGroupId);
			attributeGetterFunctions.put(
				"companyId", PharmaDeskVerification::getCompanyId);
			attributeGetterFunctions.put(
				"userId", PharmaDeskVerification::getUserId);
			attributeGetterFunctions.put(
				"userName", PharmaDeskVerification::getUserName);
			attributeGetterFunctions.put(
				"createDate", PharmaDeskVerification::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", PharmaDeskVerification::getModifiedDate);
			attributeGetterFunctions.put(
				"pharmaApplicationId",
				PharmaDeskVerification::getPharmaApplicationId);
			attributeGetterFunctions.put(
				"document", PharmaDeskVerification::getDocument);
			attributeGetterFunctions.put(
				"documentName", PharmaDeskVerification::getDocumentName);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<PharmaDeskVerification, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<PharmaDeskVerification, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<PharmaDeskVerification, ?>>();

			attributeSetterBiConsumers.put(
				"pharmaDeskVerificationId",
				(BiConsumer<PharmaDeskVerification, Long>)
					PharmaDeskVerification::setPharmaDeskVerificationId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<PharmaDeskVerification, Long>)
					PharmaDeskVerification::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<PharmaDeskVerification, Long>)
					PharmaDeskVerification::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<PharmaDeskVerification, Long>)
					PharmaDeskVerification::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<PharmaDeskVerification, String>)
					PharmaDeskVerification::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<PharmaDeskVerification, Date>)
					PharmaDeskVerification::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<PharmaDeskVerification, Date>)
					PharmaDeskVerification::setModifiedDate);
			attributeSetterBiConsumers.put(
				"pharmaApplicationId",
				(BiConsumer<PharmaDeskVerification, Long>)
					PharmaDeskVerification::setPharmaApplicationId);
			attributeSetterBiConsumers.put(
				"document",
				(BiConsumer<PharmaDeskVerification, String>)
					PharmaDeskVerification::setDocument);
			attributeSetterBiConsumers.put(
				"documentName",
				(BiConsumer<PharmaDeskVerification, String>)
					PharmaDeskVerification::setDocumentName);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getPharmaDeskVerificationId() {
		return _pharmaDeskVerificationId;
	}

	@Override
	public void setPharmaDeskVerificationId(long pharmaDeskVerificationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_pharmaDeskVerificationId = pharmaDeskVerificationId;
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
	public long getPharmaApplicationId() {
		return _pharmaApplicationId;
	}

	@Override
	public void setPharmaApplicationId(long pharmaApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_pharmaApplicationId = pharmaApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalPharmaApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("pharmaApplicationId"));
	}

	@JSON
	@Override
	public String getDocument() {
		if (_document == null) {
			return "";
		}
		else {
			return _document;
		}
	}

	@Override
	public void setDocument(String document) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_document = document;
	}

	@JSON
	@Override
	public String getDocumentName() {
		if (_documentName == null) {
			return "";
		}
		else {
			return _documentName;
		}
	}

	@Override
	public void setDocumentName(String documentName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_documentName = documentName;
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
			getCompanyId(), PharmaDeskVerification.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PharmaDeskVerification toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, PharmaDeskVerification>
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
		PharmaDeskVerificationImpl pharmaDeskVerificationImpl =
			new PharmaDeskVerificationImpl();

		pharmaDeskVerificationImpl.setPharmaDeskVerificationId(
			getPharmaDeskVerificationId());
		pharmaDeskVerificationImpl.setGroupId(getGroupId());
		pharmaDeskVerificationImpl.setCompanyId(getCompanyId());
		pharmaDeskVerificationImpl.setUserId(getUserId());
		pharmaDeskVerificationImpl.setUserName(getUserName());
		pharmaDeskVerificationImpl.setCreateDate(getCreateDate());
		pharmaDeskVerificationImpl.setModifiedDate(getModifiedDate());
		pharmaDeskVerificationImpl.setPharmaApplicationId(
			getPharmaApplicationId());
		pharmaDeskVerificationImpl.setDocument(getDocument());
		pharmaDeskVerificationImpl.setDocumentName(getDocumentName());

		pharmaDeskVerificationImpl.resetOriginalValues();

		return pharmaDeskVerificationImpl;
	}

	@Override
	public PharmaDeskVerification cloneWithOriginalValues() {
		PharmaDeskVerificationImpl pharmaDeskVerificationImpl =
			new PharmaDeskVerificationImpl();

		pharmaDeskVerificationImpl.setPharmaDeskVerificationId(
			this.<Long>getColumnOriginalValue("pharmaDeskVerificationId"));
		pharmaDeskVerificationImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		pharmaDeskVerificationImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		pharmaDeskVerificationImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		pharmaDeskVerificationImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		pharmaDeskVerificationImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		pharmaDeskVerificationImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		pharmaDeskVerificationImpl.setPharmaApplicationId(
			this.<Long>getColumnOriginalValue("pharmaApplicationId"));
		pharmaDeskVerificationImpl.setDocument(
			this.<String>getColumnOriginalValue("document"));
		pharmaDeskVerificationImpl.setDocumentName(
			this.<String>getColumnOriginalValue("documentName"));

		return pharmaDeskVerificationImpl;
	}

	@Override
	public int compareTo(PharmaDeskVerification pharmaDeskVerification) {
		long primaryKey = pharmaDeskVerification.getPrimaryKey();

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

		if (!(object instanceof PharmaDeskVerification)) {
			return false;
		}

		PharmaDeskVerification pharmaDeskVerification =
			(PharmaDeskVerification)object;

		long primaryKey = pharmaDeskVerification.getPrimaryKey();

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
	public CacheModel<PharmaDeskVerification> toCacheModel() {
		PharmaDeskVerificationCacheModel pharmaDeskVerificationCacheModel =
			new PharmaDeskVerificationCacheModel();

		pharmaDeskVerificationCacheModel.pharmaDeskVerificationId =
			getPharmaDeskVerificationId();

		pharmaDeskVerificationCacheModel.groupId = getGroupId();

		pharmaDeskVerificationCacheModel.companyId = getCompanyId();

		pharmaDeskVerificationCacheModel.userId = getUserId();

		pharmaDeskVerificationCacheModel.userName = getUserName();

		String userName = pharmaDeskVerificationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			pharmaDeskVerificationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			pharmaDeskVerificationCacheModel.createDate = createDate.getTime();
		}
		else {
			pharmaDeskVerificationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			pharmaDeskVerificationCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			pharmaDeskVerificationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		pharmaDeskVerificationCacheModel.pharmaApplicationId =
			getPharmaApplicationId();

		pharmaDeskVerificationCacheModel.document = getDocument();

		String document = pharmaDeskVerificationCacheModel.document;

		if ((document != null) && (document.length() == 0)) {
			pharmaDeskVerificationCacheModel.document = null;
		}

		pharmaDeskVerificationCacheModel.documentName = getDocumentName();

		String documentName = pharmaDeskVerificationCacheModel.documentName;

		if ((documentName != null) && (documentName.length() == 0)) {
			pharmaDeskVerificationCacheModel.documentName = null;
		}

		return pharmaDeskVerificationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<PharmaDeskVerification, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<PharmaDeskVerification, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<PharmaDeskVerification, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(PharmaDeskVerification)this);

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

		private static final Function<InvocationHandler, PharmaDeskVerification>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					PharmaDeskVerification.class, ModelWrapper.class);

	}

	private long _pharmaDeskVerificationId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _pharmaApplicationId;
	private String _document;
	private String _documentName;

	public <T> T getColumnValue(String columnName) {
		Function<PharmaDeskVerification, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((PharmaDeskVerification)this);
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
			"pharmaDeskVerificationId", _pharmaDeskVerificationId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("pharmaApplicationId", _pharmaApplicationId);
		_columnOriginalValues.put("document", _document);
		_columnOriginalValues.put("documentName", _documentName);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("pharmaDeskVerificationId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("pharmaApplicationId", 128L);

		columnBitmasks.put("document", 256L);

		columnBitmasks.put("documentName", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private PharmaDeskVerification _escapedModel;

}