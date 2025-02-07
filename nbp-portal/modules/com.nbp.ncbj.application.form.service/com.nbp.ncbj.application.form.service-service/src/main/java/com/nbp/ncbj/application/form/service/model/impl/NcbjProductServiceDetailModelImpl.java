/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model.impl;

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

import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;
import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetailModel;

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
 * The base model implementation for the NcbjProductServiceDetail service. Represents a row in the &quot;nbp_ncbj_product_service&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>NcbjProductServiceDetailModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjProductServiceDetailImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjProductServiceDetailImpl
 * @generated
 */
@JSON(strict = true)
public class NcbjProductServiceDetailModelImpl
	extends BaseModelImpl<NcbjProductServiceDetail>
	implements NcbjProductServiceDetailModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj product service detail model instance should use the <code>NcbjProductServiceDetail</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_ncbj_product_service";

	public static final Object[][] TABLE_COLUMNS = {
		{"ncbjProductServiceDetailId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"productType", Types.VARCHAR},
		{"productList", Types.VARCHAR}, {"productLines", Types.VARCHAR},
		{"counter", Types.VARCHAR}, {"ncbjApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("ncbjProductServiceDetailId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("productType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("productList", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("productLines", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("counter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ncbjApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_ncbj_product_service (ncbjProductServiceDetailId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,productType VARCHAR(75) null,productList VARCHAR(75) null,productLines VARCHAR(75) null,counter VARCHAR(75) null,ncbjApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_ncbj_product_service";

	public static final String ORDER_BY_JPQL =
		" ORDER BY ncbjProductServiceDetail.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_ncbj_product_service.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long NCBJAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public NcbjProductServiceDetailModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ncbjProductServiceDetailId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNcbjProductServiceDetailId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ncbjProductServiceDetailId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return NcbjProductServiceDetail.class;
	}

	@Override
	public String getModelClassName() {
		return NcbjProductServiceDetail.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<NcbjProductServiceDetail, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<NcbjProductServiceDetail, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcbjProductServiceDetail, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((NcbjProductServiceDetail)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<NcbjProductServiceDetail, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<NcbjProductServiceDetail, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(NcbjProductServiceDetail)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<NcbjProductServiceDetail, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<NcbjProductServiceDetail, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<NcbjProductServiceDetail, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<NcbjProductServiceDetail, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<NcbjProductServiceDetail, Object>>();

			attributeGetterFunctions.put(
				"ncbjProductServiceDetailId",
				NcbjProductServiceDetail::getNcbjProductServiceDetailId);
			attributeGetterFunctions.put(
				"groupId", NcbjProductServiceDetail::getGroupId);
			attributeGetterFunctions.put(
				"companyId", NcbjProductServiceDetail::getCompanyId);
			attributeGetterFunctions.put(
				"userId", NcbjProductServiceDetail::getUserId);
			attributeGetterFunctions.put(
				"userName", NcbjProductServiceDetail::getUserName);
			attributeGetterFunctions.put(
				"createDate", NcbjProductServiceDetail::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", NcbjProductServiceDetail::getModifiedDate);
			attributeGetterFunctions.put(
				"productType", NcbjProductServiceDetail::getProductType);
			attributeGetterFunctions.put(
				"productList", NcbjProductServiceDetail::getProductList);
			attributeGetterFunctions.put(
				"productLines", NcbjProductServiceDetail::getProductLines);
			attributeGetterFunctions.put(
				"counter", NcbjProductServiceDetail::getCounter);
			attributeGetterFunctions.put(
				"ncbjApplicationId",
				NcbjProductServiceDetail::getNcbjApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<NcbjProductServiceDetail, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<NcbjProductServiceDetail, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<NcbjProductServiceDetail, ?>>();

			attributeSetterBiConsumers.put(
				"ncbjProductServiceDetailId",
				(BiConsumer<NcbjProductServiceDetail, Long>)
					NcbjProductServiceDetail::setNcbjProductServiceDetailId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<NcbjProductServiceDetail, Long>)
					NcbjProductServiceDetail::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<NcbjProductServiceDetail, Long>)
					NcbjProductServiceDetail::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<NcbjProductServiceDetail, Long>)
					NcbjProductServiceDetail::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<NcbjProductServiceDetail, String>)
					NcbjProductServiceDetail::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<NcbjProductServiceDetail, Date>)
					NcbjProductServiceDetail::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<NcbjProductServiceDetail, Date>)
					NcbjProductServiceDetail::setModifiedDate);
			attributeSetterBiConsumers.put(
				"productType",
				(BiConsumer<NcbjProductServiceDetail, String>)
					NcbjProductServiceDetail::setProductType);
			attributeSetterBiConsumers.put(
				"productList",
				(BiConsumer<NcbjProductServiceDetail, String>)
					NcbjProductServiceDetail::setProductList);
			attributeSetterBiConsumers.put(
				"productLines",
				(BiConsumer<NcbjProductServiceDetail, String>)
					NcbjProductServiceDetail::setProductLines);
			attributeSetterBiConsumers.put(
				"counter",
				(BiConsumer<NcbjProductServiceDetail, String>)
					NcbjProductServiceDetail::setCounter);
			attributeSetterBiConsumers.put(
				"ncbjApplicationId",
				(BiConsumer<NcbjProductServiceDetail, Long>)
					NcbjProductServiceDetail::setNcbjApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getNcbjProductServiceDetailId() {
		return _ncbjProductServiceDetailId;
	}

	@Override
	public void setNcbjProductServiceDetailId(long ncbjProductServiceDetailId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ncbjProductServiceDetailId = ncbjProductServiceDetailId;
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
	public String getProductType() {
		if (_productType == null) {
			return "";
		}
		else {
			return _productType;
		}
	}

	@Override
	public void setProductType(String productType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_productType = productType;
	}

	@JSON
	@Override
	public String getProductList() {
		if (_productList == null) {
			return "";
		}
		else {
			return _productList;
		}
	}

	@Override
	public void setProductList(String productList) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_productList = productList;
	}

	@JSON
	@Override
	public String getProductLines() {
		if (_productLines == null) {
			return "";
		}
		else {
			return _productLines;
		}
	}

	@Override
	public void setProductLines(String productLines) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_productLines = productLines;
	}

	@JSON
	@Override
	public String getCounter() {
		if (_counter == null) {
			return "";
		}
		else {
			return _counter;
		}
	}

	@Override
	public void setCounter(String counter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_counter = counter;
	}

	@JSON
	@Override
	public long getNcbjApplicationId() {
		return _ncbjApplicationId;
	}

	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ncbjApplicationId = ncbjApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalNcbjApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("ncbjApplicationId"));
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
			getCompanyId(), NcbjProductServiceDetail.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NcbjProductServiceDetail toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, NcbjProductServiceDetail>
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
		NcbjProductServiceDetailImpl ncbjProductServiceDetailImpl =
			new NcbjProductServiceDetailImpl();

		ncbjProductServiceDetailImpl.setNcbjProductServiceDetailId(
			getNcbjProductServiceDetailId());
		ncbjProductServiceDetailImpl.setGroupId(getGroupId());
		ncbjProductServiceDetailImpl.setCompanyId(getCompanyId());
		ncbjProductServiceDetailImpl.setUserId(getUserId());
		ncbjProductServiceDetailImpl.setUserName(getUserName());
		ncbjProductServiceDetailImpl.setCreateDate(getCreateDate());
		ncbjProductServiceDetailImpl.setModifiedDate(getModifiedDate());
		ncbjProductServiceDetailImpl.setProductType(getProductType());
		ncbjProductServiceDetailImpl.setProductList(getProductList());
		ncbjProductServiceDetailImpl.setProductLines(getProductLines());
		ncbjProductServiceDetailImpl.setCounter(getCounter());
		ncbjProductServiceDetailImpl.setNcbjApplicationId(
			getNcbjApplicationId());

		ncbjProductServiceDetailImpl.resetOriginalValues();

		return ncbjProductServiceDetailImpl;
	}

	@Override
	public NcbjProductServiceDetail cloneWithOriginalValues() {
		NcbjProductServiceDetailImpl ncbjProductServiceDetailImpl =
			new NcbjProductServiceDetailImpl();

		ncbjProductServiceDetailImpl.setNcbjProductServiceDetailId(
			this.<Long>getColumnOriginalValue("ncbjProductServiceDetailId"));
		ncbjProductServiceDetailImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		ncbjProductServiceDetailImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		ncbjProductServiceDetailImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		ncbjProductServiceDetailImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		ncbjProductServiceDetailImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		ncbjProductServiceDetailImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		ncbjProductServiceDetailImpl.setProductType(
			this.<String>getColumnOriginalValue("productType"));
		ncbjProductServiceDetailImpl.setProductList(
			this.<String>getColumnOriginalValue("productList"));
		ncbjProductServiceDetailImpl.setProductLines(
			this.<String>getColumnOriginalValue("productLines"));
		ncbjProductServiceDetailImpl.setCounter(
			this.<String>getColumnOriginalValue("counter"));
		ncbjProductServiceDetailImpl.setNcbjApplicationId(
			this.<Long>getColumnOriginalValue("ncbjApplicationId"));

		return ncbjProductServiceDetailImpl;
	}

	@Override
	public int compareTo(NcbjProductServiceDetail ncbjProductServiceDetail) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), ncbjProductServiceDetail.getCreateDate());

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

		if (!(object instanceof NcbjProductServiceDetail)) {
			return false;
		}

		NcbjProductServiceDetail ncbjProductServiceDetail =
			(NcbjProductServiceDetail)object;

		long primaryKey = ncbjProductServiceDetail.getPrimaryKey();

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
	public CacheModel<NcbjProductServiceDetail> toCacheModel() {
		NcbjProductServiceDetailCacheModel ncbjProductServiceDetailCacheModel =
			new NcbjProductServiceDetailCacheModel();

		ncbjProductServiceDetailCacheModel.ncbjProductServiceDetailId =
			getNcbjProductServiceDetailId();

		ncbjProductServiceDetailCacheModel.groupId = getGroupId();

		ncbjProductServiceDetailCacheModel.companyId = getCompanyId();

		ncbjProductServiceDetailCacheModel.userId = getUserId();

		ncbjProductServiceDetailCacheModel.userName = getUserName();

		String userName = ncbjProductServiceDetailCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ncbjProductServiceDetailCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ncbjProductServiceDetailCacheModel.createDate =
				createDate.getTime();
		}
		else {
			ncbjProductServiceDetailCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ncbjProductServiceDetailCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			ncbjProductServiceDetailCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ncbjProductServiceDetailCacheModel.productType = getProductType();

		String productType = ncbjProductServiceDetailCacheModel.productType;

		if ((productType != null) && (productType.length() == 0)) {
			ncbjProductServiceDetailCacheModel.productType = null;
		}

		ncbjProductServiceDetailCacheModel.productList = getProductList();

		String productList = ncbjProductServiceDetailCacheModel.productList;

		if ((productList != null) && (productList.length() == 0)) {
			ncbjProductServiceDetailCacheModel.productList = null;
		}

		ncbjProductServiceDetailCacheModel.productLines = getProductLines();

		String productLines = ncbjProductServiceDetailCacheModel.productLines;

		if ((productLines != null) && (productLines.length() == 0)) {
			ncbjProductServiceDetailCacheModel.productLines = null;
		}

		ncbjProductServiceDetailCacheModel.counter = getCounter();

		String counter = ncbjProductServiceDetailCacheModel.counter;

		if ((counter != null) && (counter.length() == 0)) {
			ncbjProductServiceDetailCacheModel.counter = null;
		}

		ncbjProductServiceDetailCacheModel.ncbjApplicationId =
			getNcbjApplicationId();

		return ncbjProductServiceDetailCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<NcbjProductServiceDetail, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<NcbjProductServiceDetail, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcbjProductServiceDetail, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(NcbjProductServiceDetail)this);

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
			<InvocationHandler, NcbjProductServiceDetail>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						NcbjProductServiceDetail.class, ModelWrapper.class);

	}

	private long _ncbjProductServiceDetailId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _productType;
	private String _productList;
	private String _productLines;
	private String _counter;
	private long _ncbjApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<NcbjProductServiceDetail, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((NcbjProductServiceDetail)this);
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
			"ncbjProductServiceDetailId", _ncbjProductServiceDetailId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("productType", _productType);
		_columnOriginalValues.put("productList", _productList);
		_columnOriginalValues.put("productLines", _productLines);
		_columnOriginalValues.put("counter", _counter);
		_columnOriginalValues.put("ncbjApplicationId", _ncbjApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("ncbjProductServiceDetailId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("productType", 128L);

		columnBitmasks.put("productList", 256L);

		columnBitmasks.put("productLines", 512L);

		columnBitmasks.put("counter", 1024L);

		columnBitmasks.put("ncbjApplicationId", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private NcbjProductServiceDetail _escapedModel;

}