/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.base;

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

import com.nbp.quarry.stage.service.model.QuarryApplicationStage;
import com.nbp.quarry.stage.service.service.QuarryApplicationStageLocalService;
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
 * Provides the base implementation for the quarry application stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.quarry.stage.service.service.impl.QuarryApplicationStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.quarry.stage.service.service.impl.QuarryApplicationStageLocalServiceImpl
 * @generated
 */
public abstract class QuarryApplicationStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   QuarryApplicationStageLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>QuarryApplicationStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.quarry.stage.service.service.QuarryApplicationStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the quarry application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QuarryApplicationStage addQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage) {

		quarryApplicationStage.setNew(true);

		return quarryApplicationStagePersistence.update(quarryApplicationStage);
	}

	/**
	 * Creates a new quarry application stage with the primary key. Does not add the quarry application stage to the database.
	 *
	 * @param quarryAppStagesId the primary key for the new quarry application stage
	 * @return the new quarry application stage
	 */
	@Override
	@Transactional(enabled = false)
	public QuarryApplicationStage createQuarryApplicationStage(
		long quarryAppStagesId) {

		return quarryApplicationStagePersistence.create(quarryAppStagesId);
	}

	/**
	 * Deletes the quarry application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage that was removed
	 * @throws PortalException if a quarry application stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QuarryApplicationStage deleteQuarryApplicationStage(
			long quarryAppStagesId)
		throws PortalException {

		return quarryApplicationStagePersistence.remove(quarryAppStagesId);
	}

	/**
	 * Deletes the quarry application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public QuarryApplicationStage deleteQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage) {

		return quarryApplicationStagePersistence.remove(quarryApplicationStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return quarryApplicationStagePersistence.dslQuery(dslQuery);
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
			QuarryApplicationStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return quarryApplicationStagePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
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

		return quarryApplicationStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
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

		return quarryApplicationStagePersistence.findWithDynamicQuery(
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
		return quarryApplicationStagePersistence.countWithDynamicQuery(
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

		return quarryApplicationStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public QuarryApplicationStage fetchQuarryApplicationStage(
		long quarryAppStagesId) {

		return quarryApplicationStagePersistence.fetchByPrimaryKey(
			quarryAppStagesId);
	}

	/**
	 * Returns the quarry application stage matching the UUID and group.
	 *
	 * @param uuid the quarry application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage fetchQuarryApplicationStageByUuidAndGroupId(
		String uuid, long groupId) {

		return quarryApplicationStagePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quarry application stage with the primary key.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage
	 * @throws PortalException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public QuarryApplicationStage getQuarryApplicationStage(
			long quarryAppStagesId)
		throws PortalException {

		return quarryApplicationStagePersistence.findByPrimaryKey(
			quarryAppStagesId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			quarryApplicationStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(QuarryApplicationStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("quarryAppStagesId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			quarryApplicationStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			QuarryApplicationStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"quarryAppStagesId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			quarryApplicationStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(QuarryApplicationStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("quarryAppStagesId");
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
				<QuarryApplicationStage>() {

				@Override
				public void performAction(
						QuarryApplicationStage quarryApplicationStage)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, quarryApplicationStage);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					QuarryApplicationStage.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return quarryApplicationStagePersistence.create(
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
				"Implement QuarryApplicationStageLocalServiceImpl#deleteQuarryApplicationStage(QuarryApplicationStage) to avoid orphaned data");
		}

		return quarryApplicationStageLocalService.deleteQuarryApplicationStage(
			(QuarryApplicationStage)persistedModel);
	}

	@Override
	public BasePersistence<QuarryApplicationStage> getBasePersistence() {
		return quarryApplicationStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return quarryApplicationStagePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the quarry application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application stages
	 * @param companyId the primary key of the company
	 * @return the matching quarry application stages, or an empty list if no matches were found
	 */
	@Override
	public List<QuarryApplicationStage>
		getQuarryApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return quarryApplicationStagePersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of quarry application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching quarry application stages, or an empty list if no matches were found
	 */
	@Override
	public List<QuarryApplicationStage>
		getQuarryApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return quarryApplicationStagePersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the quarry application stage matching the UUID and group.
	 *
	 * @param uuid the quarry application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application stage
	 * @throws PortalException if a matching quarry application stage could not be found
	 */
	@Override
	public QuarryApplicationStage getQuarryApplicationStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return quarryApplicationStagePersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of quarry application stages
	 */
	@Override
	public List<QuarryApplicationStage> getQuarryApplicationStages(
		int start, int end) {

		return quarryApplicationStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of quarry application stages.
	 *
	 * @return the number of quarry application stages
	 */
	@Override
	public int getQuarryApplicationStagesCount() {
		return quarryApplicationStagePersistence.countAll();
	}

	/**
	 * Updates the quarry application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public QuarryApplicationStage updateQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage) {

		return quarryApplicationStagePersistence.update(quarryApplicationStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			QuarryApplicationStageLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		quarryApplicationStageLocalService =
			(QuarryApplicationStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return QuarryApplicationStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return QuarryApplicationStage.class;
	}

	protected String getModelClassName() {
		return QuarryApplicationStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				quarryApplicationStagePersistence.getDataSource();

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

	protected QuarryApplicationStageLocalService
		quarryApplicationStageLocalService;

	@Reference
	protected QuarryApplicationStagePersistence
		quarryApplicationStagePersistence;

	@Reference
	protected QuarryInspectionPersistence quarryInspectionPersistence;

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
		QuarryApplicationStageLocalServiceBaseImpl.class);

}