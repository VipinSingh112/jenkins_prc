/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.base;

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

import com.nbp.hsra.stage.services.model.HsraApplicationDeskVeri;
import com.nbp.hsra.stage.services.service.HsraApplicationDeskVeriLocalService;
import com.nbp.hsra.stage.services.service.persistence.HSRAApplicationDueDiligencePersistence;
import com.nbp.hsra.stage.services.service.persistence.HSRAApplicationLicenseIssuancePersistence;
import com.nbp.hsra.stage.services.service.persistence.HSRAPaymentConfirmationPersistence;
import com.nbp.hsra.stage.services.service.persistence.HsraApplicationDeskVeriPersistence;
import com.nbp.hsra.stage.services.service.persistence.HsraApplicationStagesPersistence;
import com.nbp.hsra.stage.services.service.persistence.HsraInspectionPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the hsra application desk veri local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.hsra.stage.services.service.impl.HsraApplicationDeskVeriLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.hsra.stage.services.service.impl.HsraApplicationDeskVeriLocalServiceImpl
 * @generated
 */
public abstract class HsraApplicationDeskVeriLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, HsraApplicationDeskVeriLocalService,
			   IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>HsraApplicationDeskVeriLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.hsra.stage.services.service.HsraApplicationDeskVeriLocalServiceUtil</code>.
	 */

	/**
	 * Adds the hsra application desk veri to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 * @return the hsra application desk veri that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public HsraApplicationDeskVeri addHsraApplicationDeskVeri(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		hsraApplicationDeskVeri.setNew(true);

		return hsraApplicationDeskVeriPersistence.update(
			hsraApplicationDeskVeri);
	}

	/**
	 * Creates a new hsra application desk veri with the primary key. Does not add the hsra application desk veri to the database.
	 *
	 * @param hsraApplicationDeskVeriId the primary key for the new hsra application desk veri
	 * @return the new hsra application desk veri
	 */
	@Override
	@Transactional(enabled = false)
	public HsraApplicationDeskVeri createHsraApplicationDeskVeri(
		long hsraApplicationDeskVeriId) {

		return hsraApplicationDeskVeriPersistence.create(
			hsraApplicationDeskVeriId);
	}

	/**
	 * Deletes the hsra application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri that was removed
	 * @throws PortalException if a hsra application desk veri with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public HsraApplicationDeskVeri deleteHsraApplicationDeskVeri(
			long hsraApplicationDeskVeriId)
		throws PortalException {

		return hsraApplicationDeskVeriPersistence.remove(
			hsraApplicationDeskVeriId);
	}

	/**
	 * Deletes the hsra application desk veri from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 * @return the hsra application desk veri that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public HsraApplicationDeskVeri deleteHsraApplicationDeskVeri(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		return hsraApplicationDeskVeriPersistence.remove(
			hsraApplicationDeskVeri);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return hsraApplicationDeskVeriPersistence.dslQuery(dslQuery);
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
			HsraApplicationDeskVeri.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return hsraApplicationDeskVeriPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriModelImpl</code>.
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

		return hsraApplicationDeskVeriPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriModelImpl</code>.
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

		return hsraApplicationDeskVeriPersistence.findWithDynamicQuery(
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
		return hsraApplicationDeskVeriPersistence.countWithDynamicQuery(
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

		return hsraApplicationDeskVeriPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public HsraApplicationDeskVeri fetchHsraApplicationDeskVeri(
		long hsraApplicationDeskVeriId) {

		return hsraApplicationDeskVeriPersistence.fetchByPrimaryKey(
			hsraApplicationDeskVeriId);
	}

	/**
	 * Returns the hsra application desk veri with the primary key.
	 *
	 * @param hsraApplicationDeskVeriId the primary key of the hsra application desk veri
	 * @return the hsra application desk veri
	 * @throws PortalException if a hsra application desk veri with the primary key could not be found
	 */
	@Override
	public HsraApplicationDeskVeri getHsraApplicationDeskVeri(
			long hsraApplicationDeskVeriId)
		throws PortalException {

		return hsraApplicationDeskVeriPersistence.findByPrimaryKey(
			hsraApplicationDeskVeriId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			hsraApplicationDeskVeriLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(HsraApplicationDeskVeri.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"hsraApplicationDeskVeriId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			hsraApplicationDeskVeriLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			HsraApplicationDeskVeri.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"hsraApplicationDeskVeriId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			hsraApplicationDeskVeriLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(HsraApplicationDeskVeri.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"hsraApplicationDeskVeriId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return hsraApplicationDeskVeriPersistence.create(
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
				"Implement HsraApplicationDeskVeriLocalServiceImpl#deleteHsraApplicationDeskVeri(HsraApplicationDeskVeri) to avoid orphaned data");
		}

		return hsraApplicationDeskVeriLocalService.
			deleteHsraApplicationDeskVeri(
				(HsraApplicationDeskVeri)persistedModel);
	}

	@Override
	public BasePersistence<HsraApplicationDeskVeri> getBasePersistence() {
		return hsraApplicationDeskVeriPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return hsraApplicationDeskVeriPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the hsra application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application desk veris
	 * @param end the upper bound of the range of hsra application desk veris (not inclusive)
	 * @return the range of hsra application desk veris
	 */
	@Override
	public List<HsraApplicationDeskVeri> getHsraApplicationDeskVeris(
		int start, int end) {

		return hsraApplicationDeskVeriPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of hsra application desk veris.
	 *
	 * @return the number of hsra application desk veris
	 */
	@Override
	public int getHsraApplicationDeskVerisCount() {
		return hsraApplicationDeskVeriPersistence.countAll();
	}

	/**
	 * Updates the hsra application desk veri in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationDeskVeri the hsra application desk veri
	 * @return the hsra application desk veri that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public HsraApplicationDeskVeri updateHsraApplicationDeskVeri(
		HsraApplicationDeskVeri hsraApplicationDeskVeri) {

		return hsraApplicationDeskVeriPersistence.update(
			hsraApplicationDeskVeri);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			HsraApplicationDeskVeriLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		hsraApplicationDeskVeriLocalService =
			(HsraApplicationDeskVeriLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return HsraApplicationDeskVeriLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return HsraApplicationDeskVeri.class;
	}

	protected String getModelClassName() {
		return HsraApplicationDeskVeri.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				hsraApplicationDeskVeriPersistence.getDataSource();

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

	protected HsraApplicationDeskVeriLocalService
		hsraApplicationDeskVeriLocalService;

	@Reference
	protected HsraApplicationDeskVeriPersistence
		hsraApplicationDeskVeriPersistence;

	@Reference
	protected HSRAApplicationDueDiligencePersistence
		hsraApplicationDueDiligencePersistence;

	@Reference
	protected HSRAApplicationLicenseIssuancePersistence
		hsraApplicationLicenseIssuancePersistence;

	@Reference
	protected HsraApplicationStagesPersistence hsraApplicationStagesPersistence;

	@Reference
	protected HsraInspectionPersistence hsraInspectionPersistence;

	@Reference
	protected HSRAPaymentConfirmationPersistence
		hsraPaymentConfirmationPersistence;

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
		HsraApplicationDeskVeriLocalServiceBaseImpl.class);

}