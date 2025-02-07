/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.npm.cannabis.application.stages.services.service.base;

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

import com.npm.cannabis.application.stages.services.model.CannabisAppDeskVerification;
import com.npm.cannabis.application.stages.services.service.CannabisAppDeskVerificationLocalService;
import com.npm.cannabis.application.stages.services.service.CannabisAppDeskVerificationLocalServiceUtil;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisAppDeskVerificationPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationDueDiligencePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationStagesPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisConditionalLicensePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisInspectionPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePaymentPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePreCondtionsPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.FullLicenseCommitteeDecisionPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the cannabis app desk verification local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.npm.cannabis.application.stages.services.service.impl.CannabisAppDeskVerificationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.npm.cannabis.application.stages.services.service.impl.CannabisAppDeskVerificationLocalServiceImpl
 * @generated
 */
public abstract class CannabisAppDeskVerificationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, CannabisAppDeskVerificationLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CannabisAppDeskVerificationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>CannabisAppDeskVerificationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the cannabis app desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisAppDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 * @return the cannabis app desk verification that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CannabisAppDeskVerification addCannabisAppDeskVerification(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		cannabisAppDeskVerification.setNew(true);

		return cannabisAppDeskVerificationPersistence.update(
			cannabisAppDeskVerification);
	}

	/**
	 * Creates a new cannabis app desk verification with the primary key. Does not add the cannabis app desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis app desk verification
	 * @return the new cannabis app desk verification
	 */
	@Override
	@Transactional(enabled = false)
	public CannabisAppDeskVerification createCannabisAppDeskVerification(
		long cannabisDeskVerificationId) {

		return cannabisAppDeskVerificationPersistence.create(
			cannabisDeskVerificationId);
	}

	/**
	 * Deletes the cannabis app desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisAppDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification that was removed
	 * @throws PortalException if a cannabis app desk verification with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CannabisAppDeskVerification deleteCannabisAppDeskVerification(
			long cannabisDeskVerificationId)
		throws PortalException {

		return cannabisAppDeskVerificationPersistence.remove(
			cannabisDeskVerificationId);
	}

	/**
	 * Deletes the cannabis app desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisAppDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 * @return the cannabis app desk verification that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CannabisAppDeskVerification deleteCannabisAppDeskVerification(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		return cannabisAppDeskVerificationPersistence.remove(
			cannabisAppDeskVerification);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return cannabisAppDeskVerificationPersistence.dslQuery(dslQuery);
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
			CannabisAppDeskVerification.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return cannabisAppDeskVerificationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisAppDeskVerificationModelImpl</code>.
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

		return cannabisAppDeskVerificationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisAppDeskVerificationModelImpl</code>.
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

		return cannabisAppDeskVerificationPersistence.findWithDynamicQuery(
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
		return cannabisAppDeskVerificationPersistence.countWithDynamicQuery(
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

		return cannabisAppDeskVerificationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public CannabisAppDeskVerification fetchCannabisAppDeskVerification(
		long cannabisDeskVerificationId) {

		return cannabisAppDeskVerificationPersistence.fetchByPrimaryKey(
			cannabisDeskVerificationId);
	}

	/**
	 * Returns the cannabis app desk verification with the primary key.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification
	 * @throws PortalException if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public CannabisAppDeskVerification getCannabisAppDeskVerification(
			long cannabisDeskVerificationId)
		throws PortalException {

		return cannabisAppDeskVerificationPersistence.findByPrimaryKey(
			cannabisDeskVerificationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			cannabisAppDeskVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(CannabisAppDeskVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"cannabisDeskVerificationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			cannabisAppDeskVerificationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			CannabisAppDeskVerification.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"cannabisDeskVerificationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			cannabisAppDeskVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(CannabisAppDeskVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"cannabisDeskVerificationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cannabisAppDeskVerificationPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return cannabisAppDeskVerificationLocalService.
			deleteCannabisAppDeskVerification(
				(CannabisAppDeskVerification)persistedModel);
	}

	@Override
	public BasePersistence<CannabisAppDeskVerification> getBasePersistence() {
		return cannabisAppDeskVerificationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cannabisAppDeskVerificationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the cannabis app desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @return the range of cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> getCannabisAppDeskVerifications(
		int start, int end) {

		return cannabisAppDeskVerificationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of cannabis app desk verifications.
	 *
	 * @return the number of cannabis app desk verifications
	 */
	@Override
	public int getCannabisAppDeskVerificationsCount() {
		return cannabisAppDeskVerificationPersistence.countAll();
	}

	/**
	 * Updates the cannabis app desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisAppDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 * @return the cannabis app desk verification that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CannabisAppDeskVerification updateCannabisAppDeskVerification(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		return cannabisAppDeskVerificationPersistence.update(
			cannabisAppDeskVerification);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CannabisAppDeskVerificationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		cannabisAppDeskVerificationLocalService =
			(CannabisAppDeskVerificationLocalService)aopProxy;

		_setLocalServiceUtilService(cannabisAppDeskVerificationLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CannabisAppDeskVerificationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CannabisAppDeskVerification.class;
	}

	protected String getModelClassName() {
		return CannabisAppDeskVerification.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				cannabisAppDeskVerificationPersistence.getDataSource();

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

	private void _setLocalServiceUtilService(
		CannabisAppDeskVerificationLocalService
			cannabisAppDeskVerificationLocalService) {

		try {
			Field field =
				CannabisAppDeskVerificationLocalServiceUtil.class.
					getDeclaredField("_service");

			field.setAccessible(true);

			field.set(null, cannabisAppDeskVerificationLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	protected CannabisAppDeskVerificationLocalService
		cannabisAppDeskVerificationLocalService;

	@Reference
	protected CannabisAppDeskVerificationPersistence
		cannabisAppDeskVerificationPersistence;

	@Reference
	protected CannabisApplicationDueDiligencePersistence
		cannabisApplicationDueDiligencePersistence;

	@Reference
	protected CannabisApplicationStagesPersistence
		cannabisApplicationStagesPersistence;

	@Reference
	protected CannabisConditionalLicensePersistence
		cannabisConditionalLicensePersistence;

	@Reference
	protected CannabisInspectionPersistence cannabisInspectionPersistence;

	@Reference
	protected CannabisLicensePersistence cannabisLicensePersistence;

	@Reference
	protected CannabisLicensePaymentPersistence
		cannabisLicensePaymentPersistence;

	@Reference
	protected CannabisLicensePreCondtionsPersistence
		cannabisLicensePreCondtionsPersistence;

	@Reference
	protected FullLicenseCommitteeDecisionPersistence
		fullLicenseCommitteeDecisionPersistence;

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

}