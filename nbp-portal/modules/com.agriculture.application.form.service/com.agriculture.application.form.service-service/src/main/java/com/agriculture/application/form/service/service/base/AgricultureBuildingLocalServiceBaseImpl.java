/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.base;

import com.agriculture.application.form.service.model.AgricultureBuilding;
import com.agriculture.application.form.service.service.AgricultureBuildingLocalService;
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
 * Provides the base implementation for the agriculture building local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.agriculture.application.form.service.service.impl.AgricultureBuildingLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.agriculture.application.form.service.service.impl.AgricultureBuildingLocalServiceImpl
 * @generated
 */
public abstract class AgricultureBuildingLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AgricultureBuildingLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AgricultureBuildingLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.agriculture.application.form.service.service.AgricultureBuildingLocalServiceUtil</code>.
	 */

	/**
	 * Adds the agriculture building to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureBuildingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureBuilding the agriculture building
	 * @return the agriculture building that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AgricultureBuilding addAgricultureBuilding(
		AgricultureBuilding agricultureBuilding) {

		agricultureBuilding.setNew(true);

		return agricultureBuildingPersistence.update(agricultureBuilding);
	}

	/**
	 * Creates a new agriculture building with the primary key. Does not add the agriculture building to the database.
	 *
	 * @param agricultureBuildingId the primary key for the new agriculture building
	 * @return the new agriculture building
	 */
	@Override
	@Transactional(enabled = false)
	public AgricultureBuilding createAgricultureBuilding(
		long agricultureBuildingId) {

		return agricultureBuildingPersistence.create(agricultureBuildingId);
	}

	/**
	 * Deletes the agriculture building with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureBuildingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building that was removed
	 * @throws PortalException if a agriculture building with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AgricultureBuilding deleteAgricultureBuilding(
			long agricultureBuildingId)
		throws PortalException {

		return agricultureBuildingPersistence.remove(agricultureBuildingId);
	}

	/**
	 * Deletes the agriculture building from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureBuildingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureBuilding the agriculture building
	 * @return the agriculture building that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AgricultureBuilding deleteAgricultureBuilding(
		AgricultureBuilding agricultureBuilding) {

		return agricultureBuildingPersistence.remove(agricultureBuilding);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return agricultureBuildingPersistence.dslQuery(dslQuery);
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
			AgricultureBuilding.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return agricultureBuildingPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureBuildingModelImpl</code>.
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

		return agricultureBuildingPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureBuildingModelImpl</code>.
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

		return agricultureBuildingPersistence.findWithDynamicQuery(
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
		return agricultureBuildingPersistence.countWithDynamicQuery(
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

		return agricultureBuildingPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AgricultureBuilding fetchAgricultureBuilding(
		long agricultureBuildingId) {

		return agricultureBuildingPersistence.fetchByPrimaryKey(
			agricultureBuildingId);
	}

	/**
	 * Returns the agriculture building with the primary key.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building
	 * @throws PortalException if a agriculture building with the primary key could not be found
	 */
	@Override
	public AgricultureBuilding getAgricultureBuilding(
			long agricultureBuildingId)
		throws PortalException {

		return agricultureBuildingPersistence.findByPrimaryKey(
			agricultureBuildingId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			agricultureBuildingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AgricultureBuilding.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"agricultureBuildingId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			agricultureBuildingLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			AgricultureBuilding.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"agricultureBuildingId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			agricultureBuildingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AgricultureBuilding.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"agricultureBuildingId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return agricultureBuildingPersistence.create(
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
				"Implement AgricultureBuildingLocalServiceImpl#deleteAgricultureBuilding(AgricultureBuilding) to avoid orphaned data");
		}

		return agricultureBuildingLocalService.deleteAgricultureBuilding(
			(AgricultureBuilding)persistedModel);
	}

	@Override
	public BasePersistence<AgricultureBuilding> getBasePersistence() {
		return agricultureBuildingPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return agricultureBuildingPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @return the range of agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> getAgricultureBuildings(
		int start, int end) {

		return agricultureBuildingPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of agriculture buildings.
	 *
	 * @return the number of agriculture buildings
	 */
	@Override
	public int getAgricultureBuildingsCount() {
		return agricultureBuildingPersistence.countAll();
	}

	/**
	 * Updates the agriculture building in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureBuildingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureBuilding the agriculture building
	 * @return the agriculture building that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AgricultureBuilding updateAgricultureBuilding(
		AgricultureBuilding agricultureBuilding) {

		return agricultureBuildingPersistence.update(agricultureBuilding);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AgricultureBuildingLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		agricultureBuildingLocalService =
			(AgricultureBuildingLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AgricultureBuildingLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AgricultureBuilding.class;
	}

	protected String getModelClassName() {
		return AgricultureBuilding.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				agricultureBuildingPersistence.getDataSource();

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

	protected AgricultureBuildingLocalService agricultureBuildingLocalService;

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
		AgricultureBuildingLocalServiceBaseImpl.class);

}