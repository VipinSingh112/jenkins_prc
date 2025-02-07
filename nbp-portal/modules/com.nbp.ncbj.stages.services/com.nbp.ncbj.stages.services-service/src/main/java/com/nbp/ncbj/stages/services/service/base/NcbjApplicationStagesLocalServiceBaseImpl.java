/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.base;

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

import com.nbp.ncbj.stages.services.model.NcbjApplicationStages;
import com.nbp.ncbj.stages.services.service.NcbjApplicationStagesLocalService;
import com.nbp.ncbj.stages.services.service.persistence.NcbjAppBoardDecisionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjApplicationCorrectiveActionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjApplicationStagesPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjInspectionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjLicenceCertificatePersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjPaymentConfirmationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ncbj application stages local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ncbj.stages.services.service.impl.NcbjApplicationStagesLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ncbj.stages.services.service.impl.NcbjApplicationStagesLocalServiceImpl
 * @generated
 */
public abstract class NcbjApplicationStagesLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   NcbjApplicationStagesLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NcbjApplicationStagesLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ncbj.stages.services.service.NcbjApplicationStagesLocalServiceUtil</code>.
	 */

	/**
	 * Adds the ncbj application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjApplicationStages addNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages) {

		ncbjApplicationStages.setNew(true);

		return ncbjApplicationStagesPersistence.update(ncbjApplicationStages);
	}

	/**
	 * Creates a new ncbj application stages with the primary key. Does not add the ncbj application stages to the database.
	 *
	 * @param ncbjStagesApplicationId the primary key for the new ncbj application stages
	 * @return the new ncbj application stages
	 */
	@Override
	@Transactional(enabled = false)
	public NcbjApplicationStages createNcbjApplicationStages(
		long ncbjStagesApplicationId) {

		return ncbjApplicationStagesPersistence.create(ncbjStagesApplicationId);
	}

	/**
	 * Deletes the ncbj application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages that was removed
	 * @throws PortalException if a ncbj application stages with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjApplicationStages deleteNcbjApplicationStages(
			long ncbjStagesApplicationId)
		throws PortalException {

		return ncbjApplicationStagesPersistence.remove(ncbjStagesApplicationId);
	}

	/**
	 * Deletes the ncbj application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjApplicationStages deleteNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages) {

		return ncbjApplicationStagesPersistence.remove(ncbjApplicationStages);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return ncbjApplicationStagesPersistence.dslQuery(dslQuery);
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
			NcbjApplicationStages.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ncbjApplicationStagesPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
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

		return ncbjApplicationStagesPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
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

		return ncbjApplicationStagesPersistence.findWithDynamicQuery(
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
		return ncbjApplicationStagesPersistence.countWithDynamicQuery(
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

		return ncbjApplicationStagesPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public NcbjApplicationStages fetchNcbjApplicationStages(
		long ncbjStagesApplicationId) {

		return ncbjApplicationStagesPersistence.fetchByPrimaryKey(
			ncbjStagesApplicationId);
	}

	/**
	 * Returns the ncbj application stages matching the UUID and group.
	 *
	 * @param uuid the ncbj application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchNcbjApplicationStagesByUuidAndGroupId(
		String uuid, long groupId) {

		return ncbjApplicationStagesPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncbj application stages with the primary key.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages
	 * @throws PortalException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages getNcbjApplicationStages(
			long ncbjStagesApplicationId)
		throws PortalException {

		return ncbjApplicationStagesPersistence.findByPrimaryKey(
			ncbjStagesApplicationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			ncbjApplicationStagesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjApplicationStages.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjStagesApplicationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			ncbjApplicationStagesLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			NcbjApplicationStages.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjStagesApplicationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			ncbjApplicationStagesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjApplicationStages.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjStagesApplicationId");
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
				<NcbjApplicationStages>() {

				@Override
				public void performAction(
						NcbjApplicationStages ncbjApplicationStages)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, ncbjApplicationStages);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					NcbjApplicationStages.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjApplicationStagesPersistence.create(
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
				"Implement NcbjApplicationStagesLocalServiceImpl#deleteNcbjApplicationStages(NcbjApplicationStages) to avoid orphaned data");
		}

		return ncbjApplicationStagesLocalService.deleteNcbjApplicationStages(
			(NcbjApplicationStages)persistedModel);
	}

	@Override
	public BasePersistence<NcbjApplicationStages> getBasePersistence() {
		return ncbjApplicationStagesPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjApplicationStagesPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the ncbj application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj application stageses
	 * @param companyId the primary key of the company
	 * @return the matching ncbj application stageses, or an empty list if no matches were found
	 */
	@Override
	public List<NcbjApplicationStages>
		getNcbjApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return ncbjApplicationStagesPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of ncbj application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncbj application stageses, or an empty list if no matches were found
	 */
	@Override
	public List<NcbjApplicationStages>
		getNcbjApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return ncbjApplicationStagesPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the ncbj application stages matching the UUID and group.
	 *
	 * @param uuid the ncbj application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application stages
	 * @throws PortalException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages getNcbjApplicationStagesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return ncbjApplicationStagesPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> getNcbjApplicationStageses(
		int start, int end) {

		return ncbjApplicationStagesPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ncbj application stageses.
	 *
	 * @return the number of ncbj application stageses
	 */
	@Override
	public int getNcbjApplicationStagesesCount() {
		return ncbjApplicationStagesPersistence.countAll();
	}

	/**
	 * Updates the ncbj application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjApplicationStages updateNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages) {

		return ncbjApplicationStagesPersistence.update(ncbjApplicationStages);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NcbjApplicationStagesLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ncbjApplicationStagesLocalService =
			(NcbjApplicationStagesLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NcbjApplicationStagesLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NcbjApplicationStages.class;
	}

	protected String getModelClassName() {
		return NcbjApplicationStages.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				ncbjApplicationStagesPersistence.getDataSource();

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
	protected NcbjAppBoardDecisionPersistence ncbjAppBoardDecisionPersistence;

	@Reference
	protected NcbjApplicationCorrectiveActionPersistence
		ncbjApplicationCorrectiveActionPersistence;

	protected NcbjApplicationStagesLocalService
		ncbjApplicationStagesLocalService;

	@Reference
	protected NcbjApplicationStagesPersistence ncbjApplicationStagesPersistence;

	@Reference
	protected NcbjInspectionPersistence ncbjInspectionPersistence;

	@Reference
	protected NcbjLicenceCertificatePersistence
		ncbjLicenceCertificatePersistence;

	@Reference
	protected NcbjPaymentConfirmationPersistence
		ncbjPaymentConfirmationPersistence;

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
		NcbjApplicationStagesLocalServiceBaseImpl.class);

}