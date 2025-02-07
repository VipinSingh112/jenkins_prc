/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.base;

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

import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;
import com.nbp.factories.registration.application.form.services.service.FactoriesStandardActInfoLocalService;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesAppPaymentPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesApplicationRegistrationPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProcessedFoodActPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProductDetailsAddPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesRegstCurrentStagePersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesStandardActInfoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the factories standard act info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.factories.registration.application.form.services.service.impl.FactoriesStandardActInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.factories.registration.application.form.services.service.impl.FactoriesStandardActInfoLocalServiceImpl
 * @generated
 */
public abstract class FactoriesStandardActInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, FactoriesStandardActInfoLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FactoriesStandardActInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.factories.registration.application.form.services.service.FactoriesStandardActInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the factories standard act info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesStandardActInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 * @return the factories standard act info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FactoriesStandardActInfo addFactoriesStandardActInfo(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		factoriesStandardActInfo.setNew(true);

		return factoriesStandardActInfoPersistence.update(
			factoriesStandardActInfo);
	}

	/**
	 * Creates a new factories standard act info with the primary key. Does not add the factories standard act info to the database.
	 *
	 * @param factoriesStandardActId the primary key for the new factories standard act info
	 * @return the new factories standard act info
	 */
	@Override
	@Transactional(enabled = false)
	public FactoriesStandardActInfo createFactoriesStandardActInfo(
		long factoriesStandardActId) {

		return factoriesStandardActInfoPersistence.create(
			factoriesStandardActId);
	}

	/**
	 * Deletes the factories standard act info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesStandardActInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info that was removed
	 * @throws PortalException if a factories standard act info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FactoriesStandardActInfo deleteFactoriesStandardActInfo(
			long factoriesStandardActId)
		throws PortalException {

		return factoriesStandardActInfoPersistence.remove(
			factoriesStandardActId);
	}

	/**
	 * Deletes the factories standard act info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesStandardActInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 * @return the factories standard act info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FactoriesStandardActInfo deleteFactoriesStandardActInfo(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		return factoriesStandardActInfoPersistence.remove(
			factoriesStandardActInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return factoriesStandardActInfoPersistence.dslQuery(dslQuery);
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
			FactoriesStandardActInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return factoriesStandardActInfoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoModelImpl</code>.
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

		return factoriesStandardActInfoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoModelImpl</code>.
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

		return factoriesStandardActInfoPersistence.findWithDynamicQuery(
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
		return factoriesStandardActInfoPersistence.countWithDynamicQuery(
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

		return factoriesStandardActInfoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public FactoriesStandardActInfo fetchFactoriesStandardActInfo(
		long factoriesStandardActId) {

		return factoriesStandardActInfoPersistence.fetchByPrimaryKey(
			factoriesStandardActId);
	}

	/**
	 * Returns the factories standard act info with the primary key.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info
	 * @throws PortalException if a factories standard act info with the primary key could not be found
	 */
	@Override
	public FactoriesStandardActInfo getFactoriesStandardActInfo(
			long factoriesStandardActId)
		throws PortalException {

		return factoriesStandardActInfoPersistence.findByPrimaryKey(
			factoriesStandardActId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			factoriesStandardActInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FactoriesStandardActInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"factoriesStandardActId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			factoriesStandardActInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			FactoriesStandardActInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"factoriesStandardActId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			factoriesStandardActInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FactoriesStandardActInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"factoriesStandardActId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return factoriesStandardActInfoPersistence.create(
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
				"Implement FactoriesStandardActInfoLocalServiceImpl#deleteFactoriesStandardActInfo(FactoriesStandardActInfo) to avoid orphaned data");
		}

		return factoriesStandardActInfoLocalService.
			deleteFactoriesStandardActInfo(
				(FactoriesStandardActInfo)persistedModel);
	}

	@Override
	public BasePersistence<FactoriesStandardActInfo> getBasePersistence() {
		return factoriesStandardActInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return factoriesStandardActInfoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @return the range of factories standard act infos
	 */
	@Override
	public List<FactoriesStandardActInfo> getFactoriesStandardActInfos(
		int start, int end) {

		return factoriesStandardActInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of factories standard act infos.
	 *
	 * @return the number of factories standard act infos
	 */
	@Override
	public int getFactoriesStandardActInfosCount() {
		return factoriesStandardActInfoPersistence.countAll();
	}

	/**
	 * Updates the factories standard act info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesStandardActInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 * @return the factories standard act info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FactoriesStandardActInfo updateFactoriesStandardActInfo(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		return factoriesStandardActInfoPersistence.update(
			factoriesStandardActInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FactoriesStandardActInfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		factoriesStandardActInfoLocalService =
			(FactoriesStandardActInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FactoriesStandardActInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FactoriesStandardActInfo.class;
	}

	protected String getModelClassName() {
		return FactoriesStandardActInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				factoriesStandardActInfoPersistence.getDataSource();

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
	protected FactoriesApplicationRegistrationPersistence
		factoriesApplicationRegistrationPersistence;

	@Reference
	protected FactoriesAppPaymentPersistence factoriesAppPaymentPersistence;

	@Reference
	protected FactoriesProcessedFoodActPersistence
		factoriesProcessedFoodActPersistence;

	@Reference
	protected FactoriesProductDetailsAddPersistence
		factoriesProductDetailsAddPersistence;

	@Reference
	protected FactoriesRegstCurrentStagePersistence
		factoriesRegstCurrentStagePersistence;

	protected FactoriesStandardActInfoLocalService
		factoriesStandardActInfoLocalService;

	@Reference
	protected FactoriesStandardActInfoPersistence
		factoriesStandardActInfoPersistence;

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
		FactoriesStandardActInfoLocalServiceBaseImpl.class);

}