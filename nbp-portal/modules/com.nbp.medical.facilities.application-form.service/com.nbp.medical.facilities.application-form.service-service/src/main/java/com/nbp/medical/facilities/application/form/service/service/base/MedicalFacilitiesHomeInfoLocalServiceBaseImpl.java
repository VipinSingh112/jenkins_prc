/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.base;

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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeInfoLocalService;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalCurrentStagePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesAppliInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesComDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesHomeTwoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesMaterHomePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseDetailPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesNurseStaffPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesQNursePersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFacilitiesSignInfoPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalFaciltiesPaymentPersistence;
import com.nbp.medical.facilities.application.form.service.service.persistence.MedicalNurseStaffPremisesPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the medical facilities home info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeInfoLocalServiceImpl
 * @generated
 */
public abstract class MedicalFacilitiesHomeInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MedicalFacilitiesHomeInfoLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MedicalFacilitiesHomeInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesHomeInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the medical facilities home info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MedicalFacilitiesHomeInfo addMedicalFacilitiesHomeInfo(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		medicalFacilitiesHomeInfo.setNew(true);

		return medicalFacilitiesHomeInfoPersistence.update(
			medicalFacilitiesHomeInfo);
	}

	/**
	 * Creates a new medical facilities home info with the primary key. Does not add the medical facilities home info to the database.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key for the new medical facilities home info
	 * @return the new medical facilities home info
	 */
	@Override
	@Transactional(enabled = false)
	public MedicalFacilitiesHomeInfo createMedicalFacilitiesHomeInfo(
		long medicalFacilitiesHomeInfoId) {

		return medicalFacilitiesHomeInfoPersistence.create(
			medicalFacilitiesHomeInfoId);
	}

	/**
	 * Deletes the medical facilities home info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info that was removed
	 * @throws PortalException if a medical facilities home info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MedicalFacilitiesHomeInfo deleteMedicalFacilitiesHomeInfo(
			long medicalFacilitiesHomeInfoId)
		throws PortalException {

		return medicalFacilitiesHomeInfoPersistence.remove(
			medicalFacilitiesHomeInfoId);
	}

	/**
	 * Deletes the medical facilities home info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MedicalFacilitiesHomeInfo deleteMedicalFacilitiesHomeInfo(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return medicalFacilitiesHomeInfoPersistence.remove(
			medicalFacilitiesHomeInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return medicalFacilitiesHomeInfoPersistence.dslQuery(dslQuery);
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
			MedicalFacilitiesHomeInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return medicalFacilitiesHomeInfoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
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

		return medicalFacilitiesHomeInfoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
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

		return medicalFacilitiesHomeInfoPersistence.findWithDynamicQuery(
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
		return medicalFacilitiesHomeInfoPersistence.countWithDynamicQuery(
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

		return medicalFacilitiesHomeInfoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MedicalFacilitiesHomeInfo fetchMedicalFacilitiesHomeInfo(
		long medicalFacilitiesHomeInfoId) {

		return medicalFacilitiesHomeInfoPersistence.fetchByPrimaryKey(
			medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns the medical facilities home info matching the UUID and group.
	 *
	 * @param uuid the medical facilities home info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo
		fetchMedicalFacilitiesHomeInfoByUuidAndGroupId(
			String uuid, long groupId) {

		return medicalFacilitiesHomeInfoPersistence.fetchByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns the medical facilities home info with the primary key.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info
	 * @throws PortalException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo getMedicalFacilitiesHomeInfo(
			long medicalFacilitiesHomeInfoId)
		throws PortalException {

		return medicalFacilitiesHomeInfoPersistence.findByPrimaryKey(
			medicalFacilitiesHomeInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesHomeInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MedicalFacilitiesHomeInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesHomeInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesHomeInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			MedicalFacilitiesHomeInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesHomeInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesHomeInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MedicalFacilitiesHomeInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesHomeInfoId");
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
				<MedicalFacilitiesHomeInfo>() {

				@Override
				public void performAction(
						MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, medicalFacilitiesHomeInfo);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					MedicalFacilitiesHomeInfo.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return medicalFacilitiesHomeInfoPersistence.create(
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
				"Implement MedicalFacilitiesHomeInfoLocalServiceImpl#deleteMedicalFacilitiesHomeInfo(MedicalFacilitiesHomeInfo) to avoid orphaned data");
		}

		return medicalFacilitiesHomeInfoLocalService.
			deleteMedicalFacilitiesHomeInfo(
				(MedicalFacilitiesHomeInfo)persistedModel);
	}

	@Override
	public BasePersistence<MedicalFacilitiesHomeInfo> getBasePersistence() {
		return medicalFacilitiesHomeInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return medicalFacilitiesHomeInfoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the medical facilities home infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home infos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities home infos, or an empty list if no matches were found
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo>
		getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
			String uuid, long companyId) {

		return medicalFacilitiesHomeInfoPersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities home infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities home infos, or an empty list if no matches were found
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo>
		getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return medicalFacilitiesHomeInfoPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the medical facilities home info matching the UUID and group.
	 *
	 * @param uuid the medical facilities home info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home info
	 * @throws PortalException if a matching medical facilities home info could not be found
	 */
	@Override
	public MedicalFacilitiesHomeInfo
			getMedicalFacilitiesHomeInfoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return medicalFacilitiesHomeInfoPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of medical facilities home infos
	 */
	@Override
	public List<MedicalFacilitiesHomeInfo> getMedicalFacilitiesHomeInfos(
		int start, int end) {

		return medicalFacilitiesHomeInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of medical facilities home infos.
	 *
	 * @return the number of medical facilities home infos
	 */
	@Override
	public int getMedicalFacilitiesHomeInfosCount() {
		return medicalFacilitiesHomeInfoPersistence.countAll();
	}

	/**
	 * Updates the medical facilities home info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MedicalFacilitiesHomeInfo updateMedicalFacilitiesHomeInfo(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return medicalFacilitiesHomeInfoPersistence.update(
			medicalFacilitiesHomeInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MedicalFacilitiesHomeInfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		medicalFacilitiesHomeInfoLocalService =
			(MedicalFacilitiesHomeInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MedicalFacilitiesHomeInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MedicalFacilitiesHomeInfo.class;
	}

	protected String getModelClassName() {
		return MedicalFacilitiesHomeInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				medicalFacilitiesHomeInfoPersistence.getDataSource();

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
	protected MedicalCurrentStagePersistence medicalCurrentStagePersistence;

	@Reference
	protected MedicalFacilitiesAppPersistence medicalFacilitiesAppPersistence;

	@Reference
	protected MedicalFacilitiesAppliInfoPersistence
		medicalFacilitiesAppliInfoPersistence;

	@Reference
	protected MedicalFacilitiesComDetailPersistence
		medicalFacilitiesComDetailPersistence;

	protected MedicalFacilitiesHomeInfoLocalService
		medicalFacilitiesHomeInfoLocalService;

	@Reference
	protected MedicalFacilitiesHomeInfoPersistence
		medicalFacilitiesHomeInfoPersistence;

	@Reference
	protected MedicalFacilitiesHomeTwoPersistence
		medicalFacilitiesHomeTwoPersistence;

	@Reference
	protected MedicalFacilitiesMaterHomePersistence
		medicalFacilitiesMaterHomePersistence;

	@Reference
	protected MedicalFacilitiesNurseDetailPersistence
		medicalFacilitiesNurseDetailPersistence;

	@Reference
	protected MedicalFacilitiesNurseStaffPersistence
		medicalFacilitiesNurseStaffPersistence;

	@Reference
	protected MedicalFacilitiesQNursePersistence
		medicalFacilitiesQNursePersistence;

	@Reference
	protected MedicalFacilitiesSignInfoPersistence
		medicalFacilitiesSignInfoPersistence;

	@Reference
	protected MedicalFaciltiesPaymentPersistence
		medicalFaciltiesPaymentPersistence;

	@Reference
	protected MedicalNurseStaffPremisesPersistence
		medicalNurseStaffPremisesPersistence;

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
		MedicalFacilitiesHomeInfoLocalServiceBaseImpl.class);

}