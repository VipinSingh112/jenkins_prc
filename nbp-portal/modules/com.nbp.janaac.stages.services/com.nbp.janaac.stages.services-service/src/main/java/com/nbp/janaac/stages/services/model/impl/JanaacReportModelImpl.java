/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model.impl;

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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.janaac.stages.services.model.JanaacReport;
import com.nbp.janaac.stages.services.model.JanaacReportModel;

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
 * The base model implementation for the JanaacReport service. Represents a row in the &quot;nbp_janaac_report&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>JanaacReportModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JanaacReportImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacReportImpl
 * @generated
 */
@JSON(strict = true)
public class JanaacReportModelImpl
	extends BaseModelImpl<JanaacReport> implements JanaacReportModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a janaac report model instance should use the <code>JanaacReport</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_janaac_report";

	public static final Object[][] TABLE_COLUMNS = {
		{"janaacReportId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"dateOfReport", Types.TIMESTAMP},
		{"report", Types.VARCHAR}, {"caseId", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("janaacReportId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("dateOfReport", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("report", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_janaac_report (janaacReportId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,dateOfReport DATE null,report VARCHAR(75) null,caseId VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table nbp_janaac_report";

	public static final String ORDER_BY_JPQL =
		" ORDER BY janaacReport.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_janaac_report.createDate DESC";

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

	public JanaacReportModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _janaacReportId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setJanaacReportId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _janaacReportId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return JanaacReport.class;
	}

	@Override
	public String getModelClassName() {
		return JanaacReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<JanaacReport, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<JanaacReport, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<JanaacReport, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((JanaacReport)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<JanaacReport, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<JanaacReport, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(JanaacReport)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<JanaacReport, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<JanaacReport, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<JanaacReport, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<JanaacReport, Object>>
				attributeGetterFunctions =
					new LinkedHashMap<String, Function<JanaacReport, Object>>();

			attributeGetterFunctions.put(
				"janaacReportId", JanaacReport::getJanaacReportId);
			attributeGetterFunctions.put("groupId", JanaacReport::getGroupId);
			attributeGetterFunctions.put(
				"companyId", JanaacReport::getCompanyId);
			attributeGetterFunctions.put("userId", JanaacReport::getUserId);
			attributeGetterFunctions.put("userName", JanaacReport::getUserName);
			attributeGetterFunctions.put(
				"createDate", JanaacReport::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", JanaacReport::getModifiedDate);
			attributeGetterFunctions.put(
				"dateOfReport", JanaacReport::getDateOfReport);
			attributeGetterFunctions.put("report", JanaacReport::getReport);
			attributeGetterFunctions.put("caseId", JanaacReport::getCaseId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<JanaacReport, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<JanaacReport, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap<String, BiConsumer<JanaacReport, ?>>();

			attributeSetterBiConsumers.put(
				"janaacReportId",
				(BiConsumer<JanaacReport, Long>)
					JanaacReport::setJanaacReportId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<JanaacReport, Long>)JanaacReport::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<JanaacReport, Long>)JanaacReport::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<JanaacReport, Long>)JanaacReport::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<JanaacReport, String>)JanaacReport::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<JanaacReport, Date>)JanaacReport::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<JanaacReport, Date>)JanaacReport::setModifiedDate);
			attributeSetterBiConsumers.put(
				"dateOfReport",
				(BiConsumer<JanaacReport, Date>)JanaacReport::setDateOfReport);
			attributeSetterBiConsumers.put(
				"report",
				(BiConsumer<JanaacReport, String>)JanaacReport::setReport);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<JanaacReport, String>)JanaacReport::setCaseId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getJanaacReportId() {
		return _janaacReportId;
	}

	@Override
	public void setJanaacReportId(long janaacReportId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_janaacReportId = janaacReportId;
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
	public Date getDateOfReport() {
		return _dateOfReport;
	}

	@Override
	public void setDateOfReport(Date dateOfReport) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateOfReport = dateOfReport;
	}

	@JSON
	@Override
	public String getReport() {
		if (_report == null) {
			return "";
		}
		else {
			return _report;
		}
	}

	@Override
	public void setReport(String report) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_report = report;
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
			getCompanyId(), JanaacReport.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public JanaacReport toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, JanaacReport>
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
		JanaacReportImpl janaacReportImpl = new JanaacReportImpl();

		janaacReportImpl.setJanaacReportId(getJanaacReportId());
		janaacReportImpl.setGroupId(getGroupId());
		janaacReportImpl.setCompanyId(getCompanyId());
		janaacReportImpl.setUserId(getUserId());
		janaacReportImpl.setUserName(getUserName());
		janaacReportImpl.setCreateDate(getCreateDate());
		janaacReportImpl.setModifiedDate(getModifiedDate());
		janaacReportImpl.setDateOfReport(getDateOfReport());
		janaacReportImpl.setReport(getReport());
		janaacReportImpl.setCaseId(getCaseId());

		janaacReportImpl.resetOriginalValues();

		return janaacReportImpl;
	}

	@Override
	public JanaacReport cloneWithOriginalValues() {
		JanaacReportImpl janaacReportImpl = new JanaacReportImpl();

		janaacReportImpl.setJanaacReportId(
			this.<Long>getColumnOriginalValue("janaacReportId"));
		janaacReportImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		janaacReportImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		janaacReportImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		janaacReportImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		janaacReportImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		janaacReportImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		janaacReportImpl.setDateOfReport(
			this.<Date>getColumnOriginalValue("dateOfReport"));
		janaacReportImpl.setReport(
			this.<String>getColumnOriginalValue("report"));
		janaacReportImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));

		return janaacReportImpl;
	}

	@Override
	public int compareTo(JanaacReport janaacReport) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), janaacReport.getCreateDate());

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

		if (!(object instanceof JanaacReport)) {
			return false;
		}

		JanaacReport janaacReport = (JanaacReport)object;

		long primaryKey = janaacReport.getPrimaryKey();

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
	public CacheModel<JanaacReport> toCacheModel() {
		JanaacReportCacheModel janaacReportCacheModel =
			new JanaacReportCacheModel();

		janaacReportCacheModel.janaacReportId = getJanaacReportId();

		janaacReportCacheModel.groupId = getGroupId();

		janaacReportCacheModel.companyId = getCompanyId();

		janaacReportCacheModel.userId = getUserId();

		janaacReportCacheModel.userName = getUserName();

		String userName = janaacReportCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			janaacReportCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			janaacReportCacheModel.createDate = createDate.getTime();
		}
		else {
			janaacReportCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			janaacReportCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			janaacReportCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date dateOfReport = getDateOfReport();

		if (dateOfReport != null) {
			janaacReportCacheModel.dateOfReport = dateOfReport.getTime();
		}
		else {
			janaacReportCacheModel.dateOfReport = Long.MIN_VALUE;
		}

		janaacReportCacheModel.report = getReport();

		String report = janaacReportCacheModel.report;

		if ((report != null) && (report.length() == 0)) {
			janaacReportCacheModel.report = null;
		}

		janaacReportCacheModel.caseId = getCaseId();

		String caseId = janaacReportCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			janaacReportCacheModel.caseId = null;
		}

		return janaacReportCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<JanaacReport, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<JanaacReport, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<JanaacReport, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((JanaacReport)this);

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

		private static final Function<InvocationHandler, JanaacReport>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					JanaacReport.class, ModelWrapper.class);

	}

	private long _janaacReportId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private Date _dateOfReport;
	private String _report;
	private String _caseId;

	public <T> T getColumnValue(String columnName) {
		Function<JanaacReport, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((JanaacReport)this);
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

		_columnOriginalValues.put("janaacReportId", _janaacReportId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("dateOfReport", _dateOfReport);
		_columnOriginalValues.put("report", _report);
		_columnOriginalValues.put("caseId", _caseId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("janaacReportId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("dateOfReport", 128L);

		columnBitmasks.put("report", 256L);

		columnBitmasks.put("caseId", 512L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private JanaacReport _escapedModel;

}