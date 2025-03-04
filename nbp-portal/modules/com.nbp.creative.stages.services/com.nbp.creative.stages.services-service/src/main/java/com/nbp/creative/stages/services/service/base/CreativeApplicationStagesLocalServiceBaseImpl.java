/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.base;

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

import com.nbp.creative.stages.services.model.CreativeApplicationStages;
import com.nbp.creative.stages.services.service.CreativeApplicationStagesLocalService;
import com.nbp.creative.stages.services.service.persistence.CreativeApplicationStagesPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativeDeskVerificationPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativeInspectionPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativePermitPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the creative application stages local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.creative.stages.services.service.impl.CreativeApplicationStagesLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.creative.stages.services.service.impl.CreativeApplicationStagesLocalServiceImpl
 * @generated
 */
public abstract class CreativeApplicationStagesLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, CreativeApplicationStagesLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CreativeApplicationStagesLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.creative.stages.services.service.CreativeApplicationStagesLocalServiceUtil</code>.
	 */

	/**
	 * Adds the creative application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CreativeApplicationStages addCreativeApplicationStages(
		CreativeApplicationStages creativeApplicationStages) {

		creativeApplicationStages.setNew(true);

		return creativeApplicationStagesPersistence.update(
			creativeApplicationStages);
	}

	/**
	 * Creates a new creative application stages with the primary key. Does not add the creative application stages to the database.
	 *
	 * @param creativeApplicationStagesId the primary key for the new creative application stages
	 * @return the new creative application stages
	 */
	@Override
	@Transactional(enabled = false)
	public CreativeApplicationStages createCreativeApplicationStages(
		long creativeApplicationStagesId) {

		return creativeApplicationStagesPersistence.create(
			creativeApplicationStagesId);
	}

	/**
	 * Deletes the creative application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages that was removed
	 * @throws PortalException if a creative application stages with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CreativeApplicationStages deleteCreativeApplicationStages(
			long creativeApplicationStagesId)
		throws PortalException {

		return creativeApplicationStagesPersistence.remove(
			creativeApplicationStagesId);
	}

	/**
	 * Deletes the creative application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CreativeApplicationStages deleteCreativeApplicationStages(
		CreativeApplicationStages creativeApplicationStages) {

		return creativeApplicationStagesPersistence.remove(
			creativeApplicationStages);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return creativeApplicationStagesPersistence.dslQuery(dslQuery);
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
			CreativeApplicationStages.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return creativeApplicationStagesPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
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

		return creativeApplicationStagesPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
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

		return creativeApplicationStagesPersistence.findWithDynamicQuery(
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
		return creativeApplicationStagesPersistence.countWithDynamicQuery(
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

		return creativeApplicationStagesPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public CreativeApplicationStages fetchCreativeApplicationStages(
		long creativeApplicationStagesId) {

		return creativeApplicationStagesPersistence.fetchByPrimaryKey(
			creativeApplicationStagesId);
	}

	/**
	 * Returns the creative application stages matching the UUID and group.
	 *
	 * @param uuid the creative application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages
		fetchCreativeApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return creativeApplicationStagesPersistence.fetchByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns the creative application stages with the primary key.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages
	 * @throws PortalException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages getCreativeApplicationStages(
			long creativeApplicationStagesId)
		throws PortalException {

		return creativeApplicationStagesPersistence.findByPrimaryKey(
			creativeApplicationStagesId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			creativeApplicationStagesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(CreativeApplicationStages.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeApplicationStagesId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			creativeApplicationStagesLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			CreativeApplicationStages.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeApplicationStagesId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			creativeApplicationStagesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(CreativeApplicationStages.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"creativeApplicationStagesId");
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
				<CreativeApplicationStages>() {

				@Override
				public void performAction(
						CreativeApplicationStages creativeApplicationStages)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, creativeApplicationStages);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					CreativeApplicationStages.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return creativeApplicationStagesPersistence.create(
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
				"Implement CreativeApplicationStagesLocalServiceImpl#deleteCreativeApplicationStages(CreativeApplicationStages) to avoid orphaned data");
		}

		return creativeApplicationStagesLocalService.
			deleteCreativeApplicationStages(
				(CreativeApplicationStages)persistedModel);
	}

	@Override
	public BasePersistence<CreativeApplicationStages> getBasePersistence() {
		return creativeApplicationStagesPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return creativeApplicationStagesPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the creative application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative application stageses
	 * @param companyId the primary key of the company
	 * @return the matching creative application stageses, or an empty list if no matches were found
	 */
	@Override
	public List<CreativeApplicationStages>
		getCreativeApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return creativeApplicationStagesPersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of creative application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching creative application stageses, or an empty list if no matches were found
	 */
	@Override
	public List<CreativeApplicationStages>
		getCreativeApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return creativeApplicationStagesPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the creative application stages matching the UUID and group.
	 *
	 * @param uuid the creative application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application stages
	 * @throws PortalException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages
			getCreativeApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return creativeApplicationStagesPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> getCreativeApplicationStageses(
		int start, int end) {

		return creativeApplicationStagesPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of creative application stageses.
	 *
	 * @return the number of creative application stageses
	 */
	@Override
	public int getCreativeApplicationStagesesCount() {
		return creativeApplicationStagesPersistence.countAll();
	}

	/**
	 * Updates the creative application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CreativeApplicationStages updateCreativeApplicationStages(
		CreativeApplicationStages creativeApplicationStages) {

		return creativeApplicationStagesPersistence.update(
			creativeApplicationStages);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CreativeApplicationStagesLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		creativeApplicationStagesLocalService =
			(CreativeApplicationStagesLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CreativeApplicationStagesLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CreativeApplicationStages.class;
	}

	protected String getModelClassName() {
		return CreativeApplicationStages.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				creativeApplicationStagesPersistence.getDataSource();

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

	protected CreativeApplicationStagesLocalService
		creativeApplicationStagesLocalService;

	@Reference
	protected CreativeApplicationStagesPersistence
		creativeApplicationStagesPersistence;

	@Reference
	protected CreativeDeskVerificationPersistence
		creativeDeskVerificationPersistence;

	@Reference
	protected CreativeInspectionPersistence creativeInspectionPersistence;

	@Reference
	protected CreativePermitPersistence creativePermitPersistence;

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
		CreativeApplicationStagesLocalServiceBaseImpl.class);

}