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

import com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification;
import com.nbp.osi.insolvency.stage.services.service.OsiInsolDataVerificationLocalService;
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
 * Provides the base implementation for the osi insol data verification local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolDataVerificationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolDataVerificationLocalServiceImpl
 * @generated
 */
public abstract class OsiInsolDataVerificationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   OsiInsolDataVerificationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OsiInsolDataVerificationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.osi.insolvency.stage.services.service.OsiInsolDataVerificationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the osi insol data verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OsiInsolDataVerification addOsiInsolDataVerification(
		OsiInsolDataVerification osiInsolDataVerification) {

		osiInsolDataVerification.setNew(true);

		return osiInsolDataVerificationPersistence.update(
			osiInsolDataVerification);
	}

	/**
	 * Creates a new osi insol data verification with the primary key. Does not add the osi insol data verification to the database.
	 *
	 * @param osiInsolDataVerificationId the primary key for the new osi insol data verification
	 * @return the new osi insol data verification
	 */
	@Override
	@Transactional(enabled = false)
	public OsiInsolDataVerification createOsiInsolDataVerification(
		long osiInsolDataVerificationId) {

		return osiInsolDataVerificationPersistence.create(
			osiInsolDataVerificationId);
	}

	/**
	 * Deletes the osi insol data verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification that was removed
	 * @throws PortalException if a osi insol data verification with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OsiInsolDataVerification deleteOsiInsolDataVerification(
			long osiInsolDataVerificationId)
		throws PortalException {

		return osiInsolDataVerificationPersistence.remove(
			osiInsolDataVerificationId);
	}

	/**
	 * Deletes the osi insol data verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OsiInsolDataVerification deleteOsiInsolDataVerification(
		OsiInsolDataVerification osiInsolDataVerification) {

		return osiInsolDataVerificationPersistence.remove(
			osiInsolDataVerification);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return osiInsolDataVerificationPersistence.dslQuery(dslQuery);
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
			OsiInsolDataVerification.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return osiInsolDataVerificationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
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

		return osiInsolDataVerificationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
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

		return osiInsolDataVerificationPersistence.findWithDynamicQuery(
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
		return osiInsolDataVerificationPersistence.countWithDynamicQuery(
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

		return osiInsolDataVerificationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public OsiInsolDataVerification fetchOsiInsolDataVerification(
		long osiInsolDataVerificationId) {

		return osiInsolDataVerificationPersistence.fetchByPrimaryKey(
			osiInsolDataVerificationId);
	}

	/**
	 * Returns the osi insol data verification with the primary key.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification
	 * @throws PortalException if a osi insol data verification with the primary key could not be found
	 */
	@Override
	public OsiInsolDataVerification getOsiInsolDataVerification(
			long osiInsolDataVerificationId)
		throws PortalException {

		return osiInsolDataVerificationPersistence.findByPrimaryKey(
			osiInsolDataVerificationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			osiInsolDataVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OsiInsolDataVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"osiInsolDataVerificationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			osiInsolDataVerificationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			OsiInsolDataVerification.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"osiInsolDataVerificationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			osiInsolDataVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OsiInsolDataVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"osiInsolDataVerificationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return osiInsolDataVerificationPersistence.create(
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
				"Implement OsiInsolDataVerificationLocalServiceImpl#deleteOsiInsolDataVerification(OsiInsolDataVerification) to avoid orphaned data");
		}

		return osiInsolDataVerificationLocalService.
			deleteOsiInsolDataVerification(
				(OsiInsolDataVerification)persistedModel);
	}

	@Override
	public BasePersistence<OsiInsolDataVerification> getBasePersistence() {
		return osiInsolDataVerificationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return osiInsolDataVerificationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @return the range of osi insol data verifications
	 */
	@Override
	public List<OsiInsolDataVerification> getOsiInsolDataVerifications(
		int start, int end) {

		return osiInsolDataVerificationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of osi insol data verifications.
	 *
	 * @return the number of osi insol data verifications
	 */
	@Override
	public int getOsiInsolDataVerificationsCount() {
		return osiInsolDataVerificationPersistence.countAll();
	}

	/**
	 * Updates the osi insol data verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OsiInsolDataVerification updateOsiInsolDataVerification(
		OsiInsolDataVerification osiInsolDataVerification) {

		return osiInsolDataVerificationPersistence.update(
			osiInsolDataVerification);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OsiInsolDataVerificationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		osiInsolDataVerificationLocalService =
			(OsiInsolDataVerificationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OsiInsolDataVerificationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OsiInsolDataVerification.class;
	}

	protected String getModelClassName() {
		return OsiInsolDataVerification.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				osiInsolDataVerificationPersistence.getDataSource();

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

	protected OsiInsolDataVerificationLocalService
		osiInsolDataVerificationLocalService;

	@Reference
	protected OsiInsolDataVerificationPersistence
		osiInsolDataVerificationPersistence;

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
		OsiInsolDataVerificationLocalServiceBaseImpl.class);

}