/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.base;

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

import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation;
import com.nbp.quarry.stage.service.service.QuarryPaymentConfirmationLocalService;
import com.nbp.quarry.stage.service.service.persistence.QuarryAppCommitteeDecisionPersistence;
import com.nbp.quarry.stage.service.service.persistence.QuarryApplicationStagePersistence;
import com.nbp.quarry.stage.service.service.persistence.QuarryInspectionPersistence;
import com.nbp.quarry.stage.service.service.persistence.QuarryPaymentConfirmationPersistence;
import com.nbp.quarry.stage.service.service.persistence.QueryLicenceCertificatePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the quarry payment confirmation local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.quarry.stage.service.service.impl.QuarryPaymentConfirmationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.quarry.stage.service.service.impl.QuarryPaymentConfirmationLocalServiceImpl
 * @generated
 */
public abstract class QuarryPaymentConfirmationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   QuarryPaymentConfirmationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>QuarryPaymentConfirmationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.quarry.stage.service.service.QuarryPaymentConfirmationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the quarry payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QuarryPaymentConfirmation addQuarryPaymentConfirmation(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		quarryPaymentConfirmation.setNew(true);

		return quarryPaymentConfirmationPersistence.update(
			quarryPaymentConfirmation);
	}

	/**
	 * Creates a new quarry payment confirmation with the primary key. Does not add the quarry payment confirmation to the database.
	 *
	 * @param quarryPaymentConfirmationId the primary key for the new quarry payment confirmation
	 * @return the new quarry payment confirmation
	 */
	@Override
	@Transactional(enabled = false)
	public QuarryPaymentConfirmation createQuarryPaymentConfirmation(
		long quarryPaymentConfirmationId) {

		return quarryPaymentConfirmationPersistence.create(
			quarryPaymentConfirmationId);
	}

	/**
	 * Deletes the quarry payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 * @throws PortalException if a quarry payment confirmation with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QuarryPaymentConfirmation deleteQuarryPaymentConfirmation(
			long quarryPaymentConfirmationId)
		throws PortalException {

		return quarryPaymentConfirmationPersistence.remove(
			quarryPaymentConfirmationId);
	}

	/**
	 * Deletes the quarry payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QuarryPaymentConfirmation deleteQuarryPaymentConfirmation(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		return quarryPaymentConfirmationPersistence.remove(
			quarryPaymentConfirmation);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return quarryPaymentConfirmationPersistence.dslQuery(dslQuery);
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
			QuarryPaymentConfirmation.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return quarryPaymentConfirmationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
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

		return quarryPaymentConfirmationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
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

		return quarryPaymentConfirmationPersistence.findWithDynamicQuery(
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
		return quarryPaymentConfirmationPersistence.countWithDynamicQuery(
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

		return quarryPaymentConfirmationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public QuarryPaymentConfirmation fetchQuarryPaymentConfirmation(
		long quarryPaymentConfirmationId) {

		return quarryPaymentConfirmationPersistence.fetchByPrimaryKey(
			quarryPaymentConfirmationId);
	}

	/**
	 * Returns the quarry payment confirmation with the primary key.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation
	 * @throws PortalException if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public QuarryPaymentConfirmation getQuarryPaymentConfirmation(
			long quarryPaymentConfirmationId)
		throws PortalException {

		return quarryPaymentConfirmationPersistence.findByPrimaryKey(
			quarryPaymentConfirmationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			quarryPaymentConfirmationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(QuarryPaymentConfirmation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"quarryPaymentConfirmationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			quarryPaymentConfirmationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			QuarryPaymentConfirmation.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"quarryPaymentConfirmationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			quarryPaymentConfirmationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(QuarryPaymentConfirmation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"quarryPaymentConfirmationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return quarryPaymentConfirmationPersistence.create(
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
				"Implement QuarryPaymentConfirmationLocalServiceImpl#deleteQuarryPaymentConfirmation(QuarryPaymentConfirmation) to avoid orphaned data");
		}

		return quarryPaymentConfirmationLocalService.
			deleteQuarryPaymentConfirmation(
				(QuarryPaymentConfirmation)persistedModel);
	}

	@Override
	public BasePersistence<QuarryPaymentConfirmation> getBasePersistence() {
		return quarryPaymentConfirmationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return quarryPaymentConfirmationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> getQuarryPaymentConfirmations(
		int start, int end) {

		return quarryPaymentConfirmationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of quarry payment confirmations.
	 *
	 * @return the number of quarry payment confirmations
	 */
	@Override
	public int getQuarryPaymentConfirmationsCount() {
		return quarryPaymentConfirmationPersistence.countAll();
	}

	/**
	 * Updates the quarry payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QuarryPaymentConfirmation updateQuarryPaymentConfirmation(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		return quarryPaymentConfirmationPersistence.update(
			quarryPaymentConfirmation);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			QuarryPaymentConfirmationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		quarryPaymentConfirmationLocalService =
			(QuarryPaymentConfirmationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return QuarryPaymentConfirmationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return QuarryPaymentConfirmation.class;
	}

	protected String getModelClassName() {
		return QuarryPaymentConfirmation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				quarryPaymentConfirmationPersistence.getDataSource();

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
	protected QuarryAppCommitteeDecisionPersistence
		quarryAppCommitteeDecisionPersistence;

	@Reference
	protected QuarryApplicationStagePersistence
		quarryApplicationStagePersistence;

	@Reference
	protected QuarryInspectionPersistence quarryInspectionPersistence;

	protected QuarryPaymentConfirmationLocalService
		quarryPaymentConfirmationLocalService;

	@Reference
	protected QuarryPaymentConfirmationPersistence
		quarryPaymentConfirmationPersistence;

	@Reference
	protected QueryLicenceCertificatePersistence
		queryLicenceCertificatePersistence;

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
		QuarryPaymentConfirmationLocalServiceBaseImpl.class);

}