/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.service.base;

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

import com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox;
import com.nbp.tourism.application.form.services.service.TourismBonaVehicleAddBoxLocalService;
import com.nbp.tourism.application.form.services.service.TourismBonaVehicleAddBoxLocalServiceUtil;
import com.nbp.tourism.application.form.services.service.persistence.TourismAnnualEntertainBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationCurrentStagePersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationPaymentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoAssesmentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoGenralInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccommodationFormAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccommodationFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionEmployeeInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundContractTransPaymentInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundPaymentInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransContractSignPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportatioCarRentalPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportationAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportationPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaVehicleAddBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportEmployeeInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoAssesmentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoGeneralFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccommodationAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccommodationFormPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAnnualEarningsPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionEmployeeInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewGroundSignaturePersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewGroundTransportationPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewNumberOFEmploymentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewVehicleAddBoxPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismSummaryAddBoxPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the tourism bona vehicle add box local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.tourism.application.form.services.service.impl.TourismBonaVehicleAddBoxLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.tourism.application.form.services.service.impl.TourismBonaVehicleAddBoxLocalServiceImpl
 * @generated
 */
public abstract class TourismBonaVehicleAddBoxLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   TourismBonaVehicleAddBoxLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>TourismBonaVehicleAddBoxLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>TourismBonaVehicleAddBoxLocalServiceUtil</code>.
	 */

	/**
	 * Adds the tourism bona vehicle add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaVehicleAddBox the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TourismBonaVehicleAddBox addTourismBonaVehicleAddBox(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		tourismBonaVehicleAddBox.setNew(true);

		return tourismBonaVehicleAddBoxPersistence.update(
			tourismBonaVehicleAddBox);
	}

	/**
	 * Creates a new tourism bona vehicle add box with the primary key. Does not add the tourism bona vehicle add box to the database.
	 *
	 * @param tourismBonaVehBoxId the primary key for the new tourism bona vehicle add box
	 * @return the new tourism bona vehicle add box
	 */
	@Override
	@Transactional(enabled = false)
	public TourismBonaVehicleAddBox createTourismBonaVehicleAddBox(
		long tourismBonaVehBoxId) {

		return tourismBonaVehicleAddBoxPersistence.create(tourismBonaVehBoxId);
	}

	/**
	 * Deletes the tourism bona vehicle add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaVehBoxId the primary key of the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was removed
	 * @throws PortalException if a tourism bona vehicle add box with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TourismBonaVehicleAddBox deleteTourismBonaVehicleAddBox(
			long tourismBonaVehBoxId)
		throws PortalException {

		return tourismBonaVehicleAddBoxPersistence.remove(tourismBonaVehBoxId);
	}

	/**
	 * Deletes the tourism bona vehicle add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaVehicleAddBox the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TourismBonaVehicleAddBox deleteTourismBonaVehicleAddBox(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return tourismBonaVehicleAddBoxPersistence.remove(
			tourismBonaVehicleAddBox);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return tourismBonaVehicleAddBoxPersistence.dslQuery(dslQuery);
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
			TourismBonaVehicleAddBox.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return tourismBonaVehicleAddBoxPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaVehicleAddBoxModelImpl</code>.
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

		return tourismBonaVehicleAddBoxPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaVehicleAddBoxModelImpl</code>.
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

		return tourismBonaVehicleAddBoxPersistence.findWithDynamicQuery(
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
		return tourismBonaVehicleAddBoxPersistence.countWithDynamicQuery(
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

		return tourismBonaVehicleAddBoxPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public TourismBonaVehicleAddBox fetchTourismBonaVehicleAddBox(
		long tourismBonaVehBoxId) {

		return tourismBonaVehicleAddBoxPersistence.fetchByPrimaryKey(
			tourismBonaVehBoxId);
	}

	/**
	 * Returns the tourism bona vehicle add box with the primary key.
	 *
	 * @param tourismBonaVehBoxId the primary key of the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box
	 * @throws PortalException if a tourism bona vehicle add box with the primary key could not be found
	 */
	@Override
	public TourismBonaVehicleAddBox getTourismBonaVehicleAddBox(
			long tourismBonaVehBoxId)
		throws PortalException {

		return tourismBonaVehicleAddBoxPersistence.findByPrimaryKey(
			tourismBonaVehBoxId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			tourismBonaVehicleAddBoxLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(TourismBonaVehicleAddBox.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("tourismBonaVehBoxId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			tourismBonaVehicleAddBoxLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			TourismBonaVehicleAddBox.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"tourismBonaVehBoxId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			tourismBonaVehicleAddBoxLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(TourismBonaVehicleAddBox.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("tourismBonaVehBoxId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return tourismBonaVehicleAddBoxPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return tourismBonaVehicleAddBoxLocalService.
			deleteTourismBonaVehicleAddBox(
				(TourismBonaVehicleAddBox)persistedModel);
	}

	@Override
	public BasePersistence<TourismBonaVehicleAddBox> getBasePersistence() {
		return tourismBonaVehicleAddBoxPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return tourismBonaVehicleAddBoxPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the tourism bona vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona vehicle add boxes
	 * @param end the upper bound of the range of tourism bona vehicle add boxes (not inclusive)
	 * @return the range of tourism bona vehicle add boxes
	 */
	@Override
	public List<TourismBonaVehicleAddBox> getTourismBonaVehicleAddBoxes(
		int start, int end) {

		return tourismBonaVehicleAddBoxPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tourism bona vehicle add boxes.
	 *
	 * @return the number of tourism bona vehicle add boxes
	 */
	@Override
	public int getTourismBonaVehicleAddBoxesCount() {
		return tourismBonaVehicleAddBoxPersistence.countAll();
	}

	/**
	 * Updates the tourism bona vehicle add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaVehicleAddBox the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TourismBonaVehicleAddBox updateTourismBonaVehicleAddBox(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return tourismBonaVehicleAddBoxPersistence.update(
			tourismBonaVehicleAddBox);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			TourismBonaVehicleAddBoxLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		tourismBonaVehicleAddBoxLocalService =
			(TourismBonaVehicleAddBoxLocalService)aopProxy;

		_setLocalServiceUtilService(tourismBonaVehicleAddBoxLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return TourismBonaVehicleAddBoxLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return TourismBonaVehicleAddBox.class;
	}

	protected String getModelClassName() {
		return TourismBonaVehicleAddBox.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				tourismBonaVehicleAddBoxPersistence.getDataSource();

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

	private void _setLocalServiceUtilService(
		TourismBonaVehicleAddBoxLocalService
			tourismBonaVehicleAddBoxLocalService) {

		try {
			Field field =
				TourismBonaVehicleAddBoxLocalServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, tourismBonaVehicleAddBoxLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected TourismAnnualEntertainBoxPersistence
		tourismAnnualEntertainBoxPersistence;

	@Reference
	protected TourismApplicationPersistence tourismApplicationPersistence;

	@Reference
	protected TourismApplicationCurrentStagePersistence
		tourismApplicationCurrentStagePersistence;

	@Reference
	protected TourismApplicationPaymentPersistence
		tourismApplicationPaymentPersistence;

	@Reference
	protected TourismBonaAccoAssesmentPersistence
		tourismBonaAccoAssesmentPersistence;

	@Reference
	protected TourismBonaAccoGenralInfoPersistence
		tourismBonaAccoGenralInfoPersistence;

	@Reference
	protected TourismBonaAccommodationFormPersistence
		tourismBonaAccommodationFormPersistence;

	@Reference
	protected TourismBonaAccommodationFormAddressPersistence
		tourismBonaAccommodationFormAddressPersistence;

	@Reference
	protected TourismBonaAccoSignInfoPersistence
		tourismBonaAccoSignInfoPersistence;

	@Reference
	protected TourismBonaAttractionEmployeeInfoPersistence
		tourismBonaAttractionEmployeeInfoPersistence;

	@Reference
	protected TourismBonaAttractionFormFirstPersistence
		tourismBonaAttractionFormFirstPersistence;

	@Reference
	protected TourismBonaAttractionFormFirstAddressPersistence
		tourismBonaAttractionFormFirstAddressPersistence;

	@Reference
	protected TourismBonaAttractionFormSecondPersistence
		tourismBonaAttractionFormSecondPersistence;

	@Reference
	protected TourismBonaAttractionSignInfoPersistence
		tourismBonaAttractionSignInfoPersistence;

	@Reference
	protected TourismBonaGroundContractTransPaymentInfoPersistence
		tourismBonaGroundContractTransPaymentInfoPersistence;

	@Reference
	protected TourismBonaGroundPaymentInfoPersistence
		tourismBonaGroundPaymentInfoPersistence;

	@Reference
	protected TourismBonaGroundSignInfoPersistence
		tourismBonaGroundSignInfoPersistence;

	@Reference
	protected TourismBonaGroundTransContractSignPersistence
		tourismBonaGroundTransContractSignPersistence;

	@Reference
	protected TourismBonaGroundTransportatioCarRentalPersistence
		tourismBonaGroundTransportatioCarRentalPersistence;

	@Reference
	protected TourismBonaGroundTransportationPersistence
		tourismBonaGroundTransportationPersistence;

	@Reference
	protected TourismBonaGroundTransportationAddressPersistence
		tourismBonaGroundTransportationAddressPersistence;

	protected TourismBonaVehicleAddBoxLocalService
		tourismBonaVehicleAddBoxLocalService;

	@Reference
	protected TourismBonaVehicleAddBoxPersistence
		tourismBonaVehicleAddBoxPersistence;

	@Reference
	protected TourismBonaWaterSportEmployeeInfoPersistence
		tourismBonaWaterSportEmployeeInfoPersistence;

	@Reference
	protected TourismBonaWaterSportsFormFirstPersistence
		tourismBonaWaterSportsFormFirstPersistence;

	@Reference
	protected TourismBonaWaterSportsFormFirstAddressPersistence
		tourismBonaWaterSportsFormFirstAddressPersistence;

	@Reference
	protected TourismBonaWaterSportsFormSecondPersistence
		tourismBonaWaterSportsFormSecondPersistence;

	@Reference
	protected TourismBonaWaterSportSignInfoPersistence
		tourismBonaWaterSportSignInfoPersistence;

	@Reference
	protected TourismNewAccoAssesmentPersistence
		tourismNewAccoAssesmentPersistence;

	@Reference
	protected TourismNewAccoGeneralFormPersistence
		tourismNewAccoGeneralFormPersistence;

	@Reference
	protected TourismNewAccommodationAddressPersistence
		tourismNewAccommodationAddressPersistence;

	@Reference
	protected TourismNewAccommodationFormPersistence
		tourismNewAccommodationFormPersistence;

	@Reference
	protected TourismNewAccoSignInfoPersistence
		tourismNewAccoSignInfoPersistence;

	@Reference
	protected TourismNewAnnualEarningsPersistence
		tourismNewAnnualEarningsPersistence;

	@Reference
	protected TourismNewAttractionEmployeeInfoPersistence
		tourismNewAttractionEmployeeInfoPersistence;

	@Reference
	protected TourismNewAttractionFormFirstPersistence
		tourismNewAttractionFormFirstPersistence;

	@Reference
	protected TourismNewAttractionFormFirstAddressPersistence
		tourismNewAttractionFormFirstAddressPersistence;

	@Reference
	protected TourismNewAttractionFormSecondPersistence
		tourismNewAttractionFormSecondPersistence;

	@Reference
	protected TourismNewAttractionSignInfoPersistence
		tourismNewAttractionSignInfoPersistence;

	@Reference
	protected TourismNewGroundSignaturePersistence
		tourismNewGroundSignaturePersistence;

	@Reference
	protected TourismNewGroundTransportationPersistence
		tourismNewGroundTransportationPersistence;

	@Reference
	protected TourismNewNumberOFEmploymentPersistence
		tourismNewNumberOFEmploymentPersistence;

	@Reference
	protected TourismNewVehicleAddBoxPersistence
		tourismNewVehicleAddBoxPersistence;

	@Reference
	protected TourismSummaryAddBoxPersistence tourismSummaryAddBoxPersistence;

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

}