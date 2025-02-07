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

import com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo;
import com.nbp.jtb.application.form.service.service.JtbAddCraftEmployeeInfoLocalService;
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
 * Provides the base implementation for the jtb add craft employee info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jtb.application.form.service.service.impl.JtbAddCraftEmployeeInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jtb.application.form.service.service.impl.JtbAddCraftEmployeeInfoLocalServiceImpl
 * @generated
 */
public abstract class JtbAddCraftEmployeeInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   JtbAddCraftEmployeeInfoLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JtbAddCraftEmployeeInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.jtb.application.form.service.service.JtbAddCraftEmployeeInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the jtb add craft employee info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftEmployeeInfo the jtb add craft employee info
	 * @return the jtb add craft employee info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JtbAddCraftEmployeeInfo addJtbAddCraftEmployeeInfo(
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {

		jtbAddCraftEmployeeInfo.setNew(true);

		return jtbAddCraftEmployeeInfoPersistence.update(
			jtbAddCraftEmployeeInfo);
	}

	/**
	 * Creates a new jtb add craft employee info with the primary key. Does not add the jtb add craft employee info to the database.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key for the new jtb add craft employee info
	 * @return the new jtb add craft employee info
	 */
	@Override
	@Transactional(enabled = false)
	public JtbAddCraftEmployeeInfo createJtbAddCraftEmployeeInfo(
		long jtbAddCraftEmployeeInfoId) {

		return jtbAddCraftEmployeeInfoPersistence.create(
			jtbAddCraftEmployeeInfoId);
	}

	/**
	 * Deletes the jtb add craft employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info that was removed
	 * @throws PortalException if a jtb add craft employee info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JtbAddCraftEmployeeInfo deleteJtbAddCraftEmployeeInfo(
			long jtbAddCraftEmployeeInfoId)
		throws PortalException {

		return jtbAddCraftEmployeeInfoPersistence.remove(
			jtbAddCraftEmployeeInfoId);
	}

	/**
	 * Deletes the jtb add craft employee info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftEmployeeInfo the jtb add craft employee info
	 * @return the jtb add craft employee info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JtbAddCraftEmployeeInfo deleteJtbAddCraftEmployeeInfo(
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {

		return jtbAddCraftEmployeeInfoPersistence.remove(
			jtbAddCraftEmployeeInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return jtbAddCraftEmployeeInfoPersistence.dslQuery(dslQuery);
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
			JtbAddCraftEmployeeInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return jtbAddCraftEmployeeInfoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoModelImpl</code>.
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

		return jtbAddCraftEmployeeInfoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoModelImpl</code>.
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

		return jtbAddCraftEmployeeInfoPersistence.findWithDynamicQuery(
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
		return jtbAddCraftEmployeeInfoPersistence.countWithDynamicQuery(
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

		return jtbAddCraftEmployeeInfoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public JtbAddCraftEmployeeInfo fetchJtbAddCraftEmployeeInfo(
		long jtbAddCraftEmployeeInfoId) {

		return jtbAddCraftEmployeeInfoPersistence.fetchByPrimaryKey(
			jtbAddCraftEmployeeInfoId);
	}

	/**
	 * Returns the jtb add craft employee info with the primary key.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info
	 * @throws PortalException if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public JtbAddCraftEmployeeInfo getJtbAddCraftEmployeeInfo(
			long jtbAddCraftEmployeeInfoId)
		throws PortalException {

		return jtbAddCraftEmployeeInfoPersistence.findByPrimaryKey(
			jtbAddCraftEmployeeInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			jtbAddCraftEmployeeInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JtbAddCraftEmployeeInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"jtbAddCraftEmployeeInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			jtbAddCraftEmployeeInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			JtbAddCraftEmployeeInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"jtbAddCraftEmployeeInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			jtbAddCraftEmployeeInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JtbAddCraftEmployeeInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"jtbAddCraftEmployeeInfoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jtbAddCraftEmployeeInfoPersistence.create(
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
				"Implement JtbAddCraftEmployeeInfoLocalServiceImpl#deleteJtbAddCraftEmployeeInfo(JtbAddCraftEmployeeInfo) to avoid orphaned data");
		}

		return jtbAddCraftEmployeeInfoLocalService.
			deleteJtbAddCraftEmployeeInfo(
				(JtbAddCraftEmployeeInfo)persistedModel);
	}

	@Override
	public BasePersistence<JtbAddCraftEmployeeInfo> getBasePersistence() {
		return jtbAddCraftEmployeeInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jtbAddCraftEmployeeInfoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the jtb add craft employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @return the range of jtb add craft employee infos
	 */
	@Override
	public List<JtbAddCraftEmployeeInfo> getJtbAddCraftEmployeeInfos(
		int start, int end) {

		return jtbAddCraftEmployeeInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of jtb add craft employee infos.
	 *
	 * @return the number of jtb add craft employee infos
	 */
	@Override
	public int getJtbAddCraftEmployeeInfosCount() {
		return jtbAddCraftEmployeeInfoPersistence.countAll();
	}

	/**
	 * Updates the jtb add craft employee info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftEmployeeInfo the jtb add craft employee info
	 * @return the jtb add craft employee info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JtbAddCraftEmployeeInfo updateJtbAddCraftEmployeeInfo(
		JtbAddCraftEmployeeInfo jtbAddCraftEmployeeInfo) {

		return jtbAddCraftEmployeeInfoPersistence.update(
			jtbAddCraftEmployeeInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			JtbAddCraftEmployeeInfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		jtbAddCraftEmployeeInfoLocalService =
			(JtbAddCraftEmployeeInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JtbAddCraftEmployeeInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return JtbAddCraftEmployeeInfo.class;
	}

	protected String getModelClassName() {
		return JtbAddCraftEmployeeInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				jtbAddCraftEmployeeInfoPersistence.getDataSource();

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

	protected JtbAddCraftEmployeeInfoLocalService
		jtbAddCraftEmployeeInfoLocalService;

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
		JtbAddCraftEmployeeInfoLocalServiceBaseImpl.class);

}