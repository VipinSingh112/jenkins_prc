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

package com.nbp.jadsc.stage.services.service.base;

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

import com.nbp.jadsc.stage.services.model.JadscAppliPreInitiation;
import com.nbp.jadsc.stage.services.service.JadscAppliPreInitiationLocalService;
import com.nbp.jadsc.stage.services.service.JadscAppliPreInitiationLocalServiceUtil;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliFinalDeterPersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliPreInitiationPersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliPreliminationDetePersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscAppliReviewAndValidPersistence;
import com.nbp.jadsc.stage.services.service.persistence.JadscApplicationStagePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the jadsc appli pre initiation local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.jadsc.stage.services.service.impl.JadscAppliPreInitiationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.jadsc.stage.services.service.impl.JadscAppliPreInitiationLocalServiceImpl
 * @generated
 */
public abstract class JadscAppliPreInitiationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   JadscAppliPreInitiationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>JadscAppliPreInitiationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>JadscAppliPreInitiationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the jadsc appli pre initiation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JadscAppliPreInitiation addJadscAppliPreInitiation(
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		jadscAppliPreInitiation.setNew(true);

		return jadscAppliPreInitiationPersistence.update(
			jadscAppliPreInitiation);
	}

	/**
	 * Creates a new jadsc appli pre initiation with the primary key. Does not add the jadsc appli pre initiation to the database.
	 *
	 * @param jadscAppliPreInitiationId the primary key for the new jadsc appli pre initiation
	 * @return the new jadsc appli pre initiation
	 */
	@Override
	@Transactional(enabled = false)
	public JadscAppliPreInitiation createJadscAppliPreInitiation(
		long jadscAppliPreInitiationId) {

		return jadscAppliPreInitiationPersistence.create(
			jadscAppliPreInitiationId);
	}

	/**
	 * Deletes the jadsc appli pre initiation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was removed
	 * @throws PortalException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JadscAppliPreInitiation deleteJadscAppliPreInitiation(
			long jadscAppliPreInitiationId)
		throws PortalException {

		return jadscAppliPreInitiationPersistence.remove(
			jadscAppliPreInitiationId);
	}

	/**
	 * Deletes the jadsc appli pre initiation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public JadscAppliPreInitiation deleteJadscAppliPreInitiation(
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		return jadscAppliPreInitiationPersistence.remove(
			jadscAppliPreInitiation);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return jadscAppliPreInitiationPersistence.dslQuery(dslQuery);
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
			JadscAppliPreInitiation.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return jadscAppliPreInitiationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreInitiationModelImpl</code>.
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

		return jadscAppliPreInitiationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreInitiationModelImpl</code>.
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

		return jadscAppliPreInitiationPersistence.findWithDynamicQuery(
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
		return jadscAppliPreInitiationPersistence.countWithDynamicQuery(
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

		return jadscAppliPreInitiationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public JadscAppliPreInitiation fetchJadscAppliPreInitiation(
		long jadscAppliPreInitiationId) {

		return jadscAppliPreInitiationPersistence.fetchByPrimaryKey(
			jadscAppliPreInitiationId);
	}

	/**
	 * Returns the jadsc appli pre initiation with the primary key.
	 *
	 * @param jadscAppliPreInitiationId the primary key of the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation
	 * @throws PortalException if a jadsc appli pre initiation with the primary key could not be found
	 */
	@Override
	public JadscAppliPreInitiation getJadscAppliPreInitiation(
			long jadscAppliPreInitiationId)
		throws PortalException {

		return jadscAppliPreInitiationPersistence.findByPrimaryKey(
			jadscAppliPreInitiationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			jadscAppliPreInitiationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JadscAppliPreInitiation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"jadscAppliPreInitiationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			jadscAppliPreInitiationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			JadscAppliPreInitiation.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"jadscAppliPreInitiationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			jadscAppliPreInitiationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(JadscAppliPreInitiation.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"jadscAppliPreInitiationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jadscAppliPreInitiationPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return jadscAppliPreInitiationLocalService.
			deleteJadscAppliPreInitiation(
				(JadscAppliPreInitiation)persistedModel);
	}

	@Override
	public BasePersistence<JadscAppliPreInitiation> getBasePersistence() {
		return jadscAppliPreInitiationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return jadscAppliPreInitiationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the jadsc appli pre initiations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreInitiationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli pre initiations
	 * @param end the upper bound of the range of jadsc appli pre initiations (not inclusive)
	 * @return the range of jadsc appli pre initiations
	 */
	@Override
	public List<JadscAppliPreInitiation> getJadscAppliPreInitiations(
		int start, int end) {

		return jadscAppliPreInitiationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of jadsc appli pre initiations.
	 *
	 * @return the number of jadsc appli pre initiations
	 */
	@Override
	public int getJadscAppliPreInitiationsCount() {
		return jadscAppliPreInitiationPersistence.countAll();
	}

	/**
	 * Updates the jadsc appli pre initiation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliPreInitiationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliPreInitiation the jadsc appli pre initiation
	 * @return the jadsc appli pre initiation that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public JadscAppliPreInitiation updateJadscAppliPreInitiation(
		JadscAppliPreInitiation jadscAppliPreInitiation) {

		return jadscAppliPreInitiationPersistence.update(
			jadscAppliPreInitiation);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			JadscAppliPreInitiationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		jadscAppliPreInitiationLocalService =
			(JadscAppliPreInitiationLocalService)aopProxy;

		_setLocalServiceUtilService(jadscAppliPreInitiationLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return JadscAppliPreInitiationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return JadscAppliPreInitiation.class;
	}

	protected String getModelClassName() {
		return JadscAppliPreInitiation.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				jadscAppliPreInitiationPersistence.getDataSource();

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
		JadscAppliPreInitiationLocalService
			jadscAppliPreInitiationLocalService) {

		try {
			Field field =
				JadscAppliPreInitiationLocalServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, jadscAppliPreInitiationLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected JadscApplicationStagePersistence jadscApplicationStagePersistence;

	@Reference
	protected JadscAppliFinalDeterPersistence jadscAppliFinalDeterPersistence;

	protected JadscAppliPreInitiationLocalService
		jadscAppliPreInitiationLocalService;

	@Reference
	protected JadscAppliPreInitiationPersistence
		jadscAppliPreInitiationPersistence;

	@Reference
	protected JadscAppliPreliminationDetePersistence
		jadscAppliPreliminationDetePersistence;

	@Reference
	protected JadscAppliReviewAndValidPersistence
		jadscAppliReviewAndValidPersistence;

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