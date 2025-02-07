/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.base;

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

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppliCurrentStageLocalService;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeAppPaymentPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeAppliCurrentStagePersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeApplicationPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeCerPurposeInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeHazardousSubInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeMultFloorInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeOperatorDetailPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadePremisesInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeProEquipmentInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeSignatureInfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the fire brigade appli current stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeAppliCurrentStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeAppliCurrentStageLocalServiceImpl
 * @generated
 */
public abstract class FireBrigadeAppliCurrentStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, FireBrigadeAppliCurrentStageLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FireBrigadeAppliCurrentStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppliCurrentStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the fire brigade appli current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FireBrigadeAppliCurrentStage addFireBrigadeAppliCurrentStage(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		fireBrigadeAppliCurrentStage.setNew(true);

		return fireBrigadeAppliCurrentStagePersistence.update(
			fireBrigadeAppliCurrentStage);
	}

	/**
	 * Creates a new fire brigade appli current stage with the primary key. Does not add the fire brigade appli current stage to the database.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key for the new fire brigade appli current stage
	 * @return the new fire brigade appli current stage
	 */
	@Override
	@Transactional(enabled = false)
	public FireBrigadeAppliCurrentStage createFireBrigadeAppliCurrentStage(
		long fireBrigadeAppliCurrentStageId) {

		return fireBrigadeAppliCurrentStagePersistence.create(
			fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Deletes the fire brigade appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was removed
	 * @throws PortalException if a fire brigade appli current stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FireBrigadeAppliCurrentStage deleteFireBrigadeAppliCurrentStage(
			long fireBrigadeAppliCurrentStageId)
		throws PortalException {

		return fireBrigadeAppliCurrentStagePersistence.remove(
			fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Deletes the fire brigade appli current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FireBrigadeAppliCurrentStage deleteFireBrigadeAppliCurrentStage(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		return fireBrigadeAppliCurrentStagePersistence.remove(
			fireBrigadeAppliCurrentStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return fireBrigadeAppliCurrentStagePersistence.dslQuery(dslQuery);
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
			FireBrigadeAppliCurrentStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return fireBrigadeAppliCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppliCurrentStageModelImpl</code>.
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

		return fireBrigadeAppliCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppliCurrentStageModelImpl</code>.
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

		return fireBrigadeAppliCurrentStagePersistence.findWithDynamicQuery(
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
		return fireBrigadeAppliCurrentStagePersistence.countWithDynamicQuery(
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

		return fireBrigadeAppliCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public FireBrigadeAppliCurrentStage fetchFireBrigadeAppliCurrentStage(
		long fireBrigadeAppliCurrentStageId) {

		return fireBrigadeAppliCurrentStagePersistence.fetchByPrimaryKey(
			fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Returns the fire brigade appli current stage with the primary key.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage
	 * @throws PortalException if a fire brigade appli current stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage getFireBrigadeAppliCurrentStage(
			long fireBrigadeAppliCurrentStageId)
		throws PortalException {

		return fireBrigadeAppliCurrentStagePersistence.findByPrimaryKey(
			fireBrigadeAppliCurrentStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			fireBrigadeAppliCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			FireBrigadeAppliCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeAppliCurrentStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			fireBrigadeAppliCurrentStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			FireBrigadeAppliCurrentStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeAppliCurrentStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			fireBrigadeAppliCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(
			FireBrigadeAppliCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeAppliCurrentStageId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return fireBrigadeAppliCurrentStagePersistence.create(
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
				"Implement FireBrigadeAppliCurrentStageLocalServiceImpl#deleteFireBrigadeAppliCurrentStage(FireBrigadeAppliCurrentStage) to avoid orphaned data");
		}

		return fireBrigadeAppliCurrentStageLocalService.
			deleteFireBrigadeAppliCurrentStage(
				(FireBrigadeAppliCurrentStage)persistedModel);
	}

	@Override
	public BasePersistence<FireBrigadeAppliCurrentStage> getBasePersistence() {
		return fireBrigadeAppliCurrentStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return fireBrigadeAppliCurrentStagePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @return the range of fire brigade appli current stages
	 */
	@Override
	public List<FireBrigadeAppliCurrentStage> getFireBrigadeAppliCurrentStages(
		int start, int end) {

		return fireBrigadeAppliCurrentStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of fire brigade appli current stages.
	 *
	 * @return the number of fire brigade appli current stages
	 */
	@Override
	public int getFireBrigadeAppliCurrentStagesCount() {
		return fireBrigadeAppliCurrentStagePersistence.countAll();
	}

	/**
	 * Updates the fire brigade appli current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FireBrigadeAppliCurrentStage updateFireBrigadeAppliCurrentStage(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		return fireBrigadeAppliCurrentStagePersistence.update(
			fireBrigadeAppliCurrentStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FireBrigadeAppliCurrentStageLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		fireBrigadeAppliCurrentStageLocalService =
			(FireBrigadeAppliCurrentStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FireBrigadeAppliCurrentStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FireBrigadeAppliCurrentStage.class;
	}

	protected String getModelClassName() {
		return FireBrigadeAppliCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				fireBrigadeAppliCurrentStagePersistence.getDataSource();

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
	protected FireBrigadeApplicationPersistence
		fireBrigadeApplicationPersistence;

	protected FireBrigadeAppliCurrentStageLocalService
		fireBrigadeAppliCurrentStageLocalService;

	@Reference
	protected FireBrigadeAppliCurrentStagePersistence
		fireBrigadeAppliCurrentStagePersistence;

	@Reference
	protected FireBrigadeAppPaymentPersistence fireBrigadeAppPaymentPersistence;

	@Reference
	protected FireBrigadeCerPurposeInfoPersistence
		fireBrigadeCerPurposeInfoPersistence;

	@Reference
	protected FireBrigadeHazardousSubInfoPersistence
		fireBrigadeHazardousSubInfoPersistence;

	@Reference
	protected FireBrigadeMultFloorInfoPersistence
		fireBrigadeMultFloorInfoPersistence;

	@Reference
	protected FireBrigadeOperatorDetailPersistence
		fireBrigadeOperatorDetailPersistence;

	@Reference
	protected FireBrigadePremisesInfoPersistence
		fireBrigadePremisesInfoPersistence;

	@Reference
	protected FireBrigadeProEquipmentInfoPersistence
		fireBrigadeProEquipmentInfoPersistence;

	@Reference
	protected FireBrigadeSignatureInfoPersistence
		fireBrigadeSignatureInfoPersistence;

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
		FireBrigadeAppliCurrentStageLocalServiceBaseImpl.class);

}