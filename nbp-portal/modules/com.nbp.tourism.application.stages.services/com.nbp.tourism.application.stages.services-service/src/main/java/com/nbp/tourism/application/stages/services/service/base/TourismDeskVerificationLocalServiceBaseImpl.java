/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.base;

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

import com.nbp.tourism.application.stages.services.model.TourismDeskVerification;
import com.nbp.tourism.application.stages.services.service.TourismDeskVerificationLocalService;
import com.nbp.tourism.application.stages.services.service.persistence.TourismApplicationStagesPersistence;
import com.nbp.tourism.application.stages.services.service.persistence.TourismDeskVerificationPersistence;
import com.nbp.tourism.application.stages.services.service.persistence.TourismPaymentConfirmationPersistence;
import com.nbp.tourism.application.stages.services.service.persistence.TourismPermitPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the tourism desk verification local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.tourism.application.stages.services.service.impl.TourismDeskVerificationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.tourism.application.stages.services.service.impl.TourismDeskVerificationLocalServiceImpl
 * @generated
 */
public abstract class TourismDeskVerificationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   TourismDeskVerificationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>TourismDeskVerificationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.tourism.application.stages.services.service.TourismDeskVerificationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the tourism desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 * @return the tourism desk verification that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TourismDeskVerification addTourismDeskVerification(
		TourismDeskVerification tourismDeskVerification) {

		tourismDeskVerification.setNew(true);

		return tourismDeskVerificationPersistence.update(
			tourismDeskVerification);
	}

	/**
	 * Creates a new tourism desk verification with the primary key. Does not add the tourism desk verification to the database.
	 *
	 * @param tourismDeskVeriId the primary key for the new tourism desk verification
	 * @return the new tourism desk verification
	 */
	@Override
	@Transactional(enabled = false)
	public TourismDeskVerification createTourismDeskVerification(
		long tourismDeskVeriId) {

		return tourismDeskVerificationPersistence.create(tourismDeskVeriId);
	}

	/**
	 * Deletes the tourism desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification that was removed
	 * @throws PortalException if a tourism desk verification with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TourismDeskVerification deleteTourismDeskVerification(
			long tourismDeskVeriId)
		throws PortalException {

		return tourismDeskVerificationPersistence.remove(tourismDeskVeriId);
	}

	/**
	 * Deletes the tourism desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 * @return the tourism desk verification that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TourismDeskVerification deleteTourismDeskVerification(
		TourismDeskVerification tourismDeskVerification) {

		return tourismDeskVerificationPersistence.remove(
			tourismDeskVerification);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return tourismDeskVerificationPersistence.dslQuery(dslQuery);
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
			TourismDeskVerification.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return tourismDeskVerificationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationModelImpl</code>.
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

		return tourismDeskVerificationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationModelImpl</code>.
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

		return tourismDeskVerificationPersistence.findWithDynamicQuery(
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
		return tourismDeskVerificationPersistence.countWithDynamicQuery(
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

		return tourismDeskVerificationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public TourismDeskVerification fetchTourismDeskVerification(
		long tourismDeskVeriId) {

		return tourismDeskVerificationPersistence.fetchByPrimaryKey(
			tourismDeskVeriId);
	}

	/**
	 * Returns the tourism desk verification with the primary key.
	 *
	 * @param tourismDeskVeriId the primary key of the tourism desk verification
	 * @return the tourism desk verification
	 * @throws PortalException if a tourism desk verification with the primary key could not be found
	 */
	@Override
	public TourismDeskVerification getTourismDeskVerification(
			long tourismDeskVeriId)
		throws PortalException {

		return tourismDeskVerificationPersistence.findByPrimaryKey(
			tourismDeskVeriId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			tourismDeskVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(TourismDeskVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("tourismDeskVeriId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			tourismDeskVerificationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			TourismDeskVerification.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"tourismDeskVeriId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			tourismDeskVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(TourismDeskVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("tourismDeskVeriId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return tourismDeskVerificationPersistence.create(
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
				"Implement TourismDeskVerificationLocalServiceImpl#deleteTourismDeskVerification(TourismDeskVerification) to avoid orphaned data");
		}

		return tourismDeskVerificationLocalService.
			deleteTourismDeskVerification(
				(TourismDeskVerification)persistedModel);
	}

	@Override
	public BasePersistence<TourismDeskVerification> getBasePersistence() {
		return tourismDeskVerificationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return tourismDeskVerificationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the tourism desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism desk verifications
	 * @param end the upper bound of the range of tourism desk verifications (not inclusive)
	 * @return the range of tourism desk verifications
	 */
	@Override
	public List<TourismDeskVerification> getTourismDeskVerifications(
		int start, int end) {

		return tourismDeskVerificationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tourism desk verifications.
	 *
	 * @return the number of tourism desk verifications
	 */
	@Override
	public int getTourismDeskVerificationsCount() {
		return tourismDeskVerificationPersistence.countAll();
	}

	/**
	 * Updates the tourism desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismDeskVerification the tourism desk verification
	 * @return the tourism desk verification that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TourismDeskVerification updateTourismDeskVerification(
		TourismDeskVerification tourismDeskVerification) {

		return tourismDeskVerificationPersistence.update(
			tourismDeskVerification);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			TourismDeskVerificationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		tourismDeskVerificationLocalService =
			(TourismDeskVerificationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return TourismDeskVerificationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return TourismDeskVerification.class;
	}

	protected String getModelClassName() {
		return TourismDeskVerification.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				tourismDeskVerificationPersistence.getDataSource();

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
	protected TourismApplicationStagesPersistence
		tourismApplicationStagesPersistence;

	protected TourismDeskVerificationLocalService
		tourismDeskVerificationLocalService;

	@Reference
	protected TourismDeskVerificationPersistence
		tourismDeskVerificationPersistence;

	@Reference
	protected TourismPaymentConfirmationPersistence
		tourismPaymentConfirmationPersistence;

	@Reference
	protected TourismPermitPersistence tourismPermitPersistence;

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
		TourismDeskVerificationLocalServiceBaseImpl.class);

}