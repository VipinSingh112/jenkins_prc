/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.base;

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

import com.nbp.healthcare.application.form.service.model.HealthCareBusinessAddress;
import com.nbp.healthcare.application.form.service.service.HealthCareBusinessAddressLocalService;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicantAddressPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicantInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicationPaymentPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicationPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareBusinessAddressPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareBussinessInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareCurrentStagePersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareDescriptionOfServicePersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareEquipmentInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthcareEquipHeadingListPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the health care business address local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.healthcare.application.form.service.service.impl.HealthCareBusinessAddressLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.healthcare.application.form.service.service.impl.HealthCareBusinessAddressLocalServiceImpl
 * @generated
 */
public abstract class HealthCareBusinessAddressLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, HealthCareBusinessAddressLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>HealthCareBusinessAddressLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.healthcare.application.form.service.service.HealthCareBusinessAddressLocalServiceUtil</code>.
	 */

	/**
	 * Adds the health care business address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBusinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBusinessAddress the health care business address
	 * @return the health care business address that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public HealthCareBusinessAddress addHealthCareBusinessAddress(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		healthCareBusinessAddress.setNew(true);

		return healthCareBusinessAddressPersistence.update(
			healthCareBusinessAddress);
	}

	/**
	 * Creates a new health care business address with the primary key. Does not add the health care business address to the database.
	 *
	 * @param healthCareBusinessAddressId the primary key for the new health care business address
	 * @return the new health care business address
	 */
	@Override
	@Transactional(enabled = false)
	public HealthCareBusinessAddress createHealthCareBusinessAddress(
		long healthCareBusinessAddressId) {

		return healthCareBusinessAddressPersistence.create(
			healthCareBusinessAddressId);
	}

	/**
	 * Deletes the health care business address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBusinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address that was removed
	 * @throws PortalException if a health care business address with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public HealthCareBusinessAddress deleteHealthCareBusinessAddress(
			long healthCareBusinessAddressId)
		throws PortalException {

		return healthCareBusinessAddressPersistence.remove(
			healthCareBusinessAddressId);
	}

	/**
	 * Deletes the health care business address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBusinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBusinessAddress the health care business address
	 * @return the health care business address that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public HealthCareBusinessAddress deleteHealthCareBusinessAddress(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		return healthCareBusinessAddressPersistence.remove(
			healthCareBusinessAddress);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return healthCareBusinessAddressPersistence.dslQuery(dslQuery);
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
			HealthCareBusinessAddress.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return healthCareBusinessAddressPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressModelImpl</code>.
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

		return healthCareBusinessAddressPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressModelImpl</code>.
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

		return healthCareBusinessAddressPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return healthCareBusinessAddressPersistence.countWithDynamicQuery(
			dynamicQuery);
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

		return healthCareBusinessAddressPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public HealthCareBusinessAddress fetchHealthCareBusinessAddress(
		long healthCareBusinessAddressId) {

		return healthCareBusinessAddressPersistence.fetchByPrimaryKey(
			healthCareBusinessAddressId);
	}

	/**
	 * Returns the health care business address with the primary key.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address
	 * @throws PortalException if a health care business address with the primary key could not be found
	 */
	@Override
	public HealthCareBusinessAddress getHealthCareBusinessAddress(
			long healthCareBusinessAddressId)
		throws PortalException {

		return healthCareBusinessAddressPersistence.findByPrimaryKey(
			healthCareBusinessAddressId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			healthCareBusinessAddressLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(HealthCareBusinessAddress.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"healthCareBusinessAddressId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			healthCareBusinessAddressLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			HealthCareBusinessAddress.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"healthCareBusinessAddressId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			healthCareBusinessAddressLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(HealthCareBusinessAddress.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"healthCareBusinessAddressId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return healthCareBusinessAddressPersistence.create(
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
				"Implement HealthCareBusinessAddressLocalServiceImpl#deleteHealthCareBusinessAddress(HealthCareBusinessAddress) to avoid orphaned data");
		}

		return healthCareBusinessAddressLocalService.
			deleteHealthCareBusinessAddress(
				(HealthCareBusinessAddress)persistedModel);
	}

	@Override
	public BasePersistence<HealthCareBusinessAddress> getBasePersistence() {
		return healthCareBusinessAddressPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return healthCareBusinessAddressPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @return the range of health care business addresses
	 */
	@Override
	public List<HealthCareBusinessAddress> getHealthCareBusinessAddresses(
		int start, int end) {

		return healthCareBusinessAddressPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of health care business addresses.
	 *
	 * @return the number of health care business addresses
	 */
	@Override
	public int getHealthCareBusinessAddressesCount() {
		return healthCareBusinessAddressPersistence.countAll();
	}

	/**
	 * Updates the health care business address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBusinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBusinessAddress the health care business address
	 * @return the health care business address that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public HealthCareBusinessAddress updateHealthCareBusinessAddress(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		return healthCareBusinessAddressPersistence.update(
			healthCareBusinessAddress);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			HealthCareBusinessAddressLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		healthCareBusinessAddressLocalService =
			(HealthCareBusinessAddressLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return HealthCareBusinessAddressLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return HealthCareBusinessAddress.class;
	}

	protected String getModelClassName() {
		return HealthCareBusinessAddress.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				healthCareBusinessAddressPersistence.getDataSource();

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
	protected HealthCareApplicantAddressPersistence
		healthCareApplicantAddressPersistence;

	@Reference
	protected HealthCareApplicantInfoPersistence
		healthCareApplicantInfoPersistence;

	@Reference
	protected HealthCareApplicationPersistence healthCareApplicationPersistence;

	@Reference
	protected HealthCareApplicationPaymentPersistence
		healthCareApplicationPaymentPersistence;

	protected HealthCareBusinessAddressLocalService
		healthCareBusinessAddressLocalService;

	@Reference
	protected HealthCareBusinessAddressPersistence
		healthCareBusinessAddressPersistence;

	@Reference
	protected HealthCareBussinessInfoPersistence
		healthCareBussinessInfoPersistence;

	@Reference
	protected HealthCareCurrentStagePersistence
		healthCareCurrentStagePersistence;

	@Reference
	protected HealthCareDescriptionOfServicePersistence
		healthCareDescriptionOfServicePersistence;

	@Reference
	protected HealthcareEquipHeadingListPersistence
		healthcareEquipHeadingListPersistence;

	@Reference
	protected HealthCareEquipmentInfoPersistence
		healthCareEquipmentInfoPersistence;

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
		HealthCareBusinessAddressLocalServiceBaseImpl.class);

}