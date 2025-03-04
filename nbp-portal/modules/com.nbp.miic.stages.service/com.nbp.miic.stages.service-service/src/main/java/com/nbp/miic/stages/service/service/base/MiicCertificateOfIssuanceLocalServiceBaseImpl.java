/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.base;

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

import com.nbp.miic.stages.service.model.MiicCertificateOfIssuance;
import com.nbp.miic.stages.service.service.MiicCertificateOfIssuanceLocalService;
import com.nbp.miic.stages.service.service.persistence.MiicApplicationStagesPersistence;
import com.nbp.miic.stages.service.service.persistence.MiicCertificateOfIssuancePersistence;
import com.nbp.miic.stages.service.service.persistence.MiicRecommendationsDecisionPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the miic certificate of issuance local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.miic.stages.service.service.impl.MiicCertificateOfIssuanceLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.miic.stages.service.service.impl.MiicCertificateOfIssuanceLocalServiceImpl
 * @generated
 */
public abstract class MiicCertificateOfIssuanceLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   MiicCertificateOfIssuanceLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MiicCertificateOfIssuanceLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.miic.stages.service.service.MiicCertificateOfIssuanceLocalServiceUtil</code>.
	 */

	/**
	 * Adds the miic certificate of issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MiicCertificateOfIssuance addMiicCertificateOfIssuance(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		miicCertificateOfIssuance.setNew(true);

		return miicCertificateOfIssuancePersistence.update(
			miicCertificateOfIssuance);
	}

	/**
	 * Creates a new miic certificate of issuance with the primary key. Does not add the miic certificate of issuance to the database.
	 *
	 * @param miicCertificateOfIssuanceId the primary key for the new miic certificate of issuance
	 * @return the new miic certificate of issuance
	 */
	@Override
	@Transactional(enabled = false)
	public MiicCertificateOfIssuance createMiicCertificateOfIssuance(
		long miicCertificateOfIssuanceId) {

		return miicCertificateOfIssuancePersistence.create(
			miicCertificateOfIssuanceId);
	}

	/**
	 * Deletes the miic certificate of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 * @throws PortalException if a miic certificate of issuance with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MiicCertificateOfIssuance deleteMiicCertificateOfIssuance(
			long miicCertificateOfIssuanceId)
		throws PortalException {

		return miicCertificateOfIssuancePersistence.remove(
			miicCertificateOfIssuanceId);
	}

	/**
	 * Deletes the miic certificate of issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MiicCertificateOfIssuance deleteMiicCertificateOfIssuance(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		return miicCertificateOfIssuancePersistence.remove(
			miicCertificateOfIssuance);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return miicCertificateOfIssuancePersistence.dslQuery(dslQuery);
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
			MiicCertificateOfIssuance.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return miicCertificateOfIssuancePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
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

		return miicCertificateOfIssuancePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
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

		return miicCertificateOfIssuancePersistence.findWithDynamicQuery(
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
		return miicCertificateOfIssuancePersistence.countWithDynamicQuery(
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

		return miicCertificateOfIssuancePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MiicCertificateOfIssuance fetchMiicCertificateOfIssuance(
		long miicCertificateOfIssuanceId) {

		return miicCertificateOfIssuancePersistence.fetchByPrimaryKey(
			miicCertificateOfIssuanceId);
	}

	/**
	 * Returns the miic certificate of issuance with the primary key.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance
	 * @throws PortalException if a miic certificate of issuance with the primary key could not be found
	 */
	@Override
	public MiicCertificateOfIssuance getMiicCertificateOfIssuance(
			long miicCertificateOfIssuanceId)
		throws PortalException {

		return miicCertificateOfIssuancePersistence.findByPrimaryKey(
			miicCertificateOfIssuanceId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			miicCertificateOfIssuanceLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MiicCertificateOfIssuance.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"miicCertificateOfIssuanceId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			miicCertificateOfIssuanceLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			MiicCertificateOfIssuance.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"miicCertificateOfIssuanceId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			miicCertificateOfIssuanceLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MiicCertificateOfIssuance.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"miicCertificateOfIssuanceId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return miicCertificateOfIssuancePersistence.create(
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
				"Implement MiicCertificateOfIssuanceLocalServiceImpl#deleteMiicCertificateOfIssuance(MiicCertificateOfIssuance) to avoid orphaned data");
		}

		return miicCertificateOfIssuanceLocalService.
			deleteMiicCertificateOfIssuance(
				(MiicCertificateOfIssuance)persistedModel);
	}

	@Override
	public BasePersistence<MiicCertificateOfIssuance> getBasePersistence() {
		return miicCertificateOfIssuancePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return miicCertificateOfIssuancePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @return the range of miic certificate of issuances
	 */
	@Override
	public List<MiicCertificateOfIssuance> getMiicCertificateOfIssuances(
		int start, int end) {

		return miicCertificateOfIssuancePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of miic certificate of issuances.
	 *
	 * @return the number of miic certificate of issuances
	 */
	@Override
	public int getMiicCertificateOfIssuancesCount() {
		return miicCertificateOfIssuancePersistence.countAll();
	}

	/**
	 * Updates the miic certificate of issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MiicCertificateOfIssuance updateMiicCertificateOfIssuance(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		return miicCertificateOfIssuancePersistence.update(
			miicCertificateOfIssuance);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MiicCertificateOfIssuanceLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		miicCertificateOfIssuanceLocalService =
			(MiicCertificateOfIssuanceLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MiicCertificateOfIssuanceLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MiicCertificateOfIssuance.class;
	}

	protected String getModelClassName() {
		return MiicCertificateOfIssuance.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				miicCertificateOfIssuancePersistence.getDataSource();

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
	protected MiicApplicationStagesPersistence miicApplicationStagesPersistence;

	protected MiicCertificateOfIssuanceLocalService
		miicCertificateOfIssuanceLocalService;

	@Reference
	protected MiicCertificateOfIssuancePersistence
		miicCertificateOfIssuancePersistence;

	@Reference
	protected MiicRecommendationsDecisionPersistence
		miicRecommendationsDecisionPersistence;

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
		MiicCertificateOfIssuanceLocalServiceBaseImpl.class);

}