/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

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

import com.nbp.tourism.application.form.services.model.TourismNewAccoGeneralForm;
import com.nbp.tourism.application.form.services.model.TourismNewAccoGeneralFormModel;

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
 * The base model implementation for the TourismNewAccoGeneralForm service. Represents a row in the &quot;nbp_tourism_new_acco_gerneral&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismNewAccoGeneralFormModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismNewAccoGeneralFormImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoGeneralFormImpl
 * @generated
 */
@JSON(strict = true)
public class TourismNewAccoGeneralFormModelImpl
	extends BaseModelImpl<TourismNewAccoGeneralForm>
	implements TourismNewAccoGeneralFormModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism new acco general form model instance should use the <code>TourismNewAccoGeneralForm</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_new_acco_gerneral";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismNewAccoGenFormId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"establishmentName", Types.VARCHAR},
		{"accomadationRoom", Types.VARCHAR}, {"facilityDetail", Types.VARCHAR},
		{"hotelOperator", Types.VARCHAR},
		{"offeredAccomadation", Types.VARCHAR},
		{"constructionDate", Types.TIMESTAMP},
		{"commenceDate", Types.TIMESTAMP},
		{"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismNewAccoGenFormId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("establishmentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("accomadationRoom", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("facilityDetail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hotelOperator", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("offeredAccomadation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("constructionDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("commenceDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_new_acco_gerneral (tourismNewAccoGenFormId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,establishmentName VARCHAR(75) null,accomadationRoom VARCHAR(75) null,facilityDetail VARCHAR(75) null,hotelOperator VARCHAR(75) null,offeredAccomadation VARCHAR(75) null,constructionDate DATE null,commenceDate DATE null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_new_acco_gerneral";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismNewAccoGeneralForm.tourismNewAccoGenFormId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_new_acco_gerneral.tourismNewAccoGenFormId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TOURISMAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TOURISMNEWACCOGENFORMID_COLUMN_BITMASK = 2L;

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

	public TourismNewAccoGeneralFormModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismNewAccoGenFormId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismNewAccoGenFormId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismNewAccoGenFormId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismNewAccoGeneralForm.class;
	}

	@Override
	public String getModelClassName() {
		return TourismNewAccoGeneralForm.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismNewAccoGeneralForm, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TourismNewAccoGeneralForm, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismNewAccoGeneralForm, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((TourismNewAccoGeneralForm)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismNewAccoGeneralForm, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismNewAccoGeneralForm, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismNewAccoGeneralForm)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismNewAccoGeneralForm, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismNewAccoGeneralForm, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<TourismNewAccoGeneralForm, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<TourismNewAccoGeneralForm, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<TourismNewAccoGeneralForm, Object>>();

			attributeGetterFunctions.put(
				"tourismNewAccoGenFormId",
				TourismNewAccoGeneralForm::getTourismNewAccoGenFormId);
			attributeGetterFunctions.put(
				"groupId", TourismNewAccoGeneralForm::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismNewAccoGeneralForm::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismNewAccoGeneralForm::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismNewAccoGeneralForm::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismNewAccoGeneralForm::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", TourismNewAccoGeneralForm::getModifiedDate);
			attributeGetterFunctions.put(
				"establishmentName",
				TourismNewAccoGeneralForm::getEstablishmentName);
			attributeGetterFunctions.put(
				"accomadationRoom",
				TourismNewAccoGeneralForm::getAccomadationRoom);
			attributeGetterFunctions.put(
				"facilityDetail", TourismNewAccoGeneralForm::getFacilityDetail);
			attributeGetterFunctions.put(
				"hotelOperator", TourismNewAccoGeneralForm::getHotelOperator);
			attributeGetterFunctions.put(
				"offeredAccomadation",
				TourismNewAccoGeneralForm::getOfferedAccomadation);
			attributeGetterFunctions.put(
				"constructionDate",
				TourismNewAccoGeneralForm::getConstructionDate);
			attributeGetterFunctions.put(
				"commenceDate", TourismNewAccoGeneralForm::getCommenceDate);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismNewAccoGeneralForm::getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<TourismNewAccoGeneralForm, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismNewAccoGeneralForm, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<TourismNewAccoGeneralForm, ?>>();

			attributeSetterBiConsumers.put(
				"tourismNewAccoGenFormId",
				(BiConsumer<TourismNewAccoGeneralForm, Long>)
					TourismNewAccoGeneralForm::setTourismNewAccoGenFormId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismNewAccoGeneralForm, Long>)
					TourismNewAccoGeneralForm::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismNewAccoGeneralForm, Long>)
					TourismNewAccoGeneralForm::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismNewAccoGeneralForm, Long>)
					TourismNewAccoGeneralForm::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismNewAccoGeneralForm, String>)
					TourismNewAccoGeneralForm::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismNewAccoGeneralForm, Date>)
					TourismNewAccoGeneralForm::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismNewAccoGeneralForm, Date>)
					TourismNewAccoGeneralForm::setModifiedDate);
			attributeSetterBiConsumers.put(
				"establishmentName",
				(BiConsumer<TourismNewAccoGeneralForm, String>)
					TourismNewAccoGeneralForm::setEstablishmentName);
			attributeSetterBiConsumers.put(
				"accomadationRoom",
				(BiConsumer<TourismNewAccoGeneralForm, String>)
					TourismNewAccoGeneralForm::setAccomadationRoom);
			attributeSetterBiConsumers.put(
				"facilityDetail",
				(BiConsumer<TourismNewAccoGeneralForm, String>)
					TourismNewAccoGeneralForm::setFacilityDetail);
			attributeSetterBiConsumers.put(
				"hotelOperator",
				(BiConsumer<TourismNewAccoGeneralForm, String>)
					TourismNewAccoGeneralForm::setHotelOperator);
			attributeSetterBiConsumers.put(
				"offeredAccomadation",
				(BiConsumer<TourismNewAccoGeneralForm, String>)
					TourismNewAccoGeneralForm::setOfferedAccomadation);
			attributeSetterBiConsumers.put(
				"constructionDate",
				(BiConsumer<TourismNewAccoGeneralForm, Date>)
					TourismNewAccoGeneralForm::setConstructionDate);
			attributeSetterBiConsumers.put(
				"commenceDate",
				(BiConsumer<TourismNewAccoGeneralForm, Date>)
					TourismNewAccoGeneralForm::setCommenceDate);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismNewAccoGeneralForm, Long>)
					TourismNewAccoGeneralForm::setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismNewAccoGenFormId() {
		return _tourismNewAccoGenFormId;
	}

	@Override
	public void setTourismNewAccoGenFormId(long tourismNewAccoGenFormId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismNewAccoGenFormId = tourismNewAccoGenFormId;
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
	public String getEstablishmentName() {
		if (_establishmentName == null) {
			return "";
		}
		else {
			return _establishmentName;
		}
	}

	@Override
	public void setEstablishmentName(String establishmentName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_establishmentName = establishmentName;
	}

	@JSON
	@Override
	public String getAccomadationRoom() {
		if (_accomadationRoom == null) {
			return "";
		}
		else {
			return _accomadationRoom;
		}
	}

	@Override
	public void setAccomadationRoom(String accomadationRoom) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_accomadationRoom = accomadationRoom;
	}

	@JSON
	@Override
	public String getFacilityDetail() {
		if (_facilityDetail == null) {
			return "";
		}
		else {
			return _facilityDetail;
		}
	}

	@Override
	public void setFacilityDetail(String facilityDetail) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_facilityDetail = facilityDetail;
	}

	@JSON
	@Override
	public String getHotelOperator() {
		if (_hotelOperator == null) {
			return "";
		}
		else {
			return _hotelOperator;
		}
	}

	@Override
	public void setHotelOperator(String hotelOperator) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hotelOperator = hotelOperator;
	}

	@JSON
	@Override
	public String getOfferedAccomadation() {
		if (_offeredAccomadation == null) {
			return "";
		}
		else {
			return _offeredAccomadation;
		}
	}

	@Override
	public void setOfferedAccomadation(String offeredAccomadation) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_offeredAccomadation = offeredAccomadation;
	}

	@JSON
	@Override
	public Date getConstructionDate() {
		return _constructionDate;
	}

	@Override
	public void setConstructionDate(Date constructionDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_constructionDate = constructionDate;
	}

	@JSON
	@Override
	public Date getCommenceDate() {
		return _commenceDate;
	}

	@Override
	public void setCommenceDate(Date commenceDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_commenceDate = commenceDate;
	}

	@JSON
	@Override
	public long getTourismApplicationId() {
		return _tourismApplicationId;
	}

	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismApplicationId = tourismApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalTourismApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));
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
			getCompanyId(), TourismNewAccoGeneralForm.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismNewAccoGeneralForm toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismNewAccoGeneralForm>
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
		TourismNewAccoGeneralFormImpl tourismNewAccoGeneralFormImpl =
			new TourismNewAccoGeneralFormImpl();

		tourismNewAccoGeneralFormImpl.setTourismNewAccoGenFormId(
			getTourismNewAccoGenFormId());
		tourismNewAccoGeneralFormImpl.setGroupId(getGroupId());
		tourismNewAccoGeneralFormImpl.setCompanyId(getCompanyId());
		tourismNewAccoGeneralFormImpl.setUserId(getUserId());
		tourismNewAccoGeneralFormImpl.setUserName(getUserName());
		tourismNewAccoGeneralFormImpl.setCreateDate(getCreateDate());
		tourismNewAccoGeneralFormImpl.setModifiedDate(getModifiedDate());
		tourismNewAccoGeneralFormImpl.setEstablishmentName(
			getEstablishmentName());
		tourismNewAccoGeneralFormImpl.setAccomadationRoom(
			getAccomadationRoom());
		tourismNewAccoGeneralFormImpl.setFacilityDetail(getFacilityDetail());
		tourismNewAccoGeneralFormImpl.setHotelOperator(getHotelOperator());
		tourismNewAccoGeneralFormImpl.setOfferedAccomadation(
			getOfferedAccomadation());
		tourismNewAccoGeneralFormImpl.setConstructionDate(
			getConstructionDate());
		tourismNewAccoGeneralFormImpl.setCommenceDate(getCommenceDate());
		tourismNewAccoGeneralFormImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismNewAccoGeneralFormImpl.resetOriginalValues();

		return tourismNewAccoGeneralFormImpl;
	}

	@Override
	public TourismNewAccoGeneralForm cloneWithOriginalValues() {
		TourismNewAccoGeneralFormImpl tourismNewAccoGeneralFormImpl =
			new TourismNewAccoGeneralFormImpl();

		tourismNewAccoGeneralFormImpl.setTourismNewAccoGenFormId(
			this.<Long>getColumnOriginalValue("tourismNewAccoGenFormId"));
		tourismNewAccoGeneralFormImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismNewAccoGeneralFormImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismNewAccoGeneralFormImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismNewAccoGeneralFormImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismNewAccoGeneralFormImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismNewAccoGeneralFormImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismNewAccoGeneralFormImpl.setEstablishmentName(
			this.<String>getColumnOriginalValue("establishmentName"));
		tourismNewAccoGeneralFormImpl.setAccomadationRoom(
			this.<String>getColumnOriginalValue("accomadationRoom"));
		tourismNewAccoGeneralFormImpl.setFacilityDetail(
			this.<String>getColumnOriginalValue("facilityDetail"));
		tourismNewAccoGeneralFormImpl.setHotelOperator(
			this.<String>getColumnOriginalValue("hotelOperator"));
		tourismNewAccoGeneralFormImpl.setOfferedAccomadation(
			this.<String>getColumnOriginalValue("offeredAccomadation"));
		tourismNewAccoGeneralFormImpl.setConstructionDate(
			this.<Date>getColumnOriginalValue("constructionDate"));
		tourismNewAccoGeneralFormImpl.setCommenceDate(
			this.<Date>getColumnOriginalValue("commenceDate"));
		tourismNewAccoGeneralFormImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismNewAccoGeneralFormImpl;
	}

	@Override
	public int compareTo(TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {
		long primaryKey = tourismNewAccoGeneralForm.getPrimaryKey();

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

		if (!(object instanceof TourismNewAccoGeneralForm)) {
			return false;
		}

		TourismNewAccoGeneralForm tourismNewAccoGeneralForm =
			(TourismNewAccoGeneralForm)object;

		long primaryKey = tourismNewAccoGeneralForm.getPrimaryKey();

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
	public CacheModel<TourismNewAccoGeneralForm> toCacheModel() {
		TourismNewAccoGeneralFormCacheModel
			tourismNewAccoGeneralFormCacheModel =
				new TourismNewAccoGeneralFormCacheModel();

		tourismNewAccoGeneralFormCacheModel.tourismNewAccoGenFormId =
			getTourismNewAccoGenFormId();

		tourismNewAccoGeneralFormCacheModel.groupId = getGroupId();

		tourismNewAccoGeneralFormCacheModel.companyId = getCompanyId();

		tourismNewAccoGeneralFormCacheModel.userId = getUserId();

		tourismNewAccoGeneralFormCacheModel.userName = getUserName();

		String userName = tourismNewAccoGeneralFormCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismNewAccoGeneralFormCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismNewAccoGeneralFormCacheModel.createDate =
				createDate.getTime();
		}
		else {
			tourismNewAccoGeneralFormCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismNewAccoGeneralFormCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismNewAccoGeneralFormCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tourismNewAccoGeneralFormCacheModel.establishmentName =
			getEstablishmentName();

		String establishmentName =
			tourismNewAccoGeneralFormCacheModel.establishmentName;

		if ((establishmentName != null) && (establishmentName.length() == 0)) {
			tourismNewAccoGeneralFormCacheModel.establishmentName = null;
		}

		tourismNewAccoGeneralFormCacheModel.accomadationRoom =
			getAccomadationRoom();

		String accomadationRoom =
			tourismNewAccoGeneralFormCacheModel.accomadationRoom;

		if ((accomadationRoom != null) && (accomadationRoom.length() == 0)) {
			tourismNewAccoGeneralFormCacheModel.accomadationRoom = null;
		}

		tourismNewAccoGeneralFormCacheModel.facilityDetail =
			getFacilityDetail();

		String facilityDetail =
			tourismNewAccoGeneralFormCacheModel.facilityDetail;

		if ((facilityDetail != null) && (facilityDetail.length() == 0)) {
			tourismNewAccoGeneralFormCacheModel.facilityDetail = null;
		}

		tourismNewAccoGeneralFormCacheModel.hotelOperator = getHotelOperator();

		String hotelOperator =
			tourismNewAccoGeneralFormCacheModel.hotelOperator;

		if ((hotelOperator != null) && (hotelOperator.length() == 0)) {
			tourismNewAccoGeneralFormCacheModel.hotelOperator = null;
		}

		tourismNewAccoGeneralFormCacheModel.offeredAccomadation =
			getOfferedAccomadation();

		String offeredAccomadation =
			tourismNewAccoGeneralFormCacheModel.offeredAccomadation;

		if ((offeredAccomadation != null) &&
			(offeredAccomadation.length() == 0)) {

			tourismNewAccoGeneralFormCacheModel.offeredAccomadation = null;
		}

		Date constructionDate = getConstructionDate();

		if (constructionDate != null) {
			tourismNewAccoGeneralFormCacheModel.constructionDate =
				constructionDate.getTime();
		}
		else {
			tourismNewAccoGeneralFormCacheModel.constructionDate =
				Long.MIN_VALUE;
		}

		Date commenceDate = getCommenceDate();

		if (commenceDate != null) {
			tourismNewAccoGeneralFormCacheModel.commenceDate =
				commenceDate.getTime();
		}
		else {
			tourismNewAccoGeneralFormCacheModel.commenceDate = Long.MIN_VALUE;
		}

		tourismNewAccoGeneralFormCacheModel.tourismApplicationId =
			getTourismApplicationId();

		return tourismNewAccoGeneralFormCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismNewAccoGeneralForm, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TourismNewAccoGeneralForm, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismNewAccoGeneralForm, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismNewAccoGeneralForm)this);

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
			<InvocationHandler, TourismNewAccoGeneralForm>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismNewAccoGeneralForm.class, ModelWrapper.class);

	}

	private long _tourismNewAccoGenFormId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _establishmentName;
	private String _accomadationRoom;
	private String _facilityDetail;
	private String _hotelOperator;
	private String _offeredAccomadation;
	private Date _constructionDate;
	private Date _commenceDate;
	private long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<TourismNewAccoGeneralForm, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismNewAccoGeneralForm)this);
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
			"tourismNewAccoGenFormId", _tourismNewAccoGenFormId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("establishmentName", _establishmentName);
		_columnOriginalValues.put("accomadationRoom", _accomadationRoom);
		_columnOriginalValues.put("facilityDetail", _facilityDetail);
		_columnOriginalValues.put("hotelOperator", _hotelOperator);
		_columnOriginalValues.put("offeredAccomadation", _offeredAccomadation);
		_columnOriginalValues.put("constructionDate", _constructionDate);
		_columnOriginalValues.put("commenceDate", _commenceDate);
		_columnOriginalValues.put(
			"tourismApplicationId", _tourismApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("tourismNewAccoGenFormId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("establishmentName", 128L);

		columnBitmasks.put("accomadationRoom", 256L);

		columnBitmasks.put("facilityDetail", 512L);

		columnBitmasks.put("hotelOperator", 1024L);

		columnBitmasks.put("offeredAccomadation", 2048L);

		columnBitmasks.put("constructionDate", 4096L);

		columnBitmasks.put("commenceDate", 8192L);

		columnBitmasks.put("tourismApplicationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismNewAccoGeneralForm _escapedModel;

}