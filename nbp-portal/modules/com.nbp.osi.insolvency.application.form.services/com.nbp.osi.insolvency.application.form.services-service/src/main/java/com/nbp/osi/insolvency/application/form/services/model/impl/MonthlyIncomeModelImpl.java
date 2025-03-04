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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncomeModel;

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
 * The base model implementation for the MonthlyIncome service. Represents a row in the &quot;nbp_osi_monthly_income&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>MonthlyIncomeModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MonthlyIncomeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MonthlyIncomeImpl
 * @generated
 */
@JSON(strict = true)
public class MonthlyIncomeModelImpl
	extends BaseModelImpl<MonthlyIncome> implements MonthlyIncomeModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a monthly income model instance should use the <code>MonthlyIncome</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_monthly_income";

	public static final Object[][] TABLE_COLUMNS = {
		{"monthlyIncomeId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"basicSalary", Types.VARCHAR},
		{"grossSalary", Types.VARCHAR}, {"statutoryDeduction", Types.VARCHAR},
		{"otherDeductions", Types.VARCHAR}, {"loanDeductions", Types.VARCHAR},
		{"totalDeductions", Types.VARCHAR}, {"netSalary", Types.VARCHAR},
		{"otherIncome", Types.VARCHAR}, {"incomeToCover", Types.VARCHAR},
		{"osiInsolvencyId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("monthlyIncomeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("basicSalary", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("grossSalary", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statutoryDeduction", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("otherDeductions", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("loanDeductions", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("totalDeductions", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("netSalary", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("otherIncome", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("incomeToCover", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiInsolvencyId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_monthly_income (monthlyIncomeId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,basicSalary VARCHAR(75) null,grossSalary VARCHAR(75) null,statutoryDeduction VARCHAR(75) null,otherDeductions VARCHAR(75) null,loanDeductions VARCHAR(75) null,totalDeductions VARCHAR(75) null,netSalary VARCHAR(75) null,otherIncome VARCHAR(75) null,incomeToCover VARCHAR(75) null,osiInsolvencyId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_monthly_income";

	public static final String ORDER_BY_JPQL =
		" ORDER BY monthlyIncome.monthlyIncomeId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_monthly_income.monthlyIncomeId ASC";

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
	public static final long MONTHLYINCOMEID_COLUMN_BITMASK = 2L;

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

	public MonthlyIncomeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _monthlyIncomeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMonthlyIncomeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _monthlyIncomeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return MonthlyIncome.class;
	}

	@Override
	public String getModelClassName() {
		return MonthlyIncome.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<MonthlyIncome, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<MonthlyIncome, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MonthlyIncome, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((MonthlyIncome)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<MonthlyIncome, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<MonthlyIncome, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(MonthlyIncome)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<MonthlyIncome, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<MonthlyIncome, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<MonthlyIncome, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<MonthlyIncome, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<MonthlyIncome, Object>>();

			attributeGetterFunctions.put(
				"monthlyIncomeId", MonthlyIncome::getMonthlyIncomeId);
			attributeGetterFunctions.put("groupId", MonthlyIncome::getGroupId);
			attributeGetterFunctions.put(
				"companyId", MonthlyIncome::getCompanyId);
			attributeGetterFunctions.put("userId", MonthlyIncome::getUserId);
			attributeGetterFunctions.put(
				"userName", MonthlyIncome::getUserName);
			attributeGetterFunctions.put(
				"createDate", MonthlyIncome::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", MonthlyIncome::getModifiedDate);
			attributeGetterFunctions.put(
				"basicSalary", MonthlyIncome::getBasicSalary);
			attributeGetterFunctions.put(
				"grossSalary", MonthlyIncome::getGrossSalary);
			attributeGetterFunctions.put(
				"statutoryDeduction", MonthlyIncome::getStatutoryDeduction);
			attributeGetterFunctions.put(
				"otherDeductions", MonthlyIncome::getOtherDeductions);
			attributeGetterFunctions.put(
				"loanDeductions", MonthlyIncome::getLoanDeductions);
			attributeGetterFunctions.put(
				"totalDeductions", MonthlyIncome::getTotalDeductions);
			attributeGetterFunctions.put(
				"netSalary", MonthlyIncome::getNetSalary);
			attributeGetterFunctions.put(
				"otherIncome", MonthlyIncome::getOtherIncome);
			attributeGetterFunctions.put(
				"incomeToCover", MonthlyIncome::getIncomeToCover);
			attributeGetterFunctions.put(
				"osiInsolvencyId", MonthlyIncome::getOsiInsolvencyId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<MonthlyIncome, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<MonthlyIncome, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap<String, BiConsumer<MonthlyIncome, ?>>();

			attributeSetterBiConsumers.put(
				"monthlyIncomeId",
				(BiConsumer<MonthlyIncome, Long>)
					MonthlyIncome::setMonthlyIncomeId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<MonthlyIncome, Long>)MonthlyIncome::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<MonthlyIncome, Long>)MonthlyIncome::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<MonthlyIncome, Long>)MonthlyIncome::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<MonthlyIncome, String>)MonthlyIncome::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<MonthlyIncome, Date>)MonthlyIncome::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<MonthlyIncome, Date>)
					MonthlyIncome::setModifiedDate);
			attributeSetterBiConsumers.put(
				"basicSalary",
				(BiConsumer<MonthlyIncome, String>)
					MonthlyIncome::setBasicSalary);
			attributeSetterBiConsumers.put(
				"grossSalary",
				(BiConsumer<MonthlyIncome, String>)
					MonthlyIncome::setGrossSalary);
			attributeSetterBiConsumers.put(
				"statutoryDeduction",
				(BiConsumer<MonthlyIncome, String>)
					MonthlyIncome::setStatutoryDeduction);
			attributeSetterBiConsumers.put(
				"otherDeductions",
				(BiConsumer<MonthlyIncome, String>)
					MonthlyIncome::setOtherDeductions);
			attributeSetterBiConsumers.put(
				"loanDeductions",
				(BiConsumer<MonthlyIncome, String>)
					MonthlyIncome::setLoanDeductions);
			attributeSetterBiConsumers.put(
				"totalDeductions",
				(BiConsumer<MonthlyIncome, String>)
					MonthlyIncome::setTotalDeductions);
			attributeSetterBiConsumers.put(
				"netSalary",
				(BiConsumer<MonthlyIncome, String>)MonthlyIncome::setNetSalary);
			attributeSetterBiConsumers.put(
				"otherIncome",
				(BiConsumer<MonthlyIncome, String>)
					MonthlyIncome::setOtherIncome);
			attributeSetterBiConsumers.put(
				"incomeToCover",
				(BiConsumer<MonthlyIncome, String>)
					MonthlyIncome::setIncomeToCover);
			attributeSetterBiConsumers.put(
				"osiInsolvencyId",
				(BiConsumer<MonthlyIncome, Long>)
					MonthlyIncome::setOsiInsolvencyId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getMonthlyIncomeId() {
		return _monthlyIncomeId;
	}

	@Override
	public void setMonthlyIncomeId(long monthlyIncomeId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_monthlyIncomeId = monthlyIncomeId;
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
	public String getBasicSalary() {
		if (_basicSalary == null) {
			return "";
		}
		else {
			return _basicSalary;
		}
	}

	@Override
	public void setBasicSalary(String basicSalary) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_basicSalary = basicSalary;
	}

	@JSON
	@Override
	public String getGrossSalary() {
		if (_grossSalary == null) {
			return "";
		}
		else {
			return _grossSalary;
		}
	}

	@Override
	public void setGrossSalary(String grossSalary) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_grossSalary = grossSalary;
	}

	@JSON
	@Override
	public String getStatutoryDeduction() {
		if (_statutoryDeduction == null) {
			return "";
		}
		else {
			return _statutoryDeduction;
		}
	}

	@Override
	public void setStatutoryDeduction(String statutoryDeduction) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_statutoryDeduction = statutoryDeduction;
	}

	@JSON
	@Override
	public String getOtherDeductions() {
		if (_otherDeductions == null) {
			return "";
		}
		else {
			return _otherDeductions;
		}
	}

	@Override
	public void setOtherDeductions(String otherDeductions) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_otherDeductions = otherDeductions;
	}

	@JSON
	@Override
	public String getLoanDeductions() {
		if (_loanDeductions == null) {
			return "";
		}
		else {
			return _loanDeductions;
		}
	}

	@Override
	public void setLoanDeductions(String loanDeductions) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_loanDeductions = loanDeductions;
	}

	@JSON
	@Override
	public String getTotalDeductions() {
		if (_totalDeductions == null) {
			return "";
		}
		else {
			return _totalDeductions;
		}
	}

	@Override
	public void setTotalDeductions(String totalDeductions) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_totalDeductions = totalDeductions;
	}

	@JSON
	@Override
	public String getNetSalary() {
		if (_netSalary == null) {
			return "";
		}
		else {
			return _netSalary;
		}
	}

	@Override
	public void setNetSalary(String netSalary) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_netSalary = netSalary;
	}

	@JSON
	@Override
	public String getOtherIncome() {
		if (_otherIncome == null) {
			return "";
		}
		else {
			return _otherIncome;
		}
	}

	@Override
	public void setOtherIncome(String otherIncome) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_otherIncome = otherIncome;
	}

	@JSON
	@Override
	public String getIncomeToCover() {
		if (_incomeToCover == null) {
			return "";
		}
		else {
			return _incomeToCover;
		}
	}

	@Override
	public void setIncomeToCover(String incomeToCover) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_incomeToCover = incomeToCover;
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
			getCompanyId(), MonthlyIncome.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public MonthlyIncome toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, MonthlyIncome>
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
		MonthlyIncomeImpl monthlyIncomeImpl = new MonthlyIncomeImpl();

		monthlyIncomeImpl.setMonthlyIncomeId(getMonthlyIncomeId());
		monthlyIncomeImpl.setGroupId(getGroupId());
		monthlyIncomeImpl.setCompanyId(getCompanyId());
		monthlyIncomeImpl.setUserId(getUserId());
		monthlyIncomeImpl.setUserName(getUserName());
		monthlyIncomeImpl.setCreateDate(getCreateDate());
		monthlyIncomeImpl.setModifiedDate(getModifiedDate());
		monthlyIncomeImpl.setBasicSalary(getBasicSalary());
		monthlyIncomeImpl.setGrossSalary(getGrossSalary());
		monthlyIncomeImpl.setStatutoryDeduction(getStatutoryDeduction());
		monthlyIncomeImpl.setOtherDeductions(getOtherDeductions());
		monthlyIncomeImpl.setLoanDeductions(getLoanDeductions());
		monthlyIncomeImpl.setTotalDeductions(getTotalDeductions());
		monthlyIncomeImpl.setNetSalary(getNetSalary());
		monthlyIncomeImpl.setOtherIncome(getOtherIncome());
		monthlyIncomeImpl.setIncomeToCover(getIncomeToCover());
		monthlyIncomeImpl.setOsiInsolvencyId(getOsiInsolvencyId());

		monthlyIncomeImpl.resetOriginalValues();

		return monthlyIncomeImpl;
	}

	@Override
	public MonthlyIncome cloneWithOriginalValues() {
		MonthlyIncomeImpl monthlyIncomeImpl = new MonthlyIncomeImpl();

		monthlyIncomeImpl.setMonthlyIncomeId(
			this.<Long>getColumnOriginalValue("monthlyIncomeId"));
		monthlyIncomeImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		monthlyIncomeImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		monthlyIncomeImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		monthlyIncomeImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		monthlyIncomeImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		monthlyIncomeImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		monthlyIncomeImpl.setBasicSalary(
			this.<String>getColumnOriginalValue("basicSalary"));
		monthlyIncomeImpl.setGrossSalary(
			this.<String>getColumnOriginalValue("grossSalary"));
		monthlyIncomeImpl.setStatutoryDeduction(
			this.<String>getColumnOriginalValue("statutoryDeduction"));
		monthlyIncomeImpl.setOtherDeductions(
			this.<String>getColumnOriginalValue("otherDeductions"));
		monthlyIncomeImpl.setLoanDeductions(
			this.<String>getColumnOriginalValue("loanDeductions"));
		monthlyIncomeImpl.setTotalDeductions(
			this.<String>getColumnOriginalValue("totalDeductions"));
		monthlyIncomeImpl.setNetSalary(
			this.<String>getColumnOriginalValue("netSalary"));
		monthlyIncomeImpl.setOtherIncome(
			this.<String>getColumnOriginalValue("otherIncome"));
		monthlyIncomeImpl.setIncomeToCover(
			this.<String>getColumnOriginalValue("incomeToCover"));
		monthlyIncomeImpl.setOsiInsolvencyId(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));

		return monthlyIncomeImpl;
	}

	@Override
	public int compareTo(MonthlyIncome monthlyIncome) {
		long primaryKey = monthlyIncome.getPrimaryKey();

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

		if (!(object instanceof MonthlyIncome)) {
			return false;
		}

		MonthlyIncome monthlyIncome = (MonthlyIncome)object;

		long primaryKey = monthlyIncome.getPrimaryKey();

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
	public CacheModel<MonthlyIncome> toCacheModel() {
		MonthlyIncomeCacheModel monthlyIncomeCacheModel =
			new MonthlyIncomeCacheModel();

		monthlyIncomeCacheModel.monthlyIncomeId = getMonthlyIncomeId();

		monthlyIncomeCacheModel.groupId = getGroupId();

		monthlyIncomeCacheModel.companyId = getCompanyId();

		monthlyIncomeCacheModel.userId = getUserId();

		monthlyIncomeCacheModel.userName = getUserName();

		String userName = monthlyIncomeCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			monthlyIncomeCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			monthlyIncomeCacheModel.createDate = createDate.getTime();
		}
		else {
			monthlyIncomeCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			monthlyIncomeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			monthlyIncomeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		monthlyIncomeCacheModel.basicSalary = getBasicSalary();

		String basicSalary = monthlyIncomeCacheModel.basicSalary;

		if ((basicSalary != null) && (basicSalary.length() == 0)) {
			monthlyIncomeCacheModel.basicSalary = null;
		}

		monthlyIncomeCacheModel.grossSalary = getGrossSalary();

		String grossSalary = monthlyIncomeCacheModel.grossSalary;

		if ((grossSalary != null) && (grossSalary.length() == 0)) {
			monthlyIncomeCacheModel.grossSalary = null;
		}

		monthlyIncomeCacheModel.statutoryDeduction = getStatutoryDeduction();

		String statutoryDeduction = monthlyIncomeCacheModel.statutoryDeduction;

		if ((statutoryDeduction != null) &&
			(statutoryDeduction.length() == 0)) {

			monthlyIncomeCacheModel.statutoryDeduction = null;
		}

		monthlyIncomeCacheModel.otherDeductions = getOtherDeductions();

		String otherDeductions = monthlyIncomeCacheModel.otherDeductions;

		if ((otherDeductions != null) && (otherDeductions.length() == 0)) {
			monthlyIncomeCacheModel.otherDeductions = null;
		}

		monthlyIncomeCacheModel.loanDeductions = getLoanDeductions();

		String loanDeductions = monthlyIncomeCacheModel.loanDeductions;

		if ((loanDeductions != null) && (loanDeductions.length() == 0)) {
			monthlyIncomeCacheModel.loanDeductions = null;
		}

		monthlyIncomeCacheModel.totalDeductions = getTotalDeductions();

		String totalDeductions = monthlyIncomeCacheModel.totalDeductions;

		if ((totalDeductions != null) && (totalDeductions.length() == 0)) {
			monthlyIncomeCacheModel.totalDeductions = null;
		}

		monthlyIncomeCacheModel.netSalary = getNetSalary();

		String netSalary = monthlyIncomeCacheModel.netSalary;

		if ((netSalary != null) && (netSalary.length() == 0)) {
			monthlyIncomeCacheModel.netSalary = null;
		}

		monthlyIncomeCacheModel.otherIncome = getOtherIncome();

		String otherIncome = monthlyIncomeCacheModel.otherIncome;

		if ((otherIncome != null) && (otherIncome.length() == 0)) {
			monthlyIncomeCacheModel.otherIncome = null;
		}

		monthlyIncomeCacheModel.incomeToCover = getIncomeToCover();

		String incomeToCover = monthlyIncomeCacheModel.incomeToCover;

		if ((incomeToCover != null) && (incomeToCover.length() == 0)) {
			monthlyIncomeCacheModel.incomeToCover = null;
		}

		monthlyIncomeCacheModel.osiInsolvencyId = getOsiInsolvencyId();

		return monthlyIncomeCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<MonthlyIncome, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<MonthlyIncome, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<MonthlyIncome, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((MonthlyIncome)this);

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

		private static final Function<InvocationHandler, MonthlyIncome>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					MonthlyIncome.class, ModelWrapper.class);

	}

	private long _monthlyIncomeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _basicSalary;
	private String _grossSalary;
	private String _statutoryDeduction;
	private String _otherDeductions;
	private String _loanDeductions;
	private String _totalDeductions;
	private String _netSalary;
	private String _otherIncome;
	private String _incomeToCover;
	private long _osiInsolvencyId;

	public <T> T getColumnValue(String columnName) {
		Function<MonthlyIncome, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((MonthlyIncome)this);
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

		_columnOriginalValues.put("monthlyIncomeId", _monthlyIncomeId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("basicSalary", _basicSalary);
		_columnOriginalValues.put("grossSalary", _grossSalary);
		_columnOriginalValues.put("statutoryDeduction", _statutoryDeduction);
		_columnOriginalValues.put("otherDeductions", _otherDeductions);
		_columnOriginalValues.put("loanDeductions", _loanDeductions);
		_columnOriginalValues.put("totalDeductions", _totalDeductions);
		_columnOriginalValues.put("netSalary", _netSalary);
		_columnOriginalValues.put("otherIncome", _otherIncome);
		_columnOriginalValues.put("incomeToCover", _incomeToCover);
		_columnOriginalValues.put("osiInsolvencyId", _osiInsolvencyId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("monthlyIncomeId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("basicSalary", 128L);

		columnBitmasks.put("grossSalary", 256L);

		columnBitmasks.put("statutoryDeduction", 512L);

		columnBitmasks.put("otherDeductions", 1024L);

		columnBitmasks.put("loanDeductions", 2048L);

		columnBitmasks.put("totalDeductions", 4096L);

		columnBitmasks.put("netSalary", 8192L);

		columnBitmasks.put("otherIncome", 16384L);

		columnBitmasks.put("incomeToCover", 32768L);

		columnBitmasks.put("osiInsolvencyId", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private MonthlyIncome _escapedModel;

}