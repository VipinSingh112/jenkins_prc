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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff;
import com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesNurseStaffLocalService;
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
 * Provides the base implementation for the medical facilities nurse staff local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesNurseStaffLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesNurseStaffLocalServiceImpl
 * @generated
 */
public abstract class MedicalFacilitiesNurseStaffLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MedicalFacilitiesNurseStaffLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MedicalFacilitiesNurseStaffLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.medical.facilities.application.form.service.service.MedicalFacilitiesNurseStaffLocalServiceUtil</code>.
	 */

	/**
	 * Adds the medical facilities nurse staff to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MedicalFacilitiesNurseStaff addMedicalFacilitiesNurseStaff(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		medicalFacilitiesNurseStaff.setNew(true);

		return medicalFacilitiesNurseStaffPersistence.update(
			medicalFacilitiesNurseStaff);
	}

	/**
	 * Creates a new medical facilities nurse staff with the primary key. Does not add the medical facilities nurse staff to the database.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key for the new medical facilities nurse staff
	 * @return the new medical facilities nurse staff
	 */
	@Override
	@Transactional(enabled = false)
	public MedicalFacilitiesNurseStaff createMedicalFacilitiesNurseStaff(
		long medicalFacilitiesNurseStaffId) {

		return medicalFacilitiesNurseStaffPersistence.create(
			medicalFacilitiesNurseStaffId);
	}

	/**
	 * Deletes the medical facilities nurse staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 * @throws PortalException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MedicalFacilitiesNurseStaff deleteMedicalFacilitiesNurseStaff(
			long medicalFacilitiesNurseStaffId)
		throws PortalException {

		return medicalFacilitiesNurseStaffPersistence.remove(
			medicalFacilitiesNurseStaffId);
	}

	/**
	 * Deletes the medical facilities nurse staff from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MedicalFacilitiesNurseStaff deleteMedicalFacilitiesNurseStaff(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return medicalFacilitiesNurseStaffPersistence.remove(
			medicalFacilitiesNurseStaff);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return medicalFacilitiesNurseStaffPersistence.dslQuery(dslQuery);
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
			MedicalFacilitiesNurseStaff.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return medicalFacilitiesNurseStaffPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
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

		return medicalFacilitiesNurseStaffPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
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

		return medicalFacilitiesNurseStaffPersistence.findWithDynamicQuery(
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
		return medicalFacilitiesNurseStaffPersistence.countWithDynamicQuery(
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

		return medicalFacilitiesNurseStaffPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MedicalFacilitiesNurseStaff fetchMedicalFacilitiesNurseStaff(
		long medicalFacilitiesNurseStaffId) {

		return medicalFacilitiesNurseStaffPersistence.fetchByPrimaryKey(
			medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns the medical facilities nurse staff matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff
		fetchMedicalFacilitiesNurseStaffByUuidAndGroupId(
			String uuid, long groupId) {

		return medicalFacilitiesNurseStaffPersistence.fetchByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns the medical facilities nurse staff with the primary key.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff
	 * @throws PortalException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff getMedicalFacilitiesNurseStaff(
			long medicalFacilitiesNurseStaffId)
		throws PortalException {

		return medicalFacilitiesNurseStaffPersistence.findByPrimaryKey(
			medicalFacilitiesNurseStaffId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesNurseStaffLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MedicalFacilitiesNurseStaff.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesNurseStaffId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesNurseStaffLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			MedicalFacilitiesNurseStaff.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesNurseStaffId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			medicalFacilitiesNurseStaffLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MedicalFacilitiesNurseStaff.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"medicalFacilitiesNurseStaffId");
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
				<MedicalFacilitiesNurseStaff>() {

				@Override
				public void performAction(
						MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, medicalFacilitiesNurseStaff);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(
					MedicalFacilitiesNurseStaff.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return medicalFacilitiesNurseStaffPersistence.create(
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
				"Implement MedicalFacilitiesNurseStaffLocalServiceImpl#deleteMedicalFacilitiesNurseStaff(MedicalFacilitiesNurseStaff) to avoid orphaned data");
		}

		return medicalFacilitiesNurseStaffLocalService.
			deleteMedicalFacilitiesNurseStaff(
				(MedicalFacilitiesNurseStaff)persistedModel);
	}

	@Override
	public BasePersistence<MedicalFacilitiesNurseStaff> getBasePersistence() {
		return medicalFacilitiesNurseStaffPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return medicalFacilitiesNurseStaffPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns all the medical facilities nurse staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse staffs
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities nurse staffs, or an empty list if no matches were found
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff>
		getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
			String uuid, long companyId) {

		return medicalFacilitiesNurseStaffPersistence.findByUuid_C(
			uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities nurse staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse staffs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities nurse staffs, or an empty list if no matches were found
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff>
		getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return medicalFacilitiesNurseStaffPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the medical facilities nurse staff matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse staff
	 * @throws PortalException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public MedicalFacilitiesNurseStaff
			getMedicalFacilitiesNurseStaffByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return medicalFacilitiesNurseStaffPersistence.findByUUID_G(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of medical facilities nurse staffs
	 */
	@Override
	public List<MedicalFacilitiesNurseStaff> getMedicalFacilitiesNurseStaffs(
		int start, int end) {

		return medicalFacilitiesNurseStaffPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of medical facilities nurse staffs.
	 *
	 * @return the number of medical facilities nurse staffs
	 */
	@Override
	public int getMedicalFacilitiesNurseStaffsCount() {
		return medicalFacilitiesNurseStaffPersistence.countAll();
	}

	/**
	 * Updates the medical facilities nurse staff in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MedicalFacilitiesNurseStaff updateMedicalFacilitiesNurseStaff(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return medicalFacilitiesNurseStaffPersistence.update(
			medicalFacilitiesNurseStaff);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MedicalFacilitiesNurseStaffLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		medicalFacilitiesNurseStaffLocalService =
			(MedicalFacilitiesNurseStaffLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MedicalFacilitiesNurseStaffLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MedicalFacilitiesNurseStaff.class;
	}

	protected String getModelClassName() {
		return MedicalFacilitiesNurseStaff.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				medicalFacilitiesNurseStaffPersistence.getDataSource();

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

	protected MedicalFacilitiesNurseStaffLocalService
		medicalFacilitiesNurseStaffLocalService;

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
		MedicalFacilitiesNurseStaffLocalServiceBaseImpl.class);

}