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

import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec;
import com.nbp.jtb.application.form.service.service.AccoNonHotelGenDecLocalService;
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
 * Provides the base implementation for the acco non hotel gen dec local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jtb.application.form.service.service.impl.AccoNonHotelGenDecLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jtb.application.form.service.service.impl.AccoNonHotelGenDecLocalServiceImpl
 * @generated
 */
public abstract class AccoNonHotelGenDecLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AccoNonHotelGenDecLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AccoNonHotelGenDecLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jtb.application.form.service.service.AccoNonHotelGenDecLocalServiceUtil</code>.
	 */

	/**
	 * Adds the acco non hotel gen dec to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AccoNonHotelGenDec addAccoNonHotelGenDec(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		accoNonHotelGenDec.setNew(true);

		return accoNonHotelGenDecPersistence.update(accoNonHotelGenDec);
	}

	/**
	 * Creates a new acco non hotel gen dec with the primary key. Does not add the acco non hotel gen dec to the database.
	 *
	 * @param accoNonHotelGenDecId the primary key for the new acco non hotel gen dec
	 * @return the new acco non hotel gen dec
	 */
	@Override
	@Transactional(enabled = false)
	public AccoNonHotelGenDec createAccoNonHotelGenDec(
		long accoNonHotelGenDecId) {

		return accoNonHotelGenDecPersistence.create(accoNonHotelGenDecId);
	}

	/**
	 * Deletes the acco non hotel gen dec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 * @throws PortalException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AccoNonHotelGenDec deleteAccoNonHotelGenDec(
			long accoNonHotelGenDecId)
		throws PortalException {

		return accoNonHotelGenDecPersistence.remove(accoNonHotelGenDecId);
	}

	/**
	 * Deletes the acco non hotel gen dec from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AccoNonHotelGenDec deleteAccoNonHotelGenDec(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		return accoNonHotelGenDecPersistence.remove(accoNonHotelGenDec);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return accoNonHotelGenDecPersistence.dslQuery(dslQuery);
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
			AccoNonHotelGenDec.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return accoNonHotelGenDecPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
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

		return accoNonHotelGenDecPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
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

		return accoNonHotelGenDecPersistence.findWithDynamicQuery(
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
		return accoNonHotelGenDecPersistence.countWithDynamicQuery(
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

		return accoNonHotelGenDecPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AccoNonHotelGenDec fetchAccoNonHotelGenDec(
		long accoNonHotelGenDecId) {

		return accoNonHotelGenDecPersistence.fetchByPrimaryKey(
			accoNonHotelGenDecId);
	}

	/**
	 * Returns the acco non hotel gen dec matching the UUID and group.
	 *
	 * @param uuid the acco non hotel gen dec's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec fetchAccoNonHotelGenDecByUuidAndGroupId(
		String uuid, long groupId) {

		return accoNonHotelGenDecPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acco non hotel gen dec with the primary key.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec
	 * @throws PortalException if a acco non hotel gen dec with the primary key could not be found
	 */
	@Override
	public AccoNonHotelGenDec getAccoNonHotelGenDec(long accoNonHotelGenDecId)
		throws PortalException {

		return accoNonHotelGenDecPersistence.findByPrimaryKey(
			accoNonHotelGenDecId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			accoNonHotelGenDecLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AccoNonHotelGenDec.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoNonHotelGenDecId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			accoNonHotelGenDecLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(AccoNonHotelGenDec.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoNonHotelGenDecId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			accoNonHotelGenDecLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AccoNonHotelGenDec.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoNonHotelGenDecId");
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
				<AccoNonHotelGenDec>() {

				@Override
				public void performAction(AccoNonHotelGenDec accoNonHotelGenDec)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, accoNonHotelGenDec);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(AccoNonHotelGenDec.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return accoNonHotelGenDecPersistence.create(
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
				"Implement AccoNonHotelGenDecLocalServiceImpl#deleteAccoNonHotelGenDec(AccoNonHotelGenDec) to avoid orphaned data");
		}

		return accoNonHotelGenDecLocalService.deleteAccoNonHotelGenDec(
			(AccoNonHotelGenDec)persistedModel);
	}

	@Override
	public BasePersistence<AccoNonHotelGenDec> getBasePersistence() {
		return accoNonHotelGenDecPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return accoNonHotelGenDecPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the acco non hotel gen decs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel gen decs
	 * @param companyId the primary key of the company
	 * @return the matching acco non hotel gen decs, or an empty list if no matches were found
	 */
	@Override
	public List<AccoNonHotelGenDec> getAccoNonHotelGenDecsByUuidAndCompanyId(
		String uuid, long companyId) {

		return accoNonHotelGenDecPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of acco non hotel gen decs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acco non hotel gen decs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acco non hotel gen decs, or an empty list if no matches were found
	 */
	@Override
	public List<AccoNonHotelGenDec> getAccoNonHotelGenDecsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return accoNonHotelGenDecPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the acco non hotel gen dec matching the UUID and group.
	 *
	 * @param uuid the acco non hotel gen dec's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acco non hotel gen dec
	 * @throws PortalException if a matching acco non hotel gen dec could not be found
	 */
	@Override
	public AccoNonHotelGenDec getAccoNonHotelGenDecByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return accoNonHotelGenDecPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of acco non hotel gen decs
	 */
	@Override
	public List<AccoNonHotelGenDec> getAccoNonHotelGenDecs(int start, int end) {
		return accoNonHotelGenDecPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of acco non hotel gen decs.
	 *
	 * @return the number of acco non hotel gen decs
	 */
	@Override
	public int getAccoNonHotelGenDecsCount() {
		return accoNonHotelGenDecPersistence.countAll();
	}

	/**
	 * Updates the acco non hotel gen dec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelGenDecLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AccoNonHotelGenDec updateAccoNonHotelGenDec(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		return accoNonHotelGenDecPersistence.update(accoNonHotelGenDec);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AccoNonHotelGenDecLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		accoNonHotelGenDecLocalService =
			(AccoNonHotelGenDecLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AccoNonHotelGenDecLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AccoNonHotelGenDec.class;
	}

	protected String getModelClassName() {
		return AccoNonHotelGenDec.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				accoNonHotelGenDecPersistence.getDataSource();

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

	protected AccoNonHotelGenDecLocalService accoNonHotelGenDecLocalService;

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
		AccoNonHotelGenDecLocalServiceBaseImpl.class);

}