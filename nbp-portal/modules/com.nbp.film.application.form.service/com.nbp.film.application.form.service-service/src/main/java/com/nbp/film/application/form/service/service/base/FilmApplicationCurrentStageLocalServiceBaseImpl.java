/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.base;

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

import com.nbp.film.application.form.service.model.FilmApplicationCurrentStage;
import com.nbp.film.application.form.service.service.FilmApplicationCurrentStageLocalService;
import com.nbp.film.application.form.service.service.persistence.FilmAdditionalEquipmentListPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationCurrentStagePersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationPaymentPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmCompanyDetailsPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmEquipmentListPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmOtherDetailsPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmProductionDetailsPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the film application current stage local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.film.application.form.service.service.impl.FilmApplicationCurrentStageLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.film.application.form.service.service.impl.FilmApplicationCurrentStageLocalServiceImpl
 * @generated
 */
public abstract class FilmApplicationCurrentStageLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, FilmApplicationCurrentStageLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FilmApplicationCurrentStageLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.film.application.form.service.service.FilmApplicationCurrentStageLocalServiceUtil</code>.
	 */

	/**
	 * Adds the film application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 * @return the film application current stage that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FilmApplicationCurrentStage addFilmApplicationCurrentStage(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		filmApplicationCurrentStage.setNew(true);

		return filmApplicationCurrentStagePersistence.update(
			filmApplicationCurrentStage);
	}

	/**
	 * Creates a new film application current stage with the primary key. Does not add the film application current stage to the database.
	 *
	 * @param filmApplicationCurrentStageId the primary key for the new film application current stage
	 * @return the new film application current stage
	 */
	@Override
	@Transactional(enabled = false)
	public FilmApplicationCurrentStage createFilmApplicationCurrentStage(
		long filmApplicationCurrentStageId) {

		return filmApplicationCurrentStagePersistence.create(
			filmApplicationCurrentStageId);
	}

	/**
	 * Deletes the film application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage that was removed
	 * @throws PortalException if a film application current stage with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FilmApplicationCurrentStage deleteFilmApplicationCurrentStage(
			long filmApplicationCurrentStageId)
		throws PortalException {

		return filmApplicationCurrentStagePersistence.remove(
			filmApplicationCurrentStageId);
	}

	/**
	 * Deletes the film application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 * @return the film application current stage that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FilmApplicationCurrentStage deleteFilmApplicationCurrentStage(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		return filmApplicationCurrentStagePersistence.remove(
			filmApplicationCurrentStage);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return filmApplicationCurrentStagePersistence.dslQuery(dslQuery);
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
			FilmApplicationCurrentStage.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return filmApplicationCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageModelImpl</code>.
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

		return filmApplicationCurrentStagePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageModelImpl</code>.
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

		return filmApplicationCurrentStagePersistence.findWithDynamicQuery(
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
		return filmApplicationCurrentStagePersistence.countWithDynamicQuery(
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

		return filmApplicationCurrentStagePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public FilmApplicationCurrentStage fetchFilmApplicationCurrentStage(
		long filmApplicationCurrentStageId) {

		return filmApplicationCurrentStagePersistence.fetchByPrimaryKey(
			filmApplicationCurrentStageId);
	}

	/**
	 * Returns the film application current stage with the primary key.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage
	 * @throws PortalException if a film application current stage with the primary key could not be found
	 */
	@Override
	public FilmApplicationCurrentStage getFilmApplicationCurrentStage(
			long filmApplicationCurrentStageId)
		throws PortalException {

		return filmApplicationCurrentStagePersistence.findByPrimaryKey(
			filmApplicationCurrentStageId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			filmApplicationCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FilmApplicationCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"filmApplicationCurrentStageId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			filmApplicationCurrentStageLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			FilmApplicationCurrentStage.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"filmApplicationCurrentStageId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			filmApplicationCurrentStageLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FilmApplicationCurrentStage.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"filmApplicationCurrentStageId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return filmApplicationCurrentStagePersistence.create(
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
				"Implement FilmApplicationCurrentStageLocalServiceImpl#deleteFilmApplicationCurrentStage(FilmApplicationCurrentStage) to avoid orphaned data");
		}

		return filmApplicationCurrentStageLocalService.
			deleteFilmApplicationCurrentStage(
				(FilmApplicationCurrentStage)persistedModel);
	}

	@Override
	public BasePersistence<FilmApplicationCurrentStage> getBasePersistence() {
		return filmApplicationCurrentStagePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return filmApplicationCurrentStagePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the film application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application current stages
	 * @param end the upper bound of the range of film application current stages (not inclusive)
	 * @return the range of film application current stages
	 */
	@Override
	public List<FilmApplicationCurrentStage> getFilmApplicationCurrentStages(
		int start, int end) {

		return filmApplicationCurrentStagePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of film application current stages.
	 *
	 * @return the number of film application current stages
	 */
	@Override
	public int getFilmApplicationCurrentStagesCount() {
		return filmApplicationCurrentStagePersistence.countAll();
	}

	/**
	 * Updates the film application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 * @return the film application current stage that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FilmApplicationCurrentStage updateFilmApplicationCurrentStage(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		return filmApplicationCurrentStagePersistence.update(
			filmApplicationCurrentStage);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FilmApplicationCurrentStageLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		filmApplicationCurrentStageLocalService =
			(FilmApplicationCurrentStageLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FilmApplicationCurrentStageLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FilmApplicationCurrentStage.class;
	}

	protected String getModelClassName() {
		return FilmApplicationCurrentStage.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				filmApplicationCurrentStagePersistence.getDataSource();

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
	protected FilmAdditionalEquipmentListPersistence
		filmAdditionalEquipmentListPersistence;

	@Reference
	protected FilmApplicationPersistence filmApplicationPersistence;

	protected FilmApplicationCurrentStageLocalService
		filmApplicationCurrentStageLocalService;

	@Reference
	protected FilmApplicationCurrentStagePersistence
		filmApplicationCurrentStagePersistence;

	@Reference
	protected FilmApplicationPaymentPersistence
		filmApplicationPaymentPersistence;

	@Reference
	protected FilmCompanyDetailsPersistence filmCompanyDetailsPersistence;

	@Reference
	protected FilmEquipmentListPersistence filmEquipmentListPersistence;

	@Reference
	protected FilmOtherDetailsPersistence filmOtherDetailsPersistence;

	@Reference
	protected FilmProductionDetailsPersistence filmProductionDetailsPersistence;

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
		FilmApplicationCurrentStageLocalServiceBaseImpl.class);

}