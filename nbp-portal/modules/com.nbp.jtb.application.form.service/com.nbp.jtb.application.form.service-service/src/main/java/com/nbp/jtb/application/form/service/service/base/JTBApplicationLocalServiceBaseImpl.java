/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.base;

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

import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.service.JTBApplicationLocalService;
import com.nbp.jtb.application.form.service.service.persistence.AccoGenDeclarationPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoHomeStayPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoHotelLicencePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelGenDecPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelLicencePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AccoNonHotelRequiredLicPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractDetailFormInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionBikeRentalInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCarRentConditionPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCarRentalLicencePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionConCarriageInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCraftTraderPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionDomesticServicePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionDomesticTourPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionGenDeclareInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionPlaceOfInterestPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionTravelAgencyPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionTravelHaltAppPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterEmployeePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterGenDeclarePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterRequiredPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterSportPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JTBApplicationPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JTBCurrentStagePersistence;
import com.nbp.jtb.application.form.service.service.persistence.JTBPaymentMethodPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddBranchDetailInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddCraftApplicantInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddCraftEmployeeInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddListDriverInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbAddListVehicleRegstPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the jtb application local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jtb.application.form.service.service.impl.JTBApplicationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jtb.application.form.service.service.impl.JTBApplicationLocalServiceImpl
 * @generated
 */
public abstract class JTBApplicationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, JTBApplicationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JTBApplicationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jtb.application.form.service.service.JTBApplicationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the jtb application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JTBApplication addJTBApplication(JTBApplication jtbApplication) {
		jtbApplication.setNew(true);

		return jtbApplicationPersistence.update(jtbApplication);
	}

	/**
	 * Creates a new jtb application with the primary key. Does not add the jtb application to the database.
	 *
	 * @param jtbApplicationId the primary key for the new jtb application
	 * @return the new jtb application
	 */
	@Override
	@Transactional(enabled = false)
	public JTBApplication createJTBApplication(long jtbApplicationId) {
		return jtbApplicationPersistence.create(jtbApplicationId);
	}

	/**
	 * Deletes the jtb application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application that was removed
	 * @throws PortalException if a jtb application with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JTBApplication deleteJTBApplication(long jtbApplicationId)
		throws PortalException {

		return jtbApplicationPersistence.remove(jtbApplicationId);
	}

	/**
	 * Deletes the jtb application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JTBApplication deleteJTBApplication(JTBApplication jtbApplication) {
		return jtbApplicationPersistence.remove(jtbApplication);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return jtbApplicationPersistence.dslQuery(dslQuery);
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
			JTBApplication.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return jtbApplicationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
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

		return jtbApplicationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
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

		return jtbApplicationPersistence.findWithDynamicQuery(
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
		return jtbApplicationPersistence.countWithDynamicQuery(dynamicQuery);
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

		return jtbApplicationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public JTBApplication fetchJTBApplication(long jtbApplicationId) {
		return jtbApplicationPersistence.fetchByPrimaryKey(jtbApplicationId);
	}

	/**
	 * Returns the jtb application matching the UUID and group.
	 *
	 * @param uuid the jtb application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchJTBApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return jtbApplicationPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jtb application with the primary key.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application
	 * @throws PortalException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication getJTBApplication(long jtbApplicationId)
		throws PortalException {

		return jtbApplicationPersistence.findByPrimaryKey(jtbApplicationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(jtbApplicationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JTBApplication.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("jtbApplicationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			jtbApplicationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(JTBApplication.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"jtbApplicationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(jtbApplicationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JTBApplication.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("jtbApplicationId");
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
			new ActionableDynamicQuery.PerformActionMethod<JTBApplication>() {

				@Override
				public void performAction(JTBApplication jtbApplication)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, jtbApplication);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(JTBApplication.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jtbApplicationPersistence.create(
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
				"Implement JTBApplicationLocalServiceImpl#deleteJTBApplication(JTBApplication) to avoid orphaned data");
		}

		return jtbApplicationLocalService.deleteJTBApplication(
			(JTBApplication)persistedModel);
	}

	@Override
	public BasePersistence<JTBApplication> getBasePersistence() {
		return jtbApplicationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jtbApplicationPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the jtb applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb applications
	 * @param companyId the primary key of the company
	 * @return the matching jtb applications, or an empty list if no matches were found
	 */
	@Override
	public List<JTBApplication> getJTBApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return jtbApplicationPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of jtb applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jtb applications, or an empty list if no matches were found
	 */
	@Override
	public List<JTBApplication> getJTBApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return jtbApplicationPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the jtb application matching the UUID and group.
	 *
	 * @param uuid the jtb application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application
	 * @throws PortalException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication getJTBApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return jtbApplicationPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of jtb applications
	 */
	@Override
	public List<JTBApplication> getJTBApplications(int start, int end) {
		return jtbApplicationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of jtb applications.
	 *
	 * @return the number of jtb applications
	 */
	@Override
	public int getJTBApplicationsCount() {
		return jtbApplicationPersistence.countAll();
	}

	/**
	 * Updates the jtb application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JTBApplication updateJTBApplication(JTBApplication jtbApplication) {
		return jtbApplicationPersistence.update(jtbApplication);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			JTBApplicationLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		jtbApplicationLocalService = (JTBApplicationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JTBApplicationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return JTBApplication.class;
	}

	protected String getModelClassName() {
		return JTBApplication.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = jtbApplicationPersistence.getDataSource();

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
	protected AccoGenDeclarationPersistence accoGenDeclarationPersistence;

	@Reference
	protected AccoHomeStayPersistence accoHomeStayPersistence;

	@Reference
	protected AccoHotelLicencePersistence accoHotelLicencePersistence;

	@Reference
	protected AccoNonHotelGenDecPersistence accoNonHotelGenDecPersistence;

	@Reference
	protected AccoNonHotelLicencePersistence accoNonHotelLicencePersistence;

	@Reference
	protected AccoNonHotelRequiredLicPersistence
		accoNonHotelRequiredLicPersistence;

	@Reference
	protected AttractDetailFormInfoPersistence attractDetailFormInfoPersistence;

	@Reference
	protected AttractionBikeRentalInfoPersistence
		attractionBikeRentalInfoPersistence;

	@Reference
	protected AttractionCarRentalLicencePersistence
		attractionCarRentalLicencePersistence;

	@Reference
	protected AttractionCarRentConditionPersistence
		attractionCarRentConditionPersistence;

	@Reference
	protected AttractionConCarriageInfoPersistence
		attractionConCarriageInfoPersistence;

	@Reference
	protected AttractionCraftTraderPersistence attractionCraftTraderPersistence;

	@Reference
	protected AttractionDomesticServicePersistence
		attractionDomesticServicePersistence;

	@Reference
	protected AttractionDomesticTourPersistence
		attractionDomesticTourPersistence;

	@Reference
	protected AttractionGenDeclareInfoPersistence
		attractionGenDeclareInfoPersistence;

	@Reference
	protected AttractionPlaceOfInterestPersistence
		attractionPlaceOfInterestPersistence;

	@Reference
	protected AttractionTravelAgencyPersistence
		attractionTravelAgencyPersistence;

	@Reference
	protected AttractionTravelHaltAppPersistence
		attractionTravelHaltAppPersistence;

	@Reference
	protected AttractionWaterEmployeePersistence
		attractionWaterEmployeePersistence;

	@Reference
	protected AttractionWaterGenDeclarePersistence
		attractionWaterGenDeclarePersistence;

	@Reference
	protected AttractionWaterRequiredPersistence
		attractionWaterRequiredPersistence;

	@Reference
	protected AttractionWaterSportPersistence attractionWaterSportPersistence;

	@Reference
	protected JtbAddBranchDetailInfoPersistence
		jtbAddBranchDetailInfoPersistence;

	@Reference
	protected JtbAddCraftApplicantInfoPersistence
		jtbAddCraftApplicantInfoPersistence;

	@Reference
	protected JtbAddCraftEmployeeInfoPersistence
		jtbAddCraftEmployeeInfoPersistence;

	@Reference
	protected JtbAddListDriverInfoPersistence jtbAddListDriverInfoPersistence;

	@Reference
	protected JtbAddListVehicleRegstPersistence
		jtbAddListVehicleRegstPersistence;

	protected JTBApplicationLocalService jtbApplicationLocalService;

	@Reference
	protected JTBApplicationPersistence jtbApplicationPersistence;

	@Reference
	protected JTBCurrentStagePersistence jtbCurrentStagePersistence;

	@Reference
	protected JTBPaymentMethodPersistence jtbPaymentMethodPersistence;

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
		JTBApplicationLocalServiceBaseImpl.class);

}