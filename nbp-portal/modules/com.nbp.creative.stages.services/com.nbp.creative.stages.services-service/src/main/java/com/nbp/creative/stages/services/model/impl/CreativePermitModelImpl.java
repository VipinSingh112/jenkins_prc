/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model.impl;

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

import com.nbp.creative.stages.services.model.CreativePermit;
import com.nbp.creative.stages.services.model.CreativePermitModel;

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
 * The base model implementation for the CreativePermit service. Represents a row in the &quot;nbp_creative_permit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>CreativePermitModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CreativePermitImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativePermitImpl
 * @generated
 */
@JSON(strict = true)
public class CreativePermitModelImpl
	extends BaseModelImpl<CreativePermit> implements CreativePermitModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a creative permit model instance should use the <code>CreativePermit</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_creative_permit";

	public static final Object[][] TABLE_COLUMNS = {
		{"creativePermitId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"caseId", Types.VARCHAR},
		{"pirPermtNumber", Types.VARCHAR}, {"dateofIssue", Types.TIMESTAMP},
		{"dateOfExpiration", Types.TIMESTAMP},
		{"durationOfPermit", Types.VARCHAR},
		{"pirCertificateNumber", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("creativePermitId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pirPermtNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateofIssue", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dateOfExpiration", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("durationOfPermit", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pirCertificateNumber", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_creative_permit (creativePermitId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,caseId VARCHAR(75) null,pirPermtNumber VARCHAR(75) null,dateofIssue DATE null,dateOfExpiration DATE null,durationOfPermit VARCHAR(75) null,pirCertificateNumber LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_creative_permit";

	public static final String ORDER_BY_JPQL =
		" ORDER BY creativePermit.creativePermitId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_creative_permit.creativePermitId ASC";

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
	public static final long CREATIVEPERMITID_COLUMN_BITMASK = 2L;

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

	public CreativePermitModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _creativePermitId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCreativePermitId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _creativePermitId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CreativePermit.class;
	}

	@Override
	public String getModelClassName() {
		return CreativePermit.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CreativePermit, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CreativePermit, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CreativePermit, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CreativePermit)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CreativePermit, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CreativePermit, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CreativePermit)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CreativePermit, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CreativePermit, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<CreativePermit, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<CreativePermit, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<CreativePermit, Object>>();

			attributeGetterFunctions.put(
				"creativePermitId", CreativePermit::getCreativePermitId);
			attributeGetterFunctions.put("groupId", CreativePermit::getGroupId);
			attributeGetterFunctions.put(
				"companyId", CreativePermit::getCompanyId);
			attributeGetterFunctions.put("userId", CreativePermit::getUserId);
			attributeGetterFunctions.put(
				"userName", CreativePermit::getUserName);
			attributeGetterFunctions.put(
				"createDate", CreativePermit::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", CreativePermit::getModifiedDate);
			attributeGetterFunctions.put("caseId", CreativePermit::getCaseId);
			attributeGetterFunctions.put(
				"pirPermtNumber", CreativePermit::getPirPermtNumber);
			attributeGetterFunctions.put(
				"dateofIssue", CreativePermit::getDateofIssue);
			attributeGetterFunctions.put(
				"dateOfExpiration", CreativePermit::getDateOfExpiration);
			attributeGetterFunctions.put(
				"durationOfPermit", CreativePermit::getDurationOfPermit);
			attributeGetterFunctions.put(
				"pirCertificateNumber",
				CreativePermit::getPirCertificateNumber);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<CreativePermit, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<CreativePermit, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap<String, BiConsumer<CreativePermit, ?>>();

			attributeSetterBiConsumers.put(
				"creativePermitId",
				(BiConsumer<CreativePermit, Long>)
					CreativePermit::setCreativePermitId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<CreativePermit, Long>)CreativePermit::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<CreativePermit, Long>)CreativePermit::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<CreativePermit, Long>)CreativePermit::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<CreativePermit, String>)
					CreativePermit::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<CreativePermit, Date>)
					CreativePermit::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<CreativePermit, Date>)
					CreativePermit::setModifiedDate);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<CreativePermit, String>)CreativePermit::setCaseId);
			attributeSetterBiConsumers.put(
				"pirPermtNumber",
				(BiConsumer<CreativePermit, String>)
					CreativePermit::setPirPermtNumber);
			attributeSetterBiConsumers.put(
				"dateofIssue",
				(BiConsumer<CreativePermit, Date>)
					CreativePermit::setDateofIssue);
			attributeSetterBiConsumers.put(
				"dateOfExpiration",
				(BiConsumer<CreativePermit, Date>)
					CreativePermit::setDateOfExpiration);
			attributeSetterBiConsumers.put(
				"durationOfPermit",
				(BiConsumer<CreativePermit, String>)
					CreativePermit::setDurationOfPermit);
			attributeSetterBiConsumers.put(
				"pirCertificateNumber",
				(BiConsumer<CreativePermit, Long>)
					CreativePermit::setPirCertificateNumber);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getCreativePermitId() {
		return _creativePermitId;
	}

	@Override
	public void setCreativePermitId(long creativePermitId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_creativePermitId = creativePermitId;
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
	public String getPirPermtNumber() {
		if (_pirPermtNumber == null) {
			return "";
		}
		else {
			return _pirPermtNumber;
		}
	}

	@Override
	public void setPirPermtNumber(String pirPermtNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_pirPermtNumber = pirPermtNumber;
	}

	@JSON
	@Override
	public Date getDateofIssue() {
		return _dateofIssue;
	}

	@Override
	public void setDateofIssue(Date dateofIssue) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateofIssue = dateofIssue;
	}

	@JSON
	@Override
	public Date getDateOfExpiration() {
		return _dateOfExpiration;
	}

	@Override
	public void setDateOfExpiration(Date dateOfExpiration) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateOfExpiration = dateOfExpiration;
	}

	@JSON
	@Override
	public String getDurationOfPermit() {
		if (_durationOfPermit == null) {
			return "";
		}
		else {
			return _durationOfPermit;
		}
	}

	@Override
	public void setDurationOfPermit(String durationOfPermit) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_durationOfPermit = durationOfPermit;
	}

	@JSON
	@Override
	public long getPirCertificateNumber() {
		return _pirCertificateNumber;
	}

	@Override
	public void setPirCertificateNumber(long pirCertificateNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_pirCertificateNumber = pirCertificateNumber;
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
			getCompanyId(), CreativePermit.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CreativePermit toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CreativePermit>
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
		CreativePermitImpl creativePermitImpl = new CreativePermitImpl();

		creativePermitImpl.setCreativePermitId(getCreativePermitId());
		creativePermitImpl.setGroupId(getGroupId());
		creativePermitImpl.setCompanyId(getCompanyId());
		creativePermitImpl.setUserId(getUserId());
		creativePermitImpl.setUserName(getUserName());
		creativePermitImpl.setCreateDate(getCreateDate());
		creativePermitImpl.setModifiedDate(getModifiedDate());
		creativePermitImpl.setCaseId(getCaseId());
		creativePermitImpl.setPirPermtNumber(getPirPermtNumber());
		creativePermitImpl.setDateofIssue(getDateofIssue());
		creativePermitImpl.setDateOfExpiration(getDateOfExpiration());
		creativePermitImpl.setDurationOfPermit(getDurationOfPermit());
		creativePermitImpl.setPirCertificateNumber(getPirCertificateNumber());

		creativePermitImpl.resetOriginalValues();

		return creativePermitImpl;
	}

	@Override
	public CreativePermit cloneWithOriginalValues() {
		CreativePermitImpl creativePermitImpl = new CreativePermitImpl();

		creativePermitImpl.setCreativePermitId(
			this.<Long>getColumnOriginalValue("creativePermitId"));
		creativePermitImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		creativePermitImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		creativePermitImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		creativePermitImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		creativePermitImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		creativePermitImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		creativePermitImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		creativePermitImpl.setPirPermtNumber(
			this.<String>getColumnOriginalValue("pirPermtNumber"));
		creativePermitImpl.setDateofIssue(
			this.<Date>getColumnOriginalValue("dateofIssue"));
		creativePermitImpl.setDateOfExpiration(
			this.<Date>getColumnOriginalValue("dateOfExpiration"));
		creativePermitImpl.setDurationOfPermit(
			this.<String>getColumnOriginalValue("durationOfPermit"));
		creativePermitImpl.setPirCertificateNumber(
			this.<Long>getColumnOriginalValue("pirCertificateNumber"));

		return creativePermitImpl;
	}

	@Override
	public int compareTo(CreativePermit creativePermit) {
		long primaryKey = creativePermit.getPrimaryKey();

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

		if (!(object instanceof CreativePermit)) {
			return false;
		}

		CreativePermit creativePermit = (CreativePermit)object;

		long primaryKey = creativePermit.getPrimaryKey();

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
	public CacheModel<CreativePermit> toCacheModel() {
		CreativePermitCacheModel creativePermitCacheModel =
			new CreativePermitCacheModel();

		creativePermitCacheModel.creativePermitId = getCreativePermitId();

		creativePermitCacheModel.groupId = getGroupId();

		creativePermitCacheModel.companyId = getCompanyId();

		creativePermitCacheModel.userId = getUserId();

		creativePermitCacheModel.userName = getUserName();

		String userName = creativePermitCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			creativePermitCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			creativePermitCacheModel.createDate = createDate.getTime();
		}
		else {
			creativePermitCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			creativePermitCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			creativePermitCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		creativePermitCacheModel.caseId = getCaseId();

		String caseId = creativePermitCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			creativePermitCacheModel.caseId = null;
		}

		creativePermitCacheModel.pirPermtNumber = getPirPermtNumber();

		String pirPermtNumber = creativePermitCacheModel.pirPermtNumber;

		if ((pirPermtNumber != null) && (pirPermtNumber.length() == 0)) {
			creativePermitCacheModel.pirPermtNumber = null;
		}

		Date dateofIssue = getDateofIssue();

		if (dateofIssue != null) {
			creativePermitCacheModel.dateofIssue = dateofIssue.getTime();
		}
		else {
			creativePermitCacheModel.dateofIssue = Long.MIN_VALUE;
		}

		Date dateOfExpiration = getDateOfExpiration();

		if (dateOfExpiration != null) {
			creativePermitCacheModel.dateOfExpiration =
				dateOfExpiration.getTime();
		}
		else {
			creativePermitCacheModel.dateOfExpiration = Long.MIN_VALUE;
		}

		creativePermitCacheModel.durationOfPermit = getDurationOfPermit();

		String durationOfPermit = creativePermitCacheModel.durationOfPermit;

		if ((durationOfPermit != null) && (durationOfPermit.length() == 0)) {
			creativePermitCacheModel.durationOfPermit = null;
		}

		creativePermitCacheModel.pirCertificateNumber =
			getPirCertificateNumber();

		return creativePermitCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CreativePermit, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CreativePermit, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CreativePermit, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((CreativePermit)this);

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

		private static final Function<InvocationHandler, CreativePermit>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					CreativePermit.class, ModelWrapper.class);

	}

	private long _creativePermitId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _caseId;
	private String _pirPermtNumber;
	private Date _dateofIssue;
	private Date _dateOfExpiration;
	private String _durationOfPermit;
	private long _pirCertificateNumber;

	public <T> T getColumnValue(String columnName) {
		Function<CreativePermit, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((CreativePermit)this);
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

		_columnOriginalValues.put("creativePermitId", _creativePermitId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("pirPermtNumber", _pirPermtNumber);
		_columnOriginalValues.put("dateofIssue", _dateofIssue);
		_columnOriginalValues.put("dateOfExpiration", _dateOfExpiration);
		_columnOriginalValues.put("durationOfPermit", _durationOfPermit);
		_columnOriginalValues.put(
			"pirCertificateNumber", _pirCertificateNumber);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("creativePermitId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("caseId", 128L);

		columnBitmasks.put("pirPermtNumber", 256L);

		columnBitmasks.put("dateofIssue", 512L);

		columnBitmasks.put("dateOfExpiration", 1024L);

		columnBitmasks.put("durationOfPermit", 2048L);

		columnBitmasks.put("pirCertificateNumber", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private CreativePermit _escapedModel;

}