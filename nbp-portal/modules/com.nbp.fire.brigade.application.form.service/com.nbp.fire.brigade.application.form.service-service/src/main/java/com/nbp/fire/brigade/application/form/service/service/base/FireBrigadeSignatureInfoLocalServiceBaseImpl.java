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

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalService;
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
 * Provides the base implementation for the fire brigade signature info local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeSignatureInfoLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeSignatureInfoLocalServiceImpl
 * @generated
 */
public abstract class FireBrigadeSignatureInfoLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, FireBrigadeSignatureInfoLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>FireBrigadeSignatureInfoLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.fire.brigade.application.form.service.service.FireBrigadeSignatureInfoLocalServiceUtil</code>.
	 */

	/**
	 * Adds the fire brigade signature info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeSignatureInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 * @return the fire brigade signature info that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FireBrigadeSignatureInfo addFireBrigadeSignatureInfo(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		fireBrigadeSignatureInfo.setNew(true);

		return fireBrigadeSignatureInfoPersistence.update(
			fireBrigadeSignatureInfo);
	}

	/**
	 * Creates a new fire brigade signature info with the primary key. Does not add the fire brigade signature info to the database.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key for the new fire brigade signature info
	 * @return the new fire brigade signature info
	 */
	@Override
	@Transactional(enabled = false)
	public FireBrigadeSignatureInfo createFireBrigadeSignatureInfo(
		long fireBrigadeSignatureInfoId) {

		return fireBrigadeSignatureInfoPersistence.create(
			fireBrigadeSignatureInfoId);
	}

	/**
	 * Deletes the fire brigade signature info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeSignatureInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info that was removed
	 * @throws PortalException if a fire brigade signature info with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FireBrigadeSignatureInfo deleteFireBrigadeSignatureInfo(
			long fireBrigadeSignatureInfoId)
		throws PortalException {

		return fireBrigadeSignatureInfoPersistence.remove(
			fireBrigadeSignatureInfoId);
	}

	/**
	 * Deletes the fire brigade signature info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeSignatureInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 * @return the fire brigade signature info that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public FireBrigadeSignatureInfo deleteFireBrigadeSignatureInfo(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		return fireBrigadeSignatureInfoPersistence.remove(
			fireBrigadeSignatureInfo);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return fireBrigadeSignatureInfoPersistence.dslQuery(dslQuery);
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
			FireBrigadeSignatureInfo.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return fireBrigadeSignatureInfoPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoModelImpl</code>.
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

		return fireBrigadeSignatureInfoPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoModelImpl</code>.
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

		return fireBrigadeSignatureInfoPersistence.findWithDynamicQuery(
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
		return fireBrigadeSignatureInfoPersistence.countWithDynamicQuery(
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

		return fireBrigadeSignatureInfoPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public FireBrigadeSignatureInfo fetchFireBrigadeSignatureInfo(
		long fireBrigadeSignatureInfoId) {

		return fireBrigadeSignatureInfoPersistence.fetchByPrimaryKey(
			fireBrigadeSignatureInfoId);
	}

	/**
	 * Returns the fire brigade signature info with the primary key.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info
	 * @throws PortalException if a fire brigade signature info with the primary key could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo getFireBrigadeSignatureInfo(
			long fireBrigadeSignatureInfoId)
		throws PortalException {

		return fireBrigadeSignatureInfoPersistence.findByPrimaryKey(
			fireBrigadeSignatureInfoId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			fireBrigadeSignatureInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FireBrigadeSignatureInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeSignatureInfoId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			fireBrigadeSignatureInfoLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			FireBrigadeSignatureInfo.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeSignatureInfoId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			fireBrigadeSignatureInfoLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(FireBrigadeSignatureInfo.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"fireBrigadeSignatureInfoId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return fireBrigadeSignatureInfoPersistence.create(
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
				"Implement FireBrigadeSignatureInfoLocalServiceImpl#deleteFireBrigadeSignatureInfo(FireBrigadeSignatureInfo) to avoid orphaned data");
		}

		return fireBrigadeSignatureInfoLocalService.
			deleteFireBrigadeSignatureInfo(
				(FireBrigadeSignatureInfo)persistedModel);
	}

	@Override
	public BasePersistence<FireBrigadeSignatureInfo> getBasePersistence() {
		return fireBrigadeSignatureInfoPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return fireBrigadeSignatureInfoPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @return the range of fire brigade signature infos
	 */
	@Override
	public List<FireBrigadeSignatureInfo> getFireBrigadeSignatureInfos(
		int start, int end) {

		return fireBrigadeSignatureInfoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of fire brigade signature infos.
	 *
	 * @return the number of fire brigade signature infos
	 */
	@Override
	public int getFireBrigadeSignatureInfosCount() {
		return fireBrigadeSignatureInfoPersistence.countAll();
	}

	/**
	 * Updates the fire brigade signature info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeSignatureInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 * @return the fire brigade signature info that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public FireBrigadeSignatureInfo updateFireBrigadeSignatureInfo(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		return fireBrigadeSignatureInfoPersistence.update(
			fireBrigadeSignatureInfo);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			FireBrigadeSignatureInfoLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		fireBrigadeSignatureInfoLocalService =
			(FireBrigadeSignatureInfoLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return FireBrigadeSignatureInfoLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return FireBrigadeSignatureInfo.class;
	}

	protected String getModelClassName() {
		return FireBrigadeSignatureInfo.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				fireBrigadeSignatureInfoPersistence.getDataSource();

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

	protected FireBrigadeSignatureInfoLocalService
		fireBrigadeSignatureInfoLocalService;

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
		FireBrigadeSignatureInfoLocalServiceBaseImpl.class);

}