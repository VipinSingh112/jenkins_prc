/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
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
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfo;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeCompanyinfoModel;

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
 * The base model implementation for the OsiServicesTrusteeCompanyinfo service. Represents a row in the &quot;nbp_osi_services_trus_co_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OsiServicesTrusteeCompanyinfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiServicesTrusteeCompanyinfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeCompanyinfoImpl
 * @generated
 */
@JSON(strict = true)
public class OsiServicesTrusteeCompanyinfoModelImpl
	extends BaseModelImpl<OsiServicesTrusteeCompanyinfo>
	implements OsiServicesTrusteeCompanyinfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi services trustee companyinfo model instance should use the <code>OsiServicesTrusteeCompanyinfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_osi_services_trus_co_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"osiTrusId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"comCorporationName", Types.VARCHAR},
		{"comHeadOfficeAddress", Types.VARCHAR}, {"comTeleNo", Types.VARCHAR},
		{"comFaxNo", Types.VARCHAR}, {"comEmail", Types.VARCHAR},
		{"otherCountry", Types.VARCHAR},
		{"comIncorporationDate", Types.TIMESTAMP},
		{"comLicenceRequest", Types.VARCHAR},
		{"osiServicesApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiTrusId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("comCorporationName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comHeadOfficeAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comTeleNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comFaxNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comEmail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("otherCountry", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("comIncorporationDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("comLicenceRequest", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("osiServicesApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_osi_services_trus_co_info (uuid_ VARCHAR(75) null,osiTrusId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,comCorporationName VARCHAR(75) null,comHeadOfficeAddress VARCHAR(1000) null,comTeleNo VARCHAR(75) null,comFaxNo VARCHAR(75) null,comEmail VARCHAR(75) null,otherCountry VARCHAR(75) null,comIncorporationDate DATE null,comLicenceRequest VARCHAR(75) null,osiServicesApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_osi_services_trus_co_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY osiServicesTrusteeCompanyinfo.osiTrusId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_osi_services_trus_co_info.osiTrusId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long OSISERVICESAPPLICATIONID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long OSITRUSID_COLUMN_BITMASK = 16L;

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

	public OsiServicesTrusteeCompanyinfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _osiTrusId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOsiTrusId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _osiTrusId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OsiServicesTrusteeCompanyinfo.class;
	}

	@Override
	public String getModelClassName() {
		return OsiServicesTrusteeCompanyinfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<OsiServicesTrusteeCompanyinfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<OsiServicesTrusteeCompanyinfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiServicesTrusteeCompanyinfo, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(OsiServicesTrusteeCompanyinfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OsiServicesTrusteeCompanyinfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OsiServicesTrusteeCompanyinfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(OsiServicesTrusteeCompanyinfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OsiServicesTrusteeCompanyinfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OsiServicesTrusteeCompanyinfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<OsiServicesTrusteeCompanyinfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<OsiServicesTrusteeCompanyinfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String,
						 Function<OsiServicesTrusteeCompanyinfo, Object>>();

			attributeGetterFunctions.put(
				"uuid", OsiServicesTrusteeCompanyinfo::getUuid);
			attributeGetterFunctions.put(
				"osiTrusId", OsiServicesTrusteeCompanyinfo::getOsiTrusId);
			attributeGetterFunctions.put(
				"groupId", OsiServicesTrusteeCompanyinfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", OsiServicesTrusteeCompanyinfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", OsiServicesTrusteeCompanyinfo::getUserId);
			attributeGetterFunctions.put(
				"userName", OsiServicesTrusteeCompanyinfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", OsiServicesTrusteeCompanyinfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", OsiServicesTrusteeCompanyinfo::getModifiedDate);
			attributeGetterFunctions.put(
				"comCorporationName",
				OsiServicesTrusteeCompanyinfo::getComCorporationName);
			attributeGetterFunctions.put(
				"comHeadOfficeAddress",
				OsiServicesTrusteeCompanyinfo::getComHeadOfficeAddress);
			attributeGetterFunctions.put(
				"comTeleNo", OsiServicesTrusteeCompanyinfo::getComTeleNo);
			attributeGetterFunctions.put(
				"comFaxNo", OsiServicesTrusteeCompanyinfo::getComFaxNo);
			attributeGetterFunctions.put(
				"comEmail", OsiServicesTrusteeCompanyinfo::getComEmail);
			attributeGetterFunctions.put(
				"otherCountry", OsiServicesTrusteeCompanyinfo::getOtherCountry);
			attributeGetterFunctions.put(
				"comIncorporationDate",
				OsiServicesTrusteeCompanyinfo::getComIncorporationDate);
			attributeGetterFunctions.put(
				"comLicenceRequest",
				OsiServicesTrusteeCompanyinfo::getComLicenceRequest);
			attributeGetterFunctions.put(
				"osiServicesApplicationId",
				OsiServicesTrusteeCompanyinfo::getOsiServicesApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<OsiServicesTrusteeCompanyinfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<OsiServicesTrusteeCompanyinfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String,
						 BiConsumer<OsiServicesTrusteeCompanyinfo, ?>>();

			attributeSetterBiConsumers.put(
				"uuid",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setUuid);
			attributeSetterBiConsumers.put(
				"osiTrusId",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, Long>)
					OsiServicesTrusteeCompanyinfo::setOsiTrusId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, Long>)
					OsiServicesTrusteeCompanyinfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, Long>)
					OsiServicesTrusteeCompanyinfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, Long>)
					OsiServicesTrusteeCompanyinfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, Date>)
					OsiServicesTrusteeCompanyinfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, Date>)
					OsiServicesTrusteeCompanyinfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"comCorporationName",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setComCorporationName);
			attributeSetterBiConsumers.put(
				"comHeadOfficeAddress",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setComHeadOfficeAddress);
			attributeSetterBiConsumers.put(
				"comTeleNo",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setComTeleNo);
			attributeSetterBiConsumers.put(
				"comFaxNo",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setComFaxNo);
			attributeSetterBiConsumers.put(
				"comEmail",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setComEmail);
			attributeSetterBiConsumers.put(
				"otherCountry",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setOtherCountry);
			attributeSetterBiConsumers.put(
				"comIncorporationDate",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, Date>)
					OsiServicesTrusteeCompanyinfo::setComIncorporationDate);
			attributeSetterBiConsumers.put(
				"comLicenceRequest",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, String>)
					OsiServicesTrusteeCompanyinfo::setComLicenceRequest);
			attributeSetterBiConsumers.put(
				"osiServicesApplicationId",
				(BiConsumer<OsiServicesTrusteeCompanyinfo, Long>)
					OsiServicesTrusteeCompanyinfo::setOsiServicesApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getOsiTrusId() {
		return _osiTrusId;
	}

	@Override
	public void setOsiTrusId(long osiTrusId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiTrusId = osiTrusId;
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

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
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

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
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
	public String getComCorporationName() {
		if (_comCorporationName == null) {
			return "";
		}
		else {
			return _comCorporationName;
		}
	}

	@Override
	public void setComCorporationName(String comCorporationName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comCorporationName = comCorporationName;
	}

	@JSON
	@Override
	public String getComHeadOfficeAddress() {
		if (_comHeadOfficeAddress == null) {
			return "";
		}
		else {
			return _comHeadOfficeAddress;
		}
	}

	@Override
	public void setComHeadOfficeAddress(String comHeadOfficeAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comHeadOfficeAddress = comHeadOfficeAddress;
	}

	@JSON
	@Override
	public String getComTeleNo() {
		if (_comTeleNo == null) {
			return "";
		}
		else {
			return _comTeleNo;
		}
	}

	@Override
	public void setComTeleNo(String comTeleNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comTeleNo = comTeleNo;
	}

	@JSON
	@Override
	public String getComFaxNo() {
		if (_comFaxNo == null) {
			return "";
		}
		else {
			return _comFaxNo;
		}
	}

	@Override
	public void setComFaxNo(String comFaxNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comFaxNo = comFaxNo;
	}

	@JSON
	@Override
	public String getComEmail() {
		if (_comEmail == null) {
			return "";
		}
		else {
			return _comEmail;
		}
	}

	@Override
	public void setComEmail(String comEmail) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comEmail = comEmail;
	}

	@JSON
	@Override
	public String getOtherCountry() {
		if (_otherCountry == null) {
			return "";
		}
		else {
			return _otherCountry;
		}
	}

	@Override
	public void setOtherCountry(String otherCountry) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_otherCountry = otherCountry;
	}

	@JSON
	@Override
	public Date getComIncorporationDate() {
		return _comIncorporationDate;
	}

	@Override
	public void setComIncorporationDate(Date comIncorporationDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comIncorporationDate = comIncorporationDate;
	}

	@JSON
	@Override
	public String getComLicenceRequest() {
		if (_comLicenceRequest == null) {
			return "";
		}
		else {
			return _comLicenceRequest;
		}
	}

	@Override
	public void setComLicenceRequest(String comLicenceRequest) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_comLicenceRequest = comLicenceRequest;
	}

	@JSON
	@Override
	public long getOsiServicesApplicationId() {
		return _osiServicesApplicationId;
	}

	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_osiServicesApplicationId = osiServicesApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalOsiServicesApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("osiServicesApplicationId"));
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(
				OsiServicesTrusteeCompanyinfo.class.getName()));
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
			getCompanyId(), OsiServicesTrusteeCompanyinfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OsiServicesTrusteeCompanyinfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OsiServicesTrusteeCompanyinfo>
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
		OsiServicesTrusteeCompanyinfoImpl osiServicesTrusteeCompanyinfoImpl =
			new OsiServicesTrusteeCompanyinfoImpl();

		osiServicesTrusteeCompanyinfoImpl.setUuid(getUuid());
		osiServicesTrusteeCompanyinfoImpl.setOsiTrusId(getOsiTrusId());
		osiServicesTrusteeCompanyinfoImpl.setGroupId(getGroupId());
		osiServicesTrusteeCompanyinfoImpl.setCompanyId(getCompanyId());
		osiServicesTrusteeCompanyinfoImpl.setUserId(getUserId());
		osiServicesTrusteeCompanyinfoImpl.setUserName(getUserName());
		osiServicesTrusteeCompanyinfoImpl.setCreateDate(getCreateDate());
		osiServicesTrusteeCompanyinfoImpl.setModifiedDate(getModifiedDate());
		osiServicesTrusteeCompanyinfoImpl.setComCorporationName(
			getComCorporationName());
		osiServicesTrusteeCompanyinfoImpl.setComHeadOfficeAddress(
			getComHeadOfficeAddress());
		osiServicesTrusteeCompanyinfoImpl.setComTeleNo(getComTeleNo());
		osiServicesTrusteeCompanyinfoImpl.setComFaxNo(getComFaxNo());
		osiServicesTrusteeCompanyinfoImpl.setComEmail(getComEmail());
		osiServicesTrusteeCompanyinfoImpl.setOtherCountry(getOtherCountry());
		osiServicesTrusteeCompanyinfoImpl.setComIncorporationDate(
			getComIncorporationDate());
		osiServicesTrusteeCompanyinfoImpl.setComLicenceRequest(
			getComLicenceRequest());
		osiServicesTrusteeCompanyinfoImpl.setOsiServicesApplicationId(
			getOsiServicesApplicationId());

		osiServicesTrusteeCompanyinfoImpl.resetOriginalValues();

		return osiServicesTrusteeCompanyinfoImpl;
	}

	@Override
	public OsiServicesTrusteeCompanyinfo cloneWithOriginalValues() {
		OsiServicesTrusteeCompanyinfoImpl osiServicesTrusteeCompanyinfoImpl =
			new OsiServicesTrusteeCompanyinfoImpl();

		osiServicesTrusteeCompanyinfoImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		osiServicesTrusteeCompanyinfoImpl.setOsiTrusId(
			this.<Long>getColumnOriginalValue("osiTrusId"));
		osiServicesTrusteeCompanyinfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		osiServicesTrusteeCompanyinfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		osiServicesTrusteeCompanyinfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		osiServicesTrusteeCompanyinfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		osiServicesTrusteeCompanyinfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		osiServicesTrusteeCompanyinfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		osiServicesTrusteeCompanyinfoImpl.setComCorporationName(
			this.<String>getColumnOriginalValue("comCorporationName"));
		osiServicesTrusteeCompanyinfoImpl.setComHeadOfficeAddress(
			this.<String>getColumnOriginalValue("comHeadOfficeAddress"));
		osiServicesTrusteeCompanyinfoImpl.setComTeleNo(
			this.<String>getColumnOriginalValue("comTeleNo"));
		osiServicesTrusteeCompanyinfoImpl.setComFaxNo(
			this.<String>getColumnOriginalValue("comFaxNo"));
		osiServicesTrusteeCompanyinfoImpl.setComEmail(
			this.<String>getColumnOriginalValue("comEmail"));
		osiServicesTrusteeCompanyinfoImpl.setOtherCountry(
			this.<String>getColumnOriginalValue("otherCountry"));
		osiServicesTrusteeCompanyinfoImpl.setComIncorporationDate(
			this.<Date>getColumnOriginalValue("comIncorporationDate"));
		osiServicesTrusteeCompanyinfoImpl.setComLicenceRequest(
			this.<String>getColumnOriginalValue("comLicenceRequest"));
		osiServicesTrusteeCompanyinfoImpl.setOsiServicesApplicationId(
			this.<Long>getColumnOriginalValue("osiServicesApplicationId"));

		return osiServicesTrusteeCompanyinfoImpl;
	}

	@Override
	public int compareTo(
		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo) {

		long primaryKey = osiServicesTrusteeCompanyinfo.getPrimaryKey();

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

		if (!(object instanceof OsiServicesTrusteeCompanyinfo)) {
			return false;
		}

		OsiServicesTrusteeCompanyinfo osiServicesTrusteeCompanyinfo =
			(OsiServicesTrusteeCompanyinfo)object;

		long primaryKey = osiServicesTrusteeCompanyinfo.getPrimaryKey();

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
	public CacheModel<OsiServicesTrusteeCompanyinfo> toCacheModel() {
		OsiServicesTrusteeCompanyinfoCacheModel
			osiServicesTrusteeCompanyinfoCacheModel =
				new OsiServicesTrusteeCompanyinfoCacheModel();

		osiServicesTrusteeCompanyinfoCacheModel.uuid = getUuid();

		String uuid = osiServicesTrusteeCompanyinfoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			osiServicesTrusteeCompanyinfoCacheModel.uuid = null;
		}

		osiServicesTrusteeCompanyinfoCacheModel.osiTrusId = getOsiTrusId();

		osiServicesTrusteeCompanyinfoCacheModel.groupId = getGroupId();

		osiServicesTrusteeCompanyinfoCacheModel.companyId = getCompanyId();

		osiServicesTrusteeCompanyinfoCacheModel.userId = getUserId();

		osiServicesTrusteeCompanyinfoCacheModel.userName = getUserName();

		String userName = osiServicesTrusteeCompanyinfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			osiServicesTrusteeCompanyinfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			osiServicesTrusteeCompanyinfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			osiServicesTrusteeCompanyinfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			osiServicesTrusteeCompanyinfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			osiServicesTrusteeCompanyinfoCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		osiServicesTrusteeCompanyinfoCacheModel.comCorporationName =
			getComCorporationName();

		String comCorporationName =
			osiServicesTrusteeCompanyinfoCacheModel.comCorporationName;

		if ((comCorporationName != null) &&
			(comCorporationName.length() == 0)) {

			osiServicesTrusteeCompanyinfoCacheModel.comCorporationName = null;
		}

		osiServicesTrusteeCompanyinfoCacheModel.comHeadOfficeAddress =
			getComHeadOfficeAddress();

		String comHeadOfficeAddress =
			osiServicesTrusteeCompanyinfoCacheModel.comHeadOfficeAddress;

		if ((comHeadOfficeAddress != null) &&
			(comHeadOfficeAddress.length() == 0)) {

			osiServicesTrusteeCompanyinfoCacheModel.comHeadOfficeAddress = null;
		}

		osiServicesTrusteeCompanyinfoCacheModel.comTeleNo = getComTeleNo();

		String comTeleNo = osiServicesTrusteeCompanyinfoCacheModel.comTeleNo;

		if ((comTeleNo != null) && (comTeleNo.length() == 0)) {
			osiServicesTrusteeCompanyinfoCacheModel.comTeleNo = null;
		}

		osiServicesTrusteeCompanyinfoCacheModel.comFaxNo = getComFaxNo();

		String comFaxNo = osiServicesTrusteeCompanyinfoCacheModel.comFaxNo;

		if ((comFaxNo != null) && (comFaxNo.length() == 0)) {
			osiServicesTrusteeCompanyinfoCacheModel.comFaxNo = null;
		}

		osiServicesTrusteeCompanyinfoCacheModel.comEmail = getComEmail();

		String comEmail = osiServicesTrusteeCompanyinfoCacheModel.comEmail;

		if ((comEmail != null) && (comEmail.length() == 0)) {
			osiServicesTrusteeCompanyinfoCacheModel.comEmail = null;
		}

		osiServicesTrusteeCompanyinfoCacheModel.otherCountry =
			getOtherCountry();

		String otherCountry =
			osiServicesTrusteeCompanyinfoCacheModel.otherCountry;

		if ((otherCountry != null) && (otherCountry.length() == 0)) {
			osiServicesTrusteeCompanyinfoCacheModel.otherCountry = null;
		}

		Date comIncorporationDate = getComIncorporationDate();

		if (comIncorporationDate != null) {
			osiServicesTrusteeCompanyinfoCacheModel.comIncorporationDate =
				comIncorporationDate.getTime();
		}
		else {
			osiServicesTrusteeCompanyinfoCacheModel.comIncorporationDate =
				Long.MIN_VALUE;
		}

		osiServicesTrusteeCompanyinfoCacheModel.comLicenceRequest =
			getComLicenceRequest();

		String comLicenceRequest =
			osiServicesTrusteeCompanyinfoCacheModel.comLicenceRequest;

		if ((comLicenceRequest != null) && (comLicenceRequest.length() == 0)) {
			osiServicesTrusteeCompanyinfoCacheModel.comLicenceRequest = null;
		}

		osiServicesTrusteeCompanyinfoCacheModel.osiServicesApplicationId =
			getOsiServicesApplicationId();

		return osiServicesTrusteeCompanyinfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OsiServicesTrusteeCompanyinfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<OsiServicesTrusteeCompanyinfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OsiServicesTrusteeCompanyinfo, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(OsiServicesTrusteeCompanyinfo)this);

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
			<InvocationHandler, OsiServicesTrusteeCompanyinfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						OsiServicesTrusteeCompanyinfo.class,
						ModelWrapper.class);

	}

	private String _uuid;
	private long _osiTrusId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _comCorporationName;
	private String _comHeadOfficeAddress;
	private String _comTeleNo;
	private String _comFaxNo;
	private String _comEmail;
	private String _otherCountry;
	private Date _comIncorporationDate;
	private String _comLicenceRequest;
	private long _osiServicesApplicationId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<OsiServicesTrusteeCompanyinfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((OsiServicesTrusteeCompanyinfo)this);
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

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("osiTrusId", _osiTrusId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("comCorporationName", _comCorporationName);
		_columnOriginalValues.put(
			"comHeadOfficeAddress", _comHeadOfficeAddress);
		_columnOriginalValues.put("comTeleNo", _comTeleNo);
		_columnOriginalValues.put("comFaxNo", _comFaxNo);
		_columnOriginalValues.put("comEmail", _comEmail);
		_columnOriginalValues.put("otherCountry", _otherCountry);
		_columnOriginalValues.put(
			"comIncorporationDate", _comIncorporationDate);
		_columnOriginalValues.put("comLicenceRequest", _comLicenceRequest);
		_columnOriginalValues.put(
			"osiServicesApplicationId", _osiServicesApplicationId);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("osiTrusId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("comCorporationName", 256L);

		columnBitmasks.put("comHeadOfficeAddress", 512L);

		columnBitmasks.put("comTeleNo", 1024L);

		columnBitmasks.put("comFaxNo", 2048L);

		columnBitmasks.put("comEmail", 4096L);

		columnBitmasks.put("otherCountry", 8192L);

		columnBitmasks.put("comIncorporationDate", 16384L);

		columnBitmasks.put("comLicenceRequest", 32768L);

		columnBitmasks.put("osiServicesApplicationId", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private OsiServicesTrusteeCompanyinfo _escapedModel;

}