/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.base;

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

import com.nbp.acquire.stages.service.model.AcquireAdvertising;
import com.nbp.acquire.stages.service.service.AcquireAdvertisingLocalService;
import com.nbp.acquire.stages.service.service.persistence.AcquireAdvertisingPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireApplicationStagesPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDeskVerificationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDraftAgreementPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDueDiligencePersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireEvaluationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireExecutionPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireFinalExecutedAgreementPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquirePaymentConfirmationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireTenderingPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireValuationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the acquire advertising local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.acquire.stages.service.service.impl.AcquireAdvertisingLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.acquire.stages.service.service.impl.AcquireAdvertisingLocalServiceImpl
 * @generated
 */
public abstract class AcquireAdvertisingLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AcquireAdvertisingLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AcquireAdvertisingLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.acquire.stages.service.service.AcquireAdvertisingLocalServiceUtil</code>.
	 */

	/**
	 * Adds the acquire advertising to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AcquireAdvertising addAcquireAdvertising(
		AcquireAdvertising acquireAdvertising) {

		acquireAdvertising.setNew(true);

		return acquireAdvertisingPersistence.update(acquireAdvertising);
	}

	/**
	 * Creates a new acquire advertising with the primary key. Does not add the acquire advertising to the database.
	 *
	 * @param acquireAdvertisingId the primary key for the new acquire advertising
	 * @return the new acquire advertising
	 */
	@Override
	@Transactional(enabled = false)
	public AcquireAdvertising createAcquireAdvertising(
		long acquireAdvertisingId) {

		return acquireAdvertisingPersistence.create(acquireAdvertisingId);
	}

	/**
	 * Deletes the acquire advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising that was removed
	 * @throws PortalException if a acquire advertising with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AcquireAdvertising deleteAcquireAdvertising(
			long acquireAdvertisingId)
		throws PortalException {

		return acquireAdvertisingPersistence.remove(acquireAdvertisingId);
	}

	/**
	 * Deletes the acquire advertising from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AcquireAdvertising deleteAcquireAdvertising(
		AcquireAdvertising acquireAdvertising) {

		return acquireAdvertisingPersistence.remove(acquireAdvertising);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return acquireAdvertisingPersistence.dslQuery(dslQuery);
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
			AcquireAdvertising.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return acquireAdvertisingPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
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

		return acquireAdvertisingPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
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

		return acquireAdvertisingPersistence.findWithDynamicQuery(
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
		return acquireAdvertisingPersistence.countWithDynamicQuery(
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

		return acquireAdvertisingPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AcquireAdvertising fetchAcquireAdvertising(
		long acquireAdvertisingId) {

		return acquireAdvertisingPersistence.fetchByPrimaryKey(
			acquireAdvertisingId);
	}

	/**
	 * Returns the acquire advertising with the primary key.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising
	 * @throws PortalException if a acquire advertising with the primary key could not be found
	 */
	@Override
	public AcquireAdvertising getAcquireAdvertising(long acquireAdvertisingId)
		throws PortalException {

		return acquireAdvertisingPersistence.findByPrimaryKey(
			acquireAdvertisingId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			acquireAdvertisingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AcquireAdvertising.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"acquireAdvertisingId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			acquireAdvertisingLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(AcquireAdvertising.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"acquireAdvertisingId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			acquireAdvertisingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AcquireAdvertising.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"acquireAdvertisingId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return acquireAdvertisingPersistence.create(
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
				"Implement AcquireAdvertisingLocalServiceImpl#deleteAcquireAdvertising(AcquireAdvertising) to avoid orphaned data");
		}

		return acquireAdvertisingLocalService.deleteAcquireAdvertising(
			(AcquireAdvertising)persistedModel);
	}

	@Override
	public BasePersistence<AcquireAdvertising> getBasePersistence() {
		return acquireAdvertisingPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return acquireAdvertisingPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @return the range of acquire advertisings
	 */
	@Override
	public List<AcquireAdvertising> getAcquireAdvertisings(int start, int end) {
		return acquireAdvertisingPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of acquire advertisings.
	 *
	 * @return the number of acquire advertisings
	 */
	@Override
	public int getAcquireAdvertisingsCount() {
		return acquireAdvertisingPersistence.countAll();
	}

	/**
	 * Updates the acquire advertising in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AcquireAdvertising updateAcquireAdvertising(
		AcquireAdvertising acquireAdvertising) {

		return acquireAdvertisingPersistence.update(acquireAdvertising);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AcquireAdvertisingLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		acquireAdvertisingLocalService =
			(AcquireAdvertisingLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AcquireAdvertisingLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AcquireAdvertising.class;
	}

	protected String getModelClassName() {
		return AcquireAdvertising.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				acquireAdvertisingPersistence.getDataSource();

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

	protected AcquireAdvertisingLocalService acquireAdvertisingLocalService;

	@Reference
	protected AcquireAdvertisingPersistence acquireAdvertisingPersistence;

	@Reference
	protected AcquireApplicationStagesPersistence
		acquireApplicationStagesPersistence;

	@Reference
	protected AcquireDeskVerificationPersistence
		acquireDeskVerificationPersistence;

	@Reference
	protected AcquireDraftAgreementPersistence acquireDraftAgreementPersistence;

	@Reference
	protected AcquireDueDiligencePersistence acquireDueDiligencePersistence;

	@Reference
	protected AcquireEvaluationPersistence acquireEvaluationPersistence;

	@Reference
	protected AcquireExecutionPersistence acquireExecutionPersistence;

	@Reference
	protected AcquireFinalExecutedAgreementPersistence
		acquireFinalExecutedAgreementPersistence;

	@Reference
	protected AcquirePaymentConfirmationPersistence
		acquirePaymentConfirmationPersistence;

	@Reference
	protected AcquireTenderingPersistence acquireTenderingPersistence;

	@Reference
	protected AcquireValuationPersistence acquireValuationPersistence;

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
		AcquireAdvertisingLocalServiceBaseImpl.class);

}