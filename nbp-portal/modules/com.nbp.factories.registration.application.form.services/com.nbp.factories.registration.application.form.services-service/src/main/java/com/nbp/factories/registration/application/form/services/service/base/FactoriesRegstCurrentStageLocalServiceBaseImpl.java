/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
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
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
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

import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;
import com.nbp.factories.registration.application.form.services.service.FactoriesRegstCurrentStageLocalService;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesAppPaymentPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesApplicationRegistrationPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProcessedFoodActPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProductDetailsAddPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesRegstCurrentStagePersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesStandardActInfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the factories regst current stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.factories.registration.application.form.services.service.impl.FactoriesRegstCurrentStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.factories.registration.application.form.services.service.impl.FactoriesRegstCurrentStageLocalServiceImpl
 * @generated
 */
public abstract class FactoriesRegstCurrentStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, FactoriesRegstCurrentStageLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FactoriesRegstCurrentStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.factories.registration.application.form.services.service.FactoriesRegstCurrentStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the factories regst current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FactoriesRegstCurrentStage addFactoriesRegstCurrentStage(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		factoriesRegstCurrentStage.setNew(true);

		return factoriesRegstCurrentStagePersistence.update(
			factoriesRegstCurrentStage);
	}

	/**
	 * Creates a new factories regst current stage with the primary key. Does not add the factories regst current stage to the database.
	 *
	 * @param factoriesCurrentStageId the primary key for the new factories regst current stage
	 * @return the new factories regst current stage
	 */
	@Override
	@Transactional(enabled = false)
	public FactoriesRegstCurrentStage createFactoriesRegstCurrentStage(
		long factoriesCurrentStageId) {

		return factoriesRegstCurrentStagePersistence.create(
			factoriesCurrentStageId);
	}

	/**
	 * Deletes the factories regst current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage that was removed
	 * @throws PortalException if a factories regst current stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FactoriesRegstCurrentStage deleteFactoriesRegstCurrentStage(
			long factoriesCurrentStageId)
		throws PortalException {

		return factoriesRegstCurrentStagePersistence.remove(
			factoriesCurrentStageId);
	}

	/**
	 * Deletes the factories regst current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FactoriesRegstCurrentStage deleteFactoriesRegstCurrentStage(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return factoriesRegstCurrentStagePersistence.remove(
			factoriesRegstCurrentStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return factoriesRegstCurrentStagePersistence.dslQuery(dslQuery);
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
			FactoriesRegstCurrentStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return factoriesRegstCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
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

		return factoriesRegstCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
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

		return factoriesRegstCurrentStagePersistence.findWithDynamicQuery(
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
		return factoriesRegstCurrentStagePersistence.countWithDynamicQuery(
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

		return factoriesRegstCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public FactoriesRegstCurrentStage fetchFactoriesRegstCurrentStage(
		long factoriesCurrentStageId) {

		return factoriesRegstCurrentStagePersistence.fetchByPrimaryKey(
			factoriesCurrentStageId);
	}

	/**
	 * Returns the factories regst current stage matching the UUID and group.
	 *
	 * @param uuid the factories regst current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage
		fetchFactoriesRegstCurrentStageByUuidAndGroupId(
			String uuid, long groupId) {

		return factoriesRegstCurrentStagePersistence.fetchByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns the factories regst current stage with the primary key.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage
	 * @throws PortalException if a factories regst current stage with the primary key could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage getFactoriesRegstCurrentStage(
			long factoriesCurrentStageId)
		throws PortalException {

		return factoriesRegstCurrentStagePersistence.findByPrimaryKey(
			factoriesCurrentStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			factoriesRegstCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FactoriesRegstCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"factoriesCurrentStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			factoriesRegstCurrentStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			FactoriesRegstCurrentStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"factoriesCurrentStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			factoriesRegstCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FactoriesRegstCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"factoriesCurrentStageId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<FactoriesRegstCurrentStage>() {

				@Override
				public void performAction(
						FactoriesRegstCurrentStage factoriesRegstCurrentStage)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, factoriesRegstCurrentStage);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					FactoriesRegstCurrentStage.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return factoriesRegstCurrentStagePersistence.create(
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
				"Implement FactoriesRegstCurrentStageLocalServiceImpl#deleteFactoriesRegstCurrentStage(FactoriesRegstCurrentStage) to avoid orphaned data");
		}

		return factoriesRegstCurrentStageLocalService.
			deleteFactoriesRegstCurrentStage(
				(FactoriesRegstCurrentStage)persistedModel);
	}

	@Override
	public BasePersistence<FactoriesRegstCurrentStage> getBasePersistence() {
		return factoriesRegstCurrentStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return factoriesRegstCurrentStagePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the factories regst current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories regst current stages
	 * @param companyId the primary key of the company
	 * @return the matching factories regst current stages, or an empty list if no matches were found
	 */
	@Override
	public List<FactoriesRegstCurrentStage>
		getFactoriesRegstCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return factoriesRegstCurrentStagePersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of factories regst current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories regst current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching factories regst current stages, or an empty list if no matches were found
	 */
	@Override
	public List<FactoriesRegstCurrentStage>
		getFactoriesRegstCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return factoriesRegstCurrentStagePersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the factories regst current stage matching the UUID and group.
	 *
	 * @param uuid the factories regst current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories regst current stage
	 * @throws PortalException if a matching factories regst current stage could not be found
	 */
	@Override
	public FactoriesRegstCurrentStage
			getFactoriesRegstCurrentStageByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return factoriesRegstCurrentStagePersistence.findByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of factories regst current stages
	 */
	@Override
	public List<FactoriesRegstCurrentStage> getFactoriesRegstCurrentStages(
		int start, int end) {

		return factoriesRegstCurrentStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of factories regst current stages.
	 *
	 * @return the number of factories regst current stages
	 */
	@Override
	public int getFactoriesRegstCurrentStagesCount() {
		return factoriesRegstCurrentStagePersistence.countAll();
	}

	/**
	 * Updates the factories regst current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesRegstCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 * @return the factories regst current stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FactoriesRegstCurrentStage updateFactoriesRegstCurrentStage(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return factoriesRegstCurrentStagePersistence.update(
			factoriesRegstCurrentStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FactoriesRegstCurrentStageLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		factoriesRegstCurrentStageLocalService =
			(FactoriesRegstCurrentStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FactoriesRegstCurrentStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FactoriesRegstCurrentStage.class;
	}

	protected String getModelClassName() {
		return FactoriesRegstCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				factoriesRegstCurrentStagePersistence.getDataSource();

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
	protected FactoriesApplicationRegistrationPersistence
		factoriesApplicationRegistrationPersistence;

	@Reference
	protected FactoriesAppPaymentPersistence factoriesAppPaymentPersistence;

	@Reference
	protected FactoriesProcessedFoodActPersistence
		factoriesProcessedFoodActPersistence;

	@Reference
	protected FactoriesProductDetailsAddPersistence
		factoriesProductDetailsAddPersistence;

	protected FactoriesRegstCurrentStageLocalService
		factoriesRegstCurrentStageLocalService;

	@Reference
	protected FactoriesRegstCurrentStagePersistence
		factoriesRegstCurrentStagePersistence;

	@Reference
	protected FactoriesStandardActInfoPersistence
		factoriesStandardActInfoPersistence;

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
		FactoriesRegstCurrentStageLocalServiceBaseImpl.class);

}