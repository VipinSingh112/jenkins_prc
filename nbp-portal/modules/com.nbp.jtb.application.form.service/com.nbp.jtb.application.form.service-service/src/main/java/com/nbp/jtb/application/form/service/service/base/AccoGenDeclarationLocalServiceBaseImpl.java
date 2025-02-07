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

import com.nbp.jtb.application.form.service.model.AccoGenDeclaration;
import com.nbp.jtb.application.form.service.service.AccoGenDeclarationLocalService;
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
 * Provides the base implementation for the acco gen declaration local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jtb.application.form.service.service.impl.AccoGenDeclarationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jtb.application.form.service.service.impl.AccoGenDeclarationLocalServiceImpl
 * @generated
 */
public abstract class AccoGenDeclarationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AccoGenDeclarationLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AccoGenDeclarationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jtb.application.form.service.service.AccoGenDeclarationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the acco gen declaration to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AccoGenDeclaration addAccoGenDeclaration(
		AccoGenDeclaration accoGenDeclaration) {

		accoGenDeclaration.setNew(true);

		return accoGenDeclarationPersistence.update(accoGenDeclaration);
	}

	/**
	 * Creates a new acco gen declaration with the primary key. Does not add the acco gen declaration to the database.
	 *
	 * @param accoGenDeclarationId the primary key for the new acco gen declaration
	 * @return the new acco gen declaration
	 */
	@Override
	@Transactional(enabled = false)
	public AccoGenDeclaration createAccoGenDeclaration(
		long accoGenDeclarationId) {

		return accoGenDeclarationPersistence.create(accoGenDeclarationId);
	}

	/**
	 * Deletes the acco gen declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration that was removed
	 * @throws PortalException if a acco gen declaration with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AccoGenDeclaration deleteAccoGenDeclaration(
			long accoGenDeclarationId)
		throws PortalException {

		return accoGenDeclarationPersistence.remove(accoGenDeclarationId);
	}

	/**
	 * Deletes the acco gen declaration from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AccoGenDeclaration deleteAccoGenDeclaration(
		AccoGenDeclaration accoGenDeclaration) {

		return accoGenDeclarationPersistence.remove(accoGenDeclaration);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return accoGenDeclarationPersistence.dslQuery(dslQuery);
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
			AccoGenDeclaration.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return accoGenDeclarationPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
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

		return accoGenDeclarationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
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

		return accoGenDeclarationPersistence.findWithDynamicQuery(
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
		return accoGenDeclarationPersistence.countWithDynamicQuery(
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

		return accoGenDeclarationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AccoGenDeclaration fetchAccoGenDeclaration(
		long accoGenDeclarationId) {

		return accoGenDeclarationPersistence.fetchByPrimaryKey(
			accoGenDeclarationId);
	}

	/**
	 * Returns the acco gen declaration matching the UUID and group.
	 *
	 * @param uuid the acco gen declaration's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco gen declaration, or <code>null</code> if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration fetchAccoGenDeclarationByUuidAndGroupId(
		String uuid, long groupId) {

		return accoGenDeclarationPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acco gen declaration with the primary key.
	 *
	 * @param accoGenDeclarationId the primary key of the acco gen declaration
	 * @return the acco gen declaration
	 * @throws PortalException if a acco gen declaration with the primary key could not be found
	 */
	@Override
	public AccoGenDeclaration getAccoGenDeclaration(long accoGenDeclarationId)
		throws PortalException {

		return accoGenDeclarationPersistence.findByPrimaryKey(
			accoGenDeclarationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			accoGenDeclarationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AccoGenDeclaration.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoGenDeclarationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			accoGenDeclarationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(AccoGenDeclaration.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoGenDeclarationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			accoGenDeclarationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AccoGenDeclaration.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoGenDeclarationId");
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
				<AccoGenDeclaration>() {

				@Override
				public void performAction(AccoGenDeclaration accoGenDeclaration)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, accoGenDeclaration);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(AccoGenDeclaration.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return accoGenDeclarationPersistence.create(
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
				"Implement AccoGenDeclarationLocalServiceImpl#deleteAccoGenDeclaration(AccoGenDeclaration) to avoid orphaned data");
		}

		return accoGenDeclarationLocalService.deleteAccoGenDeclaration(
			(AccoGenDeclaration)persistedModel);
	}

	@Override
	public BasePersistence<AccoGenDeclaration> getBasePersistence() {
		return accoGenDeclarationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return accoGenDeclarationPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the acco gen declarations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco gen declarations
	 * @param companyId the primary key of the company
	 * @return the matching acco gen declarations, or an empty list if no matches were found
	 */
	@Override
	public List<AccoGenDeclaration> getAccoGenDeclarationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return accoGenDeclarationPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of acco gen declarations matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco gen declarations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco gen declarations, or an empty list if no matches were found
	 */
	@Override
	public List<AccoGenDeclaration> getAccoGenDeclarationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoGenDeclaration> orderByComparator) {

		return accoGenDeclarationPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the acco gen declaration matching the UUID and group.
	 *
	 * @param uuid the acco gen declaration's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco gen declaration
	 * @throws PortalException if a matching acco gen declaration could not be found
	 */
	@Override
	public AccoGenDeclaration getAccoGenDeclarationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return accoGenDeclarationPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the acco gen declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoGenDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco gen declarations
	 * @param end the upper bound of the range of acco gen declarations (not inclusive)
	 * @return the range of acco gen declarations
	 */
	@Override
	public List<AccoGenDeclaration> getAccoGenDeclarations(int start, int end) {
		return accoGenDeclarationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of acco gen declarations.
	 *
	 * @return the number of acco gen declarations
	 */
	@Override
	public int getAccoGenDeclarationsCount() {
		return accoGenDeclarationPersistence.countAll();
	}

	/**
	 * Updates the acco gen declaration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoGenDeclarationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoGenDeclaration the acco gen declaration
	 * @return the acco gen declaration that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AccoGenDeclaration updateAccoGenDeclaration(
		AccoGenDeclaration accoGenDeclaration) {

		return accoGenDeclarationPersistence.update(accoGenDeclaration);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AccoGenDeclarationLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		accoGenDeclarationLocalService =
			(AccoGenDeclarationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AccoGenDeclarationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AccoGenDeclaration.class;
	}

	protected String getModelClassName() {
		return AccoGenDeclaration.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				accoGenDeclarationPersistence.getDataSource();

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

	protected AccoGenDeclarationLocalService accoGenDeclarationLocalService;

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
		AccoGenDeclarationLocalServiceBaseImpl.class);

}