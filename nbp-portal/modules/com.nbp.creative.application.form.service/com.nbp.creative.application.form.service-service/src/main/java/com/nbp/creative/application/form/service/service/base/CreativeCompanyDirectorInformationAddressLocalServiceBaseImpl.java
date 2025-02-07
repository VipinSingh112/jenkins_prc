/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.base;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationAddress;
import com.nbp.creative.application.form.service.service.CreativeCompanyDirectorInformationAddressLocalService;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationCurrentStagePersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyApplicantInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDetailsAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDetailsPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyEconomicEffectPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyGeneralInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeContactInfoAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeDirectorListinAddBoxPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualEconomicEffectPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualGeneralInformationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeSocialMediaAddBoxPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the creative company director information address local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.creative.application.form.service.service.impl.CreativeCompanyDirectorInformationAddressLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.creative.application.form.service.service.impl.CreativeCompanyDirectorInformationAddressLocalServiceImpl
 * @generated
 */
public abstract class
	CreativeCompanyDirectorInformationAddressLocalServiceBaseImpl
		extends BaseLocalServiceImpl
		implements AopService,
				   CreativeCompanyDirectorInformationAddressLocalService,
				   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CreativeCompanyDirectorInformationAddressLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.creative.application.form.service.service.CreativeCompanyDirectorInformationAddressLocalServiceUtil</code>.
	 */

	/**
	 * Adds the creative company director information address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 * @return the creative company director information address that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CreativeCompanyDirectorInformationAddress
		addCreativeCompanyDirectorInformationAddress(
			CreativeCompanyDirectorInformationAddress
				creativeCompanyDirectorInformationAddress) {

		creativeCompanyDirectorInformationAddress.setNew(true);

		return creativeCompanyDirectorInformationAddressPersistence.update(
			creativeCompanyDirectorInformationAddress);
	}

	/**
	 * Creates a new creative company director information address with the primary key. Does not add the creative company director information address to the database.
	 *
	 * @param creativeComDirectorAddressId the primary key for the new creative company director information address
	 * @return the new creative company director information address
	 */
	@Override
	@Transactional(enabled = false)
	public CreativeCompanyDirectorInformationAddress
		createCreativeCompanyDirectorInformationAddress(
			long creativeComDirectorAddressId) {

		return creativeCompanyDirectorInformationAddressPersistence.create(
			creativeComDirectorAddressId);
	}

	/**
	 * Deletes the creative company director information address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address that was removed
	 * @throws PortalException if a creative company director information address with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CreativeCompanyDirectorInformationAddress
			deleteCreativeCompanyDirectorInformationAddress(
				long creativeComDirectorAddressId)
		throws PortalException {

		return creativeCompanyDirectorInformationAddressPersistence.remove(
			creativeComDirectorAddressId);
	}

	/**
	 * Deletes the creative company director information address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 * @return the creative company director information address that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CreativeCompanyDirectorInformationAddress
		deleteCreativeCompanyDirectorInformationAddress(
			CreativeCompanyDirectorInformationAddress
				creativeCompanyDirectorInformationAddress) {

		return creativeCompanyDirectorInformationAddressPersistence.remove(
			creativeCompanyDirectorInformationAddress);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return creativeCompanyDirectorInformationAddressPersistence.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			CreativeCompanyDirectorInformationAddress.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return creativeCompanyDirectorInformationAddressPersistence.
			findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return creativeCompanyDirectorInformationAddressPersistence.
			findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return creativeCompanyDirectorInformationAddressPersistence.
			findWithDynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return creativeCompanyDirectorInformationAddressPersistence.
			countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return creativeCompanyDirectorInformationAddressPersistence.
			countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public CreativeCompanyDirectorInformationAddress
		fetchCreativeCompanyDirectorInformationAddress(
			long creativeComDirectorAddressId) {

		return creativeCompanyDirectorInformationAddressPersistence.
			fetchByPrimaryKey(creativeComDirectorAddressId);
	}

	/**
	 * Returns the creative company director information address with the primary key.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address
	 * @throws PortalException if a creative company director information address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress
			getCreativeCompanyDirectorInformationAddress(
				long creativeComDirectorAddressId)
		throws PortalException {

		return creativeCompanyDirectorInformationAddressPersistence.
			findByPrimaryKey(creativeComDirectorAddressId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			creativeCompanyDirectorInformationAddressLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			CreativeCompanyDirectorInformationAddress.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeComDirectorAddressId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			creativeCompanyDirectorInformationAddressLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			CreativeCompanyDirectorInformationAddress.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeComDirectorAddressId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			creativeCompanyDirectorInformationAddressLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			CreativeCompanyDirectorInformationAddress.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeComDirectorAddressId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return creativeCompanyDirectorInformationAddressPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement CreativeCompanyDirectorInformationAddressLocalServiceImpl#deleteCreativeCompanyDirectorInformationAddress(CreativeCompanyDirectorInformationAddress) to avoid orphaned data");
		}

		return creativeCompanyDirectorInformationAddressLocalService.
			deleteCreativeCompanyDirectorInformationAddress(
				(CreativeCompanyDirectorInformationAddress)persistedModel);
	}

	@Override
	public BasePersistence<CreativeCompanyDirectorInformationAddress>
		getBasePersistence() {

		return creativeCompanyDirectorInformationAddressPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return creativeCompanyDirectorInformationAddressPersistence.
			findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @return the range of creative company director information addresses
	 */
	@Override
	public List<CreativeCompanyDirectorInformationAddress>
		getCreativeCompanyDirectorInformationAddresses(int start, int end) {

		return creativeCompanyDirectorInformationAddressPersistence.findAll(
			start, end);
	}

	/**
	 * Returns the number of creative company director information addresses.
	 *
	 * @return the number of creative company director information addresses
	 */
	@Override
	public int getCreativeCompanyDirectorInformationAddressesCount() {
		return creativeCompanyDirectorInformationAddressPersistence.countAll();
	}

	/**
	 * Updates the creative company director information address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 * @return the creative company director information address that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CreativeCompanyDirectorInformationAddress
		updateCreativeCompanyDirectorInformationAddress(
			CreativeCompanyDirectorInformationAddress
				creativeCompanyDirectorInformationAddress) {

		return creativeCompanyDirectorInformationAddressPersistence.update(
			creativeCompanyDirectorInformationAddress);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CreativeCompanyDirectorInformationAddressLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		creativeCompanyDirectorInformationAddressLocalService =
			(CreativeCompanyDirectorInformationAddressLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CreativeCompanyDirectorInformationAddressLocalService.class.
			getName();
	}

	protected Class<?> getModelClass() {
		return CreativeCompanyDirectorInformationAddress.class;
	}

	protected String getModelClassName() {
		return CreativeCompanyDirectorInformationAddress.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				creativeCompanyDirectorInformationAddressPersistence.
					getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	@Reference
	protected CreativeApplicationPersistence creativeApplicationPersistence;

	@Reference
	protected CreativeApplicationCurrentStagePersistence
		creativeApplicationCurrentStagePersistence;

	@Reference
	protected CreativeCompanyApplicantInformationPersistence
		creativeCompanyApplicantInformationPersistence;

	@Reference
	protected CreativeCompanyDetailsPersistence
		creativeCompanyDetailsPersistence;

	@Reference
	protected CreativeCompanyDetailsAddressPersistence
		creativeCompanyDetailsAddressPersistence;

	@Reference
	protected CreativeCompanyDirectorInformationPersistence
		creativeCompanyDirectorInformationPersistence;

	protected CreativeCompanyDirectorInformationAddressLocalService
		creativeCompanyDirectorInformationAddressLocalService;

	@Reference
	protected CreativeCompanyDirectorInformationAddressPersistence
		creativeCompanyDirectorInformationAddressPersistence;

	@Reference
	protected CreativeCompanyEconomicEffectPersistence
		creativeCompanyEconomicEffectPersistence;

	@Reference
	protected CreativeCompanyGeneralInformationPersistence
		creativeCompanyGeneralInformationPersistence;

	@Reference
	protected CreativeContactInfoAddBoxPersistence
		creativeContactInfoAddBoxPersistence;

	@Reference
	protected CreativeDirectorListinAddBoxPersistence
		creativeDirectorListinAddBoxPersistence;

	@Reference
	protected CreativeIndividualDetailsPersistence
		creativeIndividualDetailsPersistence;

	@Reference
	protected CreativeIndividualDetailsAddressPersistence
		creativeIndividualDetailsAddressPersistence;

	@Reference
	protected CreativeIndividualEconomicEffectPersistence
		creativeIndividualEconomicEffectPersistence;

	@Reference
	protected CreativeIndividualGeneralInformationPersistence
		creativeIndividualGeneralInformationPersistence;

	@Reference
	protected CreativeSocialMediaAddBoxPersistence
		creativeSocialMediaAddBoxPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeCompanyDirectorInformationAddressLocalServiceBaseImpl.class);

}