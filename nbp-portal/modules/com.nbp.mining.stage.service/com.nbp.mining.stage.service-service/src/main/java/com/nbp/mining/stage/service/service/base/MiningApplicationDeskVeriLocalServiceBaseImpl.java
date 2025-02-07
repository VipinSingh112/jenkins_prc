/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.base;

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

import com.nbp.mining.stage.service.model.MiningApplicationDeskVeri;
import com.nbp.mining.stage.service.service.MiningApplicationDeskVeriLocalService;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationCertificateIssuancePersistence;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationDeskVeriPersistence;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationDueDiligencePersistence;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationMinisterialDecisionPersistence;
import com.nbp.mining.stage.service.service.persistence.MiningApplicationStagesPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the mining application desk veri local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.mining.stage.service.service.impl.MiningApplicationDeskVeriLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.mining.stage.service.service.impl.MiningApplicationDeskVeriLocalServiceImpl
 * @generated
 */
public abstract class MiningApplicationDeskVeriLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MiningApplicationDeskVeriLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MiningApplicationDeskVeriLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.mining.stage.service.service.MiningApplicationDeskVeriLocalServiceUtil</code>.
	 */

	/**
	 * Adds the mining application desk veri to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 * @return the mining application desk veri that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MiningApplicationDeskVeri addMiningApplicationDeskVeri(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		miningApplicationDeskVeri.setNew(true);

		return miningApplicationDeskVeriPersistence.update(
			miningApplicationDeskVeri);
	}

	/**
	 * Creates a new mining application desk veri with the primary key. Does not add the mining application desk veri to the database.
	 *
	 * @param miningDeskVeriId the primary key for the new mining application desk veri
	 * @return the new mining application desk veri
	 */
	@Override
	@Transactional(enabled = false)
	public MiningApplicationDeskVeri createMiningApplicationDeskVeri(
		long miningDeskVeriId) {

		return miningApplicationDeskVeriPersistence.create(miningDeskVeriId);
	}

	/**
	 * Deletes the mining application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri that was removed
	 * @throws PortalException if a mining application desk veri with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MiningApplicationDeskVeri deleteMiningApplicationDeskVeri(
			long miningDeskVeriId)
		throws PortalException {

		return miningApplicationDeskVeriPersistence.remove(miningDeskVeriId);
	}

	/**
	 * Deletes the mining application desk veri from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 * @return the mining application desk veri that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MiningApplicationDeskVeri deleteMiningApplicationDeskVeri(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		return miningApplicationDeskVeriPersistence.remove(
			miningApplicationDeskVeri);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return miningApplicationDeskVeriPersistence.dslQuery(dslQuery);
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
			MiningApplicationDeskVeri.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return miningApplicationDeskVeriPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriModelImpl</code>.
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

		return miningApplicationDeskVeriPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriModelImpl</code>.
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

		return miningApplicationDeskVeriPersistence.findWithDynamicQuery(
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
		return miningApplicationDeskVeriPersistence.countWithDynamicQuery(
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

		return miningApplicationDeskVeriPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MiningApplicationDeskVeri fetchMiningApplicationDeskVeri(
		long miningDeskVeriId) {

		return miningApplicationDeskVeriPersistence.fetchByPrimaryKey(
			miningDeskVeriId);
	}

	/**
	 * Returns the mining application desk veri with the primary key.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri
	 * @throws PortalException if a mining application desk veri with the primary key could not be found
	 */
	@Override
	public MiningApplicationDeskVeri getMiningApplicationDeskVeri(
			long miningDeskVeriId)
		throws PortalException {

		return miningApplicationDeskVeriPersistence.findByPrimaryKey(
			miningDeskVeriId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			miningApplicationDeskVeriLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MiningApplicationDeskVeri.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("miningDeskVeriId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			miningApplicationDeskVeriLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			MiningApplicationDeskVeri.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"miningDeskVeriId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			miningApplicationDeskVeriLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MiningApplicationDeskVeri.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("miningDeskVeriId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return miningApplicationDeskVeriPersistence.create(
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
				"Implement MiningApplicationDeskVeriLocalServiceImpl#deleteMiningApplicationDeskVeri(MiningApplicationDeskVeri) to avoid orphaned data");
		}

		return miningApplicationDeskVeriLocalService.
			deleteMiningApplicationDeskVeri(
				(MiningApplicationDeskVeri)persistedModel);
	}

	@Override
	public BasePersistence<MiningApplicationDeskVeri> getBasePersistence() {
		return miningApplicationDeskVeriPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return miningApplicationDeskVeriPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @return the range of mining application desk veris
	 */
	@Override
	public List<MiningApplicationDeskVeri> getMiningApplicationDeskVeris(
		int start, int end) {

		return miningApplicationDeskVeriPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of mining application desk veris.
	 *
	 * @return the number of mining application desk veris
	 */
	@Override
	public int getMiningApplicationDeskVerisCount() {
		return miningApplicationDeskVeriPersistence.countAll();
	}

	/**
	 * Updates the mining application desk veri in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 * @return the mining application desk veri that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MiningApplicationDeskVeri updateMiningApplicationDeskVeri(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		return miningApplicationDeskVeriPersistence.update(
			miningApplicationDeskVeri);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MiningApplicationDeskVeriLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		miningApplicationDeskVeriLocalService =
			(MiningApplicationDeskVeriLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MiningApplicationDeskVeriLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MiningApplicationDeskVeri.class;
	}

	protected String getModelClassName() {
		return MiningApplicationDeskVeri.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				miningApplicationDeskVeriPersistence.getDataSource();

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
	protected MiningApplicationCertificateIssuancePersistence
		miningApplicationCertificateIssuancePersistence;

	protected MiningApplicationDeskVeriLocalService
		miningApplicationDeskVeriLocalService;

	@Reference
	protected MiningApplicationDeskVeriPersistence
		miningApplicationDeskVeriPersistence;

	@Reference
	protected MiningApplicationDueDiligencePersistence
		miningApplicationDueDiligencePersistence;

	@Reference
	protected MiningApplicationMinisterialDecisionPersistence
		miningApplicationMinisterialDecisionPersistence;

	@Reference
	protected MiningApplicationStagesPersistence
		miningApplicationStagesPersistence;

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
		MiningApplicationDeskVeriLocalServiceBaseImpl.class);

}