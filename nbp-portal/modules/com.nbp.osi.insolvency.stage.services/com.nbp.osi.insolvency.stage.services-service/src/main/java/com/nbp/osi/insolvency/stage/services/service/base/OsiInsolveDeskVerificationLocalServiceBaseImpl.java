/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.base;

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

import com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification;
import com.nbp.osi.insolvency.stage.services.service.OsiInsolveDeskVerificationLocalService;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsoIIssuanceOfReportPersistence;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolDataVerificationPersistence;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolveDeskVerificationPersistence;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolvencyApplicationStagesPersistence;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolvencyPaymentConfirmationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the osi insolve desk verification local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolveDeskVerificationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolveDeskVerificationLocalServiceImpl
 * @generated
 */
public abstract class OsiInsolveDeskVerificationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   OsiInsolveDeskVerificationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OsiInsolveDeskVerificationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.osi.insolvency.stage.services.service.OsiInsolveDeskVerificationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the osi insolve desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OsiInsolveDeskVerification addOsiInsolveDeskVerification(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		osiInsolveDeskVerification.setNew(true);

		return osiInsolveDeskVerificationPersistence.update(
			osiInsolveDeskVerification);
	}

	/**
	 * Creates a new osi insolve desk verification with the primary key. Does not add the osi insolve desk verification to the database.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key for the new osi insolve desk verification
	 * @return the new osi insolve desk verification
	 */
	@Override
	@Transactional(enabled = false)
	public OsiInsolveDeskVerification createOsiInsolveDeskVerification(
		long OsiInsolveDeskVerificationId) {

		return osiInsolveDeskVerificationPersistence.create(
			OsiInsolveDeskVerificationId);
	}

	/**
	 * Deletes the osi insolve desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification that was removed
	 * @throws PortalException if a osi insolve desk verification with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OsiInsolveDeskVerification deleteOsiInsolveDeskVerification(
			long OsiInsolveDeskVerificationId)
		throws PortalException {

		return osiInsolveDeskVerificationPersistence.remove(
			OsiInsolveDeskVerificationId);
	}

	/**
	 * Deletes the osi insolve desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OsiInsolveDeskVerification deleteOsiInsolveDeskVerification(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return osiInsolveDeskVerificationPersistence.remove(
			osiInsolveDeskVerification);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return osiInsolveDeskVerificationPersistence.dslQuery(dslQuery);
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
			OsiInsolveDeskVerification.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return osiInsolveDeskVerificationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
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

		return osiInsolveDeskVerificationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
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

		return osiInsolveDeskVerificationPersistence.findWithDynamicQuery(
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
		return osiInsolveDeskVerificationPersistence.countWithDynamicQuery(
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

		return osiInsolveDeskVerificationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public OsiInsolveDeskVerification fetchOsiInsolveDeskVerification(
		long OsiInsolveDeskVerificationId) {

		return osiInsolveDeskVerificationPersistence.fetchByPrimaryKey(
			OsiInsolveDeskVerificationId);
	}

	/**
	 * Returns the osi insolve desk verification with the primary key.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification
	 * @throws PortalException if a osi insolve desk verification with the primary key could not be found
	 */
	@Override
	public OsiInsolveDeskVerification getOsiInsolveDeskVerification(
			long OsiInsolveDeskVerificationId)
		throws PortalException {

		return osiInsolveDeskVerificationPersistence.findByPrimaryKey(
			OsiInsolveDeskVerificationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			osiInsolveDeskVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OsiInsolveDeskVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"OsiInsolveDeskVerificationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			osiInsolveDeskVerificationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			OsiInsolveDeskVerification.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"OsiInsolveDeskVerificationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			osiInsolveDeskVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OsiInsolveDeskVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"OsiInsolveDeskVerificationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return osiInsolveDeskVerificationPersistence.create(
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
				"Implement OsiInsolveDeskVerificationLocalServiceImpl#deleteOsiInsolveDeskVerification(OsiInsolveDeskVerification) to avoid orphaned data");
		}

		return osiInsolveDeskVerificationLocalService.
			deleteOsiInsolveDeskVerification(
				(OsiInsolveDeskVerification)persistedModel);
	}

	@Override
	public BasePersistence<OsiInsolveDeskVerification> getBasePersistence() {
		return osiInsolveDeskVerificationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return osiInsolveDeskVerificationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @return the range of osi insolve desk verifications
	 */
	@Override
	public List<OsiInsolveDeskVerification> getOsiInsolveDeskVerifications(
		int start, int end) {

		return osiInsolveDeskVerificationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of osi insolve desk verifications.
	 *
	 * @return the number of osi insolve desk verifications
	 */
	@Override
	public int getOsiInsolveDeskVerificationsCount() {
		return osiInsolveDeskVerificationPersistence.countAll();
	}

	/**
	 * Updates the osi insolve desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OsiInsolveDeskVerification updateOsiInsolveDeskVerification(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return osiInsolveDeskVerificationPersistence.update(
			osiInsolveDeskVerification);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OsiInsolveDeskVerificationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		osiInsolveDeskVerificationLocalService =
			(OsiInsolveDeskVerificationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OsiInsolveDeskVerificationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OsiInsolveDeskVerification.class;
	}

	protected String getModelClassName() {
		return OsiInsolveDeskVerification.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				osiInsolveDeskVerificationPersistence.getDataSource();

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
	protected OsiInsoIIssuanceOfReportPersistence
		osiInsoIIssuanceOfReportPersistence;

	@Reference
	protected OsiInsolDataVerificationPersistence
		osiInsolDataVerificationPersistence;

	protected OsiInsolveDeskVerificationLocalService
		osiInsolveDeskVerificationLocalService;

	@Reference
	protected OsiInsolveDeskVerificationPersistence
		osiInsolveDeskVerificationPersistence;

	@Reference
	protected OsiInsolvencyApplicationStagesPersistence
		osiInsolvencyApplicationStagesPersistence;

	@Reference
	protected OsiInsolvencyPaymentConfirmationPersistence
		osiInsolvencyPaymentConfirmationPersistence;

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
		OsiInsolveDeskVerificationLocalServiceBaseImpl.class);

}