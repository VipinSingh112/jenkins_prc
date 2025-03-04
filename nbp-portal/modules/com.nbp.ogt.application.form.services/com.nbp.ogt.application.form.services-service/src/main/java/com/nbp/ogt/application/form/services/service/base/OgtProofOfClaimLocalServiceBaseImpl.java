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

import com.nbp.ogt.application.form.services.model.OgtProofOfClaim;
import com.nbp.ogt.application.form.services.service.OgtProofOfClaimLocalService;
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
 * Provides the base implementation for the ogt proof of claim local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ogt.application.form.services.service.impl.OgtProofOfClaimLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ogt.application.form.services.service.impl.OgtProofOfClaimLocalServiceImpl
 * @generated
 */
public abstract class OgtProofOfClaimLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   OgtProofOfClaimLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>OgtProofOfClaimLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ogt.application.form.services.service.OgtProofOfClaimLocalServiceUtil</code>.
	 */

	/**
	 * Adds the ogt proof of claim to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtProofOfClaimLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtProofOfClaim the ogt proof of claim
	 * @return the ogt proof of claim that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OgtProofOfClaim addOgtProofOfClaim(OgtProofOfClaim ogtProofOfClaim) {
		ogtProofOfClaim.setNew(true);

		return ogtProofOfClaimPersistence.update(ogtProofOfClaim);
	}

	/**
	 * Creates a new ogt proof of claim with the primary key. Does not add the ogt proof of claim to the database.
	 *
	 * @param ogtProofOfClaimId the primary key for the new ogt proof of claim
	 * @return the new ogt proof of claim
	 */
	@Override
	@Transactional(enabled = false)
	public OgtProofOfClaim createOgtProofOfClaim(long ogtProofOfClaimId) {
		return ogtProofOfClaimPersistence.create(ogtProofOfClaimId);
	}

	/**
	 * Deletes the ogt proof of claim with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtProofOfClaimLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim that was removed
	 * @throws PortalException if a ogt proof of claim with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OgtProofOfClaim deleteOgtProofOfClaim(long ogtProofOfClaimId)
		throws PortalException {

		return ogtProofOfClaimPersistence.remove(ogtProofOfClaimId);
	}

	/**
	 * Deletes the ogt proof of claim from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtProofOfClaimLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtProofOfClaim the ogt proof of claim
	 * @return the ogt proof of claim that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public OgtProofOfClaim deleteOgtProofOfClaim(
		OgtProofOfClaim ogtProofOfClaim) {

		return ogtProofOfClaimPersistence.remove(ogtProofOfClaim);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return ogtProofOfClaimPersistence.dslQuery(dslQuery);
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
			OgtProofOfClaim.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ogtProofOfClaimPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtProofOfClaimModelImpl</code>.
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

		return ogtProofOfClaimPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtProofOfClaimModelImpl</code>.
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

		return ogtProofOfClaimPersistence.findWithDynamicQuery(
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
		return ogtProofOfClaimPersistence.countWithDynamicQuery(dynamicQuery);
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

		return ogtProofOfClaimPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public OgtProofOfClaim fetchOgtProofOfClaim(long ogtProofOfClaimId) {
		return ogtProofOfClaimPersistence.fetchByPrimaryKey(ogtProofOfClaimId);
	}

	/**
	 * Returns the ogt proof of claim with the primary key.
	 *
	 * @param ogtProofOfClaimId the primary key of the ogt proof of claim
	 * @return the ogt proof of claim
	 * @throws PortalException if a ogt proof of claim with the primary key could not be found
	 */
	@Override
	public OgtProofOfClaim getOgtProofOfClaim(long ogtProofOfClaimId)
		throws PortalException {

		return ogtProofOfClaimPersistence.findByPrimaryKey(ogtProofOfClaimId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(ogtProofOfClaimLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OgtProofOfClaim.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ogtProofOfClaimId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			ogtProofOfClaimLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(OgtProofOfClaim.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"ogtProofOfClaimId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(ogtProofOfClaimLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(OgtProofOfClaim.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ogtProofOfClaimId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ogtProofOfClaimPersistence.create(
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
				"Implement OgtProofOfClaimLocalServiceImpl#deleteOgtProofOfClaim(OgtProofOfClaim) to avoid orphaned data");
		}

		return ogtProofOfClaimLocalService.deleteOgtProofOfClaim(
			(OgtProofOfClaim)persistedModel);
	}

	@Override
	public BasePersistence<OgtProofOfClaim> getBasePersistence() {
		return ogtProofOfClaimPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ogtProofOfClaimPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the ogt proof of claims.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtProofOfClaimModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt proof of claims
	 * @param end the upper bound of the range of ogt proof of claims (not inclusive)
	 * @return the range of ogt proof of claims
	 */
	@Override
	public List<OgtProofOfClaim> getOgtProofOfClaims(int start, int end) {
		return ogtProofOfClaimPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ogt proof of claims.
	 *
	 * @return the number of ogt proof of claims
	 */
	@Override
	public int getOgtProofOfClaimsCount() {
		return ogtProofOfClaimPersistence.countAll();
	}

	/**
	 * Updates the ogt proof of claim in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtProofOfClaimLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtProofOfClaim the ogt proof of claim
	 * @return the ogt proof of claim that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public OgtProofOfClaim updateOgtProofOfClaim(
		OgtProofOfClaim ogtProofOfClaim) {

		return ogtProofOfClaimPersistence.update(ogtProofOfClaim);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			OgtProofOfClaimLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ogtProofOfClaimLocalService = (OgtProofOfClaimLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return OgtProofOfClaimLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return OgtProofOfClaim.class;
	}

	protected String getModelClassName() {
		return OgtProofOfClaim.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = ogtProofOfClaimPersistence.getDataSource();

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

	@Reference
	protected OgtClaimantDetailPersistence ogtClaimantDetailPersistence;

	@Reference
	protected OgtClaimToPropertyPersistence ogtClaimToPropertyPersistence;

	@Reference
	protected OgtClaimToSpousePersistence ogtClaimToSpousePersistence;

	@Reference
	protected OgtInsolventPersonDetailPersistence
		ogtInsolventPersonDetailPersistence;

	protected OgtProofOfClaimLocalService ogtProofOfClaimLocalService;

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
		OgtProofOfClaimLocalServiceBaseImpl.class);

}