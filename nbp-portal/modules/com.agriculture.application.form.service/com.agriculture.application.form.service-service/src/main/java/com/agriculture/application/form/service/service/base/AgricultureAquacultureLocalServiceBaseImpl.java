/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.base;

import com.agriculture.application.form.service.model.AgricultureAquaculture;
import com.agriculture.application.form.service.service.AgricultureAquacultureLocalService;
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
 * Provides the base implementation for the agriculture aquaculture local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.agriculture.application.form.service.service.impl.AgricultureAquacultureLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.agriculture.application.form.service.service.impl.AgricultureAquacultureLocalServiceImpl
 * @generated
 */
public abstract class AgricultureAquacultureLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AgricultureAquacultureLocalService, AopService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>AgricultureAquacultureLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.agriculture.application.form.service.service.AgricultureAquacultureLocalServiceUtil</code>.
	 */

	/**
	 * Adds the agriculture aquaculture to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AgricultureAquaculture addAgricultureAquaculture(
		AgricultureAquaculture agricultureAquaculture) {

		agricultureAquaculture.setNew(true);

		return agricultureAquaculturePersistence.update(agricultureAquaculture);
	}

	/**
	 * Creates a new agriculture aquaculture with the primary key. Does not add the agriculture aquaculture to the database.
	 *
	 * @param agricultureAquacultureId the primary key for the new agriculture aquaculture
	 * @return the new agriculture aquaculture
	 */
	@Override
	@Transactional(enabled = false)
	public AgricultureAquaculture createAgricultureAquaculture(
		long agricultureAquacultureId) {

		return agricultureAquaculturePersistence.create(
			agricultureAquacultureId);
	}

	/**
	 * Deletes the agriculture aquaculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 * @throws PortalException if a agriculture aquaculture with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AgricultureAquaculture deleteAgricultureAquaculture(
			long agricultureAquacultureId)
		throws PortalException {

		return agricultureAquaculturePersistence.remove(
			agricultureAquacultureId);
	}

	/**
	 * Deletes the agriculture aquaculture from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AgricultureAquaculture deleteAgricultureAquaculture(
		AgricultureAquaculture agricultureAquaculture) {

		return agricultureAquaculturePersistence.remove(agricultureAquaculture);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return agricultureAquaculturePersistence.dslQuery(dslQuery);
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
			AgricultureAquaculture.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return agricultureAquaculturePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
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

		return agricultureAquaculturePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
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

		return agricultureAquaculturePersistence.findWithDynamicQuery(
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
		return agricultureAquaculturePersistence.countWithDynamicQuery(
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

		return agricultureAquaculturePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public AgricultureAquaculture fetchAgricultureAquaculture(
		long agricultureAquacultureId) {

		return agricultureAquaculturePersistence.fetchByPrimaryKey(
			agricultureAquacultureId);
	}

	/**
	 * Returns the agriculture aquaculture with the primary key.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture
	 * @throws PortalException if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public AgricultureAquaculture getAgricultureAquaculture(
			long agricultureAquacultureId)
		throws PortalException {

		return agricultureAquaculturePersistence.findByPrimaryKey(
			agricultureAquacultureId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			agricultureAquacultureLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AgricultureAquaculture.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"agricultureAquacultureId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			agricultureAquacultureLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			AgricultureAquaculture.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"agricultureAquacultureId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			agricultureAquacultureLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AgricultureAquaculture.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"agricultureAquacultureId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return agricultureAquaculturePersistence.create(
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
				"Implement AgricultureAquacultureLocalServiceImpl#deleteAgricultureAquaculture(AgricultureAquaculture) to avoid orphaned data");
		}

		return agricultureAquacultureLocalService.deleteAgricultureAquaculture(
			(AgricultureAquaculture)persistedModel);
	}

	@Override
	public BasePersistence<AgricultureAquaculture> getBasePersistence() {
		return agricultureAquaculturePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return agricultureAquaculturePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> getAgricultureAquacultures(
		int start, int end) {

		return agricultureAquaculturePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of agriculture aquacultures.
	 *
	 * @return the number of agriculture aquacultures
	 */
	@Override
	public int getAgricultureAquaculturesCount() {
		return agricultureAquaculturePersistence.countAll();
	}

	/**
	 * Updates the agriculture aquaculture in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureAquacultureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 * @return the agriculture aquaculture that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AgricultureAquaculture updateAgricultureAquaculture(
		AgricultureAquaculture agricultureAquaculture) {

		return agricultureAquaculturePersistence.update(agricultureAquaculture);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			AgricultureAquacultureLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		agricultureAquacultureLocalService =
			(AgricultureAquacultureLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AgricultureAquacultureLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AgricultureAquaculture.class;
	}

	protected String getModelClassName() {
		return AgricultureAquaculture.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				agricultureAquaculturePersistence.getDataSource();

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

	protected AgricultureAquacultureLocalService
		agricultureAquacultureLocalService;

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
		AgricultureAquacultureLocalServiceBaseImpl.class);

}