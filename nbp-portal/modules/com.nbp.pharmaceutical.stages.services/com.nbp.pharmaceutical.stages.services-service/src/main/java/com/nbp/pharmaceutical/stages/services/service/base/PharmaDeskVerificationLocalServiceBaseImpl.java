/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.base;

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

import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification;
import com.nbp.pharmaceutical.stages.services.service.PharmaDeskVerificationLocalService;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationCommitteeDecisionPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationDueDiligencePersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationFullLicensePersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationStagesPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaDeskVerificationPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaPaymentConfirmationPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the pharma desk verification local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.nbp.pharmaceutical.stages.services.service.impl.PharmaDeskVerificationLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.nbp.pharmaceutical.stages.services.service.impl.PharmaDeskVerificationLocalServiceImpl
 * @generated
 */
public abstract class PharmaDeskVerificationLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   PharmaDeskVerificationLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>PharmaDeskVerificationLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.nbp.pharmaceutical.stages.services.service.PharmaDeskVerificationLocalServiceUtil</code>.
	 */

	/**
	 * Adds the pharma desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 * @return the pharma desk verification that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PharmaDeskVerification addPharmaDeskVerification(
		PharmaDeskVerification pharmaDeskVerification) {

		pharmaDeskVerification.setNew(true);

		return pharmaDeskVerificationPersistence.update(pharmaDeskVerification);
	}

	/**
	 * Creates a new pharma desk verification with the primary key. Does not add the pharma desk verification to the database.
	 *
	 * @param pharmaDeskVerificationId the primary key for the new pharma desk verification
	 * @return the new pharma desk verification
	 */
	@Override
	@Transactional(enabled = false)
	public PharmaDeskVerification createPharmaDeskVerification(
		long pharmaDeskVerificationId) {

		return pharmaDeskVerificationPersistence.create(
			pharmaDeskVerificationId);
	}

	/**
	 * Deletes the pharma desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification that was removed
	 * @throws PortalException if a pharma desk verification with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PharmaDeskVerification deletePharmaDeskVerification(
			long pharmaDeskVerificationId)
		throws PortalException {

		return pharmaDeskVerificationPersistence.remove(
			pharmaDeskVerificationId);
	}

	/**
	 * Deletes the pharma desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 * @return the pharma desk verification that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PharmaDeskVerification deletePharmaDeskVerification(
		PharmaDeskVerification pharmaDeskVerification) {

		return pharmaDeskVerificationPersistence.remove(pharmaDeskVerification);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return pharmaDeskVerificationPersistence.dslQuery(dslQuery);
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
			PharmaDeskVerification.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return pharmaDeskVerificationPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationModelImpl</code>.
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

		return pharmaDeskVerificationPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationModelImpl</code>.
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

		return pharmaDeskVerificationPersistence.findWithDynamicQuery(
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
		return pharmaDeskVerificationPersistence.countWithDynamicQuery(
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

		return pharmaDeskVerificationPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public PharmaDeskVerification fetchPharmaDeskVerification(
		long pharmaDeskVerificationId) {

		return pharmaDeskVerificationPersistence.fetchByPrimaryKey(
			pharmaDeskVerificationId);
	}

	/**
	 * Returns the pharma desk verification with the primary key.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification
	 * @throws PortalException if a pharma desk verification with the primary key could not be found
	 */
	@Override
	public PharmaDeskVerification getPharmaDeskVerification(
			long pharmaDeskVerificationId)
		throws PortalException {

		return pharmaDeskVerificationPersistence.findByPrimaryKey(
			pharmaDeskVerificationId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			pharmaDeskVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PharmaDeskVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"pharmaDeskVerificationId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			pharmaDeskVerificationLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			PharmaDeskVerification.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"pharmaDeskVerificationId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			pharmaDeskVerificationLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PharmaDeskVerification.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName(
			"pharmaDeskVerificationId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return pharmaDeskVerificationPersistence.create(
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
				"Implement PharmaDeskVerificationLocalServiceImpl#deletePharmaDeskVerification(PharmaDeskVerification) to avoid orphaned data");
		}

		return pharmaDeskVerificationLocalService.deletePharmaDeskVerification(
			(PharmaDeskVerification)persistedModel);
	}

	@Override
	public BasePersistence<PharmaDeskVerification> getBasePersistence() {
		return pharmaDeskVerificationPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return pharmaDeskVerificationPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @return the range of pharma desk verifications
	 */
	@Override
	public List<PharmaDeskVerification> getPharmaDeskVerifications(
		int start, int end) {

		return pharmaDeskVerificationPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of pharma desk verifications.
	 *
	 * @return the number of pharma desk verifications
	 */
	@Override
	public int getPharmaDeskVerificationsCount() {
		return pharmaDeskVerificationPersistence.countAll();
	}

	/**
	 * Updates the pharma desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 * @return the pharma desk verification that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PharmaDeskVerification updatePharmaDeskVerification(
		PharmaDeskVerification pharmaDeskVerification) {

		return pharmaDeskVerificationPersistence.update(pharmaDeskVerification);
	}

	@Deactivate
	protected void deactivate() {
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			PharmaDeskVerificationLocalService.class,
			IdentifiableOSGiService.class, PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		pharmaDeskVerificationLocalService =
			(PharmaDeskVerificationLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PharmaDeskVerificationLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PharmaDeskVerification.class;
	}

	protected String getModelClassName() {
		return PharmaDeskVerification.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				pharmaDeskVerificationPersistence.getDataSource();

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
	protected PharmaApplicationCommitteeDecisionPersistence
		pharmaApplicationCommitteeDecisionPersistence;

	@Reference
	protected PharmaApplicationDueDiligencePersistence
		pharmaApplicationDueDiligencePersistence;

	@Reference
	protected PharmaApplicationFullLicensePersistence
		pharmaApplicationFullLicensePersistence;

	@Reference
	protected PharmaApplicationStagesPersistence
		pharmaApplicationStagesPersistence;

	protected PharmaDeskVerificationLocalService
		pharmaDeskVerificationLocalService;

	@Reference
	protected PharmaDeskVerificationPersistence
		pharmaDeskVerificationPersistence;

	@Reference
	protected PharmaPaymentConfirmationPersistence
		pharmaPaymentConfirmationPersistence;

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
		PharmaDeskVerificationLocalServiceBaseImpl.class);

}