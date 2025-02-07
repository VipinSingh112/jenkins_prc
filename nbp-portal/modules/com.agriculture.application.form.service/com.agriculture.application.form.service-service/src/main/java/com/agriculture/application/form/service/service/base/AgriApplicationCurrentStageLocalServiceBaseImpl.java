/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.base;

import com.agriculture.application.form.service.model.AgriApplicationCurrentStage;
import com.agriculture.application.form.service.service.AgriApplicationCurrentStageLocalService;
import com.agriculture.application.form.service.service.persistence.AgriApplicationCurrentStagePersistence;
import com.agriculture.application.form.service.service.persistence.AgricultueFarmerPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureApiculturePersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureApplicationPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureAquaculturePersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureBuildingPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureCropPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureFarmPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureLivestockPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureOrnamentalPersistence;
import com.agriculture.application.form.service.service.persistence.AgriculturePoultryPersistence;
import com.agriculture.application.form.service.service.persistence.AgriultureForestryPersistence;

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

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the agri application current stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.agriculture.application.form.service.service.impl.AgriApplicationCurrentStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.agriculture.application.form.service.service.impl.AgriApplicationCurrentStageLocalServiceImpl
 * @generated
 */
public abstract class AgriApplicationCurrentStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AgriApplicationCurrentStageLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AgriApplicationCurrentStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.agriculture.application.form.service.service.AgriApplicationCurrentStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the agri application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 * @return the agri application current stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AgriApplicationCurrentStage addAgriApplicationCurrentStage(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		agriApplicationCurrentStage.setNew(true);

		return agriApplicationCurrentStagePersistence.update(
			agriApplicationCurrentStage);
	}

	/**
	 * Creates a new agri application current stage with the primary key. Does not add the agri application current stage to the database.
	 *
	 * @param agriApplicationCurrentStageId the primary key for the new agri application current stage
	 * @return the new agri application current stage
	 */
	@Override
	@Transactional(enabled = false)
	public AgriApplicationCurrentStage createAgriApplicationCurrentStage(
		long agriApplicationCurrentStageId) {

		return agriApplicationCurrentStagePersistence.create(
			agriApplicationCurrentStageId);
	}

	/**
	 * Deletes the agri application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage that was removed
	 * @throws PortalException if a agri application current stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AgriApplicationCurrentStage deleteAgriApplicationCurrentStage(
			long agriApplicationCurrentStageId)
		throws PortalException {

		return agriApplicationCurrentStagePersistence.remove(
			agriApplicationCurrentStageId);
	}

	/**
	 * Deletes the agri application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 * @return the agri application current stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AgriApplicationCurrentStage deleteAgriApplicationCurrentStage(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		return agriApplicationCurrentStagePersistence.remove(
			agriApplicationCurrentStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return agriApplicationCurrentStagePersistence.dslQuery(dslQuery);
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
			AgriApplicationCurrentStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return agriApplicationCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageModelImpl</code>.
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

		return agriApplicationCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageModelImpl</code>.
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

		return agriApplicationCurrentStagePersistence.findWithDynamicQuery(
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
		return agriApplicationCurrentStagePersistence.countWithDynamicQuery(
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

		return agriApplicationCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AgriApplicationCurrentStage fetchAgriApplicationCurrentStage(
		long agriApplicationCurrentStageId) {

		return agriApplicationCurrentStagePersistence.fetchByPrimaryKey(
			agriApplicationCurrentStageId);
	}

	/**
	 * Returns the agri application current stage with the primary key.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage
	 * @throws PortalException if a agri application current stage with the primary key could not be found
	 */
	@Override
	public AgriApplicationCurrentStage getAgriApplicationCurrentStage(
			long agriApplicationCurrentStageId)
		throws PortalException {

		return agriApplicationCurrentStagePersistence.findByPrimaryKey(
			agriApplicationCurrentStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			agriApplicationCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AgriApplicationCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"agriApplicationCurrentStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			agriApplicationCurrentStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			AgriApplicationCurrentStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"agriApplicationCurrentStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			agriApplicationCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AgriApplicationCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"agriApplicationCurrentStageId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return agriApplicationCurrentStagePersistence.create(
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
				"Implement AgriApplicationCurrentStageLocalServiceImpl#deleteAgriApplicationCurrentStage(AgriApplicationCurrentStage) to avoid orphaned data");
		}

		return agriApplicationCurrentStageLocalService.
			deleteAgriApplicationCurrentStage(
				(AgriApplicationCurrentStage)persistedModel);
	}

	@Override
	public BasePersistence<AgriApplicationCurrentStage> getBasePersistence() {
		return agriApplicationCurrentStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return agriApplicationCurrentStagePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @return the range of agri application current stages
	 */
	@Override
	public List<AgriApplicationCurrentStage> getAgriApplicationCurrentStages(
		int start, int end) {

		return agriApplicationCurrentStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of agri application current stages.
	 *
	 * @return the number of agri application current stages
	 */
	@Override
	public int getAgriApplicationCurrentStagesCount() {
		return agriApplicationCurrentStagePersistence.countAll();
	}

	/**
	 * Updates the agri application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 * @return the agri application current stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AgriApplicationCurrentStage updateAgriApplicationCurrentStage(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		return agriApplicationCurrentStagePersistence.update(
			agriApplicationCurrentStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AgriApplicationCurrentStageLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		agriApplicationCurrentStageLocalService =
			(AgriApplicationCurrentStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AgriApplicationCurrentStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AgriApplicationCurrentStage.class;
	}

	protected String getModelClassName() {
		return AgriApplicationCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				agriApplicationCurrentStagePersistence.getDataSource();

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

	protected AgriApplicationCurrentStageLocalService
		agriApplicationCurrentStageLocalService;

	@Reference
	protected AgriApplicationCurrentStagePersistence
		agriApplicationCurrentStagePersistence;

	@Reference
	protected AgricultueFarmerPersistence agricultueFarmerPersistence;

	@Reference
	protected AgricultureApiculturePersistence agricultureApiculturePersistence;

	@Reference
	protected AgricultureApplicationPersistence
		agricultureApplicationPersistence;

	@Reference
	protected AgricultureAquaculturePersistence
		agricultureAquaculturePersistence;

	@Reference
	protected AgricultureBuildingPersistence agricultureBuildingPersistence;

	@Reference
	protected AgricultureCropPersistence agricultureCropPersistence;

	@Reference
	protected AgricultureFarmPersistence agricultureFarmPersistence;

	@Reference
	protected AgricultureLivestockPersistence agricultureLivestockPersistence;

	@Reference
	protected AgricultureOrnamentalPersistence agricultureOrnamentalPersistence;

	@Reference
	protected AgriculturePoultryPersistence agriculturePoultryPersistence;

	@Reference
	protected AgriultureForestryPersistence agriultureForestryPersistence;

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
		AgriApplicationCurrentStageLocalServiceBaseImpl.class);

}