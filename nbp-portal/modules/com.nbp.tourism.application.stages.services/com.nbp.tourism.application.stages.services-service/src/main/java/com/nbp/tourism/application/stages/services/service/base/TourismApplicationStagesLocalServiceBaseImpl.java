/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.base;

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

import com.nbp.tourism.application.stages.services.model.TourismApplicationStages;
import com.nbp.tourism.application.stages.services.service.TourismApplicationStagesLocalService;
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
 * Provides the base implementation for the tourism application stages local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.tourism.application.stages.services.service.impl.TourismApplicationStagesLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.tourism.application.stages.services.service.impl.TourismApplicationStagesLocalServiceImpl
 * @generated
 */
public abstract class TourismApplicationStagesLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   TourismApplicationStagesLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>TourismApplicationStagesLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.tourism.application.stages.services.service.TourismApplicationStagesLocalServiceUtil</code>.
	 */

	/**
	 * Adds the tourism application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TourismApplicationStages addTourismApplicationStages(
		TourismApplicationStages tourismApplicationStages) {

		tourismApplicationStages.setNew(true);

		return tourismApplicationStagesPersistence.update(
			tourismApplicationStages);
	}

	/**
	 * Creates a new tourism application stages with the primary key. Does not add the tourism application stages to the database.
	 *
	 * @param tourismApplicationStagesId the primary key for the new tourism application stages
	 * @return the new tourism application stages
	 */
	@Override
	@Transactional(enabled = false)
	public TourismApplicationStages createTourismApplicationStages(
		long tourismApplicationStagesId) {

		return tourismApplicationStagesPersistence.create(
			tourismApplicationStagesId);
	}

	/**
	 * Deletes the tourism application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages that was removed
	 * @throws PortalException if a tourism application stages with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TourismApplicationStages deleteTourismApplicationStages(
			long tourismApplicationStagesId)
		throws PortalException {

		return tourismApplicationStagesPersistence.remove(
			tourismApplicationStagesId);
	}

	/**
	 * Deletes the tourism application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TourismApplicationStages deleteTourismApplicationStages(
		TourismApplicationStages tourismApplicationStages) {

		return tourismApplicationStagesPersistence.remove(
			tourismApplicationStages);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return tourismApplicationStagesPersistence.dslQuery(dslQuery);
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
			TourismApplicationStages.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return tourismApplicationStagesPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
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

		return tourismApplicationStagesPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
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

		return tourismApplicationStagesPersistence.findWithDynamicQuery(
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
		return tourismApplicationStagesPersistence.countWithDynamicQuery(
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

		return tourismApplicationStagesPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public TourismApplicationStages fetchTourismApplicationStages(
		long tourismApplicationStagesId) {

		return tourismApplicationStagesPersistence.fetchByPrimaryKey(
			tourismApplicationStagesId);
	}

	/**
	 * Returns the tourism application stages matching the UUID and group.
	 *
	 * @param uuid the tourism application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages
		fetchTourismApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return tourismApplicationStagesPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the tourism application stages with the primary key.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages
	 * @throws PortalException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages getTourismApplicationStages(
			long tourismApplicationStagesId)
		throws PortalException {

		return tourismApplicationStagesPersistence.findByPrimaryKey(
			tourismApplicationStagesId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			tourismApplicationStagesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(TourismApplicationStages.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"tourismApplicationStagesId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			tourismApplicationStagesLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			TourismApplicationStages.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"tourismApplicationStagesId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			tourismApplicationStagesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(TourismApplicationStages.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"tourismApplicationStagesId");
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
				<TourismApplicationStages>() {

				@Override
				public void performAction(
						TourismApplicationStages tourismApplicationStages)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, tourismApplicationStages);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					TourismApplicationStages.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return tourismApplicationStagesPersistence.create(
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
				"Implement TourismApplicationStagesLocalServiceImpl#deleteTourismApplicationStages(TourismApplicationStages) to avoid orphaned data");
		}

		return tourismApplicationStagesLocalService.
			deleteTourismApplicationStages(
				(TourismApplicationStages)persistedModel);
	}

	@Override
	public BasePersistence<TourismApplicationStages> getBasePersistence() {
		return tourismApplicationStagesPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return tourismApplicationStagesPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the tourism application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the tourism application stageses
	 * @param companyId the primary key of the company
	 * @return the matching tourism application stageses, or an empty list if no matches were found
	 */
	@Override
	public List<TourismApplicationStages>
		getTourismApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return tourismApplicationStagesPersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of tourism application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the tourism application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching tourism application stageses, or an empty list if no matches were found
	 */
	@Override
	public List<TourismApplicationStages>
		getTourismApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<TourismApplicationStages> orderByComparator) {

		return tourismApplicationStagesPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the tourism application stages matching the UUID and group.
	 *
	 * @param uuid the tourism application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tourism application stages
	 * @throws PortalException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages getTourismApplicationStagesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return tourismApplicationStagesPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> getTourismApplicationStageses(
		int start, int end) {

		return tourismApplicationStagesPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tourism application stageses.
	 *
	 * @return the number of tourism application stageses
	 */
	@Override
	public int getTourismApplicationStagesesCount() {
		return tourismApplicationStagesPersistence.countAll();
	}

	/**
	 * Updates the tourism application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TourismApplicationStages updateTourismApplicationStages(
		TourismApplicationStages tourismApplicationStages) {

		return tourismApplicationStagesPersistence.update(
			tourismApplicationStages);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			TourismApplicationStagesLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		tourismApplicationStagesLocalService =
			(TourismApplicationStagesLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return TourismApplicationStagesLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return TourismApplicationStages.class;
	}

	protected String getModelClassName() {
		return TourismApplicationStages.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				tourismApplicationStagesPersistence.getDataSource();

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

	protected TourismApplicationStagesLocalService
		tourismApplicationStagesLocalService;

	@Reference
	protected TourismApplicationStagesPersistence
		tourismApplicationStagesPersistence;

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
		TourismApplicationStagesLocalServiceBaseImpl.class);

}