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

import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;
import com.nbp.ncbj.application.form.service.service.NcbjSectionThreeLocalService;
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
 * Provides the base implementation for the ncbj section three local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ncbj.application.form.service.service.impl.NcbjSectionThreeLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ncbj.application.form.service.service.impl.NcbjSectionThreeLocalServiceImpl
 * @generated
 */
public abstract class NcbjSectionThreeLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   NcbjSectionThreeLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NcbjSectionThreeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ncbj.application.form.service.service.NcbjSectionThreeLocalServiceUtil</code>.
	 */

	/**
	 * Adds the ncbj section three to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionThree the ncbj section three
	 * @return the ncbj section three that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjSectionThree addNcbjSectionThree(
		NcbjSectionThree ncbjSectionThree) {

		ncbjSectionThree.setNew(true);

		return ncbjSectionThreePersistence.update(ncbjSectionThree);
	}

	/**
	 * Creates a new ncbj section three with the primary key. Does not add the ncbj section three to the database.
	 *
	 * @param ncbjSectionThreeId the primary key for the new ncbj section three
	 * @return the new ncbj section three
	 */
	@Override
	@Transactional(enabled = false)
	public NcbjSectionThree createNcbjSectionThree(long ncbjSectionThreeId) {
		return ncbjSectionThreePersistence.create(ncbjSectionThreeId);
	}

	/**
	 * Deletes the ncbj section three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three that was removed
	 * @throws PortalException if a ncbj section three with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjSectionThree deleteNcbjSectionThree(long ncbjSectionThreeId)
		throws PortalException {

		return ncbjSectionThreePersistence.remove(ncbjSectionThreeId);
	}

	/**
	 * Deletes the ncbj section three from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionThree the ncbj section three
	 * @return the ncbj section three that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjSectionThree deleteNcbjSectionThree(
		NcbjSectionThree ncbjSectionThree) {

		return ncbjSectionThreePersistence.remove(ncbjSectionThree);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return ncbjSectionThreePersistence.dslQuery(dslQuery);
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
			NcbjSectionThree.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ncbjSectionThreePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionThreeModelImpl</code>.
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

		return ncbjSectionThreePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionThreeModelImpl</code>.
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

		return ncbjSectionThreePersistence.findWithDynamicQuery(
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
		return ncbjSectionThreePersistence.countWithDynamicQuery(dynamicQuery);
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

		return ncbjSectionThreePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public NcbjSectionThree fetchNcbjSectionThree(long ncbjSectionThreeId) {
		return ncbjSectionThreePersistence.fetchByPrimaryKey(
			ncbjSectionThreeId);
	}

	/**
	 * Returns the ncbj section three with the primary key.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three
	 * @throws PortalException if a ncbj section three with the primary key could not be found
	 */
	@Override
	public NcbjSectionThree getNcbjSectionThree(long ncbjSectionThreeId)
		throws PortalException {

		return ncbjSectionThreePersistence.findByPrimaryKey(ncbjSectionThreeId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			ncbjSectionThreeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjSectionThree.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ncbjSectionThreeId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			ncbjSectionThreeLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(NcbjSectionThree.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjSectionThreeId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			ncbjSectionThreeLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjSectionThree.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("ncbjSectionThreeId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjSectionThreePersistence.create(
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
				"Implement NcbjSectionThreeLocalServiceImpl#deleteNcbjSectionThree(NcbjSectionThree) to avoid orphaned data");
		}

		return ncbjSectionThreeLocalService.deleteNcbjSectionThree(
			(NcbjSectionThree)persistedModel);
	}

	@Override
	public BasePersistence<NcbjSectionThree> getBasePersistence() {
		return ncbjSectionThreePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjSectionThreePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @return the range of ncbj section threes
	 */
	@Override
	public List<NcbjSectionThree> getNcbjSectionThrees(int start, int end) {
		return ncbjSectionThreePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ncbj section threes.
	 *
	 * @return the number of ncbj section threes
	 */
	@Override
	public int getNcbjSectionThreesCount() {
		return ncbjSectionThreePersistence.countAll();
	}

	/**
	 * Updates the ncbj section three in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionThreeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionThree the ncbj section three
	 * @return the ncbj section three that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjSectionThree updateNcbjSectionThree(
		NcbjSectionThree ncbjSectionThree) {

		return ncbjSectionThreePersistence.update(ncbjSectionThree);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NcbjSectionThreeLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ncbjSectionThreeLocalService = (NcbjSectionThreeLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NcbjSectionThreeLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NcbjSectionThree.class;
	}

	protected String getModelClassName() {
		return NcbjSectionThree.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = ncbjSectionThreePersistence.getDataSource();

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

	protected NcbjSectionThreeLocalService ncbjSectionThreeLocalService;

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
		NcbjSectionThreeLocalServiceBaseImpl.class);

}