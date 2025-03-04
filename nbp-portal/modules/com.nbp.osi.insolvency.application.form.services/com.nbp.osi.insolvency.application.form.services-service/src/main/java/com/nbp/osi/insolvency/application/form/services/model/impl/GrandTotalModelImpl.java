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

import com.nbp.osi.insolvency.application.form.services.model.GrandTotal;
import com.nbp.osi.insolvency.application.form.services.model.GrandTotalModel;

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
 * The base model implementation for the GrandTotal service. Represents a row in the &quot;nbp_osi_grand_total&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>GrandTotalModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GrandTotalImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GrandTotalImpl
 * @generated
 */
@JSON(strict = true)
public class GrandTotalModelImpl
	extends BaseModelImpl<GrandTotal> implements GrandTotalModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a grand total model instance should use the <code>GrandTotal</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_grand_total";

	public static final Object[][] TABLE_COLUMNS = {
		{"grandTotalId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"totalSecuredLiabilities", Types.VARCHAR},
		{"securedTotalMonthlyPayments", Types.VARCHAR},
		{"totalPreferredLiabilities", Types.VARCHAR},
		{"preferredTotalMonthlyPayments", Types.VARCHAR},
		{"totalUnsecuredLiabilities", Types.VARCHAR},
		{"unsecuredTotalMonthlyPayments", Types.VARCHAR},
		{"grandTotal", Types.VARCHAR}, {"osiInsolvencyId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("grandTotalId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("totalSecuredLiabilities", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("securedTotalMonthlyPayments", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("totalPreferredLiabilities", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("preferredTotalMonthlyPayments", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("totalUnsecuredLiabilities", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("unsecuredTotalMonthlyPayments", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("grandTotal", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiInsolvencyId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_grand_total (grandTotalId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,totalSecuredLiabilities VARCHAR(75) null,securedTotalMonthlyPayments VARCHAR(75) null,totalPreferredLiabilities VARCHAR(75) null,preferredTotalMonthlyPayments VARCHAR(75) null,totalUnsecuredLiabilities VARCHAR(75) null,unsecuredTotalMonthlyPayments VARCHAR(75) null,grandTotal VARCHAR(75) null,osiInsolvencyId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_grand_total";

	public static final String ORDER_BY_JPQL =
		" ORDER BY grandTotal.grandTotalId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_grand_total.grandTotalId ASC";

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
	public static final long GRANDTOTALID_COLUMN_BITMASK = 2L;

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

	public GrandTotalModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _grandTotalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGrandTotalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _grandTotalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return GrandTotal.class;
	}

	@Override
	public String getModelClassName() {
		return GrandTotal.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<GrandTotal, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<GrandTotal, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<GrandTotal, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((GrandTotal)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<GrandTotal, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<GrandTotal, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(GrandTotal)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<GrandTotal, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<GrandTotal, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<GrandTotal, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<GrandTotal, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<GrandTotal, Object>>();

			attributeGetterFunctions.put(
				"grandTotalId", GrandTotal::getGrandTotalId);
			attributeGetterFunctions.put("groupId", GrandTotal::getGroupId);
			attributeGetterFunctions.put("companyId", GrandTotal::getCompanyId);
			attributeGetterFunctions.put("userId", GrandTotal::getUserId);
			attributeGetterFunctions.put("userName", GrandTotal::getUserName);
			attributeGetterFunctions.put(
				"createDate", GrandTotal::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", GrandTotal::getModifiedDate);
			attributeGetterFunctions.put(
				"totalSecuredLiabilities",
				GrandTotal::getTotalSecuredLiabilities);
			attributeGetterFunctions.put(
				"securedTotalMonthlyPayments",
				GrandTotal::getSecuredTotalMonthlyPayments);
			attributeGetterFunctions.put(
				"totalPreferredLiabilities",
				GrandTotal::getTotalPreferredLiabilities);
			attributeGetterFunctions.put(
				"preferredTotalMonthlyPayments",
				GrandTotal::getPreferredTotalMonthlyPayments);
			attributeGetterFunctions.put(
				"totalUnsecuredLiabilities",
				GrandTotal::getTotalUnsecuredLiabilities);
			attributeGetterFunctions.put(
				"unsecuredTotalMonthlyPayments",
				GrandTotal::getUnsecuredTotalMonthlyPayments);
			attributeGetterFunctions.put(
				"grandTotal", GrandTotal::getGrandTotal);
			attributeGetterFunctions.put(
				"osiInsolvencyId", GrandTotal::getOsiInsolvencyId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<GrandTotal, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<GrandTotal, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<GrandTotal, ?>>();

			attributeSetterBiConsumers.put(
				"grandTotalId",
				(BiConsumer<GrandTotal, Long>)GrandTotal::setGrandTotalId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<GrandTotal, Long>)GrandTotal::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<GrandTotal, Long>)GrandTotal::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId", (BiConsumer<GrandTotal, Long>)GrandTotal::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<GrandTotal, String>)GrandTotal::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<GrandTotal, Date>)GrandTotal::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<GrandTotal, Date>)GrandTotal::setModifiedDate);
			attributeSetterBiConsumers.put(
				"totalSecuredLiabilities",
				(BiConsumer<GrandTotal, String>)
					GrandTotal::setTotalSecuredLiabilities);
			attributeSetterBiConsumers.put(
				"securedTotalMonthlyPayments",
				(BiConsumer<GrandTotal, String>)
					GrandTotal::setSecuredTotalMonthlyPayments);
			attributeSetterBiConsumers.put(
				"totalPreferredLiabilities",
				(BiConsumer<GrandTotal, String>)
					GrandTotal::setTotalPreferredLiabilities);
			attributeSetterBiConsumers.put(
				"preferredTotalMonthlyPayments",
				(BiConsumer<GrandTotal, String>)
					GrandTotal::setPreferredTotalMonthlyPayments);
			attributeSetterBiConsumers.put(
				"totalUnsecuredLiabilities",
				(BiConsumer<GrandTotal, String>)
					GrandTotal::setTotalUnsecuredLiabilities);
			attributeSetterBiConsumers.put(
				"unsecuredTotalMonthlyPayments",
				(BiConsumer<GrandTotal, String>)
					GrandTotal::setUnsecuredTotalMonthlyPayments);
			attributeSetterBiConsumers.put(
				"grandTotal",
				(BiConsumer<GrandTotal, String>)GrandTotal::setGrandTotal);
			attributeSetterBiConsumers.put(
				"osiInsolvencyId",
				(BiConsumer<GrandTotal, Long>)GrandTotal::setOsiInsolvencyId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getGrandTotalId() {
		return _grandTotalId;
	}

	@Override
	public void setGrandTotalId(long grandTotalId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_grandTotalId = grandTotalId;
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
	public String getTotalSecuredLiabilities() {
		if (_totalSecuredLiabilities == null) {
			return "";
		}
		else {
			return _totalSecuredLiabilities;
		}
	}

	@Override
	public void setTotalSecuredLiabilities(String totalSecuredLiabilities) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_totalSecuredLiabilities = totalSecuredLiabilities;
	}

	@JSON
	@Override
	public String getSecuredTotalMonthlyPayments() {
		if (_securedTotalMonthlyPayments == null) {
			return "";
		}
		else {
			return _securedTotalMonthlyPayments;
		}
	}

	@Override
	public void setSecuredTotalMonthlyPayments(
		String securedTotalMonthlyPayments) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_securedTotalMonthlyPayments = securedTotalMonthlyPayments;
	}

	@JSON
	@Override
	public String getTotalPreferredLiabilities() {
		if (_totalPreferredLiabilities == null) {
			return "";
		}
		else {
			return _totalPreferredLiabilities;
		}
	}

	@Override
	public void setTotalPreferredLiabilities(String totalPreferredLiabilities) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_totalPreferredLiabilities = totalPreferredLiabilities;
	}

	@JSON
	@Override
	public String getPreferredTotalMonthlyPayments() {
		if (_preferredTotalMonthlyPayments == null) {
			return "";
		}
		else {
			return _preferredTotalMonthlyPayments;
		}
	}

	@Override
	public void setPreferredTotalMonthlyPayments(
		String preferredTotalMonthlyPayments) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_preferredTotalMonthlyPayments = preferredTotalMonthlyPayments;
	}

	@JSON
	@Override
	public String getTotalUnsecuredLiabilities() {
		if (_totalUnsecuredLiabilities == null) {
			return "";
		}
		else {
			return _totalUnsecuredLiabilities;
		}
	}

	@Override
	public void setTotalUnsecuredLiabilities(String totalUnsecuredLiabilities) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_totalUnsecuredLiabilities = totalUnsecuredLiabilities;
	}

	@JSON
	@Override
	public String getUnsecuredTotalMonthlyPayments() {
		if (_unsecuredTotalMonthlyPayments == null) {
			return "";
		}
		else {
			return _unsecuredTotalMonthlyPayments;
		}
	}

	@Override
	public void setUnsecuredTotalMonthlyPayments(
		String unsecuredTotalMonthlyPayments) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_unsecuredTotalMonthlyPayments = unsecuredTotalMonthlyPayments;
	}

	@JSON
	@Override
	public String getGrandTotal() {
		if (_grandTotal == null) {
			return "";
		}
		else {
			return _grandTotal;
		}
	}

	@Override
	public void setGrandTotal(String grandTotal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_grandTotal = grandTotal;
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
			getCompanyId(), GrandTotal.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public GrandTotal toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, GrandTotal>
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
		GrandTotalImpl grandTotalImpl = new GrandTotalImpl();

		grandTotalImpl.setGrandTotalId(getGrandTotalId());
		grandTotalImpl.setGroupId(getGroupId());
		grandTotalImpl.setCompanyId(getCompanyId());
		grandTotalImpl.setUserId(getUserId());
		grandTotalImpl.setUserName(getUserName());
		grandTotalImpl.setCreateDate(getCreateDate());
		grandTotalImpl.setModifiedDate(getModifiedDate());
		grandTotalImpl.setTotalSecuredLiabilities(getTotalSecuredLiabilities());
		grandTotalImpl.setSecuredTotalMonthlyPayments(
			getSecuredTotalMonthlyPayments());
		grandTotalImpl.setTotalPreferredLiabilities(
			getTotalPreferredLiabilities());
		grandTotalImpl.setPreferredTotalMonthlyPayments(
			getPreferredTotalMonthlyPayments());
		grandTotalImpl.setTotalUnsecuredLiabilities(
			getTotalUnsecuredLiabilities());
		grandTotalImpl.setUnsecuredTotalMonthlyPayments(
			getUnsecuredTotalMonthlyPayments());
		grandTotalImpl.setGrandTotal(getGrandTotal());
		grandTotalImpl.setOsiInsolvencyId(getOsiInsolvencyId());

		grandTotalImpl.resetOriginalValues();

		return grandTotalImpl;
	}

	@Override
	public GrandTotal cloneWithOriginalValues() {
		GrandTotalImpl grandTotalImpl = new GrandTotalImpl();

		grandTotalImpl.setGrandTotalId(
			this.<Long>getColumnOriginalValue("grandTotalId"));
		grandTotalImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		grandTotalImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		grandTotalImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		grandTotalImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		grandTotalImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		grandTotalImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		grandTotalImpl.setTotalSecuredLiabilities(
			this.<String>getColumnOriginalValue("totalSecuredLiabilities"));
		grandTotalImpl.setSecuredTotalMonthlyPayments(
			this.<String>getColumnOriginalValue("securedTotalMonthlyPayments"));
		grandTotalImpl.setTotalPreferredLiabilities(
			this.<String>getColumnOriginalValue("totalPreferredLiabilities"));
		grandTotalImpl.setPreferredTotalMonthlyPayments(
			this.<String>getColumnOriginalValue(
				"preferredTotalMonthlyPayments"));
		grandTotalImpl.setTotalUnsecuredLiabilities(
			this.<String>getColumnOriginalValue("totalUnsecuredLiabilities"));
		grandTotalImpl.setUnsecuredTotalMonthlyPayments(
			this.<String>getColumnOriginalValue(
				"unsecuredTotalMonthlyPayments"));
		grandTotalImpl.setGrandTotal(
			this.<String>getColumnOriginalValue("grandTotal"));
		grandTotalImpl.setOsiInsolvencyId(
			this.<Long>getColumnOriginalValue("osiInsolvencyId"));

		return grandTotalImpl;
	}

	@Override
	public int compareTo(GrandTotal grandTotal) {
		long primaryKey = grandTotal.getPrimaryKey();

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

		if (!(object instanceof GrandTotal)) {
			return false;
		}

		GrandTotal grandTotal = (GrandTotal)object;

		long primaryKey = grandTotal.getPrimaryKey();

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
	public CacheModel<GrandTotal> toCacheModel() {
		GrandTotalCacheModel grandTotalCacheModel = new GrandTotalCacheModel();

		grandTotalCacheModel.grandTotalId = getGrandTotalId();

		grandTotalCacheModel.groupId = getGroupId();

		grandTotalCacheModel.companyId = getCompanyId();

		grandTotalCacheModel.userId = getUserId();

		grandTotalCacheModel.userName = getUserName();

		String userName = grandTotalCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			grandTotalCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			grandTotalCacheModel.createDate = createDate.getTime();
		}
		else {
			grandTotalCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			grandTotalCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			grandTotalCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		grandTotalCacheModel.totalSecuredLiabilities =
			getTotalSecuredLiabilities();

		String totalSecuredLiabilities =
			grandTotalCacheModel.totalSecuredLiabilities;

		if ((totalSecuredLiabilities != null) &&
			(totalSecuredLiabilities.length() == 0)) {

			grandTotalCacheModel.totalSecuredLiabilities = null;
		}

		grandTotalCacheModel.securedTotalMonthlyPayments =
			getSecuredTotalMonthlyPayments();

		String securedTotalMonthlyPayments =
			grandTotalCacheModel.securedTotalMonthlyPayments;

		if ((securedTotalMonthlyPayments != null) &&
			(securedTotalMonthlyPayments.length() == 0)) {

			grandTotalCacheModel.securedTotalMonthlyPayments = null;
		}

		grandTotalCacheModel.totalPreferredLiabilities =
			getTotalPreferredLiabilities();

		String totalPreferredLiabilities =
			grandTotalCacheModel.totalPreferredLiabilities;

		if ((totalPreferredLiabilities != null) &&
			(totalPreferredLiabilities.length() == 0)) {

			grandTotalCacheModel.totalPreferredLiabilities = null;
		}

		grandTotalCacheModel.preferredTotalMonthlyPayments =
			getPreferredTotalMonthlyPayments();

		String preferredTotalMonthlyPayments =
			grandTotalCacheModel.preferredTotalMonthlyPayments;

		if ((preferredTotalMonthlyPayments != null) &&
			(preferredTotalMonthlyPayments.length() == 0)) {

			grandTotalCacheModel.preferredTotalMonthlyPayments = null;
		}

		grandTotalCacheModel.totalUnsecuredLiabilities =
			getTotalUnsecuredLiabilities();

		String totalUnsecuredLiabilities =
			grandTotalCacheModel.totalUnsecuredLiabilities;

		if ((totalUnsecuredLiabilities != null) &&
			(totalUnsecuredLiabilities.length() == 0)) {

			grandTotalCacheModel.totalUnsecuredLiabilities = null;
		}

		grandTotalCacheModel.unsecuredTotalMonthlyPayments =
			getUnsecuredTotalMonthlyPayments();

		String unsecuredTotalMonthlyPayments =
			grandTotalCacheModel.unsecuredTotalMonthlyPayments;

		if ((unsecuredTotalMonthlyPayments != null) &&
			(unsecuredTotalMonthlyPayments.length() == 0)) {

			grandTotalCacheModel.unsecuredTotalMonthlyPayments = null;
		}

		grandTotalCacheModel.grandTotal = getGrandTotal();

		String grandTotal = grandTotalCacheModel.grandTotal;

		if ((grandTotal != null) && (grandTotal.length() == 0)) {
			grandTotalCacheModel.grandTotal = null;
		}

		grandTotalCacheModel.osiInsolvencyId = getOsiInsolvencyId();

		return grandTotalCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<GrandTotal, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<GrandTotal, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<GrandTotal, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((GrandTotal)this);

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

		private static final Function<InvocationHandler, GrandTotal>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					GrandTotal.class, ModelWrapper.class);

	}

	private long _grandTotalId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _totalSecuredLiabilities;
	private String _securedTotalMonthlyPayments;
	private String _totalPreferredLiabilities;
	private String _preferredTotalMonthlyPayments;
	private String _totalUnsecuredLiabilities;
	private String _unsecuredTotalMonthlyPayments;
	private String _grandTotal;
	private long _osiInsolvencyId;

	public <T> T getColumnValue(String columnName) {
		Function<GrandTotal, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((GrandTotal)this);
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

		_columnOriginalValues.put("grandTotalId", _grandTotalId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"totalSecuredLiabilities", _totalSecuredLiabilities);
		_columnOriginalValues.put(
			"securedTotalMonthlyPayments", _securedTotalMonthlyPayments);
		_columnOriginalValues.put(
			"totalPreferredLiabilities", _totalPreferredLiabilities);
		_columnOriginalValues.put(
			"preferredTotalMonthlyPayments", _preferredTotalMonthlyPayments);
		_columnOriginalValues.put(
			"totalUnsecuredLiabilities", _totalUnsecuredLiabilities);
		_columnOriginalValues.put(
			"unsecuredTotalMonthlyPayments", _unsecuredTotalMonthlyPayments);
		_columnOriginalValues.put("grandTotal", _grandTotal);
		_columnOriginalValues.put("osiInsolvencyId", _osiInsolvencyId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("grandTotalId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("totalSecuredLiabilities", 128L);

		columnBitmasks.put("securedTotalMonthlyPayments", 256L);

		columnBitmasks.put("totalPreferredLiabilities", 512L);

		columnBitmasks.put("preferredTotalMonthlyPayments", 1024L);

		columnBitmasks.put("totalUnsecuredLiabilities", 2048L);

		columnBitmasks.put("unsecuredTotalMonthlyPayments", 4096L);

		columnBitmasks.put("grandTotal", 8192L);

		columnBitmasks.put("osiInsolvencyId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private GrandTotal _escapedModel;

}