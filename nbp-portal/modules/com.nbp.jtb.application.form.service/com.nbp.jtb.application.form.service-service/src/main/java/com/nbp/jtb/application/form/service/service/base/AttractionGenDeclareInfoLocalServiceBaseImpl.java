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

import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.service.AttractionGenDeclareInfoLocalService;
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
 * Provides the base implementation for the attraction gen declare info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jtb.application.form.service.service.impl.AttractionGenDeclareInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jtb.application.form.service.service.impl.AttractionGenDeclareInfoLocalServiceImpl
 * @generated
 */
public abstract class AttractionGenDeclareInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, AttractionGenDeclareInfoLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AttractionGenDeclareInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jtb.application.form.service.service.AttractionGenDeclareInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the attraction gen declare info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AttractionGenDeclareInfo addAttractionGenDeclareInfo(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		attractionGenDeclareInfo.setNew(true);

		return attractionGenDeclareInfoPersistence.update(
			attractionGenDeclareInfo);
	}

	/**
	 * Creates a new attraction gen declare info with the primary key. Does not add the attraction gen declare info to the database.
	 *
	 * @param attractionGenDeclareInfoId the primary key for the new attraction gen declare info
	 * @return the new attraction gen declare info
	 */
	@Override
	@Transactional(enabled = false)
	public AttractionGenDeclareInfo createAttractionGenDeclareInfo(
		long attractionGenDeclareInfoId) {

		return attractionGenDeclareInfoPersistence.create(
			attractionGenDeclareInfoId);
	}

	/**
	 * Deletes the attraction gen declare info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 * @throws PortalException if a attraction gen declare info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AttractionGenDeclareInfo deleteAttractionGenDeclareInfo(
			long attractionGenDeclareInfoId)
		throws PortalException {

		return attractionGenDeclareInfoPersistence.remove(
			attractionGenDeclareInfoId);
	}

	/**
	 * Deletes the attraction gen declare info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AttractionGenDeclareInfo deleteAttractionGenDeclareInfo(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		return attractionGenDeclareInfoPersistence.remove(
			attractionGenDeclareInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return attractionGenDeclareInfoPersistence.dslQuery(dslQuery);
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
			AttractionGenDeclareInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return attractionGenDeclareInfoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
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

		return attractionGenDeclareInfoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
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

		return attractionGenDeclareInfoPersistence.findWithDynamicQuery(
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
		return attractionGenDeclareInfoPersistence.countWithDynamicQuery(
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

		return attractionGenDeclareInfoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AttractionGenDeclareInfo fetchAttractionGenDeclareInfo(
		long attractionGenDeclareInfoId) {

		return attractionGenDeclareInfoPersistence.fetchByPrimaryKey(
			attractionGenDeclareInfoId);
	}

	/**
	 * Returns the attraction gen declare info with the primary key.
	 *
	 * @param attractionGenDeclareInfoId the primary key of the attraction gen declare info
	 * @return the attraction gen declare info
	 * @throws PortalException if a attraction gen declare info with the primary key could not be found
	 */
	@Override
	public AttractionGenDeclareInfo getAttractionGenDeclareInfo(
			long attractionGenDeclareInfoId)
		throws PortalException {

		return attractionGenDeclareInfoPersistence.findByPrimaryKey(
			attractionGenDeclareInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			attractionGenDeclareInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AttractionGenDeclareInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"attractionGenDeclareInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			attractionGenDeclareInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			AttractionGenDeclareInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"attractionGenDeclareInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			attractionGenDeclareInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AttractionGenDeclareInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"attractionGenDeclareInfoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return attractionGenDeclareInfoPersistence.create(
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
				"Implement AttractionGenDeclareInfoLocalServiceImpl#deleteAttractionGenDeclareInfo(AttractionGenDeclareInfo) to avoid orphaned data");
		}

		return attractionGenDeclareInfoLocalService.
			deleteAttractionGenDeclareInfo(
				(AttractionGenDeclareInfo)persistedModel);
	}

	@Override
	public BasePersistence<AttractionGenDeclareInfo> getBasePersistence() {
		return attractionGenDeclareInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return attractionGenDeclareInfoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the attraction gen declare infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractionGenDeclareInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction gen declare infos
	 * @param end the upper bound of the range of attraction gen declare infos (not inclusive)
	 * @return the range of attraction gen declare infos
	 */
	@Override
	public List<AttractionGenDeclareInfo> getAttractionGenDeclareInfos(
		int start, int end) {

		return attractionGenDeclareInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of attraction gen declare infos.
	 *
	 * @return the number of attraction gen declare infos
	 */
	@Override
	public int getAttractionGenDeclareInfosCount() {
		return attractionGenDeclareInfoPersistence.countAll();
	}

	/**
	 * Updates the attraction gen declare info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractionGenDeclareInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractionGenDeclareInfo the attraction gen declare info
	 * @return the attraction gen declare info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AttractionGenDeclareInfo updateAttractionGenDeclareInfo(
		AttractionGenDeclareInfo attractionGenDeclareInfo) {

		return attractionGenDeclareInfoPersistence.update(
			attractionGenDeclareInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AttractionGenDeclareInfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		attractionGenDeclareInfoLocalService =
			(AttractionGenDeclareInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AttractionGenDeclareInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AttractionGenDeclareInfo.class;
	}

	protected String getModelClassName() {
		return AttractionGenDeclareInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				attractionGenDeclareInfoPersistence.getDataSource();

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

	protected AttractionGenDeclareInfoLocalService
		attractionGenDeclareInfoLocalService;

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
		AttractionGenDeclareInfoLocalServiceBaseImpl.class);

}