/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.base;

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

import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail;
import com.nbp.ncbj.application.form.service.service.NcbjCompanyDetailLocalService;
import com.nbp.ncbj.application.form.service.service.persistence.NCBJCompanyNewPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjAddLocMultiSitePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjAppPaymentPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicantDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicationPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjBusinessDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjBusinessDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailGenPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCurrentStagePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumOfEmpAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumberEffectiveAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrgDetailInfoPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrganizationDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjPremisesLocationPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjProductServiceDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionFourPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionOneAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionOnePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionThreePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionTwoPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSpecificActivitiesPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ncbj company detail local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ncbj.application.form.service.service.impl.NcbjCompanyDetailLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ncbj.application.form.service.service.impl.NcbjCompanyDetailLocalServiceImpl
 * @generated
 */
public abstract class NcbjCompanyDetailLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   NcbjCompanyDetailLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NcbjCompanyDetailLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ncbj.application.form.service.service.NcbjCompanyDetailLocalServiceUtil</code>.
	 */

	/**
	 * Adds the ncbj company detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjCompanyDetail addNcbjCompanyDetail(
		NcbjCompanyDetail ncbjCompanyDetail) {

		ncbjCompanyDetail.setNew(true);

		return ncbjCompanyDetailPersistence.update(ncbjCompanyDetail);
	}

	/**
	 * Creates a new ncbj company detail with the primary key. Does not add the ncbj company detail to the database.
	 *
	 * @param ncbjCompanyDetailId the primary key for the new ncbj company detail
	 * @return the new ncbj company detail
	 */
	@Override
	@Transactional(enabled = false)
	public NcbjCompanyDetail createNcbjCompanyDetail(long ncbjCompanyDetailId) {
		return ncbjCompanyDetailPersistence.create(ncbjCompanyDetailId);
	}

	/**
	 * Deletes the ncbj company detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail that was removed
	 * @throws PortalException if a ncbj company detail with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjCompanyDetail deleteNcbjCompanyDetail(long ncbjCompanyDetailId)
		throws PortalException {

		return ncbjCompanyDetailPersistence.remove(ncbjCompanyDetailId);
	}

	/**
	 * Deletes the ncbj company detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjCompanyDetail deleteNcbjCompanyDetail(
		NcbjCompanyDetail ncbjCompanyDetail) {

		return ncbjCompanyDetailPersistence.remove(ncbjCompanyDetail);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return ncbjCompanyDetailPersistence.dslQuery(dslQuery);
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
			NcbjCompanyDetail.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ncbjCompanyDetailPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
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

		return ncbjCompanyDetailPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
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

		return ncbjCompanyDetailPersistence.findWithDynamicQuery(
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
		return ncbjCompanyDetailPersistence.countWithDynamicQuery(dynamicQuery);
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

		return ncbjCompanyDetailPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public NcbjCompanyDetail fetchNcbjCompanyDetail(long ncbjCompanyDetailId) {
		return ncbjCompanyDetailPersistence.fetchByPrimaryKey(
			ncbjCompanyDetailId);
	}

	/**
	 * Returns the ncbj company detail with the primary key.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail
	 * @throws PortalException if a ncbj company detail with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetail getNcbjCompanyDetail(long ncbjCompanyDetailId)
		throws PortalException {

		return ncbjCompanyDetailPersistence.findByPrimaryKey(
			ncbjCompanyDetailId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			ncbjCompanyDetailLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjCompanyDetail.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ncbjCompanyDetailId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			ncbjCompanyDetailLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(NcbjCompanyDetail.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjCompanyDetailId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			ncbjCompanyDetailLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjCompanyDetail.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ncbjCompanyDetailId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjCompanyDetailPersistence.create(
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
				"Implement NcbjCompanyDetailLocalServiceImpl#deleteNcbjCompanyDetail(NcbjCompanyDetail) to avoid orphaned data");
		}

		return ncbjCompanyDetailLocalService.deleteNcbjCompanyDetail(
			(NcbjCompanyDetail)persistedModel);
	}

	@Override
	public BasePersistence<NcbjCompanyDetail> getBasePersistence() {
		return ncbjCompanyDetailPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjCompanyDetailPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @return the range of ncbj company details
	 */
	@Override
	public List<NcbjCompanyDetail> getNcbjCompanyDetails(int start, int end) {
		return ncbjCompanyDetailPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ncbj company details.
	 *
	 * @return the number of ncbj company details
	 */
	@Override
	public int getNcbjCompanyDetailsCount() {
		return ncbjCompanyDetailPersistence.countAll();
	}

	/**
	 * Updates the ncbj company detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjCompanyDetail updateNcbjCompanyDetail(
		NcbjCompanyDetail ncbjCompanyDetail) {

		return ncbjCompanyDetailPersistence.update(ncbjCompanyDetail);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NcbjCompanyDetailLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ncbjCompanyDetailLocalService = (NcbjCompanyDetailLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NcbjCompanyDetailLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NcbjCompanyDetail.class;
	}

	protected String getModelClassName() {
		return NcbjCompanyDetail.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				ncbjCompanyDetailPersistence.getDataSource();

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
	protected NcbjAddLocMultiSitePersistence ncbjAddLocMultiSitePersistence;

	@Reference
	protected NcbjApplicantDetailPersistence ncbjApplicantDetailPersistence;

	@Reference
	protected NcbjApplicationPersistence ncbjApplicationPersistence;

	@Reference
	protected NcbjAppPaymentPersistence ncbjAppPaymentPersistence;

	@Reference
	protected NcbjBusinessDetailPersistence ncbjBusinessDetailPersistence;

	@Reference
	protected NcbjBusinessDetailAddPersistence ncbjBusinessDetailAddPersistence;

	protected NcbjCompanyDetailLocalService ncbjCompanyDetailLocalService;

	@Reference
	protected NcbjCompanyDetailPersistence ncbjCompanyDetailPersistence;

	@Reference
	protected NcbjCompanyDetailAddPersistence ncbjCompanyDetailAddPersistence;

	@Reference
	protected NcbjCompanyDetailGenPersistence ncbjCompanyDetailGenPersistence;

	@Reference
	protected NCBJCompanyNewPersistence ncbjCompanyNewPersistence;

	@Reference
	protected NcbjCurrentStagePersistence ncbjCurrentStagePersistence;

	@Reference
	protected NcbjNumberEffectiveAddPersistence
		ncbjNumberEffectiveAddPersistence;

	@Reference
	protected NcbjNumOfEmpAddPersistence ncbjNumOfEmpAddPersistence;

	@Reference
	protected NcbjOrganizationDetailPersistence
		ncbjOrganizationDetailPersistence;

	@Reference
	protected NcbjOrgDetailInfoPersistence ncbjOrgDetailInfoPersistence;

	@Reference
	protected NcbjPremisesLocationPersistence ncbjPremisesLocationPersistence;

	@Reference
	protected NcbjProductServiceDetailPersistence
		ncbjProductServiceDetailPersistence;

	@Reference
	protected NcbjSectionDetailAddPersistence ncbjSectionDetailAddPersistence;

	@Reference
	protected NcbjSectionFourPersistence ncbjSectionFourPersistence;

	@Reference
	protected NcbjSectionOnePersistence ncbjSectionOnePersistence;

	@Reference
	protected NcbjSectionOneAddPersistence ncbjSectionOneAddPersistence;

	@Reference
	protected NcbjSectionThreePersistence ncbjSectionThreePersistence;

	@Reference
	protected NcbjSectionTwoPersistence ncbjSectionTwoPersistence;

	@Reference
	protected NcbjSpecificActivitiesPersistence
		ncbjSpecificActivitiesPersistence;

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
		NcbjCompanyDetailLocalServiceBaseImpl.class);

}