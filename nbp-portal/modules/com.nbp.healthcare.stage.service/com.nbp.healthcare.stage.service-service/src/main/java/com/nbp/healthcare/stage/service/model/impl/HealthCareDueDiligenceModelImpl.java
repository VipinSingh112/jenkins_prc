/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model.impl;

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

import com.nbp.healthcare.stage.service.model.HealthCareDueDiligence;
import com.nbp.healthcare.stage.service.model.HealthCareDueDiligenceModel;

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
 * The base model implementation for the HealthCareDueDiligence service. Represents a row in the &quot;nbp_healthcare_duediligence&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>HealthCareDueDiligenceModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HealthCareDueDiligenceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligenceImpl
 * @generated
 */
@JSON(strict = true)
public class HealthCareDueDiligenceModelImpl
	extends BaseModelImpl<HealthCareDueDiligence>
	implements HealthCareDueDiligenceModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a health care due diligence model instance should use the <code>HealthCareDueDiligence</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_healthcare_duediligence";

	public static final Object[][] TABLE_COLUMNS = {
		{"healthDDId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"caseId", Types.VARCHAR},
		{"dateSubmittedAgency ", Types.TIMESTAMP},
		{"nameofAgency", Types.VARCHAR}, {"agencyDecision", Types.VARCHAR},
		{"reasonForObejction", Types.VARCHAR},
		{"durationOfPeriod", Types.VARCHAR}, {"date_", Types.TIMESTAMP},
		{"feedbackReceived", Types.TIMESTAMP}, {"Status", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("healthDDId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caseId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateSubmittedAgency ", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("nameofAgency", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("agencyDecision", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("reasonForObejction", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("durationOfPeriod", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("date_", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("feedbackReceived", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("Status", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_healthcare_duediligence (healthDDId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,caseId VARCHAR(75) null,dateSubmittedAgency  DATE null,nameofAgency VARCHAR(75) null,agencyDecision VARCHAR(75) null,reasonForObejction VARCHAR(75) null,durationOfPeriod VARCHAR(75) null,date_ DATE null,feedbackReceived DATE null,Status VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_healthcare_duediligence";

	public static final String ORDER_BY_JPQL =
		" ORDER BY healthCareDueDiligence.healthDDId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_healthcare_duediligence.healthDDId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CASEID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long NAMEOFAGENCY_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long HEALTHDDID_COLUMN_BITMASK = 4L;

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

	public HealthCareDueDiligenceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _healthDDId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setHealthDDId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _healthDDId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return HealthCareDueDiligence.class;
	}

	@Override
	public String getModelClassName() {
		return HealthCareDueDiligence.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<HealthCareDueDiligence, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<HealthCareDueDiligence, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<HealthCareDueDiligence, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((HealthCareDueDiligence)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<HealthCareDueDiligence, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<HealthCareDueDiligence, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(HealthCareDueDiligence)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<HealthCareDueDiligence, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<HealthCareDueDiligence, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<HealthCareDueDiligence, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<HealthCareDueDiligence, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<HealthCareDueDiligence, Object>>();

			attributeGetterFunctions.put(
				"healthDDId", HealthCareDueDiligence::getHealthDDId);
			attributeGetterFunctions.put(
				"groupId", HealthCareDueDiligence::getGroupId);
			attributeGetterFunctions.put(
				"companyId", HealthCareDueDiligence::getCompanyId);
			attributeGetterFunctions.put(
				"userId", HealthCareDueDiligence::getUserId);
			attributeGetterFunctions.put(
				"userName", HealthCareDueDiligence::getUserName);
			attributeGetterFunctions.put(
				"createDate", HealthCareDueDiligence::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", HealthCareDueDiligence::getModifiedDate);
			attributeGetterFunctions.put(
				"caseId", HealthCareDueDiligence::getCaseId);
			attributeGetterFunctions.put(
				"dateSubmittedAgency ",
				HealthCareDueDiligence::getDateSubmittedAgency);
			attributeGetterFunctions.put(
				"nameofAgency", HealthCareDueDiligence::getNameofAgency);
			attributeGetterFunctions.put(
				"agencyDecision", HealthCareDueDiligence::getAgencyDecision);
			attributeGetterFunctions.put(
				"reasonForObejction",
				HealthCareDueDiligence::getReasonForObejction);
			attributeGetterFunctions.put(
				"durationOfPeriod",
				HealthCareDueDiligence::getDurationOfPeriod);
			attributeGetterFunctions.put(
				"date", HealthCareDueDiligence::getDate);
			attributeGetterFunctions.put(
				"feedbackReceived",
				HealthCareDueDiligence::getFeedbackReceived);
			attributeGetterFunctions.put(
				"Status", HealthCareDueDiligence::getStatus);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<HealthCareDueDiligence, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<HealthCareDueDiligence, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<HealthCareDueDiligence, ?>>();

			attributeSetterBiConsumers.put(
				"healthDDId",
				(BiConsumer<HealthCareDueDiligence, Long>)
					HealthCareDueDiligence::setHealthDDId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<HealthCareDueDiligence, Long>)
					HealthCareDueDiligence::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<HealthCareDueDiligence, Long>)
					HealthCareDueDiligence::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<HealthCareDueDiligence, Long>)
					HealthCareDueDiligence::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<HealthCareDueDiligence, String>)
					HealthCareDueDiligence::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<HealthCareDueDiligence, Date>)
					HealthCareDueDiligence::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<HealthCareDueDiligence, Date>)
					HealthCareDueDiligence::setModifiedDate);
			attributeSetterBiConsumers.put(
				"caseId",
				(BiConsumer<HealthCareDueDiligence, String>)
					HealthCareDueDiligence::setCaseId);
			attributeSetterBiConsumers.put(
				"dateSubmittedAgency ",
				(BiConsumer<HealthCareDueDiligence, Date>)
					HealthCareDueDiligence::setDateSubmittedAgency);
			attributeSetterBiConsumers.put(
				"nameofAgency",
				(BiConsumer<HealthCareDueDiligence, String>)
					HealthCareDueDiligence::setNameofAgency);
			attributeSetterBiConsumers.put(
				"agencyDecision",
				(BiConsumer<HealthCareDueDiligence, String>)
					HealthCareDueDiligence::setAgencyDecision);
			attributeSetterBiConsumers.put(
				"reasonForObejction",
				(BiConsumer<HealthCareDueDiligence, String>)
					HealthCareDueDiligence::setReasonForObejction);
			attributeSetterBiConsumers.put(
				"durationOfPeriod",
				(BiConsumer<HealthCareDueDiligence, String>)
					HealthCareDueDiligence::setDurationOfPeriod);
			attributeSetterBiConsumers.put(
				"date",
				(BiConsumer<HealthCareDueDiligence, Date>)
					HealthCareDueDiligence::setDate);
			attributeSetterBiConsumers.put(
				"feedbackReceived",
				(BiConsumer<HealthCareDueDiligence, Date>)
					HealthCareDueDiligence::setFeedbackReceived);
			attributeSetterBiConsumers.put(
				"Status",
				(BiConsumer<HealthCareDueDiligence, String>)
					HealthCareDueDiligence::setStatus);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getHealthDDId() {
		return _healthDDId;
	}

	@Override
	public void setHealthDDId(long healthDDId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_healthDDId = healthDDId;
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
	public Date getDateSubmittedAgency() {
		return _dateSubmittedAgency;
	}

	@Override
	public void setDateSubmittedAgency(Date dateSubmittedAgency) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateSubmittedAgency = dateSubmittedAgency;
	}

	@JSON
	@Override
	public String getNameofAgency() {
		if (_nameofAgency == null) {
			return "";
		}
		else {
			return _nameofAgency;
		}
	}

	@Override
	public void setNameofAgency(String nameofAgency) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nameofAgency = nameofAgency;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalNameofAgency() {
		return getColumnOriginalValue("nameofAgency");
	}

	@JSON
	@Override
	public String getAgencyDecision() {
		if (_agencyDecision == null) {
			return "";
		}
		else {
			return _agencyDecision;
		}
	}

	@Override
	public void setAgencyDecision(String agencyDecision) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_agencyDecision = agencyDecision;
	}

	@JSON
	@Override
	public String getReasonForObejction() {
		if (_reasonForObejction == null) {
			return "";
		}
		else {
			return _reasonForObejction;
		}
	}

	@Override
	public void setReasonForObejction(String reasonForObejction) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_reasonForObejction = reasonForObejction;
	}

	@JSON
	@Override
	public String getDurationOfPeriod() {
		if (_durationOfPeriod == null) {
			return "";
		}
		else {
			return _durationOfPeriod;
		}
	}

	@Override
	public void setDurationOfPeriod(String durationOfPeriod) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_durationOfPeriod = durationOfPeriod;
	}

	@JSON
	@Override
	public Date getDate() {
		return _date;
	}

	@Override
	public void setDate(Date date) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_date = date;
	}

	@JSON
	@Override
	public Date getFeedbackReceived() {
		return _feedbackReceived;
	}

	@Override
	public void setFeedbackReceived(Date feedbackReceived) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_feedbackReceived = feedbackReceived;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_Status == null) {
			return "";
		}
		else {
			return _Status;
		}
	}

	@Override
	public void setStatus(String Status) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_Status = Status;
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
			getCompanyId(), HealthCareDueDiligence.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public HealthCareDueDiligence toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, HealthCareDueDiligence>
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
		HealthCareDueDiligenceImpl healthCareDueDiligenceImpl =
			new HealthCareDueDiligenceImpl();

		healthCareDueDiligenceImpl.setHealthDDId(getHealthDDId());
		healthCareDueDiligenceImpl.setGroupId(getGroupId());
		healthCareDueDiligenceImpl.setCompanyId(getCompanyId());
		healthCareDueDiligenceImpl.setUserId(getUserId());
		healthCareDueDiligenceImpl.setUserName(getUserName());
		healthCareDueDiligenceImpl.setCreateDate(getCreateDate());
		healthCareDueDiligenceImpl.setModifiedDate(getModifiedDate());
		healthCareDueDiligenceImpl.setCaseId(getCaseId());
		healthCareDueDiligenceImpl.setDateSubmittedAgency(
			getDateSubmittedAgency());
		healthCareDueDiligenceImpl.setNameofAgency(getNameofAgency());
		healthCareDueDiligenceImpl.setAgencyDecision(getAgencyDecision());
		healthCareDueDiligenceImpl.setReasonForObejction(
			getReasonForObejction());
		healthCareDueDiligenceImpl.setDurationOfPeriod(getDurationOfPeriod());
		healthCareDueDiligenceImpl.setDate(getDate());
		healthCareDueDiligenceImpl.setFeedbackReceived(getFeedbackReceived());
		healthCareDueDiligenceImpl.setStatus(getStatus());

		healthCareDueDiligenceImpl.resetOriginalValues();

		return healthCareDueDiligenceImpl;
	}

	@Override
	public HealthCareDueDiligence cloneWithOriginalValues() {
		HealthCareDueDiligenceImpl healthCareDueDiligenceImpl =
			new HealthCareDueDiligenceImpl();

		healthCareDueDiligenceImpl.setHealthDDId(
			this.<Long>getColumnOriginalValue("healthDDId"));
		healthCareDueDiligenceImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		healthCareDueDiligenceImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		healthCareDueDiligenceImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		healthCareDueDiligenceImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		healthCareDueDiligenceImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		healthCareDueDiligenceImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		healthCareDueDiligenceImpl.setCaseId(
			this.<String>getColumnOriginalValue("caseId"));
		healthCareDueDiligenceImpl.setDateSubmittedAgency(
			this.<Date>getColumnOriginalValue("dateSubmittedAgency "));
		healthCareDueDiligenceImpl.setNameofAgency(
			this.<String>getColumnOriginalValue("nameofAgency"));
		healthCareDueDiligenceImpl.setAgencyDecision(
			this.<String>getColumnOriginalValue("agencyDecision"));
		healthCareDueDiligenceImpl.setReasonForObejction(
			this.<String>getColumnOriginalValue("reasonForObejction"));
		healthCareDueDiligenceImpl.setDurationOfPeriod(
			this.<String>getColumnOriginalValue("durationOfPeriod"));
		healthCareDueDiligenceImpl.setDate(
			this.<Date>getColumnOriginalValue("date_"));
		healthCareDueDiligenceImpl.setFeedbackReceived(
			this.<Date>getColumnOriginalValue("feedbackReceived"));
		healthCareDueDiligenceImpl.setStatus(
			this.<String>getColumnOriginalValue("Status"));

		return healthCareDueDiligenceImpl;
	}

	@Override
	public int compareTo(HealthCareDueDiligence healthCareDueDiligence) {
		long primaryKey = healthCareDueDiligence.getPrimaryKey();

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

		if (!(object instanceof HealthCareDueDiligence)) {
			return false;
		}

		HealthCareDueDiligence healthCareDueDiligence =
			(HealthCareDueDiligence)object;

		long primaryKey = healthCareDueDiligence.getPrimaryKey();

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
	public CacheModel<HealthCareDueDiligence> toCacheModel() {
		HealthCareDueDiligenceCacheModel healthCareDueDiligenceCacheModel =
			new HealthCareDueDiligenceCacheModel();

		healthCareDueDiligenceCacheModel.healthDDId = getHealthDDId();

		healthCareDueDiligenceCacheModel.groupId = getGroupId();

		healthCareDueDiligenceCacheModel.companyId = getCompanyId();

		healthCareDueDiligenceCacheModel.userId = getUserId();

		healthCareDueDiligenceCacheModel.userName = getUserName();

		String userName = healthCareDueDiligenceCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			healthCareDueDiligenceCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			healthCareDueDiligenceCacheModel.createDate = createDate.getTime();
		}
		else {
			healthCareDueDiligenceCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			healthCareDueDiligenceCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			healthCareDueDiligenceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		healthCareDueDiligenceCacheModel.caseId = getCaseId();

		String caseId = healthCareDueDiligenceCacheModel.caseId;

		if ((caseId != null) && (caseId.length() == 0)) {
			healthCareDueDiligenceCacheModel.caseId = null;
		}

		Date dateSubmittedAgency = getDateSubmittedAgency();

		if (dateSubmittedAgency != null) {
			healthCareDueDiligenceCacheModel.dateSubmittedAgency =
				dateSubmittedAgency.getTime();
		}
		else {
			healthCareDueDiligenceCacheModel.dateSubmittedAgency =
				Long.MIN_VALUE;
		}

		healthCareDueDiligenceCacheModel.nameofAgency = getNameofAgency();

		String nameofAgency = healthCareDueDiligenceCacheModel.nameofAgency;

		if ((nameofAgency != null) && (nameofAgency.length() == 0)) {
			healthCareDueDiligenceCacheModel.nameofAgency = null;
		}

		healthCareDueDiligenceCacheModel.agencyDecision = getAgencyDecision();

		String agencyDecision = healthCareDueDiligenceCacheModel.agencyDecision;

		if ((agencyDecision != null) && (agencyDecision.length() == 0)) {
			healthCareDueDiligenceCacheModel.agencyDecision = null;
		}

		healthCareDueDiligenceCacheModel.reasonForObejction =
			getReasonForObejction();

		String reasonForObejction =
			healthCareDueDiligenceCacheModel.reasonForObejction;

		if ((reasonForObejction != null) &&
			(reasonForObejction.length() == 0)) {

			healthCareDueDiligenceCacheModel.reasonForObejction = null;
		}

		healthCareDueDiligenceCacheModel.durationOfPeriod =
			getDurationOfPeriod();

		String durationOfPeriod =
			healthCareDueDiligenceCacheModel.durationOfPeriod;

		if ((durationOfPeriod != null) && (durationOfPeriod.length() == 0)) {
			healthCareDueDiligenceCacheModel.durationOfPeriod = null;
		}

		Date date = getDate();

		if (date != null) {
			healthCareDueDiligenceCacheModel.date = date.getTime();
		}
		else {
			healthCareDueDiligenceCacheModel.date = Long.MIN_VALUE;
		}

		Date feedbackReceived = getFeedbackReceived();

		if (feedbackReceived != null) {
			healthCareDueDiligenceCacheModel.feedbackReceived =
				feedbackReceived.getTime();
		}
		else {
			healthCareDueDiligenceCacheModel.feedbackReceived = Long.MIN_VALUE;
		}

		healthCareDueDiligenceCacheModel.Status = getStatus();

		String Status = healthCareDueDiligenceCacheModel.Status;

		if ((Status != null) && (Status.length() == 0)) {
			healthCareDueDiligenceCacheModel.Status = null;
		}

		return healthCareDueDiligenceCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<HealthCareDueDiligence, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<HealthCareDueDiligence, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<HealthCareDueDiligence, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(HealthCareDueDiligence)this);

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

		private static final Function<InvocationHandler, HealthCareDueDiligence>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					HealthCareDueDiligence.class, ModelWrapper.class);

	}

	private long _healthDDId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _caseId;
	private Date _dateSubmittedAgency;
	private String _nameofAgency;
	private String _agencyDecision;
	private String _reasonForObejction;
	private String _durationOfPeriod;
	private Date _date;
	private Date _feedbackReceived;
	private String _Status;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<HealthCareDueDiligence, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((HealthCareDueDiligence)this);
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

		_columnOriginalValues.put("healthDDId", _healthDDId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("caseId", _caseId);
		_columnOriginalValues.put("dateSubmittedAgency ", _dateSubmittedAgency);
		_columnOriginalValues.put("nameofAgency", _nameofAgency);
		_columnOriginalValues.put("agencyDecision", _agencyDecision);
		_columnOriginalValues.put("reasonForObejction", _reasonForObejction);
		_columnOriginalValues.put("durationOfPeriod", _durationOfPeriod);
		_columnOriginalValues.put("date_", _date);
		_columnOriginalValues.put("feedbackReceived", _feedbackReceived);
		_columnOriginalValues.put("Status", _Status);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("date_", "date");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("healthDDId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("caseId", 128L);

		columnBitmasks.put("dateSubmittedAgency ", 256L);

		columnBitmasks.put("nameofAgency", 512L);

		columnBitmasks.put("agencyDecision", 1024L);

		columnBitmasks.put("reasonForObejction", 2048L);

		columnBitmasks.put("durationOfPeriod", 4096L);

		columnBitmasks.put("date_", 8192L);

		columnBitmasks.put("feedbackReceived", 16384L);

		columnBitmasks.put("Status", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private HealthCareDueDiligence _escapedModel;

}