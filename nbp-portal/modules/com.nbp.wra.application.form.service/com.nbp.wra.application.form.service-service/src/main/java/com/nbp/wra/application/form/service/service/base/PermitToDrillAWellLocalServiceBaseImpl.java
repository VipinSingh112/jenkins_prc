/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.base;

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

import com.nbp.wra.application.form.service.model.PermitToDrillAWell;
import com.nbp.wra.application.form.service.service.PermitToDrillAWellLocalService;
import com.nbp.wra.application.form.service.service.persistence.LicenceToAbstractInfoPersistence;
import com.nbp.wra.application.form.service.service.persistence.LicenceToWellDrillerPersistence;
import com.nbp.wra.application.form.service.service.persistence.PermitToDrillAWellPersistence;
import com.nbp.wra.application.form.service.service.persistence.RenewLicAbstractAndWaterPersistence;
import com.nbp.wra.application.form.service.service.persistence.WRAAppCurrentStagePersistence;
import com.nbp.wra.application.form.service.service.persistence.WRAAppPaymentPersistence;
import com.nbp.wra.application.form.service.service.persistence.WRAApplicationPersistence;
import com.nbp.wra.application.form.service.service.persistence.WRAReqIrrigationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the permit to drill a well local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.wra.application.form.service.service.impl.PermitToDrillAWellLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.wra.application.form.service.service.impl.PermitToDrillAWellLocalServiceImpl
 * @generated
 */
public abstract class PermitToDrillAWellLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   PermitToDrillAWellLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PermitToDrillAWellLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.wra.application.form.service.service.PermitToDrillAWellLocalServiceUtil</code>.
	 */

	/**
	 * Adds the permit to drill a well to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PermitToDrillAWell addPermitToDrillAWell(
		PermitToDrillAWell permitToDrillAWell) {

		permitToDrillAWell.setNew(true);

		return permitToDrillAWellPersistence.update(permitToDrillAWell);
	}

	/**
	 * Creates a new permit to drill a well with the primary key. Does not add the permit to drill a well to the database.
	 *
	 * @param drillAWellApplicationId the primary key for the new permit to drill a well
	 * @return the new permit to drill a well
	 */
	@Override
	@Transactional(enabled = false)
	public PermitToDrillAWell createPermitToDrillAWell(
		long drillAWellApplicationId) {

		return permitToDrillAWellPersistence.create(drillAWellApplicationId);
	}

	/**
	 * Deletes the permit to drill a well with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well that was removed
	 * @throws PortalException if a permit to drill a well with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PermitToDrillAWell deletePermitToDrillAWell(
			long drillAWellApplicationId)
		throws PortalException {

		return permitToDrillAWellPersistence.remove(drillAWellApplicationId);
	}

	/**
	 * Deletes the permit to drill a well from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PermitToDrillAWell deletePermitToDrillAWell(
		PermitToDrillAWell permitToDrillAWell) {

		return permitToDrillAWellPersistence.remove(permitToDrillAWell);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return permitToDrillAWellPersistence.dslQuery(dslQuery);
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
			PermitToDrillAWell.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return permitToDrillAWellPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
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

		return permitToDrillAWellPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
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

		return permitToDrillAWellPersistence.findWithDynamicQuery(
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
		return permitToDrillAWellPersistence.countWithDynamicQuery(
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

		return permitToDrillAWellPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public PermitToDrillAWell fetchPermitToDrillAWell(
		long drillAWellApplicationId) {

		return permitToDrillAWellPersistence.fetchByPrimaryKey(
			drillAWellApplicationId);
	}

	/**
	 * Returns the permit to drill a well with the primary key.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well
	 * @throws PortalException if a permit to drill a well with the primary key could not be found
	 */
	@Override
	public PermitToDrillAWell getPermitToDrillAWell(
			long drillAWellApplicationId)
		throws PortalException {

		return permitToDrillAWellPersistence.findByPrimaryKey(
			drillAWellApplicationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			permitToDrillAWellLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PermitToDrillAWell.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"drillAWellApplicationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			permitToDrillAWellLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(PermitToDrillAWell.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"drillAWellApplicationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			permitToDrillAWellLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PermitToDrillAWell.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"drillAWellApplicationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return permitToDrillAWellPersistence.create(
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
				"Implement PermitToDrillAWellLocalServiceImpl#deletePermitToDrillAWell(PermitToDrillAWell) to avoid orphaned data");
		}

		return permitToDrillAWellLocalService.deletePermitToDrillAWell(
			(PermitToDrillAWell)persistedModel);
	}

	@Override
	public BasePersistence<PermitToDrillAWell> getBasePersistence() {
		return permitToDrillAWellPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return permitToDrillAWellPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @return the range of permit to drill a wells
	 */
	@Override
	public List<PermitToDrillAWell> getPermitToDrillAWells(int start, int end) {
		return permitToDrillAWellPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of permit to drill a wells.
	 *
	 * @return the number of permit to drill a wells
	 */
	@Override
	public int getPermitToDrillAWellsCount() {
		return permitToDrillAWellPersistence.countAll();
	}

	/**
	 * Updates the permit to drill a well in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PermitToDrillAWell updatePermitToDrillAWell(
		PermitToDrillAWell permitToDrillAWell) {

		return permitToDrillAWellPersistence.update(permitToDrillAWell);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PermitToDrillAWellLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		permitToDrillAWellLocalService =
			(PermitToDrillAWellLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PermitToDrillAWellLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PermitToDrillAWell.class;
	}

	protected String getModelClassName() {
		return PermitToDrillAWell.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				permitToDrillAWellPersistence.getDataSource();

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
	protected LicenceToAbstractInfoPersistence licenceToAbstractInfoPersistence;

	@Reference
	protected LicenceToWellDrillerPersistence licenceToWellDrillerPersistence;

	protected PermitToDrillAWellLocalService permitToDrillAWellLocalService;

	@Reference
	protected PermitToDrillAWellPersistence permitToDrillAWellPersistence;

	@Reference
	protected RenewLicAbstractAndWaterPersistence
		renewLicAbstractAndWaterPersistence;

	@Reference
	protected WRAAppCurrentStagePersistence wraAppCurrentStagePersistence;

	@Reference
	protected WRAApplicationPersistence wraApplicationPersistence;

	@Reference
	protected WRAAppPaymentPersistence wraAppPaymentPersistence;

	@Reference
	protected WRAReqIrrigationPersistence wraReqIrrigationPersistence;

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
		PermitToDrillAWellLocalServiceBaseImpl.class);

}