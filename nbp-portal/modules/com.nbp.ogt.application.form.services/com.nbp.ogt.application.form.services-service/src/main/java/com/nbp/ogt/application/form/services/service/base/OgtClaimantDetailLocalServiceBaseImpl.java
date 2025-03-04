/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.base;

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

import com.nbp.ogt.application.form.services.model.OgtClaimantDetail;
import com.nbp.ogt.application.form.services.service.OgtClaimantDetailLocalService;
import com.nbp.ogt.application.form.services.service.persistence.OGTAppCurrentStagePersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtApplicationPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimToPropertyPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimToSpousePersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtClaimantDetailPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtInsolventPersonDetailPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtProofOfClaimPersistence;
import com.nbp.ogt.application.form.services.service.persistence.OgtSectionBPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ogt claimant detail local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ogt.application.form.services.service.impl.OgtClaimantDetailLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ogt.application.form.services.service.impl.OgtClaimantDetailLocalServiceImpl
 * @generated
 */
public abstract class OgtClaimantDetailLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   OgtClaimantDetailLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OgtClaimantDetailLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ogt.application.form.services.service.OgtClaimantDetailLocalServiceUtil</code>.
	 */

	/**
	 * Adds the ogt claimant detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OgtClaimantDetail addOgtClaimantDetail(
		OgtClaimantDetail ogtClaimantDetail) {

		ogtClaimantDetail.setNew(true);

		return ogtClaimantDetailPersistence.update(ogtClaimantDetail);
	}

	/**
	 * Creates a new ogt claimant detail with the primary key. Does not add the ogt claimant detail to the database.
	 *
	 * @param ogtClaimantDetailId the primary key for the new ogt claimant detail
	 * @return the new ogt claimant detail
	 */
	@Override
	@Transactional(enabled = false)
	public OgtClaimantDetail createOgtClaimantDetail(long ogtClaimantDetailId) {
		return ogtClaimantDetailPersistence.create(ogtClaimantDetailId);
	}

	/**
	 * Deletes the ogt claimant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 * @throws PortalException if a ogt claimant detail with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OgtClaimantDetail deleteOgtClaimantDetail(long ogtClaimantDetailId)
		throws PortalException {

		return ogtClaimantDetailPersistence.remove(ogtClaimantDetailId);
	}

	/**
	 * Deletes the ogt claimant detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OgtClaimantDetail deleteOgtClaimantDetail(
		OgtClaimantDetail ogtClaimantDetail) {

		return ogtClaimantDetailPersistence.remove(ogtClaimantDetail);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return ogtClaimantDetailPersistence.dslQuery(dslQuery);
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
			OgtClaimantDetail.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ogtClaimantDetailPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
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

		return ogtClaimantDetailPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
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

		return ogtClaimantDetailPersistence.findWithDynamicQuery(
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
		return ogtClaimantDetailPersistence.countWithDynamicQuery(dynamicQuery);
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

		return ogtClaimantDetailPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public OgtClaimantDetail fetchOgtClaimantDetail(long ogtClaimantDetailId) {
		return ogtClaimantDetailPersistence.fetchByPrimaryKey(
			ogtClaimantDetailId);
	}

	/**
	 * Returns the ogt claimant detail with the primary key.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail
	 * @throws PortalException if a ogt claimant detail with the primary key could not be found
	 */
	@Override
	public OgtClaimantDetail getOgtClaimantDetail(long ogtClaimantDetailId)
		throws PortalException {

		return ogtClaimantDetailPersistence.findByPrimaryKey(
			ogtClaimantDetailId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			ogtClaimantDetailLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OgtClaimantDetail.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ogtClaimantDetailId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			ogtClaimantDetailLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(OgtClaimantDetail.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"ogtClaimantDetailId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			ogtClaimantDetailLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OgtClaimantDetail.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ogtClaimantDetailId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ogtClaimantDetailPersistence.create(
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
				"Implement OgtClaimantDetailLocalServiceImpl#deleteOgtClaimantDetail(OgtClaimantDetail) to avoid orphaned data");
		}

		return ogtClaimantDetailLocalService.deleteOgtClaimantDetail(
			(OgtClaimantDetail)persistedModel);
	}

	@Override
	public BasePersistence<OgtClaimantDetail> getBasePersistence() {
		return ogtClaimantDetailPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ogtClaimantDetailPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @return the range of ogt claimant details
	 */
	@Override
	public List<OgtClaimantDetail> getOgtClaimantDetails(int start, int end) {
		return ogtClaimantDetailPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ogt claimant details.
	 *
	 * @return the number of ogt claimant details
	 */
	@Override
	public int getOgtClaimantDetailsCount() {
		return ogtClaimantDetailPersistence.countAll();
	}

	/**
	 * Updates the ogt claimant detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OgtClaimantDetail updateOgtClaimantDetail(
		OgtClaimantDetail ogtClaimantDetail) {

		return ogtClaimantDetailPersistence.update(ogtClaimantDetail);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OgtClaimantDetailLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ogtClaimantDetailLocalService = (OgtClaimantDetailLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OgtClaimantDetailLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OgtClaimantDetail.class;
	}

	protected String getModelClassName() {
		return OgtClaimantDetail.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				ogtClaimantDetailPersistence.getDataSource();

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
	protected OGTAppCurrentStagePersistence ogtAppCurrentStagePersistence;

	@Reference
	protected OgtApplicationPersistence ogtApplicationPersistence;

	protected OgtClaimantDetailLocalService ogtClaimantDetailLocalService;

	@Reference
	protected OgtClaimantDetailPersistence ogtClaimantDetailPersistence;

	@Reference
	protected OgtClaimToPropertyPersistence ogtClaimToPropertyPersistence;

	@Reference
	protected OgtClaimToSpousePersistence ogtClaimToSpousePersistence;

	@Reference
	protected OgtInsolventPersonDetailPersistence
		ogtInsolventPersonDetailPersistence;

	@Reference
	protected OgtProofOfClaimPersistence ogtProofOfClaimPersistence;

	@Reference
	protected OgtSectionBPersistence ogtSectionBPersistence;

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
		OgtClaimantDetailLocalServiceBaseImpl.class);

}