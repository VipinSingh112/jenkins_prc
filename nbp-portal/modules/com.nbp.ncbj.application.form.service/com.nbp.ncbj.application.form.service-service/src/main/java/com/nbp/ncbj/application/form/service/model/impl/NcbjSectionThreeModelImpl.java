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

import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;
import com.nbp.ncbj.application.form.service.model.NcbjSectionThreeModel;

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
 * The base model implementation for the NcbjSectionThree service. Represents a row in the &quot;nbp_ncbj_section_three&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>NcbjSectionThreeModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NcbjSectionThreeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionThreeImpl
 * @generated
 */
@JSON(strict = true)
public class NcbjSectionThreeModelImpl
	extends BaseModelImpl<NcbjSectionThree> implements NcbjSectionThreeModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ncbj section three model instance should use the <code>NcbjSectionThree</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_ncbj_section_three";

	public static final Object[][] TABLE_COLUMNS = {
		{"ncbjSectionThreeId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"processActivityDescription", Types.VARCHAR},
		{"incomingMaterialsDes", Types.VARCHAR},
		{"processDescription", Types.VARCHAR},
		{"processActivitiesList", Types.VARCHAR},
		{"specialActivities", Types.VARCHAR},
		{"explainationBox", Types.VARCHAR}, {"categoryOne", Types.VARCHAR},
		{"categoryTwo", Types.VARCHAR}, {"categoryThree", Types.VARCHAR},
		{"categoryFour", Types.VARCHAR}, {"ncbjApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("ncbjSectionThreeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("processActivityDescription", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("incomingMaterialsDes", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("processDescription", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("processActivitiesList", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specialActivities", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("explainationBox", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("categoryOne", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("categoryTwo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("categoryThree", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("categoryFour", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ncbjApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_ncbj_section_three (ncbjSectionThreeId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,processActivityDescription VARCHAR(75) null,incomingMaterialsDes VARCHAR(75) null,processDescription VARCHAR(75) null,processActivitiesList VARCHAR(500) null,specialActivities VARCHAR(75) null,explainationBox VARCHAR(75) null,categoryOne VARCHAR(2000) null,categoryTwo VARCHAR(75) null,categoryThree VARCHAR(75) null,categoryFour VARCHAR(75) null,ncbjApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_ncbj_section_three";

	public static final String ORDER_BY_JPQL =
		" ORDER BY ncbjSectionThree.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_ncbj_section_three.createDate DESC";

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

	public NcbjSectionThreeModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _ncbjSectionThreeId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNcbjSectionThreeId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ncbjSectionThreeId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return NcbjSectionThree.class;
	}

	@Override
	public String getModelClassName() {
		return NcbjSectionThree.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<NcbjSectionThree, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<NcbjSectionThree, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcbjSectionThree, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((NcbjSectionThree)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<NcbjSectionThree, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<NcbjSectionThree, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(NcbjSectionThree)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<NcbjSectionThree, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<NcbjSectionThree, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<NcbjSectionThree, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<NcbjSectionThree, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<NcbjSectionThree, Object>>();

			attributeGetterFunctions.put(
				"ncbjSectionThreeId", NcbjSectionThree::getNcbjSectionThreeId);
			attributeGetterFunctions.put(
				"groupId", NcbjSectionThree::getGroupId);
			attributeGetterFunctions.put(
				"companyId", NcbjSectionThree::getCompanyId);
			attributeGetterFunctions.put("userId", NcbjSectionThree::getUserId);
			attributeGetterFunctions.put(
				"userName", NcbjSectionThree::getUserName);
			attributeGetterFunctions.put(
				"createDate", NcbjSectionThree::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", NcbjSectionThree::getModifiedDate);
			attributeGetterFunctions.put(
				"processActivityDescription",
				NcbjSectionThree::getProcessActivityDescription);
			attributeGetterFunctions.put(
				"incomingMaterialsDes",
				NcbjSectionThree::getIncomingMaterialsDes);
			attributeGetterFunctions.put(
				"processDescription", NcbjSectionThree::getProcessDescription);
			attributeGetterFunctions.put(
				"processActivitiesList",
				NcbjSectionThree::getProcessActivitiesList);
			attributeGetterFunctions.put(
				"specialActivities", NcbjSectionThree::getSpecialActivities);
			attributeGetterFunctions.put(
				"explainationBox", NcbjSectionThree::getExplainationBox);
			attributeGetterFunctions.put(
				"categoryOne", NcbjSectionThree::getCategoryOne);
			attributeGetterFunctions.put(
				"categoryTwo", NcbjSectionThree::getCategoryTwo);
			attributeGetterFunctions.put(
				"categoryThree", NcbjSectionThree::getCategoryThree);
			attributeGetterFunctions.put(
				"categoryFour", NcbjSectionThree::getCategoryFour);
			attributeGetterFunctions.put(
				"ncbjApplicationId", NcbjSectionThree::getNcbjApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<NcbjSectionThree, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<NcbjSectionThree, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<NcbjSectionThree, ?>>();

			attributeSetterBiConsumers.put(
				"ncbjSectionThreeId",
				(BiConsumer<NcbjSectionThree, Long>)
					NcbjSectionThree::setNcbjSectionThreeId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<NcbjSectionThree, Long>)
					NcbjSectionThree::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<NcbjSectionThree, Long>)
					NcbjSectionThree::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<NcbjSectionThree, Long>)
					NcbjSectionThree::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<NcbjSectionThree, Date>)
					NcbjSectionThree::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<NcbjSectionThree, Date>)
					NcbjSectionThree::setModifiedDate);
			attributeSetterBiConsumers.put(
				"processActivityDescription",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setProcessActivityDescription);
			attributeSetterBiConsumers.put(
				"incomingMaterialsDes",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setIncomingMaterialsDes);
			attributeSetterBiConsumers.put(
				"processDescription",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setProcessDescription);
			attributeSetterBiConsumers.put(
				"processActivitiesList",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setProcessActivitiesList);
			attributeSetterBiConsumers.put(
				"specialActivities",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setSpecialActivities);
			attributeSetterBiConsumers.put(
				"explainationBox",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setExplainationBox);
			attributeSetterBiConsumers.put(
				"categoryOne",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setCategoryOne);
			attributeSetterBiConsumers.put(
				"categoryTwo",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setCategoryTwo);
			attributeSetterBiConsumers.put(
				"categoryThree",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setCategoryThree);
			attributeSetterBiConsumers.put(
				"categoryFour",
				(BiConsumer<NcbjSectionThree, String>)
					NcbjSectionThree::setCategoryFour);
			attributeSetterBiConsumers.put(
				"ncbjApplicationId",
				(BiConsumer<NcbjSectionThree, Long>)
					NcbjSectionThree::setNcbjApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getNcbjSectionThreeId() {
		return _ncbjSectionThreeId;
	}

	@Override
	public void setNcbjSectionThreeId(long ncbjSectionThreeId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_ncbjSectionThreeId = ncbjSectionThreeId;
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
	public String getProcessActivityDescription() {
		if (_processActivityDescription == null) {
			return "";
		}
		else {
			return _processActivityDescription;
		}
	}

	@Override
	public void setProcessActivityDescription(
		String processActivityDescription) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_processActivityDescription = processActivityDescription;
	}

	@JSON
	@Override
	public String getIncomingMaterialsDes() {
		if (_incomingMaterialsDes == null) {
			return "";
		}
		else {
			return _incomingMaterialsDes;
		}
	}

	@Override
	public void setIncomingMaterialsDes(String incomingMaterialsDes) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_incomingMaterialsDes = incomingMaterialsDes;
	}

	@JSON
	@Override
	public String getProcessDescription() {
		if (_processDescription == null) {
			return "";
		}
		else {
			return _processDescription;
		}
	}

	@Override
	public void setProcessDescription(String processDescription) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_processDescription = processDescription;
	}

	@JSON
	@Override
	public String getProcessActivitiesList() {
		if (_processActivitiesList == null) {
			return "";
		}
		else {
			return _processActivitiesList;
		}
	}

	@Override
	public void setProcessActivitiesList(String processActivitiesList) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_processActivitiesList = processActivitiesList;
	}

	@JSON
	@Override
	public String getSpecialActivities() {
		if (_specialActivities == null) {
			return "";
		}
		else {
			return _specialActivities;
		}
	}

	@Override
	public void setSpecialActivities(String specialActivities) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_specialActivities = specialActivities;
	}

	@JSON
	@Override
	public String getExplainationBox() {
		if (_explainationBox == null) {
			return "";
		}
		else {
			return _explainationBox;
		}
	}

	@Override
	public void setExplainationBox(String explainationBox) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_explainationBox = explainationBox;
	}

	@JSON
	@Override
	public String getCategoryOne() {
		if (_categoryOne == null) {
			return "";
		}
		else {
			return _categoryOne;
		}
	}

	@Override
	public void setCategoryOne(String categoryOne) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_categoryOne = categoryOne;
	}

	@JSON
	@Override
	public String getCategoryTwo() {
		if (_categoryTwo == null) {
			return "";
		}
		else {
			return _categoryTwo;
		}
	}

	@Override
	public void setCategoryTwo(String categoryTwo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_categoryTwo = categoryTwo;
	}

	@JSON
	@Override
	public String getCategoryThree() {
		if (_categoryThree == null) {
			return "";
		}
		else {
			return _categoryThree;
		}
	}

	@Override
	public void setCategoryThree(String categoryThree) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_categoryThree = categoryThree;
	}

	@JSON
	@Override
	public String getCategoryFour() {
		if (_categoryFour == null) {
			return "";
		}
		else {
			return _categoryFour;
		}
	}

	@Override
	public void setCategoryFour(String categoryFour) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_categoryFour = categoryFour;
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
			getCompanyId(), NcbjSectionThree.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public NcbjSectionThree toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, NcbjSectionThree>
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
		NcbjSectionThreeImpl ncbjSectionThreeImpl = new NcbjSectionThreeImpl();

		ncbjSectionThreeImpl.setNcbjSectionThreeId(getNcbjSectionThreeId());
		ncbjSectionThreeImpl.setGroupId(getGroupId());
		ncbjSectionThreeImpl.setCompanyId(getCompanyId());
		ncbjSectionThreeImpl.setUserId(getUserId());
		ncbjSectionThreeImpl.setUserName(getUserName());
		ncbjSectionThreeImpl.setCreateDate(getCreateDate());
		ncbjSectionThreeImpl.setModifiedDate(getModifiedDate());
		ncbjSectionThreeImpl.setProcessActivityDescription(
			getProcessActivityDescription());
		ncbjSectionThreeImpl.setIncomingMaterialsDes(getIncomingMaterialsDes());
		ncbjSectionThreeImpl.setProcessDescription(getProcessDescription());
		ncbjSectionThreeImpl.setProcessActivitiesList(
			getProcessActivitiesList());
		ncbjSectionThreeImpl.setSpecialActivities(getSpecialActivities());
		ncbjSectionThreeImpl.setExplainationBox(getExplainationBox());
		ncbjSectionThreeImpl.setCategoryOne(getCategoryOne());
		ncbjSectionThreeImpl.setCategoryTwo(getCategoryTwo());
		ncbjSectionThreeImpl.setCategoryThree(getCategoryThree());
		ncbjSectionThreeImpl.setCategoryFour(getCategoryFour());
		ncbjSectionThreeImpl.setNcbjApplicationId(getNcbjApplicationId());

		ncbjSectionThreeImpl.resetOriginalValues();

		return ncbjSectionThreeImpl;
	}

	@Override
	public NcbjSectionThree cloneWithOriginalValues() {
		NcbjSectionThreeImpl ncbjSectionThreeImpl = new NcbjSectionThreeImpl();

		ncbjSectionThreeImpl.setNcbjSectionThreeId(
			this.<Long>getColumnOriginalValue("ncbjSectionThreeId"));
		ncbjSectionThreeImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		ncbjSectionThreeImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		ncbjSectionThreeImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		ncbjSectionThreeImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		ncbjSectionThreeImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		ncbjSectionThreeImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		ncbjSectionThreeImpl.setProcessActivityDescription(
			this.<String>getColumnOriginalValue("processActivityDescription"));
		ncbjSectionThreeImpl.setIncomingMaterialsDes(
			this.<String>getColumnOriginalValue("incomingMaterialsDes"));
		ncbjSectionThreeImpl.setProcessDescription(
			this.<String>getColumnOriginalValue("processDescription"));
		ncbjSectionThreeImpl.setProcessActivitiesList(
			this.<String>getColumnOriginalValue("processActivitiesList"));
		ncbjSectionThreeImpl.setSpecialActivities(
			this.<String>getColumnOriginalValue("specialActivities"));
		ncbjSectionThreeImpl.setExplainationBox(
			this.<String>getColumnOriginalValue("explainationBox"));
		ncbjSectionThreeImpl.setCategoryOne(
			this.<String>getColumnOriginalValue("categoryOne"));
		ncbjSectionThreeImpl.setCategoryTwo(
			this.<String>getColumnOriginalValue("categoryTwo"));
		ncbjSectionThreeImpl.setCategoryThree(
			this.<String>getColumnOriginalValue("categoryThree"));
		ncbjSectionThreeImpl.setCategoryFour(
			this.<String>getColumnOriginalValue("categoryFour"));
		ncbjSectionThreeImpl.setNcbjApplicationId(
			this.<Long>getColumnOriginalValue("ncbjApplicationId"));

		return ncbjSectionThreeImpl;
	}

	@Override
	public int compareTo(NcbjSectionThree ncbjSectionThree) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), ncbjSectionThree.getCreateDate());

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

		if (!(object instanceof NcbjSectionThree)) {
			return false;
		}

		NcbjSectionThree ncbjSectionThree = (NcbjSectionThree)object;

		long primaryKey = ncbjSectionThree.getPrimaryKey();

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
	public CacheModel<NcbjSectionThree> toCacheModel() {
		NcbjSectionThreeCacheModel ncbjSectionThreeCacheModel =
			new NcbjSectionThreeCacheModel();

		ncbjSectionThreeCacheModel.ncbjSectionThreeId = getNcbjSectionThreeId();

		ncbjSectionThreeCacheModel.groupId = getGroupId();

		ncbjSectionThreeCacheModel.companyId = getCompanyId();

		ncbjSectionThreeCacheModel.userId = getUserId();

		ncbjSectionThreeCacheModel.userName = getUserName();

		String userName = ncbjSectionThreeCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			ncbjSectionThreeCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			ncbjSectionThreeCacheModel.createDate = createDate.getTime();
		}
		else {
			ncbjSectionThreeCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			ncbjSectionThreeCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			ncbjSectionThreeCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		ncbjSectionThreeCacheModel.processActivityDescription =
			getProcessActivityDescription();

		String processActivityDescription =
			ncbjSectionThreeCacheModel.processActivityDescription;

		if ((processActivityDescription != null) &&
			(processActivityDescription.length() == 0)) {

			ncbjSectionThreeCacheModel.processActivityDescription = null;
		}

		ncbjSectionThreeCacheModel.incomingMaterialsDes =
			getIncomingMaterialsDes();

		String incomingMaterialsDes =
			ncbjSectionThreeCacheModel.incomingMaterialsDes;

		if ((incomingMaterialsDes != null) &&
			(incomingMaterialsDes.length() == 0)) {

			ncbjSectionThreeCacheModel.incomingMaterialsDes = null;
		}

		ncbjSectionThreeCacheModel.processDescription = getProcessDescription();

		String processDescription =
			ncbjSectionThreeCacheModel.processDescription;

		if ((processDescription != null) &&
			(processDescription.length() == 0)) {

			ncbjSectionThreeCacheModel.processDescription = null;
		}

		ncbjSectionThreeCacheModel.processActivitiesList =
			getProcessActivitiesList();

		String processActivitiesList =
			ncbjSectionThreeCacheModel.processActivitiesList;

		if ((processActivitiesList != null) &&
			(processActivitiesList.length() == 0)) {

			ncbjSectionThreeCacheModel.processActivitiesList = null;
		}

		ncbjSectionThreeCacheModel.specialActivities = getSpecialActivities();

		String specialActivities = ncbjSectionThreeCacheModel.specialActivities;

		if ((specialActivities != null) && (specialActivities.length() == 0)) {
			ncbjSectionThreeCacheModel.specialActivities = null;
		}

		ncbjSectionThreeCacheModel.explainationBox = getExplainationBox();

		String explainationBox = ncbjSectionThreeCacheModel.explainationBox;

		if ((explainationBox != null) && (explainationBox.length() == 0)) {
			ncbjSectionThreeCacheModel.explainationBox = null;
		}

		ncbjSectionThreeCacheModel.categoryOne = getCategoryOne();

		String categoryOne = ncbjSectionThreeCacheModel.categoryOne;

		if ((categoryOne != null) && (categoryOne.length() == 0)) {
			ncbjSectionThreeCacheModel.categoryOne = null;
		}

		ncbjSectionThreeCacheModel.categoryTwo = getCategoryTwo();

		String categoryTwo = ncbjSectionThreeCacheModel.categoryTwo;

		if ((categoryTwo != null) && (categoryTwo.length() == 0)) {
			ncbjSectionThreeCacheModel.categoryTwo = null;
		}

		ncbjSectionThreeCacheModel.categoryThree = getCategoryThree();

		String categoryThree = ncbjSectionThreeCacheModel.categoryThree;

		if ((categoryThree != null) && (categoryThree.length() == 0)) {
			ncbjSectionThreeCacheModel.categoryThree = null;
		}

		ncbjSectionThreeCacheModel.categoryFour = getCategoryFour();

		String categoryFour = ncbjSectionThreeCacheModel.categoryFour;

		if ((categoryFour != null) && (categoryFour.length() == 0)) {
			ncbjSectionThreeCacheModel.categoryFour = null;
		}

		ncbjSectionThreeCacheModel.ncbjApplicationId = getNcbjApplicationId();

		return ncbjSectionThreeCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<NcbjSectionThree, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<NcbjSectionThree, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<NcbjSectionThree, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(NcbjSectionThree)this);

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

		private static final Function<InvocationHandler, NcbjSectionThree>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					NcbjSectionThree.class, ModelWrapper.class);

	}

	private long _ncbjSectionThreeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _processActivityDescription;
	private String _incomingMaterialsDes;
	private String _processDescription;
	private String _processActivitiesList;
	private String _specialActivities;
	private String _explainationBox;
	private String _categoryOne;
	private String _categoryTwo;
	private String _categoryThree;
	private String _categoryFour;
	private long _ncbjApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<NcbjSectionThree, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((NcbjSectionThree)this);
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

		_columnOriginalValues.put("ncbjSectionThreeId", _ncbjSectionThreeId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"processActivityDescription", _processActivityDescription);
		_columnOriginalValues.put(
			"incomingMaterialsDes", _incomingMaterialsDes);
		_columnOriginalValues.put("processDescription", _processDescription);
		_columnOriginalValues.put(
			"processActivitiesList", _processActivitiesList);
		_columnOriginalValues.put("specialActivities", _specialActivities);
		_columnOriginalValues.put("explainationBox", _explainationBox);
		_columnOriginalValues.put("categoryOne", _categoryOne);
		_columnOriginalValues.put("categoryTwo", _categoryTwo);
		_columnOriginalValues.put("categoryThree", _categoryThree);
		_columnOriginalValues.put("categoryFour", _categoryFour);
		_columnOriginalValues.put("ncbjApplicationId", _ncbjApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("ncbjSectionThreeId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("processActivityDescription", 128L);

		columnBitmasks.put("incomingMaterialsDes", 256L);

		columnBitmasks.put("processDescription", 512L);

		columnBitmasks.put("processActivitiesList", 1024L);

		columnBitmasks.put("specialActivities", 2048L);

		columnBitmasks.put("explainationBox", 4096L);

		columnBitmasks.put("categoryOne", 8192L);

		columnBitmasks.put("categoryTwo", 16384L);

		columnBitmasks.put("categoryThree", 32768L);

		columnBitmasks.put("categoryFour", 65536L);

		columnBitmasks.put("ncbjApplicationId", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private NcbjSectionThree _escapedModel;

}