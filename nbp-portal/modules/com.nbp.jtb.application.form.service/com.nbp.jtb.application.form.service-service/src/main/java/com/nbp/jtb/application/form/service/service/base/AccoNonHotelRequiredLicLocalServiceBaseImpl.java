/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.base;

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

import com.nbp.jtb.application.form.service.model.AccoNonHotelRequiredLic;
import com.nbp.jtb.application.form.service.service.AccoNonHotelRequiredLicLocalService;
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
 * Provides the base implementation for the acco non hotel required lic local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jtb.application.form.service.service.impl.AccoNonHotelRequiredLicLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jtb.application.form.service.service.impl.AccoNonHotelRequiredLicLocalServiceImpl
 * @generated
 */
public abstract class AccoNonHotelRequiredLicLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AccoNonHotelRequiredLicLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AccoNonHotelRequiredLicLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jtb.application.form.service.service.AccoNonHotelRequiredLicLocalServiceUtil</code>.
	 */

	/**
	 * Adds the acco non hotel required lic to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelRequiredLicLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 * @return the acco non hotel required lic that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AccoNonHotelRequiredLic addAccoNonHotelRequiredLic(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		accoNonHotelRequiredLic.setNew(true);

		return accoNonHotelRequiredLicPersistence.update(
			accoNonHotelRequiredLic);
	}

	/**
	 * Creates a new acco non hotel required lic with the primary key. Does not add the acco non hotel required lic to the database.
	 *
	 * @param accoNonHotelRequiredLicId the primary key for the new acco non hotel required lic
	 * @return the new acco non hotel required lic
	 */
	@Override
	@Transactional(enabled = false)
	public AccoNonHotelRequiredLic createAccoNonHotelRequiredLic(
		long accoNonHotelRequiredLicId) {

		return accoNonHotelRequiredLicPersistence.create(
			accoNonHotelRequiredLicId);
	}

	/**
	 * Deletes the acco non hotel required lic with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelRequiredLicLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic that was removed
	 * @throws PortalException if a acco non hotel required lic with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AccoNonHotelRequiredLic deleteAccoNonHotelRequiredLic(
			long accoNonHotelRequiredLicId)
		throws PortalException {

		return accoNonHotelRequiredLicPersistence.remove(
			accoNonHotelRequiredLicId);
	}

	/**
	 * Deletes the acco non hotel required lic from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelRequiredLicLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 * @return the acco non hotel required lic that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AccoNonHotelRequiredLic deleteAccoNonHotelRequiredLic(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		return accoNonHotelRequiredLicPersistence.remove(
			accoNonHotelRequiredLic);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return accoNonHotelRequiredLicPersistence.dslQuery(dslQuery);
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
			AccoNonHotelRequiredLic.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return accoNonHotelRequiredLicPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicModelImpl</code>.
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

		return accoNonHotelRequiredLicPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicModelImpl</code>.
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

		return accoNonHotelRequiredLicPersistence.findWithDynamicQuery(
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
		return accoNonHotelRequiredLicPersistence.countWithDynamicQuery(
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

		return accoNonHotelRequiredLicPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AccoNonHotelRequiredLic fetchAccoNonHotelRequiredLic(
		long accoNonHotelRequiredLicId) {

		return accoNonHotelRequiredLicPersistence.fetchByPrimaryKey(
			accoNonHotelRequiredLicId);
	}

	/**
	 * Returns the acco non hotel required lic with the primary key.
	 *
	 * @param accoNonHotelRequiredLicId the primary key of the acco non hotel required lic
	 * @return the acco non hotel required lic
	 * @throws PortalException if a acco non hotel required lic with the primary key could not be found
	 */
	@Override
	public AccoNonHotelRequiredLic getAccoNonHotelRequiredLic(
			long accoNonHotelRequiredLicId)
		throws PortalException {

		return accoNonHotelRequiredLicPersistence.findByPrimaryKey(
			accoNonHotelRequiredLicId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			accoNonHotelRequiredLicLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AccoNonHotelRequiredLic.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoNonHotelRequiredLicId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			accoNonHotelRequiredLicLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			AccoNonHotelRequiredLic.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoNonHotelRequiredLicId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			accoNonHotelRequiredLicLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AccoNonHotelRequiredLic.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"accoNonHotelRequiredLicId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return accoNonHotelRequiredLicPersistence.create(
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
				"Implement AccoNonHotelRequiredLicLocalServiceImpl#deleteAccoNonHotelRequiredLic(AccoNonHotelRequiredLic) to avoid orphaned data");
		}

		return accoNonHotelRequiredLicLocalService.
			deleteAccoNonHotelRequiredLic(
				(AccoNonHotelRequiredLic)persistedModel);
	}

	@Override
	public BasePersistence<AccoNonHotelRequiredLic> getBasePersistence() {
		return accoNonHotelRequiredLicPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return accoNonHotelRequiredLicPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the acco non hotel required lics.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AccoNonHotelRequiredLicModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel required lics
	 * @param end the upper bound of the range of acco non hotel required lics (not inclusive)
	 * @return the range of acco non hotel required lics
	 */
	@Override
	public List<AccoNonHotelRequiredLic> getAccoNonHotelRequiredLics(
		int start, int end) {

		return accoNonHotelRequiredLicPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of acco non hotel required lics.
	 *
	 * @return the number of acco non hotel required lics
	 */
	@Override
	public int getAccoNonHotelRequiredLicsCount() {
		return accoNonHotelRequiredLicPersistence.countAll();
	}

	/**
	 * Updates the acco non hotel required lic in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccoNonHotelRequiredLicLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accoNonHotelRequiredLic the acco non hotel required lic
	 * @return the acco non hotel required lic that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AccoNonHotelRequiredLic updateAccoNonHotelRequiredLic(
		AccoNonHotelRequiredLic accoNonHotelRequiredLic) {

		return accoNonHotelRequiredLicPersistence.update(
			accoNonHotelRequiredLic);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AccoNonHotelRequiredLicLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		accoNonHotelRequiredLicLocalService =
			(AccoNonHotelRequiredLicLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AccoNonHotelRequiredLicLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AccoNonHotelRequiredLic.class;
	}

	protected String getModelClassName() {
		return AccoNonHotelRequiredLic.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				accoNonHotelRequiredLicPersistence.getDataSource();

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

	protected AccoNonHotelRequiredLicLocalService
		accoNonHotelRequiredLicLocalService;

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
		AccoNonHotelRequiredLicLocalServiceBaseImpl.class);

}