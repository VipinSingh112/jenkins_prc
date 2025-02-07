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

package com.nbp.farm.application.form.service.service.base;

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

import com.nbp.farm.application.form.service.model.FarmerCurrentStage;
import com.nbp.farm.application.form.service.service.FarmerCurrentStageLocalService;
import com.nbp.farm.application.form.service.service.FarmerCurrentStageLocalServiceUtil;
import com.nbp.farm.application.form.service.service.persistence.FarmerApplicationPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerCropPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerCropPracticePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerCurrentStagePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerLivestockPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerProfilePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerPropertyPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerStakeholderInfoPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerlivestockPracticePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the farmer current stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.farm.application.form.service.service.impl.FarmerCurrentStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.farm.application.form.service.service.impl.FarmerCurrentStageLocalServiceImpl
 * @generated
 */
public abstract class FarmerCurrentStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, FarmerCurrentStageLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FarmerCurrentStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>FarmerCurrentStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the farmer current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStage the farmer current stage
	 * @return the farmer current stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FarmerCurrentStage addFarmerCurrentStage(
		FarmerCurrentStage farmerCurrentStage) {

		farmerCurrentStage.setNew(true);

		return farmerCurrentStagePersistence.update(farmerCurrentStage);
	}

	/**
	 * Creates a new farmer current stage with the primary key. Does not add the farmer current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer current stage
	 * @return the new farmer current stage
	 */
	@Override
	@Transactional(enabled = false)
	public FarmerCurrentStage createFarmerCurrentStage(
		long farmerCurrentStageId) {

		return farmerCurrentStagePersistence.create(farmerCurrentStageId);
	}

	/**
	 * Deletes the farmer current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage that was removed
	 * @throws PortalException if a farmer current stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FarmerCurrentStage deleteFarmerCurrentStage(
			long farmerCurrentStageId)
		throws PortalException {

		return farmerCurrentStagePersistence.remove(farmerCurrentStageId);
	}

	/**
	 * Deletes the farmer current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStage the farmer current stage
	 * @return the farmer current stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FarmerCurrentStage deleteFarmerCurrentStage(
		FarmerCurrentStage farmerCurrentStage) {

		return farmerCurrentStagePersistence.remove(farmerCurrentStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return farmerCurrentStagePersistence.dslQuery(dslQuery);
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
			FarmerCurrentStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return farmerCurrentStagePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCurrentStageModelImpl</code>.
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

		return farmerCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCurrentStageModelImpl</code>.
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

		return farmerCurrentStagePersistence.findWithDynamicQuery(
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
		return farmerCurrentStagePersistence.countWithDynamicQuery(
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

		return farmerCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public FarmerCurrentStage fetchFarmerCurrentStage(
		long farmerCurrentStageId) {

		return farmerCurrentStagePersistence.fetchByPrimaryKey(
			farmerCurrentStageId);
	}

	/**
	 * Returns the farmer current stage with the primary key.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage
	 * @throws PortalException if a farmer current stage with the primary key could not be found
	 */
	@Override
	public FarmerCurrentStage getFarmerCurrentStage(long farmerCurrentStageId)
		throws PortalException {

		return farmerCurrentStagePersistence.findByPrimaryKey(
			farmerCurrentStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			farmerCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FarmerCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"farmerCurrentStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			farmerCurrentStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(FarmerCurrentStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"farmerCurrentStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			farmerCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FarmerCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"farmerCurrentStageId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return farmerCurrentStagePersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return farmerCurrentStageLocalService.deleteFarmerCurrentStage(
			(FarmerCurrentStage)persistedModel);
	}

	@Override
	public BasePersistence<FarmerCurrentStage> getBasePersistence() {
		return farmerCurrentStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return farmerCurrentStagePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @return the range of farmer current stages
	 */
	@Override
	public List<FarmerCurrentStage> getFarmerCurrentStages(int start, int end) {
		return farmerCurrentStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of farmer current stages.
	 *
	 * @return the number of farmer current stages
	 */
	@Override
	public int getFarmerCurrentStagesCount() {
		return farmerCurrentStagePersistence.countAll();
	}

	/**
	 * Updates the farmer current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStage the farmer current stage
	 * @return the farmer current stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FarmerCurrentStage updateFarmerCurrentStage(
		FarmerCurrentStage farmerCurrentStage) {

		return farmerCurrentStagePersistence.update(farmerCurrentStage);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FarmerCurrentStageLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		farmerCurrentStageLocalService =
			(FarmerCurrentStageLocalService)aopProxy;

		_setLocalServiceUtilService(farmerCurrentStageLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FarmerCurrentStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FarmerCurrentStage.class;
	}

	protected String getModelClassName() {
		return FarmerCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				farmerCurrentStagePersistence.getDataSource();

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
		FarmerCurrentStageLocalService farmerCurrentStageLocalService) {

		try {
			Field field =
				FarmerCurrentStageLocalServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, farmerCurrentStageLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected FarmerApplicationPersistence farmerApplicationPersistence;

	@Reference
	protected FarmerCropPersistence farmerCropPersistence;

	@Reference
	protected FarmerCropPracticePersistence farmerCropPracticePersistence;

	protected FarmerCurrentStageLocalService farmerCurrentStageLocalService;

	@Reference
	protected FarmerCurrentStagePersistence farmerCurrentStagePersistence;

	@Reference
	protected FarmerLivestockPersistence farmerLivestockPersistence;

	@Reference
	protected FarmerlivestockPracticePersistence
		farmerlivestockPracticePersistence;

	@Reference
	protected FarmerProfilePersistence farmerProfilePersistence;

	@Reference
	protected FarmerPropertyPersistence farmerPropertyPersistence;

	@Reference
	protected FarmerStakeholderInfoPersistence farmerStakeholderInfoPersistence;

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