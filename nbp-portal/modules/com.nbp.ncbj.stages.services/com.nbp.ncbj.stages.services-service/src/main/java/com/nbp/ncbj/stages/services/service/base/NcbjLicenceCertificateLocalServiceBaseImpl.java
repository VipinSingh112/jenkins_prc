/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.base;

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

import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;
import com.nbp.ncbj.stages.services.service.NcbjLicenceCertificateLocalService;
import com.nbp.ncbj.stages.services.service.persistence.NcbjAppBoardDecisionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjApplicationCorrectiveActionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjApplicationStagesPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjInspectionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjLicenceCertificatePersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjPaymentConfirmationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the ncbj licence certificate local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.ncbj.stages.services.service.impl.NcbjLicenceCertificateLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.ncbj.stages.services.service.impl.NcbjLicenceCertificateLocalServiceImpl
 * @generated
 */
public abstract class NcbjLicenceCertificateLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   NcbjLicenceCertificateLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>NcbjLicenceCertificateLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.ncbj.stages.services.service.NcbjLicenceCertificateLocalServiceUtil</code>.
	 */

	/**
	 * Adds the ncbj licence certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjLicenceCertificate addNcbjLicenceCertificate(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		ncbjLicenceCertificate.setNew(true);

		return ncbjLicenceCertificatePersistence.update(ncbjLicenceCertificate);
	}

	/**
	 * Creates a new ncbj licence certificate with the primary key. Does not add the ncbj licence certificate to the database.
	 *
	 * @param ncbjLicenceCertificateId the primary key for the new ncbj licence certificate
	 * @return the new ncbj licence certificate
	 */
	@Override
	@Transactional(enabled = false)
	public NcbjLicenceCertificate createNcbjLicenceCertificate(
		long ncbjLicenceCertificateId) {

		return ncbjLicenceCertificatePersistence.create(
			ncbjLicenceCertificateId);
	}

	/**
	 * Deletes the ncbj licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 * @throws PortalException if a ncbj licence certificate with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjLicenceCertificate deleteNcbjLicenceCertificate(
			long ncbjLicenceCertificateId)
		throws PortalException {

		return ncbjLicenceCertificatePersistence.remove(
			ncbjLicenceCertificateId);
	}

	/**
	 * Deletes the ncbj licence certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NcbjLicenceCertificate deleteNcbjLicenceCertificate(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		return ncbjLicenceCertificatePersistence.remove(ncbjLicenceCertificate);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return ncbjLicenceCertificatePersistence.dslQuery(dslQuery);
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
			NcbjLicenceCertificate.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return ncbjLicenceCertificatePersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
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

		return ncbjLicenceCertificatePersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
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

		return ncbjLicenceCertificatePersistence.findWithDynamicQuery(
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
		return ncbjLicenceCertificatePersistence.countWithDynamicQuery(
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

		return ncbjLicenceCertificatePersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public NcbjLicenceCertificate fetchNcbjLicenceCertificate(
		long ncbjLicenceCertificateId) {

		return ncbjLicenceCertificatePersistence.fetchByPrimaryKey(
			ncbjLicenceCertificateId);
	}

	/**
	 * Returns the ncbj licence certificate with the primary key.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate
	 * @throws PortalException if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public NcbjLicenceCertificate getNcbjLicenceCertificate(
			long ncbjLicenceCertificateId)
		throws PortalException {

		return ncbjLicenceCertificatePersistence.findByPrimaryKey(
			ncbjLicenceCertificateId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			ncbjLicenceCertificateLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjLicenceCertificate.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjLicenceCertificateId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			ncbjLicenceCertificateLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			NcbjLicenceCertificate.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjLicenceCertificateId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			ncbjLicenceCertificateLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(NcbjLicenceCertificate.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"ncbjLicenceCertificateId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjLicenceCertificatePersistence.create(
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
				"Implement NcbjLicenceCertificateLocalServiceImpl#deleteNcbjLicenceCertificate(NcbjLicenceCertificate) to avoid orphaned data");
		}

		return ncbjLicenceCertificateLocalService.deleteNcbjLicenceCertificate(
			(NcbjLicenceCertificate)persistedModel);
	}

	@Override
	public BasePersistence<NcbjLicenceCertificate> getBasePersistence() {
		return ncbjLicenceCertificatePersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return ncbjLicenceCertificatePersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> getNcbjLicenceCertificates(
		int start, int end) {

		return ncbjLicenceCertificatePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of ncbj licence certificates.
	 *
	 * @return the number of ncbj licence certificates
	 */
	@Override
	public int getNcbjLicenceCertificatesCount() {
		return ncbjLicenceCertificatePersistence.countAll();
	}

	/**
	 * Updates the ncbj licence certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NcbjLicenceCertificate updateNcbjLicenceCertificate(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		return ncbjLicenceCertificatePersistence.update(ncbjLicenceCertificate);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			NcbjLicenceCertificateLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		ncbjLicenceCertificateLocalService =
			(NcbjLicenceCertificateLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return NcbjLicenceCertificateLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return NcbjLicenceCertificate.class;
	}

	protected String getModelClassName() {
		return NcbjLicenceCertificate.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				ncbjLicenceCertificatePersistence.getDataSource();

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
	protected NcbjAppBoardDecisionPersistence ncbjAppBoardDecisionPersistence;

	@Reference
	protected NcbjApplicationCorrectiveActionPersistence
		ncbjApplicationCorrectiveActionPersistence;

	@Reference
	protected NcbjApplicationStagesPersistence ncbjApplicationStagesPersistence;

	@Reference
	protected NcbjInspectionPersistence ncbjInspectionPersistence;

	protected NcbjLicenceCertificateLocalService
		ncbjLicenceCertificateLocalService;

	@Reference
	protected NcbjLicenceCertificatePersistence
		ncbjLicenceCertificatePersistence;

	@Reference
	protected NcbjPaymentConfirmationPersistence
		ncbjPaymentConfirmationPersistence;

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
		NcbjLicenceCertificateLocalServiceBaseImpl.class);

}