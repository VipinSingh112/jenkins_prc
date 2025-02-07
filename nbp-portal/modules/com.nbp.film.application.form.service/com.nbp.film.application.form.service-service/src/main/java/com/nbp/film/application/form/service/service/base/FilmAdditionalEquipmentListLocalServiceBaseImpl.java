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

import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;
import com.nbp.film.application.form.service.service.FilmAdditionalEquipmentListLocalService;
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
 * Provides the base implementation for the film additional equipment list local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.film.application.form.service.service.impl.FilmAdditionalEquipmentListLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.film.application.form.service.service.impl.FilmAdditionalEquipmentListLocalServiceImpl
 * @generated
 */
public abstract class FilmAdditionalEquipmentListLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, FilmAdditionalEquipmentListLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FilmAdditionalEquipmentListLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.film.application.form.service.service.FilmAdditionalEquipmentListLocalServiceUtil</code>.
	 */

	/**
	 * Adds the film additional equipment list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmAdditionalEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 * @return the film additional equipment list that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FilmAdditionalEquipmentList addFilmAdditionalEquipmentList(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		filmAdditionalEquipmentList.setNew(true);

		return filmAdditionalEquipmentListPersistence.update(
			filmAdditionalEquipmentList);
	}

	/**
	 * Creates a new film additional equipment list with the primary key. Does not add the film additional equipment list to the database.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key for the new film additional equipment list
	 * @return the new film additional equipment list
	 */
	@Override
	@Transactional(enabled = false)
	public FilmAdditionalEquipmentList createFilmAdditionalEquipmentList(
		long FilmAdditionalEquipmentListId) {

		return filmAdditionalEquipmentListPersistence.create(
			FilmAdditionalEquipmentListId);
	}

	/**
	 * Deletes the film additional equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmAdditionalEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list that was removed
	 * @throws PortalException if a film additional equipment list with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FilmAdditionalEquipmentList deleteFilmAdditionalEquipmentList(
			long FilmAdditionalEquipmentListId)
		throws PortalException {

		return filmAdditionalEquipmentListPersistence.remove(
			FilmAdditionalEquipmentListId);
	}

	/**
	 * Deletes the film additional equipment list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmAdditionalEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 * @return the film additional equipment list that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FilmAdditionalEquipmentList deleteFilmAdditionalEquipmentList(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		return filmAdditionalEquipmentListPersistence.remove(
			filmAdditionalEquipmentList);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return filmAdditionalEquipmentListPersistence.dslQuery(dslQuery);
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
			FilmAdditionalEquipmentList.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return filmAdditionalEquipmentListPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListModelImpl</code>.
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

		return filmAdditionalEquipmentListPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListModelImpl</code>.
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

		return filmAdditionalEquipmentListPersistence.findWithDynamicQuery(
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
		return filmAdditionalEquipmentListPersistence.countWithDynamicQuery(
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

		return filmAdditionalEquipmentListPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public FilmAdditionalEquipmentList fetchFilmAdditionalEquipmentList(
		long FilmAdditionalEquipmentListId) {

		return filmAdditionalEquipmentListPersistence.fetchByPrimaryKey(
			FilmAdditionalEquipmentListId);
	}

	/**
	 * Returns the film additional equipment list with the primary key.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list
	 * @throws PortalException if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList getFilmAdditionalEquipmentList(
			long FilmAdditionalEquipmentListId)
		throws PortalException {

		return filmAdditionalEquipmentListPersistence.findByPrimaryKey(
			FilmAdditionalEquipmentListId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			filmAdditionalEquipmentListLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FilmAdditionalEquipmentList.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"FilmAdditionalEquipmentListId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			filmAdditionalEquipmentListLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			FilmAdditionalEquipmentList.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"FilmAdditionalEquipmentListId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			filmAdditionalEquipmentListLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FilmAdditionalEquipmentList.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"FilmAdditionalEquipmentListId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return filmAdditionalEquipmentListPersistence.create(
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
				"Implement FilmAdditionalEquipmentListLocalServiceImpl#deleteFilmAdditionalEquipmentList(FilmAdditionalEquipmentList) to avoid orphaned data");
		}

		return filmAdditionalEquipmentListLocalService.
			deleteFilmAdditionalEquipmentList(
				(FilmAdditionalEquipmentList)persistedModel);
	}

	@Override
	public BasePersistence<FilmAdditionalEquipmentList> getBasePersistence() {
		return filmAdditionalEquipmentListPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return filmAdditionalEquipmentListPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the film additional equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @return the range of film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> getFilmAdditionalEquipmentLists(
		int start, int end) {

		return filmAdditionalEquipmentListPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of film additional equipment lists.
	 *
	 * @return the number of film additional equipment lists
	 */
	@Override
	public int getFilmAdditionalEquipmentListsCount() {
		return filmAdditionalEquipmentListPersistence.countAll();
	}

	/**
	 * Updates the film additional equipment list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FilmAdditionalEquipmentListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 * @return the film additional equipment list that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FilmAdditionalEquipmentList updateFilmAdditionalEquipmentList(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		return filmAdditionalEquipmentListPersistence.update(
			filmAdditionalEquipmentList);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FilmAdditionalEquipmentListLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		filmAdditionalEquipmentListLocalService =
			(FilmAdditionalEquipmentListLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FilmAdditionalEquipmentListLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FilmAdditionalEquipmentList.class;
	}

	protected String getModelClassName() {
		return FilmAdditionalEquipmentList.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				filmAdditionalEquipmentListPersistence.getDataSource();

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

	protected FilmAdditionalEquipmentListLocalService
		filmAdditionalEquipmentListLocalService;

	@Reference
	protected FilmAdditionalEquipmentListPersistence
		filmAdditionalEquipmentListPersistence;

	@Reference
	protected FilmApplicationPersistence filmApplicationPersistence;

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
		FilmAdditionalEquipmentListLocalServiceBaseImpl.class);

}