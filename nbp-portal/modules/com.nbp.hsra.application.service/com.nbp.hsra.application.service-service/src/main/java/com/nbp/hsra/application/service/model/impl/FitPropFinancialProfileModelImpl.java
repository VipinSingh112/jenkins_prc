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

import com.nbp.hsra.application.service.model.FitPropFinancialProfile;
import com.nbp.hsra.application.service.model.FitPropFinancialProfileModel;

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
 * The base model implementation for the FitPropFinancialProfile service. Represents a row in the &quot;nbp_hsra_fitprop_financial&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>FitPropFinancialProfileModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FitPropFinancialProfileImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropFinancialProfileImpl
 * @generated
 */
@JSON(strict = true)
public class FitPropFinancialProfileModelImpl
	extends BaseModelImpl<FitPropFinancialProfile>
	implements FitPropFinancialProfileModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a fit prop financial profile model instance should use the <code>FitPropFinancialProfile</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_hsra_fitprop_financial";

	public static final Object[][] TABLE_COLUMNS = {
		{"fitPropFinancialProfileId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"financialInstitution", Types.VARCHAR},
		{"creditfacility", Types.VARCHAR}, {"surroundingAction", Types.VARCHAR},
		{"jamaicaInstitution", Types.VARCHAR},
		{"hsraApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("fitPropFinancialProfileId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("financialInstitution", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("creditfacility", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("surroundingAction", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("jamaicaInstitution", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hsraApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_hsra_fitprop_financial (fitPropFinancialProfileId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,financialInstitution VARCHAR(75) null,creditfacility VARCHAR(75) null,surroundingAction VARCHAR(75) null,jamaicaInstitution VARCHAR(75) null,hsraApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_hsra_fitprop_financial";

	public static final String ORDER_BY_JPQL =
		" ORDER BY fitPropFinancialProfile.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_hsra_fitprop_financial.createDate ASC";

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

	public FitPropFinancialProfileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _fitPropFinancialProfileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFitPropFinancialProfileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fitPropFinancialProfileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FitPropFinancialProfile.class;
	}

	@Override
	public String getModelClassName() {
		return FitPropFinancialProfile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<FitPropFinancialProfile, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<FitPropFinancialProfile, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FitPropFinancialProfile, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((FitPropFinancialProfile)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<FitPropFinancialProfile, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<FitPropFinancialProfile, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(FitPropFinancialProfile)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<FitPropFinancialProfile, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<FitPropFinancialProfile, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<FitPropFinancialProfile, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<FitPropFinancialProfile, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<FitPropFinancialProfile, Object>>();

			attributeGetterFunctions.put(
				"fitPropFinancialProfileId",
				FitPropFinancialProfile::getFitPropFinancialProfileId);
			attributeGetterFunctions.put(
				"groupId", FitPropFinancialProfile::getGroupId);
			attributeGetterFunctions.put(
				"companyId", FitPropFinancialProfile::getCompanyId);
			attributeGetterFunctions.put(
				"userId", FitPropFinancialProfile::getUserId);
			attributeGetterFunctions.put(
				"userName", FitPropFinancialProfile::getUserName);
			attributeGetterFunctions.put(
				"createDate", FitPropFinancialProfile::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", FitPropFinancialProfile::getModifiedDate);
			attributeGetterFunctions.put(
				"financialInstitution",
				FitPropFinancialProfile::getFinancialInstitution);
			attributeGetterFunctions.put(
				"creditfacility", FitPropFinancialProfile::getCreditfacility);
			attributeGetterFunctions.put(
				"surroundingAction",
				FitPropFinancialProfile::getSurroundingAction);
			attributeGetterFunctions.put(
				"jamaicaInstitution",
				FitPropFinancialProfile::getJamaicaInstitution);
			attributeGetterFunctions.put(
				"hsraApplicationId",
				FitPropFinancialProfile::getHsraApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<FitPropFinancialProfile, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<FitPropFinancialProfile, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<FitPropFinancialProfile, ?>>();

			attributeSetterBiConsumers.put(
				"fitPropFinancialProfileId",
				(BiConsumer<FitPropFinancialProfile, Long>)
					FitPropFinancialProfile::setFitPropFinancialProfileId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<FitPropFinancialProfile, Long>)
					FitPropFinancialProfile::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<FitPropFinancialProfile, Long>)
					FitPropFinancialProfile::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<FitPropFinancialProfile, Long>)
					FitPropFinancialProfile::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<FitPropFinancialProfile, String>)
					FitPropFinancialProfile::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<FitPropFinancialProfile, Date>)
					FitPropFinancialProfile::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<FitPropFinancialProfile, Date>)
					FitPropFinancialProfile::setModifiedDate);
			attributeSetterBiConsumers.put(
				"financialInstitution",
				(BiConsumer<FitPropFinancialProfile, String>)
					FitPropFinancialProfile::setFinancialInstitution);
			attributeSetterBiConsumers.put(
				"creditfacility",
				(BiConsumer<FitPropFinancialProfile, String>)
					FitPropFinancialProfile::setCreditfacility);
			attributeSetterBiConsumers.put(
				"surroundingAction",
				(BiConsumer<FitPropFinancialProfile, String>)
					FitPropFinancialProfile::setSurroundingAction);
			attributeSetterBiConsumers.put(
				"jamaicaInstitution",
				(BiConsumer<FitPropFinancialProfile, String>)
					FitPropFinancialProfile::setJamaicaInstitution);
			attributeSetterBiConsumers.put(
				"hsraApplicationId",
				(BiConsumer<FitPropFinancialProfile, Long>)
					FitPropFinancialProfile::setHsraApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getFitPropFinancialProfileId() {
		return _fitPropFinancialProfileId;
	}

	@Override
	public void setFitPropFinancialProfileId(long fitPropFinancialProfileId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fitPropFinancialProfileId = fitPropFinancialProfileId;
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
	public String getFinancialInstitution() {
		if (_financialInstitution == null) {
			return "";
		}
		else {
			return _financialInstitution;
		}
	}

	@Override
	public void setFinancialInstitution(String financialInstitution) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_financialInstitution = financialInstitution;
	}

	@JSON
	@Override
	public String getCreditfacility() {
		if (_creditfacility == null) {
			return "";
		}
		else {
			return _creditfacility;
		}
	}

	@Override
	public void setCreditfacility(String creditfacility) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_creditfacility = creditfacility;
	}

	@JSON
	@Override
	public String getSurroundingAction() {
		if (_surroundingAction == null) {
			return "";
		}
		else {
			return _surroundingAction;
		}
	}

	@Override
	public void setSurroundingAction(String surroundingAction) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_surroundingAction = surroundingAction;
	}

	@JSON
	@Override
	public String getJamaicaInstitution() {
		if (_jamaicaInstitution == null) {
			return "";
		}
		else {
			return _jamaicaInstitution;
		}
	}

	@Override
	public void setJamaicaInstitution(String jamaicaInstitution) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jamaicaInstitution = jamaicaInstitution;
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
			getCompanyId(), FitPropFinancialProfile.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FitPropFinancialProfile toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, FitPropFinancialProfile>
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
		FitPropFinancialProfileImpl fitPropFinancialProfileImpl =
			new FitPropFinancialProfileImpl();

		fitPropFinancialProfileImpl.setFitPropFinancialProfileId(
			getFitPropFinancialProfileId());
		fitPropFinancialProfileImpl.setGroupId(getGroupId());
		fitPropFinancialProfileImpl.setCompanyId(getCompanyId());
		fitPropFinancialProfileImpl.setUserId(getUserId());
		fitPropFinancialProfileImpl.setUserName(getUserName());
		fitPropFinancialProfileImpl.setCreateDate(getCreateDate());
		fitPropFinancialProfileImpl.setModifiedDate(getModifiedDate());
		fitPropFinancialProfileImpl.setFinancialInstitution(
			getFinancialInstitution());
		fitPropFinancialProfileImpl.setCreditfacility(getCreditfacility());
		fitPropFinancialProfileImpl.setSurroundingAction(
			getSurroundingAction());
		fitPropFinancialProfileImpl.setJamaicaInstitution(
			getJamaicaInstitution());
		fitPropFinancialProfileImpl.setHsraApplicationId(
			getHsraApplicationId());

		fitPropFinancialProfileImpl.resetOriginalValues();

		return fitPropFinancialProfileImpl;
	}

	@Override
	public FitPropFinancialProfile cloneWithOriginalValues() {
		FitPropFinancialProfileImpl fitPropFinancialProfileImpl =
			new FitPropFinancialProfileImpl();

		fitPropFinancialProfileImpl.setFitPropFinancialProfileId(
			this.<Long>getColumnOriginalValue("fitPropFinancialProfileId"));
		fitPropFinancialProfileImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		fitPropFinancialProfileImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		fitPropFinancialProfileImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		fitPropFinancialProfileImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		fitPropFinancialProfileImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		fitPropFinancialProfileImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		fitPropFinancialProfileImpl.setFinancialInstitution(
			this.<String>getColumnOriginalValue("financialInstitution"));
		fitPropFinancialProfileImpl.setCreditfacility(
			this.<String>getColumnOriginalValue("creditfacility"));
		fitPropFinancialProfileImpl.setSurroundingAction(
			this.<String>getColumnOriginalValue("surroundingAction"));
		fitPropFinancialProfileImpl.setJamaicaInstitution(
			this.<String>getColumnOriginalValue("jamaicaInstitution"));
		fitPropFinancialProfileImpl.setHsraApplicationId(
			this.<Long>getColumnOriginalValue("hsraApplicationId"));

		return fitPropFinancialProfileImpl;
	}

	@Override
	public int compareTo(FitPropFinancialProfile fitPropFinancialProfile) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), fitPropFinancialProfile.getCreateDate());

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

		if (!(object instanceof FitPropFinancialProfile)) {
			return false;
		}

		FitPropFinancialProfile fitPropFinancialProfile =
			(FitPropFinancialProfile)object;

		long primaryKey = fitPropFinancialProfile.getPrimaryKey();

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
	public CacheModel<FitPropFinancialProfile> toCacheModel() {
		FitPropFinancialProfileCacheModel fitPropFinancialProfileCacheModel =
			new FitPropFinancialProfileCacheModel();

		fitPropFinancialProfileCacheModel.fitPropFinancialProfileId =
			getFitPropFinancialProfileId();

		fitPropFinancialProfileCacheModel.groupId = getGroupId();

		fitPropFinancialProfileCacheModel.companyId = getCompanyId();

		fitPropFinancialProfileCacheModel.userId = getUserId();

		fitPropFinancialProfileCacheModel.userName = getUserName();

		String userName = fitPropFinancialProfileCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			fitPropFinancialProfileCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			fitPropFinancialProfileCacheModel.createDate = createDate.getTime();
		}
		else {
			fitPropFinancialProfileCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			fitPropFinancialProfileCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			fitPropFinancialProfileCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		fitPropFinancialProfileCacheModel.financialInstitution =
			getFinancialInstitution();

		String financialInstitution =
			fitPropFinancialProfileCacheModel.financialInstitution;

		if ((financialInstitution != null) &&
			(financialInstitution.length() == 0)) {

			fitPropFinancialProfileCacheModel.financialInstitution = null;
		}

		fitPropFinancialProfileCacheModel.creditfacility = getCreditfacility();

		String creditfacility =
			fitPropFinancialProfileCacheModel.creditfacility;

		if ((creditfacility != null) && (creditfacility.length() == 0)) {
			fitPropFinancialProfileCacheModel.creditfacility = null;
		}

		fitPropFinancialProfileCacheModel.surroundingAction =
			getSurroundingAction();

		String surroundingAction =
			fitPropFinancialProfileCacheModel.surroundingAction;

		if ((surroundingAction != null) && (surroundingAction.length() == 0)) {
			fitPropFinancialProfileCacheModel.surroundingAction = null;
		}

		fitPropFinancialProfileCacheModel.jamaicaInstitution =
			getJamaicaInstitution();

		String jamaicaInstitution =
			fitPropFinancialProfileCacheModel.jamaicaInstitution;

		if ((jamaicaInstitution != null) &&
			(jamaicaInstitution.length() == 0)) {

			fitPropFinancialProfileCacheModel.jamaicaInstitution = null;
		}

		fitPropFinancialProfileCacheModel.hsraApplicationId =
			getHsraApplicationId();

		return fitPropFinancialProfileCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<FitPropFinancialProfile, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<FitPropFinancialProfile, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<FitPropFinancialProfile, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(FitPropFinancialProfile)this);

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
			<InvocationHandler, FitPropFinancialProfile>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						FitPropFinancialProfile.class, ModelWrapper.class);

	}

	private long _fitPropFinancialProfileId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _financialInstitution;
	private String _creditfacility;
	private String _surroundingAction;
	private String _jamaicaInstitution;
	private long _hsraApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<FitPropFinancialProfile, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((FitPropFinancialProfile)this);
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
			"fitPropFinancialProfileId", _fitPropFinancialProfileId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"financialInstitution", _financialInstitution);
		_columnOriginalValues.put("creditfacility", _creditfacility);
		_columnOriginalValues.put("surroundingAction", _surroundingAction);
		_columnOriginalValues.put("jamaicaInstitution", _jamaicaInstitution);
		_columnOriginalValues.put("hsraApplicationId", _hsraApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("fitPropFinancialProfileId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("financialInstitution", 128L);

		columnBitmasks.put("creditfacility", 256L);

		columnBitmasks.put("surroundingAction", 512L);

		columnBitmasks.put("jamaicaInstitution", 1024L);

		columnBitmasks.put("hsraApplicationId", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private FitPropFinancialProfile _escapedModel;

}