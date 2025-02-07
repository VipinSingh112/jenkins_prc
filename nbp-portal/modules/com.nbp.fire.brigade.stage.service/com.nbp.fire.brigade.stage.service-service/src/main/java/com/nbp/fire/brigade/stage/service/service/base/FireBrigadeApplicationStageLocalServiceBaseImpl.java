/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.base;

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

import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage;
import com.nbp.fire.brigade.stage.service.service.FireBrigadeApplicationStageLocalService;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeApplicationStagePersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeCertificatePersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeInspectionPersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadePaymentConfirmationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the fire brigade application stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeApplicationStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeApplicationStageLocalServiceImpl
 * @generated
 */
public abstract class FireBrigadeApplicationStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, FireBrigadeApplicationStageLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FireBrigadeApplicationStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.fire.brigade.stage.service.service.FireBrigadeApplicationStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the fire brigade application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FireBrigadeApplicationStage addFireBrigadeApplicationStage(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		fireBrigadeApplicationStage.setNew(true);

		return fireBrigadeApplicationStagePersistence.update(
			fireBrigadeApplicationStage);
	}

	/**
	 * Creates a new fire brigade application stage with the primary key. Does not add the fire brigade application stage to the database.
	 *
	 * @param fireBrigadeAppStageId the primary key for the new fire brigade application stage
	 * @return the new fire brigade application stage
	 */
	@Override
	@Transactional(enabled = false)
	public FireBrigadeApplicationStage createFireBrigadeApplicationStage(
		long fireBrigadeAppStageId) {

		return fireBrigadeApplicationStagePersistence.create(
			fireBrigadeAppStageId);
	}

	/**
	 * Deletes the fire brigade application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 * @throws PortalException if a fire brigade application stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FireBrigadeApplicationStage deleteFireBrigadeApplicationStage(
			long fireBrigadeAppStageId)
		throws PortalException {

		return fireBrigadeApplicationStagePersistence.remove(
			fireBrigadeAppStageId);
	}

	/**
	 * Deletes the fire brigade application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FireBrigadeApplicationStage deleteFireBrigadeApplicationStage(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		return fireBrigadeApplicationStagePersistence.remove(
			fireBrigadeApplicationStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return fireBrigadeApplicationStagePersistence.dslQuery(dslQuery);
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
			FireBrigadeApplicationStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return fireBrigadeApplicationStagePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
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

		return fireBrigadeApplicationStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
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

		return fireBrigadeApplicationStagePersistence.findWithDynamicQuery(
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
		return fireBrigadeApplicationStagePersistence.countWithDynamicQuery(
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

		return fireBrigadeApplicationStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public FireBrigadeApplicationStage fetchFireBrigadeApplicationStage(
		long fireBrigadeAppStageId) {

		return fireBrigadeApplicationStagePersistence.fetchByPrimaryKey(
			fireBrigadeAppStageId);
	}

	/**
	 * Returns the fire brigade application stage matching the UUID and group.
	 *
	 * @param uuid the fire brigade application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage
		fetchFireBrigadeApplicationStageByUuidAndGroupId(
			String uuid, long groupId) {

		return fireBrigadeApplicationStagePersistence.fetchByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns the fire brigade application stage with the primary key.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage
	 * @throws PortalException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage getFireBrigadeApplicationStage(
			long fireBrigadeAppStageId)
		throws PortalException {

		return fireBrigadeApplicationStagePersistence.findByPrimaryKey(
			fireBrigadeAppStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			fireBrigadeApplicationStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FireBrigadeApplicationStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeAppStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			fireBrigadeApplicationStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			FireBrigadeApplicationStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeAppStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			fireBrigadeApplicationStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FireBrigadeApplicationStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeAppStageId");
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
				<FireBrigadeApplicationStage>() {

				@Override
				public void performAction(
						FireBrigadeApplicationStage fireBrigadeApplicationStage)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, fireBrigadeApplicationStage);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					FireBrigadeApplicationStage.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return fireBrigadeApplicationStagePersistence.create(
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
				"Implement FireBrigadeApplicationStageLocalServiceImpl#deleteFireBrigadeApplicationStage(FireBrigadeApplicationStage) to avoid orphaned data");
		}

		return fireBrigadeApplicationStageLocalService.
			deleteFireBrigadeApplicationStage(
				(FireBrigadeApplicationStage)persistedModel);
	}

	@Override
	public BasePersistence<FireBrigadeApplicationStage> getBasePersistence() {
		return fireBrigadeApplicationStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return fireBrigadeApplicationStagePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the fire brigade application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade application stages
	 * @param companyId the primary key of the company
	 * @return the matching fire brigade application stages, or an empty list if no matches were found
	 */
	@Override
	public List<FireBrigadeApplicationStage>
		getFireBrigadeApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return fireBrigadeApplicationStagePersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of fire brigade application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching fire brigade application stages, or an empty list if no matches were found
	 */
	@Override
	public List<FireBrigadeApplicationStage>
		getFireBrigadeApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return fireBrigadeApplicationStagePersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the fire brigade application stage matching the UUID and group.
	 *
	 * @param uuid the fire brigade application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application stage
	 * @throws PortalException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage
			getFireBrigadeApplicationStageByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return fireBrigadeApplicationStagePersistence.findByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> getFireBrigadeApplicationStages(
		int start, int end) {

		return fireBrigadeApplicationStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of fire brigade application stages.
	 *
	 * @return the number of fire brigade application stages
	 */
	@Override
	public int getFireBrigadeApplicationStagesCount() {
		return fireBrigadeApplicationStagePersistence.countAll();
	}

	/**
	 * Updates the fire brigade application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FireBrigadeApplicationStage updateFireBrigadeApplicationStage(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		return fireBrigadeApplicationStagePersistence.update(
			fireBrigadeApplicationStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FireBrigadeApplicationStageLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		fireBrigadeApplicationStageLocalService =
			(FireBrigadeApplicationStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FireBrigadeApplicationStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FireBrigadeApplicationStage.class;
	}

	protected String getModelClassName() {
		return FireBrigadeApplicationStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				fireBrigadeApplicationStagePersistence.getDataSource();

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

	protected FireBrigadeApplicationStageLocalService
		fireBrigadeApplicationStageLocalService;

	@Reference
	protected FireBrigadeApplicationStagePersistence
		fireBrigadeApplicationStagePersistence;

	@Reference
	protected FireBrigadeCertificatePersistence
		fireBrigadeCertificatePersistence;

	@Reference
	protected FireBrigadeInspectionPersistence fireBrigadeInspectionPersistence;

	@Reference
	protected FireBrigadePaymentConfirmationPersistence
		fireBrigadePaymentConfirmationPersistence;

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
		FireBrigadeApplicationStageLocalServiceBaseImpl.class);

}